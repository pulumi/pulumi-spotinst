# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ManagedInstance(pulumi.CustomResource):
    auto_healing: pulumi.Output[bool]
    """
    Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
    """
    block_devices_mode: pulumi.Output[str]
    """
    Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
    Default: `"onLaunch"`.
    """
    cpu_credits: pulumi.Output[str]
    """
    cpuCredits can have one of two values: “unlimited”, “standard”.
    Default: unlimited
    """
    description: pulumi.Output[str]
    """
    The ManagedInstance description.
    """
    draining_timeout: pulumi.Output[float]
    """
    The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
    """
    ebs_optimized: pulumi.Output[bool]
    """
    Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
    Default: false
    """
    elastic_ip: pulumi.Output[str]
    """
    Elastic IP Allocation Id to associate to the instance.
    """
    enable_monitoring: pulumi.Output[bool]
    """
    Describes whether instance Enhanced Monitoring is enabled.
    Default: false
    """
    fall_back_to_od: pulumi.Output[bool]
    grace_period: pulumi.Output[float]
    """
    The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
    """
    health_check_type: pulumi.Output[str]
    """
    The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
    Default: `“EC2”`.
    """
    iam_instance_profile: pulumi.Output[str]
    """
    Set IAM profile to instance. Set only one of ARN or Name.
    """
    image_id: pulumi.Output[str]
    """
    The ID of the image used to launch the instance.
    """
    instance_types: pulumi.Output[list]
    """
    Comma separated list of available instance types for instance.
    """
    integration_route53: pulumi.Output[dict]
    key_pair: pulumi.Output[str]
    """
    Specify a Key Pair to attach to the instances.
    """
    life_cycle: pulumi.Output[str]
    """
    Set lifecycle, valid values: `“spot”`, `“on_demand”`.
    Default `"spot"`.
    """
    load_balancers: pulumi.Output[list]
    name: pulumi.Output[str]
    """
    The ManagedInstance name.
    """
    network_interfaces: pulumi.Output[list]
    optimization_windows: pulumi.Output[list]
    """
    When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
    """
    orientation: pulumi.Output[str]
    """
    Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
    Default: `"availabilityOriented"`.
    """
    persist_block_devices: pulumi.Output[bool]
    """
    Should the instance maintain its Data volumes. 
    """
    persist_private_ip: pulumi.Output[bool]
    """
    Should the instance maintain its private IP.  
    """
    persist_root_device: pulumi.Output[bool]
    """
    Should the instance maintain its root device volumes.
    """
    placement_tenancy: pulumi.Output[str]
    """
    Valid values: "default", "dedicated"
    Default: default
    """
    preferred_type: pulumi.Output[str]
    """
    Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
    """
    private_ip: pulumi.Output[str]
    """
    Private IP Allocation Id to associate to the instance. 
    """
    product: pulumi.Output[str]
    """
    Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
    """
    region: pulumi.Output[str]
    """
    The AWS region your group will be created in.
    """
    revert_to_spot: pulumi.Output[dict]
    scheduled_tasks: pulumi.Output[list]
    security_group_ids: pulumi.Output[list]
    """
    One or more security group IDs.
    """
    shutdown_script: pulumi.Output[str]
    """
    The Base64-encoded shutdown script to execute prior to instance termination.
    """
    subnet_ids: pulumi.Output[list]
    """
    A comma-separated list of subnet identifiers for your instance.
    """
    tags: pulumi.Output[list]
    """
    Set tags for the instance. Items should be unique.

      * `key` (`str`) - Tag's key.
      * `value` (`str`) - Tag's name.
    """
    unhealthy_duration: pulumi.Output[float]
    """
    The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
    """
    user_data: pulumi.Output[str]
    """
    The Base64-encoded MIME user data to make available to the instances.
    """
    utilize_reserved_instances: pulumi.Output[bool]
    """
    In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
    Default: `"false"`.
    """
    vpc_id: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, auto_healing=None, block_devices_mode=None, cpu_credits=None, description=None, draining_timeout=None, ebs_optimized=None, elastic_ip=None, enable_monitoring=None, fall_back_to_od=None, grace_period=None, health_check_type=None, iam_instance_profile=None, image_id=None, instance_types=None, integration_route53=None, key_pair=None, life_cycle=None, load_balancers=None, name=None, network_interfaces=None, optimization_windows=None, orientation=None, persist_block_devices=None, persist_private_ip=None, persist_root_device=None, placement_tenancy=None, preferred_type=None, private_ip=None, product=None, region=None, revert_to_spot=None, scheduled_tasks=None, security_group_ids=None, shutdown_script=None, subnet_ids=None, tags=None, unhealthy_duration=None, user_data=None, utilize_reserved_instances=None, vpc_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a ManagedInstance resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_healing: Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
        :param pulumi.Input[str] block_devices_mode: Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
               Default: `"onLaunch"`.
        :param pulumi.Input[str] cpu_credits: cpuCredits can have one of two values: “unlimited”, “standard”.
               Default: unlimited
        :param pulumi.Input[str] description: The ManagedInstance description.
        :param pulumi.Input[float] draining_timeout: The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
               Default: false
        :param pulumi.Input[str] elastic_ip: Elastic IP Allocation Id to associate to the instance.
        :param pulumi.Input[bool] enable_monitoring: Describes whether instance Enhanced Monitoring is enabled.
               Default: false
        :param pulumi.Input[float] grace_period: The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
        :param pulumi.Input[str] health_check_type: The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
               Default: `“EC2”`.
        :param pulumi.Input[str] iam_instance_profile: Set IAM profile to instance. Set only one of ARN or Name.
        :param pulumi.Input[str] image_id: The ID of the image used to launch the instance.
        :param pulumi.Input[list] instance_types: Comma separated list of available instance types for instance.
        :param pulumi.Input[str] key_pair: Specify a Key Pair to attach to the instances.
        :param pulumi.Input[str] life_cycle: Set lifecycle, valid values: `“spot”`, `“on_demand”`.
               Default `"spot"`.
        :param pulumi.Input[str] name: The ManagedInstance name.
        :param pulumi.Input[list] optimization_windows: When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
        :param pulumi.Input[str] orientation: Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
               Default: `"availabilityOriented"`.
        :param pulumi.Input[bool] persist_block_devices: Should the instance maintain its Data volumes. 
        :param pulumi.Input[bool] persist_private_ip: Should the instance maintain its private IP.  
        :param pulumi.Input[bool] persist_root_device: Should the instance maintain its root device volumes.
        :param pulumi.Input[str] placement_tenancy: Valid values: "default", "dedicated"
               Default: default
        :param pulumi.Input[str] preferred_type: Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        :param pulumi.Input[str] private_ip: Private IP Allocation Id to associate to the instance. 
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
        :param pulumi.Input[str] region: The AWS region your group will be created in.
        :param pulumi.Input[list] security_group_ids: One or more security group IDs.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script to execute prior to instance termination.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for your instance.
        :param pulumi.Input[list] tags: Set tags for the instance. Items should be unique.
        :param pulumi.Input[float] unhealthy_duration: The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
        :param pulumi.Input[str] user_data: The Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
               Default: `"false"`.

        The **integration_route53** object supports the following:

          * `domains` (`pulumi.Input[list]`)
            * `hostedZoneId` (`pulumi.Input[str]`)
            * `recordSets` (`pulumi.Input[list]`)
              * `name` (`pulumi.Input[str]`) - The ManagedInstance name.
              * `usePublicIp` (`pulumi.Input[bool]`)

            * `spotinstAcctId` (`pulumi.Input[str]`)

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`)
          * `autoWeight` (`pulumi.Input[bool]`)
          * `azAwareness` (`pulumi.Input[bool]`)
          * `balancer_id` (`pulumi.Input[str]`)
          * `name` (`pulumi.Input[str]`) - The ManagedInstance name.
          * `target_set_id` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)

        The **network_interfaces** object supports the following:

          * `associateIpv6Address` (`pulumi.Input[bool]`)
          * `associate_public_ip_address` (`pulumi.Input[bool]`)
          * `deviceIndex` (`pulumi.Input[str]`)

        The **revert_to_spot** object supports the following:

          * `performAt` (`pulumi.Input[str]`) - Valid values: “always”, “never”, "timeWindow".
            Default `"never"`.

        The **scheduled_tasks** object supports the following:

          * `cronExpression` (`pulumi.Input[str]`)
          * `frequency` (`pulumi.Input[str]`)
          * `isEnabled` (`pulumi.Input[bool]`)
          * `startTime` (`pulumi.Input[str]`)
          * `taskType` (`pulumi.Input[str]`)

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - Tag's key.
          * `value` (`pulumi.Input[str]`) - Tag's name.
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

            __props__['auto_healing'] = auto_healing
            __props__['block_devices_mode'] = block_devices_mode
            __props__['cpu_credits'] = cpu_credits
            __props__['description'] = description
            __props__['draining_timeout'] = draining_timeout
            __props__['ebs_optimized'] = ebs_optimized
            __props__['elastic_ip'] = elastic_ip
            __props__['enable_monitoring'] = enable_monitoring
            __props__['fall_back_to_od'] = fall_back_to_od
            __props__['grace_period'] = grace_period
            __props__['health_check_type'] = health_check_type
            __props__['iam_instance_profile'] = iam_instance_profile
            if image_id is None:
                raise TypeError("Missing required property 'image_id'")
            __props__['image_id'] = image_id
            if instance_types is None:
                raise TypeError("Missing required property 'instance_types'")
            __props__['instance_types'] = instance_types
            __props__['integration_route53'] = integration_route53
            __props__['key_pair'] = key_pair
            __props__['life_cycle'] = life_cycle
            __props__['load_balancers'] = load_balancers
            __props__['name'] = name
            __props__['network_interfaces'] = network_interfaces
            __props__['optimization_windows'] = optimization_windows
            __props__['orientation'] = orientation
            if persist_block_devices is None:
                raise TypeError("Missing required property 'persist_block_devices'")
            __props__['persist_block_devices'] = persist_block_devices
            __props__['persist_private_ip'] = persist_private_ip
            __props__['persist_root_device'] = persist_root_device
            __props__['placement_tenancy'] = placement_tenancy
            __props__['preferred_type'] = preferred_type
            __props__['private_ip'] = private_ip
            if product is None:
                raise TypeError("Missing required property 'product'")
            __props__['product'] = product
            __props__['region'] = region
            __props__['revert_to_spot'] = revert_to_spot
            __props__['scheduled_tasks'] = scheduled_tasks
            __props__['security_group_ids'] = security_group_ids
            __props__['shutdown_script'] = shutdown_script
            if subnet_ids is None:
                raise TypeError("Missing required property 'subnet_ids'")
            __props__['subnet_ids'] = subnet_ids
            __props__['tags'] = tags
            __props__['unhealthy_duration'] = unhealthy_duration
            __props__['user_data'] = user_data
            __props__['utilize_reserved_instances'] = utilize_reserved_instances
            if vpc_id is None:
                raise TypeError("Missing required property 'vpc_id'")
            __props__['vpc_id'] = vpc_id
        super(ManagedInstance, __self__).__init__(
            'spotinst:aws/managedInstance:ManagedInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, auto_healing=None, block_devices_mode=None, cpu_credits=None, description=None, draining_timeout=None, ebs_optimized=None, elastic_ip=None, enable_monitoring=None, fall_back_to_od=None, grace_period=None, health_check_type=None, iam_instance_profile=None, image_id=None, instance_types=None, integration_route53=None, key_pair=None, life_cycle=None, load_balancers=None, name=None, network_interfaces=None, optimization_windows=None, orientation=None, persist_block_devices=None, persist_private_ip=None, persist_root_device=None, placement_tenancy=None, preferred_type=None, private_ip=None, product=None, region=None, revert_to_spot=None, scheduled_tasks=None, security_group_ids=None, shutdown_script=None, subnet_ids=None, tags=None, unhealthy_duration=None, user_data=None, utilize_reserved_instances=None, vpc_id=None):
        """
        Get an existing ManagedInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_healing: Enable the auto healing which auto replaces the instance in case the health check fails, default: `“true”`. 
        :param pulumi.Input[str] block_devices_mode: Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
               Default: `"onLaunch"`.
        :param pulumi.Input[str] cpu_credits: cpuCredits can have one of two values: “unlimited”, “standard”.
               Default: unlimited
        :param pulumi.Input[str] description: The ManagedInstance description.
        :param pulumi.Input[float] draining_timeout: The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimization for supported instance which is not enabled by default. Note - additional charges will be applied.
               Default: false
        :param pulumi.Input[str] elastic_ip: Elastic IP Allocation Id to associate to the instance.
        :param pulumi.Input[bool] enable_monitoring: Describes whether instance Enhanced Monitoring is enabled.
               Default: false
        :param pulumi.Input[float] grace_period: The amount of time, in seconds, after the instance has launched to starts and check its health, default `“120"`.
        :param pulumi.Input[str] health_check_type: The service to use for the health check. Valid values: `“EC2”`, `“ELB”`, `“TARGET_GROUP”`, `“MULTAI_TARGET_SET”`.
               Default: `“EC2”`.
        :param pulumi.Input[str] iam_instance_profile: Set IAM profile to instance. Set only one of ARN or Name.
        :param pulumi.Input[str] image_id: The ID of the image used to launch the instance.
        :param pulumi.Input[list] instance_types: Comma separated list of available instance types for instance.
        :param pulumi.Input[str] key_pair: Specify a Key Pair to attach to the instances.
        :param pulumi.Input[str] life_cycle: Set lifecycle, valid values: `“spot”`, `“on_demand”`.
               Default `"spot"`.
        :param pulumi.Input[str] name: The ManagedInstance name.
        :param pulumi.Input[list] optimization_windows: When performAt is 'timeWindow': must specify a list of 'timeWindows' with at least one time window Each string is in the format of - ddd:hh:mm-ddd:hh:mm ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59.
        :param pulumi.Input[str] orientation: Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
               Default: `"availabilityOriented"`.
        :param pulumi.Input[bool] persist_block_devices: Should the instance maintain its Data volumes. 
        :param pulumi.Input[bool] persist_private_ip: Should the instance maintain its private IP.  
        :param pulumi.Input[bool] persist_root_device: Should the instance maintain its root device volumes.
        :param pulumi.Input[str] placement_tenancy: Valid values: "default", "dedicated"
               Default: default
        :param pulumi.Input[str] preferred_type: Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        :param pulumi.Input[str] private_ip: Private IP Allocation Id to associate to the instance. 
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.    
        :param pulumi.Input[str] region: The AWS region your group will be created in.
        :param pulumi.Input[list] security_group_ids: One or more security group IDs.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script to execute prior to instance termination.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for your instance.
        :param pulumi.Input[list] tags: Set tags for the instance. Items should be unique.
        :param pulumi.Input[float] unhealthy_duration: The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `“120"`.
        :param pulumi.Input[str] user_data: The Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
               Default: `"false"`.

        The **integration_route53** object supports the following:

          * `domains` (`pulumi.Input[list]`)
            * `hostedZoneId` (`pulumi.Input[str]`)
            * `recordSets` (`pulumi.Input[list]`)
              * `name` (`pulumi.Input[str]`) - The ManagedInstance name.
              * `usePublicIp` (`pulumi.Input[bool]`)

            * `spotinstAcctId` (`pulumi.Input[str]`)

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`)
          * `autoWeight` (`pulumi.Input[bool]`)
          * `azAwareness` (`pulumi.Input[bool]`)
          * `balancer_id` (`pulumi.Input[str]`)
          * `name` (`pulumi.Input[str]`) - The ManagedInstance name.
          * `target_set_id` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)

        The **network_interfaces** object supports the following:

          * `associateIpv6Address` (`pulumi.Input[bool]`)
          * `associate_public_ip_address` (`pulumi.Input[bool]`)
          * `deviceIndex` (`pulumi.Input[str]`)

        The **revert_to_spot** object supports the following:

          * `performAt` (`pulumi.Input[str]`) - Valid values: “always”, “never”, "timeWindow".
            Default `"never"`.

        The **scheduled_tasks** object supports the following:

          * `cronExpression` (`pulumi.Input[str]`)
          * `frequency` (`pulumi.Input[str]`)
          * `isEnabled` (`pulumi.Input[bool]`)
          * `startTime` (`pulumi.Input[str]`)
          * `taskType` (`pulumi.Input[str]`)

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - Tag's key.
          * `value` (`pulumi.Input[str]`) - Tag's name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_healing"] = auto_healing
        __props__["block_devices_mode"] = block_devices_mode
        __props__["cpu_credits"] = cpu_credits
        __props__["description"] = description
        __props__["draining_timeout"] = draining_timeout
        __props__["ebs_optimized"] = ebs_optimized
        __props__["elastic_ip"] = elastic_ip
        __props__["enable_monitoring"] = enable_monitoring
        __props__["fall_back_to_od"] = fall_back_to_od
        __props__["grace_period"] = grace_period
        __props__["health_check_type"] = health_check_type
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["instance_types"] = instance_types
        __props__["integration_route53"] = integration_route53
        __props__["key_pair"] = key_pair
        __props__["life_cycle"] = life_cycle
        __props__["load_balancers"] = load_balancers
        __props__["name"] = name
        __props__["network_interfaces"] = network_interfaces
        __props__["optimization_windows"] = optimization_windows
        __props__["orientation"] = orientation
        __props__["persist_block_devices"] = persist_block_devices
        __props__["persist_private_ip"] = persist_private_ip
        __props__["persist_root_device"] = persist_root_device
        __props__["placement_tenancy"] = placement_tenancy
        __props__["preferred_type"] = preferred_type
        __props__["private_ip"] = private_ip
        __props__["product"] = product
        __props__["region"] = region
        __props__["revert_to_spot"] = revert_to_spot
        __props__["scheduled_tasks"] = scheduled_tasks
        __props__["security_group_ids"] = security_group_ids
        __props__["shutdown_script"] = shutdown_script
        __props__["subnet_ids"] = subnet_ids
        __props__["tags"] = tags
        __props__["unhealthy_duration"] = unhealthy_duration
        __props__["user_data"] = user_data
        __props__["utilize_reserved_instances"] = utilize_reserved_instances
        __props__["vpc_id"] = vpc_id
        return ManagedInstance(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

