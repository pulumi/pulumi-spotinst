# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['HealthCheckArgs', 'HealthCheck']

@pulumi.input_type
class HealthCheckArgs:
    def __init__(__self__, *,
                 proxy_address: pulumi.Input[str],
                 resource_id: pulumi.Input[str],
                 check: Optional[pulumi.Input['HealthCheckCheckArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_port: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a HealthCheck resource.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.
        :param pulumi.Input['HealthCheckCheckArgs'] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        """
        pulumi.set(__self__, "proxy_address", proxy_address)
        pulumi.set(__self__, "resource_id", resource_id)
        if check is not None:
            pulumi.set(__self__, "check", check)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if proxy_port is not None:
            pulumi.set(__self__, "proxy_port", proxy_port)

    @property
    @pulumi.getter(name="proxyAddress")
    def proxy_address(self) -> pulumi.Input[str]:
        return pulumi.get(self, "proxy_address")

    @proxy_address.setter
    def proxy_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "proxy_address", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        The ID of the resource to check.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter
    def check(self) -> Optional[pulumi.Input['HealthCheckCheckArgs']]:
        """
        Describes the check to execute.
        """
        return pulumi.get(self, "check")

    @check.setter
    def check(self, value: Optional[pulumi.Input['HealthCheckCheckArgs']]):
        pulumi.set(self, "check", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the health check.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="proxyPort")
    def proxy_port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "proxy_port")

    @proxy_port.setter
    def proxy_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "proxy_port", value)


@pulumi.input_type
class _HealthCheckState:
    def __init__(__self__, *,
                 check: Optional[pulumi.Input['HealthCheckCheckArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_address: Optional[pulumi.Input[str]] = None,
                 proxy_port: Optional[pulumi.Input[int]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HealthCheck resources.
        :param pulumi.Input['HealthCheckCheckArgs'] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.
        """
        if check is not None:
            pulumi.set(__self__, "check", check)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if proxy_address is not None:
            pulumi.set(__self__, "proxy_address", proxy_address)
        if proxy_port is not None:
            pulumi.set(__self__, "proxy_port", proxy_port)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)

    @property
    @pulumi.getter
    def check(self) -> Optional[pulumi.Input['HealthCheckCheckArgs']]:
        """
        Describes the check to execute.
        """
        return pulumi.get(self, "check")

    @check.setter
    def check(self, value: Optional[pulumi.Input['HealthCheckCheckArgs']]):
        pulumi.set(self, "check", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the health check.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="proxyAddress")
    def proxy_address(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "proxy_address")

    @proxy_address.setter
    def proxy_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_address", value)

    @property
    @pulumi.getter(name="proxyPort")
    def proxy_port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "proxy_port")

    @proxy_port.setter
    def proxy_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "proxy_port", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource to check.
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)


class HealthCheck(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 check: Optional[pulumi.Input[pulumi.InputType['HealthCheckCheckArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_address: Optional[pulumi.Input[str]] = None,
                 proxy_port: Optional[pulumi.Input[int]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Spotinst Health Check resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        http_check = spotinst.HealthCheck("httpCheck",
            check=spotinst.HealthCheckCheckArgs(
                endpoint="http://endpoint.com",
                healthy=1,
                interval=10,
                port=1337,
                protocol="http",
                timeout=10,
                unhealthy=1,
            ),
            proxy_address="http://proxy.com",
            proxy_port=80,
            resource_id="sig-123")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['HealthCheckCheckArgs']] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HealthCheckArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst Health Check resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        http_check = spotinst.HealthCheck("httpCheck",
            check=spotinst.HealthCheckCheckArgs(
                endpoint="http://endpoint.com",
                healthy=1,
                interval=10,
                port=1337,
                protocol="http",
                timeout=10,
                unhealthy=1,
            ),
            proxy_address="http://proxy.com",
            proxy_port=80,
            resource_id="sig-123")
        ```

        :param str resource_name: The name of the resource.
        :param HealthCheckArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HealthCheckArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 check: Optional[pulumi.Input[pulumi.InputType['HealthCheckCheckArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_address: Optional[pulumi.Input[str]] = None,
                 proxy_port: Optional[pulumi.Input[int]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HealthCheckArgs.__new__(HealthCheckArgs)

            __props__.__dict__["check"] = check
            __props__.__dict__["name"] = name
            if proxy_address is None and not opts.urn:
                raise TypeError("Missing required property 'proxy_address'")
            __props__.__dict__["proxy_address"] = proxy_address
            __props__.__dict__["proxy_port"] = proxy_port
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
        super(HealthCheck, __self__).__init__(
            'spotinst:index/healthCheck:HealthCheck',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            check: Optional[pulumi.Input[pulumi.InputType['HealthCheckCheckArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            proxy_address: Optional[pulumi.Input[str]] = None,
            proxy_port: Optional[pulumi.Input[int]] = None,
            resource_id: Optional[pulumi.Input[str]] = None) -> 'HealthCheck':
        """
        Get an existing HealthCheck resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['HealthCheckCheckArgs']] check: Describes the check to execute.
        :param pulumi.Input[str] name: The name of the health check.
        :param pulumi.Input[str] resource_id: The ID of the resource to check.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HealthCheckState.__new__(_HealthCheckState)

        __props__.__dict__["check"] = check
        __props__.__dict__["name"] = name
        __props__.__dict__["proxy_address"] = proxy_address
        __props__.__dict__["proxy_port"] = proxy_port
        __props__.__dict__["resource_id"] = resource_id
        return HealthCheck(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def check(self) -> pulumi.Output[Optional['outputs.HealthCheckCheck']]:
        """
        Describes the check to execute.
        """
        return pulumi.get(self, "check")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the health check.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="proxyAddress")
    def proxy_address(self) -> pulumi.Output[str]:
        return pulumi.get(self, "proxy_address")

    @property
    @pulumi.getter(name="proxyPort")
    def proxy_port(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "proxy_port")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource to check.
        """
        return pulumi.get(self, "resource_id")

