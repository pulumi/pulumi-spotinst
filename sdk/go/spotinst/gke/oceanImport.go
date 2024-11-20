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

// ## Example Usage
//
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
//				ClusterName:         pulumi.String("example-cluster-name"),
//				ControllerClusterId: pulumi.String("example-controller-123124"),
//				Location:            pulumi.String("us-central1-a"),
//				MinSize:             pulumi.Int(0),
//				MaxSize:             pulumi.Int(2),
//				DesiredCapacity:     pulumi.Int(0),
//				Whitelists: pulumi.StringArray{
//					pulumi.String("n1-standard-1"),
//					pulumi.String("n1-standard-2"),
//				},
//				Filters: &gke.OceanImportFiltersArgs{
//					ExcludeFamilies: pulumi.StringArray{
//						pulumi.String("n2"),
//					},
//					IncludeFamilies: pulumi.StringArray{
//						pulumi.String("c2"),
//						pulumi.String("c3"),
//					},
//					MinMemoryGib: pulumi.Float64(8),
//					MaxMemoryGib: pulumi.Float64(16),
//					MinVcpu:      pulumi.Int(2),
//					MaxVcpu:      pulumi.Int(16),
//				},
//				BackendServices: gke.OceanImportBackendServiceArray{
//					&gke.OceanImportBackendServiceArgs{
//						ServiceName:  pulumi.String("example-backend-service"),
//						LocationType: pulumi.String("regional"),
//						Scheme:       pulumi.String("INTERNAL"),
//						NamedPorts: gke.OceanImportBackendServiceNamedPortArray{
//							&gke.OceanImportBackendServiceNamedPortArgs{
//								Name: pulumi.String("http"),
//								Ports: pulumi.StringArray{
//									pulumi.String("80"),
//									pulumi.String("8080"),
//								},
//							},
//						},
//					},
//				},
//				RootVolumeType: pulumi.String("pd-ssd"),
//				ShieldedInstanceConfig: &gke.OceanImportShieldedInstanceConfigArgs{
//					EnableSecureBoot:          pulumi.Bool(true),
//					EnableIntegrityMonitoring: pulumi.Bool(true),
//				},
//				UseAsTemplateOnly: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
	Filters OceanImportFiltersPtrOutput `pulumi:"filters"`
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
	// Strategy object.
	Strategies   OceanImportStrategyArrayOutput   `pulumi:"strategies"`
	UpdatePolicy OceanImportUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
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
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
	Filters *OceanImportFilters `pulumi:"filters"`
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
	// Strategy object.
	Strategies   []OceanImportStrategy    `pulumi:"strategies"`
	UpdatePolicy *OceanImportUpdatePolicy `pulumi:"updatePolicy"`
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
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
	Filters OceanImportFiltersPtrInput
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
	// Strategy object.
	Strategies   OceanImportStrategyArrayInput
	UpdatePolicy OceanImportUpdatePolicyPtrInput
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
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
	Filters *OceanImportFilters `pulumi:"filters"`
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
	// Strategy object.
	Strategies   []OceanImportStrategy    `pulumi:"strategies"`
	UpdatePolicy *OceanImportUpdatePolicy `pulumi:"updatePolicy"`
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
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
	Filters OceanImportFiltersPtrInput
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
	// Strategy object.
	Strategies   OceanImportStrategyArrayInput
	UpdatePolicy OceanImportUpdatePolicyPtrInput
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

// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with whitelist/blacklist.
func (o OceanImportOutput) Filters() OceanImportFiltersPtrOutput {
	return o.ApplyT(func(v *OceanImport) OceanImportFiltersPtrOutput { return v.Filters }).(OceanImportFiltersPtrOutput)
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

// Strategy object.
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
