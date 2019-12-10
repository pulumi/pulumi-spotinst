// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Spotinst elastigroup Azure resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/elastigroup_azure.html.markdown.
type Elastigroup struct {
	s *pulumi.ResourceState
}

// NewElastigroup registers a new resource with the given unique name, arguments, and options.
func NewElastigroup(ctx *pulumi.Context,
	name string, args *ElastigroupArgs, opts ...pulumi.ResourceOpt) (*Elastigroup, error) {
	if args == nil || args.LowPrioritySizes == nil {
		return nil, errors.New("missing required argument 'LowPrioritySizes'")
	}
	if args == nil || args.Network == nil {
		return nil, errors.New("missing required argument 'Network'")
	}
	if args == nil || args.OdSizes == nil {
		return nil, errors.New("missing required argument 'OdSizes'")
	}
	if args == nil || args.Product == nil {
		return nil, errors.New("missing required argument 'Product'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	if args == nil || args.Strategy == nil {
		return nil, errors.New("missing required argument 'Strategy'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["customData"] = nil
		inputs["desiredCapacity"] = nil
		inputs["healthCheck"] = nil
		inputs["images"] = nil
		inputs["integrationKubernetes"] = nil
		inputs["integrationMultaiRuntime"] = nil
		inputs["loadBalancers"] = nil
		inputs["login"] = nil
		inputs["lowPrioritySizes"] = nil
		inputs["managedServiceIdentities"] = nil
		inputs["maxSize"] = nil
		inputs["minSize"] = nil
		inputs["name"] = nil
		inputs["network"] = nil
		inputs["odSizes"] = nil
		inputs["product"] = nil
		inputs["region"] = nil
		inputs["resourceGroupName"] = nil
		inputs["scalingDownPolicies"] = nil
		inputs["scalingUpPolicies"] = nil
		inputs["scheduledTasks"] = nil
		inputs["shutdownScript"] = nil
		inputs["strategy"] = nil
		inputs["updatePolicy"] = nil
		inputs["userData"] = nil
	} else {
		inputs["customData"] = args.CustomData
		inputs["desiredCapacity"] = args.DesiredCapacity
		inputs["healthCheck"] = args.HealthCheck
		inputs["images"] = args.Images
		inputs["integrationKubernetes"] = args.IntegrationKubernetes
		inputs["integrationMultaiRuntime"] = args.IntegrationMultaiRuntime
		inputs["loadBalancers"] = args.LoadBalancers
		inputs["login"] = args.Login
		inputs["lowPrioritySizes"] = args.LowPrioritySizes
		inputs["managedServiceIdentities"] = args.ManagedServiceIdentities
		inputs["maxSize"] = args.MaxSize
		inputs["minSize"] = args.MinSize
		inputs["name"] = args.Name
		inputs["network"] = args.Network
		inputs["odSizes"] = args.OdSizes
		inputs["product"] = args.Product
		inputs["region"] = args.Region
		inputs["resourceGroupName"] = args.ResourceGroupName
		inputs["scalingDownPolicies"] = args.ScalingDownPolicies
		inputs["scalingUpPolicies"] = args.ScalingUpPolicies
		inputs["scheduledTasks"] = args.ScheduledTasks
		inputs["shutdownScript"] = args.ShutdownScript
		inputs["strategy"] = args.Strategy
		inputs["updatePolicy"] = args.UpdatePolicy
		inputs["userData"] = args.UserData
	}
	s, err := ctx.RegisterResource("spotinst:azure/elastigroup:Elastigroup", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Elastigroup{s: s}, nil
}

// GetElastigroup gets an existing Elastigroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElastigroup(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ElastigroupState, opts ...pulumi.ResourceOpt) (*Elastigroup, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["customData"] = state.CustomData
		inputs["desiredCapacity"] = state.DesiredCapacity
		inputs["healthCheck"] = state.HealthCheck
		inputs["images"] = state.Images
		inputs["integrationKubernetes"] = state.IntegrationKubernetes
		inputs["integrationMultaiRuntime"] = state.IntegrationMultaiRuntime
		inputs["loadBalancers"] = state.LoadBalancers
		inputs["login"] = state.Login
		inputs["lowPrioritySizes"] = state.LowPrioritySizes
		inputs["managedServiceIdentities"] = state.ManagedServiceIdentities
		inputs["maxSize"] = state.MaxSize
		inputs["minSize"] = state.MinSize
		inputs["name"] = state.Name
		inputs["network"] = state.Network
		inputs["odSizes"] = state.OdSizes
		inputs["product"] = state.Product
		inputs["region"] = state.Region
		inputs["resourceGroupName"] = state.ResourceGroupName
		inputs["scalingDownPolicies"] = state.ScalingDownPolicies
		inputs["scalingUpPolicies"] = state.ScalingUpPolicies
		inputs["scheduledTasks"] = state.ScheduledTasks
		inputs["shutdownScript"] = state.ShutdownScript
		inputs["strategy"] = state.Strategy
		inputs["updatePolicy"] = state.UpdatePolicy
		inputs["userData"] = state.UserData
	}
	s, err := ctx.ReadResource("spotinst:azure/elastigroup:Elastigroup", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Elastigroup{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Elastigroup) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Elastigroup) ID() pulumi.IDOutput {
	return r.s.ID()
}

func (r *Elastigroup) CustomData() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["customData"])
}

