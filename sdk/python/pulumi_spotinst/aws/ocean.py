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
    """
    Describes the Ocean Kubernetes autoscaler.

      * `autoscaleCooldown` (`float`) - Cooldown period between scaling actions.
      * `autoscaleDown` (`dict`) - Auto Scaling scale down operations.
        * `evaluationPeriods` (`float`) - The number of evaluation periods that should accumulate before a scale down action takes place.
        * `maxScaleDownPercentage` (`float`) - Would represent the maximum % to scale-down. Number between 1-100.

      * `autoscaleHeadroom` (`dict`) - Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
        * `cpuPerUnit` (`float`) - Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
        * `gpuPerUnit` (`float`) - Optionally configure the number of GPUS to allocate the headroom.
        * `memoryPerUnit` (`float`) - Optionally configure the amount of memory (MB) to allocate the headroom.
        * `numOfUnits` (`float`) - The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.

      * `autoscaleIsAutoConfig` (`bool`) - Automatically configure and optimize headroom resources.
      * `autoscaleIsEnabled` (`bool`) - Enable the Ocean Kubernetes autoscaler.
      * `resourceLimits` (`dict`) - Optionally set upper and lower bounds on the resource usage of the cluster.
        * `maxMemoryGib` (`float`) - The maximum memory in GiB units that can be allocated to the cluster.
        * `maxVcpu` (`float`) - The maximum cpu in vCPU units that can be allocated to the cluster.
    """
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
    security_groups: pulumi.Output[list]
    """
    One or more security group ids.
    """
    spot_percentage: pulumi.Output[float]
    """
    The percentage of Spot instances the cluster should maintain. Min 0, max 100.
    """
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
    If Reserved instances exist, OCean will utilize them before launching Spot instances.
    """
    whitelists: pulumi.Output[list]
    """
    Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
    """
    def __init__(__self__, resource_name, opts=None, associate_public_ip_address=None, autoscaler=None, blacklists=None, controller_id=None, desired_capacity=None, draining_timeout=None, ebs_optimized=None, fallback_to_ondemand=None, iam_instance_profile=None, image_id=None, key_name=None, load_balancers=None, max_size=None, min_size=None, monitoring=None, name=None, region=None, root_volume_size=None, security_groups=None, spot_percentage=None, subnet_ids=None, tags=None, update_policy=None, user_data=None, utilize_reserved_instances=None, whitelists=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Ocean AWS resource.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_aws.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[dict] autoscaler: Describes the Ocean Kubernetes autoscaler.
        :param pulumi.Input[list] blacklists: Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        :param pulumi.Input[str] controller_id: The ocean cluster identifier. Example: `ocean.k8s`
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[bool] fallback_to_ondemand: If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
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
        :param pulumi.Input[float] spot_percentage: The percentage of Spot instances the cluster should maintain. Min 0, max 100.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[list] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, OCean will utilize them before launching Spot instances.
        :param pulumi.Input[list] whitelists: Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.

        The **autoscaler** object supports the following:

          * `autoscaleCooldown` (`pulumi.Input[float]`) - Cooldown period between scaling actions.
          * `autoscaleDown` (`pulumi.Input[dict]`) - Auto Scaling scale down operations.
            * `evaluationPeriods` (`pulumi.Input[float]`) - The number of evaluation periods that should accumulate before a scale down action takes place.
            * `maxScaleDownPercentage` (`pulumi.Input[float]`) - Would represent the maximum % to scale-down. Number between 1-100.

          * `autoscaleHeadroom` (`pulumi.Input[dict]`) - Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
            * `cpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
            * `gpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of GPUS to allocate the headroom.
            * `memoryPerUnit` (`pulumi.Input[float]`) - Optionally configure the amount of memory (MB) to allocate the headroom.
            * `numOfUnits` (`pulumi.Input[float]`) - The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`) - Automatically configure and optimize headroom resources.
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`) - Enable the Ocean Kubernetes autoscaler.
          * `resourceLimits` (`pulumi.Input[dict]`) - Optionally set upper and lower bounds on the resource usage of the cluster.
            * `maxMemoryGib` (`pulumi.Input[float]`) - The maximum memory in GiB units that can be allocated to the cluster.
            * `maxVcpu` (`pulumi.Input[float]`) - The maximum cpu in vCPU units that can be allocated to the cluster.

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`) - Required if type is set to TARGET_GROUP
          * `name` (`pulumi.Input[str]`) - Required if type is set to CLASSIC
          * `type` (`pulumi.Input[str]`) - Can be set to CLASSIC or TARGET_GROUP

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
    def get(resource_name, id, opts=None, associate_public_ip_address=None, autoscaler=None, blacklists=None, controller_id=None, desired_capacity=None, draining_timeout=None, ebs_optimized=None, fallback_to_ondemand=None, iam_instance_profile=None, image_id=None, key_name=None, load_balancers=None, max_size=None, min_size=None, monitoring=None, name=None, region=None, root_volume_size=None, security_groups=None, spot_percentage=None, subnet_ids=None, tags=None, update_policy=None, user_data=None, utilize_reserved_instances=None, whitelists=None):
        """
        Get an existing Ocean resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[dict] autoscaler: Describes the Ocean Kubernetes autoscaler.
        :param pulumi.Input[list] blacklists: Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
        :param pulumi.Input[str] controller_id: The ocean cluster identifier. Example: `ocean.k8s`
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[float] draining_timeout: The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
        :param pulumi.Input[bool] ebs_optimized: Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
        :param pulumi.Input[bool] fallback_to_ondemand: If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
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
        :param pulumi.Input[float] spot_percentage: The percentage of Spot instances the cluster should maintain. Min 0, max 100.
        :param pulumi.Input[list] subnet_ids: A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
        :param pulumi.Input[list] tags: Optionally adds tags to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        :param pulumi.Input[bool] utilize_reserved_instances: If Reserved instances exist, OCean will utilize them before launching Spot instances.
        :param pulumi.Input[list] whitelists: Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.

        The **autoscaler** object supports the following:

          * `autoscaleCooldown` (`pulumi.Input[float]`) - Cooldown period between scaling actions.
          * `autoscaleDown` (`pulumi.Input[dict]`) - Auto Scaling scale down operations.
            * `evaluationPeriods` (`pulumi.Input[float]`) - The number of evaluation periods that should accumulate before a scale down action takes place.
            * `maxScaleDownPercentage` (`pulumi.Input[float]`) - Would represent the maximum % to scale-down. Number between 1-100.

          * `autoscaleHeadroom` (`pulumi.Input[dict]`) - Spare resource capacity management enabling fast assignment of Pods without waiting for new resources to launch.
            * `cpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of CPUs to allocate the headroom. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
            * `gpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of GPUS to allocate the headroom.
            * `memoryPerUnit` (`pulumi.Input[float]`) - Optionally configure the amount of memory (MB) to allocate the headroom.
            * `numOfUnits` (`pulumi.Input[float]`) - The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`) - Automatically configure and optimize headroom resources.
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`) - Enable the Ocean Kubernetes autoscaler.
          * `resourceLimits` (`pulumi.Input[dict]`) - Optionally set upper and lower bounds on the resource usage of the cluster.
            * `maxMemoryGib` (`pulumi.Input[float]`) - The maximum memory in GiB units that can be allocated to the cluster.
            * `maxVcpu` (`pulumi.Input[float]`) - The maximum cpu in vCPU units that can be allocated to the cluster.

        The **load_balancers** object supports the following:

          * `arn` (`pulumi.Input[str]`) - Required if type is set to TARGET_GROUP
          * `name` (`pulumi.Input[str]`) - Required if type is set to CLASSIC
          * `type` (`pulumi.Input[str]`) - Can be set to CLASSIC or TARGET_GROUP

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

