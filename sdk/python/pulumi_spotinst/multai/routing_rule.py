# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import _utilities, _tables


class RoutingRule(pulumi.CustomResource):
    balancer_id: pulumi.Output[str]
    """
    The ID of the balancer.
    """
    listener_id: pulumi.Output[str]
    """
    The ID of the listener.
    """
    middleware_ids: pulumi.Output[list]
    priority: pulumi.Output[float]
    route: pulumi.Output[str]
    """
    Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
    """
    strategy: pulumi.Output[str]
    """
    Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
    """
    tags: pulumi.Output[list]
    """
    A list of key:value paired tags.

      * `key` (`str`) - The tag's key.
      * `value` (`str`) - The tag's value.
    """
    target_set_ids: pulumi.Output[list]
    def __init__(__self__, resource_name, opts=None, balancer_id=None, listener_id=None, middleware_ids=None, priority=None, route=None, strategy=None, tags=None, target_set_ids=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Multai Routing Rule.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        my_routing_rule = spotinst.multai.RoutingRule("myRoutingRule",
            balancer_id="b-12345",
            listener_id="l-98765",
            route="Path(`/bar`)",
            strategy="LEASTCONN",
            tags=[{
                "key": "env",
                "value": "prod",
            }])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] balancer_id: The ID of the balancer.
        :param pulumi.Input[str] listener_id: The ID of the listener.
        :param pulumi.Input[str] route: Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
        :param pulumi.Input[str] strategy: Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
        :param pulumi.Input[list] tags: A list of key:value paired tags.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag's key.
          * `value` (`pulumi.Input[str]`) - The tag's value.
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

            if balancer_id is None:
                raise TypeError("Missing required property 'balancer_id'")
            __props__['balancer_id'] = balancer_id
            if listener_id is None:
                raise TypeError("Missing required property 'listener_id'")
            __props__['listener_id'] = listener_id
            __props__['middleware_ids'] = middleware_ids
            __props__['priority'] = priority
            if route is None:
                raise TypeError("Missing required property 'route'")
            __props__['route'] = route
            __props__['strategy'] = strategy
            __props__['tags'] = tags
            if target_set_ids is None:
                raise TypeError("Missing required property 'target_set_ids'")
            __props__['target_set_ids'] = target_set_ids
        super(RoutingRule, __self__).__init__(
            'spotinst:multai/routingRule:RoutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, balancer_id=None, listener_id=None, middleware_ids=None, priority=None, route=None, strategy=None, tags=None, target_set_ids=None):
        """
        Get an existing RoutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] balancer_id: The ID of the balancer.
        :param pulumi.Input[str] listener_id: The ID of the listener.
        :param pulumi.Input[str] route: Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
        :param pulumi.Input[str] strategy: Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
        :param pulumi.Input[list] tags: A list of key:value paired tags.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag's key.
          * `value` (`pulumi.Input[str]`) - The tag's value.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["balancer_id"] = balancer_id
        __props__["listener_id"] = listener_id
        __props__["middleware_ids"] = middleware_ids
        __props__["priority"] = priority
        __props__["route"] = route
        __props__["strategy"] = strategy
        __props__["tags"] = tags
        __props__["target_set_ids"] = target_set_ids
        return RoutingRule(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
