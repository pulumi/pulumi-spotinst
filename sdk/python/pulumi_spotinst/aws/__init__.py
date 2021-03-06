# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

# Export this package's modules as members:
from .beanstalk import *
from .elastigroup import *
from .managed_instance import *
from .mr_scalar import *
from .ocean import *
from .ocean_launch_spec import *
from .suspension import *
from ._inputs import *
from . import outputs

def _register_module():
    import pulumi
    from .. import _utilities


    class Module(pulumi.runtime.ResourceModule):
        _version = _utilities.get_semver_version()

        def version(self):
            return Module._version

        def construct(self, name: str, typ: str, urn: str) -> pulumi.Resource:
            if typ == "spotinst:aws/beanstalk:Beanstalk":
                return Beanstalk(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/elastigroup:Elastigroup":
                return Elastigroup(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/managedInstance:ManagedInstance":
                return ManagedInstance(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/mrScalar:MrScalar":
                return MrScalar(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/ocean:Ocean":
                return Ocean(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/oceanLaunchSpec:OceanLaunchSpec":
                return OceanLaunchSpec(name, pulumi.ResourceOptions(urn=urn))
            elif typ == "spotinst:aws/suspension:Suspension":
                return Suspension(name, pulumi.ResourceOptions(urn=urn))
            else:
                raise Exception(f"unknown resource type {typ}")


    _module_instance = Module()
    pulumi.runtime.register_resource_module("spotinst", "aws/beanstalk", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/elastigroup", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/managedInstance", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/mrScalar", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/ocean", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/oceanLaunchSpec", _module_instance)
    pulumi.runtime.register_resource_module("spotinst", "aws/suspension", _module_instance)

_register_module()
