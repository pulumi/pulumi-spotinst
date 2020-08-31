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

__all__ = ['Beanstalk']


class Beanstalk(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 beanstalk_environment_id: Optional[pulumi.Input[str]] = None,
                 beanstalk_environment_name: Optional[pulumi.Input[str]] = None,
                 deployment_preferences: Optional[pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']]] = None,
                 desired_capacity: Optional[pulumi.Input[float]] = None,
                 instance_types_spots: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 maintenance: Optional[pulumi.Input[str]] = None,
                 managed_actions: Optional[pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']]] = None,
                 max_size: Optional[pulumi.Input[float]] = None,
                 min_size: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 scheduled_tasks: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['BeanstalkScheduledTaskArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst AWS group resource using Elastic Beanstalk.

        ## Example Usage

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
        ## Scheduled Tasks

        Each `scheduled_task` supports the following:

        * `task_type` - (Required) The task type to run. Supported task types are: `"scale"`, `"backup_ami"`, `"roll"`, `"scaleUp"`, `"percentageScaleUp"`, `"scaleDown"`, `"percentageScaleDown"`, `"statefulUpdateCapacity"`.
        * `cron_expression` - (Optional; Required if not using `frequency`) A valid cron expression. The cron is running in UTC time zone and is in [Unix cron format](https://en.wikipedia.org/wiki/Cron).
        * `start_time` - (Optional; Format: ISO 8601) Set a start time for one time tasks.
        * `frequency` - (Optional; Required if not using `cron_expression`) The recurrence frequency to run this task. Supported values are `"hourly"`, `"daily"`, `"weekly"` and `"continuous"`.
        * `scale_target_capacity` - (Optional) The desired number of instances the group should have.
        * `scale_min_capacity` - (Optional) The minimum number of instances the group should have.
        * `scale_max_capacity` - (Optional) The maximum number of instances the group should have.
        * `is_enabled` - (Optional, Default: `true`) Setting the task to being enabled or disabled.
        * `target_capacity` - (Optional; Only valid for statefulUpdateCapacity) The desired number of instances the group should have.
        * `min_capacity` - (Optional; Only valid for statefulUpdateCapacity) The minimum number of instances the group should have.
        * `max_capacity` - (Optional; Only valid for statefulUpdateCapacity) The maximum number of instances the group should have.
        * `batch_size_percentage` - (Optional; Required when the `task_type` is `"roll"`.) The percentage size of each batch in the scheduled deployment roll.
        * `grace_period` - (Optional) The period of time (seconds) to wait before checking a batch's health after it's deployment.
        * `adjustment` - (Optional; Min 1) The number of instances to add or remove.
        * `adjustment_percentage` - (Optional; Min 1) The percentage of instances to add or remove.

        Usage:

        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input[float] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']] managed_actions: Managed Actions parameters
        :param pulumi.Input[float] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[float] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
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

            __props__['beanstalk_environment_id'] = beanstalk_environment_id
            __props__['beanstalk_environment_name'] = beanstalk_environment_name
            __props__['deployment_preferences'] = deployment_preferences
            if desired_capacity is None:
                raise TypeError("Missing required property 'desired_capacity'")
            __props__['desired_capacity'] = desired_capacity
            if instance_types_spots is None:
                raise TypeError("Missing required property 'instance_types_spots'")
            __props__['instance_types_spots'] = instance_types_spots
            __props__['maintenance'] = maintenance
            __props__['managed_actions'] = managed_actions
            if max_size is None:
                raise TypeError("Missing required property 'max_size'")
            __props__['max_size'] = max_size
            if min_size is None:
                raise TypeError("Missing required property 'min_size'")
            __props__['min_size'] = min_size
            __props__['name'] = name
            if product is None:
                raise TypeError("Missing required property 'product'")
            __props__['product'] = product
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['scheduled_tasks'] = scheduled_tasks
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
            desired_capacity: Optional[pulumi.Input[float]] = None,
            instance_types_spots: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            maintenance: Optional[pulumi.Input[str]] = None,
            managed_actions: Optional[pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']]] = None,
            max_size: Optional[pulumi.Input[float]] = None,
            min_size: Optional[pulumi.Input[float]] = None,
            name: Optional[pulumi.Input[str]] = None,
            product: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            scheduled_tasks: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['BeanstalkScheduledTaskArgs']]]]] = None) -> 'Beanstalk':
        """
        Get an existing Beanstalk resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] beanstalk_environment_id: The id of an existing Beanstalk environment.
        :param pulumi.Input[str] beanstalk_environment_name: The name of an existing Beanstalk environment.
        :param pulumi.Input[pulumi.InputType['BeanstalkDeploymentPreferencesArgs']] deployment_preferences: Preferences when performing a roll
        :param pulumi.Input[float] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_types_spots: One or more instance types. To maximize the availability of Spot instances, select as many instance types as possible.
        :param pulumi.Input[pulumi.InputType['BeanstalkManagedActionsArgs']] managed_actions: Managed Actions parameters
        :param pulumi.Input[float] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[float] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The group name.
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux/UNIX"`, `"SUSE Linux"`, `"Windows"`.
               For EC2 Classic instances:  `"Linux/UNIX (Amazon VPC)"`, `"SUSE Linux (Amazon VPC)"`, `"Windows (Amazon VPC)"`.
        :param pulumi.Input[str] region: The AWS region your group will be created in. Cannot be changed after the group has been created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["beanstalk_environment_id"] = beanstalk_environment_id
        __props__["beanstalk_environment_name"] = beanstalk_environment_name
        __props__["deployment_preferences"] = deployment_preferences
        __props__["desired_capacity"] = desired_capacity
        __props__["instance_types_spots"] = instance_types_spots
        __props__["maintenance"] = maintenance
        __props__["managed_actions"] = managed_actions
        __props__["max_size"] = max_size
        __props__["min_size"] = min_size
        __props__["name"] = name
        __props__["product"] = product
        __props__["region"] = region
        __props__["scheduled_tasks"] = scheduled_tasks
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
    def desired_capacity(self) -> pulumi.Output[float]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="instanceTypesSpots")
    def instance_types_spots(self) -> pulumi.Output[List[str]]:
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
    def max_size(self) -> pulumi.Output[float]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[float]:
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
    def scheduled_tasks(self) -> pulumi.Output[Optional[List['outputs.BeanstalkScheduledTask']]]:
        return pulumi.get(self, "scheduled_tasks")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

