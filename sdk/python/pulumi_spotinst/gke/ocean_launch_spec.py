# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['OceanLaunchSpecArgs', 'OceanLaunchSpec']

@pulumi.input_type
class OceanLaunchSpecArgs:
    def __init__(__self__, *,
                 metadatas: pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecMetadataArgs']]],
                 ocean_id: pulumi.Input[str],
                 source_image: pulumi.Input[str],
                 autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecAutoscaleHeadroomArgs']]]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecLabelArgs']]]] = None,
                 restrict_scale_down: Optional[pulumi.Input[bool]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecTaintArgs']]]] = None):
        """
        The set of arguments for constructing a OceanLaunchSpec resource.
        :param pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecMetadataArgs']]] metadatas: Cluster's metadata.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        :param pulumi.Input[str] source_image: Image URL.
        :param pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecAutoscaleHeadroomArgs']]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecLabelArgs']]] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[bool] restrict_scale_down: Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        :param pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecTaintArgs']]] taints: Optionally adds labels to instances launched in an Ocean cluster.
        """
        pulumi.set(__self__, "metadatas", metadatas)
        pulumi.set(__self__, "ocean_id", ocean_id)
        pulumi.set(__self__, "source_image", source_image)
        if autoscale_headrooms is not None:
            pulumi.set(__self__, "autoscale_headrooms", autoscale_headrooms)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if restrict_scale_down is not None:
            pulumi.set(__self__, "restrict_scale_down", restrict_scale_down)
        if taints is not None:
            pulumi.set(__self__, "taints", taints)

    @property
    @pulumi.getter
    def metadatas(self) -> pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecMetadataArgs']]]:
        """
        Cluster's metadata.
        """
        return pulumi.get(self, "metadatas")

    @metadatas.setter
    def metadatas(self, value: pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecMetadataArgs']]]):
        pulumi.set(self, "metadatas", value)

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

    @property
    @pulumi.getter(name="sourceImage")
    def source_image(self) -> pulumi.Input[str]:
        """
        Image URL.
        """
        return pulumi.get(self, "source_image")

    @source_image.setter
    def source_image(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_image", value)

    @property
    @pulumi.getter(name="autoscaleHeadrooms")
    def autoscale_headrooms(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecAutoscaleHeadroomArgs']]]]:
        """
        Set custom headroom per launch spec. provide list of headrooms object.
        """
        return pulumi.get(self, "autoscale_headrooms")

    @autoscale_headrooms.setter
    def autoscale_headrooms(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecAutoscaleHeadroomArgs']]]]):
        pulumi.set(self, "autoscale_headrooms", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecLabelArgs']]]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecLabelArgs']]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="restrictScaleDown")
    def restrict_scale_down(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        """
        return pulumi.get(self, "restrict_scale_down")

    @restrict_scale_down.setter
    def restrict_scale_down(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "restrict_scale_down", value)

    @property
    @pulumi.getter
    def taints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecTaintArgs']]]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "taints")

    @taints.setter
    def taints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanLaunchSpecTaintArgs']]]]):
        pulumi.set(self, "taints", value)


class OceanLaunchSpec(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
                 metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 restrict_scale_down: Optional[pulumi.Input[bool]] = None,
                 source_image: Optional[pulumi.Input[str]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a custom Spotinst Ocean GKE Launch Spec resource.

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
            restrict_scale_down=True,
            source_image="image",
            taints=[spotinst.gke.OceanLaunchSpecTaintArgs(
                effect="taintEffect",
                key="taintKey",
                value="taintVal",
            )])
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]] metadatas: Cluster's metadata.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        :param pulumi.Input[bool] restrict_scale_down: Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        :param pulumi.Input[str] source_image: Image URL.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Optionally adds labels to instances launched in an Ocean cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OceanLaunchSpecArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a custom Spotinst Ocean GKE Launch Spec resource.

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
            restrict_scale_down=True,
            source_image="image",
            taints=[spotinst.gke.OceanLaunchSpecTaintArgs(
                effect="taintEffect",
                key="taintKey",
                value="taintVal",
            )])
        ```
        ```python
        import pulumi

        pulumi.export("oceanLaunchspecId", spotinst_ocean_gke_launch_spec["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param OceanLaunchSpecArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OceanLaunchSpecArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
                 metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]]] = None,
                 ocean_id: Optional[pulumi.Input[str]] = None,
                 restrict_scale_down: Optional[pulumi.Input[bool]] = None,
                 source_image: Optional[pulumi.Input[str]] = None,
                 taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            if metadatas is None and not opts.urn:
                raise TypeError("Missing required property 'metadatas'")
            __props__['metadatas'] = metadatas
            if ocean_id is None and not opts.urn:
                raise TypeError("Missing required property 'ocean_id'")
            __props__['ocean_id'] = ocean_id
            __props__['restrict_scale_down'] = restrict_scale_down
            if source_image is None and not opts.urn:
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
            autoscale_headrooms: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]]] = None,
            labels: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]]] = None,
            metadatas: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]]] = None,
            ocean_id: Optional[pulumi.Input[str]] = None,
            restrict_scale_down: Optional[pulumi.Input[bool]] = None,
            source_image: Optional[pulumi.Input[str]] = None,
            taints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]]] = None) -> 'OceanLaunchSpec':
        """
        Get an existing OceanLaunchSpec resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecAutoscaleHeadroomArgs']]]] autoscale_headrooms: Set custom headroom per launch spec. provide list of headrooms object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecLabelArgs']]]] labels: Optionally adds labels to instances launched in an Ocean cluster.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecMetadataArgs']]]] metadatas: Cluster's metadata.
        :param pulumi.Input[str] ocean_id: The Ocean cluster ID required for launchSpec create.
        :param pulumi.Input[bool] restrict_scale_down: Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        :param pulumi.Input[str] source_image: Image URL.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanLaunchSpecTaintArgs']]]] taints: Optionally adds labels to instances launched in an Ocean cluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["autoscale_headrooms"] = autoscale_headrooms
        __props__["labels"] = labels
        __props__["metadatas"] = metadatas
        __props__["ocean_id"] = ocean_id
        __props__["restrict_scale_down"] = restrict_scale_down
        __props__["source_image"] = source_image
        __props__["taints"] = taints
        return OceanLaunchSpec(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoscaleHeadrooms")
    def autoscale_headrooms(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecAutoscaleHeadroom']]]:
        """
        Set custom headroom per launch spec. provide list of headrooms object.
        """
        return pulumi.get(self, "autoscale_headrooms")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecLabel']]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def metadatas(self) -> pulumi.Output[Sequence['outputs.OceanLaunchSpecMetadata']]:
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
    @pulumi.getter(name="restrictScaleDown")
    def restrict_scale_down(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. When set to `true`, VNG nodes will be treated as if all pods running have the restrict-scale-down label. Therefore, Ocean will not scale nodes down unless empty.
        """
        return pulumi.get(self, "restrict_scale_down")

    @property
    @pulumi.getter(name="sourceImage")
    def source_image(self) -> pulumi.Output[str]:
        """
        Image URL.
        """
        return pulumi.get(self, "source_image")

    @property
    @pulumi.getter
    def taints(self) -> pulumi.Output[Optional[Sequence['outputs.OceanLaunchSpecTaint']]]:
        """
        Optionally adds labels to instances launched in an Ocean cluster.
        """
        return pulumi.get(self, "taints")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

