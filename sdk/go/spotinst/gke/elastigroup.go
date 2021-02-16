// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 	"github.com/pulumi/pulumi-spotinst/sdk/v2/go/spotinst/gke"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := gke.NewElastigroup(ctx, "example_gke_elastigroup", &gke.ElastigroupArgs{
// 			BackendServices: gke.ElastigroupBackendServiceArray{
// 				&gke.ElastigroupBackendServiceArgs{
// 					LocationType: pulumi.String("global"),
// 					NamedPorts: gke.ElastigroupBackendServiceNamedPortArray{
// 						&gke.ElastigroupBackendServiceNamedPortArgs{
// 							Name: pulumi.String("http"),
// 							Ports: pulumi.StringArray{
// 								pulumi.String("80"),
// 								pulumi.String("8080"),
// 							},
// 						},
// 					},
// 					ServiceName: pulumi.String("backend-service"),
// 				},
// 			},
// 			ClusterZoneName:       pulumi.String("us-central1-a"),
// 			DesiredCapacity:       pulumi.Int(3),
// 			InstanceTypesOndemand: pulumi.String("n1-standard-1"),
// 			InstanceTypesPreemptibles: pulumi.StringArray{
// 				pulumi.String("n1-standard-1"),
// 				pulumi.String("n1-standard-2"),
// 			},
// 			IntegrationGke: &gke.ElastigroupIntegrationGkeArgs{
// 				AutoscaleCooldown: pulumi.Int(300),
// 				AutoscaleDown: &gke.ElastigroupIntegrationGkeAutoscaleDownArgs{
// 					EvaluationPeriods: pulumi.Int(300),
// 				},
// 				AutoscaleHeadroom: &gke.ElastigroupIntegrationGkeAutoscaleHeadroomArgs{
// 					CpuPerUnit:    pulumi.Int(1024),
// 					MemoryPerUnit: pulumi.Int(512),
// 					NumOfUnits:    pulumi.Int(2),
// 				},
// 				AutoscaleIsAutoConfig: pulumi.Bool(false),
// 				AutoscaleIsEnabled:    pulumi.Bool(true),
// 				AutoscaleLabels: gke.ElastigroupIntegrationGkeAutoscaleLabelArray{
// 					&gke.ElastigroupIntegrationGkeAutoscaleLabelArgs{
// 						Key:   pulumi.String("label_key"),
// 						Value: pulumi.String("label_value"),
// 					},
// 				},
// 				ClusterId: pulumi.String("example-cluster-id"),
// 				Location:  pulumi.String("us-central1-a"),
// 			},
// 			MaxSize:               pulumi.Int(5),
// 			MinSize:               pulumi.Int(1),
// 			NodeImage:             pulumi.String("COS"),
// 			PreemptiblePercentage: pulumi.Int(100),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Elastigroup struct {
	pulumi.CustomResourceState

	BackendServices ElastigroupBackendServiceArrayOutput `pulumi:"backendServices"`
	// The GKE cluster ID you wish to import.
	//
	// Deprecated: Please define cluster_id under integration_gke
	ClusterId pulumi.StringPtrOutput `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringOutput                        `pulumi:"clusterZoneName"`
	DesiredCapacity           pulumi.IntOutput                           `pulumi:"desiredCapacity"`
	Disks                     ElastigroupDiskArrayOutput                 `pulumi:"disks"`
	DrainingTimeout           pulumi.IntPtrOutput                        `pulumi:"drainingTimeout"`
	FallbackToOndemand        pulumi.BoolPtrOutput                       `pulumi:"fallbackToOndemand"`
	Gpu                       ElastigroupGpuArrayOutput                  `pulumi:"gpu"`
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
	// The GKE cluster ID you wish to import.
	//
	// Deprecated: Please define cluster_id under integration_gke
	ClusterId *string `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           *string                            `pulumi:"clusterZoneName"`
	DesiredCapacity           *int                               `pulumi:"desiredCapacity"`
	Disks                     []ElastigroupDisk                  `pulumi:"disks"`
	DrainingTimeout           *int                               `pulumi:"drainingTimeout"`
	FallbackToOndemand        *bool                              `pulumi:"fallbackToOndemand"`
	Gpu                       []ElastigroupGpu                   `pulumi:"gpu"`
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
	ScalingDownPolicies   []ElastigroupScalingDownPolicy `pulumi:"scalingDownPolicies"`
	ScalingUpPolicies     []ElastigroupScalingUpPolicy   `pulumi:"scalingUpPolicies"`
	ServiceAccount        *string                        `pulumi:"serviceAccount"`
	ShutdownScript        *string                        `pulumi:"shutdownScript"`
	StartupScript         *string                        `pulumi:"startupScript"`
	Tags                  []string                       `pulumi:"tags"`
}

