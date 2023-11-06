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

__all__ = ['UserGroupArgs', 'UserGroup']

@pulumi.input_type
class UserGroupArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a UserGroup resource.
        :param pulumi.Input[str] description: User group description.
        :param pulumi.Input[str] name: User group name.
        :param pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The users to register under the created group
               (should be existing users only).
        """
        UserGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            name=name,
            policies=policies,
            user_ids=user_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]] = None,
             user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if user_ids is None and 'userIds' in kwargs:
            user_ids = kwargs['userIds']

        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if user_ids is not None:
            _setter("user_ids", user_ids)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        User group description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        User group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The users to register under the created group
        (should be existing users only).
        """
        return pulumi.get(self, "user_ids")

    @user_ids.setter
    def user_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_ids", value)


@pulumi.input_type
class _UserGroupState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering UserGroup resources.
        :param pulumi.Input[str] description: User group description.
        :param pulumi.Input[str] name: User group name.
        :param pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The users to register under the created group
               (should be existing users only).
        """
        _UserGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            name=name,
            policies=policies,
            user_ids=user_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]] = None,
             user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if user_ids is None and 'userIds' in kwargs:
            user_ids = kwargs['userIds']

        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if user_ids is not None:
            _setter("user_ids", user_ids)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        User group description.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        User group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserGroupPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The users to register under the created group
        (should be existing users only).
        """
        return pulumi.get(self, "user_ids")

    @user_ids.setter
    def user_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_ids", value)


class UserGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserGroupPolicyArgs']]]]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Spotinst user-group of your Spot organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_user_group = spotinst.organization.UserGroup("terraformUserGroup",
            description="user group by terraform",
            policies=[spotinst.organization.UserGroupPolicyArgs(
                account_ids=["act-a1b2c3d4"],
                policy_id="pol-vv7d8c06",
            )],
            user_ids=["u-372gf6ae"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: User group description.
        :param pulumi.Input[str] name: User group name.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserGroupPolicyArgs']]]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The users to register under the created group
               (should be existing users only).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[UserGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst user-group of your Spot organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_user_group = spotinst.organization.UserGroup("terraformUserGroup",
            description="user group by terraform",
            policies=[spotinst.organization.UserGroupPolicyArgs(
                account_ids=["act-a1b2c3d4"],
                policy_id="pol-vv7d8c06",
            )],
            user_ids=["u-372gf6ae"])
        ```

        :param str resource_name: The name of the resource.
        :param UserGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserGroupPolicyArgs']]]]] = None,
                 user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserGroupArgs.__new__(UserGroupArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["policies"] = policies
            __props__.__dict__["user_ids"] = user_ids
        super(UserGroup, __self__).__init__(
            'spotinst:organization/userGroup:UserGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserGroupPolicyArgs']]]]] = None,
            user_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'UserGroup':
        """
        Get an existing UserGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: User group description.
        :param pulumi.Input[str] name: User group name.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserGroupPolicyArgs']]]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_ids: The users to register under the created group
               (should be existing users only).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserGroupState.__new__(_UserGroupState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
        __props__.__dict__["user_ids"] = user_ids
        return UserGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        User group description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        User group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Optional[Sequence['outputs.UserGroupPolicy']]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter(name="userIds")
    def user_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The users to register under the created group
        (should be existing users only).
        """
        return pulumi.get(self, "user_ids")

