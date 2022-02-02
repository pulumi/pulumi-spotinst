// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spotinst Ocean AKS Virtual Node Group resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/azure"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := azure.NewOceanVirtualNodeGroup(ctx, "example", &azure.OceanVirtualNodeGroupArgs{
// 			Autoscales: azure.OceanVirtualNodeGroupAutoscaleArray{
// 				&azure.OceanVirtualNodeGroupAutoscaleArgs{
// 					AutoscaleHeadroom: &azure.OceanVirtualNodeGroupAutoscaleAutoscaleHeadroomArgs{
// 						CpuPerUnit:    pulumi.Int(4),
// 						GpuPerUnit:    pulumi.Int(8),
// 						MemoryPerUnit: pulumi.Int(100),
// 						NumOfUnits:    pulumi.Int(16),
// 					},
// 				},
// 			},
// 			Labels: azure.OceanVirtualNodeGroupLabelArray{
// 				&azure.OceanVirtualNodeGroupLabelArgs{
// 					Key:   pulumi.String("label_key"),
// 					Value: pulumi.String("label_value"),
// 				},
// 			},
// 			LaunchSpecifications: azure.OceanVirtualNodeGroupLaunchSpecificationArray{
// 				&azure.OceanVirtualNodeGroupLaunchSpecificationArgs{
// 					OsDisk: &azure.OceanVirtualNodeGroupLaunchSpecificationOsDiskArgs{
// 						SizeGb: pulumi.Int(100),
// 						Type:   pulumi.String("Standard_LRS"),
// 					},
// 					Tags: azure.OceanVirtualNodeGroupLaunchSpecificationTagArray{
// 						&azure.OceanVirtualNodeGroupLaunchSpecificationTagArgs{
// 							Key:   pulumi.String("label_key"),
// 							Value: pulumi.String("label_value"),
// 						},
// 					},
// 				},
// 			},
// 			OceanId: pulumi.String("o-12345"),
// 			ResourceLimits: azure.OceanVirtualNodeGroupResourceLimitArray{
// 				&azure.OceanVirtualNodeGroupResourceLimitArgs{
// 					MaxInstanceCount: pulumi.Int(4),
// 				},
// 			},
// 			Taints: azure.OceanVirtualNodeGroupTaintArray{
// 				&azure.OceanVirtualNodeGroupTaintArgs{
// 					Effect: pulumi.String("NoSchedule"),
// 					Key:    pulumi.String("taint_key"),
// 					Value:  pulumi.String("taint_value"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanId", spotinst_ocean_aks_.Example.Id)
// 		return nil
// 	})
// }
// ```
type OceanVirtualNodeGroup struct {
	pulumi.CustomResourceState

	// .
	Autoscales OceanVirtualNodeGroupAutoscaleArrayOutput `pulumi:"autoscales"`
	// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Labels OceanVirtualNodeGroupLabelArrayOutput `pulumi:"labels"`
	// .
	LaunchSpecifications OceanVirtualNodeGroupLaunchSpecificationArrayOutput `pulumi:"launchSpecifications"`
	// Set name for the virtual node group.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Ocean cluster ID.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// .
	ResourceLimits OceanVirtualNodeGroupResourceLimitArrayOutput `pulumi:"resourceLimits"`
	// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Taints OceanVirtualNodeGroupTaintArrayOutput `pulumi:"taints"`
}

