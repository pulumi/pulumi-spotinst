// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst Data Integration resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spotinst.NewDataIntegration(ctx, "example", &spotinst.DataIntegrationArgs{
//				Name:   pulumi.String("foo"),
//				Status: pulumi.String("enabled"),
//				S3: &spotinst.DataIntegrationS3Args{
//					BucketName: pulumi.String("terraform-test-do-not-delete"),
//					Subdir:     pulumi.String("terraform-test-data-integration"),
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
type DataIntegration struct {
	pulumi.CustomResourceState

	// The name of the data integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// When vendor value is s3, the following fields are included:
	// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
	S3 DataIntegrationS3PtrOutput `pulumi:"s3"`
	// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
	Status pulumi.StringPtrOutput `pulumi:"status"`
}

// NewDataIntegration registers a new resource with the given unique name, arguments, and options.
func NewDataIntegration(ctx *pulumi.Context,
	name string, args *DataIntegrationArgs, opts ...pulumi.ResourceOption) (*DataIntegration, error) {
	if args == nil {
		args = &DataIntegrationArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DataIntegration
	err := ctx.RegisterResource("spotinst:index/dataIntegration:DataIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataIntegration gets an existing DataIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataIntegrationState, opts ...pulumi.ResourceOption) (*DataIntegration, error) {
	var resource DataIntegration
	err := ctx.ReadResource("spotinst:index/dataIntegration:DataIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataIntegration resources.
type dataIntegrationState struct {
	// The name of the data integration.
	Name *string `pulumi:"name"`
	// When vendor value is s3, the following fields are included:
	// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
	S3 *DataIntegrationS3 `pulumi:"s3"`
	// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
	Status *string `pulumi:"status"`
}

type DataIntegrationState struct {
	// The name of the data integration.
	Name pulumi.StringPtrInput
	// When vendor value is s3, the following fields are included:
	// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
	S3 DataIntegrationS3PtrInput
	// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
	Status pulumi.StringPtrInput
}

func (DataIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataIntegrationState)(nil)).Elem()
}

type dataIntegrationArgs struct {
	// The name of the data integration.
	Name *string `pulumi:"name"`
	// When vendor value is s3, the following fields are included:
	// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
	S3 *DataIntegrationS3 `pulumi:"s3"`
	// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
	Status *string `pulumi:"status"`
}

// The set of arguments for constructing a DataIntegration resource.
type DataIntegrationArgs struct {
	// The name of the data integration.
	Name pulumi.StringPtrInput
	// When vendor value is s3, the following fields are included:
	// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
	S3 DataIntegrationS3PtrInput
	// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
	Status pulumi.StringPtrInput
}

func (DataIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataIntegrationArgs)(nil)).Elem()
}

type DataIntegrationInput interface {
	pulumi.Input

	ToDataIntegrationOutput() DataIntegrationOutput
	ToDataIntegrationOutputWithContext(ctx context.Context) DataIntegrationOutput
}

func (*DataIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**DataIntegration)(nil)).Elem()
}

func (i *DataIntegration) ToDataIntegrationOutput() DataIntegrationOutput {
	return i.ToDataIntegrationOutputWithContext(context.Background())
}

func (i *DataIntegration) ToDataIntegrationOutputWithContext(ctx context.Context) DataIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIntegrationOutput)
}

// DataIntegrationArrayInput is an input type that accepts DataIntegrationArray and DataIntegrationArrayOutput values.
// You can construct a concrete instance of `DataIntegrationArrayInput` via:
//
//	DataIntegrationArray{ DataIntegrationArgs{...} }
type DataIntegrationArrayInput interface {
	pulumi.Input

	ToDataIntegrationArrayOutput() DataIntegrationArrayOutput
	ToDataIntegrationArrayOutputWithContext(context.Context) DataIntegrationArrayOutput
}

type DataIntegrationArray []DataIntegrationInput

func (DataIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataIntegration)(nil)).Elem()
}

func (i DataIntegrationArray) ToDataIntegrationArrayOutput() DataIntegrationArrayOutput {
	return i.ToDataIntegrationArrayOutputWithContext(context.Background())
}

