module github.com/pulumi/pulumi-spotinst/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
	github.com/spotinst/terraform-provider-spotinst v1.32.0
)

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
	github.com/spotinst/terraform-provider-spotinst => github.com/pulumi/terraform-provider-spotinst v1.33.1-0.20210429195502-d15ec9bf741c
	golang.org/x/crypto => golang.org/x/crypto v0.0.0-20200117160349-530e935923ad
	golang.org/x/sys => golang.org/x/sys v0.0.0-20190412213103-97732733099d
)
