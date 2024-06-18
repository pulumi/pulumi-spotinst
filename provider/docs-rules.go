package spotinst

import (
	"bytes"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"regexp"
)

var anchorRegexp = regexp.MustCompile(`<a id=\"[a-zA-Z0-9-]*\"></a>`)
var removeAnchors = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = anchorRegexp.ReplaceAllLiteral(content, nil)
		return content, nil
	},
}
var fixupOcean = tfbridge.DocsEdit{
	Path: "ocean_*.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		// We need to remove the headers, as they make it impossible for docs detection to associate correctly.
		// Because this file otherwise indents all fields correctly within Markdown, nested docs can then be detected.
		replaces := []string{
			"## Auto Scaler",
			"## Autoscaler",
			"## Scheduled Task",
			"## Attach LoadBalancer",
			"## Detach LoadBalancer",
			"## Update Policy",
			"## scheduled task",
			"## Strategy",
			"## Scheduled task",
			"## Block Devices",
		}
		for _, v := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(v),
				[]byte(""),
			)
		}
		content = bytes.ReplaceAll(content,
			[]byte("terraform-ecs-cluster"),
			[]byte("sample-ecs-cluster"),
		)
		return content, nil
	},
}

type replace struct {
	old string
	new string
}

var fixUpElastigroup = tfbridge.DocsEdit{
	Path: "elastigroup_*.md",
	Edit: func(path string, content []byte) ([]byte, error) {

		content = bytes.Replace(content,
			[]byte("## Stateful"),
			[]byte("### Stateful"),
			1,
		)
		replaces := []replace{
			{
				"## Load Balancers",
				"### Load Balancers",
			},
			{
				"## Signals",
				"### Signals\n\nEach `signal` supports the following:\n",
			},

			{"## Scheduled Tasks",
				"### Scheduled Tasks\n\nEach `scheduled_task` supports the following:\n",
			},
			{
				"## Scaling Policies",
				"### Scaling Policies\n\n `scaling_up_policy` supports the following:\n",
			},
			{
				"## Network Interfaces",
				"### Network Interfaces\n\n `network_interface` supports the following:\n",
			},
			{
				"## Block Devices",
				"### Block Devices",
			},
			{
				"## Stateful Deallocation\n\n* `stateful_deallocation` - (Optional)\n",
				"### Stateful Deallocation\n\n `stateful_deallocation` supports the following:\n",
			},
			{
				"## Stateful Instance Action\n\n* `stateful_instance_action` - (Optional)\n",
				"### Stateful Instance Action\n\n `stateful_instance_action` supports the following:\n",
			},
			{
				"## Health Check",
				"### Health Check",
			},
			{
				"## Third-Party Integrations",
				"### Third-Party Integrations",
			},
			{
				"## Update Policy\n\n* `update_policy` - (Optional)\n",
				"### Update Policy\n\n `update_policy` supports the following:\n",
			},
			{
				"## GPU\n\n* `gpu` - (Optional) Defines the GPU configuration.\n",
				"### GPU\n\n `gpu` supports the following:\n",
			},
			{
				"## Backend Services\n\n* `backend_services` - (Optional) Describes the backend service configurations.\n",
				"### Backend Services\n\n `backend_services` supports the following:\n",
			},
			{
				"## Disks\n\n* `disks` - (Optional) Array of disks associated with this instance. Persistent disks must be created before you can assign them.\n",
				"### Disks\n\n `disk` supports the following:\n",
			},
			{
				"## Diff-suppressed Parameters",
				"### Diff-suppressed Parameters",
			},
			{
				"description = \"created by Terraform\"",
				"description = \"created by Pulumi\"",
			},
			{
				"terraform-acc-test-cluster",
				"sample-acc-test-cluster",
			},
		}
		for _, replace := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(replace.old),
				[]byte(replace.new),
			)
		}
		return content, nil
	},
}

