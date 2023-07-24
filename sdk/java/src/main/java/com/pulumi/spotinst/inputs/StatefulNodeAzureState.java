// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.inputs.StatefulNodeAzureAttachDataDiskArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureBootDiagnosticArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureDataDiskArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureDeleteArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureDetachDataDiskArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureExtensionArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureHealthArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureImageArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureImportVmArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureLoadBalancerArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureLoginArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureManagedServiceIdentityArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureNetworkArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureOsDiskArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureSchedulingTaskArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureSecretArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureSignalArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureStrategyArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureTagArgs;
import com.pulumi.spotinst.inputs.StatefulNodeAzureUpdateStateArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatefulNodeAzureState extends com.pulumi.resources.ResourceArgs {

    public static final StatefulNodeAzureState Empty = new StatefulNodeAzureState();

    @Import(name="attachDataDisks")
    private @Nullable Output<List<StatefulNodeAzureAttachDataDiskArgs>> attachDataDisks;

    public Optional<Output<List<StatefulNodeAzureAttachDataDiskArgs>>> attachDataDisks() {
        return Optional.ofNullable(this.attachDataDisks);
    }

    @Import(name="bootDiagnostics")
    private @Nullable Output<List<StatefulNodeAzureBootDiagnosticArgs>> bootDiagnostics;

    public Optional<Output<List<StatefulNodeAzureBootDiagnosticArgs>>> bootDiagnostics() {
        return Optional.ofNullable(this.bootDiagnostics);
    }

    @Import(name="customData")
    private @Nullable Output<String> customData;

    public Optional<Output<String>> customData() {
        return Optional.ofNullable(this.customData);
    }

    @Import(name="dataDisks")
    private @Nullable Output<List<StatefulNodeAzureDataDiskArgs>> dataDisks;

    public Optional<Output<List<StatefulNodeAzureDataDiskArgs>>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    @Import(name="dataDisksPersistenceMode")
    private @Nullable Output<String> dataDisksPersistenceMode;

    public Optional<Output<String>> dataDisksPersistenceMode() {
        return Optional.ofNullable(this.dataDisksPersistenceMode);
    }

    @Import(name="deletes")
    private @Nullable Output<List<StatefulNodeAzureDeleteArgs>> deletes;

    public Optional<Output<List<StatefulNodeAzureDeleteArgs>>> deletes() {
        return Optional.ofNullable(this.deletes);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="detachDataDisks")
    private @Nullable Output<List<StatefulNodeAzureDetachDataDiskArgs>> detachDataDisks;

    public Optional<Output<List<StatefulNodeAzureDetachDataDiskArgs>>> detachDataDisks() {
        return Optional.ofNullable(this.detachDataDisks);
    }

    @Import(name="extensions")
    private @Nullable Output<List<StatefulNodeAzureExtensionArgs>> extensions;

    public Optional<Output<List<StatefulNodeAzureExtensionArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    @Import(name="health")
    private @Nullable Output<StatefulNodeAzureHealthArgs> health;

    public Optional<Output<StatefulNodeAzureHealthArgs>> health() {
        return Optional.ofNullable(this.health);
    }

    @Import(name="image")
    private @Nullable Output<StatefulNodeAzureImageArgs> image;

    public Optional<Output<StatefulNodeAzureImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    @Import(name="importVms")
    private @Nullable Output<List<StatefulNodeAzureImportVmArgs>> importVms;

    public Optional<Output<List<StatefulNodeAzureImportVmArgs>>> importVms() {
        return Optional.ofNullable(this.importVms);
    }

    @Import(name="loadBalancers")
    private @Nullable Output<List<StatefulNodeAzureLoadBalancerArgs>> loadBalancers;

    public Optional<Output<List<StatefulNodeAzureLoadBalancerArgs>>> loadBalancers() {
        return Optional.ofNullable(this.loadBalancers);
    }

    @Import(name="login")
    private @Nullable Output<StatefulNodeAzureLoginArgs> login;

    public Optional<Output<StatefulNodeAzureLoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    @Import(name="managedServiceIdentities")
    private @Nullable Output<List<StatefulNodeAzureManagedServiceIdentityArgs>> managedServiceIdentities;

    public Optional<Output<List<StatefulNodeAzureManagedServiceIdentityArgs>>> managedServiceIdentities() {
        return Optional.ofNullable(this.managedServiceIdentities);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="network")
    private @Nullable Output<StatefulNodeAzureNetworkArgs> network;

    public Optional<Output<StatefulNodeAzureNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="odSizes")
    private @Nullable Output<List<String>> odSizes;

    public Optional<Output<List<String>>> odSizes() {
        return Optional.ofNullable(this.odSizes);
    }

    @Import(name="os")
    private @Nullable Output<String> os;

    public Optional<Output<String>> os() {
        return Optional.ofNullable(this.os);
    }

    @Import(name="osDisk")
    private @Nullable Output<StatefulNodeAzureOsDiskArgs> osDisk;

    public Optional<Output<StatefulNodeAzureOsDiskArgs>> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    @Import(name="osDiskPersistenceMode")
    private @Nullable Output<String> osDiskPersistenceMode;

    public Optional<Output<String>> osDiskPersistenceMode() {
        return Optional.ofNullable(this.osDiskPersistenceMode);
    }

    @Import(name="preferredSpotSizes")
    private @Nullable Output<List<String>> preferredSpotSizes;

    public Optional<Output<List<String>>> preferredSpotSizes() {
        return Optional.ofNullable(this.preferredSpotSizes);
    }

    @Import(name="preferredZones")
    private @Nullable Output<String> preferredZones;

    public Optional<Output<String>> preferredZones() {
        return Optional.ofNullable(this.preferredZones);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    @Import(name="schedulingTasks")
    private @Nullable Output<List<StatefulNodeAzureSchedulingTaskArgs>> schedulingTasks;

    public Optional<Output<List<StatefulNodeAzureSchedulingTaskArgs>>> schedulingTasks() {
        return Optional.ofNullable(this.schedulingTasks);
    }

    @Import(name="secrets")
    private @Nullable Output<List<StatefulNodeAzureSecretArgs>> secrets;

    public Optional<Output<List<StatefulNodeAzureSecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    @Import(name="shouldPersistDataDisks")
    private @Nullable Output<Boolean> shouldPersistDataDisks;

    public Optional<Output<Boolean>> shouldPersistDataDisks() {
        return Optional.ofNullable(this.shouldPersistDataDisks);
    }

    @Import(name="shouldPersistNetwork")
    private @Nullable Output<Boolean> shouldPersistNetwork;

    public Optional<Output<Boolean>> shouldPersistNetwork() {
        return Optional.ofNullable(this.shouldPersistNetwork);
    }

    @Import(name="shouldPersistOsDisk")
    private @Nullable Output<Boolean> shouldPersistOsDisk;

    public Optional<Output<Boolean>> shouldPersistOsDisk() {
        return Optional.ofNullable(this.shouldPersistOsDisk);
    }

    @Import(name="shouldPersistVm")
    private @Nullable Output<Boolean> shouldPersistVm;

    public Optional<Output<Boolean>> shouldPersistVm() {
        return Optional.ofNullable(this.shouldPersistVm);
    }

    @Import(name="shutdownScript")
    private @Nullable Output<String> shutdownScript;

    public Optional<Output<String>> shutdownScript() {
        return Optional.ofNullable(this.shutdownScript);
    }

    @Import(name="signals")
    private @Nullable Output<List<StatefulNodeAzureSignalArgs>> signals;

    public Optional<Output<List<StatefulNodeAzureSignalArgs>>> signals() {
        return Optional.ofNullable(this.signals);
    }

    @Import(name="spotSizes")
    private @Nullable Output<List<String>> spotSizes;

    public Optional<Output<List<String>>> spotSizes() {
        return Optional.ofNullable(this.spotSizes);
    }

    @Import(name="strategy")
    private @Nullable Output<StatefulNodeAzureStrategyArgs> strategy;

    public Optional<Output<StatefulNodeAzureStrategyArgs>> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    @Import(name="tags")
    private @Nullable Output<List<StatefulNodeAzureTagArgs>> tags;

    public Optional<Output<List<StatefulNodeAzureTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="updateStates")
    private @Nullable Output<List<StatefulNodeAzureUpdateStateArgs>> updateStates;

    public Optional<Output<List<StatefulNodeAzureUpdateStateArgs>>> updateStates() {
        return Optional.ofNullable(this.updateStates);
    }

    @Import(name="userData")
    private @Nullable Output<String> userData;

    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    @Import(name="vmName")
    private @Nullable Output<String> vmName;

    public Optional<Output<String>> vmName() {
        return Optional.ofNullable(this.vmName);
    }

    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private StatefulNodeAzureState() {}

    private StatefulNodeAzureState(StatefulNodeAzureState $) {
        this.attachDataDisks = $.attachDataDisks;
        this.bootDiagnostics = $.bootDiagnostics;
        this.customData = $.customData;
        this.dataDisks = $.dataDisks;
        this.dataDisksPersistenceMode = $.dataDisksPersistenceMode;
        this.deletes = $.deletes;
        this.description = $.description;
        this.detachDataDisks = $.detachDataDisks;
        this.extensions = $.extensions;
        this.health = $.health;
        this.image = $.image;
        this.importVms = $.importVms;
        this.loadBalancers = $.loadBalancers;
        this.login = $.login;
        this.managedServiceIdentities = $.managedServiceIdentities;
        this.name = $.name;
        this.network = $.network;
        this.odSizes = $.odSizes;
        this.os = $.os;
        this.osDisk = $.osDisk;
        this.osDiskPersistenceMode = $.osDiskPersistenceMode;
        this.preferredSpotSizes = $.preferredSpotSizes;
        this.preferredZones = $.preferredZones;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.schedulingTasks = $.schedulingTasks;
        this.secrets = $.secrets;
        this.shouldPersistDataDisks = $.shouldPersistDataDisks;
        this.shouldPersistNetwork = $.shouldPersistNetwork;
        this.shouldPersistOsDisk = $.shouldPersistOsDisk;
        this.shouldPersistVm = $.shouldPersistVm;
        this.shutdownScript = $.shutdownScript;
        this.signals = $.signals;
        this.spotSizes = $.spotSizes;
        this.strategy = $.strategy;
        this.tags = $.tags;
        this.updateStates = $.updateStates;
        this.userData = $.userData;
        this.vmName = $.vmName;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulNodeAzureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulNodeAzureState $;

        public Builder() {
            $ = new StatefulNodeAzureState();
        }

        public Builder(StatefulNodeAzureState defaults) {
            $ = new StatefulNodeAzureState(Objects.requireNonNull(defaults));
        }

        public Builder attachDataDisks(@Nullable Output<List<StatefulNodeAzureAttachDataDiskArgs>> attachDataDisks) {
            $.attachDataDisks = attachDataDisks;
            return this;
        }

        public Builder attachDataDisks(List<StatefulNodeAzureAttachDataDiskArgs> attachDataDisks) {
            return attachDataDisks(Output.of(attachDataDisks));
        }

        public Builder attachDataDisks(StatefulNodeAzureAttachDataDiskArgs... attachDataDisks) {
            return attachDataDisks(List.of(attachDataDisks));
        }

        public Builder bootDiagnostics(@Nullable Output<List<StatefulNodeAzureBootDiagnosticArgs>> bootDiagnostics) {
            $.bootDiagnostics = bootDiagnostics;
            return this;
        }

        public Builder bootDiagnostics(List<StatefulNodeAzureBootDiagnosticArgs> bootDiagnostics) {
            return bootDiagnostics(Output.of(bootDiagnostics));
        }

        public Builder bootDiagnostics(StatefulNodeAzureBootDiagnosticArgs... bootDiagnostics) {
            return bootDiagnostics(List.of(bootDiagnostics));
        }

        public Builder customData(@Nullable Output<String> customData) {
            $.customData = customData;
            return this;
        }

        public Builder customData(String customData) {
            return customData(Output.of(customData));
        }

        public Builder dataDisks(@Nullable Output<List<StatefulNodeAzureDataDiskArgs>> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(List<StatefulNodeAzureDataDiskArgs> dataDisks) {
            return dataDisks(Output.of(dataDisks));
        }

        public Builder dataDisks(StatefulNodeAzureDataDiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        public Builder dataDisksPersistenceMode(@Nullable Output<String> dataDisksPersistenceMode) {
            $.dataDisksPersistenceMode = dataDisksPersistenceMode;
            return this;
        }

        public Builder dataDisksPersistenceMode(String dataDisksPersistenceMode) {
            return dataDisksPersistenceMode(Output.of(dataDisksPersistenceMode));
        }

        public Builder deletes(@Nullable Output<List<StatefulNodeAzureDeleteArgs>> deletes) {
            $.deletes = deletes;
            return this;
        }

        public Builder deletes(List<StatefulNodeAzureDeleteArgs> deletes) {
            return deletes(Output.of(deletes));
        }

        public Builder deletes(StatefulNodeAzureDeleteArgs... deletes) {
            return deletes(List.of(deletes));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder detachDataDisks(@Nullable Output<List<StatefulNodeAzureDetachDataDiskArgs>> detachDataDisks) {
            $.detachDataDisks = detachDataDisks;
            return this;
        }

        public Builder detachDataDisks(List<StatefulNodeAzureDetachDataDiskArgs> detachDataDisks) {
            return detachDataDisks(Output.of(detachDataDisks));
        }

        public Builder detachDataDisks(StatefulNodeAzureDetachDataDiskArgs... detachDataDisks) {
            return detachDataDisks(List.of(detachDataDisks));
        }

        public Builder extensions(@Nullable Output<List<StatefulNodeAzureExtensionArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        public Builder extensions(List<StatefulNodeAzureExtensionArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        public Builder extensions(StatefulNodeAzureExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }

        public Builder health(@Nullable Output<StatefulNodeAzureHealthArgs> health) {
            $.health = health;
            return this;
        }

        public Builder health(StatefulNodeAzureHealthArgs health) {
            return health(Output.of(health));
        }

        public Builder image(@Nullable Output<StatefulNodeAzureImageArgs> image) {
            $.image = image;
            return this;
        }

        public Builder image(StatefulNodeAzureImageArgs image) {
            return image(Output.of(image));
        }

        public Builder importVms(@Nullable Output<List<StatefulNodeAzureImportVmArgs>> importVms) {
            $.importVms = importVms;
            return this;
        }

        public Builder importVms(List<StatefulNodeAzureImportVmArgs> importVms) {
            return importVms(Output.of(importVms));
        }

        public Builder importVms(StatefulNodeAzureImportVmArgs... importVms) {
            return importVms(List.of(importVms));
        }

        public Builder loadBalancers(@Nullable Output<List<StatefulNodeAzureLoadBalancerArgs>> loadBalancers) {
            $.loadBalancers = loadBalancers;
            return this;
        }

        public Builder loadBalancers(List<StatefulNodeAzureLoadBalancerArgs> loadBalancers) {
            return loadBalancers(Output.of(loadBalancers));
        }

        public Builder loadBalancers(StatefulNodeAzureLoadBalancerArgs... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }

        public Builder login(@Nullable Output<StatefulNodeAzureLoginArgs> login) {
            $.login = login;
            return this;
        }

        public Builder login(StatefulNodeAzureLoginArgs login) {
            return login(Output.of(login));
        }

        public Builder managedServiceIdentities(@Nullable Output<List<StatefulNodeAzureManagedServiceIdentityArgs>> managedServiceIdentities) {
            $.managedServiceIdentities = managedServiceIdentities;
            return this;
        }

        public Builder managedServiceIdentities(List<StatefulNodeAzureManagedServiceIdentityArgs> managedServiceIdentities) {
            return managedServiceIdentities(Output.of(managedServiceIdentities));
        }

        public Builder managedServiceIdentities(StatefulNodeAzureManagedServiceIdentityArgs... managedServiceIdentities) {
            return managedServiceIdentities(List.of(managedServiceIdentities));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder network(@Nullable Output<StatefulNodeAzureNetworkArgs> network) {
            $.network = network;
            return this;
        }

        public Builder network(StatefulNodeAzureNetworkArgs network) {
            return network(Output.of(network));
        }

        public Builder odSizes(@Nullable Output<List<String>> odSizes) {
            $.odSizes = odSizes;
            return this;
        }

        public Builder odSizes(List<String> odSizes) {
            return odSizes(Output.of(odSizes));
        }

        public Builder odSizes(String... odSizes) {
            return odSizes(List.of(odSizes));
        }

        public Builder os(@Nullable Output<String> os) {
            $.os = os;
            return this;
        }

        public Builder os(String os) {
            return os(Output.of(os));
        }

        public Builder osDisk(@Nullable Output<StatefulNodeAzureOsDiskArgs> osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        public Builder osDisk(StatefulNodeAzureOsDiskArgs osDisk) {
            return osDisk(Output.of(osDisk));
        }

        public Builder osDiskPersistenceMode(@Nullable Output<String> osDiskPersistenceMode) {
            $.osDiskPersistenceMode = osDiskPersistenceMode;
            return this;
        }

        public Builder osDiskPersistenceMode(String osDiskPersistenceMode) {
            return osDiskPersistenceMode(Output.of(osDiskPersistenceMode));
        }

        public Builder preferredSpotSizes(@Nullable Output<List<String>> preferredSpotSizes) {
            $.preferredSpotSizes = preferredSpotSizes;
            return this;
        }

        public Builder preferredSpotSizes(List<String> preferredSpotSizes) {
            return preferredSpotSizes(Output.of(preferredSpotSizes));
        }

        public Builder preferredSpotSizes(String... preferredSpotSizes) {
            return preferredSpotSizes(List.of(preferredSpotSizes));
        }

        public Builder preferredZones(@Nullable Output<String> preferredZones) {
            $.preferredZones = preferredZones;
            return this;
        }

        public Builder preferredZones(String preferredZones) {
            return preferredZones(Output.of(preferredZones));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder schedulingTasks(@Nullable Output<List<StatefulNodeAzureSchedulingTaskArgs>> schedulingTasks) {
            $.schedulingTasks = schedulingTasks;
            return this;
        }

        public Builder schedulingTasks(List<StatefulNodeAzureSchedulingTaskArgs> schedulingTasks) {
            return schedulingTasks(Output.of(schedulingTasks));
        }

        public Builder schedulingTasks(StatefulNodeAzureSchedulingTaskArgs... schedulingTasks) {
            return schedulingTasks(List.of(schedulingTasks));
        }

        public Builder secrets(@Nullable Output<List<StatefulNodeAzureSecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        public Builder secrets(List<StatefulNodeAzureSecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder secrets(StatefulNodeAzureSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        public Builder shouldPersistDataDisks(@Nullable Output<Boolean> shouldPersistDataDisks) {
            $.shouldPersistDataDisks = shouldPersistDataDisks;
            return this;
        }

        public Builder shouldPersistDataDisks(Boolean shouldPersistDataDisks) {
            return shouldPersistDataDisks(Output.of(shouldPersistDataDisks));
        }

        public Builder shouldPersistNetwork(@Nullable Output<Boolean> shouldPersistNetwork) {
            $.shouldPersistNetwork = shouldPersistNetwork;
            return this;
        }

        public Builder shouldPersistNetwork(Boolean shouldPersistNetwork) {
            return shouldPersistNetwork(Output.of(shouldPersistNetwork));
        }

        public Builder shouldPersistOsDisk(@Nullable Output<Boolean> shouldPersistOsDisk) {
            $.shouldPersistOsDisk = shouldPersistOsDisk;
            return this;
        }

        public Builder shouldPersistOsDisk(Boolean shouldPersistOsDisk) {
            return shouldPersistOsDisk(Output.of(shouldPersistOsDisk));
        }

        public Builder shouldPersistVm(@Nullable Output<Boolean> shouldPersistVm) {
            $.shouldPersistVm = shouldPersistVm;
            return this;
        }

        public Builder shouldPersistVm(Boolean shouldPersistVm) {
            return shouldPersistVm(Output.of(shouldPersistVm));
        }

        public Builder shutdownScript(@Nullable Output<String> shutdownScript) {
            $.shutdownScript = shutdownScript;
            return this;
        }

        public Builder shutdownScript(String shutdownScript) {
            return shutdownScript(Output.of(shutdownScript));
        }

        public Builder signals(@Nullable Output<List<StatefulNodeAzureSignalArgs>> signals) {
            $.signals = signals;
            return this;
        }

        public Builder signals(List<StatefulNodeAzureSignalArgs> signals) {
            return signals(Output.of(signals));
        }

        public Builder signals(StatefulNodeAzureSignalArgs... signals) {
            return signals(List.of(signals));
        }

        public Builder spotSizes(@Nullable Output<List<String>> spotSizes) {
            $.spotSizes = spotSizes;
            return this;
        }

        public Builder spotSizes(List<String> spotSizes) {
            return spotSizes(Output.of(spotSizes));
        }

        public Builder spotSizes(String... spotSizes) {
            return spotSizes(List.of(spotSizes));
        }

        public Builder strategy(@Nullable Output<StatefulNodeAzureStrategyArgs> strategy) {
            $.strategy = strategy;
            return this;
        }

        public Builder strategy(StatefulNodeAzureStrategyArgs strategy) {
            return strategy(Output.of(strategy));
        }

        public Builder tags(@Nullable Output<List<StatefulNodeAzureTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<StatefulNodeAzureTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(StatefulNodeAzureTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder updateStates(@Nullable Output<List<StatefulNodeAzureUpdateStateArgs>> updateStates) {
            $.updateStates = updateStates;
            return this;
        }

        public Builder updateStates(List<StatefulNodeAzureUpdateStateArgs> updateStates) {
            return updateStates(Output.of(updateStates));
        }

        public Builder updateStates(StatefulNodeAzureUpdateStateArgs... updateStates) {
            return updateStates(List.of(updateStates));
        }

        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        public Builder vmName(@Nullable Output<String> vmName) {
            $.vmName = vmName;
            return this;
        }

        public Builder vmName(String vmName) {
            return vmName(Output.of(vmName));
        }

        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public StatefulNodeAzureState build() {
            return $;
        }
    }

}
