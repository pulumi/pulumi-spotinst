// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package multai

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Spotinst Multai Routing Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-spotinst/sdk/v2/go/spotinst/multai"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := multai.NewRoutingRule(ctx, "myRoutingRule", &multai.RoutingRuleArgs{
// 			BalancerId: pulumi.String("b-12345"),
// 			ListenerId: pulumi.String("l-98765"),
// 			Route:      pulumi.String("Path(`/bar`)"),
// 			Strategy:   pulumi.String("LEASTCONN"),
// 			Tags: multai.RoutingRuleTagArray{
// 				&multai.RoutingRuleTagArgs{
// 					Key:   pulumi.String("env"),
// 					Value: pulumi.String("prod"),
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
type RoutingRule struct {
	pulumi.CustomResourceState

	// The ID of the balancer.
	BalancerId pulumi.StringOutput `pulumi:"balancerId"`
	// The ID of the listener.
	ListenerId    pulumi.StringOutput      `pulumi:"listenerId"`
	MiddlewareIds pulumi.StringArrayOutput `pulumi:"middlewareIds"`
	Priority      pulumi.IntPtrOutput      `pulumi:"priority"`
	// Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
	Route pulumi.StringOutput `pulumi:"route"`
	// Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
	Strategy pulumi.StringPtrOutput `pulumi:"strategy"`
	// A list of key:value paired tags.
	Tags         RoutingRuleTagArrayOutput `pulumi:"tags"`
	TargetSetIds pulumi.StringArrayOutput  `pulumi:"targetSetIds"`
}

// NewRoutingRule registers a new resource with the given unique name, arguments, and options.
func NewRoutingRule(ctx *pulumi.Context,
	name string, args *RoutingRuleArgs, opts ...pulumi.ResourceOption) (*RoutingRule, error) {
	if args == nil || args.BalancerId == nil {
		return nil, errors.New("missing required argument 'BalancerId'")
	}
	if args == nil || args.ListenerId == nil {
		return nil, errors.New("missing required argument 'ListenerId'")
	}
	if args == nil || args.Route == nil {
		return nil, errors.New("missing required argument 'Route'")
	}
	if args == nil || args.TargetSetIds == nil {
		return nil, errors.New("missing required argument 'TargetSetIds'")
	}
	if args == nil {
		args = &RoutingRuleArgs{}
	}
	var resource RoutingRule
	err := ctx.RegisterResource("spotinst:multai/routingRule:RoutingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRoutingRule gets an existing RoutingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRoutingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RoutingRuleState, opts ...pulumi.ResourceOption) (*RoutingRule, error) {
	var resource RoutingRule
	err := ctx.ReadResource("spotinst:multai/routingRule:RoutingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RoutingRule resources.
type routingRuleState struct {
	// The ID of the balancer.
	BalancerId *string `pulumi:"balancerId"`
	// The ID of the listener.
	ListenerId    *string  `pulumi:"listenerId"`
	MiddlewareIds []string `pulumi:"middlewareIds"`
	Priority      *int     `pulumi:"priority"`
	// Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
	Route *string `pulumi:"route"`
	// Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
	Strategy *string `pulumi:"strategy"`
	// A list of key:value paired tags.
	Tags         []RoutingRuleTag `pulumi:"tags"`
	TargetSetIds []string         `pulumi:"targetSetIds"`
}

type RoutingRuleState struct {
	// The ID of the balancer.
	BalancerId pulumi.StringPtrInput
	// The ID of the listener.
	ListenerId    pulumi.StringPtrInput
	MiddlewareIds pulumi.StringArrayInput
	Priority      pulumi.IntPtrInput
	// Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
	Route pulumi.StringPtrInput
	// Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
	Strategy pulumi.StringPtrInput
	// A list of key:value paired tags.
	Tags         RoutingRuleTagArrayInput
	TargetSetIds pulumi.StringArrayInput
}

func (RoutingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*routingRuleState)(nil)).Elem()
}

type routingRuleArgs struct {
	// The ID of the balancer.
	BalancerId string `pulumi:"balancerId"`
	// The ID of the listener.
	ListenerId    string   `pulumi:"listenerId"`
	MiddlewareIds []string `pulumi:"middlewareIds"`
	Priority      *int     `pulumi:"priority"`
	// Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
	Route string `pulumi:"route"`
	// Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
	Strategy *string `pulumi:"strategy"`
	// A list of key:value paired tags.
	Tags         []RoutingRuleTag `pulumi:"tags"`
	TargetSetIds []string         `pulumi:"targetSetIds"`
}

// The set of arguments for constructing a RoutingRule resource.
type RoutingRuleArgs struct {
	// The ID of the balancer.
	BalancerId pulumi.StringInput
	// The ID of the listener.
	ListenerId    pulumi.StringInput
	MiddlewareIds pulumi.StringArrayInput
	Priority      pulumi.IntPtrInput
	// Route defines a simple language for matching HTTP requests and route the traffic accordingly. Route provides series of matchers that follow the syntax: Path matcher: — Path("/foo/bar") // trie-based PathRegexp(“/foo/.*”) // regexp-based Method matcher: — Method(“GET”) // trie-based MethodRegexp(“POST|PUT”) // regexp based Header matcher: — Header(“Content-Type”, “application/json”) // trie-based HeaderRegexp(“Content-Type”, “application/.*”) // regexp based Matchers can be combined using && operator: — Method(“POST”) && Path("/v1")
	Route pulumi.StringInput
	// Balancing strategy. Valid values: `ROUNDROBIN`, `RANDOM`, `LEASTCONN`, `IPHASH`.
	Strategy pulumi.StringPtrInput
	// A list of key:value paired tags.
	Tags         RoutingRuleTagArrayInput
	TargetSetIds pulumi.StringArrayInput
}

func (RoutingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routingRuleArgs)(nil)).Elem()
}
