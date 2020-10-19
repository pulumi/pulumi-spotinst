# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Elastigroup']


class Elastigroup(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_data: Optional[pulumi.Input[str]] = None,
                 desired_capacity: Optional[pulumi.Input[int]] = None,
                 health_check: Optional[pulumi.Input[pulumi.InputType['ElastigroupHealthCheckArgs']]] = None,
                 images: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupImageArgs']]]]] = None,
                 integration_kubernetes: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationKubernetesArgs']]] = None,
                 integration_multai_runtime: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationMultaiRuntimeArgs']]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLoadBalancerArgs']]]]] = None,
                 login: Optional[pulumi.Input[pulumi.InputType['ElastigroupLoginArgs']]] = None,
                 low_priority_sizes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupManagedServiceIdentityArgs']]]]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network: Optional[pulumi.Input[pulumi.InputType['ElastigroupNetworkArgs']]] = None,
                 od_sizes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 product: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 scaling_down_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingDownPolicyArgs']]]]] = None,
                 scaling_up_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingUpPolicyArgs']]]]] = None,
                 scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScheduledTaskArgs']]]]] = None,
                 shutdown_script: Optional[pulumi.Input[str]] = None,
                 strategy: Optional[pulumi.Input[pulumi.InputType['ElastigroupStrategyArgs']]] = None,
                 update_policy: Optional[pulumi.Input[pulumi.InputType['ElastigroupUpdatePolicyArgs']]] = None,
                 user_data: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Spotinst elastigroup Azure resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        test_azure_group = spotinst.azure.Elastigroup("testAzureGroup",
            desired_capacity=1,
            health_check=spotinst.azure.ElastigroupHealthCheckArgs(
                auto_healing=True,
                grace_period=120,
                health_check_type="INSTANCE_STATE",
            ),
            images=[spotinst.azure.ElastigroupImageArgs(
                marketplaces=[spotinst.azure.ElastigroupImageMarketplaceArgs(
                    offer="UbuntuServer",
                    publisher="Canonical",
                    sku="16.04-LTS",
                )],
            )],
            load_balancers=[spotinst.azure.ElastigroupLoadBalancerArgs(
                auto_weight=True,
                balancer_id="lb-1ee2e3q",
                target_set_id="ts-3eq",
                type="MULTAI_TARGET_SET",
            )],
            login=spotinst.azure.ElastigroupLoginArgs(
                ssh_public_key="33a2s1f3g5a1df5g1ad3f2g1adfg56dfg==",
                user_name="admin",
            ),
            low_priority_sizes=[
                "standard_a1_v1",
                "standard_a1_v2",
            ],
            managed_service_identities=[spotinst.azure.ElastigroupManagedServiceIdentityArgs(
                name="example-identity",
                resource_group_name="spotinst-azure",
            )],
            max_size=1,
            min_size=0,
            network=spotinst.azure.ElastigroupNetworkArgs(
                assign_public_ip=True,
                resource_group_name="subnetResourceGroup",
                subnet_name="my-subnet-name",
                virtual_network_name="vname",
            ),
            od_sizes=[
                "standard_a1_v1",
                "standard_a1_v2",
            ],
            product="Linux",
            region="eastus",
            resource_group_name="spotinst-azure",
            scaling_down_policies=[spotinst.azure.ElastigroupScalingDownPolicyArgs(
                action_type="adjustment",
                adjustment="MIN(5,10)",
                cooldown=60,
                dimensions=[spotinst.azure.ElastigroupScalingDownPolicyDimensionArgs(
                    name="name-1",
                    value="value-1",
                )],
                evaluation_periods=10,
                metric_name="CPUUtilization",
                namespace="Microsoft.Compute",
                operator="gt",
                period=60,
                policy_name="policy-name",
                statistic="average",
                threshold=10,
                unit="percent",
            )],
            scaling_up_policies=[spotinst.azure.ElastigroupScalingUpPolicyArgs(
                action_type="setMinTarget",
                cooldown=60,
                dimensions=[
                    spotinst.azure.ElastigroupScalingUpPolicyDimensionArgs(
                        name="resourceName",
                        value="resource-name",
                    ),
                    spotinst.azure.ElastigroupScalingUpPolicyDimensionArgs(
                        name="resourceGroupName",
                        value="resource-group-name",
                    ),
                ],
                evaluation_periods=10,
                metric_name="CPUUtilization",
                min_target_capacity="1",
                namespace="Microsoft.Compute",
                operator="gt",
                period=60,
                policy_name="policy-name",
                statistic="average",
                threshold=10,
                unit="percent",
            )],
            scheduled_tasks=[spotinst.azure.ElastigroupScheduledTaskArgs(
                adjustment="2",
                adjustment_percentage="50",
                batch_size_percentage="33",
                cron_expression="* * * * *",
                grace_period=300,
                is_enabled=True,
                scale_max_capacity="8",
                scale_min_capacity="5",
                scale_target_capacity="6",
                task_type="scale",
            )],
            shutdown_script="",
            strategy=spotinst.azure.ElastigroupStrategyArgs(
                draining_timeout=300,
                od_count=1,
            ),
            user_data="")
        ```
        ## Load Balancers

        * `load_balancers` - (Required) Describes a set of one or more classic load balancer target groups and/or Multai load balancer target sets.
        * `type` - (Required) The resource type. Valid values: CLASSIC, TARGET_GROUP, MULTAI_TARGET_SET.
        * `balancer_id` - (Required) The balancer ID.
        * `target_set_id` - (Required) The scale set ID associated with the load balancer.
        * `auto_weight` - (Optional, Default: `false`)

        ```python
        import pulumi
        ```

        <a id="image"></a>
        ## Image

        * `image` - (Required) Image of a VM. An image is a template for creating new VMs. Choose from Azure image catalogue (marketplace) or use a custom image.
        * `publisher` - (Optional) Image publisher. Required if resource_group_name is not specified.
        * `offer` - (Optional) Name of the image to use. Required if publisher is specified.
        * `sku` - (Optional) Image's Stock Keeping Unit, which is the specific version of the image. Required if publisher is specified.
        * `resource_group_name` - (Optional) Name of Resource Group for custom image. Required if publisher not specified.
        * `image_name` - (Optional) Name of the custom image. Required if resource_group_name is specified.

        ```python
        import pulumi
        ```

        <a id="health-check"></a>
        ## Health Check

        * `health_check` - (Optional) Describes the health check configuration.
        * `health_check_type` - (Optional) Health check used to validate VM health. Valid values: “INSTANCE_STATE”.
        * `grace_period` - (Optional) Period of time (seconds) to wait for VM to reach healthiness before monitoring for unhealthiness.
        * `auto_healing` - (Optional) Enable auto-healing of unhealthy VMs.

        ```python
        import pulumi
        ```

        <a id="network"></a>
        ## Network

        * `network` - (Required) Defines the Virtual Network and Subnet for your Elastigroup.
        * `virtual_network_name` - (Required) Name of Vnet.
        * `subnet_name` - (Required) ID of subnet.
        * `resource_group_name` - (Required) Vnet Resource Group Name.
        * `assign_public_up` - (Optional, Default: `false`) Assign a public IP to each VM in the Elastigroup.
        * `additional_ip_configs` - (Optional) Array of additional IP configuration objects.
        * `name` - (Required) The IP configuration name.
        * `private_ip_version` - (Optional) Available from Azure Api-Version 2017-03-30 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Valid values: `IPv4`, `IPv6`.

        ```python
        import pulumi
        ```

        <a id="login"></a>
        ## Login

        ```python
        import pulumi
        ```

        <a id="login"></a>
        ## Login

        * `login` - (Required) Describes the login configuration.
        * `user_name` - (Required) Set admin access for accessing your VMs.
        * `ssh_public_key` - (Optional) SSH for admin access to Linux VMs. Required for Linux product types.
        * `password` - (Optional) Password for admin access to Windows VMs. Required for Windows product types.

        ```python
        import pulumi
        ```

        <a id="scaling-policy"></a>
        ## Scheduling

        * `scheduled_task` - (Optional) Describes the configuration of one or more scheduled tasks.
        * `is_enabled` - (Optional, Default: `true`) Describes whether the task is enabled. When true the task should run when false it should not run.
        * `cron_expression` - (Required) A valid cron expression (`* * * * *`). The cron is running in UTC time zone and is in Unix cron format Cron Expression Validator Script.
        * `task_type` - (Required) The task type to run. Valid Values: `backup_ami`, `scale`, `scaleUp`, `roll`, `statefulUpdateCapacity`, `statefulRecycle`.
        * `scale_min_capacity` - (Optional) The min capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        * `scale_max_capacity` - (Optional) The max capacity of the group. Required when ‘task_type' is ‘scale'.
        * `scale_target_capacity` - (Optional) The target capacity of the group. Should be used when choosing ‘task_type' of ‘scale'.
        * `adjustment` - (Optional) The number of instances to add/remove to/from the target capacity when scale is needed.
        * `adjustment_percentage` - (Optional) The percent of instances to add/remove to/from the target capacity when scale is needed.
        * `batch_size_percentage` - (Optional) The percentage size of each batch in the scheduled deployment roll. Required when the 'task_type' is 'roll'.
        * `grace_period` - (Optional) The time to allow instances to become healthy.

        ```python
        import pulumi
        ```

        <a id="update-policy"></a>
        ## Update Policy

        * `update_policy` - (Optional)
          
            * `should_roll` - (Required) Sets the enablement of the roll option.
            * `roll_config` - (Required) While used, you can control whether the group should perform a deployment after an update to the configuration.
                * `batch_size_percentage` - (Required) Sets the percentage of the instances to deploy in each batch.
                * `health_check_type` - (Optional) Sets the health check type to use. Valid values: `"INSTANCE_STATE"`, `"NONE"`.
                * `grace_period` - (Optional) Sets the grace period for new instances to become healthy.

        ```python
        import pulumi
        ```

        <a id="third-party-integrations"></a>
        ## Third-Party Integrations

        * `integration_kubernetes` - (Optional) Describes the [Kubernetes](https://kubernetes.io/) integration.
            * `cluster_identifier` - (Required) The cluster ID.

        Usage:

        ```python
        import pulumi
        ```

        * `integration_multai_runtime` - (Optional) Describes the [Multai Runtime](https://spotinst.com/) integration.
            * `deployment_id` - (Optional) The deployment id you want to get

        Usage:

        ```python
        import pulumi
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] low_priority_sizes: Available Low-Priority sizes.
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The name of the managed identity.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] od_sizes: Available On-Demand sizes
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux"`, `"Windows"`.
        :param pulumi.Input[str] region: The region your Azure group will be created in.
        :param pulumi.Input[str] resource_group_name: The Resource Group that the user-assigned managed identity resides in.
        :param pulumi.Input[str] shutdown_script: Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        :param pulumi.Input[pulumi.InputType['ElastigroupStrategyArgs']] strategy: Describes the deployment strategy.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
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

            __props__['custom_data'] = custom_data
            __props__['desired_capacity'] = desired_capacity
            __props__['health_check'] = health_check
            __props__['images'] = images
            __props__['integration_kubernetes'] = integration_kubernetes
            __props__['integration_multai_runtime'] = integration_multai_runtime
            __props__['load_balancers'] = load_balancers
            __props__['login'] = login
            if low_priority_sizes is None:
                raise TypeError("Missing required property 'low_priority_sizes'")
            __props__['low_priority_sizes'] = low_priority_sizes
            __props__['managed_service_identities'] = managed_service_identities
            __props__['max_size'] = max_size
            __props__['min_size'] = min_size
            __props__['name'] = name
            if network is None:
                raise TypeError("Missing required property 'network'")
            __props__['network'] = network
            if od_sizes is None:
                raise TypeError("Missing required property 'od_sizes'")
            __props__['od_sizes'] = od_sizes
            if product is None:
                raise TypeError("Missing required property 'product'")
            __props__['product'] = product
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            if resource_group_name is None:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__['resource_group_name'] = resource_group_name
            __props__['scaling_down_policies'] = scaling_down_policies
            __props__['scaling_up_policies'] = scaling_up_policies
            __props__['scheduled_tasks'] = scheduled_tasks
            __props__['shutdown_script'] = shutdown_script
            if strategy is None:
                raise TypeError("Missing required property 'strategy'")
            __props__['strategy'] = strategy
            __props__['update_policy'] = update_policy
            __props__['user_data'] = user_data
        super(Elastigroup, __self__).__init__(
            'spotinst:azure/elastigroup:Elastigroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_data: Optional[pulumi.Input[str]] = None,
            desired_capacity: Optional[pulumi.Input[int]] = None,
            health_check: Optional[pulumi.Input[pulumi.InputType['ElastigroupHealthCheckArgs']]] = None,
            images: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupImageArgs']]]]] = None,
            integration_kubernetes: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationKubernetesArgs']]] = None,
            integration_multai_runtime: Optional[pulumi.Input[pulumi.InputType['ElastigroupIntegrationMultaiRuntimeArgs']]] = None,
            load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupLoadBalancerArgs']]]]] = None,
            login: Optional[pulumi.Input[pulumi.InputType['ElastigroupLoginArgs']]] = None,
            low_priority_sizes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            managed_service_identities: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupManagedServiceIdentityArgs']]]]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network: Optional[pulumi.Input[pulumi.InputType['ElastigroupNetworkArgs']]] = None,
            od_sizes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            product: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            scaling_down_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingDownPolicyArgs']]]]] = None,
            scaling_up_policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScalingUpPolicyArgs']]]]] = None,
            scheduled_tasks: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ElastigroupScheduledTaskArgs']]]]] = None,
            shutdown_script: Optional[pulumi.Input[str]] = None,
            strategy: Optional[pulumi.Input[pulumi.InputType['ElastigroupStrategyArgs']]] = None,
            update_policy: Optional[pulumi.Input[pulumi.InputType['ElastigroupUpdatePolicyArgs']]] = None,
            user_data: Optional[pulumi.Input[str]] = None) -> 'Elastigroup':
        """
        Get an existing Elastigroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] desired_capacity: The desired number of instances the group should have at any time.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] low_priority_sizes: Available Low-Priority sizes.
        :param pulumi.Input[int] max_size: The maximum number of instances the group should have at any time.
        :param pulumi.Input[int] min_size: The minimum number of instances the group should have at any time.
        :param pulumi.Input[str] name: The name of the managed identity.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] od_sizes: Available On-Demand sizes
        :param pulumi.Input[str] product: Operation system type. Valid values: `"Linux"`, `"Windows"`.
        :param pulumi.Input[str] region: The region your Azure group will be created in.
        :param pulumi.Input[str] resource_group_name: The Resource Group that the user-assigned managed identity resides in.
        :param pulumi.Input[str] shutdown_script: Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        :param pulumi.Input[pulumi.InputType['ElastigroupStrategyArgs']] strategy: Describes the deployment strategy.
        :param pulumi.Input[str] user_data: Base64-encoded MIME user data to make available to the instances.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["custom_data"] = custom_data
        __props__["desired_capacity"] = desired_capacity
        __props__["health_check"] = health_check
        __props__["images"] = images
        __props__["integration_kubernetes"] = integration_kubernetes
        __props__["integration_multai_runtime"] = integration_multai_runtime
        __props__["load_balancers"] = load_balancers
        __props__["login"] = login
        __props__["low_priority_sizes"] = low_priority_sizes
        __props__["managed_service_identities"] = managed_service_identities
        __props__["max_size"] = max_size
        __props__["min_size"] = min_size
        __props__["name"] = name
        __props__["network"] = network
        __props__["od_sizes"] = od_sizes
        __props__["product"] = product
        __props__["region"] = region
        __props__["resource_group_name"] = resource_group_name
        __props__["scaling_down_policies"] = scaling_down_policies
        __props__["scaling_up_policies"] = scaling_up_policies
        __props__["scheduled_tasks"] = scheduled_tasks
        __props__["shutdown_script"] = shutdown_script
        __props__["strategy"] = strategy
        __props__["update_policy"] = update_policy
        __props__["user_data"] = user_data
        return Elastigroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customData")
    def custom_data(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "custom_data")

    @property
    @pulumi.getter(name="desiredCapacity")
    def desired_capacity(self) -> pulumi.Output[Optional[int]]:
        """
        The desired number of instances the group should have at any time.
        """
        return pulumi.get(self, "desired_capacity")

    @property
    @pulumi.getter(name="healthCheck")
    def health_check(self) -> pulumi.Output[Optional['outputs.ElastigroupHealthCheck']]:
        return pulumi.get(self, "health_check")

    @property
    @pulumi.getter
    def images(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupImage']]]:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter(name="integrationKubernetes")
    def integration_kubernetes(self) -> pulumi.Output[Optional['outputs.ElastigroupIntegrationKubernetes']]:
        return pulumi.get(self, "integration_kubernetes")

    @property
    @pulumi.getter(name="integrationMultaiRuntime")
    def integration_multai_runtime(self) -> pulumi.Output[Optional['outputs.ElastigroupIntegrationMultaiRuntime']]:
        return pulumi.get(self, "integration_multai_runtime")

    @property
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupLoadBalancer']]]:
        return pulumi.get(self, "load_balancers")

    @property
    @pulumi.getter
    def login(self) -> pulumi.Output[Optional['outputs.ElastigroupLogin']]:
        return pulumi.get(self, "login")

    @property
    @pulumi.getter(name="lowPrioritySizes")
    def low_priority_sizes(self) -> pulumi.Output[Sequence[str]]:
        """
        Available Low-Priority sizes.
        """
        return pulumi.get(self, "low_priority_sizes")

    @property
    @pulumi.getter(name="managedServiceIdentities")
    def managed_service_identities(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupManagedServiceIdentity']]]:
        return pulumi.get(self, "managed_service_identities")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[int]:
        """
        The maximum number of instances the group should have at any time.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[int]:
        """
        The minimum number of instances the group should have at any time.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the managed identity.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def network(self) -> pulumi.Output['outputs.ElastigroupNetwork']:
        return pulumi.get(self, "network")

    @property
    @pulumi.getter(name="odSizes")
    def od_sizes(self) -> pulumi.Output[Sequence[str]]:
        """
        Available On-Demand sizes
        """
        return pulumi.get(self, "od_sizes")

    @property
    @pulumi.getter
    def product(self) -> pulumi.Output[str]:
        """
        Operation system type. Valid values: `"Linux"`, `"Windows"`.
        """
        return pulumi.get(self, "product")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region your Azure group will be created in.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        The Resource Group that the user-assigned managed identity resides in.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter(name="scalingDownPolicies")
    def scaling_down_policies(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScalingDownPolicy']]]:
        return pulumi.get(self, "scaling_down_policies")

    @property
    @pulumi.getter(name="scalingUpPolicies")
    def scaling_up_policies(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScalingUpPolicy']]]:
        return pulumi.get(self, "scaling_up_policies")

    @property
    @pulumi.getter(name="scheduledTasks")
    def scheduled_tasks(self) -> pulumi.Output[Optional[Sequence['outputs.ElastigroupScheduledTask']]]:
        return pulumi.get(self, "scheduled_tasks")

    @property
    @pulumi.getter(name="shutdownScript")
    def shutdown_script(self) -> pulumi.Output[Optional[str]]:
        """
        Shutdown script for the group. Value should be passed as a string encoded at Base64 only.
        """
        return pulumi.get(self, "shutdown_script")

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Output['outputs.ElastigroupStrategy']:
        """
        Describes the deployment strategy.
        """
        return pulumi.get(self, "strategy")

    @property
    @pulumi.getter(name="updatePolicy")
    def update_policy(self) -> pulumi.Output[Optional['outputs.ElastigroupUpdatePolicy']]:
        return pulumi.get(self, "update_policy")

    @property
    @pulumi.getter(name="userData")
    def user_data(self) -> pulumi.Output[Optional[str]]:
        """
        Base64-encoded MIME user data to make available to the instances.
        """
        return pulumi.get(self, "user_data")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

