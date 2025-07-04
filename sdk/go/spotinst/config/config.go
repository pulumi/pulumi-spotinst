// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// Spotinst Account ID
func GetAccount(ctx *pulumi.Context) string {
	return config.Get(ctx, "spotinst:account")
}

// Enable or disable the Spotinst provider
func GetEnabled(ctx *pulumi.Context) bool {
	return config.GetBool(ctx, "spotinst:enabled")
}

// Spotinst SDK Feature Flags
func GetFeatureFlags(ctx *pulumi.Context) string {
	return config.Get(ctx, "spotinst:featureFlags")
}

// Spotinst Personal API Access Token
func GetToken(ctx *pulumi.Context) string {
	return config.Get(ctx, "spotinst:token")
}
