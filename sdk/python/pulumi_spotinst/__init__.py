# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .elastigroup_azure_v3 import *
from .health_check import *
from .provider import *
from .subscription import *
from ._inputs import *
from . import outputs

# Make subpackages available:
from . import (
    aws,
    azure,
    config,
    ecs,
    gcp,
    gke,
    multai,
)

def _register_module():
    import pulumi
    from . import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "spotinst:index/elastigroupAzureV3:ElastigroupAzureV3":
                return ElastigroupAzureV3(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:index/healthCheck:HealthCheck":
                return HealthCheck(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:index/subscription:Subscription":
                return Subscription(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("spotinst", "index/elastigroupAzureV3", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "index/healthCheck", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "index/subscription", _module_instance)


    class Package(pulumi.runtime.ResourcePackage):
        _version = _utilities.get_semver_version()

        def version(self):
            return Package._version

        def construct_provider(self, name: str, typ: str, urn: str) -> pulumi.ProviderResource:
            if typ != "pulumi:providers:spotinst":
                raise Exception(f"unknown provider type {typ}")
            return Provider(name, pulumi.ResourceOptions(urn=urn))


    pulumi.runtime.register_resource_package("spotinst", Package())

_register_module()
