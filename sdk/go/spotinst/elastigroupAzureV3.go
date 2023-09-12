// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type ElastigroupAzureV3 struct {
	pulumi.CustomResourceState

	CustomData               pulumi.StringPtrOutput                              `pulumi:"customData"`
	DesiredCapacity          pulumi.IntPtrOutput                                 `pulumi:"desiredCapacity"`
	DrainingTimeout          pulumi.IntOutput                                    `pulumi:"drainingTimeout"`
	FallbackToOnDemand       pulumi.BoolOutput                                   `pulumi:"fallbackToOnDemand"`
	Images                   ElastigroupAzureV3ImageArrayOutput                  `pulumi:"images"`
	Login                    ElastigroupAzureV3LoginPtrOutput                    `pulumi:"login"`
	ManagedServiceIdentities ElastigroupAzureV3ManagedServiceIdentityArrayOutput `pulumi:"managedServiceIdentities"`
	MaxSize                  pulumi.IntOutput                                    `pulumi:"maxSize"`
	MinSize                  pulumi.IntOutput                                    `pulumi:"minSize"`
	Name                     pulumi.StringOutput                                 `pulumi:"name"`
	Network                  ElastigroupAzureV3NetworkOutput                     `pulumi:"network"`
	OdSizes                  pulumi.StringArrayOutput                            `pulumi:"odSizes"`
	OnDemandCount            pulumi.IntPtrOutput                                 `pulumi:"onDemandCount"`
	Os                       pulumi.StringOutput                                 `pulumi:"os"`
	Region                   pulumi.StringOutput                                 `pulumi:"region"`
	ResourceGroupName        pulumi.StringOutput                                 `pulumi:"resourceGroupName"`
	SpotPercentage           pulumi.IntPtrOutput                                 `pulumi:"spotPercentage"`
	SpotSizes                pulumi.StringArrayOutput                            `pulumi:"spotSizes"`
	Tags                     ElastigroupAzureV3TagArrayOutput                    `pulumi:"tags"`
}