// NewOceanVirtualNodeGroup registers a new resource with the given unique name, arguments, and options.
func NewOceanVirtualNodeGroup(ctx *pulumi.Context,
	name string, args *OceanVirtualNodeGroupArgs, opts ...pulumi.ResourceOption) (*OceanVirtualNodeGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OceanId == nil {
		return nil, errors.New("invalid value for required argument 'OceanId'")
	}
	var resource OceanVirtualNodeGroup
	err := ctx.RegisterResource("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanVirtualNodeGroup gets an existing OceanVirtualNodeGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanVirtualNodeGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanVirtualNodeGroupState, opts ...pulumi.ResourceOption) (*OceanVirtualNodeGroup, error) {
	var resource OceanVirtualNodeGroup
	err := ctx.ReadResource("spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanVirtualNodeGroup resources.
type oceanVirtualNodeGroupState struct {
	// .
	Autoscales []OceanVirtualNodeGroupAutoscale `pulumi:"autoscales"`
	// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Labels []OceanVirtualNodeGroupLabel `pulumi:"labels"`
	// .
	LaunchSpecifications []OceanVirtualNodeGroupLaunchSpecification `pulumi:"launchSpecifications"`
	// Set name for the virtual node group.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID.
	OceanId *string `pulumi:"oceanId"`
	// .
	ResourceLimits []OceanVirtualNodeGroupResourceLimit `pulumi:"resourceLimits"`
	// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Taints []OceanVirtualNodeGroupTaint `pulumi:"taints"`
}

type OceanVirtualNodeGroupState struct {
	// .
	Autoscales OceanVirtualNodeGroupAutoscaleArrayInput
	// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Labels OceanVirtualNodeGroupLabelArrayInput
	// .
	LaunchSpecifications OceanVirtualNodeGroupLaunchSpecificationArrayInput
	// Set name for the virtual node group.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID.
	OceanId pulumi.StringPtrInput
	// .
	ResourceLimits OceanVirtualNodeGroupResourceLimitArrayInput
	// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Taints OceanVirtualNodeGroupTaintArrayInput
}

func (OceanVirtualNodeGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanVirtualNodeGroupState)(nil)).Elem()
}

type oceanVirtualNodeGroupArgs struct {
	// .
	Autoscales []OceanVirtualNodeGroupAutoscale `pulumi:"autoscales"`
	// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Labels []OceanVirtualNodeGroupLabel `pulumi:"labels"`
	// .
	LaunchSpecifications []OceanVirtualNodeGroupLaunchSpecification `pulumi:"launchSpecifications"`
	// Set name for the virtual node group.
	Name *string `pulumi:"name"`
	// The Ocean cluster ID.
	OceanId string `pulumi:"oceanId"`
	// .
	ResourceLimits []OceanVirtualNodeGroupResourceLimit `pulumi:"resourceLimits"`
	// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Taints []OceanVirtualNodeGroupTaint `pulumi:"taints"`
}

// The set of arguments for constructing a OceanVirtualNodeGroup resource.
type OceanVirtualNodeGroupArgs struct {
	// .
	Autoscales OceanVirtualNodeGroupAutoscaleArrayInput
	// Additional labels for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Labels OceanVirtualNodeGroupLabelArrayInput
	// .
	LaunchSpecifications OceanVirtualNodeGroupLaunchSpecificationArrayInput
	// Set name for the virtual node group.
	Name pulumi.StringPtrInput
	// The Ocean cluster ID.
	OceanId pulumi.StringInput
	// .
	ResourceLimits OceanVirtualNodeGroupResourceLimitArrayInput
	// Additional taints for the virtual node group. Only custom user labels are allowed. Kubernetes built-in labels and Spot internal labels are not allowed.
	Taints OceanVirtualNodeGroupTaintArrayInput
}

func (OceanVirtualNodeGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanVirtualNodeGroupArgs)(nil)).Elem()
}

type OceanVirtualNodeGroupInput interface {
	pulumi.Input

	ToOceanVirtualNodeGroupOutput() OceanVirtualNodeGroupOutput
	ToOceanVirtualNodeGroupOutputWithContext(ctx context.Context) OceanVirtualNodeGroupOutput
}

func (*OceanVirtualNodeGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanVirtualNodeGroup)(nil)).Elem()
}

func (i *OceanVirtualNodeGroup) ToOceanVirtualNodeGroupOutput() OceanVirtualNodeGroupOutput {
	return i.ToOceanVirtualNodeGroupOutputWithContext(context.Background())
}

func (i *OceanVirtualNodeGroup) ToOceanVirtualNodeGroupOutputWithContext(ctx context.Context) OceanVirtualNodeGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanVirtualNodeGroupOutput)
}

// OceanVirtualNodeGroupArrayInput is an input type that accepts OceanVirtualNodeGroupArray and OceanVirtualNodeGroupArrayOutput values.
// You can construct a concrete instance of `OceanVirtualNodeGroupArrayInput` via:
//
//          OceanVirtualNodeGroupArray{ OceanVirtualNodeGroupArgs{...} }
type OceanVirtualNodeGroupArrayInput interface {
	pulumi.Input

	ToOceanVirtualNodeGroupArrayOutput() OceanVirtualNodeGroupArrayOutput
	ToOceanVirtualNodeGroupArrayOutputWithContext(context.Context) OceanVirtualNodeGroupArrayOutput
}

type OceanVirtualNodeGroupArray []OceanVirtualNodeGroupInput

func (OceanVirtualNodeGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanVirtualNodeGroup)(nil)).Elem()
}

