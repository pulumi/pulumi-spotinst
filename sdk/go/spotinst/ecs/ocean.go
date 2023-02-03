// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Spotinst Ocean ECS resource.
//
// ## Import
//
// # Clusters can be imported using the Ocean `id`, e.g., hcl
//
// ```sh
//
//	$ pulumi import spotinst:ecs/ocean:Ocean this o-12345678
//
// ```
type Ocean struct {
	pulumi.CustomResourceState

	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrOutput `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean ECS autoscaler.
	Autoscaler OceanAutoscalerPtrOutput `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
	Blacklists pulumi.StringArrayOutput `pulumi:"blacklists"`
	// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanBlockDeviceMappingArrayOutput `pulumi:"blockDeviceMappings"`
	// The name of the ECS cluster.
	ClusterName         pulumi.StringOutput                `pulumi:"clusterName"`
	ClusterOrientations OceanClusterOrientationArrayOutput `pulumi:"clusterOrientations"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrOutput `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrOutput `pulumi:"ebsOptimized"`
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
	Filters OceanFiltersPtrOutput `pulumi:"filters"`
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrOutput `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyPair pulumi.StringPtrOutput `pulumi:"keyPair"`
	// Logging configuration.
	Logging OceanLoggingPtrOutput `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrOutput `pulumi:"monitoring"`
	// The Ocean cluster name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Object. Set auto image update settings.
	OptimizeImages OceanOptimizeImagesPtrOutput `pulumi:"optimizeImages"`
	// The region the cluster will run in.
	Region pulumi.StringOutput `pulumi:"region"`
	// While used, you can control whether the group should perform a deployment after an update to the configuration.
	ScheduledTasks OceanScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrOutput `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayOutput        `pulumi:"tags"`
	UpdatePolicy OceanUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrOutput `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrOutput `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrOutput `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
	Whitelists pulumi.StringArrayOutput `pulumi:"whitelists"`
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOption) (*Ocean, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.SecurityGroupIds == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroupIds'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	var resource Ocean
	err := ctx.RegisterResource("spotinst:ecs/ocean:Ocean", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:ecs/ocean:Ocean", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ocean resources.
type oceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean ECS autoscaler.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// The name of the ECS cluster.
	ClusterName         *string                   `pulumi:"clusterName"`
	ClusterOrientations []OceanClusterOrientation `pulumi:"clusterOrientations"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
	Filters *OceanFilters `pulumi:"filters"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Logging configuration.
	Logging *OceanLogging `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// The Ocean cluster name.
	Name *string `pulumi:"name"`
	// Object. Set auto image update settings.
	OptimizeImages *OceanOptimizeImages `pulumi:"optimizeImages"`
	// The region the cluster will run in.
	Region *string `pulumi:"region"`
	// While used, you can control whether the group should perform a deployment after an update to the configuration.
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage *int `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments *bool `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

type OceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Describes the Ocean ECS autoscaler.
	Autoscaler OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
	Blacklists pulumi.StringArrayInput
	// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanBlockDeviceMappingArrayInput
	// The name of the ECS cluster.
	ClusterName         pulumi.StringPtrInput
	ClusterOrientations OceanClusterOrientationArrayInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
	Filters OceanFiltersPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrInput
	// The key pair to attach the instances.
	KeyPair pulumi.StringPtrInput
	// Logging configuration.
	Logging OceanLoggingPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// The Ocean cluster name.
	Name pulumi.StringPtrInput
	// Object. Set auto image update settings.
	OptimizeImages OceanOptimizeImagesPtrInput
	// The region the cluster will run in.
	Region pulumi.StringPtrInput
	// While used, you can control whether the group should perform a deployment after an update to the configuration.
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanState)(nil)).Elem()
}

type oceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean ECS autoscaler.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings []OceanBlockDeviceMapping `pulumi:"blockDeviceMappings"`
	// The name of the ECS cluster.
	ClusterName         string                    `pulumi:"clusterName"`
	ClusterOrientations []OceanClusterOrientation `pulumi:"clusterOrientations"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
	Filters *OceanFilters `pulumi:"filters"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyPair *string `pulumi:"keyPair"`
	// Logging configuration.
	Logging *OceanLogging `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// The Ocean cluster name.
	Name *string `pulumi:"name"`
	// Object. Set auto image update settings.
	OptimizeImages *OceanOptimizeImages `pulumi:"optimizeImages"`
	// The region the cluster will run in.
	Region string `pulumi:"region"`
	// While used, you can control whether the group should perform a deployment after an update to the configuration.
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage *int `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments *bool `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Describes the Ocean ECS autoscaler.
	Autoscaler OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
	Blacklists pulumi.StringArrayInput
	// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
	BlockDeviceMappings OceanBlockDeviceMappingArrayInput
	// The name of the ECS cluster.
	ClusterName         pulumi.StringInput
	ClusterOrientations OceanClusterOrientationArrayInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
	Filters OceanFiltersPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrInput
	// The key pair to attach the instances.
	KeyPair pulumi.StringPtrInput
	// Logging configuration.
	Logging OceanLoggingPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// The Ocean cluster name.
	Name pulumi.StringPtrInput
	// Object. Set auto image update settings.
	OptimizeImages OceanOptimizeImagesPtrInput
	// The region the cluster will run in.
	Region pulumi.StringInput
	// While used, you can control whether the group should perform a deployment after an update to the configuration.
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroupIds pulumi.StringArrayInput
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
	Whitelists pulumi.StringArrayInput
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

// Configure public IP address allocation.
func (o OceanOutput) AssociatePublicIpAddress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.AssociatePublicIpAddress }).(pulumi.BoolPtrOutput)
}