var fixupMrScaler = tfbridge.DocsEdit{
	Path: "mrscaler_aws.md",
	Edit: func(_ string, content []byte) ([]byte, error) {

		replaces := []replace{
			{
				"## Example Usage - Clone Strategy",
				"## Example Usage\n\n### New Strategy",
			},
			{
				"Terraform-MrScaler-01",
				"sample-MrScaler-01",
			},
			{
				"Testing MrScaler creation via Terraform",
				"Testing MrScaler creation"},
			{
				"bucket = \"terraform-emr-test\"",
				"bucket = \"sample-emr-test\"",
			},
			{
				"value = \"Terraform\"",
				"value = \"Pulumi\"",
			},
			{
				"## Example Usage - Clone Strategy",
				"### Clone Strategy",
			},
			{
				"value = \"${spotinst_mrscaler_aws.Terraform-MrScaler-01",
				"value = \"${spotinst_mrscaler_aws.sample-MrScaler-01",
			},
			{
				"## Example Usage - Wrap Strategy",
				"### Wrap Strategy",
			},
			{
				"description = \"created by Terraform\"",
				"description = \"created by Pulumi\"",
			},
			{
				"`expose_cluster_id` - (Optional) Allow the `cluster_id` to set a Terraform output variable.",
				"`expose_cluster_id` - (Optional) Allow the `cluster_id` to set a provider output variable.",
			},
			{
				"## Provisioning Timeout",
				"### Provisioning Timeout",
			},
			{
				"## Cluster Configuration",
				"### Cluster Configuration",
			},
			{
				"## Task Group",
				"### Task Group",
			},
			{
				"## Core Group",
				"### Core Group",
			},
			{
				"## Master Group",
				"### Master Group",
			},
			{
				"## Tags",
				"### Tags",
			},
			{
				"## Optional Compute Parameters",
				"### Optional Compute Parameters",
			},
			{
				"## Availability Zones",
				"### Availability Zones",
			},
			{
				"## Configurations",
				"### Configurations",
			},
			{
				"## Steps",
				"### Steps",
			},
			{
				"## Bootstrap Actions",
				"### Bootstrap Actions",
			},
			{
				"## Scaling Policies",
				"### Scaling Policies",
			},
			{
				"## Scheduled Tasks",
				"### Scheduled Tasks",
			},
			{
				"## termination policies",
				"### termination policies",
			},
			{
				"## termination policies\n\n## Example Usage",
				"### termination policies",
			},
		}
		for _, replace := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(replace.old),
				[]byte(replace.new),
			)
		}
		return content, nil
	},
}

var fixUpStatefulNode = tfbridge.DocsEdit{
	Path: "stateful_node_aws.md",
	Edit: func(path string, content []byte) ([]byte, error) {
		replaces := []replace{
			{
				"description = \"created by Terraform\"",
				"description = \"created by Pulumi\"",
			},
			{
				"## Block Device Mapping",
				"### Block Device Mapping",
			},
			{
				"## Resource Tag Specification",
				"### Resource Tag Specification",
			},
			{
				"## Network Interface",
				"### Network Interface",
			},
			{
				"## Scheduled Tasks",
				"### Scheduled Tasks",
			},
			{
				"## Load Balancers",
				"### Load Balancers",
			},
			{
				"## Route53",
				"### Route53",
			},
			{
				"## Managed Instance Action",
				"### Managed Instance Action",
			},
		}
		for _, replace := range replaces {
			content = bytes.ReplaceAll(
				content,
				[]byte(replace.old),
				[]byte(replace.new),
			)
		}
		return content, nil
	},
}

var fixupHealthCheck = tfbridge.DocsEdit{
	Path: "health_check.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = bytes.ReplaceAll(content,
			[]byte("terraform_healt_cheack"),
			[]byte("sample_health_check"),
		)
		return content, nil
	},
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults, fixUpElastigroup, fixupOcean, fixupMrScaler, fixUpStatefulNode, fixupHealthCheck, removeAnchors)
}
