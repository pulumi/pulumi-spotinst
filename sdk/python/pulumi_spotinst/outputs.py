# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = [
    'HealthCheckCheck',
]

@pulumi.output_type
class HealthCheckCheck(dict):
    def __init__(__self__, *,
                 healthy: float,
                 interval: float,
                 port: float,
                 protocol: str,
                 unhealthy: float,
                 end_point: Optional[str] = None,
                 endpoint: Optional[str] = None,
                 time_out: Optional[float] = None,
                 timeout: Optional[float] = None):
        """
        :param float healthy: The number of consecutive successful health checks that must occur before declaring an instance healthy.
        :param float interval: The amount of time (in seconds) between each health check (minimum: 10).
        :param float port: The port of the Spotinst HCS (default: 80).
        :param str protocol: The protocol to use to connect with the instance. Valid values: http, https.
        :param float unhealthy: The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        :param str endpoint: The destination for the request.
        :param float timeout: the amount of time (in seconds) to wait when receiving a response from the health check.
        """
        pulumi.set(__self__, "healthy", healthy)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "unhealthy", unhealthy)
        if end_point is not None:
            pulumi.set(__self__, "end_point", end_point)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if time_out is not None:
            pulumi.set(__self__, "time_out", time_out)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def healthy(self) -> float:
        """
        The number of consecutive successful health checks that must occur before declaring an instance healthy.
        """
        return pulumi.get(self, "healthy")

    @property
    @pulumi.getter
    def interval(self) -> float:
        """
        The amount of time (in seconds) between each health check (minimum: 10).
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def port(self) -> float:
        """
        The port of the Spotinst HCS (default: 80).
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The protocol to use to connect with the instance. Valid values: http, https.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def unhealthy(self) -> float:
        """
        The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        """
        return pulumi.get(self, "unhealthy")

    @property
    @pulumi.getter(name="endPoint")
    def end_point(self) -> Optional[str]:
        return pulumi.get(self, "end_point")

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[str]:
        """
        The destination for the request.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="timeOut")
    def time_out(self) -> Optional[float]:
        return pulumi.get(self, "time_out")

    @property
    @pulumi.getter
    def timeout(self) -> Optional[float]:
        """
        the amount of time (in seconds) to wait when receiving a response from the health check.
        """
        return pulumi.get(self, "timeout")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


