// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organization

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst programmatic user in the creator's organization.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/organization"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := organization.NewProgrammaticUser(ctx, "terraform_prog_user", &organization.ProgrammaticUserArgs{
//				Name:        pulumi.String("test-prog-user"),
//				Description: pulumi.String("creating programmatic user"),
//				Policies: organization.ProgrammaticUserPolicyArray{
//					&organization.ProgrammaticUserPolicyArgs{
//						PolicyId: pulumi.String("pol-g75d8c06"),
//						PolicyAccountIds: pulumi.StringArray{
//							pulumi.String("act-a1b2c3d4"),
//						},
//					},
//				},
//				UserGroupIds: pulumi.StringArray{
//					pulumi.String("ugr-abcd1234"),
//					pulumi.String("ugr-defg8763"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
type ProgrammaticUser struct {
	pulumi.CustomResourceState

	// All the accounts the programmatic user will have access to.
	// If used - Cannot be empty.
	Accounts ProgrammaticUserAccountArrayOutput `pulumi:"accounts"`
	// Brief description of the user.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the programmatic user.
	Name pulumi.StringOutput `pulumi:"name"`
	// All the policies the programmatic user will have access to.
	// If used - Cannot be empty.
	Policies ProgrammaticUserPolicyArrayOutput `pulumi:"policies"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayOutput `pulumi:"userGroupIds"`
}

// NewProgrammaticUser registers a new resource with the given unique name, arguments, and options.
func NewProgrammaticUser(ctx *pulumi.Context,
	name string, args *ProgrammaticUserArgs, opts ...pulumi.ResourceOption) (*ProgrammaticUser, error) {
	if args == nil {
		args = &ProgrammaticUserArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProgrammaticUser
	err := ctx.RegisterResource("spotinst:organization/programmaticUser:ProgrammaticUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProgrammaticUser gets an existing ProgrammaticUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProgrammaticUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProgrammaticUserState, opts ...pulumi.ResourceOption) (*ProgrammaticUser, error) {
	var resource ProgrammaticUser
	err := ctx.ReadResource("spotinst:organization/programmaticUser:ProgrammaticUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProgrammaticUser resources.
type programmaticUserState struct {
	// All the accounts the programmatic user will have access to.
	// If used - Cannot be empty.
	Accounts []ProgrammaticUserAccount `pulumi:"accounts"`
	// Brief description of the user.
	Description *string `pulumi:"description"`
	// Name of the programmatic user.
	Name *string `pulumi:"name"`
	// All the policies the programmatic user will have access to.
	// If used - Cannot be empty.
	Policies []ProgrammaticUserPolicy `pulumi:"policies"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds []string `pulumi:"userGroupIds"`
}

type ProgrammaticUserState struct {
	// All the accounts the programmatic user will have access to.
	// If used - Cannot be empty.
	Accounts ProgrammaticUserAccountArrayInput
	// Brief description of the user.
	Description pulumi.StringPtrInput
	// Name of the programmatic user.
	Name pulumi.StringPtrInput
	// All the policies the programmatic user will have access to.
	// If used - Cannot be empty.
	Policies ProgrammaticUserPolicyArrayInput
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayInput
}

func (ProgrammaticUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*programmaticUserState)(nil)).Elem()
}

