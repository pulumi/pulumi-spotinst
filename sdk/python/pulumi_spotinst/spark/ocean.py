# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OceanArgs', 'Ocean']

@pulumi.input_type
class OceanArgs:
    def __init__(__self__, *,
                 ocean_cluster_id: pulumi.Input[str],
                 compute: Optional[pulumi.Input['OceanComputeArgs']] = None,
                 ingress: Optional[pulumi.Input['OceanIngressArgs']] = None,
                 log_collection: Optional[pulumi.Input['OceanLogCollectionArgs']] = None,
                 spark: Optional[pulumi.Input['OceanSparkArgs']] = None,
                 webhook: Optional[pulumi.Input['OceanWebhookArgs']] = None):
        """
        The set of arguments for constructing a Ocean resource.
        :param pulumi.Input[str] ocean_cluster_id: - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        pulumi.set(__self__, "ocean_cluster_id", ocean_cluster_id)
        if compute is not None:
            pulumi.set(__self__, "compute", compute)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if log_collection is not None:
            pulumi.set(__self__, "log_collection", log_collection)
        if spark is not None:
            pulumi.set(__self__, "spark", spark)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)

    @property
    @pulumi.getter(name="oceanClusterId")
    def ocean_cluster_id(self) -> pulumi.Input[str]:
        """
        - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        return pulumi.get(self, "ocean_cluster_id")

    @ocean_cluster_id.setter
    def ocean_cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "ocean_cluster_id", value)

    @property
    @pulumi.getter
    def compute(self) -> Optional[pulumi.Input['OceanComputeArgs']]:
        return pulumi.get(self, "compute")

    @compute.setter
    def compute(self, value: Optional[pulumi.Input['OceanComputeArgs']]):
        pulumi.set(self, "compute", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input['OceanIngressArgs']]:
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input['OceanIngressArgs']]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="logCollection")
    def log_collection(self) -> Optional[pulumi.Input['OceanLogCollectionArgs']]:
        return pulumi.get(self, "log_collection")

    @log_collection.setter
    def log_collection(self, value: Optional[pulumi.Input['OceanLogCollectionArgs']]):
        pulumi.set(self, "log_collection", value)

    @property
    @pulumi.getter
    def spark(self) -> Optional[pulumi.Input['OceanSparkArgs']]:
        return pulumi.get(self, "spark")

    @spark.setter
    def spark(self, value: Optional[pulumi.Input['OceanSparkArgs']]):
        pulumi.set(self, "spark", value)

    @property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input['OceanWebhookArgs']]:
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input['OceanWebhookArgs']]):
        pulumi.set(self, "webhook", value)


