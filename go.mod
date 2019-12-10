module github.com/pulumi/pulumi-spotinst

go 1.12

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/Azure/go-autorest/autorest v0.9.3 // indirect
	github.com/Azure/go-autorest/autorest/azure/auth v0.4.1 // indirect
	github.com/hashicorp/terraform v0.12.7
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.6.0
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191202134852-87cfb4dc8ae1
	github.com/stretchr/testify v1.4.0
	github.com/terraform-providers/terraform-provider-spotinst v1.13.4
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
