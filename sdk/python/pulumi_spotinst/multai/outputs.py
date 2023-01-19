# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'BalancerConnectionTimeouts',
    'BalancerTag',
    'ListenerTag',
    'ListenerTlsConfig',
    'RoutingRuleTag',
    'TargetSetHealthCheck',
    'TargetSetTag',
    'TargetTag',
]

@pulumi.output_type
class BalancerConnectionTimeouts(dict):
    def __init__(__self__, *,
                 draining: Optional[int] = None,
                 idle: Optional[int] = None):
        if draining is not None:
            pulumi.set(__self__, "draining", draining)
        if idle is not None:
            pulumi.set(__self__, "idle", idle)

    @property
    @pulumi.getter
    def draining(self) -> Optional[int]:
        return pulumi.get(self, "draining")

    @property
    @pulumi.getter
    def idle(self) -> Optional[int]:
        return pulumi.get(self, "idle")


@pulumi.output_type
class BalancerTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class ListenerTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class ListenerTlsConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "certificateIds":
            suggest = "certificate_ids"
        elif key == "cipherSuites":
            suggest = "cipher_suites"
        elif key == "maxVersion":
            suggest = "max_version"
        elif key == "minVersion":
            suggest = "min_version"
        elif key == "preferServerCipherSuites":
            suggest = "prefer_server_cipher_suites"
        elif key == "sessionTicketsDisabled":
            suggest = "session_tickets_disabled"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ListenerTlsConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ListenerTlsConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ListenerTlsConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 certificate_ids: Sequence[str],
                 cipher_suites: Sequence[str],
                 max_version: str,
                 min_version: str,
                 prefer_server_cipher_suites: bool,
                 session_tickets_disabled: bool):
        pulumi.set(__self__, "certificate_ids", certificate_ids)
        pulumi.set(__self__, "cipher_suites", cipher_suites)
        pulumi.set(__self__, "max_version", max_version)
        pulumi.set(__self__, "min_version", min_version)
        pulumi.set(__self__, "prefer_server_cipher_suites", prefer_server_cipher_suites)
        pulumi.set(__self__, "session_tickets_disabled", session_tickets_disabled)

    @property
    @pulumi.getter(name="certificateIds")
    def certificate_ids(self) -> Sequence[str]:
        return pulumi.get(self, "certificate_ids")

    @property
    @pulumi.getter(name="cipherSuites")
    def cipher_suites(self) -> Sequence[str]:
        return pulumi.get(self, "cipher_suites")

    @property
    @pulumi.getter(name="maxVersion")
    def max_version(self) -> str:
        return pulumi.get(self, "max_version")

    @property
    @pulumi.getter(name="minVersion")
    def min_version(self) -> str:
        return pulumi.get(self, "min_version")

    @property
    @pulumi.getter(name="preferServerCipherSuites")
    def prefer_server_cipher_suites(self) -> bool:
        return pulumi.get(self, "prefer_server_cipher_suites")

    @property
    @pulumi.getter(name="sessionTicketsDisabled")
    def session_tickets_disabled(self) -> bool:
        return pulumi.get(self, "session_tickets_disabled")


@pulumi.output_type
class RoutingRuleTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class TargetSetHealthCheck(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "healthyThreshold":
            suggest = "healthy_threshold"
        elif key == "unhealthyThreshold":
            suggest = "unhealthy_threshold"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TargetSetHealthCheck. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TargetSetHealthCheck.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TargetSetHealthCheck.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 healthy_threshold: int,
                 interval: int,
                 path: str,
                 protocol: str,
                 timeout: int,
                 unhealthy_threshold: int,
                 port: Optional[int] = None):
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
    def healthy_threshold(self) -> int:
        return pulumi.get(self, "healthy_threshold")

    @property
    @pulumi.getter
    def interval(self) -> int:
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def path(self) -> str:
        return pulumi.get(self, "path")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def timeout(self) -> int:
        return pulumi.get(self, "timeout")

    @property
    @pulumi.getter(name="unhealthyThreshold")
    def unhealthy_threshold(self) -> int:
        return pulumi.get(self, "unhealthy_threshold")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        return pulumi.get(self, "port")


@pulumi.output_type
class TargetSetTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


@pulumi.output_type
class TargetTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")


