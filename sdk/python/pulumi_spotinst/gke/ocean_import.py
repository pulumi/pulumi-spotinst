# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['OceanImportArgs', 'OceanImport']

@pulumi.input_type
class OceanImportArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 location: pulumi.Input[str],
                 autoscaler: Optional[pulumi.Input['OceanImportAutoscalerArgs']] = None,
                 backend_services: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]] = None,
                 controller_cluster_id: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]] = None,
                 whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a OceanImport resource.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[str] location: The zone the master cluster is located in.
        :param pulumi.Input['OceanImportAutoscalerArgs'] autoscaler: The Ocean Kubernetes Autoscaler object.
        :param pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]] backend_services: Describes the backend service configurations.
        :param pulumi.Input[int] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[int] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[int] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]] scheduled_tasks: Set scheduling object.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "location", location)
        if autoscaler is not None:
            pulumi.set(__self__, "autoscaler", autoscaler)
        if backend_services is not None:
            pulumi.set(__self__, "backend_services", backend_services)
        if controller_cluster_id is not None:
            pulumi.set(__self__, "controller_cluster_id", controller_cluster_id)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if scheduled_tasks is not None:
            pulumi.set(__self__, "scheduled_tasks", scheduled_tasks)
        if whitelists is not None:
            pulumi.set(__self__, "whitelists", whitelists)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        The GKE cluster name.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter
    def location(self) -> pulumi.Input[str]:
        """
        The zone the master cluster is located in.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: pulumi.Input[str]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def autoscaler(self) -> Optional[pulumi.Input['OceanImportAutoscalerArgs']]:
        """
        The Ocean Kubernetes Autoscaler object.
        """
        return pulumi.get(self, "autoscaler")

    @autoscaler.setter
    def autoscaler(self, value: Optional[pulumi.Input['OceanImportAutoscalerArgs']]):
        pulumi.set(self, "autoscaler", value)

    @property
    @pulumi.getter(name="backendServices")
    def backend_services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]]:
        """
        Describes the backend service configurations.
        """
        return pulumi.get(self, "backend_services")

    @backend_services.setter
    def backend_services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]]):
        pulumi.set(self, "backend_services", value)

    @property
    @pulumi.getter(name="controllerClusterId")
    def controller_cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "controller_cluster_id")

    @controller_cluster_id.setter
    def controller_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "controller_cluster_id", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The number of instances to launch and maintain in the cluster.
        """
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        """
        The upper limit of instances the cluster can scale up to.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        """
        The lower limit of instances the cluster can scale down to.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]]:
        """
        Set scheduling object.
        """
        return pulumi.get(self, "scheduled_tasks")

    @scheduled_tasks.setter
    def scheduled_tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]]):
        pulumi.set(self, "scheduled_tasks", value)

    @property
    @pulumi.getter
    def whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Instance types allowed in the Ocean cluster.
        """
        return pulumi.get(self, "whitelists")

    @whitelists.setter
    def whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "whitelists", value)


@pulumi.input_type
class _OceanImportState:
    def __init__(__self__, *,
                 autoscaler: Optional[pulumi.Input['OceanImportAutoscalerArgs']] = None,
                 backend_services: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]] = None,
                 cluster_controller_id: Optional[pulumi.Input[str]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 controller_cluster_id: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]] = None,
                 whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering OceanImport resources.
        :param pulumi.Input['OceanImportAutoscalerArgs'] autoscaler: The Ocean Kubernetes Autoscaler object.
        :param pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]] backend_services: Describes the backend service configurations.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[int] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[str] location: The zone the master cluster is located in.
        :param pulumi.Input[int] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[int] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]] scheduled_tasks: Set scheduling object.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster.
        """
        if autoscaler is not None:
            pulumi.set(__self__, "autoscaler", autoscaler)
        if backend_services is not None:
            pulumi.set(__self__, "backend_services", backend_services)
        if cluster_controller_id is not None:
            pulumi.set(__self__, "cluster_controller_id", cluster_controller_id)
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if controller_cluster_id is not None:
            pulumi.set(__self__, "controller_cluster_id", controller_cluster_id)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if scheduled_tasks is not None:
            pulumi.set(__self__, "scheduled_tasks", scheduled_tasks)
        if whitelists is not None:
            pulumi.set(__self__, "whitelists", whitelists)

    @property
    @pulumi.getter
    def autoscaler(self) -> Optional[pulumi.Input['OceanImportAutoscalerArgs']]:
        """
        The Ocean Kubernetes Autoscaler object.
        """
        return pulumi.get(self, "autoscaler")

    @autoscaler.setter
    def autoscaler(self, value: Optional[pulumi.Input['OceanImportAutoscalerArgs']]):
        pulumi.set(self, "autoscaler", value)

    @property
    @pulumi.getter(name="backendServices")
    def backend_services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]]:
        """
        Describes the backend service configurations.
        """
        return pulumi.get(self, "backend_services")

    @backend_services.setter
    def backend_services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportBackendServiceArgs']]]]):
        pulumi.set(self, "backend_services", value)

    @property
    @pulumi.getter(name="clusterControllerId")
    def cluster_controller_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_controller_id")

    @cluster_controller_id.setter
    def cluster_controller_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_controller_id", value)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        The GKE cluster name.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="controllerClusterId")
    def controller_cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "controller_cluster_id")

    @controller_cluster_id.setter
    def controller_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "controller_cluster_id", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The number of instances to launch and maintain in the cluster.
        """
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        """
        The zone the master cluster is located in.
        """
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        """
        The upper limit of instances the cluster can scale up to.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        """
        The lower limit of instances the cluster can scale down to.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]]:
        """
        Set scheduling object.
        """
        return pulumi.get(self, "scheduled_tasks")

    @scheduled_tasks.setter
    def scheduled_tasks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OceanImportScheduledTaskArgs']]]]):
        pulumi.set(self, "scheduled_tasks", value)

    @property
    @pulumi.getter
    def whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Instance types allowed in the Ocean cluster.
        """
        return pulumi.get(self, "whitelists")

    @whitelists.setter
    def whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "whitelists", value)


