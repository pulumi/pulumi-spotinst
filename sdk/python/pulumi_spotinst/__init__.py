# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .account import *
from .credentials_gcp import *
from .data_integration import *
from .elastigroup_azure_v3 import *
from .health_check import *
from .ocean_right_sizing_rule import *
from .provider import *
from .stateful_node_azure import *
from .subscription import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_spotinst.aws as __aws
    aws = __aws
    import pulumi_spotinst.azure as __azure
    azure = __azure
    import pulumi_spotinst.config as __config
    config = __config
    import pulumi_spotinst.ecs as __ecs
    ecs = __ecs
    import pulumi_spotinst.gcp as __gcp
    gcp = __gcp
    import pulumi_spotinst.gke as __gke
    gke = __gke
    import pulumi_spotinst.oceancd as __oceancd
    oceancd = __oceancd
    import pulumi_spotinst.organization as __organization
    organization = __organization
    import pulumi_spotinst.spark as __spark
    spark = __spark
else:
    aws = _utilities.lazy_import('pulumi_spotinst.aws')
    azure = _utilities.lazy_import('pulumi_spotinst.azure')
    config = _utilities.lazy_import('pulumi_spotinst.config')
    ecs = _utilities.lazy_import('pulumi_spotinst.ecs')
    gcp = _utilities.lazy_import('pulumi_spotinst.gcp')
    gke = _utilities.lazy_import('pulumi_spotinst.gke')
    oceancd = _utilities.lazy_import('pulumi_spotinst.oceancd')
    organization = _utilities.lazy_import('pulumi_spotinst.organization')
    spark = _utilities.lazy_import('pulumi_spotinst.spark')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "spotinst",
  "mod": "aws/account",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/account:Account": "Account"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/beanstalk",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/beanstalk:Beanstalk": "Beanstalk"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/credentials",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/credentials:Credentials": "Credentials"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/elastigroup",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/elastigroup:Elastigroup": "Elastigroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/managedInstance",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/managedInstance:ManagedInstance": "ManagedInstance"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/mrScalar",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/mrScalar:MrScalar": "MrScalar"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/ocean",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/ocean:Ocean": "Ocean"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/oceanExtendedResourceDefinition",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/oceanExtendedResourceDefinition:OceanExtendedResourceDefinition": "OceanExtendedResourceDefinition"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/oceanLaunchSpec",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/oceanLaunchSpec:OceanLaunchSpec": "OceanLaunchSpec"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "aws/suspension",
  "fqn": "pulumi_spotinst.aws",
  "classes": {
   "spotinst:aws/suspension:Suspension": "Suspension"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "azure/oceanNp",
  "fqn": "pulumi_spotinst.azure",
  "classes": {
   "spotinst:azure/oceanNp:OceanNp": "OceanNp"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "azure/oceanNpVirtualNodeGroup",
  "fqn": "pulumi_spotinst.azure",
  "classes": {
   "spotinst:azure/oceanNpVirtualNodeGroup:OceanNpVirtualNodeGroup": "OceanNpVirtualNodeGroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "ecs/ocean",
  "fqn": "pulumi_spotinst.ecs",
  "classes": {
   "spotinst:ecs/ocean:Ocean": "Ocean"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "ecs/oceanLaunchSpec",
  "fqn": "pulumi_spotinst.ecs",
  "classes": {
   "spotinst:ecs/oceanLaunchSpec:OceanLaunchSpec": "OceanLaunchSpec"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "gcp/elastigroup",
  "fqn": "pulumi_spotinst.gcp",
  "classes": {
   "spotinst:gcp/elastigroup:Elastigroup": "Elastigroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "gke/elastigroup",
  "fqn": "pulumi_spotinst.gke",
  "classes": {
   "spotinst:gke/elastigroup:Elastigroup": "Elastigroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "gke/oceanImport",
  "fqn": "pulumi_spotinst.gke",
  "classes": {
   "spotinst:gke/oceanImport:OceanImport": "OceanImport"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "gke/oceanLaunchSpec",
  "fqn": "pulumi_spotinst.gke",
  "classes": {
   "spotinst:gke/oceanLaunchSpec:OceanLaunchSpec": "OceanLaunchSpec"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "gke/oceanLaunchSpecImport",
  "fqn": "pulumi_spotinst.gke",
  "classes": {
   "spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport": "OceanLaunchSpecImport"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/account",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/account:Account": "Account"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/credentialsGcp",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/credentialsGcp:CredentialsGcp": "CredentialsGcp"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/dataIntegration",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/dataIntegration:DataIntegration": "DataIntegration"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/elastigroupAzureV3",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/elastigroupAzureV3:ElastigroupAzureV3": "ElastigroupAzureV3"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/healthCheck",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/healthCheck:HealthCheck": "HealthCheck"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/oceanRightSizingRule",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/oceanRightSizingRule:OceanRightSizingRule": "OceanRightSizingRule"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/statefulNodeAzure",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/statefulNodeAzure:StatefulNodeAzure": "StatefulNodeAzure"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "index/subscription",
  "fqn": "pulumi_spotinst",
  "classes": {
   "spotinst:index/subscription:Subscription": "Subscription"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "oceancd/rolloutSpec",
  "fqn": "pulumi_spotinst.oceancd",
  "classes": {
   "spotinst:oceancd/rolloutSpec:RolloutSpec": "RolloutSpec"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "oceancd/strategy",
  "fqn": "pulumi_spotinst.oceancd",
  "classes": {
   "spotinst:oceancd/strategy:Strategy": "Strategy"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "oceancd/verificationProvider",
  "fqn": "pulumi_spotinst.oceancd",
  "classes": {
   "spotinst:oceancd/verificationProvider:VerificationProvider": "VerificationProvider"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "oceancd/verificationTemplate",
  "fqn": "pulumi_spotinst.oceancd",
  "classes": {
   "spotinst:oceancd/verificationTemplate:VerificationTemplate": "VerificationTemplate"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "organization/policy",
  "fqn": "pulumi_spotinst.organization",
  "classes": {
   "spotinst:organization/policy:Policy": "Policy"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "organization/programmaticUser",
  "fqn": "pulumi_spotinst.organization",
  "classes": {
   "spotinst:organization/programmaticUser:ProgrammaticUser": "ProgrammaticUser"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "organization/user",
  "fqn": "pulumi_spotinst.organization",
  "classes": {
   "spotinst:organization/user:User": "User"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "organization/userGroup",
  "fqn": "pulumi_spotinst.organization",
  "classes": {
   "spotinst:organization/userGroup:UserGroup": "UserGroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "spark/ocean",
  "fqn": "pulumi_spotinst.spark",
  "classes": {
   "spotinst:spark/ocean:Ocean": "Ocean"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "spark/oceanVirtualNodeGroup",
  "fqn": "pulumi_spotinst.spark",
  "classes": {
   "spotinst:spark/oceanVirtualNodeGroup:OceanVirtualNodeGroup": "OceanVirtualNodeGroup"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "spotinst",
  "token": "pulumi:providers:spotinst",
  "fqn": "pulumi_spotinst",
  "class": "Provider"
 }
]
"""
)
