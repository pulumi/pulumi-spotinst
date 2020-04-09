// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package spotinst

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst subscription resource.
//
//
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/subscription.html.markdown.
type Subscription struct {
	pulumi.CustomResourceState

	// The endpoint the notification will be sent to: url in case of `"http"`/`"https"`, email address in case of `"email"`/`"email-json"`, sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`, `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`, `"GROUP_UPDATED"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EMR_PROVISION_TIMEOUT"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`.
	EventType pulumi.StringOutput `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid values: `"%instance-id%"`, `"%event%"`, `"%resource-id%"`, `"%resource-name%"`.
	Format pulumi.MapOutput `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"http"`, `"https"`, `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// Spotinst Resource ID (Elastigroup ID).
	ResourceId pulumi.StringOutput `pulumi:"resourceId"`
}

// NewSubscription registers a new resource with the given unique name, arguments, and options.
func NewSubscription(ctx *pulumi.Context,
	name string, args *SubscriptionArgs, opts ...pulumi.ResourceOption) (*Subscription, error) {
	if args == nil || args.Endpoint == nil {
		return nil, errors.New("missing required argument 'Endpoint'")
	}
	if args == nil || args.EventType == nil {
		return nil, errors.New("missing required argument 'EventType'")
	}
	if args == nil || args.Protocol == nil {
		return nil, errors.New("missing required argument 'Protocol'")
	}
	if args == nil || args.ResourceId == nil {
		return nil, errors.New("missing required argument 'ResourceId'")
	}
	if args == nil {
		args = &SubscriptionArgs{}
	}
	var resource Subscription
	err := ctx.RegisterResource("spotinst:index/subscription:Subscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSubscription gets an existing Subscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SubscriptionState, opts ...pulumi.ResourceOption) (*Subscription, error) {
	var resource Subscription
	err := ctx.ReadResource("spotinst:index/subscription:Subscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Subscription resources.
type subscriptionState struct {
	// The endpoint the notification will be sent to: url in case of `"http"`/`"https"`, email address in case of `"email"`/`"email-json"`, sns-topic-arn in case of `"aws-sns"`.
	Endpoint *string `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`, `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`, `"GROUP_UPDATED"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EMR_PROVISION_TIMEOUT"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`.
	EventType *string `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid values: `"%instance-id%"`, `"%event%"`, `"%resource-id%"`, `"%resource-name%"`.
	Format map[string]interface{} `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"http"`, `"https"`, `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	Protocol *string `pulumi:"protocol"`
	// Spotinst Resource ID (Elastigroup ID).
	ResourceId *string `pulumi:"resourceId"`
}

type SubscriptionState struct {
	// The endpoint the notification will be sent to: url in case of `"http"`/`"https"`, email address in case of `"email"`/`"email-json"`, sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringPtrInput
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`, `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`, `"GROUP_UPDATED"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EMR_PROVISION_TIMEOUT"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`.
	EventType pulumi.StringPtrInput
	// The format of the notification content (JSON Format - Key+Value). Valid values: `"%instance-id%"`, `"%event%"`, `"%resource-id%"`, `"%resource-name%"`.
	Format pulumi.MapInput
	// The protocol to send the notification. Valid values: `"http"`, `"https"`, `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	Protocol pulumi.StringPtrInput
	// Spotinst Resource ID (Elastigroup ID).
	ResourceId pulumi.StringPtrInput
}

func (SubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionState)(nil)).Elem()
}

type subscriptionArgs struct {
	// The endpoint the notification will be sent to: url in case of `"http"`/`"https"`, email address in case of `"email"`/`"email-json"`, sns-topic-arn in case of `"aws-sns"`.
	Endpoint string `pulumi:"endpoint"`
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`, `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`, `"GROUP_UPDATED"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EMR_PROVISION_TIMEOUT"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`.
	EventType string `pulumi:"eventType"`
	// The format of the notification content (JSON Format - Key+Value). Valid values: `"%instance-id%"`, `"%event%"`, `"%resource-id%"`, `"%resource-name%"`.
	Format map[string]interface{} `pulumi:"format"`
	// The protocol to send the notification. Valid values: `"http"`, `"https"`, `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	Protocol string `pulumi:"protocol"`
	// Spotinst Resource ID (Elastigroup ID).
	ResourceId string `pulumi:"resourceId"`
}

// The set of arguments for constructing a Subscription resource.
type SubscriptionArgs struct {
	// The endpoint the notification will be sent to: url in case of `"http"`/`"https"`, email address in case of `"email"`/`"email-json"`, sns-topic-arn in case of `"aws-sns"`.
	Endpoint pulumi.StringInput
	// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`, `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`, `"GROUP_UPDATED"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EMR_PROVISION_TIMEOUT"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`.
	EventType pulumi.StringInput
	// The format of the notification content (JSON Format - Key+Value). Valid values: `"%instance-id%"`, `"%event%"`, `"%resource-id%"`, `"%resource-name%"`.
	Format pulumi.MapInput
	// The protocol to send the notification. Valid values: `"http"`, `"https"`, `"email"`, `"email-json"`, `"aws-sns"`, `"web"`.
	Protocol pulumi.StringInput
	// Spotinst Resource ID (Elastigroup ID).
	ResourceId pulumi.StringInput
}

func (SubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*subscriptionArgs)(nil)).Elem()
}
