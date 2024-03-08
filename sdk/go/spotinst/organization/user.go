// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package organization

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Spotinst User in the creator's organization.
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
//			_, err := organization.NewUser(ctx, "terraformUser", &organization.UserArgs{
//				Email:     pulumi.String("abc@xyz.com"),
//				FirstName: pulumi.String("test"),
//				LastName:  pulumi.String("user"),
//				Password:  pulumi.String("testUser@123"),
//				Policies: organization.UserPolicyArray{
//					&organization.UserPolicyArgs{
//						PolicyAccountIds: pulumi.StringArray{
//							pulumi.String("act-abcf4245"),
//						},
//						PolicyId: pulumi.String("pol-abcd1236"),
//					},
//				},
//				Role: pulumi.String("viewer"),
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
type User struct {
	pulumi.CustomResourceState

	// Email.
	Email pulumi.StringOutput `pulumi:"email"`
	// The first name of the user.
	FirstName pulumi.StringOutput `pulumi:"firstName"`
	// The last name of the user.
	LastName pulumi.StringOutput `pulumi:"lastName"`
	// Password.
	Password pulumi.StringOutput `pulumi:"password"`
	// The policies to register under the given group
	// (should be existing policies only).
	Policies UserPolicyArrayOutput `pulumi:"policies"`
	// User's role.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayOutput `pulumi:"userGroupIds"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.FirstName == nil {
		return nil, errors.New("invalid value for required argument 'FirstName'")
	}
	if args.LastName == nil {
		return nil, errors.New("invalid value for required argument 'LastName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("spotinst:organization/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("spotinst:organization/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Email.
	Email *string `pulumi:"email"`
	// The first name of the user.
	FirstName *string `pulumi:"firstName"`
	// The last name of the user.
	LastName *string `pulumi:"lastName"`
	// Password.
	Password *string `pulumi:"password"`
	// The policies to register under the given group
	// (should be existing policies only).
	Policies []UserPolicy `pulumi:"policies"`
	// User's role.
	Role *string `pulumi:"role"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds []string `pulumi:"userGroupIds"`
}

type UserState struct {
	// Email.
	Email pulumi.StringPtrInput
	// The first name of the user.
	FirstName pulumi.StringPtrInput
	// The last name of the user.
	LastName pulumi.StringPtrInput
	// Password.
	Password pulumi.StringPtrInput
	// The policies to register under the given group
	// (should be existing policies only).
	Policies UserPolicyArrayInput
	// User's role.
	Role pulumi.StringPtrInput
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Email.
	Email string `pulumi:"email"`
	// The first name of the user.
	FirstName string `pulumi:"firstName"`
	// The last name of the user.
	LastName string `pulumi:"lastName"`
	// Password.
	Password *string `pulumi:"password"`
	// The policies to register under the given group
	// (should be existing policies only).
	Policies []UserPolicy `pulumi:"policies"`
	// User's role.
	Role *string `pulumi:"role"`
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds []string `pulumi:"userGroupIds"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Email.
	Email pulumi.StringInput
	// The first name of the user.
	FirstName pulumi.StringInput
	// The last name of the user.
	LastName pulumi.StringInput
	// Password.
	Password pulumi.StringPtrInput
	// The policies to register under the given group
	// (should be existing policies only).
	Policies UserPolicyArrayInput
	// User's role.
	Role pulumi.StringPtrInput
	// A list of the user groups to register the given user to (should be existing user groups only)
	UserGroupIds pulumi.StringArrayInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// Email.
func (o UserOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// The first name of the user.
func (o UserOutput) FirstName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.FirstName }).(pulumi.StringOutput)
}

// The last name of the user.
func (o UserOutput) LastName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.LastName }).(pulumi.StringOutput)
}

// Password.
func (o UserOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// The policies to register under the given group
// (should be existing policies only).
func (o UserOutput) Policies() UserPolicyArrayOutput {
	return o.ApplyT(func(v *User) UserPolicyArrayOutput { return v.Policies }).(UserPolicyArrayOutput)
}

// User's role.
func (o UserOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

// A list of the user groups to register the given user to (should be existing user groups only)
func (o UserOutput) UserGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.UserGroupIds }).(pulumi.StringArrayOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
