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

__all__ = ['PolicyArgs', 'Policy']

@pulumi.input_type
class PolicyArgs:
    def __init__(__self__, *,
                 policy_contents: pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Policy resource.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]] policy_contents: Set permissions objects list.
        :param pulumi.Input[str] description: Short description of policy.
        :param pulumi.Input[str] name: Name of the Policy.
        """
        PolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            policy_contents=policy_contents,
            description=description,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             policy_contents: pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'policyContents' in kwargs:
            policy_contents = kwargs['policyContents']

        _setter("policy_contents", policy_contents)
        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="policyContents")
    def policy_contents(self) -> pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]:
        """
        Set permissions objects list.
        """
        return pulumi.get(self, "policy_contents")

    @policy_contents.setter
    def policy_contents(self, value: pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]):
        pulumi.set(self, "policy_contents", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Short description of policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_contents: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]] = None):
        """
        Input properties used for looking up and filtering Policy resources.
        :param pulumi.Input[str] description: Short description of policy.
        :param pulumi.Input[str] name: Name of the Policy.
        :param pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]] policy_contents: Set permissions objects list.
        """
        _PolicyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            name=name,
            policy_contents=policy_contents,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             policy_contents: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'policyContents' in kwargs:
            policy_contents = kwargs['policyContents']

        if description is not None:
            _setter("description", description)
        if name is not None:
            _setter("name", name)
        if policy_contents is not None:
            _setter("policy_contents", policy_contents)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Short description of policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyContents")
    def policy_contents(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]]:
        """
        Set permissions objects list.
        """
        return pulumi.get(self, "policy_contents")

    @policy_contents.setter
    def policy_contents(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PolicyPolicyContentArgs']]]]):
        pulumi.set(self, "policy_contents", value)


class Policy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_contents: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyPolicyContentArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Spotinst access policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_policy = spotinst.organization.Policy("terraformPolicy",
            description="policy by terraform",
            policy_contents=[spotinst.organization.PolicyPolicyContentArgs(
                statements=[
                    spotinst.organization.PolicyPolicyContentStatementArgs(
                        actions=["ocean:deleteCluster"],
                        effect="DENY",
                        resources=[
                            "o-abcd1234",
                            "o-defg6789",
                        ],
                    ),
                    spotinst.organization.PolicyPolicyContentStatementArgs(
                        actions=["ocean:createCluster"],
                        effect="DENY",
                        resources=[
                            "o-fhau4752",
                            "o-761owf4r3",
                        ],
                    ),
                ],
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Short description of policy.
        :param pulumi.Input[str] name: Name of the Policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyPolicyContentArgs']]]] policy_contents: Set permissions objects list.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst access policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        terraform_policy = spotinst.organization.Policy("terraformPolicy",
            description="policy by terraform",
            policy_contents=[spotinst.organization.PolicyPolicyContentArgs(
                statements=[
                    spotinst.organization.PolicyPolicyContentStatementArgs(
                        actions=["ocean:deleteCluster"],
                        effect="DENY",
                        resources=[
                            "o-abcd1234",
                            "o-defg6789",
                        ],
                    ),
                    spotinst.organization.PolicyPolicyContentStatementArgs(
                        actions=["ocean:createCluster"],
                        effect="DENY",
                        resources=[
                            "o-fhau4752",
                            "o-761owf4r3",
                        ],
                    ),
                ],
            )])
        ```

        :param str resource_name: The name of the resource.
        :param PolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PolicyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_contents: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyPolicyContentArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolicyArgs.__new__(PolicyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if policy_contents is None and not opts.urn:
                raise TypeError("Missing required property 'policy_contents'")
            __props__.__dict__["policy_contents"] = policy_contents
        super(Policy, __self__).__init__(
            'spotinst:organization/policy:Policy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_contents: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyPolicyContentArgs']]]]] = None) -> 'Policy':
        """
        Get an existing Policy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Short description of policy.
        :param pulumi.Input[str] name: Name of the Policy.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PolicyPolicyContentArgs']]]] policy_contents: Set permissions objects list.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolicyState.__new__(_PolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_contents"] = policy_contents
        return Policy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Short description of policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyContents")
    def policy_contents(self) -> pulumi.Output[Sequence['outputs.PolicyPolicyContent']]:
        """
        Set permissions objects list.
        """
        return pulumi.get(self, "policy_contents")

