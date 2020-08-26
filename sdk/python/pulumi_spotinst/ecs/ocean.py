# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Ocean']


class Ocean(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 associate_public_ip_address: Optional[pulumi.Input[bool]] = None,
                 autoscaler: Optional[pulumi.Input[pulumi.InputType['OceanAutoscalerArgs']]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[float]] = None,
                 draining_timeout: Optional[pulumi.Input[float]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 iam_instance_profile: Optional[pulumi.Input[str]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 key_pair: Optional[pulumi.Input[str]] = None,
                 max_size: Optional[pulumi.Input[float]] = None,
                 min_size: Optional[pulumi.Input[float]] = None,
                 monitoring: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanScheduledTaskArgs']]]]] = None,
                 security_group_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 subnet_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanTagArgs']]]]] = None,
                 update_policy: Optional[pulumi.Input[pulumi.InputType['OceanUpdatePolicyArgs']]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 utilize_reserved_instances: Optional[pulumi.Input[bool]] = None,
                 whitelists: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst Ocean ECS resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.ecs.Ocean("example",
            associate_public_ip_address=False,
            cluster_name="terraform-ecs-cluster",
            desired_capacity=0,
            draining_timeout=120,
            ebs_optimized=True,
            iam_instance_profile="iam-profile",
            image_id="ami-12345",
            key_pair="KeyPair",
            max_size=1,
            min_size=0,
            monitoring=True,
            region="us-west-2",
            security_group_ids=["sg-12345"],
            subnet_ids=["subnet-12345"],
            tags=[spotinst.ecs.OceanTagArgs(
                key="fakeKey",
                value="fakeValue",
            )],
            user_data="echo hello world",
            utilize_reserved_instances=False,
            whitelists=["t3.medium"])
        ```
        ## Auto Scaler

        * `autoscaler` - (Optional) Describes the Ocean ECS autoscaler.
            * `is_enabled` - (Optional, Default: `true`) Enable the Ocean ECS autoscaler.
            * `is_auto_config` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
            * `cooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
            * `headroom` - (Optional) Spare resource capacity management enabling fast assignment of tasks without waiting for new resources to launch.
                * `cpu_per_unit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
                * `memory_per_unit` - (Optional) Optionally configure the amount of memory (MB) to allocate the headroom.
                * `num_of_units` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
            * `down` - (Optional) Auto Scaling scale down operations.
                * `max_scale_down_percentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100
            * `resource_limits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
                * `max_vcpu` - (Optional) The maximum cpu in vCPU units that can be allocated to the cluster.
                * `max_memory_gib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.

        ```python
        import pulumi
        ```

        <a id="update-policy"></a>
        ## Update Policy

        * `update_policy` - (Optional) While used, you can control whether the group should perform a deployment after an update to the configuration.
            * `should_roll` - (Required) Enables the roll.
            * `roll_config` - (Required)
                * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.

        ```python
        import pulumi
        ```

        <a id="scheduled-task"></a>
        ## scheduled task

        * `scheduled_task` - (Optional) While used, you can control whether the group should perform a deployment after an update to the configuration.
            * `shutdown_hours` - (Optional) Set shutdown hours for cluster object.
                * `is_enabled` - (Optional)  Flag to enable / disable the shutdown hours.
                                             Example: True
                * `time_windows` - (Required) Set time windows for shutdown hours. specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
                                              Example: Fri:15:30-Wed:14:30
            * `tasks` - (Optional) The scheduling tasks for the cluster.
                * `is_enabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
                * `cron_expression` - (Required) A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
                                                 Example: 0 1 * * *.
                * `task_type` - (Required) Valid values: "clusterRoll". Required for cluster.scheduling.tasks object
                                           Example: clusterRoll.

        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[str] cluster_name: The ocean cluster name.
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[str] iam_instance_profile: The instance profile iam role.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[str] key_pair: The key pair to attach the instances.
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[bool] monitoring: Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        :param pulumi.Input[str] name: The Ocean cluster name.
        :param pulumi.Input[str] region: The region the cluster will run in.
        :param pulumi.Input[List[pulumi.Input[str]]] security_group_ids: One or more security group ids.
        :param pulumi.Input[List[pulumi.Input[str]]] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanTagArgs']]]] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, OCean will utilize them before launching Spot instances.
        :param pulumi.Input[List[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
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

            __props__['associate_public_ip_address'] = associate_public_ip_address
            __props__['autoscaler'] = autoscaler
            if cluster_name is None:
                raise TypeError("Missing required property 'cluster_name'")
            __props__['cluster_name'] = cluster_name
            __props__['desired_capacity'] = desired_capacity
            __props__['draining_timeout'] = draining_timeout
            __props__['ebs_optimized'] = ebs_optimized
            __props__['iam_instance_profile'] = iam_instance_profile
            __props__['image_id'] = image_id
            __props__['key_pair'] = key_pair
            __props__['max_size'] = max_size
            __props__['min_size'] = min_size
            __props__['monitoring'] = monitoring
            __props__['name'] = name
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['scheduled_tasks'] = scheduled_tasks
            if security_group_ids is None:
                raise TypeError("Missing required property 'security_group_ids'")
            __props__['security_group_ids'] = security_group_ids
            if subnet_ids is None:
                raise TypeError("Missing required property 'subnet_ids'")
            __props__['subnet_ids'] = subnet_ids
            __props__['tags'] = tags
            __props__['update_policy'] = update_policy
            __props__['user_data'] = user_data
            __props__['utilize_reserved_instances'] = utilize_reserved_instances
            __props__['whitelists'] = whitelists
        super(Ocean, __self__).__init__(
            'spotinst:ecs/ocean:Ocean',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            associate_public_ip_address: Optional[pulumi.Input[bool]] = None,
            autoscaler: Optional[pulumi.Input[pulumi.InputType['OceanAutoscalerArgs']]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[float]] = None,
            draining_timeout: Optional[pulumi.Input[float]] = None,
            ebs_optimized: Optional[pulumi.Input[bool]] = None,
            iam_instance_profile: Optional[pulumi.Input[str]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            key_pair: Optional[pulumi.Input[str]] = None,
            max_size: Optional[pulumi.Input[float]] = None,
            min_size: Optional[pulumi.Input[float]] = None,
            monitoring: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            scheduled_tasks: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanScheduledTaskArgs']]]]] = None,
            security_group_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            subnet_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanTagArgs']]]]] = None,
            update_policy: Optional[pulumi.Input[pulumi.InputType['OceanUpdatePolicyArgs']]] = None,
            user_data: Optional[pulumi.Input[str]] = None,
            utilize_reserved_instances: Optional[pulumi.Input[bool]] = None,
            whitelists: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None) -> 'Ocean':
        """
        Get an existing Ocean resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[str] cluster_name: The ocean cluster name.
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[str] iam_instance_profile: The instance profile iam role.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[str] key_pair: The key pair to attach the instances.
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[bool] monitoring: Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        :param pulumi.Input[str] name: The Ocean cluster name.
        :param pulumi.Input[str] region: The region the cluster will run in.
        :param pulumi.Input[List[pulumi.Input[str]]] security_group_ids: One or more security group ids.
        :param pulumi.Input[List[pulumi.Input[str]]] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanTagArgs']]]] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, OCean will utilize them before launching Spot instances.
        :param pulumi.Input[List[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["associate_public_ip_address"] = associate_public_ip_address
        __props__["autoscaler"] = autoscaler
        __props__["cluster_name"] = cluster_name
        __props__["desired_capacity"] = desired_capacity
        __props__["draining_timeout"] = draining_timeout
        __props__["ebs_optimized"] = ebs_optimized
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["key_pair"] = key_pair
        __props__["max_size"] = max_size
        __props__["min_size"] = min_size
        __props__["monitoring"] = monitoring
        __props__["name"] = name
        __props__["region"] = region
        __props__["scheduled_tasks"] = scheduled_tasks
        __props__["security_group_ids"] = security_group_ids
        __props__["subnet_ids"] = subnet_ids
        __props__["tags"] = tags
        __props__["update_policy"] = update_policy
        __props__["user_data"] = user_data
        __props__["utilize_reserved_instances"] = utilize_reserved_instances
        __props__["whitelists"] = whitelists
        return Ocean(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associatePublicIpAddress")
    def associate_public_ip_address(self) -> Optional[bool]:
        """
        Configure public IP address allocation.
        """
        return pulumi.get(self, "associate_public_ip_address")

    @property
    @pulumi.getter
    def autoscaler(self) -> Optional['outputs.OceanAutoscaler']:
        return pulumi.get(self, "autoscaler")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        """
        The ocean cluster name.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> float:
        """
        The number of instances to launch and maintain in the cluster.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> Optional[float]:
        """
        The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        """
        return pulumi.get(self, "draining_timeout")

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> Optional[bool]:
        """
        Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        """
        return pulumi.get(self, "ebs_optimized")

    @property
    @pulumi.getter(name="iamInstanceProfile")
    def iam_instance_profile(self) -> Optional[str]:
        """
        The instance profile iam role.
        """
        return pulumi.get(self, "iam_instance_profile")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> Optional[str]:
        """
        ID of the image used to launch the instances.
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="keyPair")
    def key_pair(self) -> Optional[str]:
        """
        The key pair to attach the instances.
        """
        return pulumi.get(self, "key_pair")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> float:
        """
        The upper limit of instances the cluster can scale up to.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> float:
        """
        The lower limit of instances the cluster can scale down to.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def monitoring(self) -> Optional[bool]:
        """
        Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        """
        return pulumi.get(self, "monitoring")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Ocean cluster name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region the cluster will run in.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> Optional[List['outputs.OceanScheduledTask']]:
        return pulumi.get(self, "scheduled_tasks")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> List[str]:
        """
        One or more security group ids.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> List[str]:
        """
        A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> Optional[List['outputs.OceanTag']]:
        """
        Optionally adds tags to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatePolicy")
    def update_policy(self) -> Optional['outputs.OceanUpdatePolicy']:
        return pulumi.get(self, "update_policy")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> Optional[str]:
        """
        Base64-encoded MIME user data to make available to the instances.
        """
        return pulumi.get(self, "user_data")

    @property
    @pulumi.getter(name="utilizeReservedInstances")
    def utilize_reserved_instances(self) -> Optional[bool]:
        """
        If Reserved instances exist, OCean will utilize them before launching Spot instances.
        """
        return pulumi.get(self, "utilize_reserved_instances")

    @property
    @pulumi.getter
    def whitelists(self) -> Optional[List[str]]:
        """
        Instance types allowed in the Ocean cluster, Cannot be configured if blacklist is configured.
        """
        return pulumi.get(self, "whitelists")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

