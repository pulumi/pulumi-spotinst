# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DataIntegrationArgs', 'DataIntegration']

@pulumi.input_type
class DataIntegrationArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 s3: Optional[pulumi.Input['DataIntegrationS3Args']] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a DataIntegration resource.
        :param pulumi.Input[builtins.str] name: The name of the data integration.
        :param pulumi.Input['DataIntegrationS3Args'] s3: When vendor value is s3, the following fields are included:
               * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        :param pulumi.Input[builtins.str] status: Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if s3 is not None:
            pulumi.set(__self__, "s3", s3)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the data integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def s3(self) -> Optional[pulumi.Input['DataIntegrationS3Args']]:
        """
        When vendor value is s3, the following fields are included:
        * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        """
        return pulumi.get(self, "s3")

    @s3.setter
    def s3(self, value: Optional[pulumi.Input['DataIntegrationS3Args']]):
        pulumi.set(self, "s3", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _DataIntegrationState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 s3: Optional[pulumi.Input['DataIntegrationS3Args']] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering DataIntegration resources.
        :param pulumi.Input[builtins.str] name: The name of the data integration.
        :param pulumi.Input['DataIntegrationS3Args'] s3: When vendor value is s3, the following fields are included:
               * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        :param pulumi.Input[builtins.str] status: Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if s3 is not None:
            pulumi.set(__self__, "s3", s3)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the data integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def s3(self) -> Optional[pulumi.Input['DataIntegrationS3Args']]:
        """
        When vendor value is s3, the following fields are included:
        * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        """
        return pulumi.get(self, "s3")

    @s3.setter
    def s3(self, value: Optional[pulumi.Input['DataIntegrationS3Args']]):
        pulumi.set(self, "s3", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)


class DataIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 s3: Optional[pulumi.Input[Union['DataIntegrationS3Args', 'DataIntegrationS3ArgsDict']]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Provides a Spotinst Data Integration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.DataIntegration("example",
            name="foo",
            status="enabled",
            s3={
                "bucket_name": "terraform-test-do-not-delete",
                "subdir": "terraform-test-data-integration",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: The name of the data integration.
        :param pulumi.Input[Union['DataIntegrationS3Args', 'DataIntegrationS3ArgsDict']] s3: When vendor value is s3, the following fields are included:
               * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        :param pulumi.Input[builtins.str] status: Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DataIntegrationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst Data Integration resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.DataIntegration("example",
            name="foo",
            status="enabled",
            s3={
                "bucket_name": "terraform-test-do-not-delete",
                "subdir": "terraform-test-data-integration",
            })
        ```

        :param str resource_name: The name of the resource.
        :param DataIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 s3: Optional[pulumi.Input[Union['DataIntegrationS3Args', 'DataIntegrationS3ArgsDict']]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataIntegrationArgs.__new__(DataIntegrationArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["s3"] = s3
            __props__.__dict__["status"] = status
        super(DataIntegration, __self__).__init__(
            'spotinst:index/dataIntegration:DataIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            s3: Optional[pulumi.Input[Union['DataIntegrationS3Args', 'DataIntegrationS3ArgsDict']]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None) -> 'DataIntegration':
        """
        Get an existing DataIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: The name of the data integration.
        :param pulumi.Input[Union['DataIntegrationS3Args', 'DataIntegrationS3ArgsDict']] s3: When vendor value is s3, the following fields are included:
               * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        :param pulumi.Input[builtins.str] status: Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataIntegrationState.__new__(_DataIntegrationState)

        __props__.__dict__["name"] = name
        __props__.__dict__["s3"] = s3
        __props__.__dict__["status"] = status
        return DataIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the data integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def s3(self) -> pulumi.Output[Optional['outputs.DataIntegrationS3']]:
        """
        When vendor value is s3, the following fields are included:
        * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
        """
        return pulumi.get(self, "s3")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
        """
        return pulumi.get(self, "status")

