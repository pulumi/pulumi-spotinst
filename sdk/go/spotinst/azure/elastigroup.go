// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst elastigroup Azure resource.
//
// ## Image
//
// * `image` - (Required) Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
//   - `publisher` - (Optional) Image publisher. Required if resourceGroupName is not specified.
//   - `offer` - (Optional) Name of the image to use. Required if publisher is specified.
//   - `sku` - (Optional) Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
//   - `version` -
//   - `resourceGroupName` - (Optional) Name of Resource Group for custom image. Required if publisher not specified.
//   - `imageName` - (Optional) Name of the custom image. Required if resourceGroupName is specified.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// <a id="network"></a>
// ## Network
//
// * `network` - (Required) Defines the Virtual Network and Subnet for your Elastigroup.
//   - `virtualNetworkName` - (Required) Name of Vnet.
//   - `resourceGroupName` - (Required) Vnet Resource Group Name.
//   - `networkInterfaces` -
//   - `subnetName` - (Required) ID of subnet.
//   - `assignPublicUp` - (Optional, Default: `false`) Assign a public IP to each VM in the Elastigroup.
//   - `isPrimary` -
//   - `additionalIpConfigs` - (Optional) Array of additional IP configuration objects.
//   - `name` - (Required) The IP configuration name.
//   - `privateIpVersion` - (Optional) Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
//   - `applicationSecurityGroup` - (Optional) - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
//   - `name` - (Required) - The name of the Application Security group.
//   - `resourceGroupName` - (Required) - The resource group of the Application Security Group.
//     }
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ### Login
//
// * `login` - (Required) Describes the login configuration.
//   - `userName` - (Required) Set admin access for accessing your VMs.
//   - `sshPublicKey` - (Optional) SSH for admin access to Linux VMs. Required for Linux OS types.
//   - `password` - (Optional) Password for admin access to Windows VMs. Required for Windows OS types.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
type Elastigroup struct {
	pulumi.CustomResourceState

	// Custom init script file or text in Base64 encoded format.
	CustomData pulumi.StringPtrOutput `pulumi:"customData"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity          pulumi.IntPtrOutput                          `pulumi:"desiredCapacity"`
	HealthCheck              ElastigroupHealthCheckPtrOutput              `pulumi:"healthCheck"`
	Images                   ElastigroupImageArrayOutput                  `pulumi:"images"`
	IntegrationKubernetes    ElastigroupIntegrationKubernetesPtrOutput    `pulumi:"integrationKubernetes"`
	IntegrationMultaiRuntime ElastigroupIntegrationMultaiRuntimePtrOutput `pulumi:"integrationMultaiRuntime"`
	LoadBalancers            ElastigroupLoadBalancerArrayOutput           `pulumi:"loadBalancers"`
	Login                    ElastigroupLoginPtrOutput                    `pulumi:"login"`
	LowPrioritySizes         pulumi.StringArrayOutput                     `pulumi:"lowPrioritySizes"`
	ManagedServiceIdentities ElastigroupManagedServiceIdentityArrayOutput `pulumi:"managedServiceIdentities"`
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// Name of the Managed Service Identity.
	Name    pulumi.StringOutput      `pulumi:"name"`
	Network ElastigroupNetworkOutput `pulumi:"network"`
	// Available On-Demand sizes
	OdSizes pulumi.StringArrayOutput `pulumi:"odSizes"`
	Product pulumi.StringOutput      `pulumi:"product"`
	// The region your Azure group will be created in.
	Region pulumi.StringOutput `pulumi:"region"`
	// Name of the Azure Resource Group where the Managed Service Identity is located.
	ResourceGroupName   pulumi.StringOutput                     `pulumi:"resourceGroupName"`
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayOutput `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies   ElastigroupScalingUpPolicyArrayOutput   `pulumi:"scalingUpPolicies"`
	ScheduledTasks      ElastigroupScheduledTaskArrayOutput     `pulumi:"scheduledTasks"`
	ShutdownScript      pulumi.StringPtrOutput                  `pulumi:"shutdownScript"`
	Strategy            ElastigroupStrategyOutput               `pulumi:"strategy"`
	UpdatePolicy        ElastigroupUpdatePolicyPtrOutput        `pulumi:"updatePolicy"`
	UserData            pulumi.StringPtrOutput                  `pulumi:"userData"`
}

