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

__all__ = ['OceanLaunchSpec']


class OceanLaunchSpec(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 attributes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAttributeArgs']]]]] = None,
                 autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
                 block_device_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]]] = None,
                 iam_instance_profile: Optional[pulumi.Input[str]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a custom Spotinst Ocean ECS Launch Spec resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.ecs.OceanLaunchSpec("example",
            attributes=[spotinst.ecs.OceanLaunchSpecAttributeArgs(
                key="fakeKey",
                value="fakeValue",
            )],
            autoscale_headrooms=[spotinst.ecs.OceanLaunchSpecAutoscaleHeadroomArgs(
                cpu_per_unit=1000,
                memory_per_unit=2048,
                num_of_units=5,
            )],
            block_device_mappings=[spotinst.ecs.OceanLaunchSpecBlockDeviceMappingArgs(
                device_name="/dev/xvda1",
                ebs=spotinst.ecs.OceanLaunchSpecBlockDeviceMappingEbsArgs(
                    delete_on_termination=True,
                    dynamic_volume_size=spotinst.ecs.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs(
                        base_size=50,
                        resource="CPU",
                        size_per_resource_unit=20,
                    ),
                    encrypted=False,
                    volume_size=50,
                    volume_type="gp2",
                ),
            )],
            iam_instance_profile="iam-profile",
            image_id="ami-123456",
            instance_types=[
                "m3.large",
                "m3.xlarge",
                "m3.2xlarge",
                "m4.large",
                "m4.xlarge",
                "m4.4xlarge",
                "m4.2xlarge",
                "m4.10xlarge",
                "m4.16xlarge",
                "m5.large",
                "m5.xlarge",
                "m5.2xlarge",
                "m5.4xlarge",
                "m5.12xlarge",
                "m5.24xlarge",
            ],
            ocean_id="o-123456",
            security_group_ids=["awseb-12345"],
            tags=[spotinst.ecs.OceanLaunchSpecTagArgs(
                key="Env",
                value="production",
            )],
            user_data="echo hello world")
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_ecs_launch_spec["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAttributeArgs']]]] attributes: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]] block_device_mappings: Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        :param pulumi.Input[str] name: The Ocean Launch Specification name.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID .
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security group ids.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
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

            __props__['attributes'] = attributes
            __props__['autoscale_headrooms'] = autoscale_headrooms
            __props__['block_device_mappings'] = block_device_mappings
            __props__['iam_instance_profile'] = iam_instance_profile
            __props__['image_id'] = image_id
            __props__['instance_types'] = instance_types
            __props__['name'] = name
            if ocean_id is None:
                raise TypeError("Missing required property 'ocean_id'")
            __props__['ocean_id'] = ocean_id
            __props__['security_group_ids'] = security_group_ids
            __props__['tags'] = tags
            __props__['user_data'] = user_data
        super(OceanLaunchSpec, __self__).__init__(
            'spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            attributes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAttributeArgs']]]]] = None,
            autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
            block_device_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]]] = None,
            iam_instance_profile: Optional[pulumi.Input[str]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ocean_id: Optional[pulumi.Input[str]] = None,
            security_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]]] = None,
            user_data: Optional[pulumi.Input[str]] = None) -> 'OceanLaunchSpec':
        """
        Get an existing OceanLaunchSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAttributeArgs']]]] attributes: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]] block_device_mappings: Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        :param pulumi.Input[str] name: The Ocean Launch Specification name.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID .
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_group_ids: One or more security group ids.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["attributes"] = attributes
        __props__["autoscale_headrooms"] = autoscale_headrooms
        __props__["block_device_mappings"] = block_device_mappings
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["instance_types"] = instance_types
        __props__["name"] = name
        __props__["ocean_id"] = ocean_id
        __props__["security_group_ids"] = security_group_ids
        __props__["tags"] = tags
        __props__["user_data"] = user_data
        return OceanLaunchSpec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def attributes(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecAttribute']]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter(name="autoscaleHeadrooms")
    def autoscale_headrooms(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecAutoscaleHeadroom']]]:
        """
        Set custom headroom per launch spec. provide list of headrooms object.
        """
        return pulumi.get(self, "autoscale_headrooms")

    @property
    @pulumi.getter(name="blockDeviceMappings")
    def block_device_mappings(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecBlockDeviceMapping']]]:
        """
        Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        """
        return pulumi.get(self, "block_device_mappings")

    @property
    @pulumi.getter(name="iamInstanceProfile")
    def iam_instance_profile(self) -> pulumi.Output[Optional[str]]:
        """
        The ARN or name of an IAM instance profile to associate with launched instances.
        """
        return pulumi.get(self, "iam_instance_profile")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the image used to launch the instances.
        """
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        """
        return pulumi.get(self, "instance_types")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Ocean Launch Specification name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> pulumi.Output[str]:
        """
        The Ocean cluster ID .
        """
        return pulumi.get(self, "ocean_id")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        One or more security group ids.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecTag']]]:
        """
        A key/value mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> pulumi.Output[Optional[str]]:
        """
        Base64-encoded MIME user data to make available to the instances.
        """
        return pulumi.get(self, "user_data")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

