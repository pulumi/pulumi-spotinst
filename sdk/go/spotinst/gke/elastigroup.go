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

// Provides a Spotinst Elastigroup GKE resource. Please see [Importing a GKE cluster](https://api.spotinst.com/elastigroup-for-google-cloud/tutorials/import-a-gke-cluster-as-an-elastigroup/) for detailed information.
//
// ## Example Usage
//
// A gke.Elastigroup supports all of the fields defined in spotinst_elastigroup_gcp.
//
// There are two main differences:
//
// * you must include `clusterZoneName` and `clusterId`
// * a handful of parameters are created remotely and will not appear in the diff. A complete list can be found below.
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
//			_, err := gke.NewElastigroup(ctx, "example-gke-elastigroup", &gke.ElastigroupArgs{
//				BackendServices: gke.ElastigroupBackendServiceArray{
//					&gke.ElastigroupBackendServiceArgs{
//						LocationType: pulumi.String("global"),
//						NamedPorts: gke.ElastigroupBackendServiceNamedPortArray{
//							&gke.ElastigroupBackendServiceNamedPortArgs{
//								Name: pulumi.String("http"),
//								Ports: pulumi.StringArray{
//									pulumi.String("80"),
//									pulumi.String("8080"),
//								},
//							},
//						},
//						ServiceName: pulumi.String("backend-service"),
//					},
//				},
//				ClusterZoneName:       pulumi.String("us-central1-a"),
//				DesiredCapacity:       pulumi.Int(3),
//				InstanceTypesOndemand: pulumi.String("n1-standard-1"),
//				InstanceTypesPreemptibles: pulumi.StringArray{
//					pulumi.String("n1-standard-1"),
//					pulumi.String("n1-standard-2"),
//				},
//				IntegrationGke: &gke.ElastigroupIntegrationGkeArgs{
//					AutoscaleCooldown: pulumi.Int(300),
//					AutoscaleDown: &gke.ElastigroupIntegrationGkeAutoscaleDownArgs{
//						EvaluationPeriods: pulumi.Int(300),
//					},
//					AutoscaleHeadroom: &gke.ElastigroupIntegrationGkeAutoscaleHeadroomArgs{
//						CpuPerUnit:    pulumi.Int(1024),
//						MemoryPerUnit: pulumi.Int(512),
//						NumOfUnits:    pulumi.Int(2),
//					},
//					AutoscaleIsAutoConfig: pulumi.Bool(false),
//					AutoscaleIsEnabled:    pulumi.Bool(true),
//					AutoscaleLabels: gke.ElastigroupIntegrationGkeAutoscaleLabelArray{
//						&gke.ElastigroupIntegrationGkeAutoscaleLabelArgs{
//							Key:   pulumi.String("label_key"),
//							Value: pulumi.String("label_value"),
//						},
//					},
//					ClusterId: pulumi.String("example-cluster-id"),
//					Location:  pulumi.String("us-central1-a"),
//				},
//				MaxSize:               pulumi.Int(5),
//				MinSize:               pulumi.Int(1),
//				NodeImage:             pulumi.String("COS"),
//				PreemptiblePercentage: pulumi.Int(100),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Elastigroup struct {
	pulumi.CustomResourceState

	BackendServices ElastigroupBackendServiceArrayOutput `pulumi:"backendServices"`
	// The name of the GKE cluster you wish to import.
	//
	// Deprecated: Please define clusterId under integration_gke
	ClusterId pulumi.StringPtrOutput `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringOutput                        `pulumi:"clusterZoneName"`
	DesiredCapacity           pulumi.IntOutput                           `pulumi:"desiredCapacity"`
	Disks                     ElastigroupDiskArrayOutput                 `pulumi:"disks"`
	DrainingTimeout           pulumi.IntPtrOutput                        `pulumi:"drainingTimeout"`
	FallbackToOndemand        pulumi.BoolPtrOutput                       `pulumi:"fallbackToOndemand"`
	Gpu                       ElastigroupGpuArrayOutput                  `pulumi:"gpu"`
	InstanceNamePrefix        pulumi.StringPtrOutput                     `pulumi:"instanceNamePrefix"`
	InstanceTypesCustoms      ElastigroupInstanceTypesCustomArrayOutput  `pulumi:"instanceTypesCustoms"`
	InstanceTypesOndemand     pulumi.StringPtrOutput                     `pulumi:"instanceTypesOndemand"`
	InstanceTypesPreemptibles pulumi.StringArrayOutput                   `pulumi:"instanceTypesPreemptibles"`
	IntegrationDockerSwarm    ElastigroupIntegrationDockerSwarmPtrOutput `pulumi:"integrationDockerSwarm"`
	// Describes the GKE integration.
	IntegrationGke    ElastigroupIntegrationGkePtrOutput     `pulumi:"integrationGke"`
	IpForwarding      pulumi.BoolPtrOutput                   `pulumi:"ipForwarding"`
	Labels            ElastigroupLabelArrayOutput            `pulumi:"labels"`
	MaxSize           pulumi.IntOutput                       `pulumi:"maxSize"`
	Metadatas         ElastigroupMetadataArrayOutput         `pulumi:"metadatas"`
	MinSize           pulumi.IntOutput                       `pulumi:"minSize"`
	Name              pulumi.StringOutput                    `pulumi:"name"`
	NetworkInterfaces ElastigroupNetworkInterfaceArrayOutput `pulumi:"networkInterfaces"`
	// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
	NodeImage             pulumi.StringPtrOutput                  `pulumi:"nodeImage"`
	OndemandCount         pulumi.IntPtrOutput                     `pulumi:"ondemandCount"`
	PreemptiblePercentage pulumi.IntPtrOutput                     `pulumi:"preemptiblePercentage"`
	ProvisioningModel     pulumi.StringPtrOutput                  `pulumi:"provisioningModel"`
	ScalingDownPolicies   ElastigroupScalingDownPolicyArrayOutput `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies     ElastigroupScalingUpPolicyArrayOutput   `pulumi:"scalingUpPolicies"`
	ServiceAccount        pulumi.StringPtrOutput                  `pulumi:"serviceAccount"`
	ShutdownScript        pulumi.StringPtrOutput                  `pulumi:"shutdownScript"`
	StartupScript         pulumi.StringPtrOutput                  `pulumi:"startupScript"`
	Tags                  pulumi.StringArrayOutput                `pulumi:"tags"`
}

