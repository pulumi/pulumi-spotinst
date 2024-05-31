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

__all__ = [
    'PolicyPolicyContent',
    'PolicyPolicyContentStatement',
    'ProgrammaticUserAccount',
    'ProgrammaticUserPolicy',
    'UserGroupPolicy',
    'UserPolicy',
]

@pulumi.output_type
class PolicyPolicyContent(dict):
    def __init__(__self__, *,
                 statements: Sequence['outputs.PolicyPolicyContentStatement']):
        """
        :param Sequence['PolicyPolicyContentStatementArgs'] statements: List of permissions statements.
        """
        pulumi.set(__self__, "statements", statements)

    @property
    @pulumi.getter
    def statements(self) -> Sequence['outputs.PolicyPolicyContentStatement']:
        """
        List of permissions statements.
        """
        return pulumi.get(self, "statements")


@pulumi.output_type
class PolicyPolicyContentStatement(dict):
    def __init__(__self__, *,
                 actions: Sequence[str],
                 effect: str,
                 resources: Sequence[str]):
        """
        :param Sequence[str] actions: Set a list of required actions for this permissions statement.
               Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
        :param str effect: Valid values "ALLOW", "DENY".
        :param Sequence[str] resources: Set a list of resources IDs. In order to include all resources in this statement - use "*".
        """
        pulumi.set(__self__, "actions", actions)
        pulumi.set(__self__, "effect", effect)
        pulumi.set(__self__, "resources", resources)

    @property
    @pulumi.getter
    def actions(self) -> Sequence[str]:
        """
        Set a list of required actions for this permissions statement.
        Full list of actions can be found in [https://docs.spot.io/account-user-management/user-management/access-policies-actions/](https://docs.spot.io/account-user-management/user-management/access-policies-actions/).
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def effect(self) -> str:
        """
        Valid values "ALLOW", "DENY".
        """
        return pulumi.get(self, "effect")

    @property
    @pulumi.getter
    def resources(self) -> Sequence[str]:
        """
        Set a list of resources IDs. In order to include all resources in this statement - use "*".
        """
        return pulumi.get(self, "resources")


@pulumi.output_type
class ProgrammaticUserAccount(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "accountId":
            suggest = "account_id"
        elif key == "accountRole":
            suggest = "account_role"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProgrammaticUserAccount. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProgrammaticUserAccount.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProgrammaticUserAccount.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 account_id: str,
                 account_role: str):
        """
        :param str account_id: Account ID the programmatic user will have access to.
        :param str account_role: (Enum: `"viewer", "editor") Role to be associated with the
               programmatic user for this account.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "account_role", account_role)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Account ID the programmatic user will have access to.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="accountRole")
    def account_role(self) -> str:
        """
        (Enum: `"viewer", "editor") Role to be associated with the
        programmatic user for this account.
        """
        return pulumi.get(self, "account_role")


@pulumi.output_type
class ProgrammaticUserPolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "policyId":
            suggest = "policy_id"
        elif key == "policyAccountIds":
            suggest = "policy_account_ids"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ProgrammaticUserPolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ProgrammaticUserPolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ProgrammaticUserPolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 policy_id: str,
                 policy_account_ids: Optional[Sequence[str]] = None):
        """
        :param str policy_id: Policy ID the programmatic user will have access to.
        :param Sequence[str] policy_account_ids: A list of the accounts that the policy should be
               enforced for the user.
        """
        pulumi.set(__self__, "policy_id", policy_id)
        if policy_account_ids is not None:
            pulumi.set(__self__, "policy_account_ids", policy_account_ids)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> str:
        """
        Policy ID the programmatic user will have access to.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="policyAccountIds")
    def policy_account_ids(self) -> Optional[Sequence[str]]:
        """
        A list of the accounts that the policy should be
        enforced for the user.
        """
        return pulumi.get(self, "policy_account_ids")


@pulumi.output_type
class UserGroupPolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "accountIds":
            suggest = "account_ids"
        elif key == "policyId":
            suggest = "policy_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in UserGroupPolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        UserGroupPolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        UserGroupPolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 account_ids: Sequence[str],
                 policy_id: str):
        """
        :param Sequence[str] account_ids: A list of accounts to register with the assigned under the
               given group (should be existing accounts only).
        :param str policy_id: A policy to register under the given group
               (should be existing policy only).
        """
        pulumi.set(__self__, "account_ids", account_ids)
        pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="accountIds")
    def account_ids(self) -> Sequence[str]:
        """
        A list of accounts to register with the assigned under the
        given group (should be existing accounts only).
        """
        return pulumi.get(self, "account_ids")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> str:
        """
        A policy to register under the given group
        (should be existing policy only).
        """
        return pulumi.get(self, "policy_id")


@pulumi.output_type
class UserPolicy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "policyAccountIds":
            suggest = "policy_account_ids"
        elif key == "policyId":
            suggest = "policy_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in UserPolicy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        UserPolicy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        UserPolicy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 policy_account_ids: Sequence[str],
                 policy_id: str):
        """
        :param str policy_id: A policy to register under the given group
               (should be existing policy only).
        """
        pulumi.set(__self__, "policy_account_ids", policy_account_ids)
        pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="policyAccountIds")
    def policy_account_ids(self) -> Sequence[str]:
        return pulumi.get(self, "policy_account_ids")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> str:
        """
        A policy to register under the given group
        (should be existing policy only).
        """
        return pulumi.get(self, "policy_id")

