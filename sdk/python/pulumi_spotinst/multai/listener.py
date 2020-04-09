# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Listener(pulumi.CustomResource):
    balancer_id: pulumi.Output[str]
    """
    The ID of the balancer.
    """
    port: pulumi.Output[float]
    """
    The port on which the load balancer is listening.
    """
    protocol: pulumi.Output[str]
    """
    The protocol to allow connections to the load balancer.
    """
    tags: pulumi.Output[list]
    """
    A list of key:value paired tags.

      * `key` (`str`) - The tag's key.
      * `value` (`str`) - The tag's value.
    """
    tls_config: pulumi.Output[dict]
    """
    Describes the TLSConfig configuration.

      * `certificateIds` (`list`) - Contains one or more certificate chains to present to the other side of the connection.
      * `cipherSuites` (`list`) - List of supported cipher suites. If cipherSuites is nil, TLS uses a list of suites supported by the implementation.
      * `maxVersion` (`str`) - MaxVersion contains the maximum SSL/TLS version that is acceptable.
      * `minVersion` (`str`) - MinVersion contains the minimum SSL/TLS version that is acceptable (1.0 is the minimum).
      * `preferServerCipherSuites` (`bool`) - Controls whether the server selects the client’s most preferred ciphersuite, or the server’s most preferred ciphersuite.
      * `sessionTicketsDisabled` (`bool`) - May be set to true to disable session ticket (resumption) support.
    """
    def __init__(__self__, resource_name, opts=None, balancer_id=None, port=None, protocol=None, tags=None, tls_config=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Spotinst Multai Listener.



        > This content is derived from https://github.com/terraform-providers/terraform-provider-spotinst/blob/master/website/docs/r/multai_listener.html.markdown.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] balancer_id: The ID of the balancer.
        :param pulumi.Input[float] port: The port on which the load balancer is listening.
        :param pulumi.Input[str] protocol: The protocol to allow connections to the load balancer.
        :param pulumi.Input[list] tags: A list of key:value paired tags.
        :param pulumi.Input[dict] tls_config: Describes the TLSConfig configuration.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag's key.
          * `value` (`pulumi.Input[str]`) - The tag's value.

        The **tls_config** object supports the following:

          * `certificateIds` (`pulumi.Input[list]`) - Contains one or more certificate chains to present to the other side of the connection.
          * `cipherSuites` (`pulumi.Input[list]`) - List of supported cipher suites. If cipherSuites is nil, TLS uses a list of suites supported by the implementation.
          * `maxVersion` (`pulumi.Input[str]`) - MaxVersion contains the maximum SSL/TLS version that is acceptable.
          * `minVersion` (`pulumi.Input[str]`) - MinVersion contains the minimum SSL/TLS version that is acceptable (1.0 is the minimum).
          * `preferServerCipherSuites` (`pulumi.Input[bool]`) - Controls whether the server selects the client’s most preferred ciphersuite, or the server’s most preferred ciphersuite.
          * `sessionTicketsDisabled` (`pulumi.Input[bool]`) - May be set to true to disable session ticket (resumption) support.
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

            if balancer_id is None:
                raise TypeError("Missing required property 'balancer_id'")
            __props__['balancer_id'] = balancer_id
            if port is None:
                raise TypeError("Missing required property 'port'")
            __props__['port'] = port
            if protocol is None:
                raise TypeError("Missing required property 'protocol'")
            __props__['protocol'] = protocol
            __props__['tags'] = tags
            __props__['tls_config'] = tls_config
        super(Listener, __self__).__init__(
            'spotinst:multai/listener:Listener',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, balancer_id=None, port=None, protocol=None, tags=None, tls_config=None):
        """
        Get an existing Listener resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] balancer_id: The ID of the balancer.
        :param pulumi.Input[float] port: The port on which the load balancer is listening.
        :param pulumi.Input[str] protocol: The protocol to allow connections to the load balancer.
        :param pulumi.Input[list] tags: A list of key:value paired tags.
        :param pulumi.Input[dict] tls_config: Describes the TLSConfig configuration.

        The **tags** object supports the following:

          * `key` (`pulumi.Input[str]`) - The tag's key.
          * `value` (`pulumi.Input[str]`) - The tag's value.

        The **tls_config** object supports the following:

          * `certificateIds` (`pulumi.Input[list]`) - Contains one or more certificate chains to present to the other side of the connection.
          * `cipherSuites` (`pulumi.Input[list]`) - List of supported cipher suites. If cipherSuites is nil, TLS uses a list of suites supported by the implementation.
          * `maxVersion` (`pulumi.Input[str]`) - MaxVersion contains the maximum SSL/TLS version that is acceptable.
          * `minVersion` (`pulumi.Input[str]`) - MinVersion contains the minimum SSL/TLS version that is acceptable (1.0 is the minimum).
          * `preferServerCipherSuites` (`pulumi.Input[bool]`) - Controls whether the server selects the client’s most preferred ciphersuite, or the server’s most preferred ciphersuite.
          * `sessionTicketsDisabled` (`pulumi.Input[bool]`) - May be set to true to disable session ticket (resumption) support.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["balancer_id"] = balancer_id
        __props__["port"] = port
        __props__["protocol"] = protocol
        __props__["tags"] = tags
        __props__["tls_config"] = tls_config
        return Listener(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

