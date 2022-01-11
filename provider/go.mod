module github.com/pulumi/pulumi-spotinst/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.17.0
	github.com/spotinst/terraform-provider-spotinst v1.32.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/spotinst/terraform-provider-spotinst => github.com/pulumi/terraform-provider-spotinst v1.33.1-0.20220111211338-d9c8e8d79934
)