// NewElastigroup registers a new resource with the given unique name, arguments, and options.
func NewElastigroup(ctx *pulumi.Context,
	name string, args *ElastigroupArgs, opts ...pulumi.ResourceOption) (*Elastigroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LowPrioritySizes == nil {
		return nil, errors.New("invalid value for required argument 'LowPrioritySizes'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	if args.OdSizes == nil {
		return nil, errors.New("invalid value for required argument 'OdSizes'")
	}
	if args.Product == nil {
		return nil, errors.New("invalid value for required argument 'Product'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Strategy == nil {
		return nil, errors.New("invalid value for required argument 'Strategy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Elastigroup
	err := ctx.RegisterResource("spotinst:azure/elastigroup:Elastigroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetElastigroup gets an existing Elastigroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElastigroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ElastigroupState, opts ...pulumi.ResourceOption) (*Elastigroup, error) {
	var resource Elastigroup
	err := ctx.ReadResource("spotinst:azure/elastigroup:Elastigroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Elastigroup resources.
type elastigroupState struct {
	// Custom init script file or text in Base64 encoded format.
	CustomData *string `pulumi:"customData"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity          *int                                 `pulumi:"desiredCapacity"`
	HealthCheck              *ElastigroupHealthCheck              `pulumi:"healthCheck"`
	Images                   []ElastigroupImage                   `pulumi:"images"`
	IntegrationKubernetes    *ElastigroupIntegrationKubernetes    `pulumi:"integrationKubernetes"`
	IntegrationMultaiRuntime *ElastigroupIntegrationMultaiRuntime `pulumi:"integrationMultaiRuntime"`
	LoadBalancers            []ElastigroupLoadBalancer            `pulumi:"loadBalancers"`
	Login                    *ElastigroupLogin                    `pulumi:"login"`
	LowPrioritySizes         []string                             `pulumi:"lowPrioritySizes"`
	ManagedServiceIdentities []ElastigroupManagedServiceIdentity  `pulumi:"managedServiceIdentities"`
	// The maximum number of instances the group should have at any time.
	MaxSize *int `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize *int `pulumi:"minSize"`
	// Name of the Managed Service Identity.
	Name    *string             `pulumi:"name"`
	Network *ElastigroupNetwork `pulumi:"network"`
	// Available On-Demand sizes
	OdSizes []string `pulumi:"odSizes"`
	Product *string  `pulumi:"product"`
	// The region your Azure group will be created in.
	Region *string `pulumi:"region"`
	// Name of the Azure Resource Group where the Managed Service Identity is located.
	ResourceGroupName   *string                        `pulumi:"resourceGroupName"`
	ScalingDownPolicies []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies   []ElastigroupScalingUpPolicy   `pulumi:"scalingUpPolicies"`
	ScheduledTasks      []ElastigroupScheduledTask     `pulumi:"scheduledTasks"`
	ShutdownScript      *string                        `pulumi:"shutdownScript"`
	Strategy            *ElastigroupStrategy           `pulumi:"strategy"`
	UpdatePolicy        *ElastigroupUpdatePolicy       `pulumi:"updatePolicy"`
	UserData            *string                        `pulumi:"userData"`
}

type ElastigroupState struct {
	// Custom init script file or text in Base64 encoded format.
	CustomData pulumi.StringPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity          pulumi.IntPtrInput
	HealthCheck              ElastigroupHealthCheckPtrInput
	Images                   ElastigroupImageArrayInput
	IntegrationKubernetes    ElastigroupIntegrationKubernetesPtrInput
	IntegrationMultaiRuntime ElastigroupIntegrationMultaiRuntimePtrInput
	LoadBalancers            ElastigroupLoadBalancerArrayInput
	Login                    ElastigroupLoginPtrInput
	LowPrioritySizes         pulumi.StringArrayInput
	ManagedServiceIdentities ElastigroupManagedServiceIdentityArrayInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntPtrInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntPtrInput
	// Name of the Managed Service Identity.
	Name    pulumi.StringPtrInput
	Network ElastigroupNetworkPtrInput
	// Available On-Demand sizes
	OdSizes pulumi.StringArrayInput
	Product pulumi.StringPtrInput
	// The region your Azure group will be created in.
	Region pulumi.StringPtrInput
	// Name of the Azure Resource Group where the Managed Service Identity is located.
	ResourceGroupName   pulumi.StringPtrInput
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayInput
	ScalingUpPolicies   ElastigroupScalingUpPolicyArrayInput
	ScheduledTasks      ElastigroupScheduledTaskArrayInput
	ShutdownScript      pulumi.StringPtrInput
	Strategy            ElastigroupStrategyPtrInput
	UpdatePolicy        ElastigroupUpdatePolicyPtrInput
	UserData            pulumi.StringPtrInput
}

func (ElastigroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupState)(nil)).Elem()
}

type elastigroupArgs struct {
	// Custom init script file or text in Base64 encoded format.
	CustomData *string `pulumi:"customData"`
	// The desired number of instances the group should have at any time.
	DesiredCapacity          *int                                 `pulumi:"desiredCapacity"`
	HealthCheck              *ElastigroupHealthCheck              `pulumi:"healthCheck"`
	Images                   []ElastigroupImage                   `pulumi:"images"`
	IntegrationKubernetes    *ElastigroupIntegrationKubernetes    `pulumi:"integrationKubernetes"`
	IntegrationMultaiRuntime *ElastigroupIntegrationMultaiRuntime `pulumi:"integrationMultaiRuntime"`
	LoadBalancers            []ElastigroupLoadBalancer            `pulumi:"loadBalancers"`
	Login                    *ElastigroupLogin                    `pulumi:"login"`
	LowPrioritySizes         []string                             `pulumi:"lowPrioritySizes"`
	ManagedServiceIdentities []ElastigroupManagedServiceIdentity  `pulumi:"managedServiceIdentities"`
	// The maximum number of instances the group should have at any time.
	MaxSize *int `pulumi:"maxSize"`
	// The minimum number of instances the group should have at any time.
	MinSize *int `pulumi:"minSize"`
	// Name of the Managed Service Identity.
	Name    *string            `pulumi:"name"`
	Network ElastigroupNetwork `pulumi:"network"`
	// Available On-Demand sizes
	OdSizes []string `pulumi:"odSizes"`
	Product string   `pulumi:"product"`
	// The region your Azure group will be created in.
	Region string `pulumi:"region"`
	// Name of the Azure Resource Group where the Managed Service Identity is located.
	ResourceGroupName   string                         `pulumi:"resourceGroupName"`
	ScalingDownPolicies []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies   []ElastigroupScalingUpPolicy   `pulumi:"scalingUpPolicies"`
	ScheduledTasks      []ElastigroupScheduledTask     `pulumi:"scheduledTasks"`
	ShutdownScript      *string                        `pulumi:"shutdownScript"`
	Strategy            ElastigroupStrategy            `pulumi:"strategy"`
	UpdatePolicy        *ElastigroupUpdatePolicy       `pulumi:"updatePolicy"`
	UserData            *string                        `pulumi:"userData"`
}

// The set of arguments for constructing a Elastigroup resource.
type ElastigroupArgs struct {
	// Custom init script file or text in Base64 encoded format.
	CustomData pulumi.StringPtrInput
	// The desired number of instances the group should have at any time.
	DesiredCapacity          pulumi.IntPtrInput
	HealthCheck              ElastigroupHealthCheckPtrInput
	Images                   ElastigroupImageArrayInput
	IntegrationKubernetes    ElastigroupIntegrationKubernetesPtrInput
	IntegrationMultaiRuntime ElastigroupIntegrationMultaiRuntimePtrInput
	LoadBalancers            ElastigroupLoadBalancerArrayInput
	Login                    ElastigroupLoginPtrInput
	LowPrioritySizes         pulumi.StringArrayInput
	ManagedServiceIdentities ElastigroupManagedServiceIdentityArrayInput
	// The maximum number of instances the group should have at any time.
	MaxSize pulumi.IntPtrInput
	// The minimum number of instances the group should have at any time.
	MinSize pulumi.IntPtrInput
	// Name of the Managed Service Identity.
	Name    pulumi.StringPtrInput
	Network ElastigroupNetworkInput
	// Available On-Demand sizes
	OdSizes pulumi.StringArrayInput
	Product pulumi.StringInput
	// The region your Azure group will be created in.
	Region pulumi.StringInput
	// Name of the Azure Resource Group where the Managed Service Identity is located.
	ResourceGroupName   pulumi.StringInput
	ScalingDownPolicies ElastigroupScalingDownPolicyArrayInput
	ScalingUpPolicies   ElastigroupScalingUpPolicyArrayInput
	ScheduledTasks      ElastigroupScheduledTaskArrayInput
	ShutdownScript      pulumi.StringPtrInput
	Strategy            ElastigroupStrategyInput
	UpdatePolicy        ElastigroupUpdatePolicyPtrInput
	UserData            pulumi.StringPtrInput
}

func (ElastigroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupArgs)(nil)).Elem()
}

type ElastigroupInput interface {
	pulumi.Input

	ToElastigroupOutput() ElastigroupOutput
	ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput
}

func (*Elastigroup) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil)).Elem()
}

