// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a custom Spotinst Ocean GKE Launch Spec Import resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/gke"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gke.NewOceanLaunchSpecImport(ctx, "example", &gke.OceanLaunchSpecImportArgs{
// 			NodePoolName: pulumi.String("default-pool"),
// 			OceanId:      pulumi.String("o-123456"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec_import.Example.Id)
// 		return nil
// 	})
// }
// ```
type OceanLaunchSpecImport struct {
	pulumi.CustomResourceState

	// The node pool you wish to use in your launchSpec.
	NodePoolName pulumi.StringOutput `pulumi:"nodePoolName"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
}

// NewOceanLaunchSpecImport registers a new resource with the given unique name, arguments, and options.
func NewOceanLaunchSpecImport(ctx *pulumi.Context,
	name string, args *OceanLaunchSpecImportArgs, opts ...pulumi.ResourceOption) (*OceanLaunchSpecImport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodePoolName == nil {
		return nil, errors.New("invalid value for required argument 'NodePoolName'")
	}
	if args.OceanId == nil {
		return nil, errors.New("invalid value for required argument 'OceanId'")
	}
	var resource OceanLaunchSpecImport
	err := ctx.RegisterResource("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanLaunchSpecImport gets an existing OceanLaunchSpecImport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanLaunchSpecImport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanLaunchSpecImportState, opts ...pulumi.ResourceOption) (*OceanLaunchSpecImport, error) {
	var resource OceanLaunchSpecImport
	err := ctx.ReadResource("spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanLaunchSpecImport resources.
type oceanLaunchSpecImportState struct {
	// The node pool you wish to use in your launchSpec.
	NodePoolName *string `pulumi:"nodePoolName"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId *string `pulumi:"oceanId"`
}

type OceanLaunchSpecImportState struct {
	// The node pool you wish to use in your launchSpec.
	NodePoolName pulumi.StringPtrInput
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringPtrInput
}

func (OceanLaunchSpecImportState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecImportState)(nil)).Elem()
}

