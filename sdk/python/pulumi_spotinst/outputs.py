# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'ElastigroupAzureV3Image',
    'ElastigroupAzureV3ImageCustom',
    'ElastigroupAzureV3ImageMarketplace',
    'ElastigroupAzureV3Login',
    'ElastigroupAzureV3ManagedServiceIdentity',
    'ElastigroupAzureV3Network',
    'ElastigroupAzureV3NetworkNetworkInterface',
    'ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig',
    'ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup',
    'ElastigroupAzureV3Strategy',
    'HealthCheckCheck',
]

@pulumi.output_type
class ElastigroupAzureV3Image(dict):
    def __init__(__self__, *,
                 customs: Optional[Sequence['outputs.ElastigroupAzureV3ImageCustom']] = None,
                 marketplaces: Optional[Sequence['outputs.ElastigroupAzureV3ImageMarketplace']] = None):
        if customs is not None:
            pulumi.set(__self__, "customs", customs)
        if marketplaces is not None:
            pulumi.set(__self__, "marketplaces", marketplaces)

    @property
    @pulumi.getter
    def customs(self) -> Optional[Sequence['outputs.ElastigroupAzureV3ImageCustom']]:
        return pulumi.get(self, "customs")

    @property
    @pulumi.getter
    def marketplaces(self) -> Optional[Sequence['outputs.ElastigroupAzureV3ImageMarketplace']]:
        return pulumi.get(self, "marketplaces")


@pulumi.output_type
class ElastigroupAzureV3ImageCustom(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "imageName":
            suggest = "image_name"
        elif key == "resourceGroupName":
            suggest = "resource_group_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3ImageCustom. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3ImageCustom.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3ImageCustom.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 image_name: str,
                 resource_group_name: str):
        """
        :param str image_name: Name of the custom image. Required if resource_group_name is specified.
        :param str resource_group_name: - The resource group of the Application Security Group.
               }
        """
        pulumi.set(__self__, "image_name", image_name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter(name="imageName")
    def image_name(self) -> str:
        """
        Name of the custom image. Required if resource_group_name is specified.
        """
        return pulumi.get(self, "image_name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        """
        - The resource group of the Application Security Group.
        }
        """
        return pulumi.get(self, "resource_group_name")


@pulumi.output_type
class ElastigroupAzureV3ImageMarketplace(dict):
    def __init__(__self__, *,
                 offer: str,
                 publisher: str,
                 sku: str,
                 version: str):
        """
        :param str offer: Name of the image to use. Required if publisher is specified.
        :param str publisher: Image publisher. Required if resource_group_name is not specified.
        :param str sku: Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        :param str version: -
        """
        pulumi.set(__self__, "offer", offer)
        pulumi.set(__self__, "publisher", publisher)
        pulumi.set(__self__, "sku", sku)
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def offer(self) -> str:
        """
        Name of the image to use. Required if publisher is specified.
        """
        return pulumi.get(self, "offer")

    @property
    @pulumi.getter
    def publisher(self) -> str:
        """
        Image publisher. Required if resource_group_name is not specified.
        """
        return pulumi.get(self, "publisher")

    @property
    @pulumi.getter
    def sku(self) -> str:
        """
        Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        """
        return pulumi.get(self, "sku")

    @property
    @pulumi.getter
    def version(self) -> str:
        """
        -
        """
        return pulumi.get(self, "version")


@pulumi.output_type
class ElastigroupAzureV3Login(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "userName":
            suggest = "user_name"
        elif key == "sshPublicKey":
            suggest = "ssh_public_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3Login. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3Login.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3Login.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 user_name: str,
                 password: Optional[str] = None,
                 ssh_public_key: Optional[str] = None):
        """
        :param str user_name: Set admin access for accessing your VMs.
        :param str password: Password for admin access to Windows VMs. Required for Windows OS types.
        :param str ssh_public_key: SSH for admin access to Linux VMs. Required for Linux OS types.
        """
        pulumi.set(__self__, "user_name", user_name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if ssh_public_key is not None:
            pulumi.set(__self__, "ssh_public_key", ssh_public_key)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Set admin access for accessing your VMs.
        """
        return pulumi.get(self, "user_name")

    @property
    @pulumi.getter
    def password(self) -> Optional[str]:
        """
        Password for admin access to Windows VMs. Required for Windows OS types.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="sshPublicKey")
    def ssh_public_key(self) -> Optional[str]:
        """
        SSH for admin access to Linux VMs. Required for Linux OS types.
        """
        return pulumi.get(self, "ssh_public_key")


@pulumi.output_type
class ElastigroupAzureV3ManagedServiceIdentity(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "resourceGroupName":
            suggest = "resource_group_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3ManagedServiceIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3ManagedServiceIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3ManagedServiceIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 resource_group_name: str):
        """
        :param str name: - The name of the Application Security group.
        :param str resource_group_name: - The resource group of the Application Security Group.
               }
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        - The name of the Application Security group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        """
        - The resource group of the Application Security Group.
        }
        """
        return pulumi.get(self, "resource_group_name")