func (i *Elastigroup) ToElastigroupOutput() ElastigroupOutput {
	return i.ToElastigroupOutputWithContext(context.Background())
}

func (i *Elastigroup) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupOutput)
}

// ElastigroupArrayInput is an input type that accepts ElastigroupArray and ElastigroupArrayOutput values.
// You can construct a concrete instance of `ElastigroupArrayInput` via:
//
//	ElastigroupArray{ ElastigroupArgs{...} }
type ElastigroupArrayInput interface {
	pulumi.Input

	ToElastigroupArrayOutput() ElastigroupArrayOutput
	ToElastigroupArrayOutputWithContext(context.Context) ElastigroupArrayOutput
}

type ElastigroupArray []ElastigroupInput

func (ElastigroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Elastigroup)(nil)).Elem()
}

func (i ElastigroupArray) ToElastigroupArrayOutput() ElastigroupArrayOutput {
	return i.ToElastigroupArrayOutputWithContext(context.Background())
}

func (i ElastigroupArray) ToElastigroupArrayOutputWithContext(ctx context.Context) ElastigroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupArrayOutput)
}

// ElastigroupMapInput is an input type that accepts ElastigroupMap and ElastigroupMapOutput values.
// You can construct a concrete instance of `ElastigroupMapInput` via:
//
//	ElastigroupMap{ "key": ElastigroupArgs{...} }
type ElastigroupMapInput interface {
	pulumi.Input

	ToElastigroupMapOutput() ElastigroupMapOutput
	ToElastigroupMapOutputWithContext(context.Context) ElastigroupMapOutput
}

