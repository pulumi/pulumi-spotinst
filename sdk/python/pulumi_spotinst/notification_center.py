# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['NotificationCenterArgs', 'NotificationCenter']

@pulumi.input_type
class NotificationCenterArgs:
    def __init__(__self__, *,
                 compute_policy_config: pulumi.Input['NotificationCenterComputePolicyConfigArgs'],
                 privacy_level: pulumi.Input[_builtins.str],
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 is_active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 registered_users: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]] = None,
                 subscriptions: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]] = None):
        """
        The set of arguments for constructing a NotificationCenter resource.
        """
        pulumi.set(__self__, "compute_policy_config", compute_policy_config)
        pulumi.set(__self__, "privacy_level", privacy_level)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_active is not None:
            pulumi.set(__self__, "is_active", is_active)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if registered_users is not None:
            pulumi.set(__self__, "registered_users", registered_users)
        if subscriptions is not None:
            pulumi.set(__self__, "subscriptions", subscriptions)

    @_builtins.property
    @pulumi.getter(name="computePolicyConfig")
    def compute_policy_config(self) -> pulumi.Input['NotificationCenterComputePolicyConfigArgs']:
        return pulumi.get(self, "compute_policy_config")

    @compute_policy_config.setter
    def compute_policy_config(self, value: pulumi.Input['NotificationCenterComputePolicyConfigArgs']):
        pulumi.set(self, "compute_policy_config", value)

    @_builtins.property
    @pulumi.getter(name="privacyLevel")
    def privacy_level(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "privacy_level")

    @privacy_level.setter
    def privacy_level(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "privacy_level", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="isActive")
    def is_active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "is_active")

    @is_active.setter
    def is_active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "is_active", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="registeredUsers")
    def registered_users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]]:
        return pulumi.get(self, "registered_users")

    @registered_users.setter
    def registered_users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]]):
        pulumi.set(self, "registered_users", value)

    @_builtins.property
    @pulumi.getter
    def subscriptions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]]:
        return pulumi.get(self, "subscriptions")

    @subscriptions.setter
    def subscriptions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]]):
        pulumi.set(self, "subscriptions", value)


@pulumi.input_type
class _NotificationCenterState:
    def __init__(__self__, *,
                 compute_policy_config: Optional[pulumi.Input['NotificationCenterComputePolicyConfigArgs']] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 is_active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 privacy_level: Optional[pulumi.Input[_builtins.str]] = None,
                 registered_users: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]] = None,
                 subscriptions: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]] = None):
        """
        Input properties used for looking up and filtering NotificationCenter resources.
        """
        if compute_policy_config is not None:
            pulumi.set(__self__, "compute_policy_config", compute_policy_config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_active is not None:
            pulumi.set(__self__, "is_active", is_active)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if privacy_level is not None:
            pulumi.set(__self__, "privacy_level", privacy_level)
        if registered_users is not None:
            pulumi.set(__self__, "registered_users", registered_users)
        if subscriptions is not None:
            pulumi.set(__self__, "subscriptions", subscriptions)

    @_builtins.property
    @pulumi.getter(name="computePolicyConfig")
    def compute_policy_config(self) -> Optional[pulumi.Input['NotificationCenterComputePolicyConfigArgs']]:
        return pulumi.get(self, "compute_policy_config")

    @compute_policy_config.setter
    def compute_policy_config(self, value: Optional[pulumi.Input['NotificationCenterComputePolicyConfigArgs']]):
        pulumi.set(self, "compute_policy_config", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="isActive")
    def is_active(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "is_active")

    @is_active.setter
    def is_active(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "is_active", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="privacyLevel")
    def privacy_level(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "privacy_level")

    @privacy_level.setter
    def privacy_level(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "privacy_level", value)

    @_builtins.property
    @pulumi.getter(name="registeredUsers")
    def registered_users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]]:
        return pulumi.get(self, "registered_users")

    @registered_users.setter
    def registered_users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterRegisteredUserArgs']]]]):
        pulumi.set(self, "registered_users", value)

    @_builtins.property
    @pulumi.getter
    def subscriptions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]]:
        return pulumi.get(self, "subscriptions")

    @subscriptions.setter
    def subscriptions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationCenterSubscriptionArgs']]]]):
        pulumi.set(self, "subscriptions", value)