type oceanLaunchSpecImportArgs struct {
	// The node pool you wish to use in your launchSpec.
	NodePoolName string `pulumi:"nodePoolName"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId string `pulumi:"oceanId"`
}

// The set of arguments for constructing a OceanLaunchSpecImport resource.
type OceanLaunchSpecImportArgs struct {
	// The node pool you wish to use in your launchSpec.
	NodePoolName pulumi.StringInput
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringInput
}

func (OceanLaunchSpecImportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecImportArgs)(nil)).Elem()
}

type OceanLaunchSpecImportInput interface {
	pulumi.Input

	ToOceanLaunchSpecImportOutput() OceanLaunchSpecImportOutput
	ToOceanLaunchSpecImportOutputWithContext(ctx context.Context) OceanLaunchSpecImportOutput
}

func (*OceanLaunchSpecImport) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpecImport)(nil))
}

func (i *OceanLaunchSpecImport) ToOceanLaunchSpecImportOutput() OceanLaunchSpecImportOutput {
	return i.ToOceanLaunchSpecImportOutputWithContext(context.Background())
}

func (i *OceanLaunchSpecImport) ToOceanLaunchSpecImportOutputWithContext(ctx context.Context) OceanLaunchSpecImportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecImportOutput)
}

func (i *OceanLaunchSpecImport) ToOceanLaunchSpecImportPtrOutput() OceanLaunchSpecImportPtrOutput {
	return i.ToOceanLaunchSpecImportPtrOutputWithContext(context.Background())
}

func (i *OceanLaunchSpecImport) ToOceanLaunchSpecImportPtrOutputWithContext(ctx context.Context) OceanLaunchSpecImportPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecImportPtrOutput)
}

type OceanLaunchSpecImportPtrInput interface {
	pulumi.Input

	ToOceanLaunchSpecImportPtrOutput() OceanLaunchSpecImportPtrOutput
	ToOceanLaunchSpecImportPtrOutputWithContext(ctx context.Context) OceanLaunchSpecImportPtrOutput
}

type oceanLaunchSpecImportPtrType OceanLaunchSpecImportArgs

func (*oceanLaunchSpecImportPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanLaunchSpecImport)(nil))
}

func (i *oceanLaunchSpecImportPtrType) ToOceanLaunchSpecImportPtrOutput() OceanLaunchSpecImportPtrOutput {
	return i.ToOceanLaunchSpecImportPtrOutputWithContext(context.Background())
}

func (i *oceanLaunchSpecImportPtrType) ToOceanLaunchSpecImportPtrOutputWithContext(ctx context.Context) OceanLaunchSpecImportPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecImportPtrOutput)
}

// OceanLaunchSpecImportArrayInput is an input type that accepts OceanLaunchSpecImportArray and OceanLaunchSpecImportArrayOutput values.
// You can construct a concrete instance of `OceanLaunchSpecImportArrayInput` via:
//
//          OceanLaunchSpecImportArray{ OceanLaunchSpecImportArgs{...} }
type OceanLaunchSpecImportArrayInput interface {
	pulumi.Input

	ToOceanLaunchSpecImportArrayOutput() OceanLaunchSpecImportArrayOutput
	ToOceanLaunchSpecImportArrayOutputWithContext(context.Context) OceanLaunchSpecImportArrayOutput
}

type OceanLaunchSpecImportArray []OceanLaunchSpecImportInput

func (OceanLaunchSpecImportArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*OceanLaunchSpecImport)(nil))
}

func (i OceanLaunchSpecImportArray) ToOceanLaunchSpecImportArrayOutput() OceanLaunchSpecImportArrayOutput {
	return i.ToOceanLaunchSpecImportArrayOutputWithContext(context.Background())
}

func (i OceanLaunchSpecImportArray) ToOceanLaunchSpecImportArrayOutputWithContext(ctx context.Context) OceanLaunchSpecImportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecImportArrayOutput)
}

// OceanLaunchSpecImportMapInput is an input type that accepts OceanLaunchSpecImportMap and OceanLaunchSpecImportMapOutput values.
// You can construct a concrete instance of `OceanLaunchSpecImportMapInput` via:
//
//          OceanLaunchSpecImportMap{ "key": OceanLaunchSpecImportArgs{...} }
type OceanLaunchSpecImportMapInput interface {
	pulumi.Input

	ToOceanLaunchSpecImportMapOutput() OceanLaunchSpecImportMapOutput
	ToOceanLaunchSpecImportMapOutputWithContext(context.Context) OceanLaunchSpecImportMapOutput
}

type OceanLaunchSpecImportMap map[string]OceanLaunchSpecImportInput

func (OceanLaunchSpecImportMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*OceanLaunchSpecImport)(nil))
}

func (i OceanLaunchSpecImportMap) ToOceanLaunchSpecImportMapOutput() OceanLaunchSpecImportMapOutput {
	return i.ToOceanLaunchSpecImportMapOutputWithContext(context.Background())
}

func (i OceanLaunchSpecImportMap) ToOceanLaunchSpecImportMapOutputWithContext(ctx context.Context) OceanLaunchSpecImportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecImportMapOutput)
}

type OceanLaunchSpecImportOutput struct {
	*pulumi.OutputState
}

func (OceanLaunchSpecImportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpecImport)(nil))
}

func (o OceanLaunchSpecImportOutput) ToOceanLaunchSpecImportOutput() OceanLaunchSpecImportOutput {
	return o
}

func (o OceanLaunchSpecImportOutput) ToOceanLaunchSpecImportOutputWithContext(ctx context.Context) OceanLaunchSpecImportOutput {
	return o
}

func (o OceanLaunchSpecImportOutput) ToOceanLaunchSpecImportPtrOutput() OceanLaunchSpecImportPtrOutput {
	return o.ToOceanLaunchSpecImportPtrOutputWithContext(context.Background())
}

func (o OceanLaunchSpecImportOutput) ToOceanLaunchSpecImportPtrOutputWithContext(ctx context.Context) OceanLaunchSpecImportPtrOutput {
	return o.ApplyT(func(v OceanLaunchSpecImport) *OceanLaunchSpecImport {
		return &v
	}).(OceanLaunchSpecImportPtrOutput)
}

type OceanLaunchSpecImportPtrOutput struct {
	*pulumi.OutputState
}

func (OceanLaunchSpecImportPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanLaunchSpecImport)(nil))
}

func (o OceanLaunchSpecImportPtrOutput) ToOceanLaunchSpecImportPtrOutput() OceanLaunchSpecImportPtrOutput {
	return o
}

func (o OceanLaunchSpecImportPtrOutput) ToOceanLaunchSpecImportPtrOutputWithContext(ctx context.Context) OceanLaunchSpecImportPtrOutput {
	return o
}

type OceanLaunchSpecImportArrayOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecImportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]OceanLaunchSpecImport)(nil))
}

func (o OceanLaunchSpecImportArrayOutput) ToOceanLaunchSpecImportArrayOutput() OceanLaunchSpecImportArrayOutput {
	return o
}

func (o OceanLaunchSpecImportArrayOutput) ToOceanLaunchSpecImportArrayOutputWithContext(ctx context.Context) OceanLaunchSpecImportArrayOutput {
	return o
}

func (o OceanLaunchSpecImportArrayOutput) Index(i pulumi.IntInput) OceanLaunchSpecImportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) OceanLaunchSpecImport {
		return vs[0].([]OceanLaunchSpecImport)[vs[1].(int)]
	}).(OceanLaunchSpecImportOutput)
}

type OceanLaunchSpecImportMapOutput struct{ *pulumi.OutputState }

func (OceanLaunchSpecImportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]OceanLaunchSpecImport)(nil))
}

func (o OceanLaunchSpecImportMapOutput) ToOceanLaunchSpecImportMapOutput() OceanLaunchSpecImportMapOutput {
	return o
}

func (o OceanLaunchSpecImportMapOutput) ToOceanLaunchSpecImportMapOutputWithContext(ctx context.Context) OceanLaunchSpecImportMapOutput {
	return o
}

func (o OceanLaunchSpecImportMapOutput) MapIndex(k pulumi.StringInput) OceanLaunchSpecImportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) OceanLaunchSpecImport {
		return vs[0].(map[string]OceanLaunchSpecImport)[vs[1].(string)]
	}).(OceanLaunchSpecImportOutput)
}

func init() {
	pulumi.RegisterOutputType(OceanLaunchSpecImportOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecImportPtrOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecImportArrayOutput{})
	pulumi.RegisterOutputType(OceanLaunchSpecImportMapOutput{})
}
