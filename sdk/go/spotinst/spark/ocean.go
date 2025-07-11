// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package spark

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spotinst Ocean Spark resource on AWS or GCP.
//
// ## Prerequisites
//
// An existing Ocean cluster is required by this resource. See e.g. the `aws.Ocean` resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/spark"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := spark.NewOcean(ctx, "example", &spark.OceanArgs{
//				OceanClusterId: pulumi.String("ocean-cluster-id"),
//				Ingress: &spark.OceanIngressArgs{
//					Controller: &spark.OceanIngressControllerArgs{
//						Managed: pulumi.Bool(true),
//					},
//					LoadBalancer: &spark.OceanIngressLoadBalancerArgs{
//						Managed:        pulumi.Bool(true),
//						TargetGroupArn: pulumi.String("arn:aws:elasticloadbalancing:eu-north-1:XXXXXXXXXXXX:targetgroup/my-spark-cluster-nlb-tg/a38c2b83XXXXXXXX"),
//						ServiceAnnotations: pulumi.StringMap{
//							"service.beta.kubernetes.io/aws-load-balancer-security-groups": pulumi.String("sg-XXXXXXXXXXXXXXXXX"),
//							"some-service-annotation-2":                                    pulumi.String("some-service-annotation-value-2"),
//						},
//					},
//					CustomEndpoint: &spark.OceanIngressCustomEndpointArgs{
//						Enabled: pulumi.Bool(false),
//						Address: pulumi.String("my-spark-cluster-nlb-8cbb8da7XXXXXXXX.elb.us-east-1.amazonaws.com"),
//					},
//					PrivateLink: &spark.OceanIngressPrivateLinkArgs{
//						Enabled:            pulumi.Bool(false),
//						VpcEndpointService: pulumi.String("com.amazonaws.vpce.eu-north-1.vpce-svc-XXXXXXXXXXXXXXXXX"),
//					},
//				},
//				Compute: &spark.OceanComputeArgs{
//					CreateVngs: pulumi.Bool(true),
//					UseTaints:  pulumi.Bool(true),
//				},
//				LogCollection: &spark.OceanLogCollectionArgs{
//					CollectAppLogs: pulumi.Bool(true),
//				},
//				Webhook: &spark.OceanWebhookArgs{
//					UseHostNetwork: pulumi.Bool(false),
//					HostNetworkPorts: pulumi.IntArray{
//						pulumi.Int(25554),
//					},
//				},
//				Spark: &spark.OceanSparkArgs{
//					AdditionalAppNamespaces: pulumi.StringArray{
//						pulumi.String("extra-spark-app-ns-1"),
//						pulumi.String("extra-spark-app-ns-2"),
//					},
//				},
//				Workspaces: &spark.OceanWorkspacesArgs{
//					Storage: &spark.OceanWorkspacesStorageArgs{
//						Defaults: &spark.OceanWorkspacesStorageDefaultsArgs{
//							StorageClassName: pulumi.String("my-custom-storage-class"),
//						},
//					},
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
type Ocean struct {
	pulumi.CustomResourceState

	Compute       OceanComputeOutput       `pulumi:"compute"`
	Ingress       OceanIngressOutput       `pulumi:"ingress"`
	LogCollection OceanLogCollectionOutput `pulumi:"logCollection"`
	// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
	OceanClusterId pulumi.StringOutput   `pulumi:"oceanClusterId"`
	Spark          OceanSparkOutput      `pulumi:"spark"`
	Webhook        OceanWebhookOutput    `pulumi:"webhook"`
	Workspaces     OceanWorkspacesOutput `pulumi:"workspaces"`
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOption) (*Ocean, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OceanClusterId == nil {
		return nil, errors.New("invalid value for required argument 'OceanClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ocean
	err := ctx.RegisterResource("spotinst:spark/ocean:Ocean", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOcean gets an existing Ocean resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOcean(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanState, opts ...pulumi.ResourceOption) (*Ocean, error) {
	var resource Ocean
	err := ctx.ReadResource("spotinst:spark/ocean:Ocean", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ocean resources.
type oceanState struct {
	Compute       *OceanCompute       `pulumi:"compute"`
	Ingress       *OceanIngress       `pulumi:"ingress"`
	LogCollection *OceanLogCollection `pulumi:"logCollection"`
	// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
	OceanClusterId *string          `pulumi:"oceanClusterId"`
	Spark          *OceanSpark      `pulumi:"spark"`
	Webhook        *OceanWebhook    `pulumi:"webhook"`
	Workspaces     *OceanWorkspaces `pulumi:"workspaces"`
}

type OceanState struct {
	Compute       OceanComputePtrInput
	Ingress       OceanIngressPtrInput
	LogCollection OceanLogCollectionPtrInput
	// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
	OceanClusterId pulumi.StringPtrInput
	Spark          OceanSparkPtrInput
	Webhook        OceanWebhookPtrInput
	Workspaces     OceanWorkspacesPtrInput
}

func (OceanState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanState)(nil)).Elem()
}

type oceanArgs struct {
	Compute       *OceanCompute       `pulumi:"compute"`
	Ingress       *OceanIngress       `pulumi:"ingress"`
	LogCollection *OceanLogCollection `pulumi:"logCollection"`
	// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
	OceanClusterId string           `pulumi:"oceanClusterId"`
	Spark          *OceanSpark      `pulumi:"spark"`
	Webhook        *OceanWebhook    `pulumi:"webhook"`
	Workspaces     *OceanWorkspaces `pulumi:"workspaces"`
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	Compute       OceanComputePtrInput
	Ingress       OceanIngressPtrInput
	LogCollection OceanLogCollectionPtrInput
	// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
	OceanClusterId pulumi.StringInput
	Spark          OceanSparkPtrInput
	Webhook        OceanWebhookPtrInput
	Workspaces     OceanWorkspacesPtrInput
}

func (OceanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanArgs)(nil)).Elem()
}

type OceanInput interface {
	pulumi.Input

	ToOceanOutput() OceanOutput
	ToOceanOutputWithContext(ctx context.Context) OceanOutput
}

func (*Ocean) ElementType() reflect.Type {
	return reflect.TypeOf((**Ocean)(nil)).Elem()
}

func (i *Ocean) ToOceanOutput() OceanOutput {
	return i.ToOceanOutputWithContext(context.Background())
}

func (i *Ocean) ToOceanOutputWithContext(ctx context.Context) OceanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanOutput)
}

