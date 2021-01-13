// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package gke

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a custom Spotinst Ocean GKE Launch Spec resource.
//
// ## Example Usage
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
// 		_, err := gke.NewOceanLaunchSpec(ctx, "example", &gke.OceanLaunchSpecArgs{
// 			AutoscaleHeadrooms: gke.OceanLaunchSpecAutoscaleHeadroomArray{
// 				&gke.OceanLaunchSpecAutoscaleHeadroomArgs{
// 					CpuPerUnit:    pulumi.Int(1000),
// 					GpuPerUnit:    pulumi.Int(0),
// 					MemoryPerUnit: pulumi.Int(2048),
// 					NumOfUnits:    pulumi.Int(5),
// 				},
// 			},
// 			Labels: gke.OceanLaunchSpecLabelArray{
// 				&gke.OceanLaunchSpecLabelArgs{
// 					Key:   pulumi.String("labelKey"),
// 					Value: pulumi.String("labelVal"),
// 				},
// 			},
// 			Metadatas: gke.OceanLaunchSpecMetadataArray{
// 				&gke.OceanLaunchSpecMetadataArgs{
// 					Key:   pulumi.String("gci-update-strategy"),
// 					Value: pulumi.String("update_disabled"),
// 				},
// 			},
// 			OceanId:     pulumi.String("o-123456"),
// 			SourceImage: pulumi.String("image"),
// 			Taints: gke.OceanLaunchSpecTaintArray{
// 				&gke.OceanLaunchSpecTaintArgs{
// 					Effect: pulumi.String("taintEffect"),
// 					Key:    pulumi.String("taintKey"),
// 					Value:  pulumi.String("taintVal"),
// 				},
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
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		ctx.Export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec.Example.Id)
// 		return nil
// 	})
// }
// ```
type OceanLaunchSpec struct {
	pulumi.CustomResourceState

	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayOutput `pulumi:"autoscaleHeadrooms"`
	// Cluster's labels.
	Labels OceanLaunchSpecLabelArrayOutput `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayOutput `pulumi:"metadatas"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringOutput `pulumi:"oceanId"`
	// Image URL.
	SourceImage pulumi.StringOutput `pulumi:"sourceImage"`
	// Cluster's taints.
	Taints OceanLaunchSpecTaintArrayOutput `pulumi:"taints"`
}

// NewOceanLaunchSpec registers a new resource with the given unique name, arguments, and options.
func NewOceanLaunchSpec(ctx *pulumi.Context,
	name string, args *OceanLaunchSpecArgs, opts ...pulumi.ResourceOption) (*OceanLaunchSpec, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Metadatas == nil {
		return nil, errors.New("invalid value for required argument 'Metadatas'")
	}
	if args.OceanId == nil {
		return nil, errors.New("invalid value for required argument 'OceanId'")
	}
	if args.SourceImage == nil {
		return nil, errors.New("invalid value for required argument 'SourceImage'")
	}
	var resource OceanLaunchSpec
	err := ctx.RegisterResource("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOceanLaunchSpec gets an existing OceanLaunchSpec resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOceanLaunchSpec(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OceanLaunchSpecState, opts ...pulumi.ResourceOption) (*OceanLaunchSpec, error) {
	var resource OceanLaunchSpec
	err := ctx.ReadResource("spotinst:gke/oceanLaunchSpec:OceanLaunchSpec", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OceanLaunchSpec resources.
type oceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Cluster's labels.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId *string `pulumi:"oceanId"`
	// Image URL.
	SourceImage *string `pulumi:"sourceImage"`
	// Cluster's taints.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
}

type OceanLaunchSpecState struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Cluster's labels.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringPtrInput
	// Image URL.
	SourceImage pulumi.StringPtrInput
	// Cluster's taints.
	Taints OceanLaunchSpecTaintArrayInput
}

func (OceanLaunchSpecState) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecState)(nil)).Elem()
}

type oceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms []OceanLaunchSpecAutoscaleHeadroom `pulumi:"autoscaleHeadrooms"`
	// Cluster's labels.
	Labels []OceanLaunchSpecLabel `pulumi:"labels"`
	// Cluster's metadata.
	Metadatas []OceanLaunchSpecMetadata `pulumi:"metadatas"`
	// The Ocean cluster ID required for launchSpec create.
	OceanId string `pulumi:"oceanId"`
	// Image URL.
	SourceImage string `pulumi:"sourceImage"`
	// Cluster's taints.
	Taints []OceanLaunchSpecTaint `pulumi:"taints"`
}

// The set of arguments for constructing a OceanLaunchSpec resource.
type OceanLaunchSpecArgs struct {
	// Set custom headroom per launch spec. provide list of headrooms object.
	AutoscaleHeadrooms OceanLaunchSpecAutoscaleHeadroomArrayInput
	// Cluster's labels.
	Labels OceanLaunchSpecLabelArrayInput
	// Cluster's metadata.
	Metadatas OceanLaunchSpecMetadataArrayInput
	// The Ocean cluster ID required for launchSpec create.
	OceanId pulumi.StringInput
	// Image URL.
	SourceImage pulumi.StringInput
	// Cluster's taints.
	Taints OceanLaunchSpecTaintArrayInput
}

func (OceanLaunchSpecArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oceanLaunchSpecArgs)(nil)).Elem()
}

type OceanLaunchSpecInput interface {
	pulumi.Input

	ToOceanLaunchSpecOutput() OceanLaunchSpecOutput
	ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput
}

func (OceanLaunchSpec) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpec)(nil)).Elem()
}

func (i OceanLaunchSpec) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return i.ToOceanLaunchSpecOutputWithContext(context.Background())
}

func (i OceanLaunchSpec) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OceanLaunchSpecOutput)
}

type OceanLaunchSpecOutput struct {
	*pulumi.OutputState
}

func (OceanLaunchSpecOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*OceanLaunchSpecOutput)(nil)).Elem()
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutput() OceanLaunchSpecOutput {
	return o
}

func (o OceanLaunchSpecOutput) ToOceanLaunchSpecOutputWithContext(ctx context.Context) OceanLaunchSpecOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(OceanLaunchSpecOutput{})
}
