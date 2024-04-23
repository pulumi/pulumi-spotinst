// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst Ocean AWS Extended Resource Definition resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/aws"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := aws.NewOceanExtendedResourceDefinition(ctx, "example", &aws.OceanExtendedResourceDefinitionArgs{
//				Name: pulumi.String("terraform_extended_resource_definition"),
//				ResourceMapping: pulumi.Map{
//					"c3.large":  pulumi.Any("2Ki"),
//					"c3.xlarge": pulumi.Any("4Ki"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type OceanExtendedResourceDefinition struct {
	pulumi.CustomResourceState

	// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
	// The name should be a valid Kubernetes extended resource name.
	Name pulumi.StringOutput `pulumi:"name"`
	// A mapping between AWS instanceType or * as default and its value for the given extended resource.
	ResourceMapping pulumi.MapOutput `pulumi:"resourceMapping"`
}

// NewOceanExtendedResourceDefinition registers a new resource with the given unique name, arguments, and options.
func NewOceanExtendedResourceDefinition(ctx *pulumi.Context,
	name string, args *OceanExtendedResourceDefinitionArgs, opts ...pulumi.ResourceOption) (*OceanExtendedResourceDefinition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceMapping == nil {
		return nil, errors.New("invalid value for required argument 'ResourceMapping'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OceanExtendedResourceDefinition
	err := ctx.RegisterResource("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanExtendedResourceDefinition gets an existing OceanExtendedResourceDefinition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanExtendedResourceDefinition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanExtendedResourceDefinitionState, opts ...pulumi.ResourceOption) (*OceanExtendedResourceDefinition, error) {
	var resource OceanExtendedResourceDefinition
	err := ctx.ReadResource("spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanExtendedResourceDefinition resources.
type oceanExtendedResourceDefinitionState struct {
	// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
	// The name should be a valid Kubernetes extended resource name.
	Name *string `pulumi:"name"`
	// A mapping between AWS instanceType or * as default and its value for the given extended resource.
	ResourceMapping map[string]interface{} `pulumi:"resourceMapping"`
}

type OceanExtendedResourceDefinitionState struct {
	// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
	// The name should be a valid Kubernetes extended resource name.
	Name pulumi.StringPtrInput
	// A mapping between AWS instanceType or * as default and its value for the given extended resource.
	ResourceMapping pulumi.MapInput
}

func (OceanExtendedResourceDefinitionState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanExtendedResourceDefinitionState)(nil)).Elem()
}

type oceanExtendedResourceDefinitionArgs struct {
	// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
	// The name should be a valid Kubernetes extended resource name.
	Name *string `pulumi:"name"`
	// A mapping between AWS instanceType or * as default and its value for the given extended resource.
	ResourceMapping map[string]interface{} `pulumi:"resourceMapping"`
}

// The set of arguments for constructing a OceanExtendedResourceDefinition resource.
type OceanExtendedResourceDefinitionArgs struct {
	// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
	// The name should be a valid Kubernetes extended resource name.
	Name pulumi.StringPtrInput
	// A mapping between AWS instanceType or * as default and its value for the given extended resource.
	ResourceMapping pulumi.MapInput
}

func (OceanExtendedResourceDefinitionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanExtendedResourceDefinitionArgs)(nil)).Elem()
}

type OceanExtendedResourceDefinitionInput interface {
	pulumi.Input

	ToOceanExtendedResourceDefinitionOutput() OceanExtendedResourceDefinitionOutput
	ToOceanExtendedResourceDefinitionOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionOutput
}

func (*OceanExtendedResourceDefinition) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanExtendedResourceDefinition)(nil)).Elem()
}

func (i *OceanExtendedResourceDefinition) ToOceanExtendedResourceDefinitionOutput() OceanExtendedResourceDefinitionOutput {
	return i.ToOceanExtendedResourceDefinitionOutputWithContext(context.Background())
}

func (i *OceanExtendedResourceDefinition) ToOceanExtendedResourceDefinitionOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanExtendedResourceDefinitionOutput)
}

// OceanExtendedResourceDefinitionArrayInput is an input type that accepts OceanExtendedResourceDefinitionArray and OceanExtendedResourceDefinitionArrayOutput values.
// You can construct a concrete instance of `OceanExtendedResourceDefinitionArrayInput` via:
//
//	OceanExtendedResourceDefinitionArray{ OceanExtendedResourceDefinitionArgs{...} }
type OceanExtendedResourceDefinitionArrayInput interface {
	pulumi.Input

	ToOceanExtendedResourceDefinitionArrayOutput() OceanExtendedResourceDefinitionArrayOutput
	ToOceanExtendedResourceDefinitionArrayOutputWithContext(context.Context) OceanExtendedResourceDefinitionArrayOutput
}

type OceanExtendedResourceDefinitionArray []OceanExtendedResourceDefinitionInput

func (OceanExtendedResourceDefinitionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanExtendedResourceDefinition)(nil)).Elem()
}

func (i OceanExtendedResourceDefinitionArray) ToOceanExtendedResourceDefinitionArrayOutput() OceanExtendedResourceDefinitionArrayOutput {
	return i.ToOceanExtendedResourceDefinitionArrayOutputWithContext(context.Background())
}