// NewElastigroup registers a new resource with the given unique name, arguments, and options.
func NewElastigroup(ctx *pulumi.Context,
	name string, args *ElastigroupArgs, opts ...pulumi.ResourceOption) (*Elastigroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterZoneName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterZoneName'")
	}
	if args.DesiredCapacity == nil {
		return nil, errors.New("invalid value for required argument 'DesiredCapacity'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Elastigroup
	err := ctx.RegisterResource("spotinst:gke/elastigroup:Elastigroup", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:gke/elastigroup:Elastigroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Elastigroup resources.
type elastigroupState struct {
	BackendServices []ElastigroupBackendService `pulumi:"backendServices"`
	// The name of the GKE cluster you wish to import.
	//
	// Deprecated: Please define clusterId under integration_gke
	ClusterId *string `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           *string                            `pulumi:"clusterZoneName"`
	DesiredCapacity           *int                               `pulumi:"desiredCapacity"`
	Disks                     []ElastigroupDisk                  `pulumi:"disks"`
	DrainingTimeout           *int                               `pulumi:"drainingTimeout"`
	FallbackToOndemand        *bool                              `pulumi:"fallbackToOndemand"`
	Gpu                       []ElastigroupGpu                   `pulumi:"gpu"`
	InstanceNamePrefix        *string                            `pulumi:"instanceNamePrefix"`
	InstanceTypesCustoms      []ElastigroupInstanceTypesCustom   `pulumi:"instanceTypesCustoms"`
	InstanceTypesOndemand     *string                            `pulumi:"instanceTypesOndemand"`
	InstanceTypesPreemptibles []string                           `pulumi:"instanceTypesPreemptibles"`
	IntegrationDockerSwarm    *ElastigroupIntegrationDockerSwarm `pulumi:"integrationDockerSwarm"`
	// Describes the GKE integration.
	IntegrationGke    *ElastigroupIntegrationGke    `pulumi:"integrationGke"`
	IpForwarding      *bool                         `pulumi:"ipForwarding"`
	Labels            []ElastigroupLabel            `pulumi:"labels"`
	MaxSize           *int                          `pulumi:"maxSize"`
	Metadatas         []ElastigroupMetadata         `pulumi:"metadatas"`
	MinSize           *int                          `pulumi:"minSize"`
	Name              *string                       `pulumi:"name"`
	NetworkInterfaces []ElastigroupNetworkInterface `pulumi:"networkInterfaces"`
	// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
	NodeImage             *string                        `pulumi:"nodeImage"`
	OndemandCount         *int                           `pulumi:"ondemandCount"`
	PreemptiblePercentage *int                           `pulumi:"preemptiblePercentage"`
	ProvisioningModel     *string                        `pulumi:"provisioningModel"`
	ScalingDownPolicies   []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies     []ElastigroupScalingUpPolicy   `pulumi:"scalingUpPolicies"`
	ServiceAccount        *string                        `pulumi:"serviceAccount"`
	ShutdownScript        *string                        `pulumi:"shutdownScript"`
	StartupScript         *string                        `pulumi:"startupScript"`
	Tags                  []string                       `pulumi:"tags"`
}

type ElastigroupState struct {
	BackendServices ElastigroupBackendServiceArrayInput
	// The name of the GKE cluster you wish to import.
	//
	// Deprecated: Please define clusterId under integration_gke
	ClusterId pulumi.StringPtrInput
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringPtrInput
	DesiredCapacity           pulumi.IntPtrInput
	Disks                     ElastigroupDiskArrayInput
	DrainingTimeout           pulumi.IntPtrInput
	FallbackToOndemand        pulumi.BoolPtrInput
	Gpu                       ElastigroupGpuArrayInput
	InstanceNamePrefix        pulumi.StringPtrInput
	InstanceTypesCustoms      ElastigroupInstanceTypesCustomArrayInput
	InstanceTypesOndemand     pulumi.StringPtrInput
	InstanceTypesPreemptibles pulumi.StringArrayInput
	IntegrationDockerSwarm    ElastigroupIntegrationDockerSwarmPtrInput
	// Describes the GKE integration.
	IntegrationGke    ElastigroupIntegrationGkePtrInput
	IpForwarding      pulumi.BoolPtrInput
	Labels            ElastigroupLabelArrayInput
	MaxSize           pulumi.IntPtrInput
	Metadatas         ElastigroupMetadataArrayInput
	MinSize           pulumi.IntPtrInput
	Name              pulumi.StringPtrInput
	NetworkInterfaces ElastigroupNetworkInterfaceArrayInput
	// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
	NodeImage             pulumi.StringPtrInput
	OndemandCount         pulumi.IntPtrInput
	PreemptiblePercentage pulumi.IntPtrInput
	ProvisioningModel     pulumi.StringPtrInput
	ScalingDownPolicies   ElastigroupScalingDownPolicyArrayInput
	ScalingUpPolicies     ElastigroupScalingUpPolicyArrayInput
	ServiceAccount        pulumi.StringPtrInput
	ShutdownScript        pulumi.StringPtrInput
	StartupScript         pulumi.StringPtrInput
	Tags                  pulumi.StringArrayInput
}

func (ElastigroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*elastigroupState)(nil)).Elem()
}

type elastigroupArgs struct {
	BackendServices []ElastigroupBackendService `pulumi:"backendServices"`
	// The name of the GKE cluster you wish to import.
	//
	// Deprecated: Please define clusterId under integration_gke
	ClusterId *string `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           string                             `pulumi:"clusterZoneName"`
	DesiredCapacity           int                                `pulumi:"desiredCapacity"`
	Disks                     []ElastigroupDisk                  `pulumi:"disks"`
	DrainingTimeout           *int                               `pulumi:"drainingTimeout"`
	FallbackToOndemand        *bool                              `pulumi:"fallbackToOndemand"`
	Gpu                       []ElastigroupGpu                   `pulumi:"gpu"`
	InstanceNamePrefix        *string                            `pulumi:"instanceNamePrefix"`
	InstanceTypesCustoms      []ElastigroupInstanceTypesCustom   `pulumi:"instanceTypesCustoms"`
	InstanceTypesOndemand     *string                            `pulumi:"instanceTypesOndemand"`
	InstanceTypesPreemptibles []string                           `pulumi:"instanceTypesPreemptibles"`
	IntegrationDockerSwarm    *ElastigroupIntegrationDockerSwarm `pulumi:"integrationDockerSwarm"`
	// Describes the GKE integration.
	IntegrationGke    *ElastigroupIntegrationGke    `pulumi:"integrationGke"`
	IpForwarding      *bool                         `pulumi:"ipForwarding"`
	Labels            []ElastigroupLabel            `pulumi:"labels"`
	MaxSize           *int                          `pulumi:"maxSize"`
	Metadatas         []ElastigroupMetadata         `pulumi:"metadatas"`
	MinSize           *int                          `pulumi:"minSize"`
	Name              *string                       `pulumi:"name"`
	NetworkInterfaces []ElastigroupNetworkInterface `pulumi:"networkInterfaces"`
	// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
	NodeImage             *string                        `pulumi:"nodeImage"`
	OndemandCount         *int                           `pulumi:"ondemandCount"`
	PreemptiblePercentage *int                           `pulumi:"preemptiblePercentage"`
	ProvisioningModel     *string                        `pulumi:"provisioningModel"`
	ScalingDownPolicies   []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies     []ElastigroupScalingUpPolicy   `pulumi:"scalingUpPolicies"`
	ServiceAccount        *string                        `pulumi:"serviceAccount"`
	ShutdownScript        *string                        `pulumi:"shutdownScript"`
	StartupScript         *string                        `pulumi:"startupScript"`
	Tags                  []string                       `pulumi:"tags"`
}

// The set of arguments for constructing a Elastigroup resource.
type ElastigroupArgs struct {
	BackendServices ElastigroupBackendServiceArrayInput
	// The name of the GKE cluster you wish to import.
	//
	// Deprecated: Please define clusterId under integration_gke
	ClusterId pulumi.StringPtrInput
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringInput
	DesiredCapacity           pulumi.IntInput
	Disks                     ElastigroupDiskArrayInput
	DrainingTimeout           pulumi.IntPtrInput
	FallbackToOndemand        pulumi.BoolPtrInput
	Gpu                       ElastigroupGpuArrayInput
	InstanceNamePrefix        pulumi.StringPtrInput
	InstanceTypesCustoms      ElastigroupInstanceTypesCustomArrayInput
	InstanceTypesOndemand     pulumi.StringPtrInput
	InstanceTypesPreemptibles pulumi.StringArrayInput
	IntegrationDockerSwarm    ElastigroupIntegrationDockerSwarmPtrInput
	// Describes the GKE integration.
	IntegrationGke    ElastigroupIntegrationGkePtrInput
	IpForwarding      pulumi.BoolPtrInput
	Labels            ElastigroupLabelArrayInput
	MaxSize           pulumi.IntPtrInput
	Metadatas         ElastigroupMetadataArrayInput
	MinSize           pulumi.IntPtrInput
	Name              pulumi.StringPtrInput
	NetworkInterfaces ElastigroupNetworkInterfaceArrayInput
	// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
	NodeImage             pulumi.StringPtrInput
	OndemandCount         pulumi.IntPtrInput
	PreemptiblePercentage pulumi.IntPtrInput
	ProvisioningModel     pulumi.StringPtrInput
	ScalingDownPolicies   ElastigroupScalingDownPolicyArrayInput
	ScalingUpPolicies     ElastigroupScalingUpPolicyArrayInput
	ServiceAccount        pulumi.StringPtrInput
	ShutdownScript        pulumi.StringPtrInput
	StartupScript         pulumi.StringPtrInput
	Tags                  pulumi.StringArrayInput
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

func (o ElastigroupOutput) BackendServices() ElastigroupBackendServiceArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupBackendServiceArrayOutput { return v.BackendServices }).(ElastigroupBackendServiceArrayOutput)
}

// The name of the GKE cluster you wish to import.
//
// Deprecated: Please define clusterId under integration_gke
func (o ElastigroupOutput) ClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.ClusterId }).(pulumi.StringPtrOutput)
}

