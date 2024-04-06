// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spotinst Ocean GKE resource.
//
// ## Prerequisites
//
// Installation of the Ocean controller is required by this resource. You can accomplish this by using the spotinst/ocean-controller module as follows:
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
// > You must configure the same `clusterIdentifier` both for the Ocean controller and for the `gke.OceanImport` resource.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/gke"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := gke.NewOceanImport(ctx, "example", &gke.OceanImportArgs{
//				BackendServices: gke.OceanImportBackendServiceArray{
//					&gke.OceanImportBackendServiceArgs{
//						LocationType: pulumi.String("regional"),
//						NamedPorts: gke.OceanImportBackendServiceNamedPortArray{
//							&gke.OceanImportBackendServiceNamedPortArgs{
//								Name: pulumi.String("http"),
//								Ports: pulumi.StringArray{
//									pulumi.String("80"),
//									pulumi.String("8080"),
//								},
//							},
//						},
//						Scheme:      pulumi.String("INTERNAL"),
//						ServiceName: pulumi.String("example-backend-service"),
//					},
//				},
//				ClusterName:         pulumi.String("example-cluster-name"),
//				ControllerClusterId: pulumi.String("example-controller-123124"),
//				DesiredCapacity:     pulumi.Int(0),
//				Location:            pulumi.String("us-central1-a"),
//				MaxSize:             pulumi.Int(2),
//				MinSize:             pulumi.Int(0),
//				RootVolumeType:      pulumi.String("pd-ssd"),
//				ShieldedInstanceConfig: &gke.OceanImportShieldedInstanceConfigArgs{
//					EnableIntegrityMonitoring: pulumi.Bool(true),
//					EnableSecureBoot:          pulumi.Bool(true),
//				},
//				UseAsTemplateOnly: pulumi.Bool(false),
//				Whitelists: pulumi.StringArray{
//					pulumi.String("n1-standard-1"),
//					pulumi.String("n1-standard-2"),
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
// <!--End PulumiCodeChooser -->
//
// ## Strategy
//
// * `strategy` - (Optional) Strategy object.
//   - `drainingTimeout` - (Optional) The draining timeout (in seconds) before terminating the instance. If no draining timeout is defined, the default draining timeout will be used.
//   - `provisioningModel` - (Optional) Define the provisioning model of the launched instances. Valid values: `SPOT`, `PREEMPTIBLE`.
//   - `preemptiblePercentage`- (Optional) Defines the desired preemptible percentage for the cluster.
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
// <a id="update-policy"></a>
// ## Update Policy
//
// * `updatePolicy` - (Optional)
//
//   - `shouldRoll` - (Required) Enables the roll.
//
//   - `conditionedRoll` - (Optional, Default: false) Spot will perform a cluster Roll in accordance with a relevant modification of the cluster’s settings. When set to true , only specific changes in the cluster’s configuration will trigger a cluster roll (such as AMI, Key Pair, user data, instance types, load balancers, etc).
//
//   - `rollConfig` - (Required) Holds the roll configuration.
//
//   - `batchSizePercentage` - (Required) Sets the percentage of the instances to deploy in each batch.
//
//   - `launchSpecIds` - (Optional) List of Virtual Node Group identifiers to be rolled.
//
//   - `batchMinHealthyPercentage` - (Optional) Default: 50. Indicates the threshold of minimum healthy instances in single batch. If the amount of healthy instances in single batch is under the threshold, the cluster roll will fail. If exists, the parameter value will be in range of 1-100. In case of null as value, the default value in the backend will be 50%. Value of param should represent the number in percentage (%) of the batch.
//
//   - `respectPdb` - (Optional) Default: False. During the roll, if the parameter is set to True we honor PDB during the instance replacement.
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
type OceanImport struct {
	pulumi.CustomResourceState

	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanImportAutoscalerOutput `pulumi:"autoscaler"`
	// Describes the backend service configurations.
	BackendServices OceanImportBackendServiceArrayOutput `pulumi:"backendServices"`
	// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
	Blacklists          pulumi.StringArrayOutput `pulumi:"blacklists"`
	ClusterControllerId pulumi.StringOutput      `pulumi:"clusterControllerId"`
	// The GKE cluster name.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringOutput `pulumi:"controllerClusterId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location pulumi.StringOutput `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// The root volume disk type.
	RootVolumeType pulumi.StringPtrOutput `pulumi:"rootVolumeType"`
	// Set scheduling object.
	ScheduledTasks OceanImportScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanImportShieldedInstanceConfigOutput `pulumi:"shieldedInstanceConfig"`
	Strategies             OceanImportStrategyArrayOutput          `pulumi:"strategies"`
	UpdatePolicy           OceanImportUpdatePolicyPtrOutput        `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrOutput `pulumi:"useAsTemplateOnly"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
	Whitelists pulumi.StringArrayOutput `pulumi:"whitelists"`
}