func (i OceanExtendedResourceDefinitionArray) ToOceanExtendedResourceDefinitionArrayOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanExtendedResourceDefinitionArrayOutput)
}

// OceanExtendedResourceDefinitionMapInput is an input type that accepts OceanExtendedResourceDefinitionMap and OceanExtendedResourceDefinitionMapOutput values.
// You can construct a concrete instance of `OceanExtendedResourceDefinitionMapInput` via:
//
//	OceanExtendedResourceDefinitionMap{ "key": OceanExtendedResourceDefinitionArgs{...} }
type OceanExtendedResourceDefinitionMapInput interface {
	pulumi.Input

	ToOceanExtendedResourceDefinitionMapOutput() OceanExtendedResourceDefinitionMapOutput
	ToOceanExtendedResourceDefinitionMapOutputWithContext(context.Context) OceanExtendedResourceDefinitionMapOutput
}

type OceanExtendedResourceDefinitionMap map[string]OceanExtendedResourceDefinitionInput

func (OceanExtendedResourceDefinitionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanExtendedResourceDefinition)(nil)).Elem()
}

func (i OceanExtendedResourceDefinitionMap) ToOceanExtendedResourceDefinitionMapOutput() OceanExtendedResourceDefinitionMapOutput {
	return i.ToOceanExtendedResourceDefinitionMapOutputWithContext(context.Background())
}

func (i OceanExtendedResourceDefinitionMap) ToOceanExtendedResourceDefinitionMapOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanExtendedResourceDefinitionMapOutput)
}

type OceanExtendedResourceDefinitionOutput struct{ *pulumi.OutputState }

func (OceanExtendedResourceDefinitionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanExtendedResourceDefinition)(nil)).Elem()
}

func (o OceanExtendedResourceDefinitionOutput) ToOceanExtendedResourceDefinitionOutput() OceanExtendedResourceDefinitionOutput {
	return o
}

func (o OceanExtendedResourceDefinitionOutput) ToOceanExtendedResourceDefinitionOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionOutput {
	return o
}

// The extended resource name as should be requested by your pods and registered to the nodes. Cannot be updated.
// The name should be a valid Kubernetes extended resource name.
func (o OceanExtendedResourceDefinitionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanExtendedResourceDefinition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A mapping between AWS instanceType or * as default and its value for the given extended resource.
func (o OceanExtendedResourceDefinitionOutput) ResourceMapping() pulumi.MapOutput {
	return o.ApplyT(func(v *OceanExtendedResourceDefinition) pulumi.MapOutput { return v.ResourceMapping }).(pulumi.MapOutput)
}

type OceanExtendedResourceDefinitionArrayOutput struct{ *pulumi.OutputState }

func (OceanExtendedResourceDefinitionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanExtendedResourceDefinition)(nil)).Elem()
}

func (o OceanExtendedResourceDefinitionArrayOutput) ToOceanExtendedResourceDefinitionArrayOutput() OceanExtendedResourceDefinitionArrayOutput {
	return o
}

func (o OceanExtendedResourceDefinitionArrayOutput) ToOceanExtendedResourceDefinitionArrayOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionArrayOutput {
	return o
}

func (o OceanExtendedResourceDefinitionArrayOutput) Index(i pulumi.IntInput) OceanExtendedResourceDefinitionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanExtendedResourceDefinition {
		return vs[0].([]*OceanExtendedResourceDefinition)[vs[1].(int)]
	}).(OceanExtendedResourceDefinitionOutput)
}

type OceanExtendedResourceDefinitionMapOutput struct{ *pulumi.OutputState }

func (OceanExtendedResourceDefinitionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanExtendedResourceDefinition)(nil)).Elem()
}

func (o OceanExtendedResourceDefinitionMapOutput) ToOceanExtendedResourceDefinitionMapOutput() OceanExtendedResourceDefinitionMapOutput {
	return o
}

func (o OceanExtendedResourceDefinitionMapOutput) ToOceanExtendedResourceDefinitionMapOutputWithContext(ctx context.Context) OceanExtendedResourceDefinitionMapOutput {
	return o
}

func (o OceanExtendedResourceDefinitionMapOutput) MapIndex(k pulumi.StringInput) OceanExtendedResourceDefinitionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanExtendedResourceDefinition {
		return vs[0].(map[string]*OceanExtendedResourceDefinition)[vs[1].(string)]
	}).(OceanExtendedResourceDefinitionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanExtendedResourceDefinitionInput)(nil)).Elem(), &OceanExtendedResourceDefinition{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanExtendedResourceDefinitionArrayInput)(nil)).Elem(), OceanExtendedResourceDefinitionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanExtendedResourceDefinitionMapInput)(nil)).Elem(), OceanExtendedResourceDefinitionMap{})
	pulumi.RegisterOutputType(OceanExtendedResourceDefinitionOutput{})
	pulumi.RegisterOutputType(OceanExtendedResourceDefinitionArrayOutput{})
	pulumi.RegisterOutputType(OceanExtendedResourceDefinitionMapOutput{})
}
