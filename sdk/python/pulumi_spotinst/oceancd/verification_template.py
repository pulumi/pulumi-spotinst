# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['VerificationTemplateArgs', 'VerificationTemplate']

@pulumi.input_type
class VerificationTemplateArgs:
    def __init__(__self__, *,
                 args: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]] = None,
                 metrics: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a VerificationTemplate resource.
        :param pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]] args: List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        :param pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]] metrics: List of verification metrics.
        :param pulumi.Input[builtins.str] name: Identifier name for Ocean CD Verification Template. Must be unique.
        """
        if args is not None:
            pulumi.set(__self__, "args", args)
        if metrics is not None:
            pulumi.set(__self__, "metrics", metrics)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def args(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]]:
        """
        List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        """
        return pulumi.get(self, "args")

    @args.setter
    def args(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]]):
        pulumi.set(self, "args", value)

    @property
    @pulumi.getter
    def metrics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]]:
        """
        List of verification metrics.
        """
        return pulumi.get(self, "metrics")

    @metrics.setter
    def metrics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]]):
        pulumi.set(self, "metrics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier name for Ocean CD Verification Template. Must be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VerificationTemplateState:
    def __init__(__self__, *,
                 args: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]] = None,
                 metrics: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering VerificationTemplate resources.
        :param pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]] args: List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        :param pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]] metrics: List of verification metrics.
        :param pulumi.Input[builtins.str] name: Identifier name for Ocean CD Verification Template. Must be unique.
        """
        if args is not None:
            pulumi.set(__self__, "args", args)
        if metrics is not None:
            pulumi.set(__self__, "metrics", metrics)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def args(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]]:
        """
        List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        """
        return pulumi.get(self, "args")

    @args.setter
    def args(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateArgArgs']]]]):
        pulumi.set(self, "args", value)

    @property
    @pulumi.getter
    def metrics(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]]:
        """
        List of verification metrics.
        """
        return pulumi.get(self, "metrics")

    @metrics.setter
    def metrics(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VerificationTemplateMetricArgs']]]]):
        pulumi.set(self, "metrics", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Identifier name for Ocean CD Verification Template. Must be unique.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


class VerificationTemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 args: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateArgArgs', 'VerificationTemplateArgArgsDict']]]]] = None,
                 metrics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateMetricArgs', 'VerificationTemplateMetricArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Manages a Spotinst OceanCD Verfification Template resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        test = spotinst.oceancd.VerificationTemplate("test",
            name="test-verification-template-tes",
            args=[{
                "arg_name": "test-arg",
                "value": "test",
                "value_from": {
                    "secret_key_ref": {
                        "name": "test_key",
                        "key": "key-value-test",
                    },
                },
            }],
            metrics=[{
                "metrics_name": "test-metrics-names",
                "dry_run": False,
                "interval": "10m",
                "initial_delay": "1m",
                "count": 10,
                "success_condition": "result[0] <= 0.95",
                "failure_condition": "result[0] >= 0.95",
                "failure_limit": 2,
                "consecutive_error_limit": 1,
                "providers": [{
                    "prometheus": {
                        "prometheus_query": "http_requests_new",
                    },
                    "datadog": {
                        "duration": "1m",
                        "datadog_query": "avg:kubernetes.cpu.user.total",
                    },
                    "new_relic": {
                        "profile": "test",
                        "new_relic_query": "FROM Metric SELECT count",
                    },
                    "cloud_watch": {
                        "duration": "5m",
                        "metric_data_queries": [{
                            "id": "utilization",
                            "metric_stat": {
                                "metric": {
                                    "metric_name": "Test",
                                    "namespace": "AWS/EC2",
                                    "dimensions": [{
                                        "dimension_name": "instandId",
                                        "dimension_value": "i-123044",
                                    }],
                                },
                                "metric_period": 400,
                                "stat": "average",
                                "unit": "None",
                            },
                            "expression": "SELECT AVG(CPUUtilization) FROM SCHEMA",
                            "label": "TestLabel",
                            "return_data": False,
                            "period": 300,
                        }],
                    },
                    "web": {
                        "method": "GET",
                        "url": "https://oceancd.com/api/v1/metrics?clusterId= args.clusterId",
                        "web_headers": [{
                            "web_header_key": "Autorization",
                            "web_header_value": "Bearer=args.token",
                        }],
                        "body": "{\\"key\\": \\"test\\"}",
                        "timeout_seconds": 20,
                        "json_path": "$.data",
                        "insecure": False,
                    },
                    "job": {
                        "specs": [{
                            "backoff_limit": 1,
                            "job_templates": [{
                                "template_specs": [{
                                    "containers": [{
                                        "container_name": "hello",
                                        "commands": [
                                            "sh",
                                            "-c",
                                        ],
                                        "image": "nginx.2.1",
                                    }],
                                    "restart_policy": "never",
                                }],
                            }],
                        }],
                    },
                    "jenkins": {
                        "pipeline_name": "testPipelineName",
                        "tls_verification": True,
                        "timeout": "2m",
                        "jenkins_interval": "5s",
                        "jenkins_parameters": {
                            "parameter_key": "app",
                            "parameter_value": "my-app",
                        },
                    },
                }],
                "baseline": {
                    "baseline_providers": [{
                        "prometheus": {
                            "prometheus_query": "http_requests_total.status!",
                        },
                        "datadog": {
                            "duration": "2m",
                            "datadog_query": "avg:kubernetes.cpu.user",
                        },
                        "new_relic": {
                            "profile": "test",
                            "new_relic_query": "FROM Metric SELECT count*",
                        },
                    }],
                    "min_range": 40,
                    "max_range": 50,
                    "threshold": "range",
                },
            }])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateArgArgs', 'VerificationTemplateArgArgsDict']]]] args: List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateMetricArgs', 'VerificationTemplateMetricArgsDict']]]] metrics: List of verification metrics.
        :param pulumi.Input[builtins.str] name: Identifier name for Ocean CD Verification Template. Must be unique.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[VerificationTemplateArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Spotinst OceanCD Verfification Template resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_spotinst as spotinst

        test = spotinst.oceancd.VerificationTemplate("test",
            name="test-verification-template-tes",
            args=[{
                "arg_name": "test-arg",
                "value": "test",
                "value_from": {
                    "secret_key_ref": {
                        "name": "test_key",
                        "key": "key-value-test",
                    },
                },
            }],
            metrics=[{
                "metrics_name": "test-metrics-names",
                "dry_run": False,
                "interval": "10m",
                "initial_delay": "1m",
                "count": 10,
                "success_condition": "result[0] <= 0.95",
                "failure_condition": "result[0] >= 0.95",
                "failure_limit": 2,
                "consecutive_error_limit": 1,
                "providers": [{
                    "prometheus": {
                        "prometheus_query": "http_requests_new",
                    },
                    "datadog": {
                        "duration": "1m",
                        "datadog_query": "avg:kubernetes.cpu.user.total",
                    },
                    "new_relic": {
                        "profile": "test",
                        "new_relic_query": "FROM Metric SELECT count",
                    },
                    "cloud_watch": {
                        "duration": "5m",
                        "metric_data_queries": [{
                            "id": "utilization",
                            "metric_stat": {
                                "metric": {
                                    "metric_name": "Test",
                                    "namespace": "AWS/EC2",
                                    "dimensions": [{
                                        "dimension_name": "instandId",
                                        "dimension_value": "i-123044",
                                    }],
                                },
                                "metric_period": 400,
                                "stat": "average",
                                "unit": "None",
                            },
                            "expression": "SELECT AVG(CPUUtilization) FROM SCHEMA",
                            "label": "TestLabel",
                            "return_data": False,
                            "period": 300,
                        }],
                    },
                    "web": {
                        "method": "GET",
                        "url": "https://oceancd.com/api/v1/metrics?clusterId= args.clusterId",
                        "web_headers": [{
                            "web_header_key": "Autorization",
                            "web_header_value": "Bearer=args.token",
                        }],
                        "body": "{\\"key\\": \\"test\\"}",
                        "timeout_seconds": 20,
                        "json_path": "$.data",
                        "insecure": False,
                    },
                    "job": {
                        "specs": [{
                            "backoff_limit": 1,
                            "job_templates": [{
                                "template_specs": [{
                                    "containers": [{
                                        "container_name": "hello",
                                        "commands": [
                                            "sh",
                                            "-c",
                                        ],
                                        "image": "nginx.2.1",
                                    }],
                                    "restart_policy": "never",
                                }],
                            }],
                        }],
                    },
                    "jenkins": {
                        "pipeline_name": "testPipelineName",
                        "tls_verification": True,
                        "timeout": "2m",
                        "jenkins_interval": "5s",
                        "jenkins_parameters": {
                            "parameter_key": "app",
                            "parameter_value": "my-app",
                        },
                    },
                }],
                "baseline": {
                    "baseline_providers": [{
                        "prometheus": {
                            "prometheus_query": "http_requests_total.status!",
                        },
                        "datadog": {
                            "duration": "2m",
                            "datadog_query": "avg:kubernetes.cpu.user",
                        },
                        "new_relic": {
                            "profile": "test",
                            "new_relic_query": "FROM Metric SELECT count*",
                        },
                    }],
                    "min_range": 40,
                    "max_range": 50,
                    "threshold": "range",
                },
            }])
        ```

        :param str resource_name: The name of the resource.
        :param VerificationTemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VerificationTemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 args: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateArgArgs', 'VerificationTemplateArgArgsDict']]]]] = None,
                 metrics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateMetricArgs', 'VerificationTemplateMetricArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VerificationTemplateArgs.__new__(VerificationTemplateArgs)

            __props__.__dict__["args"] = args
            __props__.__dict__["metrics"] = metrics
            __props__.__dict__["name"] = name
        super(VerificationTemplate, __self__).__init__(
            'spotinst:oceancd/verificationTemplate:VerificationTemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            args: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateArgArgs', 'VerificationTemplateArgArgsDict']]]]] = None,
            metrics: Optional[pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateMetricArgs', 'VerificationTemplateMetricArgsDict']]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None) -> 'VerificationTemplate':
        """
        Get an existing VerificationTemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateArgArgs', 'VerificationTemplateArgArgsDict']]]] args: List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        :param pulumi.Input[Sequence[pulumi.Input[Union['VerificationTemplateMetricArgs', 'VerificationTemplateMetricArgsDict']]]] metrics: List of verification metrics.
        :param pulumi.Input[builtins.str] name: Identifier name for Ocean CD Verification Template. Must be unique.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VerificationTemplateState.__new__(_VerificationTemplateState)

        __props__.__dict__["args"] = args
        __props__.__dict__["metrics"] = metrics
        __props__.__dict__["name"] = name
        return VerificationTemplate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def args(self) -> pulumi.Output[Optional[Sequence['outputs.VerificationTemplateArg']]]:
        """
        List of verification arguments. You may specify either `value` OR `valueFrom` but not both.In case `args`:`value` is already defined in the RolloutSpec entity, there is no need to also specify it in the VerificationTemplate entity.
        """
        return pulumi.get(self, "args")

    @property
    @pulumi.getter
    def metrics(self) -> pulumi.Output[Optional[Sequence['outputs.VerificationTemplateMetric']]]:
        """
        List of verification metrics.
        """
        return pulumi.get(self, "metrics")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Identifier name for Ocean CD Verification Template. Must be unique.
        """
        return pulumi.get(self, "name")