func (i OceanVirtualNodeGroupArray) ToOceanVirtualNodeGroupArrayOutput() OceanVirtualNodeGroupArrayOutput {
	return i.ToOceanVirtualNodeGroupArrayOutputWithContext(context.Background())
}

func (i OceanVirtualNodeGroupArray) ToOceanVirtualNodeGroupArrayOutputWithContext(ctx context.Context) OceanVirtualNodeGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanVirtualNodeGroupArrayOutput)
}

// OceanVirtualNodeGroupMapInput is an input type that accepts OceanVirtualNodeGroupMap and OceanVirtualNodeGroupMapOutput values.
// You can construct a concrete instance of `OceanVirtualNodeGroupMapInput` via:
//
//          OceanVirtualNodeGroupMap{ "key": OceanVirtualNodeGroupArgs{...} }
type OceanVirtualNodeGroupMapInput interface {
	pulumi.Input

	ToOceanVirtualNodeGroupMapOutput() OceanVirtualNodeGroupMapOutput
	ToOceanVirtualNodeGroupMapOutputWithContext(context.Context) OceanVirtualNodeGroupMapOutput
}

type OceanVirtualNodeGroupMap map[string]OceanVirtualNodeGroupInput

func (OceanVirtualNodeGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanVirtualNodeGroup)(nil)).Elem()
}

func (i OceanVirtualNodeGroupMap) ToOceanVirtualNodeGroupMapOutput() OceanVirtualNodeGroupMapOutput {
	return i.ToOceanVirtualNodeGroupMapOutputWithContext(context.Background())
}

func (i OceanVirtualNodeGroupMap) ToOceanVirtualNodeGroupMapOutputWithContext(ctx context.Context) OceanVirtualNodeGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanVirtualNodeGroupMapOutput)
}

type OceanVirtualNodeGroupOutput struct{ *pulumi.OutputState }

func (OceanVirtualNodeGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanVirtualNodeGroup)(nil)).Elem()
}

func (o OceanVirtualNodeGroupOutput) ToOceanVirtualNodeGroupOutput() OceanVirtualNodeGroupOutput {
	return o
}

func (o OceanVirtualNodeGroupOutput) ToOceanVirtualNodeGroupOutputWithContext(ctx context.Context) OceanVirtualNodeGroupOutput {
	return o
}

type OceanVirtualNodeGroupArrayOutput struct{ *pulumi.OutputState }

func (OceanVirtualNodeGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanVirtualNodeGroup)(nil)).Elem()
}

func (o OceanVirtualNodeGroupArrayOutput) ToOceanVirtualNodeGroupArrayOutput() OceanVirtualNodeGroupArrayOutput {
	return o
}

func (o OceanVirtualNodeGroupArrayOutput) ToOceanVirtualNodeGroupArrayOutputWithContext(ctx context.Context) OceanVirtualNodeGroupArrayOutput {
	return o
}

func (o OceanVirtualNodeGroupArrayOutput) Index(i pulumi.IntInput) OceanVirtualNodeGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanVirtualNodeGroup {
		return vs[0].([]*OceanVirtualNodeGroup)[vs[1].(int)]
	}).(OceanVirtualNodeGroupOutput)
}

type OceanVirtualNodeGroupMapOutput struct{ *pulumi.OutputState }

func (OceanVirtualNodeGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanVirtualNodeGroup)(nil)).Elem()
}

func (o OceanVirtualNodeGroupMapOutput) ToOceanVirtualNodeGroupMapOutput() OceanVirtualNodeGroupMapOutput {
	return o
}

func (o OceanVirtualNodeGroupMapOutput) ToOceanVirtualNodeGroupMapOutputWithContext(ctx context.Context) OceanVirtualNodeGroupMapOutput {
	return o
}

func (o OceanVirtualNodeGroupMapOutput) MapIndex(k pulumi.StringInput) OceanVirtualNodeGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanVirtualNodeGroup {
		return vs[0].(map[string]*OceanVirtualNodeGroup)[vs[1].(string)]
	}).(OceanVirtualNodeGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanVirtualNodeGroupInput)(nil)).Elem(), &OceanVirtualNodeGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanVirtualNodeGroupArrayInput)(nil)).Elem(), OceanVirtualNodeGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanVirtualNodeGroupMapInput)(nil)).Elem(), OceanVirtualNodeGroupMap{})
	pulumi.RegisterOutputType(OceanVirtualNodeGroupOutput{})
	pulumi.RegisterOutputType(OceanVirtualNodeGroupArrayOutput{})
	pulumi.RegisterOutputType(OceanVirtualNodeGroupMapOutput{})
}
