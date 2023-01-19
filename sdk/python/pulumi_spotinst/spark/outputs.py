# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'OceanCompute',
    'OceanIngress',
    'OceanIngressController',
    'OceanIngressCustomEndpoint',
    'OceanIngressLoadBalancer',
    'OceanIngressPrivateLink',
    'OceanLogCollection',
    'OceanWebhook',
]

@pulumi.output_type
class OceanCompute(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "createVngs":
            suggest = "create_vngs"
        elif key == "useTaints":
            suggest = "use_taints"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanCompute. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanCompute.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanCompute.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 create_vngs: Optional[bool] = None,
                 use_taints: Optional[bool] = None):
        """
        :param bool create_vngs: - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
        :param bool use_taints: - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
        """
        if create_vngs is not None:
            pulumi.set(__self__, "create_vngs", create_vngs)
        if use_taints is not None:
            pulumi.set(__self__, "use_taints", use_taints)

    @property
    @pulumi.getter(name="createVngs")
    def create_vngs(self) -> Optional[bool]:
        """
        - Enable/disable the creation of Ocean Spark VNGs during cluster creation.
        """
        return pulumi.get(self, "create_vngs")

    @property
    @pulumi.getter(name="useTaints")
    def use_taints(self) -> Optional[bool]:
        """
        - Enable/disable Ocean Spark taints on the Ocean Spark VNGs. By default, Ocean Spark uses taints to prevent non-Spark workloads from running on Ocean Spark VNGs.
        """
        return pulumi.get(self, "use_taints")


@pulumi.output_type
class OceanIngress(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "customEndpoint":
            suggest = "custom_endpoint"
        elif key == "loadBalancer":
            suggest = "load_balancer"
        elif key == "privateLink":
            suggest = "private_link"
        elif key == "serviceAnnotations":
            suggest = "service_annotations"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanIngress. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanIngress.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanIngress.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 controller: Optional['outputs.OceanIngressController'] = None,
                 custom_endpoint: Optional['outputs.OceanIngressCustomEndpoint'] = None,
                 load_balancer: Optional['outputs.OceanIngressLoadBalancer'] = None,
                 private_link: Optional['outputs.OceanIngressPrivateLink'] = None,
                 service_annotations: Optional[Mapping[str, str]] = None):
        """
        :param Mapping[str, str] service_annotations: - **DEPRECATED**: Use `load_balancer.service_annotations` instead.
        """
        if controller is not None:
            pulumi.set(__self__, "controller", controller)
        if custom_endpoint is not None:
            pulumi.set(__self__, "custom_endpoint", custom_endpoint)
        if load_balancer is not None:
            pulumi.set(__self__, "load_balancer", load_balancer)
        if private_link is not None:
            pulumi.set(__self__, "private_link", private_link)
        if service_annotations is not None:
            pulumi.set(__self__, "service_annotations", service_annotations)

    @property
    @pulumi.getter
    def controller(self) -> Optional['outputs.OceanIngressController']:
        return pulumi.get(self, "controller")

    @property
    @pulumi.getter(name="customEndpoint")
    def custom_endpoint(self) -> Optional['outputs.OceanIngressCustomEndpoint']:
        return pulumi.get(self, "custom_endpoint")

    @property
    @pulumi.getter(name="loadBalancer")
    def load_balancer(self) -> Optional['outputs.OceanIngressLoadBalancer']:
        return pulumi.get(self, "load_balancer")

    @property
    @pulumi.getter(name="privateLink")
    def private_link(self) -> Optional['outputs.OceanIngressPrivateLink']:
        return pulumi.get(self, "private_link")

    @property
    @pulumi.getter(name="serviceAnnotations")
    def service_annotations(self) -> Optional[Mapping[str, str]]:
        """
        - **DEPRECATED**: Use `load_balancer.service_annotations` instead.
        """
        return pulumi.get(self, "service_annotations")


@pulumi.output_type
class OceanIngressController(dict):
    def __init__(__self__, *,
                 managed: Optional[bool] = None):
        if managed is not None:
            pulumi.set(__self__, "managed", managed)

    @property
    @pulumi.getter
    def managed(self) -> Optional[bool]:
        return pulumi.get(self, "managed")


