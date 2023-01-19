// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Spotinst stateful node Azure resource.
 *
 * ## Strategy
 *
 * * `strategy` - (Required) Strategy for stateful node.
 *   * `drainingTimeout` - (Optional, Default `120`) Time (in seconds) to allow the VM be drained from incoming TCP connections and detached from MLB before terminating it during a scale down operation.
 *   * `fallbackToOnDemand` - (Required) In case of no spots available, Stateful Node will launch an On-demand instance instead.
 *   * `optimizationWindows` - (Optional) Valid format: "ddd:hh:mm-ddd:hh:mm (day:hour(0-23):minute(0-59))", not empty if revertToSpot.performAt = timeWindow.
 *   * `preferredLifeCycle` - (Optional, Enum `"od", "spot"`, Default `"spot"`) The desired type of VM.
 *   * `revertToSpot` - (Optional) Hold settings for strategy correction - replacing On-Demand for Spot VMs.
 *     * `performAt` - (Required, Enum `"timeWindow", "never", "always"`, Default `"always"`) Settings for maintenance strategy.
 *
 * <a id="compute"></a>
 * ## Compute
 *
 * * `os` - (Required, Enum `"Linux", "Windows"`) Type of operating system.
 * * `odSizes` - (Required) Available On-Demand sizes.
 * * `spotSizes` - (Required) Available Spot-VM sizes.
 * * `preferredSpotSizes` - (Optional) Prioritize Spot VM sizes when launching Spot VMs for the group. If set, must be a sublist of compute.vmSizes.spotSizes.
 * * `zones` - (Optional, Enum `"1", "2", "3"`) List of Azure Availability Zones in the defined region. If not defined, Virtual machines will be launched regionally.
 * * `preferredZones` - (Optional, Enum `"1", "2", "3"`) The AZs to prioritize when launching VMs. If no markets are available in the Preferred AZs, VMs are launched in the non-preferred AZs. Must be a sublist of compute.zones.
 * * `customData` - (Optional) This value will hold the YAML in base64 and will be executed upon VM launch.
 * * `shutdownScript` - (Optional) Shutdown script for the stateful node. Value should be passed as a string encoded at Base64 only.
 *
 * <a id="bootDiagnostics"></a>
 * ## Boot Diagnostics
 *
 * * `bootDiagnostics`
 *   * `isEnabled` - (Optional) Allows you to enable and disable the configuration of boot diagnostics at launch.
 *   * `storageUrl` - (Optional) The storage URI that is used if a type is unmanaged. The storage URI must follow the blob storage URI format ("https://.blob.core.windows.net/"). StorageUri is required if the type is unmanaged. StorageUri must be ‘null’ in case the boot diagnostics type is managed.
 *   * `type` - (Optional, Enum `"managed", "unmanaged"`) Defines the storage type on VM launch in Azure.
 *
 * <a id="dataDisks"></a>
 * ## Data Disks
 *
 * * `dataDisk` - (Optional) The definitions of data disks that will be created and attached to the stateful node's VM.
 *   * `sizeGb` - (Required) The size of the data disk in GB, required if dataDisks is specified.
 *   * `lun` - (Required) The LUN of the data disk.
 *   * `type` - (Required, Enum `"Standard_LRS", "Premium_LRS", "StandardSSD_LRS", "UltraSSD_LRS"`) The type of the data disk.
 *
 * <a id="extensions"></a>
 * ## Extensions
 *
 * * `extension` - (Optional) An object for an azure extension.
 *   * `name` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `type` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `publisher` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `apiVersion` - (Required) The API version of the extension. Required if extension specified.
 *   * `minorVersionAutoUpgrade` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `protectedSettings` - (Optional) Object for protected settings.
 *   * `publicSettings` - (Optional) Object for public settings.
 *
 * <a id="image"></a>
 * ## Image
 *
 * * `image`
 *   * `marketplaceImage` - (Optional) Select an image from Azure's Marketplace image catalogue. Required if the custom image or gallery image are not specified.
 *     * `publisher` - (Required) Image publisher.
 *     * `offer` - (Required) Image offer.
 *     * `sku` - (Required) Image Stock Keeping Unit, which is the specific version of the image.
 *     * `version` - (Required, Default `"latest"`) Image's version. if version not provided we use "latest".
 *   * `galleryImage` - (Optional) Gallery image definitions. Required if custom image or marketplace image are not specified.
 *     * `galleryResourceGroupName` - (Required) The resource group name for gallery image.
 *     * `galleryName` - (Required) Name of the gallery.
 *     * `imageName` - (Required) Name of the gallery image.
 *     * `versionName` - (Required) Image's version. Can be in the format x.x.x or 'latest'.
 *   * `customImage` - (Optional) Custom image definitions. Required if marketplace image or gallery image are not specified.
 *     * `customImageResourceGroupName` - (Required) The resource group name for custom image.
 *     * `name` - (Required) The name of the custom image.
 *
 * <a id="load balancer"></a>
 * ## Load Balancer
 *
 * * `loadBalancer` - (Optional) Add a load balancer. For Azure Gateway, each Backend Pool is a separate load balancer.
 *   * `type` - (Required, Enum `"loadBalancer", "applicationGateway"`) The type of load balancer.
 *   * `resourceGroupName` - (Required) The Resource Group name of the Load Balancer.
 *   * `name` - (Required) Name of the Application Gateway/Load Balancer.
 *   * `sku` - (Optional)
 *     * if type is `"LoadBalancer"` then possible values are `“Standard", "Basic”`.
 *     * If ApplicationGateway then possible values are
 *       `“Standard_Large”, “Standard_Medium”, “Standard_Small”, “Standard_v2", “WAF_Large”, “WAF_Medium", “WAF_v2"`.
 *   * `backendPoolNames` - (Optional) Name of the Backend Pool to register the Stateful Node VMs to. Each Backend Pool is a separate load balancer. Required if Type is APPLICATION_GATEWAY.
 *
 * <a id="login"></a>
 * ## Login
 *
 * * `login` - (Required) Set admin access for accessing your VMs. Password/SSH is required for Linux.
 *   * `userName` - (Required) username for admin access to VMs.
 *   * `sshPublicKey` - (Optional) SSH for admin access to Linux VMs. Optional for Linux.
 *   * `password` - (Optional) Password for admin access to Windows VMs. Required for Windows.
 *
 * <a id="managedServiceIdentities"></a>
 * ## Managed Service Identities
 *
 * * `managedServiceIdentities` - (Optional) Add a user-assigned managed identity to the Stateful Node's VM.
 *   * `name` - (Required) name of the managed identity.
 *   * `resourceGroupName` - (Required) The Resource Group that the user-assigned managed identity resides in.
 *
 * <a id="network"></a>
 * ## Network
 *
 * * `network` - (Required) Define the Virtual Network and Subnet for your Stateful Node.
 *   * `networkResourceGroupName` - (Required) Vnet Resource Group Name.
 *   * `virtualNetworkName` - (Required) Virtual Network.
 *   * `networkInterface` - (Required) Define a network interface
 *     * `isPrimary` - (Required) Defines whether the network interface is primary or not.
 *     * `subnetName` - (Required) Subnet name.
 *     * `assignPublicIp` - (Optional) Assign public IP.
 *     * `publicIpSku` - (Optional) Required if assignPublicIp=true values=[STANDARD/BASIC].
 *     * `networkSecurityGroup` - (Optional) Network Security Group.
 *       * `networkResourceGroupName` - (Required) Requires valid security group name.
 *       * `name` - (Required) Requires valid resource group name.
 *     * `enableIpForwarding` - (Optional) Enable IP Forwarding.
 *     * `privateIpAddresses` - (Optional) A list with unique items that every item is a valid IP.
 *     * `additionalIpConfigurations` - (Optional) Additional configuration of network interface.
 *       * `name` - (Required) Configuration name.
 *       * `privateIpAddressVersion` - (Required, Enum `"IPv4", "IPv6"` Default `"IPv4"`) Version of the private IP address.
 *     * `publicIps` - (Optional) Defined a pool of Public Ips (from Azure), that will be associated to the network interface. We will associate one public ip per instance until the pool is exhausted, in which case, we will create a new one.
 *       * `resourceGroupName` - (Required) The resource group of the public ip.
 *       * `name` - (Required) - The name of the public ip.
 *     * `applicationSecurityGroups` - (Optional) Network Security Group.
 *       * `resourceGroupName` - (Required) Requires valid security group name.
 *       * `name` - (Required) Requires valid resource group name.
 *
 * <a id="osDisk"></a>
 * ## OS Disk
 *
 * * `osDisk` - (Optional) Specify OS disk specification other than default.
 *   * `sizeGb` - (Optional, Default `"30"`) The size of the data disk in GB.
 *   * `type` - (Required, Enum `"Standard_LRS", "Premium_LRS", "StandardSSD_LRS"`) The type of the OS disk.
 *
 * <a id="secret"></a>
 * ## Secret
 *
 * * `secret` - (Optional) Set of certificates that should be installed on the VM.
 *   * `sourceVault` - (Required) The key vault reference, contains the required certificates.
 *     * `name` - (Required) The name of the key vault.
 *     * `resourceGroupName` - (Required) The resource group name of the key vault.
 *   * `vaultCertificates` - (Required) The required certificate references.
 *     * `certificateUrl` - (Optional) The URL of the certificate under the key vault.
 *     * `certificateStore` - (Required) The certificate store directory the VM. The directory is created in the LocalMachine account.
 *       * This field is required only when using Windows OS type
 *       * This field must be ‘null’ when the OS type is Linux
 *
 * <a id="tag"></a>
 * ## Tag
 *
 * * `tag` - (Optional) Unique Key-Value pair for all Stateful Node Resources.
 *   * `tagKey` - (Optional) Tag Key for Stateful Node Resources.
 *   * `tagValue` - (Optional) Tag Value for Stateful Node Resources.
 *
 * <a id="health"></a>
 * ## Health
 *
 * * `health` - (Optional) Set the auto healing preferences for unhealthy VMs.
 *   * `healthCheckTypes` - (Optional, Enum `"vmState", "applicationGateway"`) Healthcheck to use to validate VM health.
 *   * `unhealthyDuration` - (Optional) Amount of time to be unhealthy before a replacement is triggered.
 *   * `autoHealing` - (Required) Enable Autohealing of unhealthy VMs.
 *   * `gracePeriod` - (Optional) Period of time to wait for VM to reach healthiness before monitoring for unhealthiness.
 *
 * <a id="persistence"></a>
 * ## Persistence
 *
 * * `shouldPersistOsDisk` - (Required) Should persist os disk.
 * * `osDiskPersistenceMode` - (Optional, Enum `"reattach", "onLaunch"`)
 * * `shouldPersistDataDisks` - (Required) Should persist data disks.
 * * `dataDisksPersistenceMode` - (Optional, Enum `"reattach", "onLaunch"`)
 * * `shouldPersistNetwork` - (Required) Should persist network.
 *
 * <a id="schedulingTasks"></a>
 * ## Scheduling Tasks
 *
 * * `schedulingTask` - (Optional) Scheduling settings object for stateful node.
 *   * `isEnabled` - (Required) Is scheduled task enabled for stateful node.
 *   * `type` - (Required, Enum `"pause", "resume", "recycle") The type of the scheduled task
 *   * `cronExpression` (Required) A expression which describes when to execute the scheduled task (UTC).
 *
 * <a id="signals"></a>
 * ## Signals
 *
 * * `signal` - (Optional) A signal object defined for the stateful node.
 *   * `type` - (Required, Enum `"vmReady", "vmReadyToShutdown"`) The type of the signal defined for the stateful node.
 *   * `timeout` - (Required, Default `"1800"`) The timeout in seconds to hold the vm until a signal is sent. If no signal is sent the vm will be replaced (vmReady) or we will terminate the vm (vmReadyToShutdown) after the timeout.
 *
 * ***
 *
 * <a id="attachDataDisk"></a>
 * ## Attach Data Disk
 *
 * * `attachDataDisk` - (Optional) Create a new data disk and attach it to the stateful node.
 *   * `dataDiskName` - (Required) The name of the created data disk.
 *   * `dataDiskResourceGroupName` - (Required) The resource group name in which the data disk will be created.
 *   * `storageAccountType` - (Required, Enum `"Standard_LRS", "Premium_LRS", "StandardSSD_LRS", "UltraSSD_LRS"`) The type of the data disk.
 *   * `sizeGb` - (Required) The size of the data disk in GB, Required if dataDisks is specified.
 *   * `zone` - (Optional, Enum `"1", "2", "3"`) The Availability Zone in which the data disk will be created. If not defined, the data disk will be created regionally.
 *   * `lun` - (Optional, Default `"orginal"`) The LUN of the data disk. If not defined, the LUN will be set in order.
 *
 * <a id="detachDataDisk"></a>
 * ## Detach Data Disk
 *
 * * `detachDataDisk` - (Optional) Detach a data disk from a stateful node.
 *   * `dataDiskName` - (Required) The name of the detached data disk.
 *   * `dataDiskResourceGroupName` - (Required) The resource group name in which the data disk exists.
 *   * `shouldDeallocate` - (Required) Indicates whether to delete the data disk in addition to detach.
 *   * `ttlInHours` - (Required, Default `"0"`) Hours to keep the disk alive before deletion.
 *
 * <a id="updateState"></a>
 * ## Update State
 *
 * * `updateState` - (Optional) Update the stateful node state.
 *   * `state` - (Required, Enum `"pause", "resume", "recycle"`) New state for the stateful node.
 *
 * <a id="importVm"></a>
 * ## Import VM
 *
 * * `importVm` - (Optional) Import an Azure VM and create a stateful node by providing a node configuration.
 *   * `resourceGroupName` - (Required) Name of the Resource Group for Stateful Node.
 *   * `originalVmName` - (Required) Azure Import Stateful Node Name.
 *   * `drainingTimeout` - (Optional) Hours to keep resources alive.
 *   * `resourcesRetentionTime` - (Optional) Hours to keep resources alive.
 */
export class StatefulNodeAzure extends pulumi.CustomResource {
    /**
     * Get an existing StatefulNodeAzure resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StatefulNodeAzureState, opts?: pulumi.CustomResourceOptions): StatefulNodeAzure {
        return new StatefulNodeAzure(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:index/statefulNodeAzure:StatefulNodeAzure';

    /**
     * Returns true if the given object is an instance of StatefulNodeAzure.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StatefulNodeAzure {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StatefulNodeAzure.__pulumiType;
    }

    public readonly attachDataDisks!: pulumi.Output<outputs.StatefulNodeAzureAttachDataDisk[] | undefined>;
    public readonly bootDiagnostics!: pulumi.Output<outputs.StatefulNodeAzureBootDiagnostic[]>;
    public readonly customData!: pulumi.Output<string>;
    public readonly dataDisks!: pulumi.Output<outputs.StatefulNodeAzureDataDisk[]>;
    public readonly dataDisksPersistenceMode!: pulumi.Output<string>;
    public readonly deletes!: pulumi.Output<outputs.StatefulNodeAzureDelete[] | undefined>;
    public readonly description!: pulumi.Output<string>;
    public readonly detachDataDisks!: pulumi.Output<outputs.StatefulNodeAzureDetachDataDisk[] | undefined>;
    public readonly extensions!: pulumi.Output<outputs.StatefulNodeAzureExtension[]>;
    public readonly health!: pulumi.Output<outputs.StatefulNodeAzureHealth>;
    public readonly image!: pulumi.Output<outputs.StatefulNodeAzureImage>;
    public readonly importVms!: pulumi.Output<outputs.StatefulNodeAzureImportVm[] | undefined>;
    public readonly loadBalancers!: pulumi.Output<outputs.StatefulNodeAzureLoadBalancer[]>;
    public readonly login!: pulumi.Output<outputs.StatefulNodeAzureLogin>;
    public readonly managedServiceIdentities!: pulumi.Output<outputs.StatefulNodeAzureManagedServiceIdentity[]>;
    public readonly name!: pulumi.Output<string>;
    public readonly network!: pulumi.Output<outputs.StatefulNodeAzureNetwork>;
    public readonly odSizes!: pulumi.Output<string[]>;
    public readonly os!: pulumi.Output<string>;
    public readonly osDisk!: pulumi.Output<outputs.StatefulNodeAzureOsDisk>;
    public readonly osDiskPersistenceMode!: pulumi.Output<string>;
    public readonly preferredSpotSizes!: pulumi.Output<string[]>;
    public readonly preferredZones!: pulumi.Output<string>;
    public readonly region!: pulumi.Output<string>;
    public readonly resourceGroupName!: pulumi.Output<string>;
    public readonly schedulingTasks!: pulumi.Output<outputs.StatefulNodeAzureSchedulingTask[]>;
    public readonly secrets!: pulumi.Output<outputs.StatefulNodeAzureSecret[]>;
    public readonly shouldPersistDataDisks!: pulumi.Output<boolean>;
    public readonly shouldPersistNetwork!: pulumi.Output<boolean>;
    public readonly shouldPersistOsDisk!: pulumi.Output<boolean>;
    public readonly shouldPersistVm!: pulumi.Output<boolean>;
    public readonly shutdownScript!: pulumi.Output<string>;
    public readonly signals!: pulumi.Output<outputs.StatefulNodeAzureSignal[]>;
    public readonly spotSizes!: pulumi.Output<string[]>;
    public readonly strategy!: pulumi.Output<outputs.StatefulNodeAzureStrategy>;
    public readonly tags!: pulumi.Output<outputs.StatefulNodeAzureTag[]>;
    public readonly updateStates!: pulumi.Output<outputs.StatefulNodeAzureUpdateState[] | undefined>;
    public readonly zones!: pulumi.Output<string[] | undefined>;

    /**
     * Create a StatefulNodeAzure resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StatefulNodeAzureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StatefulNodeAzureArgs | StatefulNodeAzureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StatefulNodeAzureState | undefined;
            resourceInputs["attachDataDisks"] = state ? state.attachDataDisks : undefined;
            resourceInputs["bootDiagnostics"] = state ? state.bootDiagnostics : undefined;
            resourceInputs["customData"] = state ? state.customData : undefined;
            resourceInputs["dataDisks"] = state ? state.dataDisks : undefined;
            resourceInputs["dataDisksPersistenceMode"] = state ? state.dataDisksPersistenceMode : undefined;
            resourceInputs["deletes"] = state ? state.deletes : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["detachDataDisks"] = state ? state.detachDataDisks : undefined;
            resourceInputs["extensions"] = state ? state.extensions : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["image"] = state ? state.image : undefined;
            resourceInputs["importVms"] = state ? state.importVms : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
            resourceInputs["managedServiceIdentities"] = state ? state.managedServiceIdentities : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["odSizes"] = state ? state.odSizes : undefined;
            resourceInputs["os"] = state ? state.os : undefined;
            resourceInputs["osDisk"] = state ? state.osDisk : undefined;
            resourceInputs["osDiskPersistenceMode"] = state ? state.osDiskPersistenceMode : undefined;
            resourceInputs["preferredSpotSizes"] = state ? state.preferredSpotSizes : undefined;
            resourceInputs["preferredZones"] = state ? state.preferredZones : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["schedulingTasks"] = state ? state.schedulingTasks : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["shouldPersistDataDisks"] = state ? state.shouldPersistDataDisks : undefined;
            resourceInputs["shouldPersistNetwork"] = state ? state.shouldPersistNetwork : undefined;
            resourceInputs["shouldPersistOsDisk"] = state ? state.shouldPersistOsDisk : undefined;
            resourceInputs["shouldPersistVm"] = state ? state.shouldPersistVm : undefined;
            resourceInputs["shutdownScript"] = state ? state.shutdownScript : undefined;
            resourceInputs["signals"] = state ? state.signals : undefined;
            resourceInputs["spotSizes"] = state ? state.spotSizes : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updateStates"] = state ? state.updateStates : undefined;
            resourceInputs["zones"] = state ? state.zones : undefined;
        } else {
            const args = argsOrState as StatefulNodeAzureArgs | undefined;
            if ((!args || args.image === undefined) && !opts.urn) {
                throw new Error("Missing required property 'image'");
            }
            if ((!args || args.login === undefined) && !opts.urn) {
                throw new Error("Missing required property 'login'");
            }
            if ((!args || args.network === undefined) && !opts.urn) {
                throw new Error("Missing required property 'network'");
            }
            if ((!args || args.odSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'odSizes'");
            }
            if ((!args || args.os === undefined) && !opts.urn) {
                throw new Error("Missing required property 'os'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            if ((!args || args.shouldPersistDataDisks === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shouldPersistDataDisks'");
            }
            if ((!args || args.shouldPersistNetwork === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shouldPersistNetwork'");
            }
            if ((!args || args.shouldPersistOsDisk === undefined) && !opts.urn) {
                throw new Error("Missing required property 'shouldPersistOsDisk'");
            }
            if ((!args || args.spotSizes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spotSizes'");
            }
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            resourceInputs["attachDataDisks"] = args ? args.attachDataDisks : undefined;
            resourceInputs["bootDiagnostics"] = args ? args.bootDiagnostics : undefined;
            resourceInputs["customData"] = args ? args.customData : undefined;
            resourceInputs["dataDisks"] = args ? args.dataDisks : undefined;
            resourceInputs["dataDisksPersistenceMode"] = args ? args.dataDisksPersistenceMode : undefined;
            resourceInputs["deletes"] = args ? args.deletes : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["detachDataDisks"] = args ? args.detachDataDisks : undefined;
            resourceInputs["extensions"] = args ? args.extensions : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["importVms"] = args ? args.importVms : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
            resourceInputs["managedServiceIdentities"] = args ? args.managedServiceIdentities : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["odSizes"] = args ? args.odSizes : undefined;
            resourceInputs["os"] = args ? args.os : undefined;
            resourceInputs["osDisk"] = args ? args.osDisk : undefined;
            resourceInputs["osDiskPersistenceMode"] = args ? args.osDiskPersistenceMode : undefined;
            resourceInputs["preferredSpotSizes"] = args ? args.preferredSpotSizes : undefined;
            resourceInputs["preferredZones"] = args ? args.preferredZones : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["schedulingTasks"] = args ? args.schedulingTasks : undefined;
            resourceInputs["secrets"] = args ? args.secrets : undefined;
            resourceInputs["shouldPersistDataDisks"] = args ? args.shouldPersistDataDisks : undefined;
            resourceInputs["shouldPersistNetwork"] = args ? args.shouldPersistNetwork : undefined;
            resourceInputs["shouldPersistOsDisk"] = args ? args.shouldPersistOsDisk : undefined;
            resourceInputs["shouldPersistVm"] = args ? args.shouldPersistVm : undefined;
            resourceInputs["shutdownScript"] = args ? args.shutdownScript : undefined;
            resourceInputs["signals"] = args ? args.signals : undefined;
            resourceInputs["spotSizes"] = args ? args.spotSizes : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["updateStates"] = args ? args.updateStates : undefined;
            resourceInputs["zones"] = args ? args.zones : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StatefulNodeAzure.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StatefulNodeAzure resources.
 */
export interface StatefulNodeAzureState {
    attachDataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureAttachDataDisk>[]>;
    bootDiagnostics?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureBootDiagnostic>[]>;
    customData?: pulumi.Input<string>;
    dataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDataDisk>[]>;
    dataDisksPersistenceMode?: pulumi.Input<string>;
    deletes?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDelete>[]>;
    description?: pulumi.Input<string>;
    detachDataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDetachDataDisk>[]>;
    extensions?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureExtension>[]>;
    health?: pulumi.Input<inputs.StatefulNodeAzureHealth>;
    image?: pulumi.Input<inputs.StatefulNodeAzureImage>;
    importVms?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureImportVm>[]>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureLoadBalancer>[]>;
    login?: pulumi.Input<inputs.StatefulNodeAzureLogin>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureManagedServiceIdentity>[]>;
    name?: pulumi.Input<string>;
    network?: pulumi.Input<inputs.StatefulNodeAzureNetwork>;
    odSizes?: pulumi.Input<pulumi.Input<string>[]>;
    os?: pulumi.Input<string>;
    osDisk?: pulumi.Input<inputs.StatefulNodeAzureOsDisk>;
    osDiskPersistenceMode?: pulumi.Input<string>;
    preferredSpotSizes?: pulumi.Input<pulumi.Input<string>[]>;
    preferredZones?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
    resourceGroupName?: pulumi.Input<string>;
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSchedulingTask>[]>;
    secrets?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSecret>[]>;
    shouldPersistDataDisks?: pulumi.Input<boolean>;
    shouldPersistNetwork?: pulumi.Input<boolean>;
    shouldPersistOsDisk?: pulumi.Input<boolean>;
    shouldPersistVm?: pulumi.Input<boolean>;
    shutdownScript?: pulumi.Input<string>;
    signals?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSignal>[]>;
    spotSizes?: pulumi.Input<pulumi.Input<string>[]>;
    strategy?: pulumi.Input<inputs.StatefulNodeAzureStrategy>;
    tags?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureTag>[]>;
    updateStates?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureUpdateState>[]>;
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a StatefulNodeAzure resource.
 */
export interface StatefulNodeAzureArgs {
    attachDataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureAttachDataDisk>[]>;
    bootDiagnostics?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureBootDiagnostic>[]>;
    customData?: pulumi.Input<string>;
    dataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDataDisk>[]>;
    dataDisksPersistenceMode?: pulumi.Input<string>;
    deletes?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDelete>[]>;
    description?: pulumi.Input<string>;
    detachDataDisks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureDetachDataDisk>[]>;
    extensions?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureExtension>[]>;
    health?: pulumi.Input<inputs.StatefulNodeAzureHealth>;
    image: pulumi.Input<inputs.StatefulNodeAzureImage>;
    importVms?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureImportVm>[]>;
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureLoadBalancer>[]>;
    login: pulumi.Input<inputs.StatefulNodeAzureLogin>;
    managedServiceIdentities?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureManagedServiceIdentity>[]>;
    name?: pulumi.Input<string>;
    network: pulumi.Input<inputs.StatefulNodeAzureNetwork>;
    odSizes: pulumi.Input<pulumi.Input<string>[]>;
    os: pulumi.Input<string>;
    osDisk?: pulumi.Input<inputs.StatefulNodeAzureOsDisk>;
    osDiskPersistenceMode?: pulumi.Input<string>;
    preferredSpotSizes?: pulumi.Input<pulumi.Input<string>[]>;
    preferredZones?: pulumi.Input<string>;
    region: pulumi.Input<string>;
    resourceGroupName: pulumi.Input<string>;
    schedulingTasks?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSchedulingTask>[]>;
    secrets?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSecret>[]>;
    shouldPersistDataDisks: pulumi.Input<boolean>;
    shouldPersistNetwork: pulumi.Input<boolean>;
    shouldPersistOsDisk: pulumi.Input<boolean>;
    shouldPersistVm?: pulumi.Input<boolean>;
    shutdownScript?: pulumi.Input<string>;
    signals?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureSignal>[]>;
    spotSizes: pulumi.Input<pulumi.Input<string>[]>;
    strategy: pulumi.Input<inputs.StatefulNodeAzureStrategy>;
    tags?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureTag>[]>;
    updateStates?: pulumi.Input<pulumi.Input<inputs.StatefulNodeAzureUpdateState>[]>;
    zones?: pulumi.Input<pulumi.Input<string>[]>;
}
