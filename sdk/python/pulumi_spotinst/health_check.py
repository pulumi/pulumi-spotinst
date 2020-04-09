# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class HealthCheck(pulumi.CustomResource):
    check: pulumi.Output[dict]
    """
    Describes the check to execute.

      * `endPoint` (`str`)
      * `healthy` (`float`) - The number of consecutive successful health checks that must occur before declaring an instance healthy.
      * `interval` (`float`) - The amount of time (in seconds) between each health check (minimum: 10).
      * `port` (`float`) - The port of the Spotinst HCS (default: 80).
      * `protocol` (`str`) - The protocol to use to connect with the instance. Valid values: http, https.
      * `timeOut` (`float`)
      * `unhealthy` (`float`) - The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
    """
    name: pulumi.Output[str]
    """
    The name of the health check.
    """
    proxy_address: pulumi.Output[str]
    proxy_port: pulumi.Output[float]
    resource_id: pulumi.Output[str]
    """
    The ID of the resource to check.
    """
    def __init__(__self__, resource_name, opts=None, check=None, name=None, proxy_address=None, proxy_port=None, resource_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Health Check resource.



        > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/health_check.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.

        The **check** object supports the following:

          * `endPoint` (`pulumi.Input[str]`)
          * `healthy` (`pulumi.Input[float]`) - The number of consecutive successful health checks that must occur before declaring an instance healthy.
          * `interval` (`pulumi.Input[float]`) - The amount of time (in seconds) between each health check (minimum: 10).
          * `port` (`pulumi.Input[float]`) - The port of the Spotinst HCS (default: 80).
          * `protocol` (`pulumi.Input[str]`) - The protocol to use to connect with the instance. Valid values: http, https.
          * `timeOut` (`pulumi.Input[float]`)
          * `unhealthy` (`pulumi.Input[float]`) - The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['check'] = check
            __props__['name'] = name
            if proxy_address is None:
                raise TypeError("Missing required property 'proxy_address'")
            __props__['proxy_address'] = proxy_address
            __props__['proxy_port'] = proxy_port
            if resource_id is None:
                raise TypeError("Missing required property 'resource_id'")
            __props__['resource_id'] = resource_id
        super(HealthCheck, __self__).__init__(
            'spotinst:index/healthCheck:HealthCheck',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, check=None, name=None, proxy_address=None, proxy_port=None, resource_id=None):
        """
        Get an existing HealthCheck resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[dict] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.

        The **check** object supports the following:

          * `endPoint` (`pulumi.Input[str]`)
          * `healthy` (`pulumi.Input[float]`) - The number of consecutive successful health checks that must occur before declaring an instance healthy.
          * `interval` (`pulumi.Input[float]`) - The amount of time (in seconds) between each health check (minimum: 10).
          * `port` (`pulumi.Input[float]`) - The port of the Spotinst HCS (default: 80).
          * `protocol` (`pulumi.Input[str]`) - The protocol to use to connect with the instance. Valid values: http, https.
          * `timeOut` (`pulumi.Input[float]`)
          * `unhealthy` (`pulumi.Input[float]`) - The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["check"] = check
        __props__["name"] = name
        __props__["proxy_address"] = proxy_address
        __props__["proxy_port"] = proxy_port
        __props__["resource_id"] = resource_id
        return HealthCheck(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

