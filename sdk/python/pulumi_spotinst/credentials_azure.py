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
from . import _utilities

__all__ = ['CredentialsAzureArgs', 'CredentialsAzure']

@pulumi.input_type
class CredentialsAzureArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 client_id: pulumi.Input[str],
                 client_secret: pulumi.Input[str],
                 subscription_id: pulumi.Input[str],
                 tenant_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a CredentialsAzure resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] client_id: Set the application ID.
        :param pulumi.Input[str] client_secret: Set the key secret.
        :param pulumi.Input[str] subscription_id: Set the subscription ID.
        :param pulumi.Input[str] tenant_id: Set the directory ID.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret", client_secret)
        pulumi.set(__self__, "subscription_id", subscription_id)
        pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The ID of the account associated with your token.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        """
        Set the application ID.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Input[str]:
        """
        Set the key secret.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[str]:
        """
        Set the subscription ID.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        Set the directory ID.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)


@pulumi.input_type
class _CredentialsAzureState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CredentialsAzure resources.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] client_id: Set the application ID.
        :param pulumi.Input[str] client_secret: Set the key secret.
        :param pulumi.Input[str] subscription_id: Set the subscription ID.
        :param pulumi.Input[str] tenant_id: Set the directory ID.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if subscription_id is not None:
            pulumi.set(__self__, "subscription_id", subscription_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the account associated with your token.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        Set the application ID.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        Set the key secret.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> Optional[pulumi.Input[str]]:
        """
        Set the subscription ID.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        Set the directory ID.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_id", value)


class CredentialsAzure(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Spotinst credential Azure resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # set credential Azure
        credential = spotinst.CredentialsAzure("credential",
            account_id="act-123456",
            client_id="redacted",
            client_secret="redacted",
            tenant_id="redacted",
            subscription_id="redacted")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] client_id: Set the application ID.
        :param pulumi.Input[str] client_secret: Set the key secret.
        :param pulumi.Input[str] subscription_id: Set the subscription ID.
        :param pulumi.Input[str] tenant_id: Set the directory ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CredentialsAzureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst credential Azure resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # set credential Azure
        credential = spotinst.CredentialsAzure("credential",
            account_id="act-123456",
            client_id="redacted",
            client_secret="redacted",
            tenant_id="redacted",
            subscription_id="redacted")
        ```

        :param str resource_name: The name of the resource.
        :param CredentialsAzureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CredentialsAzureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CredentialsAzureArgs.__new__(CredentialsAzureArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            if client_secret is None and not opts.urn:
                raise TypeError("Missing required property 'client_secret'")
            __props__.__dict__["client_secret"] = client_secret
            if subscription_id is None and not opts.urn:
                raise TypeError("Missing required property 'subscription_id'")
            __props__.__dict__["subscription_id"] = subscription_id
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = tenant_id
        super(CredentialsAzure, __self__).__init__(
            'spotinst:index/credentialsAzure:CredentialsAzure',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_secret: Optional[pulumi.Input[str]] = None,
            subscription_id: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None) -> 'CredentialsAzure':
        """
        Get an existing CredentialsAzure resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] client_id: Set the application ID.
        :param pulumi.Input[str] client_secret: Set the key secret.
        :param pulumi.Input[str] subscription_id: Set the subscription ID.
        :param pulumi.Input[str] tenant_id: Set the directory ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CredentialsAzureState.__new__(_CredentialsAzureState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_secret"] = client_secret
        __props__.__dict__["subscription_id"] = subscription_id
        __props__.__dict__["tenant_id"] = tenant_id
        return CredentialsAzure(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The ID of the account associated with your token.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        Set the application ID.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[str]:
        """
        Set the key secret.
        """
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Output[str]:
        """
        Set the subscription ID.
        """
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[str]:
        """
        Set the directory ID.
        """
        return pulumi.get(self, "tenant_id")

