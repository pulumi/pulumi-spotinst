# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SuspensionArgs', 'Suspension']

@pulumi.input_type
class SuspensionArgs:
    def __init__(__self__, *,
                 group_id: pulumi.Input[str],
                 suspensions: pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]):
        """
        The set of arguments for constructing a Suspension resource.
        :param pulumi.Input[str] group_id: Elastigroup ID to apply the suspensions on.
        :param pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]] suspensions: block of single process to suspend.
        """
        SuspensionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            group_id=group_id,
            suspensions=suspensions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             group_id: pulumi.Input[str],
             suspensions: pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]],
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'groupId' in kwargs:
            group_id = kwargs['groupId']

        _setter("group_id", group_id)
        _setter("suspensions", suspensions)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Input[str]:
        """
        Elastigroup ID to apply the suspensions on.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def suspensions(self) -> pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]:
        """
        block of single process to suspend.
        """
        return pulumi.get(self, "suspensions")

    @suspensions.setter
    def suspensions(self, value: pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]):
        pulumi.set(self, "suspensions", value)


@pulumi.input_type
class _SuspensionState:
    def __init__(__self__, *,
                 group_id: Optional[pulumi.Input[str]] = None,
                 suspensions: Optional[pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]] = None):
        """
        Input properties used for looking up and filtering Suspension resources.
        :param pulumi.Input[str] group_id: Elastigroup ID to apply the suspensions on.
        :param pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]] suspensions: block of single process to suspend.
        """
        _SuspensionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            group_id=group_id,
            suspensions=suspensions,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             group_id: Optional[pulumi.Input[str]] = None,
             suspensions: Optional[pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'groupId' in kwargs:
            group_id = kwargs['groupId']

        if group_id is not None:
            _setter("group_id", group_id)
        if suspensions is not None:
            _setter("suspensions", suspensions)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Elastigroup ID to apply the suspensions on.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter
    def suspensions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]]:
        """
        block of single process to suspend.
        """
        return pulumi.get(self, "suspensions")

    @suspensions.setter
    def suspensions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SuspensionSuspensionArgs']]]]):
        pulumi.set(self, "suspensions", value)


class Suspension(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 suspensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SuspensionSuspensionArgs']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # Create a suspension for Elastigroup
        resource_name = spotinst.aws.Suspension("resourceName",
            group_id="sig-12345678",
            suspensions=[
                spotinst.aws.SuspensionSuspensionArgs(
                    name="OUT_OF_STRATEGY",
                ),
                spotinst.aws.SuspensionSuspensionArgs(
                    name="REVERT_PREFERRED",
                ),
                spotinst.aws.SuspensionSuspensionArgs(
                    name="PREVENTIVE_REPLACEMENT",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: Elastigroup ID to apply the suspensions on.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SuspensionSuspensionArgs']]]] suspensions: block of single process to suspend.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SuspensionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # Create a suspension for Elastigroup
        resource_name = spotinst.aws.Suspension("resourceName",
            group_id="sig-12345678",
            suspensions=[
                spotinst.aws.SuspensionSuspensionArgs(
                    name="OUT_OF_STRATEGY",
                ),
                spotinst.aws.SuspensionSuspensionArgs(
                    name="REVERT_PREFERRED",
                ),
                spotinst.aws.SuspensionSuspensionArgs(
                    name="PREVENTIVE_REPLACEMENT",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param SuspensionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SuspensionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SuspensionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 suspensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SuspensionSuspensionArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SuspensionArgs.__new__(SuspensionArgs)

            if group_id is None and not opts.urn:
                raise TypeError("Missing required property 'group_id'")
            __props__.__dict__["group_id"] = group_id
            if suspensions is None and not opts.urn:
                raise TypeError("Missing required property 'suspensions'")
            __props__.__dict__["suspensions"] = suspensions
        super(Suspension, __self__).__init__(
            'spotinst:aws/suspension:Suspension',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            suspensions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SuspensionSuspensionArgs']]]]] = None) -> 'Suspension':
        """
        Get an existing Suspension resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: Elastigroup ID to apply the suspensions on.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SuspensionSuspensionArgs']]]] suspensions: block of single process to suspend.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SuspensionState.__new__(_SuspensionState)

        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["suspensions"] = suspensions
        return Suspension(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        Elastigroup ID to apply the suspensions on.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter
    def suspensions(self) -> pulumi.Output[Sequence['outputs.SuspensionSuspension']]:
        """
        block of single process to suspend.
        """
        return pulumi.get(self, "suspensions")

