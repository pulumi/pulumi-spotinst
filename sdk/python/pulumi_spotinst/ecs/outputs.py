# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'OceanAutoscaler',
    'OceanAutoscalerDown',
    'OceanAutoscalerHeadroom',
    'OceanAutoscalerResourceLimits',
    'OceanLaunchSpecAttribute',
    'OceanLaunchSpecAutoscaleHeadroom',
    'OceanLaunchSpecTag',
    'OceanScheduledTask',
    'OceanScheduledTaskShutdownHours',
    'OceanScheduledTaskTask',
    'OceanTag',
    'OceanUpdatePolicy',
    'OceanUpdatePolicyRollConfig',
]

@pulumi.output_type
class OceanAutoscaler(dict):
    def __init__(__self__, *,
                 cooldown: Optional[float] = None,
                 down: Optional['outputs.OceanAutoscalerDown'] = None,
                 headroom: Optional['outputs.OceanAutoscalerHeadroom'] = None,
                 is_auto_config: Optional[bool] = None,
                 is_enabled: Optional[bool] = None,
                 resource_limits: Optional['outputs.OceanAutoscalerResourceLimits'] = None):
        if cooldown is not None:
            pulumi.set(__self__, "cooldown", cooldown)
        if down is not None:
            pulumi.set(__self__, "down", down)
        if headroom is not None:
            pulumi.set(__self__, "headroom", headroom)
        if is_auto_config is not None:
            pulumi.set(__self__, "is_auto_config", is_auto_config)
        if is_enabled is not None:
            pulumi.set(__self__, "is_enabled", is_enabled)
        if resource_limits is not None:
            pulumi.set(__self__, "resource_limits", resource_limits)

    @property
    @pulumi.getter
    def cooldown(self) -> Optional[float]:
        return pulumi.get(self, "cooldown")

    @property
    @pulumi.getter
    def down(self) -> Optional['outputs.OceanAutoscalerDown']:
        return pulumi.get(self, "down")

    @property
    @pulumi.getter
    def headroom(self) -> Optional['outputs.OceanAutoscalerHeadroom']:
        return pulumi.get(self, "headroom")

    @property
    @pulumi.getter(name="isAutoConfig")
    def is_auto_config(self) -> Optional[bool]:
        return pulumi.get(self, "is_auto_config")

    @property
    @pulumi.getter(name="isEnabled")
    def is_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "is_enabled")

    @property
    @pulumi.getter(name="resourceLimits")
    def resource_limits(self) -> Optional['outputs.OceanAutoscalerResourceLimits']:
        return pulumi.get(self, "resource_limits")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanAutoscalerDown(dict):
    def __init__(__self__, *,
                 max_scale_down_percentage: Optional[float] = None):
        if max_scale_down_percentage is not None:
            pulumi.set(__self__, "max_scale_down_percentage", max_scale_down_percentage)

    @property
    @pulumi.getter(name="maxScaleDownPercentage")
    def max_scale_down_percentage(self) -> Optional[float]:
        return pulumi.get(self, "max_scale_down_percentage")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanAutoscalerHeadroom(dict):
    def __init__(__self__, *,
                 cpu_per_unit: Optional[float] = None,
                 memory_per_unit: Optional[float] = None,
                 num_of_units: Optional[float] = None):
        if cpu_per_unit is not None:
            pulumi.set(__self__, "cpu_per_unit", cpu_per_unit)
        if memory_per_unit is not None:
            pulumi.set(__self__, "memory_per_unit", memory_per_unit)
        if num_of_units is not None:
            pulumi.set(__self__, "num_of_units", num_of_units)

    @property
    @pulumi.getter(name="cpuPerUnit")
    def cpu_per_unit(self) -> Optional[float]:
        return pulumi.get(self, "cpu_per_unit")

    @property
    @pulumi.getter(name="memoryPerUnit")
    def memory_per_unit(self) -> Optional[float]:
        return pulumi.get(self, "memory_per_unit")

    @property
    @pulumi.getter(name="numOfUnits")
    def num_of_units(self) -> Optional[float]:
        return pulumi.get(self, "num_of_units")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanAutoscalerResourceLimits(dict):
    def __init__(__self__, *,
                 max_memory_gib: Optional[float] = None,
                 max_vcpu: Optional[float] = None):
        if max_memory_gib is not None:
            pulumi.set(__self__, "max_memory_gib", max_memory_gib)
        if max_vcpu is not None:
            pulumi.set(__self__, "max_vcpu", max_vcpu)

    @property
    @pulumi.getter(name="maxMemoryGib")
    def max_memory_gib(self) -> Optional[float]:
        return pulumi.get(self, "max_memory_gib")

    @property
    @pulumi.getter(name="maxVcpu")
    def max_vcpu(self) -> Optional[float]:
        return pulumi.get(self, "max_vcpu")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanLaunchSpecAttribute(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: The label key.
        :param str value: The label value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The label key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The label value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanLaunchSpecAutoscaleHeadroom(dict):
    def __init__(__self__, *,
                 num_of_units: float,
                 cpu_per_unit: Optional[float] = None,
                 memory_per_unit: Optional[float] = None):
        """
        :param float num_of_units: The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        :param float cpu_per_unit: Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
        :param float memory_per_unit: Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
        """
        pulumi.set(__self__, "num_of_units", num_of_units)
        if cpu_per_unit is not None:
            pulumi.set(__self__, "cpu_per_unit", cpu_per_unit)
        if memory_per_unit is not None:
            pulumi.set(__self__, "memory_per_unit", memory_per_unit)

    @property
    @pulumi.getter(name="numOfUnits")
    def num_of_units(self) -> float:
        """
        The number of units to retain as headroom, where each unit has the defined headroom CPU and memory.
        """
        return pulumi.get(self, "num_of_units")

    @property
    @pulumi.getter(name="cpuPerUnit")
    def cpu_per_unit(self) -> Optional[float]:
        """
        Optionally configure the number of CPUs to allocate for each headroom unit. CPUs are denoted in CPU units, where 1024 units = 1 vCPU.
        """
        return pulumi.get(self, "cpu_per_unit")

    @property
    @pulumi.getter(name="memoryPerUnit")
    def memory_per_unit(self) -> Optional[float]:
        """
        Optionally configure the amount of memory (MiB) to allocate for each headroom unit.
        """
        return pulumi.get(self, "memory_per_unit")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanLaunchSpecTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: The label key.
        :param str value: The label value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The label key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The label value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanScheduledTask(dict):
    def __init__(__self__, *,
                 shutdown_hours: Optional['outputs.OceanScheduledTaskShutdownHours'] = None,
                 tasks: Optional[List['outputs.OceanScheduledTaskTask']] = None):
        if shutdown_hours is not None:
            pulumi.set(__self__, "shutdown_hours", shutdown_hours)
        if tasks is not None:
            pulumi.set(__self__, "tasks", tasks)

    @property
    @pulumi.getter(name="shutdownHours")
    def shutdown_hours(self) -> Optional['outputs.OceanScheduledTaskShutdownHours']:
        return pulumi.get(self, "shutdown_hours")

    @property
    @pulumi.getter
    def tasks(self) -> Optional[List['outputs.OceanScheduledTaskTask']]:
        return pulumi.get(self, "tasks")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanScheduledTaskShutdownHours(dict):
    def __init__(__self__, *,
                 time_windows: List[str],
                 is_enabled: Optional[bool] = None):
        pulumi.set(__self__, "time_windows", time_windows)
        if is_enabled is not None:
            pulumi.set(__self__, "is_enabled", is_enabled)

    @property
    @pulumi.getter(name="timeWindows")
    def time_windows(self) -> List[str]:
        return pulumi.get(self, "time_windows")

    @property
    @pulumi.getter(name="isEnabled")
    def is_enabled(self) -> Optional[bool]:
        return pulumi.get(self, "is_enabled")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanScheduledTaskTask(dict):
    def __init__(__self__, *,
                 cron_expression: str,
                 is_enabled: bool,
                 task_type: str):
        pulumi.set(__self__, "cron_expression", cron_expression)
        pulumi.set(__self__, "is_enabled", is_enabled)
        pulumi.set(__self__, "task_type", task_type)

    @property
    @pulumi.getter(name="cronExpression")
    def cron_expression(self) -> str:
        return pulumi.get(self, "cron_expression")

    @property
    @pulumi.getter(name="isEnabled")
    def is_enabled(self) -> bool:
        return pulumi.get(self, "is_enabled")

    @property
    @pulumi.getter(name="taskType")
    def task_type(self) -> str:
        return pulumi.get(self, "task_type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanTag(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str):
        """
        :param str key: The tag key.
        :param str value: The tag value.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> str:
        """
        The tag key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The tag value.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanUpdatePolicy(dict):
    def __init__(__self__, *,
                 should_roll: bool,
                 roll_config: Optional['outputs.OceanUpdatePolicyRollConfig'] = None):
        pulumi.set(__self__, "should_roll", should_roll)
        if roll_config is not None:
            pulumi.set(__self__, "roll_config", roll_config)

    @property
    @pulumi.getter(name="shouldRoll")
    def should_roll(self) -> bool:
        return pulumi.get(self, "should_roll")

    @property
    @pulumi.getter(name="rollConfig")
    def roll_config(self) -> Optional['outputs.OceanUpdatePolicyRollConfig']:
        return pulumi.get(self, "roll_config")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class OceanUpdatePolicyRollConfig(dict):
    def __init__(__self__, *,
                 batch_size_percentage: float):
        pulumi.set(__self__, "batch_size_percentage", batch_size_percentage)

    @property
    @pulumi.getter(name="batchSizePercentage")
    def batch_size_percentage(self) -> float:
        return pulumi.get(self, "batch_size_percentage")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