@pulumi.input_type
class _OceanState:
    def __init__(__self__, *,
                 compute: Optional[pulumi.Input['OceanComputeArgs']] = None,
                 ingress: Optional[pulumi.Input['OceanIngressArgs']] = None,
                 log_collection: Optional[pulumi.Input['OceanLogCollectionArgs']] = None,
                 ocean_cluster_id: Optional[pulumi.Input[str]] = None,
                 spark: Optional[pulumi.Input['OceanSparkArgs']] = None,
                 webhook: Optional[pulumi.Input['OceanWebhookArgs']] = None):
        """
        Input properties used for looking up and filtering Ocean resources.
        :param pulumi.Input[str] ocean_cluster_id: - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        if compute is not None:
            pulumi.set(__self__, "compute", compute)
        if ingress is not None:
            pulumi.set(__self__, "ingress", ingress)
        if log_collection is not None:
            pulumi.set(__self__, "log_collection", log_collection)
        if ocean_cluster_id is not None:
            pulumi.set(__self__, "ocean_cluster_id", ocean_cluster_id)
        if spark is not None:
            pulumi.set(__self__, "spark", spark)
        if webhook is not None:
            pulumi.set(__self__, "webhook", webhook)

    @property
    @pulumi.getter
    def compute(self) -> Optional[pulumi.Input['OceanComputeArgs']]:
        return pulumi.get(self, "compute")

    @compute.setter
    def compute(self, value: Optional[pulumi.Input['OceanComputeArgs']]):
        pulumi.set(self, "compute", value)

    @property
    @pulumi.getter
    def ingress(self) -> Optional[pulumi.Input['OceanIngressArgs']]:
        return pulumi.get(self, "ingress")

    @ingress.setter
    def ingress(self, value: Optional[pulumi.Input['OceanIngressArgs']]):
        pulumi.set(self, "ingress", value)

    @property
    @pulumi.getter(name="logCollection")
    def log_collection(self) -> Optional[pulumi.Input['OceanLogCollectionArgs']]:
        return pulumi.get(self, "log_collection")

    @log_collection.setter
    def log_collection(self, value: Optional[pulumi.Input['OceanLogCollectionArgs']]):
        pulumi.set(self, "log_collection", value)

    @property
    @pulumi.getter(name="oceanClusterId")
    def ocean_cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        return pulumi.get(self, "ocean_cluster_id")

    @ocean_cluster_id.setter
    def ocean_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ocean_cluster_id", value)

    @property
    @pulumi.getter
    def spark(self) -> Optional[pulumi.Input['OceanSparkArgs']]:
        return pulumi.get(self, "spark")

    @spark.setter
    def spark(self, value: Optional[pulumi.Input['OceanSparkArgs']]):
        pulumi.set(self, "spark", value)

    @property
    @pulumi.getter
    def webhook(self) -> Optional[pulumi.Input['OceanWebhookArgs']]:
        return pulumi.get(self, "webhook")

    @webhook.setter
    def webhook(self, value: Optional[pulumi.Input['OceanWebhookArgs']]):
        pulumi.set(self, "webhook", value)


class Ocean(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute: Optional[pulumi.Input[Union['OceanComputeArgs', 'OceanComputeArgsDict']]] = None,
                 ingress: Optional[pulumi.Input[Union['OceanIngressArgs', 'OceanIngressArgsDict']]] = None,
                 log_collection: Optional[pulumi.Input[Union['OceanLogCollectionArgs', 'OceanLogCollectionArgsDict']]] = None,
                 ocean_cluster_id: Optional[pulumi.Input[str]] = None,
                 spark: Optional[pulumi.Input[Union['OceanSparkArgs', 'OceanSparkArgsDict']]] = None,
                 webhook: Optional[pulumi.Input[Union['OceanWebhookArgs', 'OceanWebhookArgsDict']]] = None,
                 __props__=None):
        """
        Manages a Spotinst Ocean Spark resource on AWS or GCP.

        ## Prerequisites

        An existing Ocean cluster is required by this resource. See e.g. the `aws.Ocean` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.spark.Ocean("example",
            ocean_cluster_id="ocean-cluster-id",
            ingress={
                "controller": {
                    "managed": True,
                },
                "load_balancer": {
                    "managed": True,
                    "target_group_arn": "arn:aws:elasticloadbalancing:eu-north-1:XXXXXXXXXXXX:targetgroup/my-spark-cluster-nlb-tg/a38c2b83XXXXXXXX",
                    "service_annotations": {
                        "service.beta.kubernetes.io/aws-load-balancer-security-groups": "sg-XXXXXXXXXXXXXXXXX",
                        "some-service-annotation-2": "some-service-annotation-value-2",
                    },
                },
                "custom_endpoint": {
                    "enabled": False,
                    "address": "my-spark-cluster-nlb-8cbb8da7XXXXXXXX.elb.us-east-1.amazonaws.com",
                },
                "private_link": {
                    "enabled": False,
                    "vpc_endpoint_service": "com.amazonaws.vpce.eu-north-1.vpce-svc-XXXXXXXXXXXXXXXXX",
                },
            },
            compute={
                "create_vngs": True,
                "use_taints": True,
            },
            log_collection={
                "collect_app_logs": True,
            },
            webhook={
                "use_host_network": False,
                "host_network_ports": [25554],
            },
            spark={
                "additional_app_namespaces": [
                    "extra-spark-app-ns-1",
                    "extra-spark-app-ns-2",
                ],
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ocean_cluster_id: - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OceanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Spotinst Ocean Spark resource on AWS or GCP.

        ## Prerequisites

        An existing Ocean cluster is required by this resource. See e.g. the `aws.Ocean` resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.spark.Ocean("example",
            ocean_cluster_id="ocean-cluster-id",
            ingress={
                "controller": {
                    "managed": True,
                },
                "load_balancer": {
                    "managed": True,
                    "target_group_arn": "arn:aws:elasticloadbalancing:eu-north-1:XXXXXXXXXXXX:targetgroup/my-spark-cluster-nlb-tg/a38c2b83XXXXXXXX",
                    "service_annotations": {
                        "service.beta.kubernetes.io/aws-load-balancer-security-groups": "sg-XXXXXXXXXXXXXXXXX",
                        "some-service-annotation-2": "some-service-annotation-value-2",
                    },
                },
                "custom_endpoint": {
                    "enabled": False,
                    "address": "my-spark-cluster-nlb-8cbb8da7XXXXXXXX.elb.us-east-1.amazonaws.com",
                },
                "private_link": {
                    "enabled": False,
                    "vpc_endpoint_service": "com.amazonaws.vpce.eu-north-1.vpce-svc-XXXXXXXXXXXXXXXXX",
                },
            },
            compute={
                "create_vngs": True,
                "use_taints": True,
            },
            log_collection={
                "collect_app_logs": True,
            },
            webhook={
                "use_host_network": False,
                "host_network_ports": [25554],
            },
            spark={
                "additional_app_namespaces": [
                    "extra-spark-app-ns-1",
                    "extra-spark-app-ns-2",
                ],
            })
        ```

        :param str resource_name: The name of the resource.
        :param OceanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OceanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 compute: Optional[pulumi.Input[Union['OceanComputeArgs', 'OceanComputeArgsDict']]] = None,
                 ingress: Optional[pulumi.Input[Union['OceanIngressArgs', 'OceanIngressArgsDict']]] = None,
                 log_collection: Optional[pulumi.Input[Union['OceanLogCollectionArgs', 'OceanLogCollectionArgsDict']]] = None,
                 ocean_cluster_id: Optional[pulumi.Input[str]] = None,
                 spark: Optional[pulumi.Input[Union['OceanSparkArgs', 'OceanSparkArgsDict']]] = None,
                 webhook: Optional[pulumi.Input[Union['OceanWebhookArgs', 'OceanWebhookArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OceanArgs.__new__(OceanArgs)

            __props__.__dict__["compute"] = compute
            __props__.__dict__["ingress"] = ingress
            __props__.__dict__["log_collection"] = log_collection
            if ocean_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'ocean_cluster_id'")
            __props__.__dict__["ocean_cluster_id"] = ocean_cluster_id
            __props__.__dict__["spark"] = spark
            __props__.__dict__["webhook"] = webhook
        super(Ocean, __self__).__init__(
            'spotinst:spark/ocean:Ocean',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            compute: Optional[pulumi.Input[Union['OceanComputeArgs', 'OceanComputeArgsDict']]] = None,
            ingress: Optional[pulumi.Input[Union['OceanIngressArgs', 'OceanIngressArgsDict']]] = None,
            log_collection: Optional[pulumi.Input[Union['OceanLogCollectionArgs', 'OceanLogCollectionArgsDict']]] = None,
            ocean_cluster_id: Optional[pulumi.Input[str]] = None,
            spark: Optional[pulumi.Input[Union['OceanSparkArgs', 'OceanSparkArgsDict']]] = None,
            webhook: Optional[pulumi.Input[Union['OceanWebhookArgs', 'OceanWebhookArgsDict']]] = None) -> 'Ocean':
        """
        Get an existing Ocean resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ocean_cluster_id: - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OceanState.__new__(_OceanState)

        __props__.__dict__["compute"] = compute
        __props__.__dict__["ingress"] = ingress
        __props__.__dict__["log_collection"] = log_collection
        __props__.__dict__["ocean_cluster_id"] = ocean_cluster_id
        __props__.__dict__["spark"] = spark
        __props__.__dict__["webhook"] = webhook
        return Ocean(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def compute(self) -> pulumi.Output['outputs.OceanCompute']:
        return pulumi.get(self, "compute")

    @property
    @pulumi.getter
    def ingress(self) -> pulumi.Output['outputs.OceanIngress']:
        return pulumi.get(self, "ingress")

    @property
    @pulumi.getter(name="logCollection")
    def log_collection(self) -> pulumi.Output['outputs.OceanLogCollection']:
        return pulumi.get(self, "log_collection")

    @property
    @pulumi.getter(name="oceanClusterId")
    def ocean_cluster_id(self) -> pulumi.Output[str]:
        """
        - The ID of the Ocean cluster that Ocean for Apache Spark should be installed on.
        """
        return pulumi.get(self, "ocean_cluster_id")

    @property
    @pulumi.getter
    def spark(self) -> pulumi.Output['outputs.OceanSpark']:
        return pulumi.get(self, "spark")

    @property
    @pulumi.getter
    def webhook(self) -> pulumi.Output['outputs.OceanWebhook']:
        return pulumi.get(self, "webhook")

