# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['SubscriptionArgs', 'Subscription']

@pulumi.input_type
class SubscriptionArgs:
    def __init__(__self__, *,
                 endpoint: pulumi.Input[str],
                 event_type: pulumi.Input[str],
                 protocol: pulumi.Input[str],
                 resource_id: pulumi.Input[str],
                 format: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Subscription resource.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
               `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        """
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "event_type", event_type)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "resource_id", resource_id)
        if format is not None:
            pulumi.set(__self__, "format", format)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Input[str]:
        """
        The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Input[str]:
        """
        The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        `"GROUP_UPDATED"`,
        `"AWS_EMR_PROVISION_TIMEOUT"`,
        `"GROUP_BEANSTALK_INIT_READY"`,
        `"AZURE_VM_TERMINATED"`,
        `"AZURE_VM_TERMINATE"`,
        `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        The following values are deprecated: `"http"` , `"https"`
        You can use the generic `"web"` protocol instead.
        `"aws-sns"` is only supported with AWS provider
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Input[str]:
        """
        Spotinst Resource id (Elastigroup or Ocean ID).
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_id", value)

    @property
    @pulumi.getter
    def format(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "format", value)


@pulumi.input_type
class _SubscriptionState:
    def __init__(__self__, *,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Subscription resources.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
               `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
        """
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if event_type is not None:
            pulumi.set(__self__, "event_type", event_type)
        if format is not None:
            pulumi.set(__self__, "format", format)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if resource_id is not None:
            pulumi.set(__self__, "resource_id", resource_id)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> Optional[pulumi.Input[str]]:
        """
        The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        `"GROUP_UPDATED"`,
        `"AWS_EMR_PROVISION_TIMEOUT"`,
        `"GROUP_BEANSTALK_INIT_READY"`,
        `"AZURE_VM_TERMINATED"`,
        `"AZURE_VM_TERMINATE"`,
        `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        """
        return pulumi.get(self, "event_type")

    @event_type.setter
    def event_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_type", value)

    @property
    @pulumi.getter
    def format(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "format", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        The following values are deprecated: `"http"` , `"https"`
        You can use the generic `"web"` protocol instead.
        `"aws-sns"` is only supported with AWS provider
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> Optional[pulumi.Input[str]]:
        """
        Spotinst Resource id (Elastigroup or Ocean ID).
        """
        return pulumi.get(self, "resource_id")

    @resource_id.setter
    def resource_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_id", value)


class Subscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Spotinst subscription resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # Create a Subscription
        default_subscription = spotinst.Subscription("default-subscription",
            resource_id=my_eg["id"],
            event_type="AWS_EC2_INSTANCE_LAUNCH",
            protocol="http",
            endpoint="http://endpoint.com",
            format={
                "event": "%event%",
                "instance_id": "%instance-id%",
                "resource_id": "%resource-id%",
                "resource_name": "%resource-name%",
                "tags": "foo,baz,baz",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
               `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Spotinst subscription resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # Create a Subscription
        default_subscription = spotinst.Subscription("default-subscription",
            resource_id=my_eg["id"],
            event_type="AWS_EC2_INSTANCE_LAUNCH",
            protocol="http",
            endpoint="http://endpoint.com",
            format={
                "event": "%event%",
                "instance_id": "%instance-id%",
                "resource_id": "%resource-id%",
                "resource_name": "%resource-name%",
                "tags": "foo,baz,baz",
            })
        ```

        :param str resource_name: The name of the resource.
        :param SubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubscriptionArgs.__new__(SubscriptionArgs)

            if endpoint is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint'")
            __props__.__dict__["endpoint"] = endpoint
            if event_type is None and not opts.urn:
                raise TypeError("Missing required property 'event_type'")
            __props__.__dict__["event_type"] = event_type
            __props__.__dict__["format"] = format
            if protocol is None and not opts.urn:
                raise TypeError("Missing required property 'protocol'")
            __props__.__dict__["protocol"] = protocol
            if resource_id is None and not opts.urn:
                raise TypeError("Missing required property 'resource_id'")
            __props__.__dict__["resource_id"] = resource_id
        super(Subscription, __self__).__init__(
            'spotinst:index/subscription:Subscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            event_type: Optional[pulumi.Input[str]] = None,
            format: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None) -> 'Subscription':
        """
        Get an existing Subscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
               `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubscriptionState.__new__(_SubscriptionState)

        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["event_type"] = event_type
        __props__.__dict__["format"] = format
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["resource_id"] = resource_id
        return Subscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        """
        The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="eventType")
    def event_type(self) -> pulumi.Output[str]:
        """
        The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        `"GROUP_UPDATED"`,
        `"AWS_EMR_PROVISION_TIMEOUT"`,
        `"GROUP_BEANSTALK_INIT_READY"`,
        `"AZURE_VM_TERMINATED"`,
        `"AZURE_VM_TERMINATE"`,
        `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter
    def format(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        """
        return pulumi.get(self, "format")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[str]:
        """
        The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        The following values are deprecated: `"http"` , `"https"`
        You can use the generic `"web"` protocol instead.
        `"aws-sns"` is only supported with AWS provider
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="resourceId")
    def resource_id(self) -> pulumi.Output[str]:
        """
        Spotinst Resource id (Elastigroup or Ocean ID).
        """
        return pulumi.get(self, "resource_id")

