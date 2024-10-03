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

__all__ = ['CredentialsGcpArgs', 'CredentialsGcp']

@pulumi.input_type
class CredentialsGcpArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 auth_provider_x509_cert_url: pulumi.Input[str],
                 auth_uri: pulumi.Input[str],
                 client_email: pulumi.Input[str],
                 client_id: pulumi.Input[str],
                 client_x509_cert_url: pulumi.Input[str],
                 private_key: pulumi.Input[str],
                 private_key_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 token_uri: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        The set of arguments for constructing a CredentialsGcp resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] auth_provider_x509_cert_url: .
        :param pulumi.Input[str] auth_uri: Authentication uri.
        :param pulumi.Input[str] client_email: Email associated with service account.
        :param pulumi.Input[str] client_id: Client ID of service account.
        :param pulumi.Input[str] client_x509_cert_url: Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        :param pulumi.Input[str] private_key: Private key of JSON key created during prerequisites stage.
        :param pulumi.Input[str] private_key_id: Private key ID of JSON key created during prerequisites stage.
        :param pulumi.Input[str] project_id: Name of project in GCP.
        :param pulumi.Input[str] token_uri: Token uri.
        :param pulumi.Input[str] type: Valid values - service_account.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "auth_provider_x509_cert_url", auth_provider_x509_cert_url)
        pulumi.set(__self__, "auth_uri", auth_uri)
        pulumi.set(__self__, "client_email", client_email)
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_x509_cert_url", client_x509_cert_url)
        pulumi.set(__self__, "private_key", private_key)
        pulumi.set(__self__, "private_key_id", private_key_id)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "token_uri", token_uri)
        pulumi.set(__self__, "type", type)

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
    @pulumi.getter(name="authProviderX509CertUrl")
    def auth_provider_x509_cert_url(self) -> pulumi.Input[str]:
        """
        .
        """
        return pulumi.get(self, "auth_provider_x509_cert_url")

    @auth_provider_x509_cert_url.setter
    def auth_provider_x509_cert_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_provider_x509_cert_url", value)

    @property
    @pulumi.getter(name="authUri")
    def auth_uri(self) -> pulumi.Input[str]:
        """
        Authentication uri.
        """
        return pulumi.get(self, "auth_uri")

    @auth_uri.setter
    def auth_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "auth_uri", value)

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> pulumi.Input[str]:
        """
        Email associated with service account.
        """
        return pulumi.get(self, "client_email")

    @client_email.setter
    def client_email(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_email", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Input[str]:
        """
        Client ID of service account.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientX509CertUrl")
    def client_x509_cert_url(self) -> pulumi.Input[str]:
        """
        Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        """
        return pulumi.get(self, "client_x509_cert_url")

    @client_x509_cert_url.setter
    def client_x509_cert_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_x509_cert_url", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Input[str]:
        """
        Private key of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> pulumi.Input[str]:
        """
        Private key ID of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key_id")

    @private_key_id.setter
    def private_key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Name of project in GCP.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="tokenUri")
    def token_uri(self) -> pulumi.Input[str]:
        """
        Token uri.
        """
        return pulumi.get(self, "token_uri")

    @token_uri.setter
    def token_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "token_uri", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Valid values - service_account.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _CredentialsGcpState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_provider_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 auth_uri: Optional[pulumi.Input[str]] = None,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 token_uri: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CredentialsGcp resources.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] auth_provider_x509_cert_url: .
        :param pulumi.Input[str] auth_uri: Authentication uri.
        :param pulumi.Input[str] client_email: Email associated with service account.
        :param pulumi.Input[str] client_id: Client ID of service account.
        :param pulumi.Input[str] client_x509_cert_url: Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        :param pulumi.Input[str] private_key: Private key of JSON key created during prerequisites stage.
        :param pulumi.Input[str] private_key_id: Private key ID of JSON key created during prerequisites stage.
        :param pulumi.Input[str] project_id: Name of project in GCP.
        :param pulumi.Input[str] token_uri: Token uri.
        :param pulumi.Input[str] type: Valid values - service_account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if auth_provider_x509_cert_url is not None:
            pulumi.set(__self__, "auth_provider_x509_cert_url", auth_provider_x509_cert_url)
        if auth_uri is not None:
            pulumi.set(__self__, "auth_uri", auth_uri)
        if client_email is not None:
            pulumi.set(__self__, "client_email", client_email)
        if client_id is not None:
            pulumi.set(__self__, "client_id", client_id)
        if client_x509_cert_url is not None:
            pulumi.set(__self__, "client_x509_cert_url", client_x509_cert_url)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if private_key_id is not None:
            pulumi.set(__self__, "private_key_id", private_key_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if token_uri is not None:
            pulumi.set(__self__, "token_uri", token_uri)
        if type is not None:
            pulumi.set(__self__, "type", type)

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
    @pulumi.getter(name="authProviderX509CertUrl")
    def auth_provider_x509_cert_url(self) -> Optional[pulumi.Input[str]]:
        """
        .
        """
        return pulumi.get(self, "auth_provider_x509_cert_url")

    @auth_provider_x509_cert_url.setter
    def auth_provider_x509_cert_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_provider_x509_cert_url", value)

    @property
    @pulumi.getter(name="authUri")
    def auth_uri(self) -> Optional[pulumi.Input[str]]:
        """
        Authentication uri.
        """
        return pulumi.get(self, "auth_uri")

    @auth_uri.setter
    def auth_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auth_uri", value)

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> Optional[pulumi.Input[str]]:
        """
        Email associated with service account.
        """
        return pulumi.get(self, "client_email")

    @client_email.setter
    def client_email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_email", value)

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> Optional[pulumi.Input[str]]:
        """
        Client ID of service account.
        """
        return pulumi.get(self, "client_id")

    @client_id.setter
    def client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_id", value)

    @property
    @pulumi.getter(name="clientX509CertUrl")
    def client_x509_cert_url(self) -> Optional[pulumi.Input[str]]:
        """
        Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        """
        return pulumi.get(self, "client_x509_cert_url")

    @client_x509_cert_url.setter
    def client_x509_cert_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_x509_cert_url", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        Private key of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Private key ID of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key_id")

    @private_key_id.setter
    def private_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Name of project in GCP.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="tokenUri")
    def token_uri(self) -> Optional[pulumi.Input[str]]:
        """
        Token uri.
        """
        return pulumi.get(self, "token_uri")

    @token_uri.setter
    def token_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "token_uri", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values - service_account.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class CredentialsGcp(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_provider_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 auth_uri: Optional[pulumi.Input[str]] = None,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 token_uri: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Spotinst credential GCP resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] auth_provider_x509_cert_url: .
        :param pulumi.Input[str] auth_uri: Authentication uri.
        :param pulumi.Input[str] client_email: Email associated with service account.
        :param pulumi.Input[str] client_id: Client ID of service account.
        :param pulumi.Input[str] client_x509_cert_url: Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        :param pulumi.Input[str] private_key: Private key of JSON key created during prerequisites stage.
        :param pulumi.Input[str] private_key_id: Private key ID of JSON key created during prerequisites stage.
        :param pulumi.Input[str] project_id: Name of project in GCP.
        :param pulumi.Input[str] token_uri: Token uri.
        :param pulumi.Input[str] type: Valid values - service_account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CredentialsGcpArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst credential GCP resource.

        :param str resource_name: The name of the resource.
        :param CredentialsGcpArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CredentialsGcpArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 auth_provider_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 auth_uri: Optional[pulumi.Input[str]] = None,
                 client_email: Optional[pulumi.Input[str]] = None,
                 client_id: Optional[pulumi.Input[str]] = None,
                 client_x509_cert_url: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 private_key_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 token_uri: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CredentialsGcpArgs.__new__(CredentialsGcpArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if auth_provider_x509_cert_url is None and not opts.urn:
                raise TypeError("Missing required property 'auth_provider_x509_cert_url'")
            __props__.__dict__["auth_provider_x509_cert_url"] = auth_provider_x509_cert_url
            if auth_uri is None and not opts.urn:
                raise TypeError("Missing required property 'auth_uri'")
            __props__.__dict__["auth_uri"] = auth_uri
            if client_email is None and not opts.urn:
                raise TypeError("Missing required property 'client_email'")
            __props__.__dict__["client_email"] = client_email
            if client_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_id'")
            __props__.__dict__["client_id"] = client_id
            if client_x509_cert_url is None and not opts.urn:
                raise TypeError("Missing required property 'client_x509_cert_url'")
            __props__.__dict__["client_x509_cert_url"] = client_x509_cert_url
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__.__dict__["private_key"] = private_key
            if private_key_id is None and not opts.urn:
                raise TypeError("Missing required property 'private_key_id'")
            __props__.__dict__["private_key_id"] = private_key_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if token_uri is None and not opts.urn:
                raise TypeError("Missing required property 'token_uri'")
            __props__.__dict__["token_uri"] = token_uri
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(CredentialsGcp, __self__).__init__(
            'spotinst:index/credentialsGcp:CredentialsGcp',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            auth_provider_x509_cert_url: Optional[pulumi.Input[str]] = None,
            auth_uri: Optional[pulumi.Input[str]] = None,
            client_email: Optional[pulumi.Input[str]] = None,
            client_id: Optional[pulumi.Input[str]] = None,
            client_x509_cert_url: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            private_key_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            token_uri: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'CredentialsGcp':
        """
        Get an existing CredentialsGcp resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The ID of the account associated with your token.
        :param pulumi.Input[str] auth_provider_x509_cert_url: .
        :param pulumi.Input[str] auth_uri: Authentication uri.
        :param pulumi.Input[str] client_email: Email associated with service account.
        :param pulumi.Input[str] client_id: Client ID of service account.
        :param pulumi.Input[str] client_x509_cert_url: Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        :param pulumi.Input[str] private_key: Private key of JSON key created during prerequisites stage.
        :param pulumi.Input[str] private_key_id: Private key ID of JSON key created during prerequisites stage.
        :param pulumi.Input[str] project_id: Name of project in GCP.
        :param pulumi.Input[str] token_uri: Token uri.
        :param pulumi.Input[str] type: Valid values - service_account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CredentialsGcpState.__new__(_CredentialsGcpState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["auth_provider_x509_cert_url"] = auth_provider_x509_cert_url
        __props__.__dict__["auth_uri"] = auth_uri
        __props__.__dict__["client_email"] = client_email
        __props__.__dict__["client_id"] = client_id
        __props__.__dict__["client_x509_cert_url"] = client_x509_cert_url
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["private_key_id"] = private_key_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["token_uri"] = token_uri
        __props__.__dict__["type"] = type
        return CredentialsGcp(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The ID of the account associated with your token.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="authProviderX509CertUrl")
    def auth_provider_x509_cert_url(self) -> pulumi.Output[str]:
        """
        .
        """
        return pulumi.get(self, "auth_provider_x509_cert_url")

    @property
    @pulumi.getter(name="authUri")
    def auth_uri(self) -> pulumi.Output[str]:
        """
        Authentication uri.
        """
        return pulumi.get(self, "auth_uri")

    @property
    @pulumi.getter(name="clientEmail")
    def client_email(self) -> pulumi.Output[str]:
        """
        Email associated with service account.
        """
        return pulumi.get(self, "client_email")

    @property
    @pulumi.getter(name="clientId")
    def client_id(self) -> pulumi.Output[str]:
        """
        Client ID of service account.
        """
        return pulumi.get(self, "client_id")

    @property
    @pulumi.getter(name="clientX509CertUrl")
    def client_x509_cert_url(self) -> pulumi.Output[str]:
        """
        Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
        """
        return pulumi.get(self, "client_x509_cert_url")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        Private key of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="privateKeyId")
    def private_key_id(self) -> pulumi.Output[str]:
        """
        Private key ID of JSON key created during prerequisites stage.
        """
        return pulumi.get(self, "private_key_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Name of project in GCP.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="tokenUri")
    def token_uri(self) -> pulumi.Output[str]:
        """
        Token uri.
        """
        return pulumi.get(self, "token_uri")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Valid values - service_account.
        """
        return pulumi.get(self, "type")

