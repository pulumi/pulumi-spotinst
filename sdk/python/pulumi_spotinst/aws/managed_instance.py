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

__all__ = ['ManagedInstance']


class ManagedInstance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_healing: Optional[pulumi.Input[bool]] = None,
                 block_devices_mode: Optional[pulumi.Input[str]] = None,
                 cpu_credits: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 ebs_optimized: Optional[pulumi.Input[bool]] = None,
                 elastic_ip: Optional[pulumi.Input[str]] = None,
                 enable_monitoring: Optional[pulumi.Input[bool]] = None,
                 fall_back_to_od: Optional[pulumi.Input[bool]] = None,
                 grace_period: Optional[pulumi.Input[int]] = None,
                 health_check_type: Optional[pulumi.Input[str]] = None,
                 iam_instance_profile: Optional[pulumi.Input[str]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 integration_route53: Optional[pulumi.Input[pulumi.InputType['ManagedInstanceIntegrationRoute53Args']]] = None,
                 key_pair: Optional[pulumi.Input[str]] = None,
                 life_cycle: Optional[pulumi.Input[str]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceLoadBalancerArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceNetworkInterfaceArgs']]]]] = None,
                 optimization_windows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 orientation: Optional[pulumi.Input[str]] = None,
                 persist_block_devices: Optional[pulumi.Input[bool]] = None,
                 persist_private_ip: Optional[pulumi.Input[bool]] = None,
                 persist_root_device: Optional[pulumi.Input[bool]] = None,
                 placement_tenancy: Optional[pulumi.Input[str]] = None,
                 preferred_type: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 revert_to_spot: Optional[pulumi.Input[pulumi.InputType['ManagedInstanceRevertToSpotArgs']]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceScheduledTaskArgs']]]]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 shutdown_script: Optional[pulumi.Input[str]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceTagArgs']]]]] = None,
                 unhealthy_duration: Optional[pulumi.Input[int]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 utilize_reserved_instances: Optional[pulumi.Input[bool]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst AWS ManagedInstance resource.

        ## Network Interface - (Optional) List of network interfaces in an EC2 instance.

        * `device_index` - (Optional) The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
        * `associate_public_ip_address` - (Optional) Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
        * `associate_ipv6_address` - (Optional) Indicates whether to assign an IPv6 address. Amazon EC2 chooses the IPv6 addresses from the range of the subnet.
           Default: false

        Usage:

        ```python
        import pulumi
        ```

        <a id="scheduled-task"></a>
        ## Scheduled Tasks

        Each `scheduled_task` supports the following:

        * `is_enabled` - (Optional) Describes whether the task is enabled. When true the task should run when false it should not run.
        * `frequency` - (Optional) Set frequency for the task. Valid values: "hourly", "daily", "weekly", "continuous".
        * `start_time` - (Optional) DATETIME in ISO-8601 format. Sets a start time for scheduled actions. If "frequency" or "cronExpression" are not used - the task will run only once at the start time and will then be deleted from the instance configuration.
           Example: 2019-05-23T10:55:09Z
        * `cron_expression` - (Optional) A valid cron expression. For example: " * * * * * ". The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script. Only one of ‘frequency’ or ‘cronExpression’ should be used at a time.
           Example: 0 1 * * *
        * `task_type`- (Required) The task type to run. Valid values: "pause", "resume", "recycle".

        Usage:

        ```python
        import pulumi
        ```

        <a id="load-balancers"></a>
        ## Load Balancers

           * `loadBalancersConfig` - (Optional) Load Balancers integration object.
             
               * `load_balancers` - (Optional) List of load balancers configs.
                    * `name` - The AWS resource name. Required for Classic Load Balancer. Optional for Application Load Balancer.
                    * `arn` - The AWS resource ARN (Required only for ALB target groups).
                    * `balancer_id` - The Multai load balancer ID.
                         Default: lb-123456
                    * `target_set_id` - The Multai load target set ID.
                         Default: ts-123456
                    * `auto_weight` - "Auto Weight" will automatically provide a higher weight for instances that are larger as appropriate. For example, if you have configured your Elastigroup with m4.large and m4.xlarge instances the m4.large will have half the weight of an m4.xlarge. This ensures that larger instances receive a higher number of MLB requests.
                    * `zone_awareness` - "AZ Awareness" will ensure that instances within the same AZ are using the corresponding MLB runtime instance in the same AZ. This feature reduces multi-zone data transfer fees.
                    * `type` - The resource type. Valid Values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.

        Usage:

        ```python
        import pulumi
        ```

        <a id="route53"></a>
        ## route53

           * `integration_route53` - (Optional) Describes the [Route53](https://aws.amazon.com/documentation/route53/?id=docs_gateway) integration.
             
               * `domains` - (Required) Route 53 Domain configurations.
                   * `hosted_zone_id` - (Required) The Route 53 Hosted Zone Id for the registered Domain.
                   * `spotinst_acct_id` - (Optional) The Spotinst account ID that is linked to the AWS account that holds the Route 53 hosted Zone Id. The default is the user Spotinst account provided as a URL parameter.
                   * `record_set_type` - (Optional, Default: `a`) The type of the record set. Valid values: `"a"`, `"cname"`.
                   * `record_sets` - (Required) List of record sets
                       * `name` - (Required) The record set name.
                       * `use_public_ip` - (Optional, Default: `false`) - Designates whether the IP address should be exposed to connections outside the VPC.
                       * `use_public_dns` - (Optional, Default: `false`) - Designates whether the DNS address should be exposed to connections outside the VPC.

        Usage:

        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_healing: Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
        :param pulumi.Input[str] block_devices_mode: Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
               Default: `"onLaunch"`.
        :param pulumi.Input[str] cpu_credits: cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
               Default: unlimited
        :param pulumi.Input[str] description: The ManagedInstance description.
        :param pulumi.Input[int] draining_timeout: The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
               Default: false
        :param pulumi.Input[str] elastic_ip: Elastic IP Allocation Id to associate to the instance.
        :param pulumi.Input[bool] enable_monitoring: Describes whether instance Enhanced Monitoring is enabled.
               Default: false
        :param pulumi.Input[int] grace_period: The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
        :param pulumi.Input[str] health_check_type: The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
               Default: `"EC2"`.
        :param pulumi.Input[str] iam_instance_profile: Set IAM profile to instance. Set only one of ARN or Name.
        :param pulumi.Input[str] image_id: The ID of the image used to launch the instance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: Comma separated list of available instance types for instance.
        :param pulumi.Input[str] key_pair: Specify a Key Pair to attach to the instances.
        :param pulumi.Input[str] life_cycle: Set lifecycle, valid values: `"spot"`, `"on_demand"`.
               Default `"spot"`.
        :param pulumi.Input[str] name: The ManagedInstance name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] optimization_windows: When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
        :param pulumi.Input[str] orientation: Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
               Default: `"availabilityOriented"`.
        :param pulumi.Input[bool] persist_block_devices: Should the instance maintain its Data volumes.
        :param pulumi.Input[bool] persist_private_ip: Should the instance maintain its private IP.
        :param pulumi.Input[bool] persist_root_device: Should the instance maintain its root device volumes.
        :param pulumi.Input[str] placement_tenancy: Valid values: `"default"`, `"dedicated"`.
               Default: default
        :param pulumi.Input[str] preferred_type: Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        :param pulumi.Input[str] private_ip: Private IP Allocation Id to associate to the instance.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security group IDs.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script to execute prior to instance termination.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A comma-separated list of subnet identifiers for your instance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceTagArgs']]]] tags: Set tags for the instance. Items should be unique.
        :param pulumi.Input[int] unhealthy_duration: The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
        :param pulumi.Input[str] user_data: The Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
               Default: `"false"`.
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
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_healing: Optional[pulumi.Input[bool]] = None,
            block_devices_mode: Optional[pulumi.Input[str]] = None,
            cpu_credits: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            draining_timeout: Optional[pulumi.Input[int]] = None,
            ebs_optimized: Optional[pulumi.Input[bool]] = None,
            elastic_ip: Optional[pulumi.Input[str]] = None,
            enable_monitoring: Optional[pulumi.Input[bool]] = None,
            fall_back_to_od: Optional[pulumi.Input[bool]] = None,
            grace_period: Optional[pulumi.Input[int]] = None,
            health_check_type: Optional[pulumi.Input[str]] = None,
            iam_instance_profile: Optional[pulumi.Input[str]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            integration_route53: Optional[pulumi.Input[pulumi.InputType['ManagedInstanceIntegrationRoute53Args']]] = None,
            key_pair: Optional[pulumi.Input[str]] = None,
            life_cycle: Optional[pulumi.Input[str]] = None,
            load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceLoadBalancerArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network_interfaces: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceNetworkInterfaceArgs']]]]] = None,
            optimization_windows: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            orientation: Optional[pulumi.Input[str]] = None,
            persist_block_devices: Optional[pulumi.Input[bool]] = None,
            persist_private_ip: Optional[pulumi.Input[bool]] = None,
            persist_root_device: Optional[pulumi.Input[bool]] = None,
            placement_tenancy: Optional[pulumi.Input[str]] = None,
            preferred_type: Optional[pulumi.Input[str]] = None,
            private_ip: Optional[pulumi.Input[str]] = None,
            product: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            revert_to_spot: Optional[pulumi.Input[pulumi.InputType['ManagedInstanceRevertToSpotArgs']]] = None,
            scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceScheduledTaskArgs']]]]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            shutdown_script: Optional[pulumi.Input[str]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceTagArgs']]]]] = None,
            unhealthy_duration: Optional[pulumi.Input[int]] = None,
            user_data: Optional[pulumi.Input[str]] = None,
            utilize_reserved_instances: Optional[pulumi.Input[bool]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'ManagedInstance':
        """
        Get an existing ManagedInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_healing: Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
        :param pulumi.Input[str] block_devices_mode: Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
               Default: `"onLaunch"`.
        :param pulumi.Input[str] cpu_credits: cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
               Default: unlimited
        :param pulumi.Input[str] description: The ManagedInstance description.
        :param pulumi.Input[int] draining_timeout: The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
               Default: false
        :param pulumi.Input[str] elastic_ip: Elastic IP Allocation Id to associate to the instance.
        :param pulumi.Input[bool] enable_monitoring: Describes whether instance Enhanced Monitoring is enabled.
               Default: false
        :param pulumi.Input[int] grace_period: The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
        :param pulumi.Input[str] health_check_type: The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
               Default: `"EC2"`.
        :param pulumi.Input[str] iam_instance_profile: Set IAM profile to instance. Set only one of ARN or Name.
        :param pulumi.Input[str] image_id: The ID of the image used to launch the instance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: Comma separated list of available instance types for instance.
        :param pulumi.Input[str] key_pair: Specify a Key Pair to attach to the instances.
        :param pulumi.Input[str] life_cycle: Set lifecycle, valid values: `"spot"`, `"on_demand"`.
               Default `"spot"`.
        :param pulumi.Input[str] name: The ManagedInstance name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] optimization_windows: When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
        :param pulumi.Input[str] orientation: Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
               Default: `"availabilityOriented"`.
        :param pulumi.Input[bool] persist_block_devices: Should the instance maintain its Data volumes.
        :param pulumi.Input[bool] persist_private_ip: Should the instance maintain its private IP.
        :param pulumi.Input[bool] persist_root_device: Should the instance maintain its root device volumes.
        :param pulumi.Input[str] placement_tenancy: Valid values: `"default"`, `"dedicated"`.
               Default: default
        :param pulumi.Input[str] preferred_type: Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        :param pulumi.Input[str] private_ip: Private IP Allocation Id to associate to the instance.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security group IDs.
        :param pulumi.Input[str] shutdown_script: The Base64-encoded shutdown script to execute prior to instance termination.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: A comma-separated list of subnet identifiers for your instance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ManagedInstanceTagArgs']]]] tags: Set tags for the instance. Items should be unique.
        :param pulumi.Input[int] unhealthy_duration: The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
        :param pulumi.Input[str] user_data: The Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
               Default: `"false"`.
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

    @property
    @pulumi.getter(name="autoHealing")
    def auto_healing(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable the auto healing which auto replaces the instance in case the health check fails, default: `"true"`.
        """
        return pulumi.get(self, "auto_healing")

    @property
    @pulumi.getter(name="blockDevicesMode")
    def block_devices_mode(self) -> pulumi.Output[Optional[str]]:
        """
        Determine the way we attach the data volumes to the data devices. Valid values: `"reattach"`, `"onLaunch"`.
        Default: `"onLaunch"`.
        """
        return pulumi.get(self, "block_devices_mode")

    @property
    @pulumi.getter(name="cpuCredits")
    def cpu_credits(self) -> pulumi.Output[Optional[str]]:
        """
        cpuCredits can have one of two values: `"unlimited"`, `"standard"`.
        Default: unlimited
        """
        return pulumi.get(self, "cpu_credits")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The ManagedInstance description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        The time in seconds to allow the instance be drained from incoming TCP connections and detached from ELB before terminating it, during a scale down operation.
        """
        return pulumi.get(self, "draining_timeout")

    @property
    @pulumi.getter(name="ebsOptimized")
    def ebs_optimized(self) -> pulumi.Output[bool]:
        """
        Enable EBS optimization for supported instances. Note: Additional charges will be applied by the Cloud Provider.
        Default: false
        """
        return pulumi.get(self, "ebs_optimized")

    @property
    @pulumi.getter(name="elasticIp")
    def elastic_ip(self) -> pulumi.Output[Optional[str]]:
        """
        Elastic IP Allocation Id to associate to the instance.
        """
        return pulumi.get(self, "elastic_ip")

    @property
    @pulumi.getter(name="enableMonitoring")
    def enable_monitoring(self) -> pulumi.Output[Optional[bool]]:
        """
        Describes whether instance Enhanced Monitoring is enabled.
        Default: false
        """
        return pulumi.get(self, "enable_monitoring")

    @property
    @pulumi.getter(name="fallBackToOd")
    def fall_back_to_od(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "fall_back_to_od")

    @property
    @pulumi.getter(name="gracePeriod")
    def grace_period(self) -> pulumi.Output[Optional[int]]:
        """
        The amount of time, in seconds, after the instance has launched to starts and check its health, default `"120"`.
        """
        return pulumi.get(self, "grace_period")

    @property
    @pulumi.getter(name="healthCheckType")
    def health_check_type(self) -> pulumi.Output[Optional[str]]:
        """
        The service to use for the health check. Valid values: `"EC2"`, `"ELB"`, `"TARGET_GROUP"`, `"MULTAI_TARGET_SET"`.
        Default: `"EC2"`.
        """
        return pulumi.get(self, "health_check_type")

    @property
    @pulumi.getter(name="iamInstanceProfile")
    def iam_instance_profile(self) -> pulumi.Output[Optional[str]]:
        """
        Set IAM profile to instance. Set only one of ARN or Name.
        """
        return pulumi.get(self, "iam_instance_profile")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[str]:
        """
        The ID of the image used to launch the instance.
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> pulumi.Output[Sequence[str]]:
        """
        Comma separated list of available instance types for instance.
        """
        return pulumi.get(self, "instance_types")

    @property
    @pulumi.getter(name="integrationRoute53")
    def integration_route53(self) -> pulumi.Output[Optional['outputs.ManagedInstanceIntegrationRoute53']]:
        return pulumi.get(self, "integration_route53")

    @property
    @pulumi.getter(name="keyPair")
    def key_pair(self) -> pulumi.Output[Optional[str]]:
        """
        Specify a Key Pair to attach to the instances.
        """
        return pulumi.get(self, "key_pair")

    @property
    @pulumi.getter(name="lifeCycle")
    def life_cycle(self) -> pulumi.Output[Optional[str]]:
        """
        Set lifecycle, valid values: `"spot"`, `"on_demand"`.
        Default `"spot"`.
        """
        return pulumi.get(self, "life_cycle")

    @property
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedInstanceLoadBalancer']]]:
        return pulumi.get(self, "load_balancers")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The ManagedInstance name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedInstanceNetworkInterface']]]:
        return pulumi.get(self, "network_interfaces")

    @property
    @pulumi.getter(name="optimizationWindows")
    def optimization_windows(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        When `performAt` is `"timeWindow"`: must specify a list of `"timeWindows"` with at least one time window. Each string should be formatted as `ddd:hh:mm-ddd:hh:mm` (ddd = day of week = Sun | Mon | Tue | Wed | Thu | Fri | Sat hh = hour 24 = 0 -23 mm = minute = 0 - 59).
        """
        return pulumi.get(self, "optimization_windows")

    @property
    @pulumi.getter
    def orientation(self) -> pulumi.Output[Optional[str]]:
        """
        Select a prediction strategy. Valid values: `"balanced"`, `"costOriented"`, `"availabilityOriented"`, `"cheapest"`.
        Default: `"availabilityOriented"`.
        """
        return pulumi.get(self, "orientation")

    @property
    @pulumi.getter(name="persistBlockDevices")
    def persist_block_devices(self) -> pulumi.Output[bool]:
        """
        Should the instance maintain its Data volumes.
        """
        return pulumi.get(self, "persist_block_devices")

    @property
    @pulumi.getter(name="persistPrivateIp")
    def persist_private_ip(self) -> pulumi.Output[Optional[bool]]:
        """
        Should the instance maintain its private IP.
        """
        return pulumi.get(self, "persist_private_ip")

    @property
    @pulumi.getter(name="persistRootDevice")
    def persist_root_device(self) -> pulumi.Output[Optional[bool]]:
        """
        Should the instance maintain its root device volumes.
        """
        return pulumi.get(self, "persist_root_device")

    @property
    @pulumi.getter(name="placementTenancy")
    def placement_tenancy(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values: `"default"`, `"dedicated"`.
        Default: default
        """
        return pulumi.get(self, "placement_tenancy")

    @property
    @pulumi.getter(name="preferredType")
    def preferred_type(self) -> pulumi.Output[Optional[str]]:
        """
        Preferred instance types for the instance. We will automatically select optional similar instance types to ensure optimized cost efficiency
        """
        return pulumi.get(self, "preferred_type")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> pulumi.Output[Optional[str]]:
        """
        Private IP Allocation Id to associate to the instance.
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter
    def product(self) -> pulumi.Output[str]:
        """
        Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`, `"Red Hat Enterprise Linux"`, `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`,  `"Red Hat Enterprise Linux (Amazon VPC)"`.
        """
        return pulumi.get(self, "product")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        The AWS region your group will be created in.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="revertToSpot")
    def revert_to_spot(self) -> pulumi.Output[Optional['outputs.ManagedInstanceRevertToSpot']]:
        return pulumi.get(self, "revert_to_spot")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedInstanceScheduledTask']]]:
        return pulumi.get(self, "scheduled_tasks")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        One or more security group IDs.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="shutdownScript")
    def shutdown_script(self) -> pulumi.Output[Optional[str]]:
        """
        The Base64-encoded shutdown script to execute prior to instance termination.
        """
        return pulumi.get(self, "shutdown_script")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        A comma-separated list of subnet identifiers for your instance.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.ManagedInstanceTag']]]:
        """
        Set tags for the instance. Items should be unique.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="unhealthyDuration")
    def unhealthy_duration(self) -> pulumi.Output[Optional[int]]:
        """
        The amount of time, in seconds, an existing instance should remain active after becoming unhealthy. After the set time out the instance will be replaced, default `"120"`.
        """
        return pulumi.get(self, "unhealthy_duration")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> pulumi.Output[Optional[str]]:
        """
        The Base64-encoded MIME user data to make available to the instances.
        """
        return pulumi.get(self, "user_data")

    @property
    @pulumi.getter(name="utilizeReservedInstances")
    def utilize_reserved_instances(self) -> pulumi.Output[Optional[bool]]:
        """
        In case of any available Reserved Instances, Managed Instance will utilize them before purchasing Spot instances.
        Default: `"false"`.
        """
        return pulumi.get(self, "utilize_reserved_instances")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vpc_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