// NewElastigroupAzureV3 registers a new resource with the given unique name, arguments, and options.
func NewElastigroupAzureV3(ctx *pulumi.Context,
	name string, args *ElastigroupAzureV3Args, opts ...pulumi.ResourceOption) (*ElastigroupAzureV3, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FallbackToOnDemand == nil {
		return nil, errors.New("invalid value for required argument 'FallbackToOnDemand'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	if args.OdSizes == nil {
		return nil, errors.New("invalid value for required argument 'OdSizes'")
	}
	if args.Os == nil {
		return nil, errors.New("invalid value for required argument 'Os'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SpotSizes == nil {
		return nil, errors.New("invalid value for required argument 'SpotSizes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ElastigroupAzureV3
	err := ctx.RegisterResource("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetElastigroupAzureV3 gets an existing ElastigroupAzureV3 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetElastigroupAzureV3(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ElastigroupAzureV3State, opts ...pulumi.ResourceOption) (*ElastigroupAzureV3, error) {
	var resource ElastigroupAzureV3
	err := ctx.ReadResource("spotinst:index/elastigroupAzureV3:ElastigroupAzureV3", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ElastigroupAzureV3 resources.
type elastigroupAzureV3State struct {
	CustomData               *string                                    `pulumi:"customData"`
	DesiredCapacity          *int                                       `pulumi:"desiredCapacity"`
	DrainingTimeout          *int                                       `pulumi:"drainingTimeout"`
	FallbackToOnDemand       *bool                                      `pulumi:"fallbackToOnDemand"`
	Images                   []ElastigroupAzureV3Image                  `pulumi:"images"`
	Login                    *ElastigroupAzureV3Login                   `pulumi:"login"`
	ManagedServiceIdentities []ElastigroupAzureV3ManagedServiceIdentity `pulumi:"managedServiceIdentities"`
	MaxSize                  *int                                       `pulumi:"maxSize"`
	MinSize                  *int                                       `pulumi:"minSize"`
	Name                     *string                                    `pulumi:"name"`
	Network                  *ElastigroupAzureV3Network                 `pulumi:"network"`
	OdSizes                  []string                                   `pulumi:"odSizes"`
	OnDemandCount            *int                                       `pulumi:"onDemandCount"`
	Os                       *string                                    `pulumi:"os"`
	Region                   *string                                    `pulumi:"region"`
	ResourceGroupName        *string                                    `pulumi:"resourceGroupName"`
	SpotPercentage           *int                                       `pulumi:"spotPercentage"`
	SpotSizes                []string                                   `pulumi:"spotSizes"`
	Tags                     []ElastigroupAzureV3Tag                    `pulumi:"tags"`
}

type ElastigroupAzureV3State struct {
	CustomData               pulumi.StringPtrInput
	DesiredCapacity          pulumi.IntPtrInput
	DrainingTimeout          pulumi.IntPtrInput
	FallbackToOnDemand       pulumi.BoolPtrInput
	Images                   ElastigroupAzureV3ImageArrayInput
	Login                    ElastigroupAzureV3LoginPtrInput
	ManagedServiceIdentities ElastigroupAzureV3ManagedServiceIdentityArrayInput
	MaxSize                  pulumi.IntPtrInput
	MinSize                  pulumi.IntPtrInput
	Name                     pulumi.StringPtrInput
	Network                  ElastigroupAzureV3NetworkPtrInput
	OdSizes                  pulumi.StringArrayInput
	OnDemandCount            pulumi.IntPtrInput
	Os                       pulumi.StringPtrInput
	Region                   pulumi.StringPtrInput
	ResourceGroupName        pulumi.StringPtrInput
	SpotPercentage           pulumi.IntPtrInput
	SpotSizes                pulumi.StringArrayInput
	Tags                     ElastigroupAzureV3TagArrayInput
}

func (ElastigroupAzureV3State) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupAzureV3State)(nil)).Elem()
}

type elastigroupAzureV3Args struct {
	CustomData               *string                                    `pulumi:"customData"`
	DesiredCapacity          *int                                       `pulumi:"desiredCapacity"`
	DrainingTimeout          *int                                       `pulumi:"drainingTimeout"`
	FallbackToOnDemand       bool                                       `pulumi:"fallbackToOnDemand"`
	Images                   []ElastigroupAzureV3Image                  `pulumi:"images"`
	Login                    *ElastigroupAzureV3Login                   `pulumi:"login"`
	ManagedServiceIdentities []ElastigroupAzureV3ManagedServiceIdentity `pulumi:"managedServiceIdentities"`
	MaxSize                  *int                                       `pulumi:"maxSize"`
	MinSize                  *int                                       `pulumi:"minSize"`
	Name                     *string                                    `pulumi:"name"`
	Network                  ElastigroupAzureV3Network                  `pulumi:"network"`
	OdSizes                  []string                                   `pulumi:"odSizes"`
	OnDemandCount            *int                                       `pulumi:"onDemandCount"`
	Os                       string                                     `pulumi:"os"`
	Region                   string                                     `pulumi:"region"`
	ResourceGroupName        string                                     `pulumi:"resourceGroupName"`
	SpotPercentage           *int                                       `pulumi:"spotPercentage"`
	SpotSizes                []string                                   `pulumi:"spotSizes"`
	Tags                     []ElastigroupAzureV3Tag                    `pulumi:"tags"`
}

// The set of arguments for constructing a ElastigroupAzureV3 resource.
type ElastigroupAzureV3Args struct {
	CustomData               pulumi.StringPtrInput
	DesiredCapacity          pulumi.IntPtrInput
	DrainingTimeout          pulumi.IntPtrInput
	FallbackToOnDemand       pulumi.BoolInput
	Images                   ElastigroupAzureV3ImageArrayInput
	Login                    ElastigroupAzureV3LoginPtrInput
	ManagedServiceIdentities ElastigroupAzureV3ManagedServiceIdentityArrayInput
	MaxSize                  pulumi.IntPtrInput
	MinSize                  pulumi.IntPtrInput
	Name                     pulumi.StringPtrInput
	Network                  ElastigroupAzureV3NetworkInput
	OdSizes                  pulumi.StringArrayInput
	OnDemandCount            pulumi.IntPtrInput
	Os                       pulumi.StringInput
	Region                   pulumi.StringInput
	ResourceGroupName        pulumi.StringInput
	SpotPercentage           pulumi.IntPtrInput
	SpotSizes                pulumi.StringArrayInput
	Tags                     ElastigroupAzureV3TagArrayInput
}

func (ElastigroupAzureV3Args) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupAzureV3Args)(nil)).Elem()
}

type ElastigroupAzureV3Input interface {
	pulumi.Input

	ToElastigroupAzureV3Output() ElastigroupAzureV3Output
	ToElastigroupAzureV3OutputWithContext(ctx context.Context) ElastigroupAzureV3Output
}

func (*ElastigroupAzureV3) ElementType() reflect.Type {
	return reflect.TypeOf((**ElastigroupAzureV3)(nil)).Elem()
}

func (i *ElastigroupAzureV3) ToElastigroupAzureV3Output() ElastigroupAzureV3Output {
	return i.ToElastigroupAzureV3OutputWithContext(context.Background())
}

func (i *ElastigroupAzureV3) ToElastigroupAzureV3OutputWithContext(ctx context.Context) ElastigroupAzureV3Output {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupAzureV3Output)
}

