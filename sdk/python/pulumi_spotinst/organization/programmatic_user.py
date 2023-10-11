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

__all__ = ['ProgrammaticUserArgs', 'ProgrammaticUser']

@pulumi.input_type
class ProgrammaticUserArgs:
    def __init__(__self__, *,
                 accounts: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ProgrammaticUser resource.
        :param pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]] accounts: All the accounts the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[str] description: Brief description of the user.
        :param pulumi.Input[str] name: Name of the programmatic user.
        :param pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]] policies: All the policies the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        ProgrammaticUserArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accounts=accounts,
            description=description,
            name=name,
            policies=policies,
            user_group_ids=user_group_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accounts: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]] = None,
             user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if accounts is not None:
            _setter("accounts", accounts)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if user_group_ids is not None:
            _setter("user_group_ids", user_group_ids)

    @property
    @pulumi.getter
    def accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]]:
        """
        All the accounts the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "accounts")

    @accounts.setter
    def accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]]):
        pulumi.set(self, "accounts", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Brief description of the user.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the programmatic user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]]:
        """
        All the policies the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

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
class _ProgrammaticUserState:
    def __init__(__self__, *,
                 accounts: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ProgrammaticUser resources.
        :param pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]] accounts: All the accounts the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[str] description: Brief description of the user.
        :param pulumi.Input[str] name: Name of the programmatic user.
        :param pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]] policies: All the policies the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        _ProgrammaticUserState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            accounts=accounts,
            description=description,
            name=name,
            policies=policies,
            user_group_ids=user_group_ids,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             accounts: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]] = None,
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policies: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]] = None,
             user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if accounts is not None:
            _setter("accounts", accounts)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policies is not None:
            _setter("policies", policies)
        if user_group_ids is not None:
            _setter("user_group_ids", user_group_ids)

    @property
    @pulumi.getter
    def accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]]:
        """
        All the accounts the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "accounts")

    @accounts.setter
    def accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserAccountArgs']]]]):
        pulumi.set(self, "accounts", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Brief description of the user.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the programmatic user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]]:
        """
        All the policies the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProgrammaticUserPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

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


class ProgrammaticUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserAccountArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserPolicyArgs']]]]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Spotinst programmatic user in the creator's organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_prog_user = spotinst.organization.ProgrammaticUser("terraformProgUser",
            description="creating programmatic user",
            policies=[spotinst.organization.ProgrammaticUserPolicyArgs(
                policy_account_ids=["act-a1b2c3d4"],
                policy_id="pol-g75d8c06",
            )],
            user_group_ids=[
                "ugr-abcd1234",
                "ugr-defg8763",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserAccountArgs']]]] accounts: All the accounts the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[str] description: Brief description of the user.
        :param pulumi.Input[str] name: Name of the programmatic user.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserPolicyArgs']]]] policies: All the policies the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProgrammaticUserArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst programmatic user in the creator's organization.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_prog_user = spotinst.organization.ProgrammaticUser("terraformProgUser",
            description="creating programmatic user",
            policies=[spotinst.organization.ProgrammaticUserPolicyArgs(
                policy_account_ids=["act-a1b2c3d4"],
                policy_id="pol-g75d8c06",
            )],
            user_group_ids=[
                "ugr-abcd1234",
                "ugr-defg8763",
            ])
        ```

        :param str resource_name: The name of the resource.
        :param ProgrammaticUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProgrammaticUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProgrammaticUserArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserAccountArgs']]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserPolicyArgs']]]]] = None,
                 user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProgrammaticUserArgs.__new__(ProgrammaticUserArgs)

            __props__.__dict__["accounts"] = accounts
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["policies"] = policies
            __props__.__dict__["user_group_ids"] = user_group_ids
        super(ProgrammaticUser, __self__).__init__(
            'spotinst:organization/programmaticUser:ProgrammaticUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accounts: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserAccountArgs']]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserPolicyArgs']]]]] = None,
            user_group_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ProgrammaticUser':
        """
        Get an existing ProgrammaticUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserAccountArgs']]]] accounts: All the accounts the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[str] description: Brief description of the user.
        :param pulumi.Input[str] name: Name of the programmatic user.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProgrammaticUserPolicyArgs']]]] policies: All the policies the programmatic user will have access to.
               If used - Cannot be empty.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] user_group_ids: A list of the user groups to register the given user to (should be existing user groups only)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProgrammaticUserState.__new__(_ProgrammaticUserState)

        __props__.__dict__["accounts"] = accounts
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
        __props__.__dict__["user_group_ids"] = user_group_ids
        return ProgrammaticUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def accounts(self) -> pulumi.Output[Optional[Sequence['outputs.ProgrammaticUserAccount']]]:
        """
        All the accounts the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "accounts")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Brief description of the user.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the programmatic user.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Optional[Sequence['outputs.ProgrammaticUserPolicy']]]:
        """
        All the policies the programmatic user will have access to.
        If used - Cannot be empty.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter(name="userGroupIds")
    def user_group_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of the user groups to register the given user to (should be existing user groups only)
        """
        return pulumi.get(self, "user_group_ids")