type ElastigroupState struct {
	BackendServices ElastigroupBackendServiceArrayInput
	// The GKE cluster ID you wish to import.
	//
	// Deprecated: Please define cluster_id under integration_gke
	ClusterId pulumi.StringPtrInput
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringPtrInput
	DesiredCapacity           pulumi.IntPtrInput
	Disks                     ElastigroupDiskArrayInput
	DrainingTimeout           pulumi.IntPtrInput
	FallbackToOndemand        pulumi.BoolPtrInput
	Gpu                       ElastigroupGpuArrayInput
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
	// The GKE cluster ID you wish to import.
	//
	// Deprecated: Please define cluster_id under integration_gke
	ClusterId *string `pulumi:"clusterId"`
	// The zone where the cluster is hosted.
	ClusterZoneName           string                             `pulumi:"clusterZoneName"`
	DesiredCapacity           int                                `pulumi:"desiredCapacity"`
	Disks                     []ElastigroupDisk                  `pulumi:"disks"`
	DrainingTimeout           *int                               `pulumi:"drainingTimeout"`
	FallbackToOndemand        *bool                              `pulumi:"fallbackToOndemand"`
	Gpu                       []ElastigroupGpu                   `pulumi:"gpu"`
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
	// The GKE cluster ID you wish to import.
	//
	// Deprecated: Please define cluster_id under integration_gke
	ClusterId pulumi.StringPtrInput
	// The zone where the cluster is hosted.
	ClusterZoneName           pulumi.StringInput
	DesiredCapacity           pulumi.IntInput
	Disks                     ElastigroupDiskArrayInput
	DrainingTimeout           pulumi.IntPtrInput
	FallbackToOndemand        pulumi.BoolPtrInput
	Gpu                       ElastigroupGpuArrayInput
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
	return reflect.TypeOf((*Elastigroup)(nil))
}

func (i *Elastigroup) ToElastigroupOutput() ElastigroupOutput {
	return i.ToElastigroupOutputWithContext(context.Background())
}

func (i *Elastigroup) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupOutput)
}

func (i *Elastigroup) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return i.ToElastigroupPtrOutputWithContext(context.Background())
}

func (i *Elastigroup) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupPtrOutput)
}

type ElastigroupPtrInput interface {
	pulumi.Input

	ToElastigroupPtrOutput() ElastigroupPtrOutput
	ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput
}

type elastigroupPtrType ElastigroupArgs

func (*elastigroupPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil))
}

func (i *elastigroupPtrType) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return i.ToElastigroupPtrOutputWithContext(context.Background())
}

func (i *elastigroupPtrType) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupPtrOutput)
}

// ElastigroupArrayInput is an input type that accepts ElastigroupArray and ElastigroupArrayOutput values.
// You can construct a concrete instance of `ElastigroupArrayInput` via:
//
//          ElastigroupArray{ ElastigroupArgs{...} }
type ElastigroupArrayInput interface {
	pulumi.Input

	ToElastigroupArrayOutput() ElastigroupArrayOutput
	ToElastigroupArrayOutputWithContext(context.Context) ElastigroupArrayOutput
}

type ElastigroupArray []ElastigroupInput

func (ElastigroupArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Elastigroup)(nil))
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
//          ElastigroupMap{ "key": ElastigroupArgs{...} }
type ElastigroupMapInput interface {
	pulumi.Input

	ToElastigroupMapOutput() ElastigroupMapOutput
	ToElastigroupMapOutputWithContext(context.Context) ElastigroupMapOutput
}

type ElastigroupMap map[string]ElastigroupInput

func (ElastigroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Elastigroup)(nil))
}

func (i ElastigroupMap) ToElastigroupMapOutput() ElastigroupMapOutput {
	return i.ToElastigroupMapOutputWithContext(context.Background())
}

func (i ElastigroupMap) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ElastigroupMapOutput)
}

type ElastigroupOutput struct {
	*pulumi.OutputState
}

func (ElastigroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Elastigroup)(nil))
}

func (o ElastigroupOutput) ToElastigroupOutput() ElastigroupOutput {
	return o
}

func (o ElastigroupOutput) ToElastigroupOutputWithContext(ctx context.Context) ElastigroupOutput {
	return o
}

func (o ElastigroupOutput) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return o.ToElastigroupPtrOutputWithContext(context.Background())
}

func (o ElastigroupOutput) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return o.ApplyT(func(v Elastigroup) *Elastigroup {
		return &v
	}).(ElastigroupPtrOutput)
}

type ElastigroupPtrOutput struct {
	*pulumi.OutputState
}

func (ElastigroupPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Elastigroup)(nil))
}

func (o ElastigroupPtrOutput) ToElastigroupPtrOutput() ElastigroupPtrOutput {
	return o
}

func (o ElastigroupPtrOutput) ToElastigroupPtrOutputWithContext(ctx context.Context) ElastigroupPtrOutput {
	return o
}

type ElastigroupArrayOutput struct{ *pulumi.OutputState }

func (ElastigroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Elastigroup)(nil))
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutput() ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) ToElastigroupArrayOutputWithContext(ctx context.Context) ElastigroupArrayOutput {
	return o
}

func (o ElastigroupArrayOutput) Index(i pulumi.IntInput) ElastigroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Elastigroup {
		return vs[0].([]Elastigroup)[vs[1].(int)]
	}).(ElastigroupOutput)
}

type ElastigroupMapOutput struct{ *pulumi.OutputState }

func (ElastigroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Elastigroup)(nil))
}

func (o ElastigroupMapOutput) ToElastigroupMapOutput() ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) ToElastigroupMapOutputWithContext(ctx context.Context) ElastigroupMapOutput {
	return o
}

func (o ElastigroupMapOutput) MapIndex(k pulumi.StringInput) ElastigroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Elastigroup {
		return vs[0].(map[string]Elastigroup)[vs[1].(string)]
	}).(ElastigroupOutput)
}

func init() {
	pulumi.RegisterOutputType(ElastigroupOutput{})
	pulumi.RegisterOutputType(ElastigroupPtrOutput{})
	pulumi.RegisterOutputType(ElastigroupArrayOutput{})
	pulumi.RegisterOutputType(ElastigroupMapOutput{})
}
