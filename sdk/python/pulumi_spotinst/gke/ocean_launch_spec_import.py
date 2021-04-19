# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OceanLaunchSpecImportArgs', 'OceanLaunchSpecImport']

@pulumi.input_type
class OceanLaunchSpecImportArgs:
    def __init__(__self__, *,
                 node_pool_name: pulumi.Input[str],
                 ocean_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OceanLaunchSpecImport resource.
        :param pulumi.Input[str] node_pool_name: The node pool you wish to use in your launchSpec.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        """
        pulumi.set(__self__, "node_pool_name", node_pool_name)
        pulumi.set(__self__, "ocean_id", ocean_id)

    @property
    @pulumi.getter(name="nodePoolName")
    def node_pool_name(self) -> pulumi.Input[str]:
        """
        The node pool you wish to use in your launchSpec.
        """
        return pulumi.get(self, "node_pool_name")

    @node_pool_name.setter
    def node_pool_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_pool_name", value)

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> pulumi.Input[str]:
        """
        The Ocean cluster ID required for launchSpec create.
        """
        return pulumi.get(self, "ocean_id")

    @ocean_id.setter
    def ocean_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ocean_id", value)


@pulumi.input_type
class _OceanLaunchSpecImportState:
    def __init__(__self__, *,
                 node_pool_name: Optional[pulumi.Input[str]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OceanLaunchSpecImport resources.
        :param pulumi.Input[str] node_pool_name: The node pool you wish to use in your launchSpec.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        """
        if node_pool_name is not None:
            pulumi.set(__self__, "node_pool_name", node_pool_name)
        if ocean_id is not None:
            pulumi.set(__self__, "ocean_id", ocean_id)

    @property
    @pulumi.getter(name="nodePoolName")
    def node_pool_name(self) -> Optional[pulumi.Input[str]]:
        """
        The node pool you wish to use in your launchSpec.
        """
        return pulumi.get(self, "node_pool_name")

    @node_pool_name.setter
    def node_pool_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_pool_name", value)

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Ocean cluster ID required for launchSpec create.
        """
        return pulumi.get(self, "ocean_id")

    @ocean_id.setter
    def ocean_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ocean_id", value)


class OceanLaunchSpecImport(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_pool_name: Optional[pulumi.Input[str]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a custom Spotinst Ocean GKE Launch Spec Import resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.gke.OceanLaunchSpecImport("example",
            node_pool_name="default-pool",
            ocean_id="o-123456")
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec_import["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] node_pool_name: The node pool you wish to use in your launchSpec.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OceanLaunchSpecImportArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a custom Spotinst Ocean GKE Launch Spec Import resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.gke.OceanLaunchSpecImport("example",
            node_pool_name="default-pool",
            ocean_id="o-123456")
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec_import["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param OceanLaunchSpecImportArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OceanLaunchSpecImportArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 node_pool_name: Optional[pulumi.Input[str]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OceanLaunchSpecImportArgs.__new__(OceanLaunchSpecImportArgs)

            if node_pool_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_pool_name'")
            __props__.__dict__["node_pool_name"] = node_pool_name
            if ocean_id is None and not opts.urn:
                raise TypeError("Missing required property 'ocean_id'")
            __props__.__dict__["ocean_id"] = ocean_id
        super(OceanLaunchSpecImport, __self__).__init__(
            'spotinst:gke/oceanLaunchSpecImport:OceanLaunchSpecImport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            node_pool_name: Optional[pulumi.Input[str]] = None,
            ocean_id: Optional[pulumi.Input[str]] = None) -> 'OceanLaunchSpecImport':
        """
        Get an existing OceanLaunchSpecImport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] node_pool_name: The node pool you wish to use in your launchSpec.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OceanLaunchSpecImportState.__new__(_OceanLaunchSpecImportState)

        __props__.__dict__["node_pool_name"] = node_pool_name
        __props__.__dict__["ocean_id"] = ocean_id
        return OceanLaunchSpecImport(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="nodePoolName")
    def node_pool_name(self) -> pulumi.Output[str]:
        """
        The node pool you wish to use in your launchSpec.
        """
        return pulumi.get(self, "node_pool_name")

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> pulumi.Output[str]:
        """
        The Ocean cluster ID required for launchSpec create.
        """
        return pulumi.get(self, "ocean_id")