// Describes the Ocean ECS autoscaler.
func (o OceanOutput) Autoscaler() OceanAutoscalerPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanAutoscalerPtrOutput { return v.Autoscaler }).(OceanAutoscalerPtrOutput)
}

// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist`/`filters` is configured.
func (o OceanOutput) Blacklists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringArrayOutput { return v.Blacklists }).(pulumi.StringArrayOutput)
}

// Object. List of block devices that are exposed to the instance, specify either virtual devices and EBS volumes.
func (o OceanOutput) BlockDeviceMappings() OceanBlockDeviceMappingArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanBlockDeviceMappingArrayOutput { return v.BlockDeviceMappings }).(OceanBlockDeviceMappingArrayOutput)
}

// The name of the ECS cluster.
func (o OceanOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

func (o OceanOutput) ClusterOrientations() OceanClusterOrientationArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanClusterOrientationArrayOutput { return v.ClusterOrientations }).(OceanClusterOrientationArrayOutput)
}

// The number of instances to launch and maintain in the cluster.
func (o OceanOutput) DesiredCapacity() pulumi.IntOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntOutput { return v.DesiredCapacity }).(pulumi.IntOutput)
}

// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
func (o OceanOutput) DrainingTimeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntPtrOutput { return v.DrainingTimeout }).(pulumi.IntPtrOutput)
}

// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
func (o OceanOutput) EbsOptimized() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.EbsOptimized }).(pulumi.BoolPtrOutput)
}

// List of filters. The Instance types that match with all filters compose the Ocean's whitelist parameter. Cannot be configured together with `whitelist`/`blacklist`.
func (o OceanOutput) Filters() OceanFiltersPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanFiltersPtrOutput { return v.Filters }).(OceanFiltersPtrOutput)
}

// The instance profile iam role.
func (o OceanOutput) IamInstanceProfile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringPtrOutput { return v.IamInstanceProfile }).(pulumi.StringPtrOutput)
}

// ID of the image used to launch the instances.
func (o OceanOutput) ImageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringPtrOutput { return v.ImageId }).(pulumi.StringPtrOutput)
}

// Ocean instance metadata options object for IMDSv2.
func (o OceanOutput) InstanceMetadataOptions() OceanInstanceMetadataOptionsPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanInstanceMetadataOptionsPtrOutput { return v.InstanceMetadataOptions }).(OceanInstanceMetadataOptionsPtrOutput)
}

// The key pair to attach the instances.
func (o OceanOutput) KeyPair() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringPtrOutput { return v.KeyPair }).(pulumi.StringPtrOutput)
}

// Logging configuration.
func (o OceanOutput) Logging() OceanLoggingPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanLoggingPtrOutput { return v.Logging }).(OceanLoggingPtrOutput)
}

// The upper limit of instances the cluster can scale up to.
func (o OceanOutput) MaxSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntOutput { return v.MaxSize }).(pulumi.IntOutput)
}

// The lower limit of instances the cluster can scale down to.
func (o OceanOutput) MinSize() pulumi.IntOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntOutput { return v.MinSize }).(pulumi.IntOutput)
}

// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
func (o OceanOutput) Monitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.Monitoring }).(pulumi.BoolPtrOutput)
}

// The Ocean cluster name.
func (o OceanOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Object. Set auto image update settings.
func (o OceanOutput) OptimizeImages() OceanOptimizeImagesPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanOptimizeImagesPtrOutput { return v.OptimizeImages }).(OceanOptimizeImagesPtrOutput)
}

// The region the cluster will run in.
func (o OceanOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// While used, you can control whether the group should perform a deployment after an update to the configuration.
func (o OceanOutput) ScheduledTasks() OceanScheduledTaskArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanScheduledTaskArrayOutput { return v.ScheduledTasks }).(OceanScheduledTaskArrayOutput)
}

// One or more security group ids.
func (o OceanOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
func (o OceanOutput) SpotPercentage() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntPtrOutput { return v.SpotPercentage }).(pulumi.IntPtrOutput)
}

// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public ip.
func (o OceanOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// Optionally adds tags to instances launched in an Ocean cluster.
func (o OceanOutput) Tags() OceanTagArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanTagArrayOutput { return v.Tags }).(OceanTagArrayOutput)
}

func (o OceanOutput) UpdatePolicy() OceanUpdatePolicyPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanUpdatePolicyPtrOutput { return v.UpdatePolicy }).(OceanUpdatePolicyPtrOutput)
}

// launch specification defined on the Ocean object will function only as a template for virtual node groups.
func (o OceanOutput) UseAsTemplateOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.UseAsTemplateOnly }).(pulumi.BoolPtrOutput)
}

// Base64-encoded MIME user data to make available to the instances.
func (o OceanOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

// If savings plans exist, Ocean will utilize them before launching Spot instances.
func (o OceanOutput) UtilizeCommitments() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.UtilizeCommitments }).(pulumi.BoolPtrOutput)
}

// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
func (o OceanOutput) UtilizeReservedInstances() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.BoolPtrOutput { return v.UtilizeReservedInstances }).(pulumi.BoolPtrOutput)
}

// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist`/`filters` is configured.
func (o OceanOutput) Whitelists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringArrayOutput { return v.Whitelists }).(pulumi.StringArrayOutput)
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