func (i *ElastigroupAzureV3) ToOutput(ctx context.Context) pulumix.Output[*ElastigroupAzureV3] {
	return pulumix.Output[*ElastigroupAzureV3]{
		OutputState: i.ToElastigroupAzureV3OutputWithContext(ctx).OutputState,
	}
}

// ElastigroupAzureV3ArrayInput is an input type that accepts ElastigroupAzureV3Array and ElastigroupAzureV3ArrayOutput values.
// You can construct a concrete instance of `ElastigroupAzureV3ArrayInput` via:
//
//	ElastigroupAzureV3Array{ ElastigroupAzureV3Args{...} }
type ElastigroupAzureV3ArrayInput interface {
	pulumi.Input

	ToElastigroupAzureV3ArrayOutput() ElastigroupAzureV3ArrayOutput
	ToElastigroupAzureV3ArrayOutputWithContext(context.Context) ElastigroupAzureV3ArrayOutput
}

type ElastigroupAzureV3Array []ElastigroupAzureV3Input

func (ElastigroupAzureV3Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ElastigroupAzureV3)(nil)).Elem()
}

func (i ElastigroupAzureV3Array) ToElastigroupAzureV3ArrayOutput() ElastigroupAzureV3ArrayOutput {
	return i.ToElastigroupAzureV3ArrayOutputWithContext(context.Background())
}

func (i ElastigroupAzureV3Array) ToElastigroupAzureV3ArrayOutputWithContext(ctx context.Context) ElastigroupAzureV3ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupAzureV3ArrayOutput)
}

func (i ElastigroupAzureV3Array) ToOutput(ctx context.Context) pulumix.Output[[]*ElastigroupAzureV3] {
	return pulumix.Output[[]*ElastigroupAzureV3]{
		OutputState: i.ToElastigroupAzureV3ArrayOutputWithContext(ctx).OutputState,
	}
}

// ElastigroupAzureV3MapInput is an input type that accepts ElastigroupAzureV3Map and ElastigroupAzureV3MapOutput values.
// You can construct a concrete instance of `ElastigroupAzureV3MapInput` via:
//
//	ElastigroupAzureV3Map{ "key": ElastigroupAzureV3Args{...} }
type ElastigroupAzureV3MapInput interface {
	pulumi.Input

	ToElastigroupAzureV3MapOutput() ElastigroupAzureV3MapOutput
	ToElastigroupAzureV3MapOutputWithContext(context.Context) ElastigroupAzureV3MapOutput
}

