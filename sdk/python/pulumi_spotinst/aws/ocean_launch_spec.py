# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class OceanLaunchSpec(pulumi.CustomResource):
    autoscale_headrooms: pulumi.Output[list]
    """
    Set custom headroom per launch spec. provide list of headrooms object.

      * `cpuPerUnit` (`float`) - Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
      * `gpuPerUnit` (`float`) - Optionally configure the number of GPUS to allocate for each headroom unit.
      * `memoryPerUnit` (`float`) - Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
      * `numOfUnits` (`float`) - The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.
    """
    elastic_ip_pools: pulumi.Output[list]
    """
    Assign an Elastic IP to the instances spun by the launch spec. Can be null.

      * `tagSelector` (`dict`) - Key-value object, which defines an Elastic IP from the customer pool. Can be null.
        * `tagKey` (`str`) - Elastic IP tag key. The launch spec will consider all elastic IPs tagged with this tag as a part of the elastic IP pool to use.
        * `tagValue` (`str`) - Elastic IP tag value. Can be null.
    """
    iam_instance_profile: pulumi.Output[str]
    """
    The ARN or name of an IAM instance profile to associate with launched instances.
    """
    image_id: pulumi.Output[str]
    """
    ID of the image used to launch the instances.
    """
    labels: pulumi.Output[list]
    """
    Optionally adds labels to instances launched in an Ocean cluster.

      * `key` (`str`) - The tag key.
      * `value` (`str`) - The tag value.
    """
    name: pulumi.Output[str]
    """
    Set Launch Specification name 
    """
    ocean_id: pulumi.Output[str]
    """
    The ocean cluster you wish to 
    """
    resource_limits: pulumi.Output[list]
    root_volume_size: pulumi.Output[float]
    """
    Set root volume size (in GB).
    """
    security_groups: pulumi.Output[list]
    """
    Optionally adds security group IDs.
    """
    subnet_ids: pulumi.Output[list]
    """
    Set subnets in launchSpec. Each element in array should be subnet ID.
    """
    tags: pulumi.Output[list]
    """
    A key/value mapping of tags to assign to the resource.

      * `key` (`str`) - The tag key.
      * `value` (`str`) - The tag value.
    """
    taints: pulumi.Output[list]
    """
    Optionally adds labels to instances launched in an Ocean cluster.

      * `effect` (`str`) - The effect of the taint. Valid values: `"NoSchedule"`, `"PreferNoSchedule"`, `"NoExecute"`.
      * `key` (`str`) - The tag key.
      * `value` (`str`) - The tag value.
    """
    user_data: pulumi.Output[str]
    """
    Base64-encoded MIME user data to make available to the instances.
    """
    def __init__(__self__, resource_name, opts=None, autoscale_headrooms=None, elastic_ip_pools=None, iam_instance_profile=None, image_id=None, labels=None, name=None, ocean_id=None, resource_limits=None, root_volume_size=None, security_groups=None, subnet_ids=None, tags=None, taints=None, user_data=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a custom Spotinst Ocean AWS Launch Spec resource.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.aws.OceanLaunchSpec("example",
            autoscale_headrooms=[{
                "cpuPerUnit": 1000,
                "gpuPerUnit": 0,
                "memoryPerUnit": 2048,
                "numOfUnits": 5,
            }],
            elastic_ip_pools=[{
                "tagSelector": {
                    "tagKey": "key",
                    "tagValue": "value",
                },
            }],
            iam_instance_profile="iam-profile",
            image_id="ami-123456",
            labels=[{
                "key": "fakeKey",
                "value": "fakeValue",
            }],
            ocean_id="o-123456",
            resource_limits=[{
                "maxInstanceCount": 4,
            }],
            root_volume_size=30,
            security_groups=["sg-987654321"],
            subnet_ids=["subnet-1234"],
            tags=[{
                "key": "Env",
                "value": "production",
            }],
            taints=[{
                "effect": "NoExecute",
                "key": "taint key updated",
                "value": "taint value updated",
            }],
            user_data="echo hello world")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[list] elastic_ip_pools: Assign an Elastic IP to the instances spun by the launch spec. Can be null.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[list] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] name: Set Launch Specification name 
        :param pulumi.Input[str] ocean_id: The ocean cluster you wish to 
        :param pulumi.Input[float] root_volume_size: Set root volume size (in GB).
        :param pulumi.Input[list] security_groups: Optionally adds security group IDs.
        :param pulumi.Input[list] subnet_ids: Set subnets in launchSpec. Each element in array should be subnet ID.
        :param pulumi.Input[list] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[list] taints: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.

        The **autoscale_headrooms** object supports the following:

          * `cpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
          * `gpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of GPUS to allocate for each headroom unit.
          * `memoryPerUnit` (`pulumi.Input[float]`) - Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
          * `numOfUnits` (`pulumi.Input[float]`) - The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.

        The **elastic_ip_pools** object supports the following:

          * `tagSelector` (`pulumi.Input[dict]`) - Key-value object, which defines an Elastic IP from the customer pool. Can be null.
            * `tagKey` (`pulumi.Input[str]`) - Elastic IP tag key. The launch spec will consider all elastic IPs tagged with this tag as a part of the elastic IP pool to use.
            * `tagValue` (`pulumi.Input[str]`) - Elastic IP tag value. Can be null.

        The **labels** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **resource_limits** object supports the following:

          * `maxInstanceCount` (`pulumi.Input[float]`) - set a maximum number of instances per launch specification. Can be null. If set, value must be greater than or equal to 0.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **taints** object supports the following:

          * `effect` (`pulumi.Input[str]`) - The effect of the taint. Valid values: `"NoSchedule"`, `"PreferNoSchedule"`, `"NoExecute"`.
          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.
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

            __props__['autoscale_headrooms'] = autoscale_headrooms
            __props__['elastic_ip_pools'] = elastic_ip_pools
            __props__['iam_instance_profile'] = iam_instance_profile
            __props__['image_id'] = image_id
            __props__['labels'] = labels
            __props__['name'] = name
            if ocean_id is None:
                raise TypeError("Missing required property 'ocean_id'")
            __props__['ocean_id'] = ocean_id
            __props__['resource_limits'] = resource_limits
            __props__['root_volume_size'] = root_volume_size
            __props__['security_groups'] = security_groups
            __props__['subnet_ids'] = subnet_ids
            __props__['tags'] = tags
            __props__['taints'] = taints
            __props__['user_data'] = user_data
        super(OceanLaunchSpec, __self__).__init__(
            'spotinst:aws/oceanLaunchSpec:OceanLaunchSpec',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, autoscale_headrooms=None, elastic_ip_pools=None, iam_instance_profile=None, image_id=None, labels=None, name=None, ocean_id=None, resource_limits=None, root_volume_size=None, security_groups=None, subnet_ids=None, tags=None, taints=None, user_data=None):
        """
        Get an existing OceanLaunchSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[list] elastic_ip_pools: Assign an Elastic IP to the instances spun by the launch spec. Can be null.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[list] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] name: Set Launch Specification name 
        :param pulumi.Input[str] ocean_id: The ocean cluster you wish to 
        :param pulumi.Input[float] root_volume_size: Set root volume size (in GB).
        :param pulumi.Input[list] security_groups: Optionally adds security group IDs.
        :param pulumi.Input[list] subnet_ids: Set subnets in launchSpec. Each element in array should be subnet ID.
        :param pulumi.Input[list] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[list] taints: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.

        The **autoscale_headrooms** object supports the following:

          * `cpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in millicores, where 1000 millicores = 1 vCPU.
          * `gpuPerUnit` (`pulumi.Input[float]`) - Optionally configure the number of GPUS to allocate for each headroom unit.
          * `memoryPerUnit` (`pulumi.Input[float]`) - Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
          * `numOfUnits` (`pulumi.Input[float]`) - The number of units to retain as headroom, where each unit has the defined headroom CPU, memory and GPU.

        The **elastic_ip_pools** object supports the following:

          * `tagSelector` (`pulumi.Input[dict]`) - Key-value object, which defines an Elastic IP from the customer pool. Can be null.
            * `tagKey` (`pulumi.Input[str]`) - Elastic IP tag key. The launch spec will consider all elastic IPs tagged with this tag as a part of the elastic IP pool to use.
            * `tagValue` (`pulumi.Input[str]`) - Elastic IP tag value. Can be null.

        The **labels** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **resource_limits** object supports the following:

          * `maxInstanceCount` (`pulumi.Input[float]`) - set a maximum number of instances per launch specification. Can be null. If set, value must be greater than or equal to 0.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.

        The **taints** object supports the following:

          * `effect` (`pulumi.Input[str]`) - The effect of the taint. Valid values: `"NoSchedule"`, `"PreferNoSchedule"`, `"NoExecute"`.
          * `key` (`pulumi.Input[str]`) - The tag key.
          * `value` (`pulumi.Input[str]`) - The tag value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["autoscale_headrooms"] = autoscale_headrooms
        __props__["elastic_ip_pools"] = elastic_ip_pools
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["ocean_id"] = ocean_id
        __props__["resource_limits"] = resource_limits
        __props__["root_volume_size"] = root_volume_size
        __props__["security_groups"] = security_groups
        __props__["subnet_ids"] = subnet_ids
        __props__["tags"] = tags
        __props__["taints"] = taints
        __props__["user_data"] = user_data
        return OceanLaunchSpec(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