func (i DataIntegrationArray) ToDataIntegrationArrayOutputWithContext(ctx context.Context) DataIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIntegrationArrayOutput)
}

// DataIntegrationMapInput is an input type that accepts DataIntegrationMap and DataIntegrationMapOutput values.
// You can construct a concrete instance of `DataIntegrationMapInput` via:
//
//	DataIntegrationMap{ "key": DataIntegrationArgs{...} }
type DataIntegrationMapInput interface {
	pulumi.Input

	ToDataIntegrationMapOutput() DataIntegrationMapOutput
	ToDataIntegrationMapOutputWithContext(context.Context) DataIntegrationMapOutput
}

type DataIntegrationMap map[string]DataIntegrationInput

func (DataIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataIntegration)(nil)).Elem()
}

func (i DataIntegrationMap) ToDataIntegrationMapOutput() DataIntegrationMapOutput {
	return i.ToDataIntegrationMapOutputWithContext(context.Background())
}

func (i DataIntegrationMap) ToDataIntegrationMapOutputWithContext(ctx context.Context) DataIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataIntegrationMapOutput)
}

type DataIntegrationOutput struct{ *pulumi.OutputState }

func (DataIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataIntegration)(nil)).Elem()
}

func (o DataIntegrationOutput) ToDataIntegrationOutput() DataIntegrationOutput {
	return o
}

func (o DataIntegrationOutput) ToDataIntegrationOutputWithContext(ctx context.Context) DataIntegrationOutput {
	return o
}

// The name of the data integration.
func (o DataIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// When vendor value is s3, the following fields are included:
// * `bucketName` - (Required) The name of the bucket to use. Your spot IAM Role policy needs to include s3:putObject permissions for this bucket. Can't be null.
func (o DataIntegrationOutput) S3() DataIntegrationS3PtrOutput {
	return o.ApplyT(func(v *DataIntegration) DataIntegrationS3PtrOutput { return v.S3 }).(DataIntegrationS3PtrOutput)
}

// Determines if this data integration is on or off. Valid values: `"enabled"`, `"disabled"`
func (o DataIntegrationOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataIntegration) pulumi.StringPtrOutput { return v.Status }).(pulumi.StringPtrOutput)
}

type DataIntegrationArrayOutput struct{ *pulumi.OutputState }

func (DataIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataIntegration)(nil)).Elem()
}

func (o DataIntegrationArrayOutput) ToDataIntegrationArrayOutput() DataIntegrationArrayOutput {
	return o
}

func (o DataIntegrationArrayOutput) ToDataIntegrationArrayOutputWithContext(ctx context.Context) DataIntegrationArrayOutput {
	return o
}

func (o DataIntegrationArrayOutput) Index(i pulumi.IntInput) DataIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataIntegration {
		return vs[0].([]*DataIntegration)[vs[1].(int)]
	}).(DataIntegrationOutput)
}

type DataIntegrationMapOutput struct{ *pulumi.OutputState }

func (DataIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataIntegration)(nil)).Elem()
}

func (o DataIntegrationMapOutput) ToDataIntegrationMapOutput() DataIntegrationMapOutput {
	return o
}

func (o DataIntegrationMapOutput) ToDataIntegrationMapOutputWithContext(ctx context.Context) DataIntegrationMapOutput {
	return o
}

func (o DataIntegrationMapOutput) MapIndex(k pulumi.StringInput) DataIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataIntegration {
		return vs[0].(map[string]*DataIntegration)[vs[1].(string)]
	}).(DataIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataIntegrationInput)(nil)).Elem(), &DataIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataIntegrationArrayInput)(nil)).Elem(), DataIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataIntegrationMapInput)(nil)).Elem(), DataIntegrationMap{})
	pulumi.RegisterOutputType(DataIntegrationOutput{})
	pulumi.RegisterOutputType(DataIntegrationArrayOutput{})
	pulumi.RegisterOutputType(DataIntegrationMapOutput{})
}