type ElastigroupAzureV3Map map[string]ElastigroupAzureV3Input

func (ElastigroupAzureV3Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ElastigroupAzureV3)(nil)).Elem()
}

func (i ElastigroupAzureV3Map) ToElastigroupAzureV3MapOutput() ElastigroupAzureV3MapOutput {
	return i.ToElastigroupAzureV3MapOutputWithContext(context.Background())
}

func (i ElastigroupAzureV3Map) ToElastigroupAzureV3MapOutputWithContext(ctx context.Context) ElastigroupAzureV3MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupAzureV3MapOutput)
}

func (i ElastigroupAzureV3Map) ToOutput(ctx context.Context) pulumix.Output[map[string]*ElastigroupAzureV3] {
	return pulumix.Output[map[string]*ElastigroupAzureV3]{
		OutputState: i.ToElastigroupAzureV3MapOutputWithContext(ctx).OutputState,
	}
}

type ElastigroupAzureV3Output struct{ *pulumi.OutputState }

func (ElastigroupAzureV3Output) ElementType() reflect.Type {
	return reflect.TypeOf((**ElastigroupAzureV3)(nil)).Elem()
}

func (o ElastigroupAzureV3Output) ToElastigroupAzureV3Output() ElastigroupAzureV3Output {
	return o
}

func (o ElastigroupAzureV3Output) ToElastigroupAzureV3OutputWithContext(ctx context.Context) ElastigroupAzureV3Output {
	return o
}

func (o ElastigroupAzureV3Output) ToOutput(ctx context.Context) pulumix.Output[*ElastigroupAzureV3] {
	return pulumix.Output[*ElastigroupAzureV3]{
		OutputState: o.OutputState,
	}
}

func (o ElastigroupAzureV3Output) CustomData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringPtrOutput { return v.CustomData }).(pulumi.StringPtrOutput)
}

func (o ElastigroupAzureV3Output) DesiredCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntPtrOutput { return v.DesiredCapacity }).(pulumi.IntPtrOutput)
}

func (o ElastigroupAzureV3Output) DrainingTimeout() pulumi.IntOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntOutput { return v.DrainingTimeout }).(pulumi.IntOutput)
}

func (o ElastigroupAzureV3Output) FallbackToOnDemand() pulumi.BoolOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.BoolOutput { return v.FallbackToOnDemand }).(pulumi.BoolOutput)
}

func (o ElastigroupAzureV3Output) Images() ElastigroupAzureV3ImageArrayOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) ElastigroupAzureV3ImageArrayOutput { return v.Images }).(ElastigroupAzureV3ImageArrayOutput)
}

func (o ElastigroupAzureV3Output) Login() ElastigroupAzureV3LoginPtrOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) ElastigroupAzureV3LoginPtrOutput { return v.Login }).(ElastigroupAzureV3LoginPtrOutput)
}

func (o ElastigroupAzureV3Output) ManagedServiceIdentities() ElastigroupAzureV3ManagedServiceIdentityArrayOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) ElastigroupAzureV3ManagedServiceIdentityArrayOutput {
		return v.ManagedServiceIdentities
	}).(ElastigroupAzureV3ManagedServiceIdentityArrayOutput)
}

func (o ElastigroupAzureV3Output) MaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntOutput { return v.MaxSize }).(pulumi.IntOutput)
}

func (o ElastigroupAzureV3Output) MinSize() pulumi.IntOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntOutput { return v.MinSize }).(pulumi.IntOutput)
}

func (o ElastigroupAzureV3Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ElastigroupAzureV3Output) Network() ElastigroupAzureV3NetworkOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) ElastigroupAzureV3NetworkOutput { return v.Network }).(ElastigroupAzureV3NetworkOutput)
}

