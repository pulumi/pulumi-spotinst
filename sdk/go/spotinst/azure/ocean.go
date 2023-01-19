// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Ocean struct {
	pulumi.CustomResourceState

	// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
	AcdIdentifier pulumi.StringOutput `pulumi:"acdIdentifier"`
	// The AKS cluster name.
	AksName pulumi.StringOutput `pulumi:"aksName"`
	// Name of the Azure Resource Group where the AKS cluster is located.
	AksResourceGroupName pulumi.StringOutput `pulumi:"aksResourceGroupName"`
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanAutoscalerPtrOutput `pulumi:"autoscaler"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringOutput `pulumi:"controllerClusterId"`
	// Must contain a valid Base64 encoded string.
	CustomData pulumi.StringOutput `pulumi:"customData"`
	// List of Azure extension objects.
	Extensions OceanExtensionArrayOutput `pulumi:"extensions"`
	// The Ocean AKS Health object.
	Health OceanHealthOutput `pulumi:"health"`
	// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
	Images OceanImageArrayOutput `pulumi:"images"`
	// Configure Load Balancer.
	LoadBalancers OceanLoadBalancerArrayOutput `pulumi:"loadBalancers"`
	// List of Managed Service Identity objects.
	ManagedServiceIdentities OceanManagedServiceIdentityArrayOutput `pulumi:"managedServiceIdentities"`
	// The maximum number of pods per node in an AKS cluster.
	MaxPods pulumi.IntPtrOutput `pulumi:"maxPods"`
	// Name of the Load Balancer.
	Name pulumi.StringOutput `pulumi:"name"`
	// Define the Virtual Network and Subnet.
	Network OceanNetworkOutput `pulumi:"network"`
	// OS disk specifications.
	OsDisk OceanOsDiskPtrOutput `pulumi:"osDisk"`
	// The Resource Group name of the Load Balancer.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// SSH public key for admin access to Linux VMs.
	SshPublicKey pulumi.StringOutput `pulumi:"sshPublicKey"`
	// The Ocean AKS strategy object.
	Strategies OceanStrategyArrayOutput `pulumi:"strategies"`
	// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
	Tags OceanTagArrayOutput `pulumi:"tags"`
	// Username for admin access to VMs.
	UserName pulumi.StringOutput `pulumi:"userName"`
	// The types of virtual machines that may or may not be a part of the Ocean cluster.
	VmSizes OceanVmSizeArrayOutput `pulumi:"vmSizes"`
	// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewOcean registers a new resource with the given unique name, arguments, and options.
func NewOcean(ctx *pulumi.Context,
	name string, args *OceanArgs, opts ...pulumi.ResourceOption) (*Ocean, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcdIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'AcdIdentifier'")
	}
	if args.AksName == nil {
		return nil, errors.New("invalid value for required argument 'AksName'")
	}
	if args.AksResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'AksResourceGroupName'")
	}
	if args.SshPublicKey == nil {
		return nil, errors.New("invalid value for required argument 'SshPublicKey'")
	}
	var resource Ocean
	err := ctx.RegisterResource("spotinst:azure/ocean:Ocean", name, args, &resource, opts...)
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
	err := ctx.ReadResource("spotinst:azure/ocean:Ocean", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ocean resources.
type oceanState struct {
	// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
	AcdIdentifier *string `pulumi:"acdIdentifier"`
	// The AKS cluster name.
	AksName *string `pulumi:"aksName"`
	// Name of the Azure Resource Group where the AKS cluster is located.
	AksResourceGroupName *string `pulumi:"aksResourceGroupName"`
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId *string `pulumi:"controllerClusterId"`
	// Must contain a valid Base64 encoded string.
	CustomData *string `pulumi:"customData"`
	// List of Azure extension objects.
	Extensions []OceanExtension `pulumi:"extensions"`
	// The Ocean AKS Health object.
	Health *OceanHealth `pulumi:"health"`
	// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
	Images []OceanImage `pulumi:"images"`
	// Configure Load Balancer.
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// List of Managed Service Identity objects.
	ManagedServiceIdentities []OceanManagedServiceIdentity `pulumi:"managedServiceIdentities"`
	// The maximum number of pods per node in an AKS cluster.
	MaxPods *int `pulumi:"maxPods"`
	// Name of the Load Balancer.
	Name *string `pulumi:"name"`
	// Define the Virtual Network and Subnet.
	Network *OceanNetwork `pulumi:"network"`
	// OS disk specifications.
	OsDisk *OceanOsDisk `pulumi:"osDisk"`
	// The Resource Group name of the Load Balancer.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// SSH public key for admin access to Linux VMs.
	SshPublicKey *string `pulumi:"sshPublicKey"`
	// The Ocean AKS strategy object.
	Strategies []OceanStrategy `pulumi:"strategies"`
	// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
	Tags []OceanTag `pulumi:"tags"`
	// Username for admin access to VMs.
	UserName *string `pulumi:"userName"`
	// The types of virtual machines that may or may not be a part of the Ocean cluster.
	VmSizes []OceanVmSize `pulumi:"vmSizes"`
	// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
	Zones []string `pulumi:"zones"`
}

type OceanState struct {
	// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
	AcdIdentifier pulumi.StringPtrInput
	// The AKS cluster name.
	AksName pulumi.StringPtrInput
	// Name of the Azure Resource Group where the AKS cluster is located.
	AksResourceGroupName pulumi.StringPtrInput
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanAutoscalerPtrInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringPtrInput
	// Must contain a valid Base64 encoded string.
	CustomData pulumi.StringPtrInput
	// List of Azure extension objects.
	Extensions OceanExtensionArrayInput
	// The Ocean AKS Health object.
	Health OceanHealthPtrInput
	// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
	Images OceanImageArrayInput
	// Configure Load Balancer.
	LoadBalancers OceanLoadBalancerArrayInput
	// List of Managed Service Identity objects.
	ManagedServiceIdentities OceanManagedServiceIdentityArrayInput
	// The maximum number of pods per node in an AKS cluster.
	MaxPods pulumi.IntPtrInput
	// Name of the Load Balancer.
	Name pulumi.StringPtrInput
	// Define the Virtual Network and Subnet.
	Network OceanNetworkPtrInput
	// OS disk specifications.
	OsDisk OceanOsDiskPtrInput
	// The Resource Group name of the Load Balancer.
	ResourceGroupName pulumi.StringPtrInput
	// SSH public key for admin access to Linux VMs.
	SshPublicKey pulumi.StringPtrInput
	// The Ocean AKS strategy object.
	Strategies OceanStrategyArrayInput
	// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
	Tags OceanTagArrayInput
	// Username for admin access to VMs.
	UserName pulumi.StringPtrInput
	// The types of virtual machines that may or may not be a part of the Ocean cluster.
	VmSizes OceanVmSizeArrayInput
	// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
	Zones pulumi.StringArrayInput
}

func (OceanState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanState)(nil)).Elem()
}

type oceanArgs struct {
	// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
	AcdIdentifier string `pulumi:"acdIdentifier"`
	// The AKS cluster name.
	AksName string `pulumi:"aksName"`
	// Name of the Azure Resource Group where the AKS cluster is located.
	AksResourceGroupName string `pulumi:"aksResourceGroupName"`
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler *OceanAutoscaler `pulumi:"autoscaler"`
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId *string `pulumi:"controllerClusterId"`
	// Must contain a valid Base64 encoded string.
	CustomData *string `pulumi:"customData"`
	// List of Azure extension objects.
	Extensions []OceanExtension `pulumi:"extensions"`
	// The Ocean AKS Health object.
	Health *OceanHealth `pulumi:"health"`
	// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
	Images []OceanImage `pulumi:"images"`
	// Configure Load Balancer.
	LoadBalancers []OceanLoadBalancer `pulumi:"loadBalancers"`
	// List of Managed Service Identity objects.
	ManagedServiceIdentities []OceanManagedServiceIdentity `pulumi:"managedServiceIdentities"`
	// The maximum number of pods per node in an AKS cluster.
	MaxPods *int `pulumi:"maxPods"`
	// Name of the Load Balancer.
	Name *string `pulumi:"name"`
	// Define the Virtual Network and Subnet.
	Network *OceanNetwork `pulumi:"network"`
	// OS disk specifications.
	OsDisk *OceanOsDisk `pulumi:"osDisk"`
	// The Resource Group name of the Load Balancer.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// SSH public key for admin access to Linux VMs.
	SshPublicKey string `pulumi:"sshPublicKey"`
	// The Ocean AKS strategy object.
	Strategies []OceanStrategy `pulumi:"strategies"`
	// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
	Tags []OceanTag `pulumi:"tags"`
	// Username for admin access to VMs.
	UserName *string `pulumi:"userName"`
	// The types of virtual machines that may or may not be a part of the Ocean cluster.
	VmSizes []OceanVmSize `pulumi:"vmSizes"`
	// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a Ocean resource.
type OceanArgs struct {
	// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
	AcdIdentifier pulumi.StringInput
	// The AKS cluster name.
	AksName pulumi.StringInput
	// Name of the Azure Resource Group where the AKS cluster is located.
	AksResourceGroupName pulumi.StringInput
	// The Ocean Kubernetes Autoscaler object.
	Autoscaler OceanAutoscalerPtrInput
	// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
	ControllerClusterId pulumi.StringPtrInput
	// Must contain a valid Base64 encoded string.
	CustomData pulumi.StringPtrInput
	// List of Azure extension objects.
	Extensions OceanExtensionArrayInput
	// The Ocean AKS Health object.
	Health OceanHealthPtrInput
	// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
	Images OceanImageArrayInput
	// Configure Load Balancer.
	LoadBalancers OceanLoadBalancerArrayInput
	// List of Managed Service Identity objects.
	ManagedServiceIdentities OceanManagedServiceIdentityArrayInput
	// The maximum number of pods per node in an AKS cluster.
	MaxPods pulumi.IntPtrInput
	// Name of the Load Balancer.
	Name pulumi.StringPtrInput
	// Define the Virtual Network and Subnet.
	Network OceanNetworkPtrInput
	// OS disk specifications.
	OsDisk OceanOsDiskPtrInput
	// The Resource Group name of the Load Balancer.
	ResourceGroupName pulumi.StringPtrInput
	// SSH public key for admin access to Linux VMs.
	SshPublicKey pulumi.StringInput
	// The Ocean AKS strategy object.
	Strategies OceanStrategyArrayInput
	// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
	Tags OceanTagArrayInput
	// Username for admin access to VMs.
	UserName pulumi.StringPtrInput
	// The types of virtual machines that may or may not be a part of the Ocean cluster.
	VmSizes OceanVmSizeArrayInput
	// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
	Zones pulumi.StringArrayInput
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

// The AKS identifier. A valid identifier should be formatted as `acd-nnnnnnnn` and previously used identifiers cannot be reused.
func (o OceanOutput) AcdIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.AcdIdentifier }).(pulumi.StringOutput)
}

// The AKS cluster name.
func (o OceanOutput) AksName() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.AksName }).(pulumi.StringOutput)
}

// Name of the Azure Resource Group where the AKS cluster is located.
func (o OceanOutput) AksResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.AksResourceGroupName }).(pulumi.StringOutput)
}

// The Ocean Kubernetes Autoscaler object.
func (o OceanOutput) Autoscaler() OceanAutoscalerPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanAutoscalerPtrOutput { return v.Autoscaler }).(OceanAutoscalerPtrOutput)
}

// A unique identifier used for connecting the Ocean SaaS platform and the Kubernetes cluster. Typically, the cluster name is used as its identifier.
func (o OceanOutput) ControllerClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.ControllerClusterId }).(pulumi.StringOutput)
}

// Must contain a valid Base64 encoded string.
func (o OceanOutput) CustomData() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.CustomData }).(pulumi.StringOutput)
}

// List of Azure extension objects.
func (o OceanOutput) Extensions() OceanExtensionArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanExtensionArrayOutput { return v.Extensions }).(OceanExtensionArrayOutput)
}

// The Ocean AKS Health object.
func (o OceanOutput) Health() OceanHealthOutput {
	return o.ApplyT(func(v *Ocean) OceanHealthOutput { return v.Health }).(OceanHealthOutput)
}

// Image of VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace).
func (o OceanOutput) Images() OceanImageArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanImageArrayOutput { return v.Images }).(OceanImageArrayOutput)
}

// Configure Load Balancer.
func (o OceanOutput) LoadBalancers() OceanLoadBalancerArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanLoadBalancerArrayOutput { return v.LoadBalancers }).(OceanLoadBalancerArrayOutput)
}

// List of Managed Service Identity objects.
func (o OceanOutput) ManagedServiceIdentities() OceanManagedServiceIdentityArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanManagedServiceIdentityArrayOutput { return v.ManagedServiceIdentities }).(OceanManagedServiceIdentityArrayOutput)
}

// The maximum number of pods per node in an AKS cluster.
func (o OceanOutput) MaxPods() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Ocean) pulumi.IntPtrOutput { return v.MaxPods }).(pulumi.IntPtrOutput)
}

// Name of the Load Balancer.
func (o OceanOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Define the Virtual Network and Subnet.
func (o OceanOutput) Network() OceanNetworkOutput {
	return o.ApplyT(func(v *Ocean) OceanNetworkOutput { return v.Network }).(OceanNetworkOutput)
}

// OS disk specifications.
func (o OceanOutput) OsDisk() OceanOsDiskPtrOutput {
	return o.ApplyT(func(v *Ocean) OceanOsDiskPtrOutput { return v.OsDisk }).(OceanOsDiskPtrOutput)
}

// The Resource Group name of the Load Balancer.
func (o OceanOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// SSH public key for admin access to Linux VMs.
func (o OceanOutput) SshPublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.SshPublicKey }).(pulumi.StringOutput)
}

// The Ocean AKS strategy object.
func (o OceanOutput) Strategies() OceanStrategyArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanStrategyArrayOutput { return v.Strategies }).(OceanStrategyArrayOutput)
}

// Unique key-value pairs that will be used to tag VMs that are launched in the cluster.
func (o OceanOutput) Tags() OceanTagArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanTagArrayOutput { return v.Tags }).(OceanTagArrayOutput)
}

// Username for admin access to VMs.
func (o OceanOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

// The types of virtual machines that may or may not be a part of the Ocean cluster.
func (o OceanOutput) VmSizes() OceanVmSizeArrayOutput {
	return o.ApplyT(func(v *Ocean) OceanVmSizeArrayOutput { return v.VmSizes }).(OceanVmSizeArrayOutput)
}

// An Array holding default Availability Zones, this configures the availability zones the Ocean may launch instances in.
func (o OceanOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ocean) pulumi.StringArrayOutput { return v.Zones }).(pulumi.StringArrayOutput)
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
