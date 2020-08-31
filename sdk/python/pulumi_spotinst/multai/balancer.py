# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Balancer']


class Balancer(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_timeouts: Optional[pulumi.Input[pulumi.InputType['BalancerConnectionTimeoutsArgs']]] = None,
                 dns_cname_aliases: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['BalancerTagArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Balancer resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['connection_timeouts'] = connection_timeouts
            __props__['dns_cname_aliases'] = dns_cname_aliases
            __props__['name'] = name
            __props__['scheme'] = scheme
            __props__['tags'] = tags
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
            dns_cname_aliases: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            scheme: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['BalancerTagArgs']]]]] = None) -> 'Balancer':
        """
        Get an existing Balancer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["connection_timeouts"] = connection_timeouts
        __props__["dns_cname_aliases"] = dns_cname_aliases
        __props__["name"] = name
        __props__["scheme"] = scheme
        __props__["tags"] = tags
        return Balancer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionTimeouts")
    def connection_timeouts(self) -> pulumi.Output[Optional['outputs.BalancerConnectionTimeouts']]:
        return pulumi.get(self, "connection_timeouts")

    @property
    @pulumi.getter(name="dnsCnameAliases")
    def dns_cname_aliases(self) -> pulumi.Output[Optional[List[str]]]:
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
    def tags(self) -> pulumi.Output[Optional[List['outputs.BalancerTag']]]:
        return pulumi.get(self, "tags")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