func (o ElastigroupAzureV3Output) OdSizes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringArrayOutput { return v.OdSizes }).(pulumi.StringArrayOutput)
}

func (o ElastigroupAzureV3Output) OnDemandCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntPtrOutput { return v.OnDemandCount }).(pulumi.IntPtrOutput)
}

func (o ElastigroupAzureV3Output) Os() pulumi.StringOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringOutput { return v.Os }).(pulumi.StringOutput)
}

func (o ElastigroupAzureV3Output) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

func (o ElastigroupAzureV3Output) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

func (o ElastigroupAzureV3Output) SpotPercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.IntPtrOutput { return v.SpotPercentage }).(pulumi.IntPtrOutput)
}

func (o ElastigroupAzureV3Output) SpotSizes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) pulumi.StringArrayOutput { return v.SpotSizes }).(pulumi.StringArrayOutput)
}

func (o ElastigroupAzureV3Output) Tags() ElastigroupAzureV3TagArrayOutput {
	return o.ApplyT(func(v *ElastigroupAzureV3) ElastigroupAzureV3TagArrayOutput { return v.Tags }).(ElastigroupAzureV3TagArrayOutput)
}

type ElastigroupAzureV3ArrayOutput struct{ *pulumi.OutputState }

func (ElastigroupAzureV3ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ElastigroupAzureV3)(nil)).Elem()
}

func (o ElastigroupAzureV3ArrayOutput) ToElastigroupAzureV3ArrayOutput() ElastigroupAzureV3ArrayOutput {
	return o
}

func (o ElastigroupAzureV3ArrayOutput) ToElastigroupAzureV3ArrayOutputWithContext(ctx context.Context) ElastigroupAzureV3ArrayOutput {
	return o
}

func (o ElastigroupAzureV3ArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ElastigroupAzureV3] {
	return pulumix.Output[[]*ElastigroupAzureV3]{
		OutputState: o.OutputState,
	}
}

func (o ElastigroupAzureV3ArrayOutput) Index(i pulumi.IntInput) ElastigroupAzureV3Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ElastigroupAzureV3 {
		return vs[0].([]*ElastigroupAzureV3)[vs[1].(int)]
	}).(ElastigroupAzureV3Output)
}

type ElastigroupAzureV3MapOutput struct{ *pulumi.OutputState }

func (ElastigroupAzureV3MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ElastigroupAzureV3)(nil)).Elem()
}

func (o ElastigroupAzureV3MapOutput) ToElastigroupAzureV3MapOutput() ElastigroupAzureV3MapOutput {
	return o
}

func (o ElastigroupAzureV3MapOutput) ToElastigroupAzureV3MapOutputWithContext(ctx context.Context) ElastigroupAzureV3MapOutput {
	return o
}

func (o ElastigroupAzureV3MapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ElastigroupAzureV3] {
	return pulumix.Output[map[string]*ElastigroupAzureV3]{
		OutputState: o.OutputState,
	}
}

func (o ElastigroupAzureV3MapOutput) MapIndex(k pulumi.StringInput) ElastigroupAzureV3Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ElastigroupAzureV3 {
		return vs[0].(map[string]*ElastigroupAzureV3)[vs[1].(string)]
	}).(ElastigroupAzureV3Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupAzureV3Input)(nil)).Elem(), &ElastigroupAzureV3{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupAzureV3ArrayInput)(nil)).Elem(), ElastigroupAzureV3Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*ElastigroupAzureV3MapInput)(nil)).Elem(), ElastigroupAzureV3Map{})
	pulumi.RegisterOutputType(ElastigroupAzureV3Output{})
	pulumi.RegisterOutputType(ElastigroupAzureV3ArrayOutput{})
	pulumi.RegisterOutputType(ElastigroupAzureV3MapOutput{})
}
