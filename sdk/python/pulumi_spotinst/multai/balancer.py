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

__all__ = ['BalancerArgs', 'Balancer']

@pulumi.input_type
class BalancerArgs:
    def __init__(__self__, *,
                 connection_timeouts: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']] = None,
                 dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]] = None):
        """
        The set of arguments for constructing a Balancer resource.
        """
        BalancerArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            connection_timeouts=connection_timeouts,
            dns_cname_aliases=dns_cname_aliases,
            name=name,
            scheme=scheme,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             connection_timeouts: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']] = None,
             dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             scheme: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if connection_timeouts is None and 'connectionTimeouts' in kwargs:
            connection_timeouts = kwargs['connectionTimeouts']
        if dns_cname_aliases is None and 'dnsCnameAliases' in kwargs:
            dns_cname_aliases = kwargs['dnsCnameAliases']

        if connection_timeouts is not None:
            _setter("connection_timeouts", connection_timeouts)
        if dns_cname_aliases is not None:
            _setter("dns_cname_aliases", dns_cname_aliases)
        if name is not None:
            _setter("name", name)
        if scheme is not None:
            _setter("scheme", scheme)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="connectionTimeouts")
    def connection_timeouts(self) -> Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']]:
        return pulumi.get(self, "connection_timeouts")

    @connection_timeouts.setter
    def connection_timeouts(self, value: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']]):
        pulumi.set(self, "connection_timeouts", value)

    @property
    @pulumi.getter(name="dnsCnameAliases")
    def dns_cname_aliases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "dns_cname_aliases")

    @dns_cname_aliases.setter
    def dns_cname_aliases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "dns_cname_aliases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def scheme(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "scheme")

    @scheme.setter
    def scheme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheme", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _BalancerState:
    def __init__(__self__, *,
                 connection_timeouts: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']] = None,
                 dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering Balancer resources.
        """
        _BalancerState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            connection_timeouts=connection_timeouts,
            dns_cname_aliases=dns_cname_aliases,
            name=name,
            scheme=scheme,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             connection_timeouts: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']] = None,
             dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             scheme: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if connection_timeouts is None and 'connectionTimeouts' in kwargs:
            connection_timeouts = kwargs['connectionTimeouts']
        if dns_cname_aliases is None and 'dnsCnameAliases' in kwargs:
            dns_cname_aliases = kwargs['dnsCnameAliases']

        if connection_timeouts is not None:
            _setter("connection_timeouts", connection_timeouts)
        if dns_cname_aliases is not None:
            _setter("dns_cname_aliases", dns_cname_aliases)
        if name is not None:
            _setter("name", name)
        if scheme is not None:
            _setter("scheme", scheme)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="connectionTimeouts")
    def connection_timeouts(self) -> Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']]:
        return pulumi.get(self, "connection_timeouts")

    @connection_timeouts.setter
    def connection_timeouts(self, value: Optional[pulumi.Input['BalancerConnectionTimeoutsArgs']]):
        pulumi.set(self, "connection_timeouts", value)

    @property
    @pulumi.getter(name="dnsCnameAliases")
    def dns_cname_aliases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "dns_cname_aliases")

    @dns_cname_aliases.setter
    def dns_cname_aliases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "dns_cname_aliases", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def scheme(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "scheme")

    @scheme.setter
    def scheme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheme", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BalancerTagArgs']]]]):
        pulumi.set(self, "tags", value)


class Balancer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_timeouts: Optional[pulumi.Input[pulumi.InputType['BalancerConnectionTimeoutsArgs']]] = None,
                 dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BalancerTagArgs']]]]] = None,
                 __props__=None):
        """
        Create a Balancer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BalancerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Balancer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param BalancerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BalancerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BalancerArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_timeouts: Optional[pulumi.Input[pulumi.InputType['BalancerConnectionTimeoutsArgs']]] = None,
                 dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BalancerTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BalancerArgs.__new__(BalancerArgs)

            if connection_timeouts is not None and not isinstance(connection_timeouts, BalancerConnectionTimeoutsArgs):
                connection_timeouts = connection_timeouts or {}
                def _setter(key, value):
                    connection_timeouts[key] = value
                BalancerConnectionTimeoutsArgs._configure(_setter, **connection_timeouts)
            __props__.__dict__["connection_timeouts"] = connection_timeouts
            __props__.__dict__["dns_cname_aliases"] = dns_cname_aliases
            __props__.__dict__["name"] = name
            __props__.__dict__["scheme"] = scheme
            __props__.__dict__["tags"] = tags
        super(Balancer, __self__).__init__(
            'spotinst:multai/balancer:Balancer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_timeouts: Optional[pulumi.Input[pulumi.InputType['BalancerConnectionTimeoutsArgs']]] = None,
            dns_cname_aliases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            scheme: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BalancerTagArgs']]]]] = None) -> 'Balancer':
        """
        Get an existing Balancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BalancerState.__new__(_BalancerState)

        __props__.__dict__["connection_timeouts"] = connection_timeouts
        __props__.__dict__["dns_cname_aliases"] = dns_cname_aliases
        __props__.__dict__["name"] = name
        __props__.__dict__["scheme"] = scheme
        __props__.__dict__["tags"] = tags
        return Balancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionTimeouts")
    def connection_timeouts(self) -> pulumi.Output[Optional['outputs.BalancerConnectionTimeouts']]:
        return pulumi.get(self, "connection_timeouts")

    @property
    @pulumi.getter(name="dnsCnameAliases")
    def dns_cname_aliases(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "dns_cname_aliases")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def scheme(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "scheme")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.BalancerTag']]]:
        return pulumi.get(self, "tags")

