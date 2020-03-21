// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package gke

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a custom Spotinst Ocean GKE Launch Spec resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_gke_launch_spec.html.markdown.
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
	if args == nil || args.Metadatas == nil {
		return nil, errors.New("missing required argument 'Metadatas'")
	}
	if args == nil || args.OceanId == nil {
		return nil, errors.New("missing required argument 'OceanId'")
	}
	if args == nil || args.SourceImage == nil {
		return nil, errors.New("missing required argument 'SourceImage'")
	}
	if args == nil {
		args = &OceanLaunchSpecArgs{}
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

