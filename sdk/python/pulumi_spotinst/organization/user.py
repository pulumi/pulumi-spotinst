# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 first_name: pulumi.Input[str],
                 last_name: pulumi.Input[str],
                 password: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] email: Email.
        :param pulumi.Input[str] first_name: The first name of the user.
        :param pulumi.Input[str] last_name: The last name of the user.
        :param pulumi.Input[str] password: Password.
        :param pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[str] role: User's role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "first_name", first_name)
        pulumi.set(__self__, "last_name", last_name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if user_group_ids is not None:
            pulumi.set(__self__, "user_group_ids", user_group_ids)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        Email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> pulumi.Input[str]:
        """
        The first name of the user.
        """
        return pulumi.get(self, "first_name")

    @first_name.setter
    def first_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "first_name", value)

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> pulumi.Input[str]:
        """
        The last name of the user.
        """
        return pulumi.get(self, "last_name")

    @last_name.setter
    def last_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "last_name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        User's role.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="userGroupIds")
    def user_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the user groups to register the given user to (should be existing user groups only)
        """
        return pulumi.get(self, "user_group_ids")

    @user_group_ids.setter
    def user_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_group_ids", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] email: Email.
        :param pulumi.Input[str] first_name: The first name of the user.
        :param pulumi.Input[str] last_name: The last name of the user.
        :param pulumi.Input[str] password: Password.
        :param pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[str] role: User's role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        if email is not None:
            pulumi.set(__self__, "email", email)
        if first_name is not None:
            pulumi.set(__self__, "first_name", first_name)
        if last_name is not None:
            pulumi.set(__self__, "last_name", last_name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if user_group_ids is not None:
            pulumi.set(__self__, "user_group_ids", user_group_ids)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        Email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[pulumi.Input[str]]:
        """
        The first name of the user.
        """
        return pulumi.get(self, "first_name")

    @first_name.setter
    def first_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "first_name", value)

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[pulumi.Input[str]]:
        """
        The last name of the user.
        """
        return pulumi.get(self, "last_name")

    @last_name.setter
    def last_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        User's role.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="userGroupIds")
    def user_group_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of the user groups to register the given user to (should be existing user groups only)
        """
        return pulumi.get(self, "user_group_ids")

    @user_group_ids.setter
    def user_group_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "user_group_ids", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPolicyArgs']]]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Spotinst User in the creator's organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_user = spotinst.organization.User("terraform_user",
            email="abc@xyz.com",
            first_name="test",
            last_name="user",
            password="testUser@123",
            role="viewer",
            policies=[spotinst.organization.UserPolicyArgs(
                policy_id="pol-abcd1236",
                policy_account_ids=["act-abcf4245"],
            )],
            user_group_ids=[
                "ugr-abcd1234",
                "ugr-defg8763",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: Email.
        :param pulumi.Input[str] first_name: The first name of the user.
        :param pulumi.Input[str] last_name: The last name of the user.
        :param pulumi.Input[str] password: Password.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPolicyArgs']]]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[str] role: User's role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst User in the creator's organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_user = spotinst.organization.User("terraform_user",
            email="abc@xyz.com",
            first_name="test",
            last_name="user",
            password="testUser@123",
            role="viewer",
            policies=[spotinst.organization.UserPolicyArgs(
                policy_id="pol-abcd1236",
                policy_account_ids=["act-abcf4245"],
            )],
            user_group_ids=[
                "ugr-abcd1234",
                "ugr-defg8763",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPolicyArgs']]]]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            if first_name is None and not opts.urn:
                raise TypeError("Missing required property 'first_name'")
            __props__.__dict__["first_name"] = first_name
            if last_name is None and not opts.urn:
                raise TypeError("Missing required property 'last_name'")
            __props__.__dict__["last_name"] = last_name
            __props__.__dict__["password"] = password
            __props__.__dict__["policies"] = policies
            __props__.__dict__["role"] = role
            __props__.__dict__["user_group_ids"] = user_group_ids
        super(User, __self__).__init__(
            'spotinst:organization/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email: Optional[pulumi.Input[str]] = None,
            first_name: Optional[pulumi.Input[str]] = None,
            last_name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPolicyArgs']]]]] = None,
            role: Optional[pulumi.Input[str]] = None,
            user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: Email.
        :param pulumi.Input[str] first_name: The first name of the user.
        :param pulumi.Input[str] last_name: The last name of the user.
        :param pulumi.Input[str] password: Password.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserPolicyArgs']]]] policies: The policies to register under the given group
               (should be existing policies only).
        :param pulumi.Input[str] role: User's role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["email"] = email
        __props__.__dict__["first_name"] = first_name
        __props__.__dict__["last_name"] = last_name
        __props__.__dict__["password"] = password
        __props__.__dict__["policies"] = policies
        __props__.__dict__["role"] = role
        __props__.__dict__["user_group_ids"] = user_group_ids
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        Email.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> pulumi.Output[str]:
        """
        The first name of the user.
        """
        return pulumi.get(self, "first_name")

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> pulumi.Output[str]:
        """
        The last name of the user.
        """
        return pulumi.get(self, "last_name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        Password.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Optional[Sequence['outputs.UserPolicy']]]:
        """
        The policies to register under the given group
        (should be existing policies only).
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        """
        User's role.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="userGroupIds")
    def user_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of the user groups to register the given user to (should be existing user groups only)
        """
        return pulumi.get(self, "user_group_ids")

