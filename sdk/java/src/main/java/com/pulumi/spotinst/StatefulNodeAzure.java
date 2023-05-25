// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.spotinst.StatefulNodeAzureArgs;
import com.pulumi.spotinst.Utilities;
import com.pulumi.spotinst.inputs.StatefulNodeAzureState;
import com.pulumi.spotinst.outputs.StatefulNodeAzureAttachDataDisk;
import com.pulumi.spotinst.outputs.StatefulNodeAzureBootDiagnostic;
import com.pulumi.spotinst.outputs.StatefulNodeAzureDataDisk;
import com.pulumi.spotinst.outputs.StatefulNodeAzureDelete;
import com.pulumi.spotinst.outputs.StatefulNodeAzureDetachDataDisk;
import com.pulumi.spotinst.outputs.StatefulNodeAzureExtension;
import com.pulumi.spotinst.outputs.StatefulNodeAzureHealth;
import com.pulumi.spotinst.outputs.StatefulNodeAzureImage;
import com.pulumi.spotinst.outputs.StatefulNodeAzureImportVm;
import com.pulumi.spotinst.outputs.StatefulNodeAzureLoadBalancer;
import com.pulumi.spotinst.outputs.StatefulNodeAzureLogin;
import com.pulumi.spotinst.outputs.StatefulNodeAzureManagedServiceIdentity;
import com.pulumi.spotinst.outputs.StatefulNodeAzureNetwork;
import com.pulumi.spotinst.outputs.StatefulNodeAzureOsDisk;
import com.pulumi.spotinst.outputs.StatefulNodeAzureSchedulingTask;
import com.pulumi.spotinst.outputs.StatefulNodeAzureSecret;
import com.pulumi.spotinst.outputs.StatefulNodeAzureSignal;
import com.pulumi.spotinst.outputs.StatefulNodeAzureStrategy;
import com.pulumi.spotinst.outputs.StatefulNodeAzureTag;
import com.pulumi.spotinst.outputs.StatefulNodeAzureUpdateState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Spotinst stateful node Azure resource.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.spotinst.StatefulNodeAzure;
 * import com.pulumi.spotinst.StatefulNodeAzureArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureStrategyArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureStrategyRevertToSpotArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureBootDiagnosticArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureDataDiskArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureExtensionArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureImageArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureLoadBalancerArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureLoginArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureManagedServiceIdentityArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureNetworkArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureOsDiskArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureSecretArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureTagArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureHealthArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureSchedulingTaskArgs;
 * import com.pulumi.spotinst.inputs.StatefulNodeAzureSignalArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testStatefulNodeAzure = new StatefulNodeAzure(&#34;testStatefulNodeAzure&#34;, StatefulNodeAzureArgs.builder()        
 *             .region(&#34;eastus&#34;)
 *             .resourceGroupName(&#34;spotinst-azure&#34;)
 *             .description(&#34;example_stateful_node_azure_description&#34;)
 *             .strategy(StatefulNodeAzureStrategyArgs.builder()
 *                 .drainingTimeout(30)
 *                 .fallbackToOnDemand(true)
 *                 .optimizationWindows(&#34;Tue:19:46-Tue:20:46&#34;)
 *                 .revertToSpot(StatefulNodeAzureStrategyRevertToSpotArgs.builder()
 *                     .performAt(&#34;timeWindow&#34;)
 *                     .build())
 *                 .preferredLifeCycle(&#34;od&#34;)
 *                 .build())
 *             .os(&#34;Linux&#34;)
 *             .odSizes(            
 *                 &#34;standard_ds1_v2&#34;,
 *                 &#34;standard_ds2_v2&#34;)
 *             .spotSizes(            
 *                 &#34;standard_ds1_v2&#34;,
 *                 &#34;standard_ds2_v2&#34;)
 *             .preferredSpotSizes(&#34;standard_ds1_v2&#34;)
 *             .zones(            
 *                 &#34;1&#34;,
 *                 &#34;3&#34;)
 *             .preferredZones(&#34;1&#34;)
 *             .customData(&#34;&#34;)
 *             .shutdownScript(&#34;&#34;)
 *             .bootDiagnostics(StatefulNodeAzureBootDiagnosticArgs.builder()
 *                 .isEnabled(true)
 *                 .storageUrl(&#34;https://.blob.core.windows.net/test&#34;)
 *                 .type(&#34;unmanaged&#34;)
 *                 .build())
 *             .dataDisks(            
 *                 StatefulNodeAzureDataDiskArgs.builder()
 *                     .sizeGb(1)
 *                     .lun(1)
 *                     .type(&#34;Standard_LRS&#34;)
 *                     .build(),
 *                 StatefulNodeAzureDataDiskArgs.builder()
 *                     .sizeGb(10)
 *                     .lun(2)
 *                     .type(&#34;Standard_LRS&#34;)
 *                     .build())
 *             .extensions(StatefulNodeAzureExtensionArgs.builder()
 *                 .name(&#34;extensionName&#34;)
 *                 .type(&#34;customScript&#34;)
 *                 .publisher(&#34;Microsoft.Azure.Extensions&#34;)
 *                 .apiVersion(&#34;2.0&#34;)
 *                 .minorVersionAutoUpgrade(true)
 *                 .protectedSettings(Map.of(&#34;script&#34;, &#34;IyEvYmluL2Jhc2gKZWNobyAibmlyIiA+IC9ob29uaXIudHh0Cg==&#34;))
 *                 .build())
 *             .image(StatefulNodeAzureImageArgs.builder()
 *                 .marketplaceImages(StatefulNodeAzureImageMarketplaceImageArgs.builder()
 *                     .publisher(&#34;Canonical&#34;)
 *                     .offer(&#34;UbuntuServer&#34;)
 *                     .sku(&#34;16.04-LTS&#34;)
 *                     .version(&#34;latest&#34;)
 *                     .build())
 *                 .build())
 *             .loadBalancers(StatefulNodeAzureLoadBalancerArgs.builder()
 *                 .type(&#34;loadBalancer&#34;)
 *                 .resourceGroupName(&#34;testResourceGroup&#34;)
 *                 .name(&#34;testLoadBalancer&#34;)
 *                 .sku(&#34;Standard&#34;)
 *                 .backendPoolNames(                
 *                     &#34;testBackendPool1&#34;,
 *                     &#34;testBackendPool2&#34;)
 *                 .build())
 *             .login(StatefulNodeAzureLoginArgs.builder()
 *                 .userName(&#34;admin&#34;)
 *                 .sshPublicKey(&#34;33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==&#34;)
 *                 .build())
 *             .managedServiceIdentities(StatefulNodeAzureManagedServiceIdentityArgs.builder()
 *                 .name(&#34;mySI2&#34;)
 *                 .resourceGroupName(&#34;myResourceGroup&#34;)
 *                 .build())
 *             .network(StatefulNodeAzureNetworkArgs.builder()
 *                 .networkResourceGroupName(&#34;subnetResourceGroup&#34;)
 *                 .virtualNetworkName(&#34;vname&#34;)
 *                 .networkInterfaces(StatefulNodeAzureNetworkNetworkInterfaceArgs.builder()
 *                     .isPrimary(true)
 *                     .subnetName(&#34;testSubnet&#34;)
 *                     .assignPublicIp(true)
 *                     .publicIpSku(&#34;Standard&#34;)
 *                     .networkSecurityGroups(StatefulNodeAzureNetworkNetworkInterfaceNetworkSecurityGroupArgs.builder()
 *                         .networkResourceGroupName(&#34;test&#34;)
 *                         .name(&#34;test&#34;)
 *                         .build())
 *                     .enableIpForwarding(true)
 *                     .privateIpAddresses(&#34;172.23.4.20&#34;)
 *                     .additionalIpConfigurations(StatefulNodeAzureNetworkNetworkInterfaceAdditionalIpConfigurationArgs.builder()
 *                         .name(&#34;test&#34;)
 *                         .privateIpAddressVersion(&#34;IPv4&#34;)
 *                         .build())
 *                     .publicIps(StatefulNodeAzureNetworkNetworkInterfacePublicIpArgs.builder()
 *                         .resourceGroupName(&#34;resourceGroup&#34;)
 *                         .name(&#34;test&#34;)
 *                         .build())
 *                     .applicationSecurityGroups(StatefulNodeAzureNetworkNetworkInterfaceApplicationSecurityGroupArgs.builder()
 *                         .resourceGroupName(&#34;AsgResourceGroup&#34;)
 *                         .name(&#34;AsgName&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .osDisk(StatefulNodeAzureOsDiskArgs.builder()
 *                 .sizeGb(30)
 *                 .type(&#34;Standard_LRS&#34;)
 *                 .build())
 *             .secrets(StatefulNodeAzureSecretArgs.builder()
 *                 .sourceVaults(StatefulNodeAzureSecretSourceVaultArgs.builder()
 *                     .name(&#34;string&#34;)
 *                     .resourceGroupName(&#34;string&#34;)
 *                     .build())
 *                 .vaultCertificates(StatefulNodeAzureSecretVaultCertificateArgs.builder()
 *                     .certificateUrl(&#34;string&#34;)
 *                     .certificateStore(&#34;string&#34;)
 *                     .build())
 *                 .build())
 *             .tags(StatefulNodeAzureTagArgs.builder()
 *                 .tagKey(&#34;Creator&#34;)
 *                 .tagValue(&#34;string&#34;)
 *                 .build())
 *             .health(StatefulNodeAzureHealthArgs.builder()
 *                 .healthCheckTypes(&#34;vmState&#34;)
 *                 .unhealthyDuration(300)
 *                 .gracePeriod(120)
 *                 .autoHealing(true)
 *                 .build())
 *             .shouldPersistOsDisk(false)
 *             .osDiskPersistenceMode(&#34;reattach&#34;)
 *             .shouldPersistDataDisks(true)
 *             .dataDisksPersistenceMode(&#34;reattach&#34;)
 *             .shouldPersistNetwork(true)
 *             .schedulingTasks(            
 *                 StatefulNodeAzureSchedulingTaskArgs.builder()
 *                     .isEnabled(true)
 *                     .type(&#34;pause&#34;)
 *                     .cronExpression(&#34;44 10 * * *&#34;)
 *                     .build(),
 *                 StatefulNodeAzureSchedulingTaskArgs.builder()
 *                     .isEnabled(true)
 *                     .type(&#34;resume&#34;)
 *                     .cronExpression(&#34;48 10 * * *&#34;)
 *                     .build(),
 *                 StatefulNodeAzureSchedulingTaskArgs.builder()
 *                     .isEnabled(true)
 *                     .type(&#34;recycle&#34;)
 *                     .cronExpression(&#34;52 10 * * *&#34;)
 *                     .build())
 *             .signals(            
 *                 StatefulNodeAzureSignalArgs.builder()
 *                     .type(&#34;vmReady&#34;)
 *                     .timeout(20)
 *                     .build(),
 *                 StatefulNodeAzureSignalArgs.builder()
 *                     .type(&#34;vmReady&#34;)
 *                     .timeout(40)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * # Argument Reference
 * 
 * The following arguments are supported:
 * 
 * * `name` - (Required) Azure stateful node name.
 * * `region` - (Required) The Azure region your stateful node will be created in.
 * * `resource_group_name` - (Required) Name of the Resource Group for stateful node.
 * * `description` - (Optional) Describe your Azure stateful node.
 * 
 * &lt;a id=&#34;strategy&#34;&gt;&lt;/a&gt;
 * ## Strategy
 * 
 * * `strategy` - (Required) Strategy for stateful node.
 *   * `draining_timeout` - (Optional, Default `120`) Time (in seconds) to allow the VM be drained from incoming TCP connections and detached from MLB before terminating it during a scale down operation.
 *   * `fallback_to_on_demand` - (Required) In case of no spots available, Stateful Node will launch an On-demand instance instead.
 *   * `optimization_windows` - (Optional) Valid format: &#34;ddd:hh:mm-ddd:hh:mm (day:hour(0-23):minute(0-59))&#34;, not empty if revertToSpot.performAt = timeWindow.
 *   * `preferred_life_cycle` - (Optional, Enum `&#34;od&#34;, &#34;spot&#34;`, Default `&#34;spot&#34;`) The desired type of VM.
 *   * `revert_to_spot` - (Optional) Hold settings for strategy correction - replacing On-Demand for Spot VMs.
 *     * `perform_at` - (Required, Enum `&#34;timeWindow&#34;, &#34;never&#34;, &#34;always&#34;`, Default `&#34;always&#34;`) Settings for maintenance strategy.
 * 
 * &lt;a id=&#34;compute&#34;&gt;&lt;/a&gt;
 * ## Compute
 * 
 * * `os` - (Required, Enum `&#34;Linux&#34;, &#34;Windows&#34;`) Type of operating system.
 * * `od_sizes` - (Required) Available On-Demand sizes.
 * * `spot_sizes` - (Required) Available Spot-VM sizes.
 * * `preferred_spot_sizes` - (Optional) Prioritize Spot VM sizes when launching Spot VMs for the group. If set, must be a sublist of compute.vmSizes.spotSizes.
 * * `zones` - (Optional, Enum `&#34;1&#34;, &#34;2&#34;, &#34;3&#34;`) List of Azure Availability Zones in the defined region. If not defined, Virtual machines will be launched regionally.
 * * `preferred_zones` - (Optional, Enum `&#34;1&#34;, &#34;2&#34;, &#34;3&#34;`) The AZs to prioritize when launching VMs. If no markets are available in the Preferred AZs, VMs are launched in the non-preferred AZs. Must be a sublist of compute.zones.
 * * `custom_data` - (Optional) This value will hold the YAML in base64 and will be executed upon VM launch.
 * * `shutdown_script` - (Optional) Shutdown script for the stateful node. Value should be passed as a string encoded at Base64 only.
 * 
 * &lt;a id=&#34;boot_diagnostics&#34;&gt;&lt;/a&gt;
 * ## Boot Diagnostics
 * 
 * * `boot_diagnostics`
 *   * `is_enabled` - (Optional) Allows you to enable and disable the configuration of boot diagnostics at launch.
 *   * `storage_url` - (Optional) The storage URI that is used if a type is unmanaged. The storage URI must follow the blob storage URI format (&#34;https://.blob.core.windows.net/&#34;). StorageUri is required if the type is unmanaged. StorageUri must be ‘null’ in case the boot diagnostics type is managed.
 *   * `type` - (Optional, Enum `&#34;managed&#34;, &#34;unmanaged&#34;`) Defines the storage type on VM launch in Azure.
 * 
 * &lt;a id=&#34;data_disks&#34;&gt;&lt;/a&gt;
 * ## Data Disks
 * 
 * * `data_disk` - (Optional) The definitions of data disks that will be created and attached to the stateful node&#39;s VM.
 *   * `size_gb` - (Required) The size of the data disk in GB, required if dataDisks is specified.
 *   * `lun` - (Required) The LUN of the data disk.
 *   * `type` - (Required, Enum `&#34;Standard_LRS&#34;, &#34;Premium_LRS&#34;, &#34;StandardSSD_LRS&#34;, &#34;UltraSSD_LRS&#34;`) The type of the data disk.
 * 
 * &lt;a id=&#34;extensions&#34;&gt;&lt;/a&gt;
 * ## Extensions
 * 
 * * `extension` - (Optional) An object for an azure extension.
 *   * `name` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `type` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `publisher` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `api_version` - (Required) The API version of the extension. Required if extension specified.
 *   * `minor_version_auto_upgrade` - (Required) Required on compute.launchSpecification.extensions object.
 *   * `protected_settings` - (Optional) Object for protected settings.
 *   * `public_settings` - (Optional) Object for public settings.
 * 
 * &lt;a id=&#34;image&#34;&gt;&lt;/a&gt;
 * ## Image
 * 
 * * `image`
 *   * `marketplace_image` - (Optional) Select an image from Azure&#39;s Marketplace image catalogue. Required if the custom image or gallery image are not specified.
 *     * `publisher` - (Required) Image publisher.
 *     * `offer` - (Required) Image offer.
 *     * `sku` - (Required) Image Stock Keeping Unit, which is the specific version of the image.
 *     * `version` - (Required, Default `&#34;latest&#34;`) Image&#39;s version. if version not provided we use &#34;latest&#34;.
 *   * `gallery_image` - (Optional) Gallery image definitions. Required if custom image or marketplace image are not specified.
 *     * `gallery_resource_group_name` - (Required) The resource group name for gallery image.
 *     * `gallery_name` - (Required) Name of the gallery.
 *     * `image_name` - (Required) Name of the gallery image.
 *     * `version_name` - (Required) Image&#39;s version. Can be in the format x.x.x or &#39;latest&#39;.
 *   * `custom_image` - (Optional) Custom image definitions. Required if marketplace image or gallery image are not specified.
 *     * `custom_image_resource_group_name` - (Required) The resource group name for custom image.
 *     * `name` - (Required) The name of the custom image.
 * 
 * &lt;a id=&#34;load balancer&#34;&gt;&lt;/a&gt;
 * ## Load Balancer
 * 
 * * `load_balancer` - (Optional) Add a load balancer. For Azure Gateway, each Backend Pool is a separate load balancer.
 *   * `type` - (Required, Enum `&#34;loadBalancer&#34;, &#34;applicationGateway&#34;`) The type of load balancer.
 *   * `resource_group_name` - (Required) The Resource Group name of the Load Balancer.
 *   * `name` - (Required) Name of the Application Gateway/Load Balancer.
 *   * `sku` - (Optional)
 *     * if type is `&#34;LoadBalancer&#34;` then possible values are `“Standard&#34;, &#34;Basic”`.
 *     * If ApplicationGateway then possible values are
 *       `“Standard_Large”, “Standard_Medium”, “Standard_Small”, “Standard_v2&#34;, “WAF_Large”, “WAF_Medium&#34;, “WAF_v2&#34;`.
 *   * `backend_pool_names` - (Optional) Name of the Backend Pool to register the Stateful Node VMs to. Each Backend Pool is a separate load balancer. Required if Type is APPLICATION_GATEWAY.
 * 
 * &lt;a id=&#34;login&#34;&gt;&lt;/a&gt;
 * ## Login
 * 
 * * `login` - (Required) Set admin access for accessing your VMs. Password/SSH is required for Linux.
 *   * `user_name` - (Required) username for admin access to VMs.
 *   * `ssh_public_key` - (Optional) SSH for admin access to Linux VMs. Optional for Linux.
 *   * `password` - (Optional) Password for admin access to Windows VMs. Required for Windows.
 * 
 * &lt;a id=&#34;managed_service_identities&#34;&gt;&lt;/a&gt;
 * ## Managed Service Identities
 * 
 * * `managed_service_identities` - (Optional) Add a user-assigned managed identity to the Stateful Node&#39;s VM.
 *   * `name` - (Required) name of the managed identity.
 *   * `resource_group_name` - (Required) The Resource Group that the user-assigned managed identity resides in.
 * 
 * &lt;a id=&#34;network&#34;&gt;&lt;/a&gt;
 * ## Network
 * 
 * * `network` - (Required) Define the Virtual Network and Subnet for your Stateful Node.
 *   * `network_resource_group_name` - (Required) Vnet Resource Group Name.
 *   * `virtual_network_name` - (Required) Virtual Network.
 *   * `network_interface` - (Required) Define a network interface
 *     * `is_primary` - (Required) Defines whether the network interface is primary or not.
 *     * `subnet_name` - (Required) Subnet name.
 *     * `assign_public_ip` - (Optional) Assign public IP.
 *     * `public_ip_sku` - (Optional) Required if assignPublicIp=true values=[Standard/Basic].
 *     * `network_security_group` - (Optional) Network Security Group.
 *       * `network_resource_group_name` - (Required) Requires valid security group name.
 *       * `name` - (Required) Requires valid resource group name.
 *     * `enable_ip_forwarding` - (Optional) Enable IP Forwarding.
 *     * `private_ip_addresses` - (Optional) A list with unique items that every item is a valid IP.
 *     * `additional_ip_configurations` - (Optional) Additional configuration of network interface.
 *       * `name` - (Required) Configuration name.
 *       * `private_ip_address_version` - (Required, Enum `&#34;IPv4&#34;, &#34;IPv6&#34;` Default `&#34;IPv4&#34;`) Version of the private IP address.
 *     * `public_ips` - (Optional) Defined a pool of Public Ips (from Azure), that will be associated to the network interface. We will associate one public ip per instance until the pool is exhausted, in which case, we will create a new one.
 *       * `resource_group_name` - (Required) The resource group of the public ip.
 *       * `name` - (Required) - The name of the public ip.
 *     * `application_security_groups` - (Optional) Network Security Group.
 *       * `resource_group_name` - (Required) Requires valid security group name.
 *       * `name` - (Required) Requires valid resource group name.
 * 
 * &lt;a id=&#34;os_disk&#34;&gt;&lt;/a&gt;
 * ## OS Disk
 * 
 * * `os_disk` - (Optional) Specify OS disk specification other than default.
 *   * `size_gb` - (Optional, Default `&#34;30&#34;`) The size of the data disk in GB.
 *   * `type` - (Required, Enum `&#34;Standard_LRS&#34;, &#34;Premium_LRS&#34;, &#34;StandardSSD_LRS&#34;`) The type of the OS disk.
 * 
 * &lt;a id=&#34;secret&#34;&gt;&lt;/a&gt;
 * ## Secret
 * 
 * * `secret` - (Optional) Set of certificates that should be installed on the VM.
 *   * `source_vault` - (Required) The key vault reference, contains the required certificates.
 *     * `name` - (Required) The name of the key vault.
 *     * `resource_group_name` - (Required) The resource group name of the key vault.
 *   * `vault_certificates` - (Required) The required certificate references.
 *     * `certificate_url` - (Optional) The URL of the certificate under the key vault.
 *     * `certificate_store` - (Required) The certificate store directory the VM. The directory is created in the LocalMachine account.
 *       * This field is required only when using Windows OS type
 *       * This field must be ‘null’ when the OS type is Linux
 * 
 * &lt;a id=&#34;tag&#34;&gt;&lt;/a&gt;
 * ## Tag
 * 
 * * `tag` - (Optional) Unique Key-Value pair for all Stateful Node Resources.
 *   * `tag_key` - (Optional) Tag Key for Stateful Node Resources.
 *   * `tag_value` - (Optional) Tag Value for Stateful Node Resources.
 * 
 * &lt;a id=&#34;health&#34;&gt;&lt;/a&gt;
 * ## Health
 * 
 * * `health` - (Optional) Set the auto healing preferences for unhealthy VMs.
 *   * `health_check_types` - (Optional, Enum `&#34;vmState&#34;, &#34;applicationGateway&#34;`) Healthcheck to use to validate VM health.
 *   * `unhealthy_duration` - (Optional) Amount of time to be unhealthy before a replacement is triggered.
 *   * `auto_healing` - (Required) Enable Autohealing of unhealthy VMs.
 *   * `grace_period` - (Optional) Period of time to wait for VM to reach healthiness before monitoring for unhealthiness.
 * 
 * &lt;a id=&#34;persistence&#34;&gt;&lt;/a&gt;
 * ## Persistence
 * 
 * * `should_persist_os_disk` - (Required) Should persist os disk.
 * * `os_disk_persistence_mode` - (Optional, Enum `&#34;reattach&#34;, &#34;onLaunch&#34;`)
 * * `should_persist_data_disks` - (Required) Should persist data disks.
 * * `data_disks_persistence_mode` - (Optional, Enum `&#34;reattach&#34;, &#34;onLaunch&#34;`)
 * * `should_persist_network` - (Required) Should persist network.
 * 
 * &lt;a id=&#34;scheduling_tasks&#34;&gt;&lt;/a&gt;
 * ## Scheduling Tasks
 * 
 * * `scheduling_task` - (Optional) Scheduling settings object for stateful node.
 *   * `is_enabled` - (Required) Is scheduled task enabled for stateful node.
 *   * `type` - (Required, Enum `&#34;pause&#34;, &#34;resume&#34;, &#34;recycle&#34;) The type of the scheduled task
 *   * `cron_expression` (Required) A expression which describes when to execute the scheduled task (UTC).
 * 
 * &lt;a id=&#34;signals&#34;&gt;&lt;/a&gt;
 * ## Signals
 * 
 * * `signal` - (Optional) A signal object defined for the stateful node.
 *   * `type` - (Required, Enum `&#34;vmReady&#34;, &#34;vmReadyToShutdown&#34;`) The type of the signal defined for the stateful node.
 *   * `timeout` - (Required, Default `&#34;1800&#34;`) The timeout in seconds to hold the vm until a signal is sent. If no signal is sent the vm will be replaced (vmReady) or we will terminate the vm (vmReadyToShutdown) after the timeout.
 * 
 * ***
 * 
 * &lt;a id=&#34;attach_data_disk&#34;&gt;&lt;/a&gt;
 * ## Attach Data Disk
 * 
 * * `attach_data_disk` - (Optional) Create a new data disk and attach it to the stateful node.
 *   * `data_disk_name` - (Required) The name of the created data disk.
 *   * `data_disk_resource_group_name` - (Required) The resource group name in which the data disk will be created.
 *   * `storage_account_type` - (Required, Enum `&#34;Standard_LRS&#34;, &#34;Premium_LRS&#34;, &#34;StandardSSD_LRS&#34;, &#34;UltraSSD_LRS&#34;`) The type of the data disk.
 *   * `size_gb` - (Required) The size of the data disk in GB, Required if dataDisks is specified.
 *   * `zone` - (Optional, Enum `&#34;1&#34;, &#34;2&#34;, &#34;3&#34;`) The Availability Zone in which the data disk will be created. If not defined, the data disk will be created regionally.
 *   * `lun` - (Optional, Default `&#34;orginal&#34;`) The LUN of the data disk. If not defined, the LUN will be set in order.
 * 
 * &lt;a id=&#34;detach_data_disk&#34;&gt;&lt;/a&gt;
 * ## Detach Data Disk
 * 
 * * `detach_data_disk` - (Optional) Detach a data disk from a stateful node.
 *   * `data_disk_name` - (Required) The name of the detached data disk.
 *   * `data_disk_resource_group_name` - (Required) The resource group name in which the data disk exists.
 *   * `should_deallocate` - (Required) Indicates whether to delete the data disk in addition to detach.
 *   * `ttl_in_hours` - (Required, Default `&#34;0&#34;`) Hours to keep the disk alive before deletion.
 * 
 * &lt;a id=&#34;update_state&#34;&gt;&lt;/a&gt;
 * ## Update State
 * 
 * * `update_state` - (Optional) Update the stateful node state.
 *   * `state` - (Required, Enum `&#34;pause&#34;, &#34;resume&#34;, &#34;recycle&#34;`) New state for the stateful node.
 * 
 * &lt;a id=&#34;import_vm&#34;&gt;&lt;/a&gt;
 * ## Import VM
 * 
 * * `import_vm` - (Optional) Import an Azure VM and create a stateful node by providing a node configuration.
 *   * `resource_group_name` - (Required) Name of the Resource Group for Stateful Node.
 *   * `original_vm_name` - (Required) Azure Import Stateful Node Name.
 *   * `draining_timeout` - (Optional) Hours to keep resources alive.
 *   * `resources_retention_time` - (Optional) Hours to keep resources alive.
 * 
 */
@ResourceType(type="spotinst:index/statefulNodeAzure:StatefulNodeAzure")
public class StatefulNodeAzure extends com.pulumi.resources.CustomResource {
    @Export(name="attachDataDisks", type=List.class, parameters={StatefulNodeAzureAttachDataDisk.class})
    private Output</* @Nullable */ List<StatefulNodeAzureAttachDataDisk>> attachDataDisks;

    public Output<Optional<List<StatefulNodeAzureAttachDataDisk>>> attachDataDisks() {
        return Codegen.optional(this.attachDataDisks);
    }
    @Export(name="bootDiagnostics", type=List.class, parameters={StatefulNodeAzureBootDiagnostic.class})
    private Output<List<StatefulNodeAzureBootDiagnostic>> bootDiagnostics;

    public Output<List<StatefulNodeAzureBootDiagnostic>> bootDiagnostics() {
        return this.bootDiagnostics;
    }
    @Export(name="customData", type=String.class, parameters={})
    private Output<String> customData;

    public Output<String> customData() {
        return this.customData;
    }
    @Export(name="dataDisks", type=List.class, parameters={StatefulNodeAzureDataDisk.class})
    private Output<List<StatefulNodeAzureDataDisk>> dataDisks;

    public Output<List<StatefulNodeAzureDataDisk>> dataDisks() {
        return this.dataDisks;
    }
    @Export(name="dataDisksPersistenceMode", type=String.class, parameters={})
    private Output<String> dataDisksPersistenceMode;

    public Output<String> dataDisksPersistenceMode() {
        return this.dataDisksPersistenceMode;
    }
    @Export(name="deletes", type=List.class, parameters={StatefulNodeAzureDelete.class})
    private Output</* @Nullable */ List<StatefulNodeAzureDelete>> deletes;

    public Output<Optional<List<StatefulNodeAzureDelete>>> deletes() {
        return Codegen.optional(this.deletes);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    @Export(name="detachDataDisks", type=List.class, parameters={StatefulNodeAzureDetachDataDisk.class})
    private Output</* @Nullable */ List<StatefulNodeAzureDetachDataDisk>> detachDataDisks;

    public Output<Optional<List<StatefulNodeAzureDetachDataDisk>>> detachDataDisks() {
        return Codegen.optional(this.detachDataDisks);
    }
    @Export(name="extensions", type=List.class, parameters={StatefulNodeAzureExtension.class})
    private Output<List<StatefulNodeAzureExtension>> extensions;

    public Output<List<StatefulNodeAzureExtension>> extensions() {
        return this.extensions;
    }
    @Export(name="health", type=StatefulNodeAzureHealth.class, parameters={})
    private Output<StatefulNodeAzureHealth> health;

    public Output<StatefulNodeAzureHealth> health() {
        return this.health;
    }
    @Export(name="image", type=StatefulNodeAzureImage.class, parameters={})
    private Output<StatefulNodeAzureImage> image;

    public Output<StatefulNodeAzureImage> image() {
        return this.image;
    }
    @Export(name="importVms", type=List.class, parameters={StatefulNodeAzureImportVm.class})
    private Output</* @Nullable */ List<StatefulNodeAzureImportVm>> importVms;

    public Output<Optional<List<StatefulNodeAzureImportVm>>> importVms() {
        return Codegen.optional(this.importVms);
    }
    @Export(name="loadBalancers", type=List.class, parameters={StatefulNodeAzureLoadBalancer.class})
    private Output<List<StatefulNodeAzureLoadBalancer>> loadBalancers;

    public Output<List<StatefulNodeAzureLoadBalancer>> loadBalancers() {
        return this.loadBalancers;
    }
    @Export(name="login", type=StatefulNodeAzureLogin.class, parameters={})
    private Output<StatefulNodeAzureLogin> login;

    public Output<StatefulNodeAzureLogin> login() {
        return this.login;
    }
    @Export(name="managedServiceIdentities", type=List.class, parameters={StatefulNodeAzureManagedServiceIdentity.class})
    private Output<List<StatefulNodeAzureManagedServiceIdentity>> managedServiceIdentities;

    public Output<List<StatefulNodeAzureManagedServiceIdentity>> managedServiceIdentities() {
        return this.managedServiceIdentities;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="network", type=StatefulNodeAzureNetwork.class, parameters={})
    private Output<StatefulNodeAzureNetwork> network;

    public Output<StatefulNodeAzureNetwork> network() {
        return this.network;
    }
    @Export(name="odSizes", type=List.class, parameters={String.class})
    private Output<List<String>> odSizes;

    public Output<List<String>> odSizes() {
        return this.odSizes;
    }
    @Export(name="os", type=String.class, parameters={})
    private Output<String> os;

    public Output<String> os() {
        return this.os;
    }
    @Export(name="osDisk", type=StatefulNodeAzureOsDisk.class, parameters={})
    private Output<StatefulNodeAzureOsDisk> osDisk;

    public Output<StatefulNodeAzureOsDisk> osDisk() {
        return this.osDisk;
    }
    @Export(name="osDiskPersistenceMode", type=String.class, parameters={})
    private Output<String> osDiskPersistenceMode;

    public Output<String> osDiskPersistenceMode() {
        return this.osDiskPersistenceMode;
    }
    @Export(name="preferredSpotSizes", type=List.class, parameters={String.class})
    private Output<List<String>> preferredSpotSizes;

    public Output<List<String>> preferredSpotSizes() {
        return this.preferredSpotSizes;
    }
    @Export(name="preferredZones", type=String.class, parameters={})
    private Output<String> preferredZones;

    public Output<String> preferredZones() {
        return this.preferredZones;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    @Export(name="schedulingTasks", type=List.class, parameters={StatefulNodeAzureSchedulingTask.class})
    private Output<List<StatefulNodeAzureSchedulingTask>> schedulingTasks;

    public Output<List<StatefulNodeAzureSchedulingTask>> schedulingTasks() {
        return this.schedulingTasks;
    }
    @Export(name="secrets", type=List.class, parameters={StatefulNodeAzureSecret.class})
    private Output<List<StatefulNodeAzureSecret>> secrets;

    public Output<List<StatefulNodeAzureSecret>> secrets() {
        return this.secrets;
    }
    @Export(name="shouldPersistDataDisks", type=Boolean.class, parameters={})
    private Output<Boolean> shouldPersistDataDisks;

    public Output<Boolean> shouldPersistDataDisks() {
        return this.shouldPersistDataDisks;
    }
    @Export(name="shouldPersistNetwork", type=Boolean.class, parameters={})
    private Output<Boolean> shouldPersistNetwork;

    public Output<Boolean> shouldPersistNetwork() {
        return this.shouldPersistNetwork;
    }
    @Export(name="shouldPersistOsDisk", type=Boolean.class, parameters={})
    private Output<Boolean> shouldPersistOsDisk;

    public Output<Boolean> shouldPersistOsDisk() {
        return this.shouldPersistOsDisk;
    }
    @Export(name="shouldPersistVm", type=Boolean.class, parameters={})
    private Output<Boolean> shouldPersistVm;

    public Output<Boolean> shouldPersistVm() {
        return this.shouldPersistVm;
    }
    @Export(name="shutdownScript", type=String.class, parameters={})
    private Output<String> shutdownScript;

    public Output<String> shutdownScript() {
        return this.shutdownScript;
    }
    @Export(name="signals", type=List.class, parameters={StatefulNodeAzureSignal.class})
    private Output<List<StatefulNodeAzureSignal>> signals;

    public Output<List<StatefulNodeAzureSignal>> signals() {
        return this.signals;
    }
    @Export(name="spotSizes", type=List.class, parameters={String.class})
    private Output<List<String>> spotSizes;

    public Output<List<String>> spotSizes() {
        return this.spotSizes;
    }
    @Export(name="strategy", type=StatefulNodeAzureStrategy.class, parameters={})
    private Output<StatefulNodeAzureStrategy> strategy;

    public Output<StatefulNodeAzureStrategy> strategy() {
        return this.strategy;
    }
    @Export(name="tags", type=List.class, parameters={StatefulNodeAzureTag.class})
    private Output<List<StatefulNodeAzureTag>> tags;

    public Output<List<StatefulNodeAzureTag>> tags() {
        return this.tags;
    }
    @Export(name="updateStates", type=List.class, parameters={StatefulNodeAzureUpdateState.class})
    private Output</* @Nullable */ List<StatefulNodeAzureUpdateState>> updateStates;

    public Output<Optional<List<StatefulNodeAzureUpdateState>>> updateStates() {
        return Codegen.optional(this.updateStates);
    }
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StatefulNodeAzure(String name) {
        this(name, StatefulNodeAzureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StatefulNodeAzure(String name, StatefulNodeAzureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StatefulNodeAzure(String name, StatefulNodeAzureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/statefulNodeAzure:StatefulNodeAzure", name, args == null ? StatefulNodeAzureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StatefulNodeAzure(String name, Output<String> id, @Nullable StatefulNodeAzureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("spotinst:index/statefulNodeAzure:StatefulNodeAzure", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StatefulNodeAzure get(String name, Output<String> id, @Nullable StatefulNodeAzureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StatefulNodeAzure(name, id, state, options);
    }
}
