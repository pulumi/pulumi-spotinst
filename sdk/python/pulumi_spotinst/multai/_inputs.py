# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'BalancerConnectionTimeoutsArgs',
    'BalancerTagArgs',
    'ListenerTagArgs',
    'ListenerTlsConfigArgs',
    'RoutingRuleTagArgs',
    'TargetSetHealthCheckArgs',
    'TargetSetTagArgs',
    'TargetTagArgs',
]

@pulumi.input_type
class BalancerConnectionTimeoutsArgs:
    def __init__(__self__, *,
                 draining: Optional[pulumi.Input[int]] = None,
                 idle: Optional[pulumi.Input[int]] = None):
        if draining is not None:
            pulumi.set(__self__, "draining", draining)
        if idle is not None:
            pulumi.set(__self__, "idle", idle)

    @property
    @pulumi.getter
    def draining(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "draining")

    @draining.setter
    def draining(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "draining", value)

    @property
    @pulumi.getter
    def idle(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "idle")

    @idle.setter
    def idle(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "idle", value)


@pulumi.input_type
class BalancerTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class ListenerTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class ListenerTlsConfigArgs:
    def __init__(__self__, *,
                 certificate_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 cipher_suites: pulumi.Input[Sequence[pulumi.Input[str]]],
                 max_version: pulumi.Input[str],
                 min_version: pulumi.Input[str],
                 prefer_server_cipher_suites: pulumi.Input[bool],
                 session_tickets_disabled: pulumi.Input[bool]):
        pulumi.set(__self__, "certificate_ids", certificate_ids)
        pulumi.set(__self__, "cipher_suites", cipher_suites)
        pulumi.set(__self__, "max_version", max_version)
        pulumi.set(__self__, "min_version", min_version)
        pulumi.set(__self__, "prefer_server_cipher_suites", prefer_server_cipher_suites)
        pulumi.set(__self__, "session_tickets_disabled", session_tickets_disabled)

    @property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "certificate_ids")

    @certificate_ids.setter
    def certificate_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "certificate_ids", value)

    @property
    @pulumi.getter(name="cipherSuites")
    def cipher_suites(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        return pulumi.get(self, "cipher_suites")

    @cipher_suites.setter
    def cipher_suites(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "cipher_suites", value)

    @property
    @pulumi.getter(name="maxVersion")
    def max_version(self) -> pulumi.Input[str]:
        return pulumi.get(self, "max_version")

    @max_version.setter
    def max_version(self, value: pulumi.Input[str]):
        pulumi.set(self, "max_version", value)

    @property
    @pulumi.getter(name="minVersion")
    def min_version(self) -> pulumi.Input[str]:
        return pulumi.get(self, "min_version")

    @min_version.setter
    def min_version(self, value: pulumi.Input[str]):
        pulumi.set(self, "min_version", value)

    @property
    @pulumi.getter(name="preferServerCipherSuites")
    def prefer_server_cipher_suites(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "prefer_server_cipher_suites")

    @prefer_server_cipher_suites.setter
    def prefer_server_cipher_suites(self, value: pulumi.Input[bool]):
        pulumi.set(self, "prefer_server_cipher_suites", value)

    @property
    @pulumi.getter(name="sessionTicketsDisabled")
    def session_tickets_disabled(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "session_tickets_disabled")

    @session_tickets_disabled.setter
    def session_tickets_disabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "session_tickets_disabled", value)


@pulumi.input_type
class RoutingRuleTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class TargetSetHealthCheckArgs:
    def __init__(__self__, *,
                 healthy_threshold: pulumi.Input[int],
                 interval: pulumi.Input[int],
                 path: pulumi.Input[str],
                 protocol: pulumi.Input[str],
                 timeout: pulumi.Input[int],
                 unhealthy_threshold: pulumi.Input[int],
                 port: Optional[pulumi.Input[int]] = None):
        pulumi.set(__self__, "healthy_threshold", healthy_threshold)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "path", path)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "timeout", timeout)
        pulumi.set(__self__, "unhealthy_threshold", unhealthy_threshold)
        if port is not None:
            pulumi.set(__self__, "port", port)

    @property
    @pulumi.getter(name="healthyThreshold")
    def healthy_threshold(self) -> pulumi.Input[int]:
        return pulumi.get(self, "healthy_threshold")

    @healthy_threshold.setter
    def healthy_threshold(self, value: pulumi.Input[int]):
        pulumi.set(self, "healthy_threshold", value)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[int]:
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[int]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def path(self) -> pulumi.Input[str]:
        return pulumi.get(self, "path")

    @path.setter
    def path(self, value: pulumi.Input[str]):
        pulumi.set(self, "path", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def timeout(self) -> pulumi.Input[int]:
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: pulumi.Input[int]):
        pulumi.set(self, "timeout", value)

    @property
    @pulumi.getter(name="unhealthyThreshold")
    def unhealthy_threshold(self) -> pulumi.Input[int]:
        return pulumi.get(self, "unhealthy_threshold")

    @unhealthy_threshold.setter
    def unhealthy_threshold(self, value: pulumi.Input[int]):
        pulumi.set(self, "unhealthy_threshold", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)


@pulumi.input_type
class TargetSetTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class TargetTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


