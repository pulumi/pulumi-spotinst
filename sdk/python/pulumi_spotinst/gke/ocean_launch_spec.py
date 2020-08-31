# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['OceanLaunchSpec']


class OceanLaunchSpec(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscale_headrooms: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
                 labels: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
                 metadatas: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 source_image: Optional[pulumi.Input[str]] = None,
                 taints: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a custom Spotinst Ocean GKE Launch Spec resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.gke.OceanLaunchSpec("example",
            autoscale_headrooms=[spotinst.gke.OceanLaunchSpecAutoscaleHeadroomArgs(
                cpu_per_unit=1000,
                gpu_per_unit=0,
                memory_per_unit=2048,
                num_of_units=5,
            )],
            labels=[spotinst.gke.OceanLaunchSpecLabelArgs(
                key="labelKey",
                value="labelVal",
            )],
            metadatas=[spotinst.gke.OceanLaunchSpecMetadataArgs(
                key="gci-update-strategy",
                value="update_disabled",
            )],
            ocean_id="o-123456",
            source_image="image",
            taints=[spotinst.gke.OceanLaunchSpecTaintArgs(
                effect="taintEffect",
                key="taintKey",
                value="taintVal",
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Cluster's labels.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]] metadatas: Cluster's metadata.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        :param pulumi.Input[str] source_image: Image URL.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Cluster's taints.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['autoscale_headrooms'] = autoscale_headrooms
            __props__['labels'] = labels
            if metadatas is None:
                raise TypeError("Missing required property 'metadatas'")
            __props__['metadatas'] = metadatas
            if ocean_id is None:
                raise TypeError("Missing required property 'ocean_id'")
            __props__['ocean_id'] = ocean_id
            if source_image is None:
                raise TypeError("Missing required property 'source_image'")
            __props__['source_image'] = source_image
            __props__['taints'] = taints
        super(OceanLaunchSpec, __self__).__init__(
            'spotinst:gke/oceanLaunchSpec:OceanLaunchSpec',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autoscale_headrooms: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
            labels: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
            metadatas: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]]] = None,
            ocean_id: Optional[pulumi.Input[str]] = None,
            source_image: Optional[pulumi.Input[str]] = None,
            taints: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None) -> 'OceanLaunchSpec':
        """
        Get an existing OceanLaunchSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Cluster's labels.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]] metadatas: Cluster's metadata.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        :param pulumi.Input[str] source_image: Image URL.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Cluster's taints.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["autoscale_headrooms"] = autoscale_headrooms
        __props__["labels"] = labels
        __props__["metadatas"] = metadatas
        __props__["ocean_id"] = ocean_id
        __props__["source_image"] = source_image
        __props__["taints"] = taints
        return OceanLaunchSpec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoscaleHeadrooms")
    def autoscale_headrooms(self) -> pulumi.Output[Optional[List['outputs.OceanLaunchSpecAutoscaleHeadroom']]]:
        """
        Set custom headroom per launch spec. provide list of headrooms object.
        """
        return pulumi.get(self, "autoscale_headrooms")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[List['outputs.OceanLaunchSpecLabel']]]:
        """
        Cluster's labels.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def metadatas(self) -> pulumi.Output[List['outputs.OceanLaunchSpecMetadata']]:
        """
        Cluster's metadata.
        """
        return pulumi.get(self, "metadatas")

    @property
    @pulumi.getter(name="oceanId")
    def ocean_id(self) -> pulumi.Output[str]:
        """
        The Ocean cluster ID required for launchSpec create.
        """
        return pulumi.get(self, "ocean_id")

    @property
    @pulumi.getter(name="sourceImage")
    def source_image(self) -> pulumi.Output[str]:
        """
        Image URL.
        """
        return pulumi.get(self, "source_image")

    @property
    @pulumi.getter
    def taints(self) -> pulumi.Output[Optional[List['outputs.OceanLaunchSpecTaint']]]:
        """
        Cluster's taints.
        """
        return pulumi.get(self, "taints")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