// The zone where the cluster is hosted.
func (o ElastigroupOutput) ClusterZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.ClusterZoneName }).(pulumi.StringOutput)
}

func (o ElastigroupOutput) DesiredCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntOutput { return v.DesiredCapacity }).(pulumi.IntOutput)
}

func (o ElastigroupOutput) Disks() ElastigroupDiskArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupDiskArrayOutput { return v.Disks }).(ElastigroupDiskArrayOutput)
}

func (o ElastigroupOutput) DrainingTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntPtrOutput { return v.DrainingTimeout }).(pulumi.IntPtrOutput)
}

func (o ElastigroupOutput) FallbackToOndemand() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.BoolPtrOutput { return v.FallbackToOndemand }).(pulumi.BoolPtrOutput)
}

func (o ElastigroupOutput) Gpu() ElastigroupGpuArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupGpuArrayOutput { return v.Gpu }).(ElastigroupGpuArrayOutput)
}

func (o ElastigroupOutput) InstanceNamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.InstanceNamePrefix }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) InstanceTypesCustoms() ElastigroupInstanceTypesCustomArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupInstanceTypesCustomArrayOutput { return v.InstanceTypesCustoms }).(ElastigroupInstanceTypesCustomArrayOutput)
}

func (o ElastigroupOutput) InstanceTypesOndemand() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.InstanceTypesOndemand }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) InstanceTypesPreemptibles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringArrayOutput { return v.InstanceTypesPreemptibles }).(pulumi.StringArrayOutput)
}

