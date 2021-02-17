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
                 associate_public_ip_address: Optional[pulumi.Input[bool]] = None,
                 autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
                 block_device_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]]] = None,
                 elastic_ip_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecElasticIpPoolArgs']]]]] = None,
                 iam_instance_profile: Optional[pulumi.Input[str]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 resource_limits: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecResourceLimitArgs']]]]] = None,
                 restrict_scale_down: Optional[pulumi.Input[bool]] = None,
                 root_volume_size: Optional[pulumi.Input[int]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 strategies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecStrategyArgs']]]]] = None,
                 subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a custom Spotinst Ocean AWS Launch Spec resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.aws.OceanLaunchSpec("example",
            associate_public_ip_address=True,
            autoscale_headrooms=[spotinst.aws.OceanLaunchSpecAutoscaleHeadroomArgs(
                cpu_per_unit=1000,
                gpu_per_unit=0,
                memory_per_unit=2048,
                num_of_units=5,
            )],
            block_device_mappings=[spotinst.aws.OceanLaunchSpecBlockDeviceMappingArgs(
                device_name="/dev/xvda1",
                ebs=spotinst.aws.OceanLaunchSpecBlockDeviceMappingEbsArgs(
                    delete_on_termination=True,
                    dynamic_volume_size=spotinst.aws.OceanLaunchSpecBlockDeviceMappingEbsDynamicVolumeSizeArgs(
                        base_size=50,
                        resource="CPU",
                        size_per_resource_unit=20,
                    ),
                    encrypted=False,
                    throughput=500,
                    volume_size=50,
                    volume_type="gp2",
                ),
            )],
            elastic_ip_pools=[spotinst.aws.OceanLaunchSpecElasticIpPoolArgs(
                tag_selector=spotinst.aws.OceanLaunchSpecElasticIpPoolTagSelectorArgs(
                    tag_key="key",
                    tag_value="value",
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
            labels=[spotinst.aws.OceanLaunchSpecLabelArgs(
                key="fakeKey",
                value="fakeValue",
            )],
            ocean_id="o-123456",
            resource_limits=[spotinst.aws.OceanLaunchSpecResourceLimitArgs(
                max_instance_count=4,
            )],
            restrict_scale_down=True,
            root_volume_size=30,
            security_groups=["sg-987654321"],
            strategies=[spotinst.aws.OceanLaunchSpecStrategyArgs(
                spot_percentage=70,
            )],
            subnet_ids=["subnet-1234"],
            tags=[spotinst.aws.OceanLaunchSpecTagArgs(
                key="Env",
                value="production",
            )],
            taints=[spotinst.aws.OceanLaunchSpecTaintArgs(
                effect="NoExecute",
                key="taint key updated",
                value="taint value updated",
            )],
            user_data="echo hello world")
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_aws_launch_spec["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]] block_device_mappings: Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecElasticIpPoolArgs']]]] elastic_ip_pools: Assign an Elastic IP to the instances spun by the launch spec. Can be null.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] name: Set Launch Specification name
        :param pulumi.Input[str] ocean_id: The ocean cluster you wish to
        :param pulumi.Input[bool] restrict_scale_down: Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        :param pulumi.Input[int] root_volume_size: Set root volume size (in GB).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Optionally adds security group IDs.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecStrategyArgs']]]] strategies: (Optional)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Set subnets in launchSpec. Each element in array should be subnet ID.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Optionally adds labels to instances launched in an Ocean cluster.
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

            __props__['associate_public_ip_address'] = associate_public_ip_address
            __props__['autoscale_headrooms'] = autoscale_headrooms
            __props__['block_device_mappings'] = block_device_mappings
            __props__['elastic_ip_pools'] = elastic_ip_pools
            __props__['iam_instance_profile'] = iam_instance_profile
            __props__['image_id'] = image_id
            __props__['instance_types'] = instance_types
            __props__['labels'] = labels
            __props__['name'] = name
            if ocean_id is None and not opts.urn:
                raise TypeError("Missing required property 'ocean_id'")
            __props__['ocean_id'] = ocean_id
            __props__['resource_limits'] = resource_limits
            __props__['restrict_scale_down'] = restrict_scale_down
            __props__['root_volume_size'] = root_volume_size
            __props__['security_groups'] = security_groups
            __props__['strategies'] = strategies
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
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            associate_public_ip_address: Optional[pulumi.Input[bool]] = None,
            autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
            block_device_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]]] = None,
            elastic_ip_pools: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecElasticIpPoolArgs']]]]] = None,
            iam_instance_profile: Optional[pulumi.Input[str]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            instance_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ocean_id: Optional[pulumi.Input[str]] = None,
            resource_limits: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecResourceLimitArgs']]]]] = None,
            restrict_scale_down: Optional[pulumi.Input[bool]] = None,
            root_volume_size: Optional[pulumi.Input[int]] = None,
            security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            strategies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecStrategyArgs']]]]] = None,
            subnet_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]]] = None,
            taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None,
            user_data: Optional[pulumi.Input[str]] = None) -> 'OceanLaunchSpec':
        """
        Get an existing OceanLaunchSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] associate_public_ip_address: Configure public IP address allocation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecBlockDeviceMappingArgs']]]] block_device_mappings: Object. Array list of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecElasticIpPoolArgs']]]] elastic_ip_pools: Assign an Elastic IP to the instances spun by the launch spec. Can be null.
        :param pulumi.Input[str] iam_instance_profile: The ARN or name of an IAM instance profile to associate with launched instances.
        :param pulumi.Input[str] image_id: ID of the image used to launch the instances.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types: A list of instance types allowed to be provisioned for pods pending under the specified launch specification. The list overrides the list defined for the Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] name: Set Launch Specification name
        :param pulumi.Input[str] ocean_id: The ocean cluster you wish to
        :param pulumi.Input[bool] restrict_scale_down: Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        :param pulumi.Input[int] root_volume_size: Set root volume size (in GB).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: Optionally adds security group IDs.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecStrategyArgs']]]] strategies: (Optional)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnet_ids: Set subnets in launchSpec. Each element in array should be subnet ID.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTagArgs']]]] tags: A key/value mapping of tags to assign to the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["associate_public_ip_address"] = associate_public_ip_address
        __props__["autoscale_headrooms"] = autoscale_headrooms
        __props__["block_device_mappings"] = block_device_mappings
        __props__["elastic_ip_pools"] = elastic_ip_pools
        __props__["iam_instance_profile"] = iam_instance_profile
        __props__["image_id"] = image_id
        __props__["instance_types"] = instance_types
        __props__["labels"] = labels
        __props__["name"] = name
        __props__["ocean_id"] = ocean_id
        __props__["resource_limits"] = resource_limits
        __props__["restrict_scale_down"] = restrict_scale_down
        __props__["root_volume_size"] = root_volume_size
        __props__["security_groups"] = security_groups
        __props__["strategies"] = strategies
        __props__["subnet_ids"] = subnet_ids
        __props__["tags"] = tags
        __props__["taints"] = taints
        __props__["user_data"] = user_data
        return OceanLaunchSpec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associatePublicIpAddress")
    def associate_public_ip_address(self) -> pulumi.Output[Optional[bool]]:
        """
        Configure public IP address allocation.
        """
        return pulumi.get(self, "associate_public_ip_address")

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
    @pulumi.getter(name="elasticIpPools")
    def elastic_ip_pools(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecElasticIpPool']]]:
        """
        Assign an Elastic IP to the instances spun by the launch spec. Can be null.
        """
        return pulumi.get(self, "elastic_ip_pools")

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
    def labels(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecLabel']]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Set Launch Specification name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> pulumi.Output[str]:
        """
        The ocean cluster you wish to
        """
        return pulumi.get(self, "ocean_id")

    @property
    @pulumi.getter(name="resourceLimits")
    def resource_limits(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecResourceLimit']]]:
        return pulumi.get(self, "resource_limits")

    @property
    @pulumi.getter(name="restrictScaleDown")
    def restrict_scale_down(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. When set to "True", VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        """
        return pulumi.get(self, "restrict_scale_down")

    @property
    @pulumi.getter(name="rootVolumeSize")
    def root_volume_size(self) -> pulumi.Output[Optional[int]]:
        """
        Set root volume size (in GB).
        """
        return pulumi.get(self, "root_volume_size")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Optionally adds security group IDs.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def strategies(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecStrategy']]]:
        """
        (Optional)
        """
        return pulumi.get(self, "strategies")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Set subnets in launchSpec. Each element in array should be subnet ID.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecTag']]]:
        """
        A key/value mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def taints(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecTaint']]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "taints")

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