type programmaticUserArgs struct {
	// All the accounts the programmatic user will have access to.
	// If used - Cannot be empty.
	Accounts []ProgrammaticUserAccount `pulumi:"accounts"`
	// Brief description of the user.
	Description *string `pulumi:"description"`
	// Name of the programmatic user.
	Name *string `pulumi:"name"`
	// All the policies the programmatic user will have access to.
	// If used - Cannot be empty.
	Policies []ProgrammaticUserPolicy `pulumi:"policies"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds []string `pulumi:"userGroupIds"`
}

// The set of arguments for constructing a ProgrammaticUser resource.
type ProgrammaticUserArgs struct {
	// All the accounts the programmatic user will have access to.
	// If used - Cannot be empty.
	Accounts ProgrammaticUserAccountArrayInput
	// Brief description of the user.
	Description pulumi.StringPtrInput
	// Name of the programmatic user.
	Name pulumi.StringPtrInput
	// All the policies the programmatic user will have access to.
	// If used - Cannot be empty.
	Policies ProgrammaticUserPolicyArrayInput
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayInput
}

func (ProgrammaticUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*programmaticUserArgs)(nil)).Elem()
}

type ProgrammaticUserInput interface {
	pulumi.Input

	ToProgrammaticUserOutput() ProgrammaticUserOutput
	ToProgrammaticUserOutputWithContext(ctx context.Context) ProgrammaticUserOutput
}

func (*ProgrammaticUser) ElementType() reflect.Type {
	return reflect.TypeOf((**ProgrammaticUser)(nil)).Elem()
}

func (i *ProgrammaticUser) ToProgrammaticUserOutput() ProgrammaticUserOutput {
	return i.ToProgrammaticUserOutputWithContext(context.Background())
}

func (i *ProgrammaticUser) ToProgrammaticUserOutputWithContext(ctx context.Context) ProgrammaticUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProgrammaticUserOutput)
}

// ProgrammaticUserArrayInput is an input type that accepts ProgrammaticUserArray and ProgrammaticUserArrayOutput values.
// You can construct a concrete instance of `ProgrammaticUserArrayInput` via:
//
//	ProgrammaticUserArray{ ProgrammaticUserArgs{...} }
type ProgrammaticUserArrayInput interface {
	pulumi.Input

	ToProgrammaticUserArrayOutput() ProgrammaticUserArrayOutput
	ToProgrammaticUserArrayOutputWithContext(context.Context) ProgrammaticUserArrayOutput
}

type ProgrammaticUserArray []ProgrammaticUserInput

func (ProgrammaticUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProgrammaticUser)(nil)).Elem()
}

func (i ProgrammaticUserArray) ToProgrammaticUserArrayOutput() ProgrammaticUserArrayOutput {
	return i.ToProgrammaticUserArrayOutputWithContext(context.Background())
}

func (i ProgrammaticUserArray) ToProgrammaticUserArrayOutputWithContext(ctx context.Context) ProgrammaticUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProgrammaticUserArrayOutput)
}

// ProgrammaticUserMapInput is an input type that accepts ProgrammaticUserMap and ProgrammaticUserMapOutput values.
// You can construct a concrete instance of `ProgrammaticUserMapInput` via:
//
//	ProgrammaticUserMap{ "key": ProgrammaticUserArgs{...} }
type ProgrammaticUserMapInput interface {
	pulumi.Input

	ToProgrammaticUserMapOutput() ProgrammaticUserMapOutput
	ToProgrammaticUserMapOutputWithContext(context.Context) ProgrammaticUserMapOutput
}

type ProgrammaticUserMap map[string]ProgrammaticUserInput

func (ProgrammaticUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProgrammaticUser)(nil)).Elem()
}

func (i ProgrammaticUserMap) ToProgrammaticUserMapOutput() ProgrammaticUserMapOutput {
	return i.ToProgrammaticUserMapOutputWithContext(context.Background())
}

func (i ProgrammaticUserMap) ToProgrammaticUserMapOutputWithContext(ctx context.Context) ProgrammaticUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProgrammaticUserMapOutput)
}

type ProgrammaticUserOutput struct{ *pulumi.OutputState }

func (ProgrammaticUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProgrammaticUser)(nil)).Elem()
}

func (o ProgrammaticUserOutput) ToProgrammaticUserOutput() ProgrammaticUserOutput {
	return o
}

func (o ProgrammaticUserOutput) ToProgrammaticUserOutputWithContext(ctx context.Context) ProgrammaticUserOutput {
	return o
}

// All the accounts the programmatic user will have access to.
// If used - Cannot be empty.
func (o ProgrammaticUserOutput) Accounts() ProgrammaticUserAccountArrayOutput {
	return o.ApplyT(func(v *ProgrammaticUser) ProgrammaticUserAccountArrayOutput { return v.Accounts }).(ProgrammaticUserAccountArrayOutput)
}

// Brief description of the user.
func (o ProgrammaticUserOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProgrammaticUser) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the programmatic user.
func (o ProgrammaticUserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProgrammaticUser) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// All the policies the programmatic user will have access to.
// If used - Cannot be empty.
func (o ProgrammaticUserOutput) Policies() ProgrammaticUserPolicyArrayOutput {
	return o.ApplyT(func(v *ProgrammaticUser) ProgrammaticUserPolicyArrayOutput { return v.Policies }).(ProgrammaticUserPolicyArrayOutput)
}

// A list of the user groups to register the given user to (should be existing user groups only)
func (o ProgrammaticUserOutput) UserGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ProgrammaticUser) pulumi.StringArrayOutput { return v.UserGroupIds }).(pulumi.StringArrayOutput)
}

type ProgrammaticUserArrayOutput struct{ *pulumi.OutputState }

func (ProgrammaticUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProgrammaticUser)(nil)).Elem()
}

func (o ProgrammaticUserArrayOutput) ToProgrammaticUserArrayOutput() ProgrammaticUserArrayOutput {
	return o
}

func (o ProgrammaticUserArrayOutput) ToProgrammaticUserArrayOutputWithContext(ctx context.Context) ProgrammaticUserArrayOutput {
	return o
}

func (o ProgrammaticUserArrayOutput) Index(i pulumi.IntInput) ProgrammaticUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProgrammaticUser {
		return vs[0].([]*ProgrammaticUser)[vs[1].(int)]
	}).(ProgrammaticUserOutput)
}

type ProgrammaticUserMapOutput struct{ *pulumi.OutputState }

func (ProgrammaticUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProgrammaticUser)(nil)).Elem()
}

func (o ProgrammaticUserMapOutput) ToProgrammaticUserMapOutput() ProgrammaticUserMapOutput {
	return o
}

func (o ProgrammaticUserMapOutput) ToProgrammaticUserMapOutputWithContext(ctx context.Context) ProgrammaticUserMapOutput {
	return o
}

func (o ProgrammaticUserMapOutput) MapIndex(k pulumi.StringInput) ProgrammaticUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProgrammaticUser {
		return vs[0].(map[string]*ProgrammaticUser)[vs[1].(string)]
	}).(ProgrammaticUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProgrammaticUserInput)(nil)).Elem(), &ProgrammaticUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProgrammaticUserArrayInput)(nil)).Elem(), ProgrammaticUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProgrammaticUserMapInput)(nil)).Elem(), ProgrammaticUserMap{})
	pulumi.RegisterOutputType(ProgrammaticUserOutput{})
	pulumi.RegisterOutputType(ProgrammaticUserArrayOutput{})
	pulumi.RegisterOutputType(ProgrammaticUserMapOutput{})
}
