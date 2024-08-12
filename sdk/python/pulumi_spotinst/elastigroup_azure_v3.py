# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ElastigroupAzureV3Args', 'ElastigroupAzureV3']

@pulumi.input_type
class ElastigroupAzureV3Args:
    def __init__(__self__, *,
                 fallback_to_on_demand: pulumi.Input[bool],
                 network: pulumi.Input['ElastigroupAzureV3NetworkArgs'],
                 os: pulumi.Input[str],
                 region: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 vm_sizes: pulumi.Input['ElastigroupAzureV3VmSizesArgs'],
                 custom_data: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]] = None,
                 login: Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']] = None,
                 managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 on_demand_count: Optional[pulumi.Input[int]] = None,
                 spot_percentage: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]] = None):
        """
        The set of arguments for constructing a ElastigroupAzureV3 resource.
        """
        pulumi.set(__self__, "fallback_to_on_demand", fallback_to_on_demand)
        pulumi.set(__self__, "network", network)
        pulumi.set(__self__, "os", os)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "vm_sizes", vm_sizes)
        if custom_data is not None:
            pulumi.set(__self__, "custom_data", custom_data)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if draining_timeout is not None:
            pulumi.set(__self__, "draining_timeout", draining_timeout)
        if images is not None:
            pulumi.set(__self__, "images", images)
        if login is not None:
            pulumi.set(__self__, "login", login)
        if managed_service_identities is not None:
            pulumi.set(__self__, "managed_service_identities", managed_service_identities)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if on_demand_count is not None:
            pulumi.set(__self__, "on_demand_count", on_demand_count)
        if spot_percentage is not None:
            pulumi.set(__self__, "spot_percentage", spot_percentage)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="fallbackToOnDemand")
    def fallback_to_on_demand(self) -> pulumi.Input[bool]:
        return pulumi.get(self, "fallback_to_on_demand")

    @fallback_to_on_demand.setter
    def fallback_to_on_demand(self, value: pulumi.Input[bool]):
        pulumi.set(self, "fallback_to_on_demand", value)

    @property
    @pulumi.getter
    def network(self) -> pulumi.Input['ElastigroupAzureV3NetworkArgs']:
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: pulumi.Input['ElastigroupAzureV3NetworkArgs']):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter
    def os(self) -> pulumi.Input[str]:
        return pulumi.get(self, "os")

    @os.setter
    def os(self, value: pulumi.Input[str]):
        pulumi.set(self, "os", value)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="vmSizes")
    def vm_sizes(self) -> pulumi.Input['ElastigroupAzureV3VmSizesArgs']:
        return pulumi.get(self, "vm_sizes")

    @vm_sizes.setter
    def vm_sizes(self, value: pulumi.Input['ElastigroupAzureV3VmSizesArgs']):
        pulumi.set(self, "vm_sizes", value)

    @property
    @pulumi.getter(name="customData")
    def custom_data(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "custom_data")

    @custom_data.setter
    def custom_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_data", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "draining_timeout")

    @draining_timeout.setter
    def draining_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "draining_timeout", value)

    @property
    @pulumi.getter
    def images(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]]:
        return pulumi.get(self, "images")

    @images.setter
    def images(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]]):
        pulumi.set(self, "images", value)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']]:
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter(name="managedServiceIdentities")
    def managed_service_identities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]]:
        return pulumi.get(self, "managed_service_identities")

    @managed_service_identities.setter
    def managed_service_identities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]]):
        pulumi.set(self, "managed_service_identities", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="onDemandCount")
    def on_demand_count(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "on_demand_count")

    @on_demand_count.setter
    def on_demand_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "on_demand_count", value)

    @property
    @pulumi.getter(name="spotPercentage")
    def spot_percentage(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "spot_percentage")

    @spot_percentage.setter
    def spot_percentage(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "spot_percentage", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ElastigroupAzureV3State:
    def __init__(__self__, *,
                 custom_data: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 fallback_to_on_demand: Optional[pulumi.Input[bool]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]] = None,
                 login: Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']] = None,
                 managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input['ElastigroupAzureV3NetworkArgs']] = None,
                 on_demand_count: Optional[pulumi.Input[int]] = None,
                 os: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 spot_percentage: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]] = None,
                 vm_sizes: Optional[pulumi.Input['ElastigroupAzureV3VmSizesArgs']] = None):
        """
        Input properties used for looking up and filtering ElastigroupAzureV3 resources.
        """
        if custom_data is not None:
            pulumi.set(__self__, "custom_data", custom_data)
        if desired_capacity is not None:
            pulumi.set(__self__, "desired_capacity", desired_capacity)
        if draining_timeout is not None:
            pulumi.set(__self__, "draining_timeout", draining_timeout)
        if fallback_to_on_demand is not None:
            pulumi.set(__self__, "fallback_to_on_demand", fallback_to_on_demand)
        if images is not None:
            pulumi.set(__self__, "images", images)
        if login is not None:
            pulumi.set(__self__, "login", login)
        if managed_service_identities is not None:
            pulumi.set(__self__, "managed_service_identities", managed_service_identities)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network is not None:
            pulumi.set(__self__, "network", network)
        if on_demand_count is not None:
            pulumi.set(__self__, "on_demand_count", on_demand_count)
        if os is not None:
            pulumi.set(__self__, "os", os)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if spot_percentage is not None:
            pulumi.set(__self__, "spot_percentage", spot_percentage)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vm_sizes is not None:
            pulumi.set(__self__, "vm_sizes", vm_sizes)

    @property
    @pulumi.getter(name="customData")
    def custom_data(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "custom_data")

    @custom_data.setter
    def custom_data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_data", value)

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "desired_capacity")

    @desired_capacity.setter
    def desired_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "desired_capacity", value)

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> Optional[pulumi.Input[int]]:
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
    @pulumi.getter
    def images(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]]:
        return pulumi.get(self, "images")

    @images.setter
    def images(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ImageArgs']]]]):
        pulumi.set(self, "images", value)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']]:
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input['ElastigroupAzureV3LoginArgs']]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter(name="managedServiceIdentities")
    def managed_service_identities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]]:
        return pulumi.get(self, "managed_service_identities")

    @managed_service_identities.setter
    def managed_service_identities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3ManagedServiceIdentityArgs']]]]):
        pulumi.set(self, "managed_service_identities", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def network(self) -> Optional[pulumi.Input['ElastigroupAzureV3NetworkArgs']]:
        return pulumi.get(self, "network")

    @network.setter
    def network(self, value: Optional[pulumi.Input['ElastigroupAzureV3NetworkArgs']]):
        pulumi.set(self, "network", value)

    @property
    @pulumi.getter(name="onDemandCount")
    def on_demand_count(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "on_demand_count")

    @on_demand_count.setter
    def on_demand_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "on_demand_count", value)

    @property
    @pulumi.getter
    def os(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "os")

    @os.setter
    def os(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "os", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter(name="spotPercentage")
    def spot_percentage(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "spot_percentage")

    @spot_percentage.setter
    def spot_percentage(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "spot_percentage", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ElastigroupAzureV3TagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vmSizes")
    def vm_sizes(self) -> Optional[pulumi.Input['ElastigroupAzureV3VmSizesArgs']]:
        return pulumi.get(self, "vm_sizes")

    @vm_sizes.setter
    def vm_sizes(self, value: Optional[pulumi.Input['ElastigroupAzureV3VmSizesArgs']]):
        pulumi.set(self, "vm_sizes", value)


class ElastigroupAzureV3(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_data: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 fallback_to_on_demand: Optional[pulumi.Input[bool]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ImageArgs', 'ElastigroupAzureV3ImageArgsDict']]]]] = None,
                 login: Optional[pulumi.Input[Union['ElastigroupAzureV3LoginArgs', 'ElastigroupAzureV3LoginArgsDict']]] = None,
                 managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ManagedServiceIdentityArgs', 'ElastigroupAzureV3ManagedServiceIdentityArgsDict']]]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[Union['ElastigroupAzureV3NetworkArgs', 'ElastigroupAzureV3NetworkArgsDict']]] = None,
                 on_demand_count: Optional[pulumi.Input[int]] = None,
                 os: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 spot_percentage: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3TagArgs', 'ElastigroupAzureV3TagArgsDict']]]]] = None,
                 vm_sizes: Optional[pulumi.Input[Union['ElastigroupAzureV3VmSizesArgs', 'ElastigroupAzureV3VmSizesArgsDict']]] = None,
                 __props__=None):
        """
        Create a ElastigroupAzureV3 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ElastigroupAzureV3Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ElastigroupAzureV3 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ElastigroupAzureV3Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ElastigroupAzureV3Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_data: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 draining_timeout: Optional[pulumi.Input[int]] = None,
                 fallback_to_on_demand: Optional[pulumi.Input[bool]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ImageArgs', 'ElastigroupAzureV3ImageArgsDict']]]]] = None,
                 login: Optional[pulumi.Input[Union['ElastigroupAzureV3LoginArgs', 'ElastigroupAzureV3LoginArgsDict']]] = None,
                 managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ManagedServiceIdentityArgs', 'ElastigroupAzureV3ManagedServiceIdentityArgsDict']]]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[Union['ElastigroupAzureV3NetworkArgs', 'ElastigroupAzureV3NetworkArgsDict']]] = None,
                 on_demand_count: Optional[pulumi.Input[int]] = None,
                 os: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 spot_percentage: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3TagArgs', 'ElastigroupAzureV3TagArgsDict']]]]] = None,
                 vm_sizes: Optional[pulumi.Input[Union['ElastigroupAzureV3VmSizesArgs', 'ElastigroupAzureV3VmSizesArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ElastigroupAzureV3Args.__new__(ElastigroupAzureV3Args)

            __props__.__dict__["custom_data"] = custom_data
            __props__.__dict__["desired_capacity"] = desired_capacity
            __props__.__dict__["draining_timeout"] = draining_timeout
            if fallback_to_on_demand is None and not opts.urn:
                raise TypeError("Missing required property 'fallback_to_on_demand'")
            __props__.__dict__["fallback_to_on_demand"] = fallback_to_on_demand
            __props__.__dict__["images"] = images
            __props__.__dict__["login"] = login
            __props__.__dict__["managed_service_identities"] = managed_service_identities
            __props__.__dict__["max_size"] = max_size
            __props__.__dict__["min_size"] = min_size
            __props__.__dict__["name"] = name
            if network is None and not opts.urn:
                raise TypeError("Missing required property 'network'")
            __props__.__dict__["network"] = network
            __props__.__dict__["on_demand_count"] = on_demand_count
            if os is None and not opts.urn:
                raise TypeError("Missing required property 'os'")
            __props__.__dict__["os"] = os
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["spot_percentage"] = spot_percentage
            __props__.__dict__["tags"] = tags
            if vm_sizes is None and not opts.urn:
                raise TypeError("Missing required property 'vm_sizes'")
            __props__.__dict__["vm_sizes"] = vm_sizes
        super(ElastigroupAzureV3, __self__).__init__(
            'spotinst:index/elastigroupAzureV3:ElastigroupAzureV3',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_data: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[int]] = None,
            draining_timeout: Optional[pulumi.Input[int]] = None,
            fallback_to_on_demand: Optional[pulumi.Input[bool]] = None,
            images: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ImageArgs', 'ElastigroupAzureV3ImageArgsDict']]]]] = None,
            login: Optional[pulumi.Input[Union['ElastigroupAzureV3LoginArgs', 'ElastigroupAzureV3LoginArgsDict']]] = None,
            managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3ManagedServiceIdentityArgs', 'ElastigroupAzureV3ManagedServiceIdentityArgsDict']]]]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network: Optional[pulumi.Input[Union['ElastigroupAzureV3NetworkArgs', 'ElastigroupAzureV3NetworkArgsDict']]] = None,
            on_demand_count: Optional[pulumi.Input[int]] = None,
            os: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            spot_percentage: Optional[pulumi.Input[int]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ElastigroupAzureV3TagArgs', 'ElastigroupAzureV3TagArgsDict']]]]] = None,
            vm_sizes: Optional[pulumi.Input[Union['ElastigroupAzureV3VmSizesArgs', 'ElastigroupAzureV3VmSizesArgsDict']]] = None) -> 'ElastigroupAzureV3':
        """
        Get an existing ElastigroupAzureV3 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ElastigroupAzureV3State.__new__(_ElastigroupAzureV3State)

        __props__.__dict__["custom_data"] = custom_data
        __props__.__dict__["desired_capacity"] = desired_capacity
        __props__.__dict__["draining_timeout"] = draining_timeout
        __props__.__dict__["fallback_to_on_demand"] = fallback_to_on_demand
        __props__.__dict__["images"] = images
        __props__.__dict__["login"] = login
        __props__.__dict__["managed_service_identities"] = managed_service_identities
        __props__.__dict__["max_size"] = max_size
        __props__.__dict__["min_size"] = min_size
        __props__.__dict__["name"] = name
        __props__.__dict__["network"] = network
        __props__.__dict__["on_demand_count"] = on_demand_count
        __props__.__dict__["os"] = os
        __props__.__dict__["region"] = region
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["spot_percentage"] = spot_percentage
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vm_sizes"] = vm_sizes
        return ElastigroupAzureV3(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customData")
    def custom_data(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "custom_data")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="drainingTimeout")
    def draining_timeout(self) -> pulumi.Output[int]:
        return pulumi.get(self, "draining_timeout")

    @property
    @pulumi.getter(name="fallbackToOnDemand")
    def fallback_to_on_demand(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "fallback_to_on_demand")

    @property
    @pulumi.getter
    def images(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupAzureV3Image']]]:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter
    def login(self) -> pulumi.Output[Optional['outputs.ElastigroupAzureV3Login']]:
        return pulumi.get(self, "login")

    @property
    @pulumi.getter(name="managedServiceIdentities")
    def managed_service_identities(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupAzureV3ManagedServiceIdentity']]]:
        return pulumi.get(self, "managed_service_identities")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[int]:
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[int]:
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.ElastigroupAzureV3Network']:
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="onDemandCount")
    def on_demand_count(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "on_demand_count")

    @property
    @pulumi.getter
    def os(self) -> pulumi.Output[str]:
        return pulumi.get(self, "os")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="spotPercentage")
    def spot_percentage(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "spot_percentage")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupAzureV3Tag']]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vmSizes")
    def vm_sizes(self) -> pulumi.Output['outputs.ElastigroupAzureV3VmSizes']:
        return pulumi.get(self, "vm_sizes")

