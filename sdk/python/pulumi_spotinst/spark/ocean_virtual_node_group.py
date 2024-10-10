# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['OceanVirtualNodeGroupArgs', 'OceanVirtualNodeGroup']

@pulumi.input_type
class OceanVirtualNodeGroupArgs:
    def __init__(__self__, *,
                 ocean_spark_cluster_id: pulumi.Input[str],
                 virtual_node_group_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OceanVirtualNodeGroup resource.
        """
        pulumi.set(__self__, "ocean_spark_cluster_id", ocean_spark_cluster_id)
        pulumi.set(__self__, "virtual_node_group_id", virtual_node_group_id)

    @property
    @pulumi.getter(name="oceanSparkClusterId")
    def ocean_spark_cluster_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "ocean_spark_cluster_id")

    @ocean_spark_cluster_id.setter
    def ocean_spark_cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ocean_spark_cluster_id", value)

    @property
    @pulumi.getter(name="virtualNodeGroupId")
    def virtual_node_group_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "virtual_node_group_id")

    @virtual_node_group_id.setter
    def virtual_node_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "virtual_node_group_id", value)


@pulumi.input_type
class _OceanVirtualNodeGroupState:
    def __init__(__self__, *,
                 ocean_spark_cluster_id: Optional[pulumi.Input[str]] = None,
                 virtual_node_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OceanVirtualNodeGroup resources.
        """
        if ocean_spark_cluster_id is not None:
            pulumi.set(__self__, "ocean_spark_cluster_id", ocean_spark_cluster_id)
        if virtual_node_group_id is not None:
            pulumi.set(__self__, "virtual_node_group_id", virtual_node_group_id)

    @property
    @pulumi.getter(name="oceanSparkClusterId")
    def ocean_spark_cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "ocean_spark_cluster_id")

    @ocean_spark_cluster_id.setter
    def ocean_spark_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ocean_spark_cluster_id", value)

    @property
    @pulumi.getter(name="virtualNodeGroupId")
    def virtual_node_group_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "virtual_node_group_id")

    @virtual_node_group_id.setter
    def virtual_node_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_node_group_id", value)


class OceanVirtualNodeGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ocean_spark_cluster_id: Optional[pulumi.Input[str]] = None,
                 virtual_node_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manage a dedicated Spotinst Ocean Spark Virtual Node Group resource

        ## Prerequisites

        An existing Ocean cluster and Ocean VNG is required by this resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.spark.OceanVirtualNodeGroup("example",
            virtual_node_group_id="vng_id",
            ocean_spark_cluster_id="cluster_id")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OceanVirtualNodeGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manage a dedicated Spotinst Ocean Spark Virtual Node Group resource

        ## Prerequisites

        An existing Ocean cluster and Ocean VNG is required by this resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.spark.OceanVirtualNodeGroup("example",
            virtual_node_group_id="vng_id",
            ocean_spark_cluster_id="cluster_id")
        ```

        :param str resource_name: The name of the resource.
        :param OceanVirtualNodeGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OceanVirtualNodeGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ocean_spark_cluster_id: Optional[pulumi.Input[str]] = None,
                 virtual_node_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OceanVirtualNodeGroupArgs.__new__(OceanVirtualNodeGroupArgs)

            if ocean_spark_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'ocean_spark_cluster_id'")
            __props__.__dict__["ocean_spark_cluster_id"] = ocean_spark_cluster_id
            if virtual_node_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_node_group_id'")
            __props__.__dict__["virtual_node_group_id"] = virtual_node_group_id
        super(OceanVirtualNodeGroup, __self__).__init__(
            'spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ocean_spark_cluster_id: Optional[pulumi.Input[str]] = None,
            virtual_node_group_id: Optional[pulumi.Input[str]] = None) -> 'OceanVirtualNodeGroup':
        """
        Get an existing OceanVirtualNodeGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OceanVirtualNodeGroupState.__new__(_OceanVirtualNodeGroupState)

        __props__.__dict__["ocean_spark_cluster_id"] = ocean_spark_cluster_id
        __props__.__dict__["virtual_node_group_id"] = virtual_node_group_id
        return OceanVirtualNodeGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="oceanSparkClusterId")
    def ocean_spark_cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "ocean_spark_cluster_id")

    @property
    @pulumi.getter(name="virtualNodeGroupId")
    def virtual_node_group_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "virtual_node_group_id")

