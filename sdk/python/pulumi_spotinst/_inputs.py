# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'ElastigroupAzureV3ImageArgs',
    'ElastigroupAzureV3ImageCustomArgs',
    'ElastigroupAzureV3ImageMarketplaceArgs',
    'ElastigroupAzureV3LoginArgs',
    'ElastigroupAzureV3NetworkArgs',
    'ElastigroupAzureV3NetworkNetworkInterfaceArgs',
    'ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs',
    'ElastigroupAzureV3StrategyArgs',
    'HealthCheckCheckArgs',
]

@pulumi.input_type
class ElastigroupAzureV3ImageArgs:
    def __init__(__self__, *,
                 customs: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageCustomArgs']]]] = None,
                 marketplaces: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageMarketplaceArgs']]]] = None):
        if customs is not None:
            pulumi.set(__self__, "customs", customs)
        if marketplaces is not None:
            pulumi.set(__self__, "marketplaces", marketplaces)

    @property
    @pulumi.getter
    def customs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageCustomArgs']]]]:
        return pulumi.get(self, "customs")

    @customs.setter
    def customs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageCustomArgs']]]]):
        pulumi.set(self, "customs", value)

    @property
    @pulumi.getter
    def marketplaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageMarketplaceArgs']]]]:
        return pulumi.get(self, "marketplaces")

    @marketplaces.setter
    def marketplaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageMarketplaceArgs']]]]):
        pulumi.set(self, "marketplaces", value)


@pulumi.input_type
class ElastigroupAzureV3ImageCustomArgs:
    def __init__(__self__, *,
                 image_name: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] image_name: Name of the custom image. Required if resource_group_name is specified.
        :param pulumi.Input[str] resource_group_name: Vnet Resource Group Name.
        """
        pulumi.set(__self__, "image_name", image_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> pulumi.Input[str]:
        """
        Name of the custom image. Required if resource_group_name is specified.
        """
        return pulumi.get(self, "image_name")

    @image_name.setter
    def image_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "image_name", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Vnet Resource Group Name.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)


@pulumi.input_type
class ElastigroupAzureV3ImageMarketplaceArgs:
    def __init__(__self__, *,
                 offer: pulumi.Input[str],
                 publisher: pulumi.Input[str],
                 sku: pulumi.Input[str],
                 version: pulumi.Input[str]):
        """
        :param pulumi.Input[str] offer: Name of the image to use. Required if publisher is specified.
        :param pulumi.Input[str] publisher: Image publisher. Required if resource_group_name is not specified.
        :param pulumi.Input[str] sku: Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        """
        pulumi.set(__self__, "offer", offer)
        pulumi.set(__self__, "publisher", publisher)
        pulumi.set(__self__, "sku", sku)
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def offer(self) -> pulumi.Input[str]:
        """
        Name of the image to use. Required if publisher is specified.
        """
        return pulumi.get(self, "offer")

    @offer.setter
    def offer(self, value: pulumi.Input[str]):
        pulumi.set(self, "offer", value)

    @property
    @pulumi.getter
    def publisher(self) -> pulumi.Input[str]:
        """
        Image publisher. Required if resource_group_name is not specified.
        """
        return pulumi.get(self, "publisher")

    @publisher.setter
    def publisher(self, value: pulumi.Input[str]):
        pulumi.set(self, "publisher", value)

    @property
    @pulumi.getter
    def sku(self) -> pulumi.Input[str]:
        """
        Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        """
        return pulumi.get(self, "sku")

    @sku.setter
    def sku(self, value: pulumi.Input[str]):
        pulumi.set(self, "sku", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)


@pulumi.input_type
class ElastigroupAzureV3LoginArgs:
    def __init__(__self__, *,
                 user_name: pulumi.Input[str],
                 password: Optional[pulumi.Input[str]] = None,
                 ssh_public_key: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] user_name: Set admin access for accessing your VMs.
        :param pulumi.Input[str] password: Password for admin access to Windows VMs. Required for Windows OS types.
        :param pulumi.Input[str] ssh_public_key: SSH for admin access to Linux VMs. Required for Linux OS types.
        """
        pulumi.set(__self__, "user_name", user_name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if ssh_public_key is not None:
            pulumi.set(__self__, "ssh_public_key", ssh_public_key)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        Set admin access for accessing your VMs.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Password for admin access to Windows VMs. Required for Windows OS types.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="sshPublicKey")
    def ssh_public_key(self) -> Optional[pulumi.Input[str]]:
        """
        SSH for admin access to Linux VMs. Required for Linux OS types.
        """
        return pulumi.get(self, "ssh_public_key")

    @ssh_public_key.setter
    def ssh_public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ssh_public_key", value)


@pulumi.input_type
class ElastigroupAzureV3NetworkArgs:
    def __init__(__self__, *,
                 network_interfaces: pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceArgs']]],
                 resource_group_name: pulumi.Input[str],
                 virtual_network_name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] resource_group_name: Vnet Resource Group Name.
        :param pulumi.Input[str] virtual_network_name: Name of Vnet.
        """
        pulumi.set(__self__, "network_interfaces", network_interfaces)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "virtual_network_name", virtual_network_name)

    @property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceArgs']]]:
        return pulumi.get(self, "network_interfaces")

    @network_interfaces.setter
    def network_interfaces(self, value: pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceArgs']]]):
        pulumi.set(self, "network_interfaces", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Vnet Resource Group Name.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="virtualNetworkName")
    def virtual_network_name(self) -> pulumi.Input[str]:
        """
        Name of Vnet.
        """
        return pulumi.get(self, "virtual_network_name")

    @virtual_network_name.setter
    def virtual_network_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "virtual_network_name", value)


@pulumi.input_type
class ElastigroupAzureV3NetworkNetworkInterfaceArgs:
    def __init__(__self__, *,
                 assign_public_ip: pulumi.Input[bool],
                 is_primary: pulumi.Input[bool],
                 subnet_name: pulumi.Input[str],
                 additional_ip_configs: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs']]]] = None):
        """
        :param pulumi.Input[str] subnet_name: ID of subnet.
        :param pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs']]] additional_ip_configs: Array of additional IP configuration objects.
        """
        pulumi.set(__self__, "assign_public_ip", assign_public_ip)
        pulumi.set(__self__, "is_primary", is_primary)
        pulumi.set(__self__, "subnet_name", subnet_name)
        if additional_ip_configs is not None:
            pulumi.set(__self__, "additional_ip_configs", additional_ip_configs)

    @property
    @pulumi.getter(name="assignPublicIp")
    def assign_public_ip(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "assign_public_ip")

    @assign_public_ip.setter
    def assign_public_ip(self, value: pulumi.Input[bool]):
        pulumi.set(self, "assign_public_ip", value)

    @property
    @pulumi.getter(name="isPrimary")
    def is_primary(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "is_primary")

    @is_primary.setter
    def is_primary(self, value: pulumi.Input[bool]):
        pulumi.set(self, "is_primary", value)

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> pulumi.Input[str]:
        """
        ID of subnet.
        """
        return pulumi.get(self, "subnet_name")

    @subnet_name.setter
    def subnet_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet_name", value)

    @property
    @pulumi.getter(name="additionalIpConfigs")
    def additional_ip_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs']]]]:
        """
        Array of additional IP configuration objects.
        """
        return pulumi.get(self, "additional_ip_configs")

    @additional_ip_configs.setter
    def additional_ip_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs']]]]):
        pulumi.set(self, "additional_ip_configs", value)


@pulumi.input_type
class ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 private_ip_version: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] name: The IP configuration name.
        :param pulumi.Input[str] private_ip_version: Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
        """
        pulumi.set(__self__, "name", name)
        if private_ip_version is not None:
            pulumi.set(__self__, "private_ip_version", private_ip_version)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The IP configuration name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateIpVersion")
    def private_ip_version(self) -> Optional[pulumi.Input[str]]:
        """
        Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
        """
        return pulumi.get(self, "private_ip_version")

    @private_ip_version.setter
    def private_ip_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ip_version", value)


@pulumi.input_type
class ElastigroupAzureV3StrategyArgs:
    def __init__(__self__, *,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 fallback_to_on_demand: Optional[pulumi.Input[bool]] = None,
                 od_count: Optional[pulumi.Input[int]] = None,
                 spot_percentage: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] draining_timeout: Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        :param pulumi.Input[int] od_count: Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
        :param pulumi.Input[int] spot_percentage: TODO
        """
        if draining_timeout is not None:
            pulumi.set(__self__, "draining_timeout", draining_timeout)
        if fallback_to_on_demand is not None:
            pulumi.set(__self__, "fallback_to_on_demand", fallback_to_on_demand)
        if od_count is not None:
            pulumi.set(__self__, "od_count", od_count)
        if spot_percentage is not None:
            pulumi.set(__self__, "spot_percentage", spot_percentage)

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        """
        return pulumi.get(self, "draining_timeout")

    @draining_timeout.setter
    def draining_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "draining_timeout", value)

    @property
    @pulumi.getter(name="fallbackToOnDemand")
    def fallback_to_on_demand(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "fallback_to_on_demand")

    @fallback_to_on_demand.setter
    def fallback_to_on_demand(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "fallback_to_on_demand", value)

    @property
    @pulumi.getter(name="odCount")
    def od_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of On-Demand instances to maintain. Required if low_priority_percentage is not specified.
        """
        return pulumi.get(self, "od_count")

    @od_count.setter
    def od_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "od_count", value)

    @property
    @pulumi.getter(name="spotPercentage")
    def spot_percentage(self) -> Optional[pulumi.Input[int]]:
        """
        TODO
        """
        return pulumi.get(self, "spot_percentage")

    @spot_percentage.setter
    def spot_percentage(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "spot_percentage", value)


@pulumi.input_type
class HealthCheckCheckArgs:
    def __init__(__self__, *,
                 healthy: pulumi.Input[int],
                 interval: pulumi.Input[int],
                 port: pulumi.Input[int],
                 protocol: pulumi.Input[str],
                 unhealthy: pulumi.Input[int],
                 end_point: Optional[pulumi.Input[str]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 time_out: Optional[pulumi.Input[int]] = None,
                 timeout: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] healthy: The number of consecutive successful health checks that must occur before declaring an instance healthy.
        :param pulumi.Input[int] interval: The amount of time (in seconds) between each health check (minimum: 10).
        :param pulumi.Input[int] port: The port of the Spotinst HCS (default: 80).
        :param pulumi.Input[str] protocol: The protocol to use to connect with the instance. Valid values: http, https.
        :param pulumi.Input[int] unhealthy: The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        :param pulumi.Input[str] endpoint: The destination for the request.
        :param pulumi.Input[int] timeout: the amount of time (in seconds) to wait when receiving a response from the health check.
        """
        pulumi.set(__self__, "healthy", healthy)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "protocol", protocol)
        pulumi.set(__self__, "unhealthy", unhealthy)
        if end_point is not None:
            pulumi.set(__self__, "end_point", end_point)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if time_out is not None:
            pulumi.set(__self__, "time_out", time_out)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter
    def healthy(self) -> pulumi.Input[int]:
        """
        The number of consecutive successful health checks that must occur before declaring an instance healthy.
        """
        return pulumi.get(self, "healthy")

    @healthy.setter
    def healthy(self, value: pulumi.Input[int]):
        pulumi.set(self, "healthy", value)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[int]:
        """
        The amount of time (in seconds) between each health check (minimum: 10).
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[int]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        The port of the Spotinst HCS (default: 80).
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        The protocol to use to connect with the instance. Valid values: http, https.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def unhealthy(self) -> pulumi.Input[int]:
        """
        The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        """
        return pulumi.get(self, "unhealthy")

    @unhealthy.setter
    def unhealthy(self, value: pulumi.Input[int]):
        pulumi.set(self, "unhealthy", value)

    @property
    @pulumi.getter(name="endPoint")
    def end_point(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "end_point")

    @end_point.setter
    def end_point(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_point", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The destination for the request.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="timeOut")
    def time_out(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "time_out")

    @time_out.setter
    def time_out(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "time_out", value)

    @property
    @pulumi.getter
    def timeout(self) -> Optional[pulumi.Input[int]]:
        """
        the amount of time (in seconds) to wait when receiving a response from the health check.
        """
        return pulumi.get(self, "timeout")

    @timeout.setter
    def timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout", value)


