// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package azure

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
// 	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/azure"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := azure.NewOcean(ctx, "example", &azure.OceanArgs{
// 			AcdIdentifier:        pulumi.String("acd-12345678"),
// 			AksName:              pulumi.String("ocean-westus-dev-aks"),
// 			AksResourceGroupName: pulumi.String("ocean-westus-dev"),
// 			Autoscaler: &azure.OceanAutoscalerArgs{
// 				AutoscaleDown: &azure.OceanAutoscalerAutoscaleDownArgs{
// 					MaxScaleDownPercentage: pulumi.Float64(10),
// 				},
// 				AutoscaleHeadroom: &azure.OceanAutoscalerAutoscaleHeadroomArgs{
// 					Automatic: &azure.OceanAutoscalerAutoscaleHeadroomAutomaticArgs{
// 						IsEnabled:  pulumi.Bool(true),
// 						Percentage: pulumi.Int(10),
// 					},
// 				},
// 				AutoscaleIsEnabled: pulumi.Bool(true),
// 				ResourceLimits: &azure.OceanAutoscalerResourceLimitsArgs{
// 					MaxMemoryGib: pulumi.Int(40),
// 					MaxVcpu:      pulumi.Int(1024),
// 				},
// 			},
// 			ControllerClusterId: pulumi.String("ocean-westus-dev-aks"),
// 			CustomData:          pulumi.String("[... redacted ...]"),
// 			Extensions: azure.OceanExtensionArray{
// 				&azure.OceanExtensionArgs{
// 					ApiVersion:              pulumi.String("1.0"),
// 					MinorVersionAutoUpgrade: pulumi.Bool(true),
// 					Name:                    pulumi.String("extension-name"),
// 					Publisher:               pulumi.String("Microsoft.Azure.Extensions"),
// 					Type:                    pulumi.String("Linux"),
// 				},
// 			},
// 			Health: &azure.OceanHealthArgs{
// 				GracePeriod: pulumi.Int(10),
// 			},
// 			Images: azure.OceanImageArray{
// 				&azure.OceanImageArgs{
// 					Marketplaces: azure.OceanImageMarketplaceArray{
// 						&azure.OceanImageMarketplaceArgs{
// 							Offer:     pulumi.String("UbuntuServer"),
// 							Publisher: pulumi.String("Canonical"),
// 							Sku:       pulumi.String("18.04-LTS"),
// 							Version:   pulumi.String("latest"),
// 						},
// 					},
// 				},
// 			},
// 			LoadBalancers: azure.OceanLoadBalancerArray{
// 				&azure.OceanLoadBalancerArgs{
// 					BackendPoolNames: pulumi.StringArray{
// 						pulumi.String("terraform-backend-pool"),
// 					},
// 					LoadBalancerSku:   pulumi.String("Standard"),
// 					Name:              pulumi.String("load-balancer-name"),
// 					ResourceGroupName: pulumi.String("resource-group-name"),
// 					Type:              pulumi.String("loadBalancer"),
// 				},
// 			},
// 			ManagedServiceIdentities: azure.OceanManagedServiceIdentityArray{
// 				&azure.OceanManagedServiceIdentityArgs{
// 					Name:              pulumi.String("ocean-westus-dev-aks-agentpool"),
// 					ResourceGroupName: pulumi.String("MC_ocean-westus-dev_ocean-westus-dev-aks_westus"),
// 				},
// 			},
// 			Network: &azure.OceanNetworkArgs{
// 				NetworkInterfaces: azure.OceanNetworkNetworkInterfaceArray{
// 					&azure.OceanNetworkNetworkInterfaceArgs{
// 						AdditionalIpConfig: []map[string]interface{}{
// 							map[string]interface{}{
// 								"name":             "ip-config-name",
// 								"privateIpVersion": "ipv4",
// 							},
// 						},
// 						AssignPublicIp: pulumi.Bool(false),
// 						IsPrimary:      pulumi.Bool(false),
// 						SubnetName:     pulumi.String("subnet-name"),
// 					},
// 				},
// 				ResourceGroupName:  pulumi.String("ocean-westus-dev"),
// 				VirtualNetworkName: pulumi.String("vn-name"),
// 			},
// 			OsDisk: &azure.OceanOsDiskArgs{
// 				SizeGb: pulumi.Int(130),
// 				Type:   pulumi.String("Standard_LRS"),
// 			},
// 			ResourceGroupName: pulumi.String("some-resource-group-name"),
// 			SshPublicKey:      pulumi.String("ssh-rsa [... redacted ...] generated-by-azure"),
// 			Strategies: azure.OceanStrategyArray{
// 				&azure.OceanStrategyArgs{
// 					FallbackToOndemand: pulumi.Bool(true),
// 					SpotPercentage:     pulumi.Int(40),
// 				},
// 			},
// 			Tags: azure.OceanTagArray{
// 				&azure.OceanTagArgs{
// 					Key:   pulumi.String("Environment"),
// 					Value: pulumi.String("Dev"),
// 				},
// 			},
// 			UserName: pulumi.String("some-name"),
// 			VmSizes: azure.OceanVmSizeArray{
// 				&azure.OceanVmSizeArgs{
// 					Whitelists: pulumi.StringArray{
// 						pulumi.String("standard_ds2_v2"),
// 					},
// 				},
// 			},
// 			Zones: pulumi.StringArray{
// 				pulumi.String("1"),
// 				pulumi.String("2"),
// 				pulumi.String("3"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanId", spotinst_ocean_aks.Example.Id)
// 		return nil
// 	})
// }
// ```
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
