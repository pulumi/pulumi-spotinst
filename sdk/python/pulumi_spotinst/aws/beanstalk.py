# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BeanstalkArgs', 'Beanstalk']

@pulumi.input_type
class BeanstalkArgs:
    def __init__(__self__, *,
                 desired_capacity: pulumi.Input[int],
                 instance_types_spots: pulumi.Input[Sequence[pulumi.Input[str]]],
                 max_size: pulumi.Input[int],
                 min_size: pulumi.Input[int],
                 product: pulumi.Input[str],
                 region: pulumi.Input[str],
                 beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
                 beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
                 deployment_preferences: Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']] = None,
                 maintenance: Optional[pulumi.Input[str]] = None,
                 managed_actions: Optional[pulumi.Input['BeanstalkManagedActionsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]] = None):
        """
        The set of arguments for constructing a Beanstalk resource.
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input['BeanstalkDeploymentPreferencesArgs'] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input['BeanstalkManagedActionsArgs'] managed_actions: Managed Actions parameters
        :param pulumi.Input[str] name: The group name.
        """
        pulumi.set(__self__, "desired_capacity", desired_capacity)
        pulumi.set(__self__, "instance_types_spots", instance_types_spots)
        pulumi.set(__self__, "max_size", max_size)
        pulumi.set(__self__, "min_size", min_size)
        pulumi.set(__self__, "product", product)
        pulumi.set(__self__, "region", region)
        if beanstalk_environment_id is not None:
            pulumi.set(__self__, "beanstalk_environment_id", beanstalk_environment_id)
        if beanstalk_environment_name is not None:
            pulumi.set(__self__, "beanstalk_environment_name", beanstalk_environment_name)
        if deployment_preferences is not None:
            pulumi.set(__self__, "deployment_preferences", deployment_preferences)
        if maintenance is not None:
            pulumi.set(__self__, "maintenance", maintenance)
        if managed_actions is not None:
            pulumi.set(__self__, "managed_actions", managed_actions)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scheduled_tasks is not None:
            pulumi.set(__self__, "scheduled_tasks", scheduled_tasks)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Input[int]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: pulumi.Input[int]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="instanceTypesSpots")
    def instance_types_spots(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        """
        return pulumi.get(self, "instance_types_spots")

    @instance_types_spots.setter
    def instance_types_spots(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_types_spots", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Input[int]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: pulumi.Input[int]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Input[int]:
        """
        The minimum number of instances the group should have at any time.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: pulumi.Input[int]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def product(self) -> pulumi.Input[str]:
        """
        Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        """
        return pulumi.get(self, "product")

    @product.setter
    def product(self, value: pulumi.Input[str]):
        pulumi.set(self, "product", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="beanstalkEnvironmentId")
    def beanstalk_environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_id")

    @beanstalk_environment_id.setter
    def beanstalk_environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beanstalk_environment_id", value)

    @property
    @pulumi.getter(name="beanstalkEnvironmentName")
    def beanstalk_environment_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_name")

    @beanstalk_environment_name.setter
    def beanstalk_environment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beanstalk_environment_name", value)

    @property
    @pulumi.getter(name="deploymentPreferences")
    def deployment_preferences(self) -> Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']]:
        """
        Preferences when performing a roll
        """
        return pulumi.get(self, "deployment_preferences")

    @deployment_preferences.setter
    def deployment_preferences(self, value: Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']]):
        pulumi.set(self, "deployment_preferences", value)

    @property
    @pulumi.getter
    def maintenance(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "maintenance")

    @maintenance.setter
    def maintenance(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance", value)

    @property
    @pulumi.getter(name="managedActions")
    def managed_actions(self) -> Optional[pulumi.Input['BeanstalkManagedActionsArgs']]:
        """
        Managed Actions parameters
        """
        return pulumi.get(self, "managed_actions")

    @managed_actions.setter
    def managed_actions(self, value: Optional[pulumi.Input['BeanstalkManagedActionsArgs']]):
        pulumi.set(self, "managed_actions", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]]:
        return pulumi.get(self, "scheduled_tasks")

    @scheduled_tasks.setter
    def scheduled_tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]]):
        pulumi.set(self, "scheduled_tasks", value)


@pulumi.input_type
class _BeanstalkState:
    def __init__(__self__, *,
                 beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
                 beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
                 deployment_preferences: Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 instance_types_spots: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 maintenance: Optional[pulumi.Input[str]] = None,
                 managed_actions: Optional[pulumi.Input['BeanstalkManagedActionsArgs']] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]] = None):
        """
        Input properties used for looking up and filtering Beanstalk resources.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input['BeanstalkDeploymentPreferencesArgs'] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input['BeanstalkManagedActionsArgs'] managed_actions: Managed Actions parameters
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        if beanstalk_environment_id is not None:
            pulumi.set(__self__, "beanstalk_environment_id", beanstalk_environment_id)
        if beanstalk_environment_name is not None:
            pulumi.set(__self__, "beanstalk_environment_name", beanstalk_environment_name)
        if deployment_preferences is not None:
            pulumi.set(__self__, "deployment_preferences", deployment_preferences)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if instance_types_spots is not None:
            pulumi.set(__self__, "instance_types_spots", instance_types_spots)
        if maintenance is not None:
            pulumi.set(__self__, "maintenance", maintenance)
        if managed_actions is not None:
            pulumi.set(__self__, "managed_actions", managed_actions)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if product is not None:
            pulumi.set(__self__, "product", product)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if scheduled_tasks is not None:
            pulumi.set(__self__, "scheduled_tasks", scheduled_tasks)

    @property
    @pulumi.getter(name="beanstalkEnvironmentId")
    def beanstalk_environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_id")

    @beanstalk_environment_id.setter
    def beanstalk_environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beanstalk_environment_id", value)

    @property
    @pulumi.getter(name="beanstalkEnvironmentName")
    def beanstalk_environment_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_name")

    @beanstalk_environment_name.setter
    def beanstalk_environment_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "beanstalk_environment_name", value)

    @property
    @pulumi.getter(name="deploymentPreferences")
    def deployment_preferences(self) -> Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']]:
        """
        Preferences when performing a roll
        """
        return pulumi.get(self, "deployment_preferences")

    @deployment_preferences.setter
    def deployment_preferences(self, value: Optional[pulumi.Input['BeanstalkDeploymentPreferencesArgs']]):
        pulumi.set(self, "deployment_preferences", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="instanceTypesSpots")
    def instance_types_spots(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        """
        return pulumi.get(self, "instance_types_spots")

    @instance_types_spots.setter
    def instance_types_spots(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "instance_types_spots", value)

    @property
    @pulumi.getter
    def maintenance(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "maintenance")

    @maintenance.setter
    def maintenance(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintenance", value)

    @property
    @pulumi.getter(name="managedActions")
    def managed_actions(self) -> Optional[pulumi.Input['BeanstalkManagedActionsArgs']]:
        """
        Managed Actions parameters
        """
        return pulumi.get(self, "managed_actions")

    @managed_actions.setter
    def managed_actions(self, value: Optional[pulumi.Input['BeanstalkManagedActionsArgs']]):
        pulumi.set(self, "managed_actions", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        """
        The minimum number of instances the group should have at any time.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def product(self) -> Optional[pulumi.Input[str]]:
        """
        Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        """
        return pulumi.get(self, "product")

    @product.setter
    def product(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]]:
        return pulumi.get(self, "scheduled_tasks")

    @scheduled_tasks.setter
    def scheduled_tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['BeanstalkScheduledTaskArgs']]]]):
        pulumi.set(self, "scheduled_tasks", value)


class Beanstalk(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
                 beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
                 deployment_preferences: Optional[pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 instance_types_spots: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 maintenance: Optional[pulumi.Input[str]] = None,
                 managed_actions: Optional[pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BeanstalkScheduledTaskArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Spotinst AWS group resource using Elastic Beanstalk.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        elastigoup_aws_beanstalk = spotinst.aws.Beanstalk("elastigoup-aws-beanstalk",
            beanstalk_environment_id="e-example",
            beanstalk_environment_name="example-env",
            deployment_preferences=spotinst.aws.BeanstalkDeploymentPreferencesArgs(
                automatic_roll=True,
                batch_size_percentage=100,
                grace_period=90,
                strategies=[spotinst.aws.BeanstalkDeploymentPreferencesStrategyArgs(
                    action="REPLACE_SERVER",
                    should_drain_instances=True,
                )],
            ),
            desired_capacity=0,
            instance_types_spots=[
                "t2.micro",
                "t2.medium",
                "t2.large",
            ],
            managed_actions=spotinst.aws.BeanstalkManagedActionsArgs(
                platform_update=spotinst.aws.BeanstalkManagedActionsPlatformUpdateArgs(
                    perform_at="timeWindow",
                    time_window="Mon:23:50-Tue:00:20",
                    update_level="minorAndPatch",
                ),
            ),
            max_size=1,
            min_size=0,
            product="Linux/UNIX",
            region="us-west-2")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']] managed_actions: Managed Actions parameters
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BeanstalkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst AWS group resource using Elastic Beanstalk.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        elastigoup_aws_beanstalk = spotinst.aws.Beanstalk("elastigoup-aws-beanstalk",
            beanstalk_environment_id="e-example",
            beanstalk_environment_name="example-env",
            deployment_preferences=spotinst.aws.BeanstalkDeploymentPreferencesArgs(
                automatic_roll=True,
                batch_size_percentage=100,
                grace_period=90,
                strategies=[spotinst.aws.BeanstalkDeploymentPreferencesStrategyArgs(
                    action="REPLACE_SERVER",
                    should_drain_instances=True,
                )],
            ),
            desired_capacity=0,
            instance_types_spots=[
                "t2.micro",
                "t2.medium",
                "t2.large",
            ],
            managed_actions=spotinst.aws.BeanstalkManagedActionsArgs(
                platform_update=spotinst.aws.BeanstalkManagedActionsPlatformUpdateArgs(
                    perform_at="timeWindow",
                    time_window="Mon:23:50-Tue:00:20",
                    update_level="minorAndPatch",
                ),
            ),
            max_size=1,
            min_size=0,
            product="Linux/UNIX",
            region="us-west-2")
        ```
        <!--End PulumiCodeChooser -->

        :param str resource_name: The name of the resource.
        :param BeanstalkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BeanstalkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
                 beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
                 deployment_preferences: Optional[pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 instance_types_spots: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 maintenance: Optional[pulumi.Input[str]] = None,
                 managed_actions: Optional[pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BeanstalkScheduledTaskArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BeanstalkArgs.__new__(BeanstalkArgs)

            __props__.__dict__["beanstalk_environment_id"] = beanstalk_environment_id
            __props__.__dict__["beanstalk_environment_name"] = beanstalk_environment_name
            __props__.__dict__["deployment_preferences"] = deployment_preferences
            if desired_capacity is None and not opts.urn:
                raise TypeError("Missing required property 'desired_capacity'")
            __props__.__dict__["desired_capacity"] = desired_capacity
            if instance_types_spots is None and not opts.urn:
                raise TypeError("Missing required property 'instance_types_spots'")
            __props__.__dict__["instance_types_spots"] = instance_types_spots
            __props__.__dict__["maintenance"] = maintenance
            __props__.__dict__["managed_actions"] = managed_actions
            if max_size is None and not opts.urn:
                raise TypeError("Missing required property 'max_size'")
            __props__.__dict__["max_size"] = max_size
            if min_size is None and not opts.urn:
                raise TypeError("Missing required property 'min_size'")
            __props__.__dict__["min_size"] = min_size
            __props__.__dict__["name"] = name
            if product is None and not opts.urn:
                raise TypeError("Missing required property 'product'")
            __props__.__dict__["product"] = product
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["scheduled_tasks"] = scheduled_tasks
        super(Beanstalk, __self__).__init__(
            'spotinst:aws/beanstalk:Beanstalk',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
            beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
            deployment_preferences: Optional[pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']]] = None,
            desired_capacity: Optional[pulumi.Input[int]] = None,
            instance_types_spots: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            maintenance: Optional[pulumi.Input[str]] = None,
            managed_actions: Optional[pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            product: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['BeanstalkScheduledTaskArgs']]]]] = None) -> 'Beanstalk':
        """
        Get an existing Beanstalk resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']] managed_actions: Managed Actions parameters
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BeanstalkState.__new__(_BeanstalkState)

        __props__.__dict__["beanstalk_environment_id"] = beanstalk_environment_id
        __props__.__dict__["beanstalk_environment_name"] = beanstalk_environment_name
        __props__.__dict__["deployment_preferences"] = deployment_preferences
        __props__.__dict__["desired_capacity"] = desired_capacity
        __props__.__dict__["instance_types_spots"] = instance_types_spots
        __props__.__dict__["maintenance"] = maintenance
        __props__.__dict__["managed_actions"] = managed_actions
        __props__.__dict__["max_size"] = max_size
        __props__.__dict__["min_size"] = min_size
        __props__.__dict__["name"] = name
        __props__.__dict__["product"] = product
        __props__.__dict__["region"] = region
        __props__.__dict__["scheduled_tasks"] = scheduled_tasks
        return Beanstalk(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="beanstalkEnvironmentId")
    def beanstalk_environment_id(self) -> pulumi.Output[Optional[str]]:
        """
        The id of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_id")

    @property
    @pulumi.getter(name="beanstalkEnvironmentName")
    def beanstalk_environment_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of an existing Beanstalk environment.
        """
        return pulumi.get(self, "beanstalk_environment_name")

    @property
    @pulumi.getter(name="deploymentPreferences")
    def deployment_preferences(self) -> pulumi.Output[Optional['outputs.BeanstalkDeploymentPreferences']]:
        """
        Preferences when performing a roll
        """
        return pulumi.get(self, "deployment_preferences")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[int]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="instanceTypesSpots")
    def instance_types_spots(self) -> pulumi.Output[Sequence[str]]:
        """
        One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        """
        return pulumi.get(self, "instance_types_spots")

    @property
    @pulumi.getter
    def maintenance(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "maintenance")

    @property
    @pulumi.getter(name="managedActions")
    def managed_actions(self) -> pulumi.Output[Optional['outputs.BeanstalkManagedActions']]:
        """
        Managed Actions parameters
        """
        return pulumi.get(self, "managed_actions")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[int]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[int]:
        """
        The minimum number of instances the group should have at any time.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The group name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def product(self) -> pulumi.Output[str]:
        """
        Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
        For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        """
        return pulumi.get(self, "product")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> pulumi.Output[Optional[Sequence['outputs.BeanstalkScheduledTask']]]:
        return pulumi.get(self, "scheduled_tasks")