// OceanArrayInput is an input type that accepts OceanArray and OceanArrayOutput values.
// You can construct a concrete instance of `OceanArrayInput` via:
//
//	OceanArray{ OceanArgs{...} }
type OceanArrayInput interface {
	pulumi.Input

	ToOceanArrayOutput() OceanArrayOutput
	ToOceanArrayOutputWithContext(context.Context) OceanArrayOutput
}

type OceanArray []OceanInput

func (OceanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ocean)(nil)).Elem()
}

func (i OceanArray) ToOceanArrayOutput() OceanArrayOutput {
	return i.ToOceanArrayOutputWithContext(context.Background())
}

func (i OceanArray) ToOceanArrayOutputWithContext(ctx context.Context) OceanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanArrayOutput)
}

// OceanMapInput is an input type that accepts OceanMap and OceanMapOutput values.
// You can construct a concrete instance of `OceanMapInput` via:
//
//	OceanMap{ "key": OceanArgs{...} }
type OceanMapInput interface {
	pulumi.Input

	ToOceanMapOutput() OceanMapOutput
	ToOceanMapOutputWithContext(context.Context) OceanMapOutput
}

type OceanMap map[string]OceanInput

func (OceanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ocean)(nil)).Elem()
}

func (i OceanMap) ToOceanMapOutput() OceanMapOutput {
	return i.ToOceanMapOutputWithContext(context.Background())
}

func (i OceanMap) ToOceanMapOutputWithContext(ctx context.Context) OceanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanMapOutput)
}

type OceanOutput struct{ *pulumi.OutputState }

func (OceanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ocean)(nil)).Elem()
}

func (o OceanOutput) ToOceanOutput() OceanOutput {
	return o
}

func (o OceanOutput) ToOceanOutputWithContext(ctx context.Context) OceanOutput {
	return o
}

func (o OceanOutput) Compute() OceanComputeOutput {
	return o.ApplyT(func(v *Ocean) OceanComputeOutput { return v.Compute }).(OceanComputeOutput)
}

func (o OceanOutput) Ingress() OceanIngressOutput {
	return o.ApplyT(func(v *Ocean) OceanIngressOutput { return v.Ingress }).(OceanIngressOutput)
}

func (o OceanOutput) LogCollection() OceanLogCollectionOutput {
	return o.ApplyT(func(v *Ocean) OceanLogCollectionOutput { return v.LogCollection }).(OceanLogCollectionOutput)
}

// - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
func (o OceanOutput) OceanClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.OceanClusterId }).(pulumi.StringOutput)
}

func (o OceanOutput) Spark() OceanSparkOutput {
	return o.ApplyT(func(v *Ocean) OceanSparkOutput { return v.Spark }).(OceanSparkOutput)
}

func (o OceanOutput) Webhook() OceanWebhookOutput {
	return o.ApplyT(func(v *Ocean) OceanWebhookOutput { return v.Webhook }).(OceanWebhookOutput)
}

func (o OceanOutput) Workspaces() OceanWorkspacesOutput {
	return o.ApplyT(func(v *Ocean) OceanWorkspacesOutput { return v.Workspaces }).(OceanWorkspacesOutput)
}

type OceanArrayOutput struct{ *pulumi.OutputState }

func (OceanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ocean)(nil)).Elem()
}

func (o OceanArrayOutput) ToOceanArrayOutput() OceanArrayOutput {
	return o
}

func (o OceanArrayOutput) ToOceanArrayOutputWithContext(ctx context.Context) OceanArrayOutput {
	return o
}

func (o OceanArrayOutput) Index(i pulumi.IntInput) OceanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ocean {
		return vs[0].([]*Ocean)[vs[1].(int)]
	}).(OceanOutput)
}

type OceanMapOutput struct{ *pulumi.OutputState }

func (OceanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ocean)(nil)).Elem()
}

func (o OceanMapOutput) ToOceanMapOutput() OceanMapOutput {
	return o
}

func (o OceanMapOutput) ToOceanMapOutputWithContext(ctx context.Context) OceanMapOutput {
	return o
}

func (o OceanMapOutput) MapIndex(k pulumi.StringInput) OceanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ocean {
		return vs[0].(map[string]*Ocean)[vs[1].(string)]
	}).(OceanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanInput)(nil)).Elem(), &Ocean{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanArrayInput)(nil)).Elem(), OceanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanMapInput)(nil)).Elem(), OceanMap{})
	pulumi.RegisterOutputType(OceanOutput{})
	pulumi.RegisterOutputType(OceanArrayOutput{})
	pulumi.RegisterOutputType(OceanMapOutput{})
}
