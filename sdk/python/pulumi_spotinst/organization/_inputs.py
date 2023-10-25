# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'PolicyPolicyContentArgs',
    'PolicyPolicyContentStatementArgs',
    'ProgrammaticUserAccountArgs',
    'ProgrammaticUserPolicyArgs',
    'UserGroupPolicyArgs',
    'UserPolicyArgs',
]

@pulumi.input_type
class PolicyPolicyContentArgs:
    def __init__(__self__, *,
                 statements: pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentStatementArgs']]]):
        """
        :param pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentStatementArgs']]] statements: List of permissions statements.
        """
        PolicyPolicyContentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            statements=statements,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             statements: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentStatementArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if statements is None:
            raise TypeError("Missing 'statements' argument")

        _setter("statements", statements)

    @property
    @pulumi.getter
    def statements(self) -> pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentStatementArgs']]]:
        """
        List of permissions statements.
        """
        return pulumi.get(self, "statements")

    @statements.setter
    def statements(self, value: pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentStatementArgs']]]):
        pulumi.set(self, "statements", value)


@pulumi.input_type
class PolicyPolicyContentStatementArgs:
    def __init__(__self__, *,
                 actions: pulumi.Input[Sequence[pulumi.Input[str]]],
                 effect: pulumi.Input[str],
                 resources: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] actions: Set a list of required actions for this permissions statement.
               Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
        :param pulumi.Input[str] effect: Valid values "ALLOW", "DENY".
        :param pulumi.Input[Sequence[pulumi.Input[str]]] resources: Set a list of resources IDs. In order to include all resources in this statement - use "*".
        """
        PolicyPolicyContentStatementArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            actions=actions,
            effect=effect,
            resources=resources,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             actions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             effect: Optional[pulumi.Input[str]] = None,
             resources: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if actions is None:
            raise TypeError("Missing 'actions' argument")
        if effect is None:
            raise TypeError("Missing 'effect' argument")
        if resources is None:
            raise TypeError("Missing 'resources' argument")

        _setter("actions", actions)
        _setter("effect", effect)
        _setter("resources", resources)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Set a list of required actions for this permissions statement.
        Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
        """
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter
    def effect(self) -> pulumi.Input[str]:
        """
        Valid values "ALLOW", "DENY".
        """
        return pulumi.get(self, "effect")

    @effect.setter
    def effect(self, value: pulumi.Input[str]):
        pulumi.set(self, "effect", value)

    @property
    @pulumi.getter
    def resources(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Set a list of resources IDs. In order to include all resources in this statement - use "*".
        """
        return pulumi.get(self, "resources")

    @resources.setter
    def resources(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "resources", value)


@pulumi.input_type
class ProgrammaticUserAccountArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 account_role: pulumi.Input[str]):
        """
        :param pulumi.Input[str] account_id: Account ID the programmatic user will have access to.
        :param pulumi.Input[str] account_role: (Enum: `"viewer", "editor") Role to be associated with the
               programmatic user for this account.
        """
        ProgrammaticUserAccountArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            account_role=account_role,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             account_role: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if account_id is None:
            raise TypeError("Missing 'account_id' argument")
        if account_role is None and 'accountRole' in kwargs:
            account_role = kwargs['accountRole']
        if account_role is None:
            raise TypeError("Missing 'account_role' argument")

        _setter("account_id", account_id)
        _setter("account_role", account_role)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        Account ID the programmatic user will have access to.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="accountRole")
    def account_role(self) -> pulumi.Input[str]:
        """
        (Enum: `"viewer", "editor") Role to be associated with the
        programmatic user for this account.
        """
        return pulumi.get(self, "account_role")

    @account_role.setter
    def account_role(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_role", value)


@pulumi.input_type
class ProgrammaticUserPolicyArgs:
    def __init__(__self__, *,
                 policy_account_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 policy_id: pulumi.Input[str]):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] policy_account_ids: A list of the accounts that the policy should be
               enforced for the user.
        :param pulumi.Input[str] policy_id: Policy ID the programmatic user will have access to.
        """
        ProgrammaticUserPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            policy_account_ids=policy_account_ids,
            policy_id=policy_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             policy_account_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             policy_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if policy_account_ids is None and 'policyAccountIds' in kwargs:
            policy_account_ids = kwargs['policyAccountIds']
        if policy_account_ids is None:
            raise TypeError("Missing 'policy_account_ids' argument")
        if policy_id is None and 'policyId' in kwargs:
            policy_id = kwargs['policyId']
        if policy_id is None:
            raise TypeError("Missing 'policy_id' argument")

        _setter("policy_account_ids", policy_account_ids)
        _setter("policy_id", policy_id)

    @property
    @pulumi.getter(name="policyAccountIds")
    def policy_account_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of the accounts that the policy should be
        enforced for the user.
        """
        return pulumi.get(self, "policy_account_ids")

    @policy_account_ids.setter
    def policy_account_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "policy_account_ids", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        Policy ID the programmatic user will have access to.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)


@pulumi.input_type
class UserGroupPolicyArgs:
    def __init__(__self__, *,
                 account_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 policy_id: pulumi.Input[str]):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] account_ids: A list of accounts to register with the assigned under the
               given group (should be existing accounts only).
        :param pulumi.Input[str] policy_id: A policy to register under the given group
               (should be existing policy only).
        """
        UserGroupPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_ids=account_ids,
            policy_id=policy_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             policy_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_ids is None and 'accountIds' in kwargs:
            account_ids = kwargs['accountIds']
        if account_ids is None:
            raise TypeError("Missing 'account_ids' argument")
        if policy_id is None and 'policyId' in kwargs:
            policy_id = kwargs['policyId']
        if policy_id is None:
            raise TypeError("Missing 'policy_id' argument")

        _setter("account_ids", account_ids)
        _setter("policy_id", policy_id)

    @property
    @pulumi.getter(name="accountIds")
    def account_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of accounts to register with the assigned under the
        given group (should be existing accounts only).
        """
        return pulumi.get(self, "account_ids")

    @account_ids.setter
    def account_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "account_ids", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        A policy to register under the given group
        (should be existing policy only).
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)


@pulumi.input_type
class UserPolicyArgs:
    def __init__(__self__, *,
                 policy_account_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 policy_id: pulumi.Input[str]):
        """
        :param pulumi.Input[str] policy_id: A policy to register under the given group
               (should be existing policy only).
        """
        UserPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            policy_account_ids=policy_account_ids,
            policy_id=policy_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             policy_account_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             policy_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if policy_account_ids is None and 'policyAccountIds' in kwargs:
            policy_account_ids = kwargs['policyAccountIds']
        if policy_account_ids is None:
            raise TypeError("Missing 'policy_account_ids' argument")
        if policy_id is None and 'policyId' in kwargs:
            policy_id = kwargs['policyId']
        if policy_id is None:
            raise TypeError("Missing 'policy_id' argument")

        _setter("policy_account_ids", policy_account_ids)
        _setter("policy_id", policy_id)

    @property
    @pulumi.getter(name="policyAccountIds")
    def policy_account_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "policy_account_ids")

    @policy_account_ids.setter
    def policy_account_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "policy_account_ids", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        A policy to register under the given group
        (should be existing policy only).
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)


