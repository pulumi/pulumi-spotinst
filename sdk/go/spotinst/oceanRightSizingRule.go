// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spotinst

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type OceanRightSizingRule struct {
	pulumi.CustomResourceState

	AttachWorkloads                         OceanRightSizingRuleAttachWorkloadArrayOutput                         `pulumi:"attachWorkloads"`
	DetachWorkloads                         OceanRightSizingRuleDetachWorkloadArrayOutput                         `pulumi:"detachWorkloads"`
	OceanId                                 pulumi.StringPtrOutput                                                `pulumi:"oceanId"`
	RecommendationApplicationBoundaries     OceanRightSizingRuleRecommendationApplicationBoundaryArrayOutput      `pulumi:"recommendationApplicationBoundaries"`
	RecommendationApplicationIntervals      OceanRightSizingRuleRecommendationApplicationIntervalArrayOutput      `pulumi:"recommendationApplicationIntervals"`
	RecommendationApplicationMinThresholds  OceanRightSizingRuleRecommendationApplicationMinThresholdArrayOutput  `pulumi:"recommendationApplicationMinThresholds"`
	RecommendationApplicationOverheadValues OceanRightSizingRuleRecommendationApplicationOverheadValueArrayOutput `pulumi:"recommendationApplicationOverheadValues"`
	RestartPods                             pulumi.BoolPtrOutput                                                  `pulumi:"restartPods"`
	RuleName                                pulumi.StringOutput                                                   `pulumi:"ruleName"`
}

// NewOceanRightSizingRule registers a new resource with the given unique name, arguments, and options.
func NewOceanRightSizingRule(ctx *pulumi.Context,
	name string, args *OceanRightSizingRuleArgs, opts ...pulumi.ResourceOption) (*OceanRightSizingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RecommendationApplicationIntervals == nil {
		return nil, errors.New("invalid value for required argument 'RecommendationApplicationIntervals'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OceanRightSizingRule
	err := ctx.RegisterResource("spotinst:index/oceanRightSizingRule:OceanRightSizingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanRightSizingRule gets an existing OceanRightSizingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanRightSizingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanRightSizingRuleState, opts ...pulumi.ResourceOption) (*OceanRightSizingRule, error) {
	var resource OceanRightSizingRule
	err := ctx.ReadResource("spotinst:index/oceanRightSizingRule:OceanRightSizingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanRightSizingRule resources.
type oceanRightSizingRuleState struct {
	AttachWorkloads                         []OceanRightSizingRuleAttachWorkload                         `pulumi:"attachWorkloads"`
	DetachWorkloads                         []OceanRightSizingRuleDetachWorkload                         `pulumi:"detachWorkloads"`
	OceanId                                 *string                                                      `pulumi:"oceanId"`
	RecommendationApplicationBoundaries     []OceanRightSizingRuleRecommendationApplicationBoundary      `pulumi:"recommendationApplicationBoundaries"`
	RecommendationApplicationIntervals      []OceanRightSizingRuleRecommendationApplicationInterval      `pulumi:"recommendationApplicationIntervals"`
	RecommendationApplicationMinThresholds  []OceanRightSizingRuleRecommendationApplicationMinThreshold  `pulumi:"recommendationApplicationMinThresholds"`
	RecommendationApplicationOverheadValues []OceanRightSizingRuleRecommendationApplicationOverheadValue `pulumi:"recommendationApplicationOverheadValues"`
	RestartPods                             *bool                                                        `pulumi:"restartPods"`
	RuleName                                *string                                                      `pulumi:"ruleName"`
}

type OceanRightSizingRuleState struct {
	AttachWorkloads                         OceanRightSizingRuleAttachWorkloadArrayInput
	DetachWorkloads                         OceanRightSizingRuleDetachWorkloadArrayInput
	OceanId                                 pulumi.StringPtrInput
	RecommendationApplicationBoundaries     OceanRightSizingRuleRecommendationApplicationBoundaryArrayInput
	RecommendationApplicationIntervals      OceanRightSizingRuleRecommendationApplicationIntervalArrayInput
	RecommendationApplicationMinThresholds  OceanRightSizingRuleRecommendationApplicationMinThresholdArrayInput
	RecommendationApplicationOverheadValues OceanRightSizingRuleRecommendationApplicationOverheadValueArrayInput
	RestartPods                             pulumi.BoolPtrInput
	RuleName                                pulumi.StringPtrInput
}

func (OceanRightSizingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanRightSizingRuleState)(nil)).Elem()
}

type oceanRightSizingRuleArgs struct {
	AttachWorkloads                         []OceanRightSizingRuleAttachWorkload                         `pulumi:"attachWorkloads"`
	DetachWorkloads                         []OceanRightSizingRuleDetachWorkload                         `pulumi:"detachWorkloads"`
	OceanId                                 *string                                                      `pulumi:"oceanId"`
	RecommendationApplicationBoundaries     []OceanRightSizingRuleRecommendationApplicationBoundary      `pulumi:"recommendationApplicationBoundaries"`
	RecommendationApplicationIntervals      []OceanRightSizingRuleRecommendationApplicationInterval      `pulumi:"recommendationApplicationIntervals"`
	RecommendationApplicationMinThresholds  []OceanRightSizingRuleRecommendationApplicationMinThreshold  `pulumi:"recommendationApplicationMinThresholds"`
	RecommendationApplicationOverheadValues []OceanRightSizingRuleRecommendationApplicationOverheadValue `pulumi:"recommendationApplicationOverheadValues"`
	RestartPods                             *bool                                                        `pulumi:"restartPods"`
	RuleName                                string                                                       `pulumi:"ruleName"`
}

// The set of arguments for constructing a OceanRightSizingRule resource.
type OceanRightSizingRuleArgs struct {
	AttachWorkloads                         OceanRightSizingRuleAttachWorkloadArrayInput
	DetachWorkloads                         OceanRightSizingRuleDetachWorkloadArrayInput
	OceanId                                 pulumi.StringPtrInput
	RecommendationApplicationBoundaries     OceanRightSizingRuleRecommendationApplicationBoundaryArrayInput
	RecommendationApplicationIntervals      OceanRightSizingRuleRecommendationApplicationIntervalArrayInput
	RecommendationApplicationMinThresholds  OceanRightSizingRuleRecommendationApplicationMinThresholdArrayInput
	RecommendationApplicationOverheadValues OceanRightSizingRuleRecommendationApplicationOverheadValueArrayInput
	RestartPods                             pulumi.BoolPtrInput
	RuleName                                pulumi.StringInput
}

func (OceanRightSizingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanRightSizingRuleArgs)(nil)).Elem()
}

type OceanRightSizingRuleInput interface {
	pulumi.Input

	ToOceanRightSizingRuleOutput() OceanRightSizingRuleOutput
	ToOceanRightSizingRuleOutputWithContext(ctx context.Context) OceanRightSizingRuleOutput
}

func (*OceanRightSizingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanRightSizingRule)(nil)).Elem()
}

