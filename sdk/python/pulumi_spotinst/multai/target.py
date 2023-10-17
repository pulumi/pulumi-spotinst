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

__all__ = ['TargetArgs', 'Target']

@pulumi.input_type
class TargetArgs:
    def __init__(__self__, *,
                 balancer_id: pulumi.Input[str],
                 host: pulumi.Input[str],
                 target_set_id: pulumi.Input[str],
                 weight: pulumi.Input[int],
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]] = None):
        """
        The set of arguments for constructing a Target resource.
        """
        TargetArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            balancer_id=balancer_id,
            host=host,
            target_set_id=target_set_id,
            weight=weight,
            name=name,
            port=port,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             balancer_id: pulumi.Input[str],
             host: pulumi.Input[str],
             target_set_id: pulumi.Input[str],
             weight: pulumi.Input[int],
             name: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[int]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'balancerId' in kwargs:
            balancer_id = kwargs['balancerId']
        if 'targetSetId' in kwargs:
            target_set_id = kwargs['targetSetId']

        _setter("balancer_id", balancer_id)
        _setter("host", host)
        _setter("target_set_id", target_set_id)
        _setter("weight", weight)
        if name is not None:
            _setter("name", name)
        if port is not None:
            _setter("port", port)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="balancerId")
    def balancer_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "balancer_id")

    @balancer_id.setter
    def balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "balancer_id", value)

    @property
    @pulumi.getter
    def host(self) -> pulumi.Input[str]:
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: pulumi.Input[str]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter(name="targetSetId")
    def target_set_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "target_set_id")

    @target_set_id.setter
    def target_set_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_set_id", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[int]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[int]):
        pulumi.set(self, "weight", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TargetState:
    def __init__(__self__, *,
                 balancer_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]] = None,
                 target_set_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Target resources.
        """
        _TargetState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            balancer_id=balancer_id,
            host=host,
            name=name,
            port=port,
            tags=tags,
            target_set_id=target_set_id,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             balancer_id: Optional[pulumi.Input[str]] = None,
             host: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[int]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]] = None,
             target_set_id: Optional[pulumi.Input[str]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'balancerId' in kwargs:
            balancer_id = kwargs['balancerId']
        if 'targetSetId' in kwargs:
            target_set_id = kwargs['targetSetId']

        if balancer_id is not None:
            _setter("balancer_id", balancer_id)
        if host is not None:
            _setter("host", host)
        if name is not None:
            _setter("name", name)
        if port is not None:
            _setter("port", port)
        if tags is not None:
            _setter("tags", tags)
        if target_set_id is not None:
            _setter("target_set_id", target_set_id)
        if weight is not None:
            _setter("weight", weight)

    @property
    @pulumi.getter(name="balancerId")
    def balancer_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "balancer_id")

    @balancer_id.setter
    def balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "balancer_id", value)

    @property
    @pulumi.getter
    def host(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "host")

    @host.setter
    def host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TargetTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="targetSetId")
    def target_set_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "target_set_id")

    @target_set_id.setter
    def target_set_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_set_id", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class Target(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 balancer_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TargetTagArgs']]]]] = None,
                 target_set_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a Target resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TargetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Target resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param TargetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TargetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TargetArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 balancer_id: Optional[pulumi.Input[str]] = None,
                 host: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TargetTagArgs']]]]] = None,
                 target_set_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TargetArgs.__new__(TargetArgs)

            if balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'balancer_id'")
            __props__.__dict__["balancer_id"] = balancer_id
            if host is None and not opts.urn:
                raise TypeError("Missing required property 'host'")
            __props__.__dict__["host"] = host
            __props__.__dict__["name"] = name
            __props__.__dict__["port"] = port
            __props__.__dict__["tags"] = tags
            if target_set_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_set_id'")
            __props__.__dict__["target_set_id"] = target_set_id
            if weight is None and not opts.urn:
                raise TypeError("Missing required property 'weight'")
            __props__.__dict__["weight"] = weight
        super(Target, __self__).__init__(
            'spotinst:multai/target:Target',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            balancer_id: Optional[pulumi.Input[str]] = None,
            host: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TargetTagArgs']]]]] = None,
            target_set_id: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'Target':
        """
        Get an existing Target resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TargetState.__new__(_TargetState)

        __props__.__dict__["balancer_id"] = balancer_id
        __props__.__dict__["host"] = host
        __props__.__dict__["name"] = name
        __props__.__dict__["port"] = port
        __props__.__dict__["tags"] = tags
        __props__.__dict__["target_set_id"] = target_set_id
        __props__.__dict__["weight"] = weight
        return Target(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="balancerId")
    def balancer_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "balancer_id")

    @property
    @pulumi.getter
    def host(self) -> pulumi.Output[str]:
        return pulumi.get(self, "host")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.TargetTag']]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="targetSetId")
    def target_set_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "target_set_id")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[int]:
        return pulumi.get(self, "weight")

