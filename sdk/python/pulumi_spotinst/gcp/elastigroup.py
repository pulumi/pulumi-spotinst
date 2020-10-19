# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Elastigroup']


class Elastigroup(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_healing: Optional[pulumi.Input[bool]] = None,
                 availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backend_services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupBackendServiceArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupDiskArgs']]]]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 fallback_to_ondemand: Optional[pulumi.Input[bool]] = None,
                 gpu: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupGpuArgs']]]]] = None,
                 health_check_grace_period: Optional[pulumi.Input[int]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 instance_types_customs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupInstanceTypesCustomArgs']]]]] = None,
                 instance_types_ondemand: Optional[pulumi.Input[str]] = None,
                 instance_types_preemptibles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 integration_docker_swarm: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationDockerSwarmArgs']]] = None,
                 integration_gke: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationGkeArgs']]] = None,
                 ip_forwarding: Optional[pulumi.Input[bool]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLabelArgs']]]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupMetadataArgs']]]]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupNetworkInterfaceArgs']]]]] = None,
                 ondemand_count: Optional[pulumi.Input[int]] = None,
                 preemptible_percentage: Optional[pulumi.Input[int]] = None,
                 scaling_down_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingDownPolicyArgs']]]]] = None,
                 scaling_up_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingUpPolicyArgs']]]]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScheduledTaskArgs']]]]] = None,
                 service_account: Optional[pulumi.Input[str]] = None,
                 shutdown_script: Optional[pulumi.Input[str]] = None,
                 startup_script: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupSubnetArgs']]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 unhealthy_duration: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst elastigroup GCP resource.

        ## GPU

        * `gpu` - (Optional) Defines the GPU configuration.
            * `type` - (Required) The type of GPU instance. Valid values: `nvidia-tesla-v100`, `nvidia-tesla-p100`, `nvidia-tesla-k80`.
            * `count` - (Required) The number of GPUs. Must be 0, 2, 4, 6, 8.

        Usage:

        ```python
        import pulumi
        ```

        <a id="health-check"></a>
        ## Backend Services

        * `backend_services` - (Optional) Describes the backend service configurations.
            * `service_name` - (Required) The name of the backend service.
            * `location_type` - (Optional) Sets which location the backend services will be active. Valid values: `regional`, `global`.
            * `scheme` - (Optional) Use when `location_type` is "regional". Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
            * `named_port` - (Optional) Describes a named port and a list of ports.
                * `port_name` - (Required) The name of the port.
                * `ports` - (Required) A list of ports.

        Usage:

        ```python
        import pulumi
        ```

        <a id="disks"></a>
        ## Disks

        * `disks` - (Optional) Array of disks associated with this instance. Persistent disks must be created before you can assign them.
            * `auto_delete` - (Optional) Specifies whether the disk will be auto-deleted when the instance is deleted.
            * `boot` - (Optional) Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
            * `device_name` - (Optional) Specifies a unique device name of your choice.
            * `interface` - (Optional, Default: `SCSI`) Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
            * `mode` - (Optional, Default: `READ_WRITE`) The mode in which to attach this disk, either READ_WRITE or READ_ONLY.
            * `source` - (Optional) Specifies a valid partial or full URL to an existing Persistent Disk resource. This field is only applicable for persistent disks.
            * `type` - (Optional, Default: `PERSISTENT`) Specifies the type of disk, either SCRATCH or PERSISTENT.
            * `initialize_params` - (Optional) Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance.
                * `disk_size_gb` - (Optional) Specifies disk size in gigabytes. Must be in increments of 2.
                * `disk_type` - (Optional, Default" `pd-standard`) Specifies the disk type to use to create the instance. Valid values: pd-ssd, local-ssd.
                * `source_image` - (Optional) A source image used to create the disk. You can provide a private (custom) image, and Compute Engine will use the corresponding image from your project.

        Usage:

        ```python
        import pulumi
        ```

        <a id="network-interface"></a>
        ## Network Interfaces

        Each of the `network_interface` attributes controls a portion of the GCP
        Instance's "Network Interfaces". It's a good idea to familiarize yourself with [GCP's Network
        Interfaces docs](https://cloud.google.com/vpc/docs/multiple-interfaces-concepts)
        to understand the implications of using these attributes.

        * `network_interface` - (Required, minimum 1) Array of objects representing the network configuration for the elastigroup.
            * `network` - (Required) Network resource for this group.
            * `access_configs` - (Optional) Array of configurations.
                * `name` - (Optional) Name of this access configuration.
                * `type` - (Optional) Array of configurations for this interface. Currently, only ONE_TO_ONE_NAT is supported.

        ```python
        import pulumi
        ```

        <a id="scaling-policy"></a>
        ## Scaling Policies

        * `scaling_up_policy` - (Optional) Contains scaling policies for scaling the Elastigroup up.
        * `scaling_down_policy` - (Optional) Contains scaling policies for scaling the Elastigroup down.

        Each `scaling_*_policy` supports the following:

        * `policy_name` - (Optional) Name of scaling policy.
        * `metric_name` - (Optional) Metric to monitor. Valid values: "Percentage CPU", "Network In", "Network Out", "Disk Read Bytes", "Disk Write Bytes", "Disk Write Operations/Sec", "Disk Read Operations/Sec".
        * `statistic` - (Optional) Statistic by which to evaluate the selected metric. Valid values: "AVERAGE", "SAMPLE_COUNT", "SUM", "MINIMUM", "MAXIMUM", "PERCENTILE", "COUNT".
        * `threshold` - (Optional) The value at which the scaling action is triggered.
        * `period` - (Optional) Amount of time (seconds) for which the threshold must be met in order to trigger the scaling action.
        * `evaluation_periods` - (Optional) Number of consecutive periods in which the threshold must be met in order to trigger a scaling action.
        * `cooldown` - (Optional) Time (seconds) to wait after a scaling action before resuming monitoring.
        * `operator` - (Optional) The operator used to evaluate the threshold against the current metric value. Valid values: "gt" (greater than), "get" (greater-than or equal), "lt" (less than), "lte" (less than or equal).
        * `action` - (Optional) Scaling action to take when the policy is triggered.
            * `type` - (Optional) Type of scaling action to take when the scaling policy is triggered. Valid values: "adjustment", "setMinTarget", "updateCapacity", "percentageAdjustment"
            * `adjustment` - (Optional) Value to which the action type will be adjusted. Required if using "numeric" or "percentageAdjustment" action types.
        * `dimensions` - (Optional) A list of dimensions describing qualities of the metric.
            * `name` - (Required) The dimension name.
            * `value` - (Required) The dimension value.

        Usage:

        ```python
        import pulumi
        ```

        <a id="third-party-integrations"></a>
        ## Third-Party Integrations

        * `integration_docker_swarm` - (Optional) Describes the [Docker Swarm](https://api.spotinst.com/integration-docs/elastigroup/container-management/docker-swarm/docker-swarm-integration/) integration.
            * `master_host` - (Required) IP or FQDN of one of your swarm managers.
            * `master_port` - (Required) Network port used by your swarm.

        Usage:

        ```python
        import pulumi
        ```

        <a id="scheduled-task"></a>
        ## Scheduled Tasks

        Each `scheduled_task` supports the following:

        * `task_type` - (Required) The task type to run. Valid values: `"setCapacity"`.
        * `cron_expression` - (Optional) A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
        * `is_enabled` - (Optional, Default: `true`) Setting the task to being enabled or disabled.
        * `target_capacity` - (Optional) The desired number of instances the group should have.
        * `min_capacity` - (Optional) The minimum number of instances the group should have.
        * `max_capacity` - (Optional) The maximum number of instances the group should have.

        Usage:

        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: List of availability zones for the group.
        :param pulumi.Input[str] description: The region your GCP group will be created in.
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[int] draining_timeout: Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        :param pulumi.Input[bool] fallback_to_ondemand: Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupInstanceTypesCustomArgs']]]] instance_types_customs: Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        :param pulumi.Input[str] instance_types_ondemand: The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_preemptibles: The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLabelArgs']]]] labels: Array of objects with key-value pairs.
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupMetadataArgs']]]] metadatas: Array of objects with key-value pairs.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[int] preemptible_percentage: Percentage of Preemptible VMs to spin up from the "desired_capacity".
        :param pulumi.Input[str] service_account: The email of the service account in which the group instances will be launched.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        :param pulumi.Input[str] startup_script: Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupSubnetArgs']]]] subnets: A list of regions and subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to mark created instances.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['auto_healing'] = auto_healing
            if availability_zones is not None:
                warnings.warn("This field will soon be handled by Region in Subnets", DeprecationWarning)
                pulumi.log.warn("availability_zones is deprecated: This field will soon be handled by Region in Subnets")
            __props__['availability_zones'] = availability_zones
            __props__['backend_services'] = backend_services
            __props__['description'] = description
            if desired_capacity is None:
                raise TypeError("Missing required property 'desired_capacity'")
            __props__['desired_capacity'] = desired_capacity
            __props__['disks'] = disks
            __props__['draining_timeout'] = draining_timeout
            __props__['fallback_to_ondemand'] = fallback_to_ondemand
            __props__['gpu'] = gpu
            __props__['health_check_grace_period'] = health_check_grace_period
            __props__['health_check_type'] = health_check_type
            __props__['instance_types_customs'] = instance_types_customs
            __props__['instance_types_ondemand'] = instance_types_ondemand
            __props__['instance_types_preemptibles'] = instance_types_preemptibles
            __props__['integration_docker_swarm'] = integration_docker_swarm
            __props__['integration_gke'] = integration_gke
            __props__['ip_forwarding'] = ip_forwarding
            __props__['labels'] = labels
            __props__['max_size'] = max_size
            __props__['metadatas'] = metadatas
            __props__['min_size'] = min_size
            __props__['name'] = name
            __props__['network_interfaces'] = network_interfaces
            __props__['ondemand_count'] = ondemand_count
            __props__['preemptible_percentage'] = preemptible_percentage
            __props__['scaling_down_policies'] = scaling_down_policies
            __props__['scaling_up_policies'] = scaling_up_policies
            __props__['scheduled_tasks'] = scheduled_tasks
            __props__['service_account'] = service_account
            __props__['shutdown_script'] = shutdown_script
            __props__['startup_script'] = startup_script
            __props__['subnets'] = subnets
            __props__['tags'] = tags
            __props__['unhealthy_duration'] = unhealthy_duration
        super(Elastigroup, __self__).__init__(
            'spotinst:gcp/elastigroup:Elastigroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_healing: Optional[pulumi.Input[bool]] = None,
            availability_zones: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            backend_services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupBackendServiceArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[int]] = None,
            disks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupDiskArgs']]]]] = None,
            draining_timeout: Optional[pulumi.Input[int]] = None,
            fallback_to_ondemand: Optional[pulumi.Input[bool]] = None,
            gpu: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupGpuArgs']]]]] = None,
            health_check_grace_period: Optional[pulumi.Input[int]] = None,
            health_check_type: Optional[pulumi.Input[str]] = None,
            instance_types_customs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupInstanceTypesCustomArgs']]]]] = None,
            instance_types_ondemand: Optional[pulumi.Input[str]] = None,
            instance_types_preemptibles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            integration_docker_swarm: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationDockerSwarmArgs']]] = None,
            integration_gke: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationGkeArgs']]] = None,
            ip_forwarding: Optional[pulumi.Input[bool]] = None,
            labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLabelArgs']]]]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupMetadataArgs']]]]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network_interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupNetworkInterfaceArgs']]]]] = None,
            ondemand_count: Optional[pulumi.Input[int]] = None,
            preemptible_percentage: Optional[pulumi.Input[int]] = None,
            scaling_down_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingDownPolicyArgs']]]]] = None,
            scaling_up_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingUpPolicyArgs']]]]] = None,
            scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScheduledTaskArgs']]]]] = None,
            service_account: Optional[pulumi.Input[str]] = None,
            shutdown_script: Optional[pulumi.Input[str]] = None,
            startup_script: Optional[pulumi.Input[str]] = None,
            subnets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupSubnetArgs']]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            unhealthy_duration: Optional[pulumi.Input[int]] = None) -> 'Elastigroup':
        """
        Get an existing Elastigroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] availability_zones: List of availability zones for the group.
        :param pulumi.Input[str] description: The region your GCP group will be created in.
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[int] draining_timeout: Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        :param pulumi.Input[bool] fallback_to_ondemand: Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupInstanceTypesCustomArgs']]]] instance_types_customs: Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        :param pulumi.Input[str] instance_types_ondemand: The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_preemptibles: The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLabelArgs']]]] labels: Array of objects with key-value pairs.
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupMetadataArgs']]]] metadatas: Array of objects with key-value pairs.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[int] preemptible_percentage: Percentage of Preemptible VMs to spin up from the "desired_capacity".
        :param pulumi.Input[str] service_account: The email of the service account in which the group instances will be launched.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        :param pulumi.Input[str] startup_script: Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupSubnetArgs']]]] subnets: A list of regions and subnets.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to mark created instances.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_healing"] = auto_healing
        __props__["availability_zones"] = availability_zones
        __props__["backend_services"] = backend_services
        __props__["description"] = description
        __props__["desired_capacity"] = desired_capacity
        __props__["disks"] = disks
        __props__["draining_timeout"] = draining_timeout
        __props__["fallback_to_ondemand"] = fallback_to_ondemand
        __props__["gpu"] = gpu
        __props__["health_check_grace_period"] = health_check_grace_period
        __props__["health_check_type"] = health_check_type
        __props__["instance_types_customs"] = instance_types_customs
        __props__["instance_types_ondemand"] = instance_types_ondemand
        __props__["instance_types_preemptibles"] = instance_types_preemptibles
        __props__["integration_docker_swarm"] = integration_docker_swarm
        __props__["integration_gke"] = integration_gke
        __props__["ip_forwarding"] = ip_forwarding
        __props__["labels"] = labels
        __props__["max_size"] = max_size
        __props__["metadatas"] = metadatas
        __props__["min_size"] = min_size
        __props__["name"] = name
        __props__["network_interfaces"] = network_interfaces
        __props__["ondemand_count"] = ondemand_count
        __props__["preemptible_percentage"] = preemptible_percentage
        __props__["scaling_down_policies"] = scaling_down_policies
        __props__["scaling_up_policies"] = scaling_up_policies
        __props__["scheduled_tasks"] = scheduled_tasks
        __props__["service_account"] = service_account
        __props__["shutdown_script"] = shutdown_script
        __props__["startup_script"] = startup_script
        __props__["subnets"] = subnets
        __props__["tags"] = tags
        __props__["unhealthy_duration"] = unhealthy_duration
        return Elastigroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoHealing")
    def auto_healing(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "auto_healing")

    @property
    @pulumi.getter(name="availabilityZones")
    def availability_zones(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of availability zones for the group.
        """
        return pulumi.get(self, "availability_zones")

    @property
    @pulumi.getter(name="backendServices")
    def backend_services(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupBackendService']]]:
        return pulumi.get(self, "backend_services")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The region your GCP group will be created in.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[int]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter
    def disks(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupDisk']]]:
        return pulumi.get(self, "disks")

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        Time (seconds) the instance is allowed to run after it is detached from the group. This is to allow the instance time to drain all the current TCP connections before terminating it.
        """
        return pulumi.get(self, "draining_timeout")

    @property
    @pulumi.getter(name="fallbackToOndemand")
    def fallback_to_ondemand(self) -> pulumi.Output[Optional[bool]]:
        """
        Activate fallback-to-on-demand. When provisioning an instance, if no Preemptible market is available, fallback-to-on-demand will provision an On-Demand instance to maintain the group capacity.
        """
        return pulumi.get(self, "fallback_to_ondemand")

    @property
    @pulumi.getter
    def gpu(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupGpu']]]:
        return pulumi.get(self, "gpu")

    @property
    @pulumi.getter(name="healthCheckGracePeriod")
    def health_check_grace_period(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "health_check_grace_period")

    @property
    @pulumi.getter(name="healthCheckType")
    def health_check_type(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "health_check_type")

    @property
    @pulumi.getter(name="instanceTypesCustoms")
    def instance_types_customs(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupInstanceTypesCustom']]]:
        """
        Defines a set of custom instance types. Required if instance_types_preemptible and instance_types_ondemand are not set.
        """
        return pulumi.get(self, "instance_types_customs")

    @property
    @pulumi.getter(name="instanceTypesOndemand")
    def instance_types_ondemand(self) -> pulumi.Output[Optional[str]]:
        """
        The regular VM instance type to use for mixed-type groups and when falling back to on-demand. Required if instance_types_preemptible is not set.
        """
        return pulumi.get(self, "instance_types_ondemand")

    @property
    @pulumi.getter(name="instanceTypesPreemptibles")
    def instance_types_preemptibles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The preemptible VMs instance type. To maximize cost savings and market availability, select as many types as possible. Required if instance_types_ondemand is not set.
        """
        return pulumi.get(self, "instance_types_preemptibles")

    @property
    @pulumi.getter(name="integrationDockerSwarm")
    def integration_docker_swarm(self) -> pulumi.Output[Optional['outputs.ElastigroupIntegrationDockerSwarm']]:
        return pulumi.get(self, "integration_docker_swarm")

    @property
    @pulumi.getter(name="integrationGke")
    def integration_gke(self) -> pulumi.Output[Optional['outputs.ElastigroupIntegrationGke']]:
        return pulumi.get(self, "integration_gke")

    @property
    @pulumi.getter(name="ipForwarding")
    def ip_forwarding(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "ip_forwarding")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupLabel']]]:
        """
        Array of objects with key-value pairs.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[int]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter
    def metadatas(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupMetadata']]]:
        """
        Array of objects with key-value pairs.
        """
        return pulumi.get(self, "metadatas")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[int]:
        """
        The minimum number of instances the group should have at any time.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupNetworkInterface']]]:
        return pulumi.get(self, "network_interfaces")

    @property
    @pulumi.getter(name="ondemandCount")
    def ondemand_count(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "ondemand_count")

    @property
    @pulumi.getter(name="preemptiblePercentage")
    def preemptible_percentage(self) -> pulumi.Output[Optional[int]]:
        """
        Percentage of Preemptible VMs to spin up from the "desired_capacity".
        """
        return pulumi.get(self, "preemptible_percentage")

    @property
    @pulumi.getter(name="scalingDownPolicies")
    def scaling_down_policies(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScalingDownPolicy']]]:
        return pulumi.get(self, "scaling_down_policies")

    @property
    @pulumi.getter(name="scalingUpPolicies")
    def scaling_up_policies(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScalingUpPolicy']]]:
        return pulumi.get(self, "scaling_up_policies")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScheduledTask']]]:
        return pulumi.get(self, "scheduled_tasks")

    @property
    @pulumi.getter(name="serviceAccount")
    def service_account(self) -> pulumi.Output[Optional[str]]:
        """
        The email of the service account in which the group instances will be launched.
        """
        return pulumi.get(self, "service_account")

    @property
    @pulumi.getter(name="shutdownScript")
    def shutdown_script(self) -> pulumi.Output[Optional[str]]:
        """
        The Base64-encoded shutdown script that executes prior to instance termination, for more information please see: [Shutdown Script](https://api.spotinst.com/integration-docs/elastigroup/concepts/compute-concepts/shutdown-scripts/)
        """
        return pulumi.get(self, "shutdown_script")

    @property
    @pulumi.getter(name="startupScript")
    def startup_script(self) -> pulumi.Output[Optional[str]]:
        """
        Create and run your own startup scripts on your virtual machines to perform automated tasks every time your instance boots up.
        """
        return pulumi.get(self, "startup_script")

    @property
    @pulumi.getter
    def subnets(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupSubnet']]]:
        """
        A list of regions and subnets.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to mark created instances.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="unhealthyDuration")
    def unhealthy_duration(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "unhealthy_duration")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