func (o ElastigroupOutput) IntegrationDockerSwarm() ElastigroupIntegrationDockerSwarmPtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupIntegrationDockerSwarmPtrOutput { return v.IntegrationDockerSwarm }).(ElastigroupIntegrationDockerSwarmPtrOutput)
}

// Describes the GKE integration.
func (o ElastigroupOutput) IntegrationGke() ElastigroupIntegrationGkePtrOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupIntegrationGkePtrOutput { return v.IntegrationGke }).(ElastigroupIntegrationGkePtrOutput)
}

func (o ElastigroupOutput) IpForwarding() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.BoolPtrOutput { return v.IpForwarding }).(pulumi.BoolPtrOutput)
}

func (o ElastigroupOutput) Labels() ElastigroupLabelArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupLabelArrayOutput { return v.Labels }).(ElastigroupLabelArrayOutput)
}

func (o ElastigroupOutput) MaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntOutput { return v.MaxSize }).(pulumi.IntOutput)
}

func (o ElastigroupOutput) Metadatas() ElastigroupMetadataArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupMetadataArrayOutput { return v.Metadatas }).(ElastigroupMetadataArrayOutput)
}

func (o ElastigroupOutput) MinSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntOutput { return v.MinSize }).(pulumi.IntOutput)
}

