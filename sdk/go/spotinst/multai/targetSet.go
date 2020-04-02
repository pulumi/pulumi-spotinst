// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package multai

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst Multai Target Set.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_target_set.html.markdown.
type TargetSet struct {
	pulumi.CustomResourceState

	// The id of the balancer.
	BalancerId pulumi.StringOutput `pulumi:"balancerId"`
	// The id of the deployment.
	DeploymentId pulumi.StringOutput        `pulumi:"deploymentId"`
	HealthCheck  TargetSetHealthCheckOutput `pulumi:"healthCheck"`
	// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringOutput `pulumi:"name"`
	// The port on which the load balancer is listening.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The protocol to allow connections to the target for the health check.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// A list of key:value paired tags.
	Tags TargetSetTagArrayOutput `pulumi:"tags"`
	// Defines how traffic is distributed between the Target Set.
	Weight pulumi.IntOutput `pulumi:"weight"`
}

// NewTargetSet registers a new resource with the given unique name, arguments, and options.
func NewTargetSet(ctx *pulumi.Context,
	name string, args *TargetSetArgs, opts ...pulumi.ResourceOption) (*TargetSet, error) {
	if args == nil || args.BalancerId == nil {
		return nil, errors.New("missing required argument 'BalancerId'")
	}
	if args == nil || args.DeploymentId == nil {
		return nil, errors.New("missing required argument 'DeploymentId'")
	}
	if args == nil || args.HealthCheck == nil {
		return nil, errors.New("missing required argument 'HealthCheck'")
	}
	if args == nil || args.Protocol == nil {
		return nil, errors.New("missing required argument 'Protocol'")
	}
	if args == nil || args.Weight == nil {
		return nil, errors.New("missing required argument 'Weight'")
	}
	if args == nil {
		args = &TargetSetArgs{}
	}
	var resource TargetSet
	err := ctx.RegisterResource("spotinst:multai/targetSet:TargetSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTargetSet gets an existing TargetSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTargetSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TargetSetState, opts ...pulumi.ResourceOption) (*TargetSet, error) {
	var resource TargetSet
	err := ctx.ReadResource("spotinst:multai/targetSet:TargetSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TargetSet resources.
type targetSetState struct {
	// The id of the balancer.
	BalancerId *string `pulumi:"balancerId"`
	// The id of the deployment.
	DeploymentId *string               `pulumi:"deploymentId"`
	HealthCheck  *TargetSetHealthCheck `pulumi:"healthCheck"`
	// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name *string `pulumi:"name"`
	// The port on which the load balancer is listening.
	Port *int `pulumi:"port"`
	// The protocol to allow connections to the target for the health check.
	Protocol *string `pulumi:"protocol"`
	// A list of key:value paired tags.
	Tags []TargetSetTag `pulumi:"tags"`
	// Defines how traffic is distributed between the Target Set.
	Weight *int `pulumi:"weight"`
}

type TargetSetState struct {
	// The id of the balancer.
	BalancerId pulumi.StringPtrInput
	// The id of the deployment.
	DeploymentId pulumi.StringPtrInput
	HealthCheck  TargetSetHealthCheckPtrInput
	// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringPtrInput
	// The port on which the load balancer is listening.
	Port pulumi.IntPtrInput
	// The protocol to allow connections to the target for the health check.
	Protocol pulumi.StringPtrInput
	// A list of key:value paired tags.
	Tags TargetSetTagArrayInput
	// Defines how traffic is distributed between the Target Set.
	Weight pulumi.IntPtrInput
}

func (TargetSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*targetSetState)(nil)).Elem()
}

type targetSetArgs struct {
	// The id of the balancer.
	BalancerId string `pulumi:"balancerId"`
	// The id of the deployment.
	DeploymentId string               `pulumi:"deploymentId"`
	HealthCheck  TargetSetHealthCheck `pulumi:"healthCheck"`
	// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name *string `pulumi:"name"`
	// The port on which the load balancer is listening.
	Port *int `pulumi:"port"`
	// The protocol to allow connections to the target for the health check.
	Protocol string `pulumi:"protocol"`
	// A list of key:value paired tags.
	Tags []TargetSetTag `pulumi:"tags"`
	// Defines how traffic is distributed between the Target Set.
	Weight int `pulumi:"weight"`
}

// The set of arguments for constructing a TargetSet resource.
type TargetSetArgs struct {
	// The id of the balancer.
	BalancerId pulumi.StringInput
	// The id of the deployment.
	DeploymentId pulumi.StringInput
	HealthCheck  TargetSetHealthCheckInput
	// The name of the Target Set. Must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
	Name pulumi.StringPtrInput
	// The port on which the load balancer is listening.
	Port pulumi.IntPtrInput
	// The protocol to allow connections to the target for the health check.
	Protocol pulumi.StringInput
	// A list of key:value paired tags.
	Tags TargetSetTagArrayInput
	// Defines how traffic is distributed between the Target Set.
	Weight pulumi.IntInput
}

func (TargetSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*targetSetArgs)(nil)).Elem()
}
