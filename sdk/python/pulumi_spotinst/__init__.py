# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .data_integration import *
from .elastigroup_azure_v3 import *
from .health_check import *
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
    import pulumi_spotinst.multai as __multai
    multai = __multai
    import pulumi_spotinst.spark as __spark
    spark = __spark
else:
    aws = _utilities.lazy_import('pulumi_spotinst.aws')
    azure = _utilities.lazy_import('pulumi_spotinst.azure')
    config = _utilities.lazy_import('pulumi_spotinst.config')
    ecs = _utilities.lazy_import('pulumi_spotinst.ecs')
    gcp = _utilities.lazy_import('pulumi_spotinst.gcp')
    gke = _utilities.lazy_import('pulumi_spotinst.gke')
    multai = _utilities.lazy_import('pulumi_spotinst.multai')
    spark = _utilities.lazy_import('pulumi_spotinst.spark')

_utilities.register(
    resource_modules="""
[
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
  "mod": "azure/elastigroup",
  "fqn": "pulumi_spotinst.azure",
  "classes": {
   "spotinst:azure/elastigroup:Elastigroup": "Elastigroup"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "azure/ocean",
  "fqn": "pulumi_spotinst.azure",
  "classes": {
   "spotinst:azure/ocean:Ocean": "Ocean"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "azure/oceanVirtualNodeGroup",
  "fqn": "pulumi_spotinst.azure",
  "classes": {
   "spotinst:azure/oceanVirtualNodeGroup:OceanVirtualNodeGroup": "OceanVirtualNodeGroup"
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
  "mod": "multai/balancer",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/balancer:Balancer": "Balancer"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "multai/deployment",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/deployment:Deployment": "Deployment"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "multai/listener",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/listener:Listener": "Listener"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "multai/routingRule",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/routingRule:RoutingRule": "RoutingRule"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "multai/target",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/target:Target": "Target"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "multai/targetSet",
  "fqn": "pulumi_spotinst.multai",
  "classes": {
   "spotinst:multai/targetSet:TargetSet": "TargetSet"
  }
 },
 {
  "pkg": "spotinst",
  "mod": "spark/ocean",
  "fqn": "pulumi_spotinst.spark",
  "classes": {
   "spotinst:spark/ocean:Ocean": "Ocean"
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
