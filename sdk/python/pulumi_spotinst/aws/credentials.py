# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CredentialsArgs', 'Credentials']

@pulumi.input_type
class CredentialsArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 iamrole: pulumi.Input[str]):
        """
        The set of arguments for constructing a Credentials resource.
        :param pulumi.Input[str] iamrole: Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        CredentialsArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            iamrole=iamrole,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             iamrole: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if account_id is None:
            raise TypeError("Missing 'account_id' argument")
        if iamrole is None:
            raise TypeError("Missing 'iamrole' argument")

        _setter("account_id", account_id)
        _setter("iamrole", iamrole)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def iamrole(self) -> pulumi.Input[str]:
        """
        Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        return pulumi.get(self, "iamrole")

    @iamrole.setter
    def iamrole(self, value: pulumi.Input[str]):
        pulumi.set(self, "iamrole", value)


@pulumi.input_type
class _CredentialsState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 iamrole: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Credentials resources.
        :param pulumi.Input[str] iamrole: Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        _CredentialsState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            iamrole=iamrole,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             iamrole: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']

        if account_id is not None:
            _setter("account_id", account_id)
        if iamrole is not None:
            _setter("iamrole", iamrole)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def iamrole(self) -> Optional[pulumi.Input[str]]:
        """
        Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        return pulumi.get(self, "iamrole")

    @iamrole.setter
    def iamrole(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "iamrole", value)


class Credentials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 iamrole: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Spotinst credential AWS resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # set credential AWS
        credential = spotinst.aws.Credentials("credential",
            accountid="act-123456",
            iamrole="arn:aws:iam::1234567890:role/Spot_Iam_Role")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] iamrole: Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CredentialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst credential AWS resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # set credential AWS
        credential = spotinst.aws.Credentials("credential",
            accountid="act-123456",
            iamrole="arn:aws:iam::1234567890:role/Spot_Iam_Role")
        ```

        :param str resource_name: The name of the resource.
        :param CredentialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CredentialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CredentialsArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 iamrole: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CredentialsArgs.__new__(CredentialsArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if iamrole is None and not opts.urn:
                raise TypeError("Missing required property 'iamrole'")
            __props__.__dict__["iamrole"] = iamrole
        super(Credentials, __self__).__init__(
            'spotinst:aws/credentials:Credentials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            iamrole: Optional[pulumi.Input[str]] = None) -> 'Credentials':
        """
        Get an existing Credentials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] iamrole: Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CredentialsState.__new__(_CredentialsState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["iamrole"] = iamrole
        return Credentials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def iamrole(self) -> pulumi.Output[str]:
        """
        Provide the IAM Role ARN connected to another AWS account 922761411349 and with the latest Spot Policy - https://docs.spot.io/administration/api/spot-policy-in-aws
        """
        return pulumi.get(self, "iamrole")

