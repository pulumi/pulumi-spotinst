module github.com/pulumi/pulumi-spotinst/provider/v2

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.7.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.1.0
	github.com/pulumi/pulumi/sdk/v2 v2.0.1-0.20200424001829-090f390d7b1a
	github.com/terraform-providers/terraform-provider-spotinst v1.14.3
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200117160349-530e935923ad
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190412213103-97732733099d
)