func (i *OceanRightSizingRule) ToOceanRightSizingRuleOutput() OceanRightSizingRuleOutput {
	return i.ToOceanRightSizingRuleOutputWithContext(context.Background())
}

func (i *OceanRightSizingRule) ToOceanRightSizingRuleOutputWithContext(ctx context.Context) OceanRightSizingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanRightSizingRuleOutput)
}

// OceanRightSizingRuleArrayInput is an input type that accepts OceanRightSizingRuleArray and OceanRightSizingRuleArrayOutput values.
// You can construct a concrete instance of `OceanRightSizingRuleArrayInput` via:
//
//	OceanRightSizingRuleArray{ OceanRightSizingRuleArgs{...} }
type OceanRightSizingRuleArrayInput interface {
	pulumi.Input

	ToOceanRightSizingRuleArrayOutput() OceanRightSizingRuleArrayOutput
	ToOceanRightSizingRuleArrayOutputWithContext(context.Context) OceanRightSizingRuleArrayOutput
}

type OceanRightSizingRuleArray []OceanRightSizingRuleInput

func (OceanRightSizingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanRightSizingRule)(nil)).Elem()
}

func (i OceanRightSizingRuleArray) ToOceanRightSizingRuleArrayOutput() OceanRightSizingRuleArrayOutput {
	return i.ToOceanRightSizingRuleArrayOutputWithContext(context.Background())
}

func (i OceanRightSizingRuleArray) ToOceanRightSizingRuleArrayOutputWithContext(ctx context.Context) OceanRightSizingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanRightSizingRuleArrayOutput)
}

// OceanRightSizingRuleMapInput is an input type that accepts OceanRightSizingRuleMap and OceanRightSizingRuleMapOutput values.
// You can construct a concrete instance of `OceanRightSizingRuleMapInput` via:
//
//	OceanRightSizingRuleMap{ "key": OceanRightSizingRuleArgs{...} }
type OceanRightSizingRuleMapInput interface {
	pulumi.Input

	ToOceanRightSizingRuleMapOutput() OceanRightSizingRuleMapOutput
	ToOceanRightSizingRuleMapOutputWithContext(context.Context) OceanRightSizingRuleMapOutput
}

type OceanRightSizingRuleMap map[string]OceanRightSizingRuleInput

func (OceanRightSizingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanRightSizingRule)(nil)).Elem()
}

func (i OceanRightSizingRuleMap) ToOceanRightSizingRuleMapOutput() OceanRightSizingRuleMapOutput {
	return i.ToOceanRightSizingRuleMapOutputWithContext(context.Background())
}

func (i OceanRightSizingRuleMap) ToOceanRightSizingRuleMapOutputWithContext(ctx context.Context) OceanRightSizingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanRightSizingRuleMapOutput)
}

type OceanRightSizingRuleOutput struct{ *pulumi.OutputState }

