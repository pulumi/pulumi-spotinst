module github.com/pulumi/pulumi-spotinst

go 1.12

replace (
	github.com/Nvveen/Gotty => github.com/ijc25/Gotty v0.0.0-20170406111628-a8b993ba6abd
	github.com/golang/glog => github.com/pulumi/glog v0.0.0-20180820174630-7eaa6ffb71e4
)

require (
	cloud.google.com/go/logging v1.0.0 // indirect
	github.com/hashicorp/terraform v0.12.7
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.3.3
	github.com/pulumi/pulumi-terraform v0.18.4-0.20191115184530-83833225a877
	github.com/stretchr/testify v1.4.0
	github.com/terraform-providers/terraform-provider-spotinst v1.13.4
)
