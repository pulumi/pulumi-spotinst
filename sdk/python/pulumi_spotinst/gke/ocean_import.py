# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class OceanImport(pulumi.CustomResource):
    backend_services: pulumi.Output[list]
    """
    Describes the backend service configurations.

      * `locationType` (`str`) - Sets which location the backend services will be active. Valid values: `regional`, `global`.
      * `namedPorts` (`list`)
        * `name` (`str`)
        * `ports` (`list`) - A list of ports.

      * `scheme` (`str`) - Use when `location_type` is `regional`. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
      * `serviceName` (`str`) - The name of the backend service.
    """
    cluster_controller_id: pulumi.Output[str]
    cluster_name: pulumi.Output[str]
    """
    The GKE cluster name.
    """
    desired_capacity: pulumi.Output[float]
    """
    The number of instances to launch and maintain in the cluster. 
    """
    location: pulumi.Output[str]
    """
    The zone the master cluster is located in. 
    """
    max_size: pulumi.Output[float]
    """
    The upper limit of instances the cluster can scale up to.
    """
    min_size: pulumi.Output[float]
    """
    The lower limit of instances the cluster can scale down to.
    """
    whitelists: pulumi.Output[list]
    def __init__(__self__, resource_name, opts=None, backend_services=None, cluster_name=None, desired_capacity=None, location=None, max_size=None, min_size=None, whitelists=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Ocean GKE import resource.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/ocean_gke_import.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] backend_services: Describes the backend service configurations.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster. 
        :param pulumi.Input[str] location: The zone the master cluster is located in. 
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.

        The **backend_services** object supports the following:

          * `locationType` (`pulumi.Input[str]`) - Sets which location the backend services will be active. Valid values: `regional`, `global`.
          * `namedPorts` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `ports` (`pulumi.Input[list]`) - A list of ports.

          * `scheme` (`pulumi.Input[str]`) - Use when `location_type` is `regional`. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
          * `serviceName` (`pulumi.Input[str]`) - The name of the backend service.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['backend_services'] = backend_services
            if cluster_name is None:
                raise TypeError("Missing required property 'cluster_name'")
            __props__['cluster_name'] = cluster_name
            __props__['desired_capacity'] = desired_capacity
            if location is None:
                raise TypeError("Missing required property 'location'")
            __props__['location'] = location
            __props__['max_size'] = max_size
            __props__['min_size'] = min_size
            __props__['whitelists'] = whitelists
            __props__['cluster_controller_id'] = None
        super(OceanImport, __self__).__init__(
            'spotinst:gke/oceanImport:OceanImport',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, backend_services=None, cluster_controller_id=None, cluster_name=None, desired_capacity=None, location=None, max_size=None, min_size=None, whitelists=None):
        """
        Get an existing OceanImport resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[list] backend_services: Describes the backend service configurations.
        :param pulumi.Input[str] cluster_name: The GKE cluster name.
        :param pulumi.Input[float] desired_capacity: The number of instances to launch and maintain in the cluster. 
        :param pulumi.Input[str] location: The zone the master cluster is located in. 
        :param pulumi.Input[float] max_size: The upper limit of instances the cluster can scale up to.
        :param pulumi.Input[float] min_size: The lower limit of instances the cluster can scale down to.

        The **backend_services** object supports the following:

          * `locationType` (`pulumi.Input[str]`) - Sets which location the backend services will be active. Valid values: `regional`, `global`.
          * `namedPorts` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `ports` (`pulumi.Input[list]`) - A list of ports.

          * `scheme` (`pulumi.Input[str]`) - Use when `location_type` is `regional`. Set the traffic for the backend service to either between the instances in the vpc or to traffic from the internet. Valid values: `INTERNAL`, `EXTERNAL`.
          * `serviceName` (`pulumi.Input[str]`) - The name of the backend service.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["backend_services"] = backend_services
        __props__["cluster_controller_id"] = cluster_controller_id
        __props__["cluster_name"] = cluster_name
        __props__["desired_capacity"] = desired_capacity
        __props__["location"] = location
        __props__["max_size"] = max_size
        __props__["min_size"] = min_size
        __props__["whitelists"] = whitelists
        return OceanImport(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