@pulumi.output_type
class ElastigroupAzureV3Network(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "networkInterfaces":
            suggest = "network_interfaces"
        elif key == "resourceGroupName":
            suggest = "resource_group_name"
        elif key == "virtualNetworkName":
            suggest = "virtual_network_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3Network. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3Network.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3Network.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 network_interfaces: Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterface'],
                 resource_group_name: str,
                 virtual_network_name: str):
        """
        :param Sequence['ElastigroupAzureV3NetworkNetworkInterfaceArgs'] network_interfaces: -
        :param str resource_group_name: - The resource group of the Application Security Group.
               }
        :param str virtual_network_name: Name of Vnet.
        """
        pulumi.set(__self__, "network_interfaces", network_interfaces)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "virtual_network_name", virtual_network_name)

    @property
    @pulumi.getter(name="networkInterfaces")
    def network_interfaces(self) -> Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterface']:
        """
        -
        """
        return pulumi.get(self, "network_interfaces")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        """
        - The resource group of the Application Security Group.
        }
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="virtualNetworkName")
    def virtual_network_name(self) -> str:
        """
        Name of Vnet.
        """
        return pulumi.get(self, "virtual_network_name")


@pulumi.output_type
class ElastigroupAzureV3NetworkNetworkInterface(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "assignPublicIp":
            suggest = "assign_public_ip"
        elif key == "isPrimary":
            suggest = "is_primary"
        elif key == "subnetName":
            suggest = "subnet_name"
        elif key == "additionalIpConfigs":
            suggest = "additional_ip_configs"
        elif key == "applicationSecurityGroups":
            suggest = "application_security_groups"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3NetworkNetworkInterface. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3NetworkNetworkInterface.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3NetworkNetworkInterface.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 assign_public_ip: bool,
                 is_primary: bool,
                 subnet_name: str,
                 additional_ip_configs: Optional[Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig']] = None,
                 application_security_groups: Optional[Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup']] = None):
        """
        :param bool is_primary: -
        :param str subnet_name: ID of subnet.
        :param Sequence['ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfigArgs'] additional_ip_configs: Array of additional IP configuration objects.
        :param Sequence['ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroupArgs'] application_security_groups: - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
        """
        pulumi.set(__self__, "assign_public_ip", assign_public_ip)
        pulumi.set(__self__, "is_primary", is_primary)
        pulumi.set(__self__, "subnet_name", subnet_name)
        if additional_ip_configs is not None:
            pulumi.set(__self__, "additional_ip_configs", additional_ip_configs)
        if application_security_groups is not None:
            pulumi.set(__self__, "application_security_groups", application_security_groups)

    @property
    @pulumi.getter(name="assignPublicIp")
    def assign_public_ip(self) -> bool:
        return pulumi.get(self, "assign_public_ip")

    @property
    @pulumi.getter(name="isPrimary")
    def is_primary(self) -> bool:
        """
        -
        """
        return pulumi.get(self, "is_primary")

    @property
    @pulumi.getter(name="subnetName")
    def subnet_name(self) -> str:
        """
        ID of subnet.
        """
        return pulumi.get(self, "subnet_name")

    @property
    @pulumi.getter(name="additionalIpConfigs")
    def additional_ip_configs(self) -> Optional[Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig']]:
        """
        Array of additional IP configuration objects.
        """
        return pulumi.get(self, "additional_ip_configs")

    @property
    @pulumi.getter(name="applicationSecurityGroups")
    def application_security_groups(self) -> Optional[Sequence['outputs.ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup']]:
        """
        - List of Application Security Groups that will be associated to the primary ip configuration of the network interface.
        """
        return pulumi.get(self, "application_security_groups")


@pulumi.output_type
class ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "privateIpVersion":
            suggest = "private_ip_version"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3NetworkNetworkInterfaceAdditionalIpConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 private_ip_version: Optional[str] = None):
        """
        :param str name: - The name of the Application Security group.
        :param str private_ip_version: Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
        """
        pulumi.set(__self__, "name", name)
        if private_ip_version is not None:
            pulumi.set(__self__, "private_ip_version", private_ip_version)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        - The name of the Application Security group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateIpVersion")
    def private_ip_version(self) -> Optional[str]:
        """
        Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ip configuration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.
        """
        return pulumi.get(self, "private_ip_version")


@pulumi.output_type
class ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "resourceGroupName":
            suggest = "resource_group_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3NetworkNetworkInterfaceApplicationSecurityGroup.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 resource_group_name: str):
        """
        :param str name: - The name of the Application Security group.
        :param str resource_group_name: - The resource group of the Application Security Group.
               }
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "resource_group_name", resource_group_name)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        - The name of the Application Security group.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        """
        - The resource group of the Application Security Group.
        }
        """
        return pulumi.get(self, "resource_group_name")