func (OceanRightSizingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanRightSizingRule)(nil)).Elem()
}

func (o OceanRightSizingRuleOutput) ToOceanRightSizingRuleOutput() OceanRightSizingRuleOutput {
	return o
}

func (o OceanRightSizingRuleOutput) ToOceanRightSizingRuleOutputWithContext(ctx context.Context) OceanRightSizingRuleOutput {
	return o
}

func (o OceanRightSizingRuleOutput) AttachWorkloads() OceanRightSizingRuleAttachWorkloadArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleAttachWorkloadArrayOutput { return v.AttachWorkloads }).(OceanRightSizingRuleAttachWorkloadArrayOutput)
}

func (o OceanRightSizingRuleOutput) DetachWorkloads() OceanRightSizingRuleDetachWorkloadArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleDetachWorkloadArrayOutput { return v.DetachWorkloads }).(OceanRightSizingRuleDetachWorkloadArrayOutput)
}

func (o OceanRightSizingRuleOutput) OceanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) pulumi.StringPtrOutput { return v.OceanId }).(pulumi.StringPtrOutput)
}

func (o OceanRightSizingRuleOutput) RecommendationApplicationBoundaries() OceanRightSizingRuleRecommendationApplicationBoundaryArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleRecommendationApplicationBoundaryArrayOutput {
		return v.RecommendationApplicationBoundaries
	}).(OceanRightSizingRuleRecommendationApplicationBoundaryArrayOutput)
}

func (o OceanRightSizingRuleOutput) RecommendationApplicationIntervals() OceanRightSizingRuleRecommendationApplicationIntervalArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleRecommendationApplicationIntervalArrayOutput {
		return v.RecommendationApplicationIntervals
	}).(OceanRightSizingRuleRecommendationApplicationIntervalArrayOutput)
}

func (o OceanRightSizingRuleOutput) RecommendationApplicationMinThresholds() OceanRightSizingRuleRecommendationApplicationMinThresholdArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleRecommendationApplicationMinThresholdArrayOutput {
		return v.RecommendationApplicationMinThresholds
	}).(OceanRightSizingRuleRecommendationApplicationMinThresholdArrayOutput)
}

func (o OceanRightSizingRuleOutput) RecommendationApplicationOverheadValues() OceanRightSizingRuleRecommendationApplicationOverheadValueArrayOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) OceanRightSizingRuleRecommendationApplicationOverheadValueArrayOutput {
		return v.RecommendationApplicationOverheadValues
	}).(OceanRightSizingRuleRecommendationApplicationOverheadValueArrayOutput)
}

func (o OceanRightSizingRuleOutput) RestartPods() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) pulumi.BoolPtrOutput { return v.RestartPods }).(pulumi.BoolPtrOutput)
}

func (o OceanRightSizingRuleOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanRightSizingRule) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

type OceanRightSizingRuleArrayOutput struct{ *pulumi.OutputState }

func (OceanRightSizingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanRightSizingRule)(nil)).Elem()
}

func (o OceanRightSizingRuleArrayOutput) ToOceanRightSizingRuleArrayOutput() OceanRightSizingRuleArrayOutput {
	return o
}

func (o OceanRightSizingRuleArrayOutput) ToOceanRightSizingRuleArrayOutputWithContext(ctx context.Context) OceanRightSizingRuleArrayOutput {
	return o
}

func (o OceanRightSizingRuleArrayOutput) Index(i pulumi.IntInput) OceanRightSizingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanRightSizingRule {
		return vs[0].([]*OceanRightSizingRule)[vs[1].(int)]
	}).(OceanRightSizingRuleOutput)
}

type OceanRightSizingRuleMapOutput struct{ *pulumi.OutputState }

func (OceanRightSizingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanRightSizingRule)(nil)).Elem()
}

func (o OceanRightSizingRuleMapOutput) ToOceanRightSizingRuleMapOutput() OceanRightSizingRuleMapOutput {
	return o
}

func (o OceanRightSizingRuleMapOutput) ToOceanRightSizingRuleMapOutputWithContext(ctx context.Context) OceanRightSizingRuleMapOutput {
	return o
}

func (o OceanRightSizingRuleMapOutput) MapIndex(k pulumi.StringInput) OceanRightSizingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanRightSizingRule {
		return vs[0].(map[string]*OceanRightSizingRule)[vs[1].(string)]
	}).(OceanRightSizingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanRightSizingRuleInput)(nil)).Elem(), &OceanRightSizingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanRightSizingRuleArrayInput)(nil)).Elem(), OceanRightSizingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanRightSizingRuleMapInput)(nil)).Elem(), OceanRightSizingRuleMap{})
	pulumi.RegisterOutputType(OceanRightSizingRuleOutput{})
	pulumi.RegisterOutputType(OceanRightSizingRuleArrayOutput{})
	pulumi.RegisterOutputType(OceanRightSizingRuleMapOutput{})
}