@pulumi.type_token("spotinst:index/notificationCenter:NotificationCenter")
class NotificationCenter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute_policy_config: Optional[pulumi.Input[Union['NotificationCenterComputePolicyConfigArgs', 'NotificationCenterComputePolicyConfigArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 is_active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 privacy_level: Optional[pulumi.Input[_builtins.str]] = None,
                 registered_users: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterRegisteredUserArgs', 'NotificationCenterRegisteredUserArgsDict']]]]] = None,
                 subscriptions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterSubscriptionArgs', 'NotificationCenterSubscriptionArgsDict']]]]] = None,
                 __props__=None):
        """
        Create a NotificationCenter resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationCenterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a NotificationCenter resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param NotificationCenterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationCenterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute_policy_config: Optional[pulumi.Input[Union['NotificationCenterComputePolicyConfigArgs', 'NotificationCenterComputePolicyConfigArgsDict']]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 is_active: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 privacy_level: Optional[pulumi.Input[_builtins.str]] = None,
                 registered_users: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterRegisteredUserArgs', 'NotificationCenterRegisteredUserArgsDict']]]]] = None,
                 subscriptions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterSubscriptionArgs', 'NotificationCenterSubscriptionArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationCenterArgs.__new__(NotificationCenterArgs)

            if compute_policy_config is None and not opts.urn:
                raise TypeError("Missing required property 'compute_policy_config'")
            __props__.__dict__["compute_policy_config"] = compute_policy_config
            __props__.__dict__["description"] = description
            __props__.__dict__["is_active"] = is_active
            __props__.__dict__["name"] = name
            if privacy_level is None and not opts.urn:
                raise TypeError("Missing required property 'privacy_level'")
            __props__.__dict__["privacy_level"] = privacy_level
            __props__.__dict__["registered_users"] = registered_users
            __props__.__dict__["subscriptions"] = subscriptions
        super(NotificationCenter, __self__).__init__(
            'spotinst:index/notificationCenter:NotificationCenter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compute_policy_config: Optional[pulumi.Input[Union['NotificationCenterComputePolicyConfigArgs', 'NotificationCenterComputePolicyConfigArgsDict']]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            is_active: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            privacy_level: Optional[pulumi.Input[_builtins.str]] = None,
            registered_users: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterRegisteredUserArgs', 'NotificationCenterRegisteredUserArgsDict']]]]] = None,
            subscriptions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['NotificationCenterSubscriptionArgs', 'NotificationCenterSubscriptionArgsDict']]]]] = None) -> 'NotificationCenter':
        """
        Get an existing NotificationCenter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationCenterState.__new__(_NotificationCenterState)

        __props__.__dict__["compute_policy_config"] = compute_policy_config
        __props__.__dict__["description"] = description
        __props__.__dict__["is_active"] = is_active
        __props__.__dict__["name"] = name
        __props__.__dict__["privacy_level"] = privacy_level
        __props__.__dict__["registered_users"] = registered_users
        __props__.__dict__["subscriptions"] = subscriptions
        return NotificationCenter(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="computePolicyConfig")
    def compute_policy_config(self) -> pulumi.Output['outputs.NotificationCenterComputePolicyConfig']:
        return pulumi.get(self, "compute_policy_config")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="isActive")
    def is_active(self) -> pulumi.Output[Optional[_builtins.bool]]:
        return pulumi.get(self, "is_active")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="privacyLevel")
    def privacy_level(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "privacy_level")

    @_builtins.property
    @pulumi.getter(name="registeredUsers")
    def registered_users(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationCenterRegisteredUser']]]:
        return pulumi.get(self, "registered_users")

    @_builtins.property
    @pulumi.getter
    def subscriptions(self) -> pulumi.Output[Optional[Sequence['outputs.NotificationCenterSubscription']]]:
        return pulumi.get(self, "subscriptions")