class OceanImport(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscaler: Optional[pulumi.Input[pulumi.InputType['OceanImportAutoscalerArgs']]] = None,
                 backend_services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportBackendServiceArgs']]]]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 controller_cluster_id: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportScheduledTaskArgs']]]]] = None,
                 whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a Spotinst Ocean GKE resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.gke.OceanImport("example",
            backend_services=[spotinst.gke.OceanImportBackendServiceArgs(
                location_type="regional",
                named_ports=[spotinst.gke.OceanImportBackendServiceNamedPortArgs(
                    name="http",
                    ports=[
                        "80",
                        "8080",
                    ],
                )],
                scheme="INTERNAL",
                service_name="example-backend-service",
            )],
            cluster_name="example-cluster-name",
            desired_capacity=0,
            location="us-central1-a",
            max_size=2,
            min_size=0,
            whitelists=[
                "n1-standard-1",
                "n1-standard-2",
            ])
        ```

        ```python
        import pulumi

        pulumi.export("oceanId", spotinst_ocean_gke_import["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OceanImportAutoscalerArgs']] autoscaler: The Ocean Kubernetes Autoscaler object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportBackendServiceArgs']]]] backend_services: Describes the backend service configurations.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[int] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[str] location: The zone the master cluster is located in.
        :param pulumi.Input[int] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[int] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportScheduledTaskArgs']]]] scheduled_tasks: Set scheduling object.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OceanImportArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Spotinst Ocean GKE resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example = spotinst.gke.OceanImport("example",
            backend_services=[spotinst.gke.OceanImportBackendServiceArgs(
                location_type="regional",
                named_ports=[spotinst.gke.OceanImportBackendServiceNamedPortArgs(
                    name="http",
                    ports=[
                        "80",
                        "8080",
                    ],
                )],
                scheme="INTERNAL",
                service_name="example-backend-service",
            )],
            cluster_name="example-cluster-name",
            desired_capacity=0,
            location="us-central1-a",
            max_size=2,
            min_size=0,
            whitelists=[
                "n1-standard-1",
                "n1-standard-2",
            ])
        ```

        ```python
        import pulumi

        pulumi.export("oceanId", spotinst_ocean_gke_import["example"]["id"])
        ```

        :param str resource_name: The name of the resource.
        :param OceanImportArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OceanImportArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 autoscaler: Optional[pulumi.Input[pulumi.InputType['OceanImportAutoscalerArgs']]] = None,
                 backend_services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportBackendServiceArgs']]]]] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 controller_cluster_id: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportScheduledTaskArgs']]]]] = None,
                 whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
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
            __props__ = OceanImportArgs.__new__(OceanImportArgs)

            __props__.__dict__["autoscaler"] = autoscaler
            __props__.__dict__["backend_services"] = backend_services
            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            __props__.__dict__["controller_cluster_id"] = controller_cluster_id
            __props__.__dict__["desired_capacity"] = desired_capacity
            if location is None and not opts.urn:
                raise TypeError("Missing required property 'location'")
            __props__.__dict__["location"] = location
            __props__.__dict__["max_size"] = max_size
            __props__.__dict__["min_size"] = min_size
            __props__.__dict__["scheduled_tasks"] = scheduled_tasks
            __props__.__dict__["whitelists"] = whitelists
            __props__.__dict__["cluster_controller_id"] = None
        super(OceanImport, __self__).__init__(
            'spotinst:gke/oceanImport:OceanImport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            autoscaler: Optional[pulumi.Input[pulumi.InputType['OceanImportAutoscalerArgs']]] = None,
            backend_services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportBackendServiceArgs']]]]] = None,
            cluster_controller_id: Optional[pulumi.Input[str]] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            controller_cluster_id: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[int]] = None,
            location: Optional[pulumi.Input[str]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportScheduledTaskArgs']]]]] = None,
            whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'OceanImport':
        """
        Get an existing OceanImport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['OceanImportAutoscalerArgs']] autoscaler: The Ocean Kubernetes Autoscaler object.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportBackendServiceArgs']]]] backend_services: Describes the backend service configurations.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[int] desired_capacity: The number of instances to launch and maintain in the cluster.
        :param pulumi.Input[str] location: The zone the master cluster is located in.
        :param pulumi.Input[int] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[int] min_size: The lower limit of instances the cluster can scale down to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OceanImportScheduledTaskArgs']]]] scheduled_tasks: Set scheduling object.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] whitelists: Instance types allowed in the Ocean cluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OceanImportState.__new__(_OceanImportState)

        __props__.__dict__["autoscaler"] = autoscaler
        __props__.__dict__["backend_services"] = backend_services
        __props__.__dict__["cluster_controller_id"] = cluster_controller_id
        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["controller_cluster_id"] = controller_cluster_id
        __props__.__dict__["desired_capacity"] = desired_capacity
        __props__.__dict__["location"] = location
        __props__.__dict__["max_size"] = max_size
        __props__.__dict__["min_size"] = min_size
        __props__.__dict__["scheduled_tasks"] = scheduled_tasks
        __props__.__dict__["whitelists"] = whitelists
        return OceanImport(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def autoscaler(self) -> pulumi.Output['outputs.OceanImportAutoscaler']:
        """
        The Ocean Kubernetes Autoscaler object.
        """
        return pulumi.get(self, "autoscaler")

    @property
    @pulumi.getter(name="backendServices")
    def backend_services(self) -> pulumi.Output[Optional[Sequence['outputs.OceanImportBackendService']]]:
        """
        Describes the backend service configurations.
        """
        return pulumi.get(self, "backend_services")

    @property
    @pulumi.getter(name="clusterControllerId")
    def cluster_controller_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cluster_controller_id")

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        The GKE cluster name.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="controllerClusterId")
    def controller_cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "controller_cluster_id")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[int]:
        """
        The number of instances to launch and maintain in the cluster.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter
    def location(self) -> pulumi.Output[str]:
        """
        The zone the master cluster is located in.
        """
        return pulumi.get(self, "location")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[int]:
        """
        The upper limit of instances the cluster can scale up to.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[int]:
        """
        The lower limit of instances the cluster can scale down to.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> pulumi.Output[Optional[Sequence['outputs.OceanImportScheduledTask']]]:
        """
        Set scheduling object.
        """
        return pulumi.get(self, "scheduled_tasks")

    @property
    @pulumi.getter
    def whitelists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Instance types allowed in the Ocean cluster.
        """
        return pulumi.get(self, "whitelists")

