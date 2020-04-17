// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst Ocean GKE import resource.
type OceanImport struct {
	pulumi.CustomResourceState

	// Describes the backend service configurations.
	BackendServices     OceanImportBackendServiceArrayOutput `pulumi:"backendServices"`
	ClusterControllerId pulumi.StringOutput                  `pulumi:"clusterControllerId"`
	// The GKE cluster name.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location pulumi.StringOutput `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize        pulumi.IntOutput                    `pulumi:"minSize"`
	ScheduledTasks OceanImportScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	Whitelists     pulumi.StringArrayOutput            `pulumi:"whitelists"`
}

// NewOceanImport registers a new resource with the given unique name, arguments, and options.
func NewOceanImport(ctx *pulumi.Context,
	name string, args *OceanImportArgs, opts ...pulumi.ResourceOption) (*OceanImport, error) {
	if args == nil || args.ClusterName == nil {
		return nil, errors.New("missing required argument 'ClusterName'")
	}
	if args == nil || args.Location == nil {
		return nil, errors.New("missing required argument 'Location'")
	}
	if args == nil {
		args = &OceanImportArgs{}
	}
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
	// Describes the backend service configurations.
	BackendServices     []OceanImportBackendService `pulumi:"backendServices"`
	ClusterControllerId *string                     `pulumi:"clusterControllerId"`
	// The GKE cluster name.
	ClusterName *string `pulumi:"clusterName"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location *string `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize        *int                       `pulumi:"minSize"`
	ScheduledTasks []OceanImportScheduledTask `pulumi:"scheduledTasks"`
	Whitelists     []string                   `pulumi:"whitelists"`
}

type OceanImportState struct {
	// Describes the backend service configurations.
	BackendServices     OceanImportBackendServiceArrayInput
	ClusterControllerId pulumi.StringPtrInput
	// The GKE cluster name.
	ClusterName pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The zone the master cluster is located in.
	Location pulumi.StringPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize        pulumi.IntPtrInput
	ScheduledTasks OceanImportScheduledTaskArrayInput
	Whitelists     pulumi.StringArrayInput
}

func (OceanImportState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanImportState)(nil)).Elem()
}

type oceanImportArgs struct {
	// Describes the backend service configurations.
	BackendServices []OceanImportBackendService `pulumi:"backendServices"`
	// The GKE cluster name.
	ClusterName string `pulumi:"clusterName"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The zone the master cluster is located in.
	Location string `pulumi:"location"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize        *int                       `pulumi:"minSize"`
	ScheduledTasks []OceanImportScheduledTask `pulumi:"scheduledTasks"`
	Whitelists     []string                   `pulumi:"whitelists"`
}

// The set of arguments for constructing a OceanImport resource.
type OceanImportArgs struct {
	// Describes the backend service configurations.
	BackendServices OceanImportBackendServiceArrayInput
	// The GKE cluster name.
	ClusterName pulumi.StringInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The zone the master cluster is located in.
	Location pulumi.StringInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize        pulumi.IntPtrInput
	ScheduledTasks OceanImportScheduledTaskArrayInput
	Whitelists     pulumi.StringArrayInput
}

func (OceanImportArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanImportArgs)(nil)).Elem()
}
