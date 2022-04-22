// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package aws

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/aws"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := aws.NewOcean(ctx, "example", &aws.OceanArgs{
// 			AssociatePublicIpAddress: pulumi.Bool(true),
// 			ControllerId:             pulumi.String("ocean-dev"),
// 			DesiredCapacity:          pulumi.Int(2),
// 			DrainingTimeout:          pulumi.Int(120),
// 			EbsOptimized:             pulumi.Bool(true),
// 			FallbackToOndemand:       pulumi.Bool(true),
// 			GracePeriod:              pulumi.Int(600),
// 			IamInstanceProfile:       pulumi.String("iam-profile"),
// 			ImageId:                  pulumi.String("ami-123456"),
// 			InstanceMetadataOptions: &aws.OceanInstanceMetadataOptionsArgs{
// 				HttpPutResponseHopLimit: pulumi.Int(10),
// 				HttpTokens:              pulumi.String("required"),
// 			},
// 			KeyName: pulumi.String("fake key"),
// 			LoadBalancers: aws.OceanLoadBalancerArray{
// 				&aws.OceanLoadBalancerArgs{
// 					Arn:  pulumi.String("arn:aws:elasticloadbalancing:us-west-2:fake-arn"),
// 					Type: pulumi.String("TARGET_GROUP"),
// 				},
// 				&aws.OceanLoadBalancerArgs{
// 					Name: pulumi.String("example"),
// 					Type: pulumi.String("CLASSIC"),
// 				},
// 			},
// 			Logging: &aws.OceanLoggingArgs{
// 				Export: &aws.OceanLoggingExportArgs{
// 					S3: []map[string]interface{}{
// 						map[string]interface{}{
// 							"id": "di-abcd123",
// 						},
// 					},
// 				},
// 			},
// 			MaxSize:        pulumi.Int(2),
// 			MinSize:        pulumi.Int(1),
// 			Monitoring:     pulumi.Bool(true),
// 			Region:         pulumi.String("us-west-2"),
// 			RootVolumeSize: pulumi.Int(20),
// 			SecurityGroups: pulumi.StringArray{
// 				pulumi.String("sg-987654321"),
// 			},
// 			SpotPercentage: pulumi.Int(100),
// 			SubnetIds: pulumi.StringArray{
// 				pulumi.String("subnet-123456789"),
// 			},
// 			Tags: aws.OceanTagArray{
// 				&aws.OceanTagArgs{
// 					Key:   pulumi.String("fakeKey"),
// 					Value: pulumi.String("fakeValue"),
// 				},
// 			},
// 			UseAsTemplateOnly:        pulumi.Bool(true),
// 			UserData:                 pulumi.String("echo hello world"),
// 			UtilizeCommitments:       pulumi.Bool(false),
// 			UtilizeReservedInstances: pulumi.Bool(false),
// 			Whitelists: pulumi.StringArray{
// 				pulumi.String("t1.micro"),
// 				pulumi.String("m1.small"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanId", spotinst_ocean_aws.Example.Id)
// 		return nil
// 	})
// }
// ```
type Ocean struct {
	pulumi.CustomResourceState

	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrOutput `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean Kubernetes Auto Scaler.
	Autoscaler OceanAutoscalerPtrOutput `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayOutput `pulumi:"blacklists"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerId pulumi.StringPtrOutput `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntOutput `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrOutput `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrOutput `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrOutput `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrOutput `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrOutput `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrOutput `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrOutput `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// Logging configuration.
	Logging OceanLoggingPtrOutput `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrOutput `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrOutput `pulumi:"monitoring"`
	// Required if type is set to `CLASSIC`
	Name pulumi.StringOutput `pulumi:"name"`
	// The region the cluster will run in.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrOutput `pulumi:"rootVolumeSize"`
	// Set scheduling object.
	ScheduledTasks OceanScheduledTaskArrayOutput `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrOutput `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayOutput        `pulumi:"tags"`
	UpdatePolicy OceanUpdatePolicyPtrOutput `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	// When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
	UseAsTemplateOnly pulumi.BoolPtrOutput `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrOutput `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrOutput `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists pulumi.StringArrayOutput `pulumi:"whitelists"`
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOption) (*Ocean, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecurityGroups == nil {
		return nil, errors.New("invalid value for required argument 'SecurityGroups'")
	}
	if args.SubnetIds == nil {
		return nil, errors.New("invalid value for required argument 'SubnetIds'")
	}
	var resource Ocean
	err := ctx.RegisterResource("spotinst:aws/ocean:Ocean", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:aws/ocean:Ocean", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ocean resources.
type oceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean Kubernetes Auto Scaler.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerId *string `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyName *string `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// Logging configuration.
	Logging *OceanLogging `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// Required if type is set to `CLASSIC`
	Name *string `pulumi:"name"`
	// The region the cluster will run in.
	Region *string `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Set scheduling object.
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage *int `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	// When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments *bool `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

type OceanState struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Describes the Ocean Kubernetes Auto Scaler.
	Autoscaler OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrInput
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrInput
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayInput
	// Logging configuration.
	Logging OceanLoggingPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// Required if type is set to `CLASSIC`
	Name pulumi.StringPtrInput
	// The region the cluster will run in.
	Region pulumi.StringPtrInput
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrInput
	// Set scheduling object.
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayInput
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	// When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists pulumi.StringArrayInput
}

func (OceanState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanState)(nil)).Elem()
}

type oceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Describes the Ocean Kubernetes Auto Scaler.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists []string `pulumi:"blacklists"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerId *string `pulumi:"controllerId"`
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout *int `pulumi:"drainingTimeout"`
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand *bool `pulumi:"fallbackToOndemand"`
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod *int `pulumi:"gracePeriod"`
	// The instance profile iam role.
	IamInstanceProfile *string `pulumi:"iamInstanceProfile"`
	// ID of the image used to launch the instances.
	ImageId *string `pulumi:"imageId"`
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions *OceanInstanceMetadataOptions `pulumi:"instanceMetadataOptions"`
	// The key pair to attach the instances.
	KeyName *string `pulumi:"keyName"`
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// Logging configuration.
	Logging *OceanLogging `pulumi:"logging"`
	// The upper limit of instances the cluster can scale up to.
	MaxSize *int `pulumi:"maxSize"`
	// The lower limit of instances the cluster can scale down to.
	MinSize *int `pulumi:"minSize"`
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring *bool `pulumi:"monitoring"`
	// Required if type is set to `CLASSIC`
	Name *string `pulumi:"name"`
	// The region the cluster will run in.
	Region *string `pulumi:"region"`
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize *int `pulumi:"rootVolumeSize"`
	// Set scheduling object.
	ScheduledTasks []OceanScheduledTask `pulumi:"scheduledTasks"`
	// One or more security group ids.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage *int `pulumi:"spotPercentage"`
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
	SubnetIds []string `pulumi:"subnetIds"`
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         []OceanTag         `pulumi:"tags"`
	UpdatePolicy *OceanUpdatePolicy `pulumi:"updatePolicy"`
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	// When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
	UseAsTemplateOnly *bool `pulumi:"useAsTemplateOnly"`
	// Base64-encoded MIME user data to make available to the instances.
	UserData *string `pulumi:"userData"`
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments *bool `pulumi:"utilizeCommitments"`
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances *bool `pulumi:"utilizeReservedInstances"`
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
	Whitelists []string `pulumi:"whitelists"`
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	// Configure public IP address allocation.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Describes the Ocean Kubernetes Auto Scaler.
	Autoscaler OceanAutoscalerPtrInput
	// Instance types not allowed in the Ocean cluster. Cannot be configured if `whitelist` is configured.
	Blacklists pulumi.StringArrayInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerId pulumi.StringPtrInput
	// The number of instances to launch and maintain in the cluster.
	DesiredCapacity pulumi.IntPtrInput
	// The time in seconds, the instance is allowed to run while detached from the ELB. This is to allow the instance time to be drained from incoming TCP connections before terminating it, during a scale down operation.
	DrainingTimeout pulumi.IntPtrInput
	// Enable EBS optimized for cluster. Flag will enable optimized capacity for high bandwidth connectivity to the EB service for non EBS optimized instance types. For instances that are EBS optimized this flag will be ignored.
	EbsOptimized pulumi.BoolPtrInput
	// If not Spot instance markets are available, enable Ocean to launch On-Demand instances instead.
	FallbackToOndemand pulumi.BoolPtrInput
	// The amount of time, in seconds, after the instance has launched to start checking its health.
	GracePeriod pulumi.IntPtrInput
	// The instance profile iam role.
	IamInstanceProfile pulumi.StringPtrInput
	// ID of the image used to launch the instances.
	ImageId pulumi.StringPtrInput
	// Ocean instance metadata options object for IMDSv2.
	InstanceMetadataOptions OceanInstanceMetadataOptionsPtrInput
	// The key pair to attach the instances.
	KeyName pulumi.StringPtrInput
	// - Array of load balancer objects to add to ocean cluster
	LoadBalancers OceanLoadBalancerArrayInput
	// Logging configuration.
	Logging OceanLoggingPtrInput
	// The upper limit of instances the cluster can scale up to.
	MaxSize pulumi.IntPtrInput
	// The lower limit of instances the cluster can scale down to.
	MinSize pulumi.IntPtrInput
	// Enable detailed monitoring for cluster. Flag will enable Cloud Watch detailed monitoring (one minute increments). Note: there are additional hourly costs for this service based on the region used.
	Monitoring pulumi.BoolPtrInput
	// Required if type is set to `CLASSIC`
	Name pulumi.StringPtrInput
	// The region the cluster will run in.
	Region pulumi.StringPtrInput
	// The size (in Gb) to allocate for the root volume. Minimum `20`.
	RootVolumeSize pulumi.IntPtrInput
	// Set scheduling object.
	ScheduledTasks OceanScheduledTaskArrayInput
	// One or more security group ids.
	SecurityGroups pulumi.StringArrayInput
	// The percentage of Spot instances that would spin up from the `desiredCapacity` number.
	SpotPercentage pulumi.IntPtrInput
	// A comma-separated list of subnet identifiers for the Ocean cluster. Subnet IDs should be configured with auto assign public IP.
	SubnetIds pulumi.StringArrayInput
	// Optionally adds tags to instances launched in an Ocean cluster.
	Tags         OceanTagArrayInput
	UpdatePolicy OceanUpdatePolicyPtrInput
	// launch specification defined on the Ocean object will function only as a template for virtual node groups.
	// When set to true, on Ocean resource creation please make sure your custom VNG has an initialNodes parameter to create nodes for your VNG.
	UseAsTemplateOnly pulumi.BoolPtrInput
	// Base64-encoded MIME user data to make available to the instances.
	UserData pulumi.StringPtrInput
	// If savings plans exist, Ocean will utilize them before launching Spot instances.
	UtilizeCommitments pulumi.BoolPtrInput
	// If Reserved instances exist, Ocean will utilize them before launching Spot instances.
	UtilizeReservedInstances pulumi.BoolPtrInput
	// Instance types allowed in the Ocean cluster. Cannot be configured if `blacklist` is configured.
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
//          OceanArray{ OceanArgs{...} }
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
//          OceanMap{ "key": OceanArgs{...} }
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