func (o ElastigroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ElastigroupOutput) NetworkInterfaces() ElastigroupNetworkInterfaceArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupNetworkInterfaceArrayOutput { return v.NetworkInterfaces }).(ElastigroupNetworkInterfaceArrayOutput)
}

// The image that will be used for the node VMs. Possible values: COS, UBUNTU.
func (o ElastigroupOutput) NodeImage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.NodeImage }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) OndemandCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntPtrOutput { return v.OndemandCount }).(pulumi.IntPtrOutput)
}

func (o ElastigroupOutput) PreemptiblePercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.IntPtrOutput { return v.PreemptiblePercentage }).(pulumi.IntPtrOutput)
}

func (o ElastigroupOutput) ProvisioningModel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.ProvisioningModel }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) ScalingDownPolicies() ElastigroupScalingDownPolicyArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupScalingDownPolicyArrayOutput { return v.ScalingDownPolicies }).(ElastigroupScalingDownPolicyArrayOutput)
}

func (o ElastigroupOutput) ScalingUpPolicies() ElastigroupScalingUpPolicyArrayOutput {
	return o.ApplyT(func(v *Elastigroup) ElastigroupScalingUpPolicyArrayOutput { return v.ScalingUpPolicies }).(ElastigroupScalingUpPolicyArrayOutput)
}

func (o ElastigroupOutput) ServiceAccount() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.ServiceAccount }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) ShutdownScript() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.ShutdownScript }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) StartupScript() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringPtrOutput { return v.StartupScript }).(pulumi.StringPtrOutput)
}

func (o ElastigroupOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Elastigroup) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
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