type ElastigroupMap map[string]ElastigroupInput

func (ElastigroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Elastigroup)(nil)).Elem()
}

func (i ElastigroupMap) ToElastigroupMapOutput() ElastigroupMapOutput {
	return i.ToElastigroupMapOutputWithContext(context.Background())
}

func (i ElastigroupMap) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupMapOutput)
}

type ElastigroupOutput struct{ *pulumi.OutputState }

func (ElastigroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil)).Elem()
}

func (o ElastigroupOutput) ToElastigroupOutput() ElastigroupOutput {
	return o
}

func (o ElastigroupOutput) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return o
}

// Custom init script file or text in Base64 encoded format.
func (o ElastigroupOutput) CustomData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.CustomData }).(pulumi.StringPtrOutput)
}

// The desired number of instances the group should have at any time.
func (o ElastigroupOutput) DesiredCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntPtrOutput { return v.DesiredCapacity }).(pulumi.IntPtrOutput)
}

func (o ElastigroupOutput) HealthCheck() ElastigroupHealthCheckPtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupHealthCheckPtrOutput { return v.HealthCheck }).(ElastigroupHealthCheckPtrOutput)
}

func (o ElastigroupOutput) Images() ElastigroupImageArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupImageArrayOutput { return v.Images }).(ElastigroupImageArrayOutput)
}

func (o ElastigroupOutput) IntegrationKubernetes() ElastigroupIntegrationKubernetesPtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupIntegrationKubernetesPtrOutput { return v.IntegrationKubernetes }).(ElastigroupIntegrationKubernetesPtrOutput)
}

func (o ElastigroupOutput) IntegrationMultaiRuntime() ElastigroupIntegrationMultaiRuntimePtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupIntegrationMultaiRuntimePtrOutput { return v.IntegrationMultaiRuntime }).(ElastigroupIntegrationMultaiRuntimePtrOutput)
}

