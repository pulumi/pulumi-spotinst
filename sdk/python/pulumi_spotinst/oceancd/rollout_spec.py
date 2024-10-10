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
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RolloutSpecArgs', 'RolloutSpec']

@pulumi.input_type
class RolloutSpecArgs:
    def __init__(__self__, *,
                 rollout_spec_name: pulumi.Input[str],
                 strategy: pulumi.Input['RolloutSpecStrategyArgs'],
                 failure_policy: Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']] = None,
                 spot_deployment: Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']] = None,
                 spot_deployments: Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]] = None,
                 traffic: Optional[pulumi.Input['RolloutSpecTrafficArgs']] = None):
        """
        The set of arguments for constructing a RolloutSpec resource.
        :param pulumi.Input[str] rollout_spec_name: Identifier name for Ocean CD Rollout Spec. Must be unique
        :param pulumi.Input['RolloutSpecStrategyArgs'] strategy: Determines the Ocean CD strategy
        :param pulumi.Input['RolloutSpecFailurePolicyArgs'] failure_policy: Holds information on how to react when failure happens.
        :param pulumi.Input['RolloutSpecSpotDeploymentArgs'] spot_deployment: Represents the SpotDeployment selector.
        :param pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]] spot_deployments: You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        :param pulumi.Input['RolloutSpecTrafficArgs'] traffic: Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        pulumi.set(__self__, "rollout_spec_name", rollout_spec_name)
        pulumi.set(__self__, "strategy", strategy)
        if failure_policy is not None:
            pulumi.set(__self__, "failure_policy", failure_policy)
        if spot_deployment is not None:
            pulumi.set(__self__, "spot_deployment", spot_deployment)
        if spot_deployments is not None:
            pulumi.set(__self__, "spot_deployments", spot_deployments)
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)

    @property
    @pulumi.getter(name="rolloutSpecName")
    def rollout_spec_name(self) -> pulumi.Input[str]:
        """
        Identifier name for Ocean CD Rollout Spec. Must be unique
        """
        return pulumi.get(self, "rollout_spec_name")

    @rollout_spec_name.setter
    def rollout_spec_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "rollout_spec_name", value)

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Input['RolloutSpecStrategyArgs']:
        """
        Determines the Ocean CD strategy
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: pulumi.Input['RolloutSpecStrategyArgs']):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter(name="failurePolicy")
    def failure_policy(self) -> Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']]:
        """
        Holds information on how to react when failure happens.
        """
        return pulumi.get(self, "failure_policy")

    @failure_policy.setter
    def failure_policy(self, value: Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']]):
        pulumi.set(self, "failure_policy", value)

    @property
    @pulumi.getter(name="spotDeployment")
    def spot_deployment(self) -> Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']]:
        """
        Represents the SpotDeployment selector.
        """
        return pulumi.get(self, "spot_deployment")

    @spot_deployment.setter
    def spot_deployment(self, value: Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']]):
        pulumi.set(self, "spot_deployment", value)

    @property
    @pulumi.getter(name="spotDeployments")
    def spot_deployments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]]:
        """
        You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        """
        return pulumi.get(self, "spot_deployments")

    @spot_deployments.setter
    def spot_deployments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]]):
        pulumi.set(self, "spot_deployments", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input['RolloutSpecTrafficArgs']]:
        """
        Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input['RolloutSpecTrafficArgs']]):
        pulumi.set(self, "traffic", value)


@pulumi.input_type
class _RolloutSpecState:
    def __init__(__self__, *,
                 failure_policy: Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']] = None,
                 rollout_spec_name: Optional[pulumi.Input[str]] = None,
                 spot_deployment: Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']] = None,
                 spot_deployments: Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]] = None,
                 strategy: Optional[pulumi.Input['RolloutSpecStrategyArgs']] = None,
                 traffic: Optional[pulumi.Input['RolloutSpecTrafficArgs']] = None):
        """
        Input properties used for looking up and filtering RolloutSpec resources.
        :param pulumi.Input['RolloutSpecFailurePolicyArgs'] failure_policy: Holds information on how to react when failure happens.
        :param pulumi.Input[str] rollout_spec_name: Identifier name for Ocean CD Rollout Spec. Must be unique
        :param pulumi.Input['RolloutSpecSpotDeploymentArgs'] spot_deployment: Represents the SpotDeployment selector.
        :param pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]] spot_deployments: You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        :param pulumi.Input['RolloutSpecStrategyArgs'] strategy: Determines the Ocean CD strategy
        :param pulumi.Input['RolloutSpecTrafficArgs'] traffic: Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        if failure_policy is not None:
            pulumi.set(__self__, "failure_policy", failure_policy)
        if rollout_spec_name is not None:
            pulumi.set(__self__, "rollout_spec_name", rollout_spec_name)
        if spot_deployment is not None:
            pulumi.set(__self__, "spot_deployment", spot_deployment)
        if spot_deployments is not None:
            pulumi.set(__self__, "spot_deployments", spot_deployments)
        if strategy is not None:
            pulumi.set(__self__, "strategy", strategy)
        if traffic is not None:
            pulumi.set(__self__, "traffic", traffic)

    @property
    @pulumi.getter(name="failurePolicy")
    def failure_policy(self) -> Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']]:
        """
        Holds information on how to react when failure happens.
        """
        return pulumi.get(self, "failure_policy")

    @failure_policy.setter
    def failure_policy(self, value: Optional[pulumi.Input['RolloutSpecFailurePolicyArgs']]):
        pulumi.set(self, "failure_policy", value)

    @property
    @pulumi.getter(name="rolloutSpecName")
    def rollout_spec_name(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier name for Ocean CD Rollout Spec. Must be unique
        """
        return pulumi.get(self, "rollout_spec_name")

    @rollout_spec_name.setter
    def rollout_spec_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rollout_spec_name", value)

    @property
    @pulumi.getter(name="spotDeployment")
    def spot_deployment(self) -> Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']]:
        """
        Represents the SpotDeployment selector.
        """
        return pulumi.get(self, "spot_deployment")

    @spot_deployment.setter
    def spot_deployment(self, value: Optional[pulumi.Input['RolloutSpecSpotDeploymentArgs']]):
        pulumi.set(self, "spot_deployment", value)

    @property
    @pulumi.getter(name="spotDeployments")
    def spot_deployments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]]:
        """
        You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        """
        return pulumi.get(self, "spot_deployments")

    @spot_deployments.setter
    def spot_deployments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RolloutSpecSpotDeploymentArgs']]]]):
        pulumi.set(self, "spot_deployments", value)

    @property
    @pulumi.getter
    def strategy(self) -> Optional[pulumi.Input['RolloutSpecStrategyArgs']]:
        """
        Determines the Ocean CD strategy
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: Optional[pulumi.Input['RolloutSpecStrategyArgs']]):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter
    def traffic(self) -> Optional[pulumi.Input['RolloutSpecTrafficArgs']]:
        """
        Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        return pulumi.get(self, "traffic")

    @traffic.setter
    def traffic(self, value: Optional[pulumi.Input['RolloutSpecTrafficArgs']]):
        pulumi.set(self, "traffic", value)


class RolloutSpec(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 failure_policy: Optional[pulumi.Input[Union['RolloutSpecFailurePolicyArgs', 'RolloutSpecFailurePolicyArgsDict']]] = None,
                 rollout_spec_name: Optional[pulumi.Input[str]] = None,
                 spot_deployment: Optional[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]] = None,
                 spot_deployments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]]]] = None,
                 strategy: Optional[pulumi.Input[Union['RolloutSpecStrategyArgs', 'RolloutSpecStrategyArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[Union['RolloutSpecTrafficArgs', 'RolloutSpecTrafficArgsDict']]] = None,
                 __props__=None):
        """
        Manages a Spotinst OceanCD Rollout Spec resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['RolloutSpecFailurePolicyArgs', 'RolloutSpecFailurePolicyArgsDict']] failure_policy: Holds information on how to react when failure happens.
        :param pulumi.Input[str] rollout_spec_name: Identifier name for Ocean CD Rollout Spec. Must be unique
        :param pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']] spot_deployment: Represents the SpotDeployment selector.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]]] spot_deployments: You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        :param pulumi.Input[Union['RolloutSpecStrategyArgs', 'RolloutSpecStrategyArgsDict']] strategy: Determines the Ocean CD strategy
        :param pulumi.Input[Union['RolloutSpecTrafficArgs', 'RolloutSpecTrafficArgsDict']] traffic: Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RolloutSpecArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Spotinst OceanCD Rollout Spec resource.

        :param str resource_name: The name of the resource.
        :param RolloutSpecArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RolloutSpecArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 failure_policy: Optional[pulumi.Input[Union['RolloutSpecFailurePolicyArgs', 'RolloutSpecFailurePolicyArgsDict']]] = None,
                 rollout_spec_name: Optional[pulumi.Input[str]] = None,
                 spot_deployment: Optional[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]] = None,
                 spot_deployments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]]]] = None,
                 strategy: Optional[pulumi.Input[Union['RolloutSpecStrategyArgs', 'RolloutSpecStrategyArgsDict']]] = None,
                 traffic: Optional[pulumi.Input[Union['RolloutSpecTrafficArgs', 'RolloutSpecTrafficArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RolloutSpecArgs.__new__(RolloutSpecArgs)

            __props__.__dict__["failure_policy"] = failure_policy
            if rollout_spec_name is None and not opts.urn:
                raise TypeError("Missing required property 'rollout_spec_name'")
            __props__.__dict__["rollout_spec_name"] = rollout_spec_name
            __props__.__dict__["spot_deployment"] = spot_deployment
            __props__.__dict__["spot_deployments"] = spot_deployments
            if strategy is None and not opts.urn:
                raise TypeError("Missing required property 'strategy'")
            __props__.__dict__["strategy"] = strategy
            __props__.__dict__["traffic"] = traffic
        super(RolloutSpec, __self__).__init__(
            'spotinst:oceancd/rolloutSpec:RolloutSpec',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            failure_policy: Optional[pulumi.Input[Union['RolloutSpecFailurePolicyArgs', 'RolloutSpecFailurePolicyArgsDict']]] = None,
            rollout_spec_name: Optional[pulumi.Input[str]] = None,
            spot_deployment: Optional[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]] = None,
            spot_deployments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]]]] = None,
            strategy: Optional[pulumi.Input[Union['RolloutSpecStrategyArgs', 'RolloutSpecStrategyArgsDict']]] = None,
            traffic: Optional[pulumi.Input[Union['RolloutSpecTrafficArgs', 'RolloutSpecTrafficArgsDict']]] = None) -> 'RolloutSpec':
        """
        Get an existing RolloutSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['RolloutSpecFailurePolicyArgs', 'RolloutSpecFailurePolicyArgsDict']] failure_policy: Holds information on how to react when failure happens.
        :param pulumi.Input[str] rollout_spec_name: Identifier name for Ocean CD Rollout Spec. Must be unique
        :param pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']] spot_deployment: Represents the SpotDeployment selector.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RolloutSpecSpotDeploymentArgs', 'RolloutSpecSpotDeploymentArgsDict']]]] spot_deployments: You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        :param pulumi.Input[Union['RolloutSpecStrategyArgs', 'RolloutSpecStrategyArgsDict']] strategy: Determines the Ocean CD strategy
        :param pulumi.Input[Union['RolloutSpecTrafficArgs', 'RolloutSpecTrafficArgsDict']] traffic: Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RolloutSpecState.__new__(_RolloutSpecState)

        __props__.__dict__["failure_policy"] = failure_policy
        __props__.__dict__["rollout_spec_name"] = rollout_spec_name
        __props__.__dict__["spot_deployment"] = spot_deployment
        __props__.__dict__["spot_deployments"] = spot_deployments
        __props__.__dict__["strategy"] = strategy
        __props__.__dict__["traffic"] = traffic
        return RolloutSpec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="failurePolicy")
    def failure_policy(self) -> pulumi.Output[Optional['outputs.RolloutSpecFailurePolicy']]:
        """
        Holds information on how to react when failure happens.
        """
        return pulumi.get(self, "failure_policy")

    @property
    @pulumi.getter(name="rolloutSpecName")
    def rollout_spec_name(self) -> pulumi.Output[str]:
        """
        Identifier name for Ocean CD Rollout Spec. Must be unique
        """
        return pulumi.get(self, "rollout_spec_name")

    @property
    @pulumi.getter(name="spotDeployment")
    def spot_deployment(self) -> pulumi.Output[Optional['outputs.RolloutSpecSpotDeployment']]:
        """
        Represents the SpotDeployment selector.
        """
        return pulumi.get(self, "spot_deployment")

    @property
    @pulumi.getter(name="spotDeployments")
    def spot_deployments(self) -> pulumi.Output[Optional[Sequence['outputs.RolloutSpecSpotDeployment']]]:
        """
        You must specify either `spotDeployment` OR `spotDeployments` but not both. Every SpotDeployment has to be unique. If more than one `SpotDeployment` has been configured, no `traffic` managers can be set as part of the RolloutSpec.For such case ensure that each of the chosen SpotDeployments are being exposed with different Kubernetes services.
        """
        return pulumi.get(self, "spot_deployments")

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Output['outputs.RolloutSpecStrategy']:
        """
        Determines the Ocean CD strategy
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter
    def traffic(self) -> pulumi.Output[Optional['outputs.RolloutSpecTraffic']]:
        """
        Hosts all of the supported service meshes needed to enable more fine-grained traffic routing. In case `SpotDeployments` contains more than one SpotDeployment the `traffic` manager may not be configured.
        """
        return pulumi.get(self, "traffic")

