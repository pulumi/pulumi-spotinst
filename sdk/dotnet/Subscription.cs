// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.SpotInst
{
    /// <summary>
    /// Provides a Spotinst subscription resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using SpotInst = Pulumi.SpotInst;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a Subscription
    ///     var default_subscription = new SpotInst.Subscription("default-subscription", new()
    ///     {
    ///         ResourceId = my_eg.Id,
    ///         EventType = "AWS_EC2_INSTANCE_LAUNCH",
    ///         Protocol = "http",
    ///         Endpoint = "http://endpoint.com",
    ///         Format = 
    ///         {
    ///             { "event", "%event%" },
    ///             { "instance_id", "%instance-id%" },
    ///             { "resource_id", "%resource-id%" },
    ///             { "resource_name", "%resource-name%" },
    ///             { "tags", "foo,baz,baz" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [SpotInstResourceType("spotinst:index/subscription:Subscription")]
    public partial class Subscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        /// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        /// `"GROUP_UPDATED"`,
        /// `"AWS_EMR_PROVISION_TIMEOUT"`,
        /// `"GROUP_BEANSTALK_INIT_READY"`,
        /// `"AZURE_VM_TERMINATED"`,
        /// `"AZURE_VM_TERMINATE"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        /// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        /// `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        /// </summary>
        [Output("eventType")]
        public Output<string> EventType { get; private set; } = null!;

        /// <summary>
        /// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        /// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        /// Default: {`"event"`: `"&lt;event&gt;"`, `"instanceId"`: `"&lt;instance-id&gt;"`, `"resourceId"`: `"&lt;resource-id&gt;"`, `"resourceName"`: `"&lt;resource-name&gt;"` }.
        /// </summary>
        [Output("format")]
        public Output<ImmutableDictionary<string, object>?> Format { get; private set; } = null!;

        /// <summary>
        /// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        /// The following values are deprecated: `"http"` , `"https"`
        /// You can use the generic `"web"` protocol instead.
        /// `"aws-sns"` is only supported with AWS provider
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// Spotinst Resource id (Elastigroup or Ocean ID).
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a Subscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Subscription(string name, SubscriptionArgs args, CustomResourceOptions? options = null)
            : base("spotinst:index/subscription:Subscription", name, args ?? new SubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Subscription(string name, Input<string> id, SubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("spotinst:index/subscription:Subscription", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Subscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Subscription Get(string name, Input<string> id, SubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new Subscription(name, id, state, options);
        }
    }

    public sealed class SubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        /// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        /// `"GROUP_UPDATED"`,
        /// `"AWS_EMR_PROVISION_TIMEOUT"`,
        /// `"GROUP_BEANSTALK_INIT_READY"`,
        /// `"AZURE_VM_TERMINATED"`,
        /// `"AZURE_VM_TERMINATE"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        /// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        /// `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        /// </summary>
        [Input("eventType", required: true)]
        public Input<string> EventType { get; set; } = null!;

        [Input("format")]
        private InputMap<object>? _format;

        /// <summary>
        /// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        /// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        /// Default: {`"event"`: `"&lt;event&gt;"`, `"instanceId"`: `"&lt;instance-id&gt;"`, `"resourceId"`: `"&lt;resource-id&gt;"`, `"resourceName"`: `"&lt;resource-name&gt;"` }.
        /// </summary>
        public InputMap<object> Format
        {
            get => _format ?? (_format = new InputMap<object>());
            set => _format = value;
        }

        /// <summary>
        /// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        /// The following values are deprecated: `"http"` , `"https"`
        /// You can use the generic `"web"` protocol instead.
        /// `"aws-sns"` is only supported with AWS provider
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// Spotinst Resource id (Elastigroup or Ocean ID).
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        public SubscriptionArgs()
        {
        }
        public static new SubscriptionArgs Empty => new SubscriptionArgs();
    }

    public sealed class SubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The endpoint the notification will be sent to. url in case of `"http"`/`"https"`/`"web"`, email address in case of `"email"`/`"email-json"` and sns-topic-arn in case of `"aws-sns"`.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The event to send the notification when triggered. Valid values: `"AWS_EC2_INSTANCE_TERMINATE"`, `"AWS_EC2_INSTANCE_TERMINATED"`, `"AWS_EC2_INSTANCE_LAUNCH"`, `"AWS_EC2_INSTANCE_READY_SIGNAL_TIMEOUT"`, `"SIGNAL_TIMEOUT_SHUTDOWN_SCRIPT"`, `"AWS_EC2_CANT_SPIN_OD"`, `"AWS_EC2_INSTANCE_UNHEALTHY_IN_ELB"`, `"GROUP_ROLL_FAILED"`, `"GROUP_ROLL_FINISHED"`,
        /// `"CANT_SCALE_UP_GROUP_MAX_CAPACITY"`,
        /// `"GROUP_UPDATED"`,
        /// `"AWS_EMR_PROVISION_TIMEOUT"`,
        /// `"GROUP_BEANSTALK_INIT_READY"`,
        /// `"AZURE_VM_TERMINATED"`,
        /// `"AZURE_VM_TERMINATE"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_PAUSING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RESUMING"`,
        /// `"AWS_EC2_MANAGED_INSTANCE_RECYCLING"`,`"AWS_EC2_MANAGED_INSTANCE_DELETING"`.
        /// Ocean Events:`"CLUSTER_ROLL_FINISHED"`,`"GROUP_ROLL_FAILED"`,`"OCEAN_CANT_SCALE_UP_MAX_RESOURCES"`
        /// `"OCEAN_LAUNCH_SPEC_CANT_SCALE_UP_MAX_INSTANCES"`,`"OCEAN_K8S_NODE_REMOVED"`.
        /// </summary>
        [Input("eventType")]
        public Input<string>? EventType { get; set; }

        [Input("format")]
        private InputMap<object>? _format;

        /// <summary>
        /// The format of the notification content (JSON Format - Key+Value). Valid Values : `"instance-id"`, `"event"`, `"resource-id"`, `"resource-name"`, `"subnet-id"`, `"availability-zone"`, `"reason"`, `"private-ip"`, `"launchspec-id"`
        /// Example: {"event": `"event"`, `"resourceId"`: `"resource-id"`, `"resourceName"`: `"resource-name"`", `"myCustomKey"`: `"My content is set here"` }
        /// Default: {`"event"`: `"&lt;event&gt;"`, `"instanceId"`: `"&lt;instance-id&gt;"`, `"resourceId"`: `"&lt;resource-id&gt;"`, `"resourceName"`: `"&lt;resource-name&gt;"` }.
        /// </summary>
        public InputMap<object> Format
        {
            get => _format ?? (_format = new InputMap<object>());
            set => _format = value;
        }

        /// <summary>
        /// The protocol to send the notification. Valid values: `"email"`, `"email-json"`, `"aws-sns"`, `"web"`. 
        /// The following values are deprecated: `"http"` , `"https"`
        /// You can use the generic `"web"` protocol instead.
        /// `"aws-sns"` is only supported with AWS provider
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Spotinst Resource id (Elastigroup or Ocean ID).
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        public SubscriptionState()
        {
        }
        public static new SubscriptionState Empty => new SubscriptionState();
    }
}