func (o ElastigroupOutput) LoadBalancers() ElastigroupLoadBalancerArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupLoadBalancerArrayOutput { return v.LoadBalancers }).(ElastigroupLoadBalancerArrayOutput)
}

func (o ElastigroupOutput) Login() ElastigroupLoginPtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupLoginPtrOutput { return v.Login }).(ElastigroupLoginPtrOutput)
}

func (o ElastigroupOutput) LowPrioritySizes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringArrayOutput { return v.LowPrioritySizes }).(pulumi.StringArrayOutput)
}

func (o ElastigroupOutput) ManagedServiceIdentities() ElastigroupManagedServiceIdentityArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupManagedServiceIdentityArrayOutput { return v.ManagedServiceIdentities }).(ElastigroupManagedServiceIdentityArrayOutput)
}

// The maximum number of instances the group should have at any time.
func (o ElastigroupOutput) MaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntOutput { return v.MaxSize }).(pulumi.IntOutput)
}

// The minimum number of instances the group should have at any time.
func (o ElastigroupOutput) MinSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntOutput { return v.MinSize }).(pulumi.IntOutput)
}

// Name of the Managed Service Identity.
func (o ElastigroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ElastigroupOutput) Network() ElastigroupNetworkOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupNetworkOutput { return v.Network }).(ElastigroupNetworkOutput)
}

// Available On-Demand sizes
func (o ElastigroupOutput) OdSizes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringArrayOutput { return v.OdSizes }).(pulumi.StringArrayOutput)
}

func (o ElastigroupOutput) Product() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.Product }).(pulumi.StringOutput)
}

// The region your Azure group will be created in.
func (o ElastigroupOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Name of the Azure Resource Group where the Managed Service Identity is located.
func (o ElastigroupOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func (o ElastigroupOutput) ScalingDownPolicies() ElastigroupScalingDownPolicyArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupScalingDownPolicyArrayOutput { return v.ScalingDownPolicies }).(ElastigroupScalingDownPolicyArrayOutput)
}

func (o ElastigroupOutput) ScalingUpPolicies() ElastigroupScalingUpPolicyArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupScalingUpPolicyArrayOutput { return v.ScalingUpPolicies }).(ElastigroupScalingUpPolicyArrayOutput)
}

func (o ElastigroupOutput) ScheduledTasks() ElastigroupScheduledTaskArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupScheduledTaskArrayOutput { return v.ScheduledTasks }).(ElastigroupScheduledTaskArrayOutput)
}

func (o ElastigroupOutput) ShutdownScript() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.ShutdownScript }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) Strategy() ElastigroupStrategyOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupStrategyOutput { return v.Strategy }).(ElastigroupStrategyOutput)
}

func (o ElastigroupOutput) UpdatePolicy() ElastigroupUpdatePolicyPtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupUpdatePolicyPtrOutput { return v.UpdatePolicy }).(ElastigroupUpdatePolicyPtrOutput)
}

func (o ElastigroupOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

type ElastigroupArrayOutput struct{ *pulumi.OutputState }

func (ElastigroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Elastigroup)(nil)).Elem()
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutput() ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutputWithContext(ctx context.Context) ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) Index(i pulumi.IntInput) ElastigroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Elastigroup {
		return vs[0].([]*Elastigroup)[vs[1].(int)]
	}).(ElastigroupOutput)
}

type ElastigroupMapOutput struct{ *pulumi.OutputState }

func (ElastigroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Elastigroup)(nil)).Elem()
}

func (o ElastigroupMapOutput) ToElastigroupMapOutput() ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) MapIndex(k pulumi.StringInput) ElastigroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Elastigroup {
		return vs[0].(map[string]*Elastigroup)[vs[1].(string)]
	}).(ElastigroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupInput)(nil)).Elem(), &Elastigroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupArrayInput)(nil)).Elem(), ElastigroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupMapInput)(nil)).Elem(), ElastigroupMap{})
	pulumi.RegisterOutputType(ElastigroupOutput{})
	pulumi.RegisterOutputType(ElastigroupArrayOutput{})
	pulumi.RegisterOutputType(ElastigroupMapOutput{})
}
