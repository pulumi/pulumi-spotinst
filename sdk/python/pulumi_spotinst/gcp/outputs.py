# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'ElastigroupBackendService',
    'ElastigroupBackendServiceNamedPort',
    'ElastigroupDisk',
    'ElastigroupDiskInitializeParam',
    'ElastigroupGpu',
    'ElastigroupInstanceTypesCustom',
    'ElastigroupIntegrationDockerSwarm',
    'ElastigroupIntegrationGke',
    'ElastigroupIntegrationGkeAutoscaleDown',
    'ElastigroupIntegrationGkeAutoscaleHeadroom',
    'ElastigroupIntegrationGkeAutoscaleLabel',
    'ElastigroupLabel',
    'ElastigroupMetadata',
    'ElastigroupNetworkInterface',
    'ElastigroupNetworkInterfaceAccessConfig',
    'ElastigroupNetworkInterfaceAliasIpRange',
    'ElastigroupScalingDownPolicy',
    'ElastigroupScalingDownPolicyDimension',
    'ElastigroupScalingUpPolicy',
    'ElastigroupScalingUpPolicyDimension',
    'ElastigroupScheduledTask',
    'ElastigroupSubnet',
]

@pulumi.output_type
class ElastigroupBackendService(dict):
    def __init__(__self__, *,
                 service_name: str,
                 location_type: Optional[str] = None,
                 named_ports: Optional[Sequence['outputs.ElastigroupBackendServiceNamedPort']] = None,
                 scheme: Optional[str] = None):
        pulumi.set(__self__, "service_name", service_name)
        if location_type is not None:
            pulumi.set(__self__, "location_type", location_type)
        if named_ports is not None:
            pulumi.set(__self__, "named_ports", named_ports)
        if scheme is not None:
            pulumi.set(__self__, "scheme", scheme)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> str:
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="locationType")
    def location_type(self) -> Optional[str]:
        return pulumi.get(self, "location_type")

    @property
    @pulumi.getter(name="namedPorts")
    def named_ports(self) -> Optional[Sequence['outputs.ElastigroupBackendServiceNamedPort']]:
        return pulumi.get(self, "named_ports")

    @property
    @pulumi.getter
    def scheme(self) -> Optional[str]:
        return pulumi.get(self, "scheme")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupBackendServiceNamedPort(dict):
    def __init__(__self__, *,
                 name: str,
                 ports: Sequence[str]):
        """
        :param str name: The group name.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "ports", ports)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def ports(self) -> Sequence[str]:
        return pulumi.get(self, "ports")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupDisk(dict):
    def __init__(__self__, *,
                 auto_delete: Optional[bool] = None,
                 boot: Optional[bool] = None,
                 device_name: Optional[str] = None,
                 initialize_params: Optional[Sequence['outputs.ElastigroupDiskInitializeParam']] = None,
                 interface: Optional[str] = None,
                 mode: Optional[str] = None,
                 source: Optional[str] = None,
                 type: Optional[str] = None):
        if auto_delete is not None:
            pulumi.set(__self__, "auto_delete", auto_delete)
        if boot is not None:
            pulumi.set(__self__, "boot", boot)
        if device_name is not None:
            pulumi.set(__self__, "device_name", device_name)
        if initialize_params is not None:
            pulumi.set(__self__, "initialize_params", initialize_params)
        if interface is not None:
            pulumi.set(__self__, "interface", interface)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="autoDelete")
    def auto_delete(self) -> Optional[bool]:
        return pulumi.get(self, "auto_delete")

    @property
    @pulumi.getter
    def boot(self) -> Optional[bool]:
        return pulumi.get(self, "boot")

    @property
    @pulumi.getter(name="deviceName")
    def device_name(self) -> Optional[str]:
        return pulumi.get(self, "device_name")

    @property
    @pulumi.getter(name="initializeParams")
    def initialize_params(self) -> Optional[Sequence['outputs.ElastigroupDiskInitializeParam']]:
        return pulumi.get(self, "initialize_params")

    @property
    @pulumi.getter
    def interface(self) -> Optional[str]:
        return pulumi.get(self, "interface")

    @property
    @pulumi.getter
    def mode(self) -> Optional[str]:
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def source(self) -> Optional[str]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupDiskInitializeParam(dict):
    def __init__(__self__, *,
                 source_image: str,
                 disk_size_gb: Optional[str] = None,
                 disk_type: Optional[str] = None):
        pulumi.set(__self__, "source_image", source_image)
        if disk_size_gb is not None:
            pulumi.set(__self__, "disk_size_gb", disk_size_gb)
        if disk_type is not None:
            pulumi.set(__self__, "disk_type", disk_type)

    @property
    @pulumi.getter(name="sourceImage")
    def source_image(self) -> str:
        return pulumi.get(self, "source_image")

    @property
    @pulumi.getter(name="diskSizeGb")
    def disk_size_gb(self) -> Optional[str]:
        return pulumi.get(self, "disk_size_gb")

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> Optional[str]:
        return pulumi.get(self, "disk_type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupGpu(dict):
    def __init__(__self__, *,
                 count: int,
                 type: str):
        pulumi.set(__self__, "count", count)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def count(self) -> int:
        return pulumi.get(self, "count")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupInstanceTypesCustom(dict):
    def __init__(__self__, *,
                 memory_gib: int,
                 vcpu: int):
        """
        :param int memory_gib: The memory (in GiB) in the custom instance types. GCP has a number of limitations on accepted memory values.For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
        """
        pulumi.set(__self__, "memory_gib", memory_gib)
        pulumi.set(__self__, "vcpu", vcpu)

    @property
    @pulumi.getter(name="memoryGib")
    def memory_gib(self) -> int:
        """
        The memory (in GiB) in the custom instance types. GCP has a number of limitations on accepted memory values.For more information, see the GCP documentation (here.)[https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#specifications]
        """
        return pulumi.get(self, "memory_gib")

    @property
    @pulumi.getter
    def vcpu(self) -> int:
        return pulumi.get(self, "vcpu")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupIntegrationDockerSwarm(dict):
    def __init__(__self__, *,
                 master_host: str,
                 master_port: int):
        pulumi.set(__self__, "master_host", master_host)
        pulumi.set(__self__, "master_port", master_port)

    @property
    @pulumi.getter(name="masterHost")
    def master_host(self) -> str:
        return pulumi.get(self, "master_host")

    @property
    @pulumi.getter(name="masterPort")
    def master_port(self) -> int:
        return pulumi.get(self, "master_port")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupIntegrationGke(dict):
    def __init__(__self__, *,
                 auto_update: Optional[bool] = None,
                 autoscale_cooldown: Optional[int] = None,
                 autoscale_down: Optional['outputs.ElastigroupIntegrationGkeAutoscaleDown'] = None,
                 autoscale_headroom: Optional['outputs.ElastigroupIntegrationGkeAutoscaleHeadroom'] = None,
                 autoscale_is_auto_config: Optional[bool] = None,
                 autoscale_is_enabled: Optional[bool] = None,
                 autoscale_labels: Optional[Sequence['outputs.ElastigroupIntegrationGkeAutoscaleLabel']] = None,
                 cluster_id: Optional[str] = None,
                 location: Optional[str] = None):
        if auto_update is not None:
            pulumi.set(__self__, "auto_update", auto_update)
        if autoscale_cooldown is not None:
            pulumi.set(__self__, "autoscale_cooldown", autoscale_cooldown)
        if autoscale_down is not None:
            pulumi.set(__self__, "autoscale_down", autoscale_down)
        if autoscale_headroom is not None:
            pulumi.set(__self__, "autoscale_headroom", autoscale_headroom)
        if autoscale_is_auto_config is not None:
            pulumi.set(__self__, "autoscale_is_auto_config", autoscale_is_auto_config)
        if autoscale_is_enabled is not None:
            pulumi.set(__self__, "autoscale_is_enabled", autoscale_is_enabled)
        if autoscale_labels is not None:
            pulumi.set(__self__, "autoscale_labels", autoscale_labels)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if location is not None:
            pulumi.set(__self__, "location", location)

    @property
    @pulumi.getter(name="autoUpdate")
    def auto_update(self) -> Optional[bool]:
        return pulumi.get(self, "auto_update")

    @property
    @pulumi.getter(name="autoscaleCooldown")
    def autoscale_cooldown(self) -> Optional[int]:
        return pulumi.get(self, "autoscale_cooldown")

    @property
    @pulumi.getter(name="autoscaleDown")
    def autoscale_down(self) -> Optional['outputs.ElastigroupIntegrationGkeAutoscaleDown']:
        return pulumi.get(self, "autoscale_down")

    @property
    @pulumi.getter(name="autoscaleHeadroom")
    def autoscale_headroom(self) -> Optional['outputs.ElastigroupIntegrationGkeAutoscaleHeadroom']:
        return pulumi.get(self, "autoscale_headroom")

    @property
    @pulumi.getter(name="autoscaleIsAutoConfig")
    def autoscale_is_auto_config(self) -> Optional[bool]:
        return pulumi.get(self, "autoscale_is_auto_config")

    @property
    @pulumi.getter(name="autoscaleIsEnabled")
    def autoscale_is_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "autoscale_is_enabled")

    @property
    @pulumi.getter(name="autoscaleLabels")
    def autoscale_labels(self) -> Optional[Sequence['outputs.ElastigroupIntegrationGkeAutoscaleLabel']]:
        return pulumi.get(self, "autoscale_labels")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def location(self) -> Optional[str]:
        return pulumi.get(self, "location")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupIntegrationGkeAutoscaleDown(dict):
    def __init__(__self__, *,
                 evaluation_periods: Optional[int] = None):
        if evaluation_periods is not None:
            pulumi.set(__self__, "evaluation_periods", evaluation_periods)

    @property
    @pulumi.getter(name="evaluationPeriods")
    def evaluation_periods(self) -> Optional[int]:
        return pulumi.get(self, "evaluation_periods")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupIntegrationGkeAutoscaleHeadroom(dict):
    def __init__(__self__, *,
                 cpu_per_unit: Optional[int] = None,
                 memory_per_unit: Optional[int] = None,
                 num_of_units: Optional[int] = None):
        if cpu_per_unit is not None:
            pulumi.set(__self__, "cpu_per_unit", cpu_per_unit)
        if memory_per_unit is not None:
            pulumi.set(__self__, "memory_per_unit", memory_per_unit)
        if num_of_units is not None:
            pulumi.set(__self__, "num_of_units", num_of_units)

    @property
    @pulumi.getter(name="cpuPerUnit")
    def cpu_per_unit(self) -> Optional[int]:
        return pulumi.get(self, "cpu_per_unit")

    @property
    @pulumi.getter(name="memoryPerUnit")
    def memory_per_unit(self) -> Optional[int]:
        return pulumi.get(self, "memory_per_unit")

    @property
    @pulumi.getter(name="numOfUnits")
    def num_of_units(self) -> Optional[int]:
        return pulumi.get(self, "num_of_units")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupIntegrationGkeAutoscaleLabel(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: Labels key.
        :param str value: Labels value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Labels key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Labels value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupLabel(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: Labels key.
        :param str value: Labels value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Labels key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Labels value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupMetadata(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: Labels key.
        :param str value: Labels value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        Labels key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Labels value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupNetworkInterface(dict):
    def __init__(__self__, *,
                 network: str,
                 access_configs: Optional[Sequence['outputs.ElastigroupNetworkInterfaceAccessConfig']] = None,
                 alias_ip_ranges: Optional[Sequence['outputs.ElastigroupNetworkInterfaceAliasIpRange']] = None):
        pulumi.set(__self__, "network", network)
        if access_configs is not None:
            pulumi.set(__self__, "access_configs", access_configs)
        if alias_ip_ranges is not None:
            pulumi.set(__self__, "alias_ip_ranges", alias_ip_ranges)

    @property
    @pulumi.getter
    def network(self) -> str:
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="accessConfigs")
    def access_configs(self) -> Optional[Sequence['outputs.ElastigroupNetworkInterfaceAccessConfig']]:
        return pulumi.get(self, "access_configs")

    @property
    @pulumi.getter(name="aliasIpRanges")
    def alias_ip_ranges(self) -> Optional[Sequence['outputs.ElastigroupNetworkInterfaceAliasIpRange']]:
        return pulumi.get(self, "alias_ip_ranges")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupNetworkInterfaceAccessConfig(dict):
    def __init__(__self__, *,
                 name: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: The group name.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupNetworkInterfaceAliasIpRange(dict):
    def __init__(__self__, *,
                 ip_cidr_range: str,
                 subnetwork_range_name: str):
        pulumi.set(__self__, "ip_cidr_range", ip_cidr_range)
        pulumi.set(__self__, "subnetwork_range_name", subnetwork_range_name)

    @property
    @pulumi.getter(name="ipCidrRange")
    def ip_cidr_range(self) -> str:
        return pulumi.get(self, "ip_cidr_range")

    @property
    @pulumi.getter(name="subnetworkRangeName")
    def subnetwork_range_name(self) -> str:
        return pulumi.get(self, "subnetwork_range_name")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupScalingDownPolicy(dict):
    def __init__(__self__, *,
                 metric_name: str,
                 namespace: str,
                 policy_name: str,
                 threshold: float,
                 unit: str,
                 action_type: Optional[str] = None,
                 adjustment: Optional[int] = None,
                 cooldown: Optional[int] = None,
                 dimensions: Optional[Sequence['outputs.ElastigroupScalingDownPolicyDimension']] = None,
                 evaluation_periods: Optional[int] = None,
                 operator: Optional[str] = None,
                 period: Optional[int] = None,
                 source: Optional[str] = None,
                 statistic: Optional[str] = None):
        pulumi.set(__self__, "metric_name", metric_name)
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "policy_name", policy_name)
        pulumi.set(__self__, "threshold", threshold)
        pulumi.set(__self__, "unit", unit)
        if action_type is not None:
            pulumi.set(__self__, "action_type", action_type)
        if adjustment is not None:
            pulumi.set(__self__, "adjustment", adjustment)
        if cooldown is not None:
            pulumi.set(__self__, "cooldown", cooldown)
        if dimensions is not None:
            pulumi.set(__self__, "dimensions", dimensions)
        if evaluation_periods is not None:
            pulumi.set(__self__, "evaluation_periods", evaluation_periods)
        if operator is not None:
            pulumi.set(__self__, "operator", operator)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if statistic is not None:
            pulumi.set(__self__, "statistic", statistic)

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> str:
        return pulumi.get(self, "metric_name")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> str:
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter
    def threshold(self) -> float:
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def unit(self) -> str:
        return pulumi.get(self, "unit")

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> Optional[str]:
        return pulumi.get(self, "action_type")

    @property
    @pulumi.getter
    def adjustment(self) -> Optional[int]:
        return pulumi.get(self, "adjustment")

    @property
    @pulumi.getter
    def cooldown(self) -> Optional[int]:
        return pulumi.get(self, "cooldown")

    @property
    @pulumi.getter
    def dimensions(self) -> Optional[Sequence['outputs.ElastigroupScalingDownPolicyDimension']]:
        return pulumi.get(self, "dimensions")

    @property
    @pulumi.getter(name="evaluationPeriods")
    def evaluation_periods(self) -> Optional[int]:
        return pulumi.get(self, "evaluation_periods")

    @property
    @pulumi.getter
    def operator(self) -> Optional[str]:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def period(self) -> Optional[int]:
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def source(self) -> Optional[str]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def statistic(self) -> Optional[str]:
        return pulumi.get(self, "statistic")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupScalingDownPolicyDimension(dict):
    def __init__(__self__, *,
                 name: str,
                 value: Optional[str] = None):
        """
        :param str name: The group name.
        :param str value: Labels value.
        """
        pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        Labels value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupScalingUpPolicy(dict):
    def __init__(__self__, *,
                 metric_name: str,
                 namespace: str,
                 policy_name: str,
                 threshold: float,
                 unit: str,
                 action_type: Optional[str] = None,
                 adjustment: Optional[int] = None,
                 cooldown: Optional[int] = None,
                 dimensions: Optional[Sequence['outputs.ElastigroupScalingUpPolicyDimension']] = None,
                 evaluation_periods: Optional[int] = None,
                 operator: Optional[str] = None,
                 period: Optional[int] = None,
                 source: Optional[str] = None,
                 statistic: Optional[str] = None):
        pulumi.set(__self__, "metric_name", metric_name)
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "policy_name", policy_name)
        pulumi.set(__self__, "threshold", threshold)
        pulumi.set(__self__, "unit", unit)
        if action_type is not None:
            pulumi.set(__self__, "action_type", action_type)
        if adjustment is not None:
            pulumi.set(__self__, "adjustment", adjustment)
        if cooldown is not None:
            pulumi.set(__self__, "cooldown", cooldown)
        if dimensions is not None:
            pulumi.set(__self__, "dimensions", dimensions)
        if evaluation_periods is not None:
            pulumi.set(__self__, "evaluation_periods", evaluation_periods)
        if operator is not None:
            pulumi.set(__self__, "operator", operator)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if statistic is not None:
            pulumi.set(__self__, "statistic", statistic)

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> str:
        return pulumi.get(self, "metric_name")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> str:
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter
    def threshold(self) -> float:
        return pulumi.get(self, "threshold")

    @property
    @pulumi.getter
    def unit(self) -> str:
        return pulumi.get(self, "unit")

    @property
    @pulumi.getter(name="actionType")
    def action_type(self) -> Optional[str]:
        return pulumi.get(self, "action_type")

    @property
    @pulumi.getter
    def adjustment(self) -> Optional[int]:
        return pulumi.get(self, "adjustment")

    @property
    @pulumi.getter
    def cooldown(self) -> Optional[int]:
        return pulumi.get(self, "cooldown")

    @property
    @pulumi.getter
    def dimensions(self) -> Optional[Sequence['outputs.ElastigroupScalingUpPolicyDimension']]:
        return pulumi.get(self, "dimensions")

    @property
    @pulumi.getter(name="evaluationPeriods")
    def evaluation_periods(self) -> Optional[int]:
        return pulumi.get(self, "evaluation_periods")

    @property
    @pulumi.getter
    def operator(self) -> Optional[str]:
        return pulumi.get(self, "operator")

    @property
    @pulumi.getter
    def period(self) -> Optional[int]:
        return pulumi.get(self, "period")

    @property
    @pulumi.getter
    def source(self) -> Optional[str]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def statistic(self) -> Optional[str]:
        return pulumi.get(self, "statistic")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupScalingUpPolicyDimension(dict):
    def __init__(__self__, *,
                 name: str,
                 value: Optional[str] = None):
        """
        :param str name: The group name.
        :param str value: Labels value.
        """
        pulumi.set(__self__, "name", name)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        """
        Labels value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupScheduledTask(dict):
    def __init__(__self__, *,
                 task_type: str,
                 cron_expression: Optional[str] = None,
                 is_enabled: Optional[bool] = None,
                 max_capacity: Optional[str] = None,
                 min_capacity: Optional[str] = None,
                 target_capacity: Optional[str] = None):
        pulumi.set(__self__, "task_type", task_type)
        if cron_expression is not None:
            pulumi.set(__self__, "cron_expression", cron_expression)
        if is_enabled is not None:
            pulumi.set(__self__, "is_enabled", is_enabled)
        if max_capacity is not None:
            pulumi.set(__self__, "max_capacity", max_capacity)
        if min_capacity is not None:
            pulumi.set(__self__, "min_capacity", min_capacity)
        if target_capacity is not None:
            pulumi.set(__self__, "target_capacity", target_capacity)

    @property
    @pulumi.getter(name="taskType")
    def task_type(self) -> str:
        return pulumi.get(self, "task_type")

    @property
    @pulumi.getter(name="cronExpression")
    def cron_expression(self) -> Optional[str]:
        return pulumi.get(self, "cron_expression")

    @property
    @pulumi.getter(name="isEnabled")
    def is_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "is_enabled")

    @property
    @pulumi.getter(name="maxCapacity")
    def max_capacity(self) -> Optional[str]:
        return pulumi.get(self, "max_capacity")

    @property
    @pulumi.getter(name="minCapacity")
    def min_capacity(self) -> Optional[str]:
        return pulumi.get(self, "min_capacity")

    @property
    @pulumi.getter(name="targetCapacity")
    def target_capacity(self) -> Optional[str]:
        return pulumi.get(self, "target_capacity")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ElastigroupSubnet(dict):
    def __init__(__self__, *,
                 region: str,
                 subnet_names: Sequence[str]):
        """
        :param str region: The region for the group of subnets.
        :param Sequence[str] subnet_names: The names of the subnets in the region.
        """
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "subnet_names", subnet_names)

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region for the group of subnets.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="subnetNames")
    def subnet_names(self) -> Sequence[str]:
        """
        The names of the subnets in the region.
        """
        return pulumi.get(self, "subnet_names")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


