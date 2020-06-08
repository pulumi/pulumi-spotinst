# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Ocean(pulumi.CustomResource):
    associate_public_ip_address: pulumi.Output[bool]
    """
    Configure public IP address allocation.
    """
    autoscaler: pulumi.Output[dict]
    blacklists: pulumi.Output[list]
    """
    Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
    """
    controller_id: pulumi.Output[str]
    """
    The ocean cluster identifier. Example: `ocean.k8s`
    """
    desired_capacity: pulumi.Output[float]
    """
    The number of instances to launch and maintain in the cluster.
    """
    draining_timeout: pulumi.Output[float]
    """
    The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
    """
    ebs_optimized: pulumi.Output[bool]
    """
    Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
    """
    fallback_to_ondemand: pulumi.Output[bool]
    """
    If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
    """
    grace_period: pulumi.Output[float]
    """
    The amount of time, in seconds, after the instance has launched to start checking its health.
    """
    iam_instance_profile: pulumi.Output[str]
    """
    The instance profile iam role.
    """
    image_id: pulumi.Output[str]
    """
    ID of the image used to launch the instances.
    """
    key_name: pulumi.Output[str]
    """
    The key pair to attach the instances.
    """
    load_balancers: pulumi.Output[list]
    """
    - Array of load balancer objects to add to ocean cluster

      * `arn` (`str`) - Required if type is set to TARGET_GROUP
      * `name` (`str`) - Required if type is set to CLASSIC
      * `type` (`str`) - Can be set to CLASSIC or TARGET_GROUP
    """
    max_size: pulumi.Output[float]
    """
    The upper limit of instances the cluster can scale up to.
    """
    min_size: pulumi.Output[float]
    """
    The lower limit of instances the cluster can scale down to.
    """
    monitoring: pulumi.Output[bool]
    """
    Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
    """
    name: pulumi.Output[str]
    """
    Required if type is set to CLASSIC
    """
    region: pulumi.Output[str]
    """
    The region the cluster will run in.
    """
    root_volume_size: pulumi.Output[float]
    """
    The size (in Gb) to allocate for the root volume. Minimum `20`.
    """
    scheduled_tasks: pulumi.Output[list]
    security_groups: pulumi.Output[list]
    """
    One or more security group ids.
    """
    spot_percentage: pulumi.Output[float]
    subnet_ids: pulumi.Output[list]
    """
    A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
    """
    tags: pulumi.Output[list]
    """
    Optionally adds tags to instances launched in an Ocean cluster.

      * `key` (`str`) - The tag key.
      * `value` (`str`) - The tag value.
    """
    update_policy: pulumi.Output[dict]
    user_data: pulumi.Output[str]
    """
    Base64-encoded MIME user data to make available to the instances.
    """
    utilize_reserved_instances: pulumi.Output[bool]
    """
    If Reserved instances exist, Ocean will utilize them before launching Spot instances.
    """
    whitelists: pulumi.Output[list]
    """
    Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
    """
    def __init__(__self__, resource_name, opts=None, associate_public_ip_address=None, autoscaler=None, blacklists=None, controller_id=None, desired_capacity=None, draining_timeout=None, ebs_optimized=None, fallback_to_ondemand=None, grace_period=None, iam_instance_profile=None, image_id=None, key_name=None, load_balancers=None, max_size=None, min_size=None, monitoring=None, name=None, region=None, root_volume_size=None, scheduled_tasks=None, security_groups=None, spot_percentage=None, subnet_ids=None, tags=None, update_policy=None, user_data=None, utilize_reserved_instances=None, whitelists=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Ocean AWS resource.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.aws.Ocean("example",
            associate_public_ip_address=True,
            controller_id="fakeClusterId",
            desired_capacity=2,
            draining_timeout=120,
            ebs_optimized=True,
            fallback_to_ondemand=True,
            grace_period=600,
            iam_instance_profile="iam-profile",
            image_id="ami-123456",
            key_name="fake key",
            load_balancers=[
                {
                    "arn": "arn:aws:elasticloadbalancing:us-west-2:fake-arn",
                    "type": "TARGET_GROUP",
                },
                {
                    "name": "AntonK",
                    "type": "CLASSIC",
                },
            ],
            max_size=2,
            min_size=1,
            monitoring=True,
            region="us-west-2",
            root_volume_size=20,
            security_groups=["sg-987654321"],
            subnet_ids=["subnet-123456789"],
            tags=[{
                "key": "fakeKey",
                "value": "fakeValue",
            }],
            user_data="echo hello world",
            utilize_reserved_instances=False,
            whitelists=[
                "t1.micro",
                "m1.small",
            ])
        ```

        ## Auto Scaler

        * `autoscaler` - (Optional) Describes the Ocean Kubernetes autoscaler.
        * `autoscale_is_enabled` - (Optional, Default: `true`) Enable the Ocean Kubernetes autoscaler.
        * `autoscale_is_auto_config` - (Optional, Default: `true`) Automatically configure and optimize headroom resources.
        * `autoscale_cooldown` - (Optional, Default: `null`) Cooldown period between scaling actions.
        * `auto_headroom_percentage` - (Optional) Set the auto headroom percentage (a number in the range [0, 200]) which controls the percentage of headroom from the cluster. Relevant only when `isAutoConfig` toggled on.
        * `autoscale_headroom` - (Optional) Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
        * `cpu_per_unit` - (Optional) Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        * `gpu_per_unit` - (Optional) Optionally configure the number of GPUS to allocate the headroom.
        * `memory_per_unit` - (Optional) Optionally configure the amount of memory (MB) to allocate the headroom.
        * `num_of_units` - (Optional) The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        * `autoscale_down` - (Optional) Auto Scaling scale down operations.
        * `max_scale_down_percentage` - (Optional) Would represent the maximum % to scale-down. Number between 1-100.
        * `resource_limits` - (Optional) Optionally set upper and lower bounds on the resource usage of the cluster.
        * `max_vcpu` - (Optional) The maximum cpu in vCPU units that can be allocated to the cluster.
        * `max_memory_gib` - (Optional) The maximum memory in GiB units that can be allocated to the cluster.

        ```python
        import pulumi
        ```

        <a id="update-policy"></a>
        ## Update Policy

        * `update_policy` - (Optional)
            * `should_roll` - (Required) Enables the roll.
            * `roll_config` - (Required) While used, you can control whether the group should perform a deployment after an update to the configuration.
                * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.

        ```python
        import pulumi
        ```

        <a id="scheduled-task"></a>
        ## scheduled task

        * `scheduled_task` - (Optional) Set scheduling object.
            * `shutdown_hours` - (Optional) Set shutdown hours for cluster object.
                * `is_enabled` - (Optional)  Flag to enable / disable the shutdown hours.
                                             Example: True
                * `time_windows` - (Required) Set time windows for shutdown hours. specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59. Time windows should not overlap. required on cluster.scheduling.isEnabled = True. API Times are in UTC
                                              Example: Fri:15:30-Wed:14:30
            * `tasks` - (Optional) The scheduling tasks for the cluster.
                * `is_enabled` - (Required)  Describes whether the task is enabled. When true the task should run when false it should not run. Required for cluster.scheduling.tasks object.
                * `cron_expression` - (Required) A valid cron expression. For example : " * * * * * ".The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time. Required for cluster.scheduling.tasks object
                                                 Example: 0 1 * * *
                * `task_type` - (Required) Valid values: "clusterRoll". Required for cluster.scheduling.tasks object
                                           Example: clusterRoll
                     
        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[list] blacklists: Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        :param pulumi.Input[str] controller_id: The ocean cluster identifier. Example: `ocean.k8s`
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[bool] fallback_to_ondemand: If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        :param pulumi.Input[float] grace_period: The amount of time, in seconds, after the instance has launched to start checking its health.
        :param pulumi.Input[str] iam_instance_profile: The instance profile iam role.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[str] key_name: The key pair to attach the instances.
        :param pulumi.Input[list] load_balancers: - Array of load balancer objects to add to ocean cluster
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[bool] monitoring: Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        :param pulumi.Input[str] name: Required if type is set to CLASSIC
        :param pulumi.Input[str] region: The region the cluster will run in.
        :param pulumi.Input[float] root_volume_size: The size (in Gb) to allocate for the root volume. Minimum `20`.
        :param pulumi.Input[list] security_groups: One or more security group ids.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[list] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, Ocean will utilize them before launching Spot instances.
        :param pulumi.Input[list] whitelists: Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.

        The **autoscaler** object supports the following:

          * `autoHeadroomPercentage` (`pulumi.Input[float]`)
          * `autoscaleCooldown` (`pulumi.Input[float]`)
          * `autoscaleDown` (`pulumi.Input[dict]`)
            * `evaluationPeriods` (`pulumi.Input[float]`)
            * `maxScaleDownPercentage` (`pulumi.Input[float]`)

          * `autoscaleHeadroom` (`pulumi.Input[dict]`)
            * `cpuPerUnit` (`pulumi.Input[float]`)
            * `gpuPerUnit` (`pulumi.Input[float]`)
            * `memoryPerUnit` (`pulumi.Input[float]`)
            * `numOfUnits` (`pulumi.Input[float]`)

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`)
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`)
          * `resource_limits` (`pulumi.Input[dict]`)
            * `maxMemoryGib` (`pulumi.Input[float]`)
            * `maxVcpu` (`pulumi.Input[float]`)

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`) - Required if type is set to TARGET_GROUP
          * `name` (`pulumi.Input[str]`) - Required if type is set to CLASSIC
          * `type` (`pulumi.Input[str]`) - Can be set to CLASSIC or TARGET_GROUP

        The **scheduled_tasks** object supports the following:

          * `shutdownHours` (`pulumi.Input[dict]`)
            * `isEnabled` (`pulumi.Input[bool]`)
            * `timeWindows` (`pulumi.Input[list]`)

          * `tasks` (`pulumi.Input[list]`)
            * `cronExpression` (`pulumi.Input[str]`)
            * `isEnabled` (`pulumi.Input[bool]`)
            * `taskType` (`pulumi.Input[str]`)

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **update_policy** object supports the following:

          * `rollConfig` (`pulumi.Input[dict]`)
            * `batchSizePercentage` (`pulumi.Input[float]`)

          * `shouldRoll` (`pulumi.Input[bool]`)
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['associate_public_ip_address'] = associate_public_ip_address
            __props__['autoscaler'] = autoscaler
            __props__['blacklists'] = blacklists
            __props__['controller_id'] = controller_id
            __props__['desired_capacity'] = desired_capacity
            __props__['draining_timeout'] = draining_timeout
            __props__['ebs_optimized'] = ebs_optimized
            __props__['fallback_to_ondemand'] = fallback_to_ondemand
            __props__['grace_period'] = grace_period
            __props__['iam_instance_profile'] = iam_instance_profile
            __props__['image_id'] = image_id
            __props__['key_name'] = key_name
            __props__['load_balancers'] = load_balancers
            __props__['max_size'] = max_size
            __props__['min_size'] = min_size
            __props__['monitoring'] = monitoring
            __props__['name'] = name
            __props__['region'] = region
            __props__['root_volume_size'] = root_volume_size
            __props__['scheduled_tasks'] = scheduled_tasks
            if security_groups is None:
                raise TypeError("Missing required property 'security_groups'")
            __props__['security_groups'] = security_groups
            __props__['spot_percentage'] = spot_percentage
            if subnet_ids is None:
                raise TypeError("Missing required property 'subnet_ids'")
            __props__['subnet_ids'] = subnet_ids
            __props__['tags'] = tags
            __props__['update_policy'] = update_policy
            __props__['user_data'] = user_data
            __props__['utilize_reserved_instances'] = utilize_reserved_instances
            __props__['whitelists'] = whitelists
        super(Ocean, __self__).__init__(
            'spotinst:aws/ocean:Ocean',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, associate_public_ip_address=None, autoscaler=None, blacklists=None, controller_id=None, desired_capacity=None, draining_timeout=None, ebs_optimized=None, fallback_to_ondemand=None, grace_period=None, iam_instance_profile=None, image_id=None, key_name=None, load_balancers=None, max_size=None, min_size=None, monitoring=None, name=None, region=None, root_volume_size=None, scheduled_tasks=None, security_groups=None, spot_percentage=None, subnet_ids=None, tags=None, update_policy=None, user_data=None, utilize_reserved_instances=None, whitelists=None):
        """
        Get an existing Ocean resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[list] blacklists: Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        :param pulumi.Input[str] controller_id: The ocean cluster identifier. Example: `ocean.k8s`
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[bool] fallback_to_ondemand: If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
        :param pulumi.Input[float] grace_period: The amount of time, in seconds, after the instance has launched to start checking its health.
        :param pulumi.Input[str] iam_instance_profile: The instance profile iam role.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[str] key_name: The key pair to attach the instances.
        :param pulumi.Input[list] load_balancers: - Array of load balancer objects to add to ocean cluster
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[bool] monitoring: Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
        :param pulumi.Input[str] name: Required if type is set to CLASSIC
        :param pulumi.Input[str] region: The region the cluster will run in.
        :param pulumi.Input[float] root_volume_size: The size (in Gb) to allocate for the root volume. Minimum `20`.
        :param pulumi.Input[list] security_groups: One or more security group ids.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[list] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, Ocean will utilize them before launching Spot instances.
        :param pulumi.Input[list] whitelists: Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.

        The **autoscaler** object supports the following:

          * `autoHeadroomPercentage` (`pulumi.Input[float]`)
          * `autoscaleCooldown` (`pulumi.Input[float]`)
          * `autoscaleDown` (`pulumi.Input[dict]`)
            * `evaluationPeriods` (`pulumi.Input[float]`)
            * `maxScaleDownPercentage` (`pulumi.Input[float]`)

          * `autoscaleHeadroom` (`pulumi.Input[dict]`)
            * `cpuPerUnit` (`pulumi.Input[float]`)
            * `gpuPerUnit` (`pulumi.Input[float]`)
            * `memoryPerUnit` (`pulumi.Input[float]`)
            * `numOfUnits` (`pulumi.Input[float]`)

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`)
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`)
          * `resource_limits` (`pulumi.Input[dict]`)
            * `maxMemoryGib` (`pulumi.Input[float]`)
            * `maxVcpu` (`pulumi.Input[float]`)

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`) - Required if type is set to TARGET_GROUP
          * `name` (`pulumi.Input[str]`) - Required if type is set to CLASSIC
          * `type` (`pulumi.Input[str]`) - Can be set to CLASSIC or TARGET_GROUP

        The **scheduled_tasks** object supports the following:

          * `shutdownHours` (`pulumi.Input[dict]`)
            * `isEnabled` (`pulumi.Input[bool]`)
            * `timeWindows` (`pulumi.Input[list]`)

          * `tasks` (`pulumi.Input[list]`)
            * `cronExpression` (`pulumi.Input[str]`)
            * `isEnabled` (`pulumi.Input[bool]`)
            * `taskType` (`pulumi.Input[str]`)

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **update_policy** object supports the following:

          * `rollConfig` (`pulumi.Input[dict]`)
            * `batchSizePercentage` (`pulumi.Input[float]`)

          * `shouldRoll` (`pulumi.Input[bool]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["associate_public_ip_address"] = associate_public_ip_address
        __props__["autoscaler"] = autoscaler
        __props__["blacklists"] = blacklists
        __props__["controller_id"] = controller_id
        __props__["desired_capacity"] = desired_capacity
        __props__["draining_timeout"] = draining_timeout
        __props__["ebs_optimized"] = ebs_optimized
        __props__["fallback_to_ondemand"] = fallback_to_ondemand
        __props__["grace_period"] = grace_period
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["key_name"] = key_name
        __props__["load_balancers"] = load_balancers
        __props__["max_size"] = max_size
        __props__["min_size"] = min_size
        __props__["monitoring"] = monitoring
        __props__["name"] = name
        __props__["region"] = region
        __props__["root_volume_size"] = root_volume_size
        __props__["scheduled_tasks"] = scheduled_tasks
        __props__["security_groups"] = security_groups
        __props__["spot_percentage"] = spot_percentage
        __props__["subnet_ids"] = subnet_ids
        __props__["tags"] = tags
        __props__["update_policy"] = update_policy
        __props__["user_data"] = user_data
        __props__["utilize_reserved_instances"] = utilize_reserved_instances
        __props__["whitelists"] = whitelists
        return Ocean(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