@pulumi.output_type
class ElastigroupAzureV3Strategy(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "drainingTimeout":
            suggest = "draining_timeout"
        elif key == "fallbackToOnDemand":
            suggest = "fallback_to_on_demand"
        elif key == "odCount":
            suggest = "od_count"
        elif key == "spotPercentage":
            suggest = "spot_percentage"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ElastigroupAzureV3Strategy. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ElastigroupAzureV3Strategy.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ElastigroupAzureV3Strategy.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 draining_timeout: Optional[int] = None,
                 fallback_to_on_demand: Optional[bool] = None,
                 od_count: Optional[int] = None,
                 spot_percentage: Optional[int] = None):
        """
        :param int draining_timeout: Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        :param bool fallback_to_on_demand: -
        :param int od_count: Number of On-Demand instances to maintain. Required if `low_priority_percentage` is not specified.
        :param int spot_percentage: TODO
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
    def draining_timeout(self) -> Optional[int]:
        """
        Time (seconds) to allow the instance to be drained from incoming TCP connections and detached from MLB before terminating it during a scale-down operation.
        """
        return pulumi.get(self, "draining_timeout")

    @property
    @pulumi.getter(name="fallbackToOnDemand")
    def fallback_to_on_demand(self) -> Optional[bool]:
        """
        -
        """
        return pulumi.get(self, "fallback_to_on_demand")

    @property
    @pulumi.getter(name="odCount")
    def od_count(self) -> Optional[int]:
        """
        Number of On-Demand instances to maintain. Required if `low_priority_percentage` is not specified.
        """
        return pulumi.get(self, "od_count")

    @property
    @pulumi.getter(name="spotPercentage")
    def spot_percentage(self) -> Optional[int]:
        """
        TODO
        """
        return pulumi.get(self, "spot_percentage")


@pulumi.output_type
class HealthCheckCheck(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "endPoint":
            suggest = "end_point"
        elif key == "timeOut":
            suggest = "time_out"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in HealthCheckCheck. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        HealthCheckCheck.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        HealthCheckCheck.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 healthy: int,
                 interval: int,
                 port: int,
                 protocol: str,
                 unhealthy: int,
                 end_point: Optional[str] = None,
                 endpoint: Optional[str] = None,
                 time_out: Optional[int] = None,
                 timeout: Optional[int] = None):
        """
        :param int healthy: The number of consecutive successful health checks that must occur before declaring an instance healthy.
        :param int interval: The amount of time (in seconds) between each health check (minimum: 10).
        :param int port: The port of the Spotinst HCS (default: 80).
        :param str protocol: The protocol to use to connect with the instance. Valid values: http, https.
        :param int unhealthy: The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        :param str endpoint: The destination for the request.
        :param int timeout: the amount of time (in seconds) to wait when receiving a response from the health check.
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
    def healthy(self) -> int:
        """
        The number of consecutive successful health checks that must occur before declaring an instance healthy.
        """
        return pulumi.get(self, "healthy")

    @property
    @pulumi.getter
    def interval(self) -> int:
        """
        The amount of time (in seconds) between each health check (minimum: 10).
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port of the Spotinst HCS (default: 80).
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The protocol to use to connect with the instance. Valid values: http, https.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def unhealthy(self) -> int:
        """
        The number of consecutive failed health checks that must occur before declaring an instance unhealthy.
        """
        return pulumi.get(self, "unhealthy")

    @property
    @pulumi.getter(name="endPoint")
    def end_point(self) -> Optional[str]:
        return pulumi.get(self, "end_point")

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[str]:
        """
        The destination for the request.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="timeOut")
    def time_out(self) -> Optional[int]:
        return pulumi.get(self, "time_out")

    @property
    @pulumi.getter
    def timeout(self) -> Optional[int]:
        """
        the amount of time (in seconds) to wait when receiving a response from the health check.
        """
        return pulumi.get(self, "timeout")


