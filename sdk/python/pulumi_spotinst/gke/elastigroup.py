# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables


class Elastigroup(pulumi.CustomResource):
    backend_services: pulumi.Output[list]
    cluster_id: pulumi.Output[str]
    """
    The name of the GKE cluster you wish to import.
    """
    cluster_zone_name: pulumi.Output[str]
    """
    The zone where the cluster is hosted.
    """
    desired_capacity: pulumi.Output[float]
    disks: pulumi.Output[list]
    draining_timeout: pulumi.Output[float]
    fallback_to_ondemand: pulumi.Output[bool]
    gpu: pulumi.Output[list]
    instance_types_customs: pulumi.Output[list]
    instance_types_ondemand: pulumi.Output[str]
    instance_types_preemptibles: pulumi.Output[list]
    integration_docker_swarm: pulumi.Output[dict]
    integration_gke: pulumi.Output[dict]
    ip_forwarding: pulumi.Output[bool]
    labels: pulumi.Output[list]
    max_size: pulumi.Output[float]
    metadatas: pulumi.Output[list]
    min_size: pulumi.Output[float]
    name: pulumi.Output[str]
    network_interfaces: pulumi.Output[list]
    node_image: pulumi.Output[str]
    """
    The image that will be used for the node VMs. Possible values: COS, UBUNTU.
    """
    ondemand_count: pulumi.Output[float]
    preemptible_percentage: pulumi.Output[float]
    scaling_down_policies: pulumi.Output[list]
    scaling_up_policies: pulumi.Output[list]
    service_account: pulumi.Output[str]
    shutdown_script: pulumi.Output[str]
    startup_script: pulumi.Output[str]
    tags: pulumi.Output[list]
    def __init__(__self__, resource_name, opts=None, backend_services=None, cluster_id=None, cluster_zone_name=None, desired_capacity=None, disks=None, draining_timeout=None, fallback_to_ondemand=None, gpu=None, instance_types_customs=None, instance_types_ondemand=None, instance_types_preemptibles=None, integration_docker_swarm=None, integration_gke=None, ip_forwarding=None, labels=None, max_size=None, metadatas=None, min_size=None, name=None, network_interfaces=None, node_image=None, ondemand_count=None, preemptible_percentage=None, scaling_down_policies=None, scaling_up_policies=None, service_account=None, shutdown_script=None, startup_script=None, tags=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Elastigroup GKE resource. Please see [Importing a GKE cluster](https://api.spotinst.com/elastigroup-for-google-cloud/tutorials/import-a-gke-cluster-as-an-elastigroup/) for detailed information.

        ## Example Usage

        A gke.Elastigroup supports all of the fields defined in spotinst_elastigroup_gcp.

        There are two main differences:

        * you must include `cluster_zone_name` and `cluster_id`
        * a handful of parameters are created remotely and will not appear in the diff. A complete list can be found below.

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        example_gke_elastigroup = spotinst.gke.Elastigroup("example-gke-elastigroup",
            backend_services=[{
                "locationType": "global",
                "namedPorts": [{
                    "name": "http",
                    "ports": [
                        80,
                        8080,
                    ],
                }],
                "serviceName": "backend-service",
            }],
            cluster_zone_name="us-central1-a",
            desired_capacity=3,
            instance_types_ondemand="n1-standard-1",
            instance_types_preemptibles=[
                "n1-standard-1",
                "n1-standard-2",
            ],
            integration_gke={
                "autoscaleCooldown": 300,
                "autoscaleDown": {
                    "evaluationPeriods": 300,
                },
                "autoscaleHeadroom": {
                    "cpuPerUnit": 1024,
                    "memoryPerUnit": 512,
                    "numOfUnits": 2,
                },
                "autoscaleIsAutoConfig": False,
                "autoscaleIsEnabled": True,
                "autoscaleLabels": [{
                    "key": "label_key",
                    "value": "label_value",
                }],
                "cluster_id": "example-cluster-id",
                "location": "us-central1-a",
            },
            max_size=5,
            min_size=1,
            node_image="COS",
            preemptible_percentage=100)
        ```
        ## Third-Party Integrations

        * `integration_gke` - (Required) Describes the GKE integration.
          
            * `location` - (Optional) The location of your GKE cluster.
            * `cluster_id` - (Optional) The GKE cluster ID you wish to import.
            * `autoscale_is_enabled` -  (Optional, Default: `false`) Specifies whether the auto scaling feature is enabled.
            * `autoscale_is_autoconfig` - (Optional, Default: `false`) Enabling the automatic auto-scaler functionality. For more information please see: .
            * `autoscale_cooldown` - (Optional, Default: `300`) The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start.
          
            * `autoscale_headroom` - (Optional) Headroom for the cluster.
                * `cpu_per_unit` - (Optional, Default: `0`) Cpu units for compute.
                * `memory_per_unit` - (Optional, Default: `0`) RAM units for compute.
                * `num_of_units` - (Optional, Default: `0`) Amount of units for compute.
          
            * `autoscale_down` - (Optional) Enabling scale down.
                * `evaluation_periods` - (Optional, Default: `5`) Amount of cooldown evaluation periods for scale down.
          
            * `autoscale_labels` - (Optional) Labels to assign to the resource.
                * `key` - (Optional) The label name.
                * `value` - (Optional) The label value.

        Usage:

        ```python
        import pulumi
        ```

        <a id="diff-suppressed-parameters"></a>
        ## Diff-suppressed Parameters

        The following parameters are created remotely and imported. The diffs have been suppressed in order to maintain plan legibility. You may update the values of these
        imported parameters by defining them in your template with your desired new value (including null values).

        * `backend_services`
            * `service_name`
            * `location_type`
            * `scheme`
            * `named_port`
                * `port_name`
                * `ports`
        * `labels`
            * `key`
            * `value`
        * `metadata`
            * `key`
            * `value`
        * `tags`
            * `key`
            * `value`
        * `service_account`
        * `ip_forwarding`
        * `fallback_to_od`
        * `subnets`
            * `region`
            * `subnet_name`

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The name of the GKE cluster you wish to import.
        :param pulumi.Input[str] cluster_zone_name: The zone where the cluster is hosted.
        :param pulumi.Input[str] node_image: The image that will be used for the node VMs. Possible values: COS, UBUNTU.

        The **backend_services** object supports the following:

          * `locationType` (`pulumi.Input[str]`)
          * `namedPorts` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `ports` (`pulumi.Input[list]`)

          * `scheme` (`pulumi.Input[str]`)
          * `serviceName` (`pulumi.Input[str]`)

        The **disks** object supports the following:

          * `autoDelete` (`pulumi.Input[bool]`)
          * `boot` (`pulumi.Input[bool]`)
          * `deviceName` (`pulumi.Input[str]`)
          * `initializeParams` (`pulumi.Input[list]`)
            * `diskSizeGb` (`pulumi.Input[str]`)
            * `diskType` (`pulumi.Input[str]`)
            * `source_image` (`pulumi.Input[str]`)

          * `interface` (`pulumi.Input[str]`)
          * `mode` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)

        The **gpu** object supports the following:

          * `count` (`pulumi.Input[float]`)
          * `type` (`pulumi.Input[str]`)

        The **instance_types_customs** object supports the following:

          * `memoryGib` (`pulumi.Input[float]`)
          * `vcpu` (`pulumi.Input[float]`)

        The **integration_docker_swarm** object supports the following:

          * `masterHost` (`pulumi.Input[str]`)
          * `masterPort` (`pulumi.Input[float]`)

        The **integration_gke** object supports the following:

          * `autoUpdate` (`pulumi.Input[bool]`)
          * `autoscaleCooldown` (`pulumi.Input[float]`)
          * `autoscaleDown` (`pulumi.Input[dict]`)
            * `evaluationPeriods` (`pulumi.Input[float]`)

          * `autoscaleHeadroom` (`pulumi.Input[dict]`)
            * `cpuPerUnit` (`pulumi.Input[float]`)
            * `memoryPerUnit` (`pulumi.Input[float]`)
            * `numOfUnits` (`pulumi.Input[float]`)

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`)
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`)
          * `autoscaleLabels` (`pulumi.Input[list]`)
            * `key` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `cluster_id` (`pulumi.Input[str]`) - The name of the GKE cluster you wish to import.
          * `location` (`pulumi.Input[str]`)

        The **labels** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)

        The **metadatas** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)

        The **network_interfaces** object supports the following:

          * `accessConfigs` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `type` (`pulumi.Input[str]`)

          * `aliasIpRanges` (`pulumi.Input[list]`)
            * `ipCidrRange` (`pulumi.Input[str]`)
            * `subnetworkRangeName` (`pulumi.Input[str]`)

          * `network` (`pulumi.Input[str]`)

        The **scaling_down_policies** object supports the following:

          * `actionType` (`pulumi.Input[str]`)
          * `adjustment` (`pulumi.Input[float]`)
          * `cooldown` (`pulumi.Input[float]`)
          * `dimensions` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `evaluationPeriods` (`pulumi.Input[float]`)
          * `metricName` (`pulumi.Input[str]`)
          * `namespace` (`pulumi.Input[str]`)
          * `operator` (`pulumi.Input[str]`)
          * `period` (`pulumi.Input[float]`)
          * `policyName` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `statistic` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `unit` (`pulumi.Input[str]`)

        The **scaling_up_policies** object supports the following:

          * `actionType` (`pulumi.Input[str]`)
          * `adjustment` (`pulumi.Input[float]`)
          * `cooldown` (`pulumi.Input[float]`)
          * `dimensions` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `evaluationPeriods` (`pulumi.Input[float]`)
          * `metricName` (`pulumi.Input[str]`)
          * `namespace` (`pulumi.Input[str]`)
          * `operator` (`pulumi.Input[str]`)
          * `period` (`pulumi.Input[float]`)
          * `policyName` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `statistic` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `unit` (`pulumi.Input[str]`)
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
            if cluster_id is not None:
                warnings.warn("Please define cluster_id under integration_gke", DeprecationWarning)
                pulumi.log.warn("cluster_id is deprecated: Please define cluster_id under integration_gke")
            __props__['cluster_id'] = cluster_id
            if cluster_zone_name is None:
                raise TypeError("Missing required property 'cluster_zone_name'")
            __props__['cluster_zone_name'] = cluster_zone_name
            if desired_capacity is None:
                raise TypeError("Missing required property 'desired_capacity'")
            __props__['desired_capacity'] = desired_capacity
            __props__['disks'] = disks
            __props__['draining_timeout'] = draining_timeout
            __props__['fallback_to_ondemand'] = fallback_to_ondemand
            __props__['gpu'] = gpu
            __props__['instance_types_customs'] = instance_types_customs
            __props__['instance_types_ondemand'] = instance_types_ondemand
            __props__['instance_types_preemptibles'] = instance_types_preemptibles
            __props__['integration_docker_swarm'] = integration_docker_swarm
            __props__['integration_gke'] = integration_gke
            __props__['ip_forwarding'] = ip_forwarding
            __props__['labels'] = labels
            __props__['max_size'] = max_size
            __props__['metadatas'] = metadatas
            __props__['min_size'] = min_size
            __props__['name'] = name
            __props__['network_interfaces'] = network_interfaces
            __props__['node_image'] = node_image
            __props__['ondemand_count'] = ondemand_count
            __props__['preemptible_percentage'] = preemptible_percentage
            __props__['scaling_down_policies'] = scaling_down_policies
            __props__['scaling_up_policies'] = scaling_up_policies
            __props__['service_account'] = service_account
            __props__['shutdown_script'] = shutdown_script
            __props__['startup_script'] = startup_script
            __props__['tags'] = tags
        super(Elastigroup, __self__).__init__(
            'spotinst:gke/elastigroup:Elastigroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, backend_services=None, cluster_id=None, cluster_zone_name=None, desired_capacity=None, disks=None, draining_timeout=None, fallback_to_ondemand=None, gpu=None, instance_types_customs=None, instance_types_ondemand=None, instance_types_preemptibles=None, integration_docker_swarm=None, integration_gke=None, ip_forwarding=None, labels=None, max_size=None, metadatas=None, min_size=None, name=None, network_interfaces=None, node_image=None, ondemand_count=None, preemptible_percentage=None, scaling_down_policies=None, scaling_up_policies=None, service_account=None, shutdown_script=None, startup_script=None, tags=None):
        """
        Get an existing Elastigroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The name of the GKE cluster you wish to import.
        :param pulumi.Input[str] cluster_zone_name: The zone where the cluster is hosted.
        :param pulumi.Input[str] node_image: The image that will be used for the node VMs. Possible values: COS, UBUNTU.

        The **backend_services** object supports the following:

          * `locationType` (`pulumi.Input[str]`)
          * `namedPorts` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `ports` (`pulumi.Input[list]`)

          * `scheme` (`pulumi.Input[str]`)
          * `serviceName` (`pulumi.Input[str]`)

        The **disks** object supports the following:

          * `autoDelete` (`pulumi.Input[bool]`)
          * `boot` (`pulumi.Input[bool]`)
          * `deviceName` (`pulumi.Input[str]`)
          * `initializeParams` (`pulumi.Input[list]`)
            * `diskSizeGb` (`pulumi.Input[str]`)
            * `diskType` (`pulumi.Input[str]`)
            * `source_image` (`pulumi.Input[str]`)

          * `interface` (`pulumi.Input[str]`)
          * `mode` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `type` (`pulumi.Input[str]`)

        The **gpu** object supports the following:

          * `count` (`pulumi.Input[float]`)
          * `type` (`pulumi.Input[str]`)

        The **instance_types_customs** object supports the following:

          * `memoryGib` (`pulumi.Input[float]`)
          * `vcpu` (`pulumi.Input[float]`)

        The **integration_docker_swarm** object supports the following:

          * `masterHost` (`pulumi.Input[str]`)
          * `masterPort` (`pulumi.Input[float]`)

        The **integration_gke** object supports the following:

          * `autoUpdate` (`pulumi.Input[bool]`)
          * `autoscaleCooldown` (`pulumi.Input[float]`)
          * `autoscaleDown` (`pulumi.Input[dict]`)
            * `evaluationPeriods` (`pulumi.Input[float]`)

          * `autoscaleHeadroom` (`pulumi.Input[dict]`)
            * `cpuPerUnit` (`pulumi.Input[float]`)
            * `memoryPerUnit` (`pulumi.Input[float]`)
            * `numOfUnits` (`pulumi.Input[float]`)

          * `autoscaleIsAutoConfig` (`pulumi.Input[bool]`)
          * `autoscaleIsEnabled` (`pulumi.Input[bool]`)
          * `autoscaleLabels` (`pulumi.Input[list]`)
            * `key` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `cluster_id` (`pulumi.Input[str]`) - The name of the GKE cluster you wish to import.
          * `location` (`pulumi.Input[str]`)

        The **labels** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)

        The **metadatas** object supports the following:

          * `key` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[str]`)

        The **network_interfaces** object supports the following:

          * `accessConfigs` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `type` (`pulumi.Input[str]`)

          * `aliasIpRanges` (`pulumi.Input[list]`)
            * `ipCidrRange` (`pulumi.Input[str]`)
            * `subnetworkRangeName` (`pulumi.Input[str]`)

          * `network` (`pulumi.Input[str]`)

        The **scaling_down_policies** object supports the following:

          * `actionType` (`pulumi.Input[str]`)
          * `adjustment` (`pulumi.Input[float]`)
          * `cooldown` (`pulumi.Input[float]`)
          * `dimensions` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `evaluationPeriods` (`pulumi.Input[float]`)
          * `metricName` (`pulumi.Input[str]`)
          * `namespace` (`pulumi.Input[str]`)
          * `operator` (`pulumi.Input[str]`)
          * `period` (`pulumi.Input[float]`)
          * `policyName` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `statistic` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `unit` (`pulumi.Input[str]`)

        The **scaling_up_policies** object supports the following:

          * `actionType` (`pulumi.Input[str]`)
          * `adjustment` (`pulumi.Input[float]`)
          * `cooldown` (`pulumi.Input[float]`)
          * `dimensions` (`pulumi.Input[list]`)
            * `name` (`pulumi.Input[str]`)
            * `value` (`pulumi.Input[str]`)

          * `evaluationPeriods` (`pulumi.Input[float]`)
          * `metricName` (`pulumi.Input[str]`)
          * `namespace` (`pulumi.Input[str]`)
          * `operator` (`pulumi.Input[str]`)
          * `period` (`pulumi.Input[float]`)
          * `policyName` (`pulumi.Input[str]`)
          * `source` (`pulumi.Input[str]`)
          * `statistic` (`pulumi.Input[str]`)
          * `threshold` (`pulumi.Input[float]`)
          * `unit` (`pulumi.Input[str]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["backend_services"] = backend_services
        __props__["cluster_id"] = cluster_id
        __props__["cluster_zone_name"] = cluster_zone_name
        __props__["desired_capacity"] = desired_capacity
        __props__["disks"] = disks
        __props__["draining_timeout"] = draining_timeout
        __props__["fallback_to_ondemand"] = fallback_to_ondemand
        __props__["gpu"] = gpu
        __props__["instance_types_customs"] = instance_types_customs
        __props__["instance_types_ondemand"] = instance_types_ondemand
        __props__["instance_types_preemptibles"] = instance_types_preemptibles
        __props__["integration_docker_swarm"] = integration_docker_swarm
        __props__["integration_gke"] = integration_gke
        __props__["ip_forwarding"] = ip_forwarding
        __props__["labels"] = labels
        __props__["max_size"] = max_size
        __props__["metadatas"] = metadatas
        __props__["min_size"] = min_size
        __props__["name"] = name
        __props__["network_interfaces"] = network_interfaces
        __props__["node_image"] = node_image
        __props__["ondemand_count"] = ondemand_count
        __props__["preemptible_percentage"] = preemptible_percentage
        __props__["scaling_down_policies"] = scaling_down_policies
        __props__["scaling_up_policies"] = scaling_up_policies
        __props__["service_account"] = service_account
        __props__["shutdown_script"] = shutdown_script
        __props__["startup_script"] = startup_script
        __props__["tags"] = tags
        return Elastigroup(resource_name, opts=opts, __props__=__props__)

    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