// NewOceanImport registers a new resource with the given unique name, arguments, and options.
func NewOceanImport(ctx *pulumi.Context,
	name string, args *OceanImportArgs, opts ...pulumi.ResourceOption) (*OceanImport, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.Location == nil {
		return nil, errors.New("invalid value for required argument 'Location'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OceanImport
	err := ctx.RegisterResource("spotinst:gke/oceanImport:OceanImport", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanImport gets an existing OceanImport resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanImport(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanImportState, opts ...pulumi.ResourceOption) (*OceanImport, error) {
	var resource OceanImport
	err := ctx.ReadResource("spotinst:gke/oceanImport:OceanImport", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanImport resources.
type oceanImportState struct {
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler *OceanImportAutoscaler `pulumi:"autoscaler"`
	// Describes the backend service configurations.
	BackendServices []OceanImportBackendService `pulumi:"backendServices"`
	// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
	Blacklists          []string `pulumi:"blacklists"`
	ClusterControllerId *string  `pulumi:"clusterControllerId"`
	// The GKE cluster name.
	ClusterName *string `pulumi:"clusterName"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId *string `pulumi:"controllerClusterId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location *string `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// The root volume disk type.
	RootVolumeType *string `pulumi:"rootVolumeType"`
	// Set scheduling object.
	ScheduledTasks []OceanImportScheduledTask `pulumi:"scheduledTasks"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig *OceanImportShieldedInstanceConfig `pulumi:"shieldedInstanceConfig"`
	Strategies             []OceanImportStrategy              `pulumi:"strategies"`
	UpdatePolicy           *OceanImportUpdatePolicy           `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
	Whitelists []string `pulumi:"whitelists"`
}

type OceanImportState struct {
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanImportAutoscalerPtrInput
	// Describes the backend service configurations.
	BackendServices OceanImportBackendServiceArrayInput
	// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
	Blacklists          pulumi.StringArrayInput
	ClusterControllerId pulumi.StringPtrInput
	// The GKE cluster name.
	ClusterName pulumi.StringPtrInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The zone the master cluster is located in.
	Location pulumi.StringPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// The root volume disk type.
	RootVolumeType pulumi.StringPtrInput
	// Set scheduling object.
	ScheduledTasks OceanImportScheduledTaskArrayInput
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanImportShieldedInstanceConfigPtrInput
	Strategies             OceanImportStrategyArrayInput
	UpdatePolicy           OceanImportUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanImportState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanImportState)(nil)).Elem()
}

type oceanImportArgs struct {
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler *OceanImportAutoscaler `pulumi:"autoscaler"`
	// Describes the backend service configurations.
	BackendServices []OceanImportBackendService `pulumi:"backendServices"`
	// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
	Blacklists []string `pulumi:"blacklists"`
	// The GKE cluster name.
	ClusterName string `pulumi:"clusterName"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId *string `pulumi:"controllerClusterId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location string `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// The root volume disk type.
	RootVolumeType *string `pulumi:"rootVolumeType"`
	// Set scheduling object.
	ScheduledTasks []OceanImportScheduledTask `pulumi:"scheduledTasks"`
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig *OceanImportShieldedInstanceConfig `pulumi:"shieldedInstanceConfig"`
	Strategies             []OceanImportStrategy              `pulumi:"strategies"`
	UpdatePolicy           *OceanImportUpdatePolicy           `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
	Whitelists []string `pulumi:"whitelists"`
}

// The set of arguments for constructing a OceanImport resource.
type OceanImportArgs struct {
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanImportAutoscalerPtrInput
	// Describes the backend service configurations.
	BackendServices OceanImportBackendServiceArrayInput
	// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
	Blacklists pulumi.StringArrayInput
	// The GKE cluster name.
	ClusterName pulumi.StringInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The zone the master cluster is located in.
	Location pulumi.StringInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// The root volume disk type.
	RootVolumeType pulumi.StringPtrInput
	// Set scheduling object.
	ScheduledTasks OceanImportScheduledTaskArrayInput
	// The Ocean shielded instance configuration object.
	ShieldedInstanceConfig OceanImportShieldedInstanceConfigPtrInput
	Strategies             OceanImportStrategyArrayInput
	UpdatePolicy           OceanImportUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanImportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanImportArgs)(nil)).Elem()
}

type OceanImportInput interface {
	pulumi.Input

	ToOceanImportOutput() OceanImportOutput
	ToOceanImportOutputWithContext(ctx context.Context) OceanImportOutput
}

func (*OceanImport) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanImport)(nil)).Elem()
}

func (i *OceanImport) ToOceanImportOutput() OceanImportOutput {
	return i.ToOceanImportOutputWithContext(context.Background())
}

func (i *OceanImport) ToOceanImportOutputWithContext(ctx context.Context) OceanImportOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanImportOutput)
}

// OceanImportArrayInput is an input type that accepts OceanImportArray and OceanImportArrayOutput values.
// You can construct a concrete instance of `OceanImportArrayInput` via:
//
//	OceanImportArray{ OceanImportArgs{...} }
type OceanImportArrayInput interface {
	pulumi.Input

	ToOceanImportArrayOutput() OceanImportArrayOutput
	ToOceanImportArrayOutputWithContext(context.Context) OceanImportArrayOutput
}

type OceanImportArray []OceanImportInput

func (OceanImportArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanImport)(nil)).Elem()
}

func (i OceanImportArray) ToOceanImportArrayOutput() OceanImportArrayOutput {
	return i.ToOceanImportArrayOutputWithContext(context.Background())
}

func (i OceanImportArray) ToOceanImportArrayOutputWithContext(ctx context.Context) OceanImportArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanImportArrayOutput)
}

// OceanImportMapInput is an input type that accepts OceanImportMap and OceanImportMapOutput values.
// You can construct a concrete instance of `OceanImportMapInput` via:
//
//	OceanImportMap{ "key": OceanImportArgs{...} }
type OceanImportMapInput interface {
	pulumi.Input

	ToOceanImportMapOutput() OceanImportMapOutput
	ToOceanImportMapOutputWithContext(context.Context) OceanImportMapOutput
}

type OceanImportMap map[string]OceanImportInput

func (OceanImportMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanImport)(nil)).Elem()
}

func (i OceanImportMap) ToOceanImportMapOutput() OceanImportMapOutput {
	return i.ToOceanImportMapOutputWithContext(context.Background())
}

func (i OceanImportMap) ToOceanImportMapOutputWithContext(ctx context.Context) OceanImportMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanImportMapOutput)
}

type OceanImportOutput struct{ *pulumi.OutputState }

func (OceanImportOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OceanImport)(nil)).Elem()
}

func (o OceanImportOutput) ToOceanImportOutput() OceanImportOutput {
	return o
}

func (o OceanImportOutput) ToOceanImportOutputWithContext(ctx context.Context) OceanImportOutput {
	return o
}

// The Ocean Kubernetes Autoscaler object.
func (o OceanImportOutput) Autoscaler() OceanImportAutoscalerOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportAutoscalerOutput { return v.Autoscaler }).(OceanImportAutoscalerOutput)
}

// Describes the backend service configurations.
func (o OceanImportOutput) BackendServices() OceanImportBackendServiceArrayOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportBackendServiceArrayOutput { return v.BackendServices }).(OceanImportBackendServiceArrayOutput)
}

// Instance types to avoid launching in the Ocean cluster. Cannot be configured if whitelist list is configured.
func (o OceanImportOutput) Blacklists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringArrayOutput { return v.Blacklists }).(pulumi.StringArrayOutput)
}

func (o OceanImportOutput) ClusterControllerId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringOutput { return v.ClusterControllerId }).(pulumi.StringOutput)
}

// The GKE cluster name.
func (o OceanImportOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
func (o OceanImportOutput) ControllerClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringOutput { return v.ControllerClusterId }).(pulumi.StringOutput)
}

// The number of instances to launch and maintain in the cluster.
func (o OceanImportOutput) DesiredCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.IntOutput { return v.DesiredCapacity }).(pulumi.IntOutput)
}

// The zone the master cluster is located in.
func (o OceanImportOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The upper limit of instances the cluster can scale up to.
func (o OceanImportOutput) MaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.IntOutput { return v.MaxSize }).(pulumi.IntOutput)
}

// The lower limit of instances the cluster can scale down to.
func (o OceanImportOutput) MinSize() pulumi.IntOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.IntOutput { return v.MinSize }).(pulumi.IntOutput)
}

// The root volume disk type.
func (o OceanImportOutput) RootVolumeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringPtrOutput { return v.RootVolumeType }).(pulumi.StringPtrOutput)
}

// Set scheduling object.
func (o OceanImportOutput) ScheduledTasks() OceanImportScheduledTaskArrayOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportScheduledTaskArrayOutput { return v.ScheduledTasks }).(OceanImportScheduledTaskArrayOutput)
}

// The Ocean shielded instance configuration object.
func (o OceanImportOutput) ShieldedInstanceConfig() OceanImportShieldedInstanceConfigOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportShieldedInstanceConfigOutput { return v.ShieldedInstanceConfig }).(OceanImportShieldedInstanceConfigOutput)
}

func (o OceanImportOutput) Strategies() OceanImportStrategyArrayOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportStrategyArrayOutput { return v.Strategies }).(OceanImportStrategyArrayOutput)
}

func (o OceanImportOutput) UpdatePolicy() OceanImportUpdatePolicyPtrOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportUpdatePolicyPtrOutput { return v.UpdatePolicy }).(OceanImportUpdatePolicyPtrOutput)
}

// launch specification defined on the Ocean object will function only as a template for virtual node groups.
func (o OceanImportOutput) UseAsTemplateOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.BoolPtrOutput { return v.UseAsTemplateOnly }).(pulumi.BoolPtrOutput)
}

// Instance types allowed in the Ocean cluster. Cannot be configured if blacklist list is configured.
func (o OceanImportOutput) Whitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OceanImport) pulumi.StringArrayOutput { return v.Whitelists }).(pulumi.StringArrayOutput)
}

type OceanImportArrayOutput struct{ *pulumi.OutputState }

func (OceanImportArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OceanImport)(nil)).Elem()
}

func (o OceanImportArrayOutput) ToOceanImportArrayOutput() OceanImportArrayOutput {
	return o
}

func (o OceanImportArrayOutput) ToOceanImportArrayOutputWithContext(ctx context.Context) OceanImportArrayOutput {
	return o
}

func (o OceanImportArrayOutput) Index(i pulumi.IntInput) OceanImportOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OceanImport {
		return vs[0].([]*OceanImport)[vs[1].(int)]
	}).(OceanImportOutput)
}

type OceanImportMapOutput struct{ *pulumi.OutputState }

func (OceanImportMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OceanImport)(nil)).Elem()
}

func (o OceanImportMapOutput) ToOceanImportMapOutput() OceanImportMapOutput {
	return o
}

func (o OceanImportMapOutput) ToOceanImportMapOutputWithContext(ctx context.Context) OceanImportMapOutput {
	return o
}

func (o OceanImportMapOutput) MapIndex(k pulumi.StringInput) OceanImportOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OceanImport {
		return vs[0].(map[string]*OceanImport)[vs[1].(string)]
	}).(OceanImportOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OceanImportInput)(nil)).Elem(), &OceanImport{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanImportArrayInput)(nil)).Elem(), OceanImportArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OceanImportMapInput)(nil)).Elem(), OceanImportMap{})
	pulumi.RegisterOutputType(OceanImportOutput{})
	pulumi.RegisterOutputType(OceanImportArrayOutput{})
	pulumi.RegisterOutputType(OceanImportMapOutput{})
}
