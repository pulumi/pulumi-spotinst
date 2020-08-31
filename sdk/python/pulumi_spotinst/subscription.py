# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = ['Subscription']


class Subscription(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 event_type: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 resource_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst subscription resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        # Create a Subscription
        default_subscription = spotinst.Subscription("default-subscription",
            endpoint="http://endpoint.com",
            event_type="AWS_EC2_INSTANCE_LAUNCH",
            format={
                "event": "%event%",
                "instance_id": "%instance-id%",
                "resource_id": "%resource-id%",
                "resource_name": "%resource-name%",
                "tags": "foo,baz,baz",
            },
            protocol="http",
            resource_id=spotinst_elastigroup_aws["my-eg"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
        :param pulumi.Input[Mapping[str, Any]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
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

            if endpoint is None:
                raise TypeError("Missing required property 'endpoint'")
            __props__['endpoint'] = endpoint
            if event_type is None:
                raise TypeError("Missing required property 'event_type'")
            __props__['event_type'] = event_type
            __props__['format'] = format
            if protocol is None:
                raise TypeError("Missing required property 'protocol'")
            __props__['protocol'] = protocol
            if resource_id is None:
                raise TypeError("Missing required property 'resource_id'")
            __props__['resource_id'] = resource_id
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
            format: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            resource_id: Optional[pulumi.Input[str]] = None) -> 'Subscription':
        """
        Get an existing Subscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] endpoint: The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        :param pulumi.Input[str] event_type: The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
               `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
               `"GROUP_UPDATED"`,
               `"AWS_EMR_PROVISION_TIMEOUT"`,
               `"GROUP_BEANSTALK_INIT_READY"`,
               `"AZURE_VM_TERMINATED"`,
               `"AZURE_VM_TERMINATE"`,
               `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
               `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
               Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
        :param pulumi.Input[Mapping[str, Any]] format: The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
               Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
               Default: {`"event"`: `"<event>"`, `"instanceId"`: `"<instance-id>"`, `"resourceId"`: `"<resource-id>"`, `"resourceName"`: `"<resource-name>"` }.
        :param pulumi.Input[str] protocol: The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
               The following values are deprecated: `"http"` , `"https"`
               You can use the generic `"web"` protocol instead.
               `"aws-sns"` is only supported with AWS provider
        :param pulumi.Input[str] resource_id: Spotinst Resource id (Elastigroup or Ocean ID).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["endpoint"] = endpoint
        __props__["event_type"] = event_type
        __props__["format"] = format
        __props__["protocol"] = protocol
        __props__["resource_id"] = resource_id
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
        The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        `"GROUP_UPDATED"`,
        `"AWS_EMR_PROVISION_TIMEOUT"`,
        `"GROUP_BEANSTALK_INIT_READY"`,
        `"AZURE_VM_TERMINATED"`,
        `"AZURE_VM_TERMINATE"`,
        `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`.
        """
        return pulumi.get(self, "event_type")

    @property
    @pulumi.getter
    def format(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