// The desired number of instances the group should have at any time.
func (r *Elastigroup) DesiredCapacity() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["desiredCapacity"])
}

func (r *Elastigroup) HealthCheck() pulumi.Output {
	return r.s.State["healthCheck"]
}

func (r *Elastigroup) Images() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["images"])
}

func (r *Elastigroup) IntegrationKubernetes() pulumi.Output {
	return r.s.State["integrationKubernetes"]
}

func (r *Elastigroup) IntegrationMultaiRuntime() pulumi.Output {
	return r.s.State["integrationMultaiRuntime"]
}

func (r *Elastigroup) LoadBalancers() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["loadBalancers"])
}

func (r *Elastigroup) Login() pulumi.Output {
	return r.s.State["login"]
}

// Available Low-Priority sizes.
func (r *Elastigroup) LowPrioritySizes() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["lowPrioritySizes"])
}

func (r *Elastigroup) ManagedServiceIdentities() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["managedServiceIdentities"])
}

// The maximum number of instances the group should have at any time.
func (r *Elastigroup) MaxSize() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["maxSize"])
}

// The minimum number of instances the group should have at any time.
func (r *Elastigroup) MinSize() pulumi.IntOutput {
	return (pulumi.IntOutput)(r.s.State["minSize"])
}

// The name of the managed identity.
func (r *Elastigroup) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

func (r *Elastigroup) Network() pulumi.Output {
	return r.s.State["network"]
}

// Available On-Demand sizes
func (r *Elastigroup) OdSizes() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["odSizes"])
}

// Operation system type. Valid values: `"Linux"`, `"Windows"`.
func (r *Elastigroup) Product() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["product"])
}

// The region your Azure group will be created in.
func (r *Elastigroup) Region() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["region"])
}

// The Resource Group that the user-assigned managed identity resides in.
func (r *Elastigroup) ResourceGroupName() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["resourceGroupName"])
}

func (r *Elastigroup) ScalingDownPolicies() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["scalingDownPolicies"])
}

func (r *Elastigroup) ScalingUpPolicies() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["scalingUpPolicies"])
}

func (r *Elastigroup) ScheduledTasks() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["scheduledTasks"])
}

// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
func (r *Elastigroup) ShutdownScript() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["shutdownScript"])
}

// Describes the deployment strategy.
func (r *Elastigroup) Strategy() pulumi.Output {
	return r.s.State["strategy"]
}

func (r *Elastigroup) UpdatePolicy() pulumi.Output {
	return r.s.State["updatePolicy"]
}

// Base64-encoded MIME user data to make available to the instances.
func (r *Elastigroup) UserData() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["userData"])
}

// Input properties used for looking up and filtering Elastigroup resources.
type ElastigroupState struct {
	CustomData interface{}
	// The desired number of instances the group should have at any time.
	DesiredCapacity interface{}
	HealthCheck interface{}
	Images interface{}
	IntegrationKubernetes interface{}
	IntegrationMultaiRuntime interface{}
	LoadBalancers interface{}
	Login interface{}
	// Available Low-Priority sizes.
	LowPrioritySizes interface{}
	ManagedServiceIdentities interface{}
	// The maximum number of instances the group should have at any time.
	MaxSize interface{}
	// The minimum number of instances the group should have at any time.
	MinSize interface{}
	// The name of the managed identity.
	Name interface{}
	Network interface{}
	// Available On-Demand sizes
	OdSizes interface{}
	// Operation system type. Valid values: `"Linux"`, `"Windows"`.
	Product interface{}
	// The region your Azure group will be created in.
	Region interface{}
	// The Resource Group that the user-assigned managed identity resides in.
	ResourceGroupName interface{}
	ScalingDownPolicies interface{}
	ScalingUpPolicies interface{}
	ScheduledTasks interface{}
	// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
	ShutdownScript interface{}
	// Describes the deployment strategy.
	Strategy interface{}
	UpdatePolicy interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
}

// The set of arguments for constructing a Elastigroup resource.
type ElastigroupArgs struct {
	CustomData interface{}
	// The desired number of instances the group should have at any time.
	DesiredCapacity interface{}
	HealthCheck interface{}
	Images interface{}
	IntegrationKubernetes interface{}
	IntegrationMultaiRuntime interface{}
	LoadBalancers interface{}
	Login interface{}
	// Available Low-Priority sizes.
	LowPrioritySizes interface{}
	ManagedServiceIdentities interface{}
	// The maximum number of instances the group should have at any time.
	MaxSize interface{}
	// The minimum number of instances the group should have at any time.
	MinSize interface{}
	// The name of the managed identity.
	Name interface{}
	Network interface{}
	// Available On-Demand sizes
	OdSizes interface{}
	// Operation system type. Valid values: `"Linux"`, `"Windows"`.
	Product interface{}
	// The region your Azure group will be created in.
	Region interface{}
	// The Resource Group that the user-assigned managed identity resides in.
	ResourceGroupName interface{}
	ScalingDownPolicies interface{}
	ScalingUpPolicies interface{}
	ScheduledTasks interface{}
	// Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
	ShutdownScript interface{}
	// Describes the deployment strategy.
	Strategy interface{}
	UpdatePolicy interface{}
	// Base64-encoded MIME user data to make available to the instances.
	UserData interface{}
}