@pulumi.output_type
class OceanIngressCustomEndpoint(dict):
    def __init__(__self__, *,
                 address: Optional[str] = None,
                 enabled: Optional[bool] = None):
        if address is not None:
            pulumi.set(__self__, "address", address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def address(self) -> Optional[str]:
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        return pulumi.get(self, "enabled")


@pulumi.output_type
class OceanIngressLoadBalancer(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "serviceAnnotations":
            suggest = "service_annotations"
        elif key == "targetGroupArn":
            suggest = "target_group_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanIngressLoadBalancer. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanIngressLoadBalancer.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanIngressLoadBalancer.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 managed: Optional[bool] = None,
                 service_annotations: Optional[Mapping[str, str]] = None,
                 target_group_arn: Optional[str] = None):
        if managed is not None:
            pulumi.set(__self__, "managed", managed)
        if service_annotations is not None:
            pulumi.set(__self__, "service_annotations", service_annotations)
        if target_group_arn is not None:
            pulumi.set(__self__, "target_group_arn", target_group_arn)

    @property
    @pulumi.getter
    def managed(self) -> Optional[bool]:
        return pulumi.get(self, "managed")

    @property
    @pulumi.getter(name="serviceAnnotations")
    def service_annotations(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "service_annotations")

    @property
    @pulumi.getter(name="targetGroupArn")
    def target_group_arn(self) -> Optional[str]:
        return pulumi.get(self, "target_group_arn")


@pulumi.output_type
class OceanIngressPrivateLink(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "vpcEndpointService":
            suggest = "vpc_endpoint_service"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanIngressPrivateLink. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanIngressPrivateLink.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanIngressPrivateLink.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: Optional[bool] = None,
                 vpc_endpoint_service: Optional[str] = None):
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if vpc_endpoint_service is not None:
            pulumi.set(__self__, "vpc_endpoint_service", vpc_endpoint_service)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="vpcEndpointService")
    def vpc_endpoint_service(self) -> Optional[str]:
        return pulumi.get(self, "vpc_endpoint_service")


@pulumi.output_type
class OceanLogCollection(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "collectDriverLogs":
            suggest = "collect_driver_logs"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanLogCollection. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanLogCollection.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanLogCollection.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 collect_driver_logs: Optional[bool] = None):
        """
        :param bool collect_driver_logs: - Enable/disable the collection of driver logs. When enabled, driver logs are stored by NetApp and can be downloaded from the Spot console web interface. The driver logs are deleted after 30 days.
        """
        if collect_driver_logs is not None:
            pulumi.set(__self__, "collect_driver_logs", collect_driver_logs)

    @property
    @pulumi.getter(name="collectDriverLogs")
    def collect_driver_logs(self) -> Optional[bool]:
        """
        - Enable/disable the collection of driver logs. When enabled, driver logs are stored by NetApp and can be downloaded from the Spot console web interface. The driver logs are deleted after 30 days.
        """
        return pulumi.get(self, "collect_driver_logs")


@pulumi.output_type
class OceanWebhook(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "hostNetworkPorts":
            suggest = "host_network_ports"
        elif key == "useHostNetwork":
            suggest = "use_host_network"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in OceanWebhook. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        OceanWebhook.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        OceanWebhook.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 host_network_ports: Optional[Sequence[int]] = None,
                 use_host_network: Optional[bool] = None):
        """
        :param Sequence[int] host_network_ports: - List of ports allowed to use on the host network - if empty default is `25554`.
        :param bool use_host_network: - Enable/disable host networking for the Spark Operator. Host networking can be useful when using custom CNI plugins like Calico on EKS.
        """
        if host_network_ports is not None:
            pulumi.set(__self__, "host_network_ports", host_network_ports)
        if use_host_network is not None:
            pulumi.set(__self__, "use_host_network", use_host_network)

    @property
    @pulumi.getter(name="hostNetworkPorts")
    def host_network_ports(self) -> Optional[Sequence[int]]:
        """
        - List of ports allowed to use on the host network - if empty default is `25554`.
        """
        return pulumi.get(self, "host_network_ports")

    @property
    @pulumi.getter(name="useHostNetwork")
    def use_host_network(self) -> Optional[bool]:
        """
        - Enable/disable host networking for the Spark Operator. Host networking can be useful when using custom CNI plugins like Calico on EKS.
        """
        return pulumi.get(self, "use_host_network")


