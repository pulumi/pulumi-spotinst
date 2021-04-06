module github.com/pulumi/pulumi-spotinst/provider/v2

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.16.1
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.22.1
	github.com/pulumi/pulumi/sdk/v2 v2.22.1-0.20210310211618-1f16423ede4c
	github.com/spotinst/terraform-provider-spotinst v1.32.0
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/spotinst/terraform-provider-spotinst => github.com/pulumi/terraform-provider-spotinst v1.33.1-0.20210406142723-26f1172c2b39
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200117160349-530e935923ad
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190412213103-97732733099d
)
