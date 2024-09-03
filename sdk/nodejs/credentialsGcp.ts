// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Spotinst credential GCP resource.
 */
export class CredentialsGcp extends pulumi.CustomResource {
    /**
     * Get an existing CredentialsGcp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CredentialsGcpState, opts?: pulumi.CustomResourceOptions): CredentialsGcp {
        return new CredentialsGcp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'spotinst:index/credentialsGcp:CredentialsGcp';

    /**
     * Returns true if the given object is an instance of CredentialsGcp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CredentialsGcp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CredentialsGcp.__pulumiType;
    }

    /**
     * The ID of the account associated with your token.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * >.
     */
    public readonly authProviderX509CertUrl!: pulumi.Output<string>;
    /**
     * Authentication uri.
     */
    public readonly authUri!: pulumi.Output<string>;
    /**
     * Email associated with service account.
     */
    public readonly clientEmail!: pulumi.Output<string>;
    /**
     * Client ID of service account.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
     */
    public readonly clientX509CertUrl!: pulumi.Output<string>;
    /**
     * Private key of JSON key created during prerequisites stage.
     */
    public readonly privateKey!: pulumi.Output<string>;
    /**
     * Private key ID of JSON key created during prerequisites stage.
     */
    public readonly privateKeyId!: pulumi.Output<string>;
    /**
     * Name of project in GCP.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Token uri.
     */
    public readonly tokenUri!: pulumi.Output<string>;
    /**
     * Valid values - service_account.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a CredentialsGcp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CredentialsGcpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CredentialsGcpArgs | CredentialsGcpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CredentialsGcpState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["authProviderX509CertUrl"] = state ? state.authProviderX509CertUrl : undefined;
            resourceInputs["authUri"] = state ? state.authUri : undefined;
            resourceInputs["clientEmail"] = state ? state.clientEmail : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientX509CertUrl"] = state ? state.clientX509CertUrl : undefined;
            resourceInputs["privateKey"] = state ? state.privateKey : undefined;
            resourceInputs["privateKeyId"] = state ? state.privateKeyId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tokenUri"] = state ? state.tokenUri : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as CredentialsGcpArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.authProviderX509CertUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authProviderX509CertUrl'");
            }
            if ((!args || args.authUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authUri'");
            }
            if ((!args || args.clientEmail === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientEmail'");
            }
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            if ((!args || args.clientX509CertUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientX509CertUrl'");
            }
            if ((!args || args.privateKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateKey'");
            }
            if ((!args || args.privateKeyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privateKeyId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.tokenUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tokenUri'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["authProviderX509CertUrl"] = args ? args.authProviderX509CertUrl : undefined;
            resourceInputs["authUri"] = args ? args.authUri : undefined;
            resourceInputs["clientEmail"] = args ? args.clientEmail : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientX509CertUrl"] = args ? args.clientX509CertUrl : undefined;
            resourceInputs["privateKey"] = args ? args.privateKey : undefined;
            resourceInputs["privateKeyId"] = args ? args.privateKeyId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tokenUri"] = args ? args.tokenUri : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CredentialsGcp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CredentialsGcp resources.
 */
export interface CredentialsGcpState {
    /**
     * The ID of the account associated with your token.
     */
    accountId?: pulumi.Input<string>;
    /**
     * >.
     */
    authProviderX509CertUrl?: pulumi.Input<string>;
    /**
     * Authentication uri.
     */
    authUri?: pulumi.Input<string>;
    /**
     * Email associated with service account.
     */
    clientEmail?: pulumi.Input<string>;
    /**
     * Client ID of service account.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
     */
    clientX509CertUrl?: pulumi.Input<string>;
    /**
     * Private key of JSON key created during prerequisites stage.
     */
    privateKey?: pulumi.Input<string>;
    /**
     * Private key ID of JSON key created during prerequisites stage.
     */
    privateKeyId?: pulumi.Input<string>;
    /**
     * Name of project in GCP.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Token uri.
     */
    tokenUri?: pulumi.Input<string>;
    /**
     * Valid values - service_account.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CredentialsGcp resource.
 */
export interface CredentialsGcpArgs {
    /**
     * The ID of the account associated with your token.
     */
    accountId: pulumi.Input<string>;
    /**
     * >.
     */
    authProviderX509CertUrl: pulumi.Input<string>;
    /**
     * Authentication uri.
     */
    authUri: pulumi.Input<string>;
    /**
     * Email associated with service account.
     */
    clientEmail: pulumi.Input<string>;
    /**
     * Client ID of service account.
     */
    clientId: pulumi.Input<string>;
    /**
     * Should be in following format - "https://www.googleapis.com/robot/v1/metadata/x509/".
     */
    clientX509CertUrl: pulumi.Input<string>;
    /**
     * Private key of JSON key created during prerequisites stage.
     */
    privateKey: pulumi.Input<string>;
    /**
     * Private key ID of JSON key created during prerequisites stage.
     */
    privateKeyId: pulumi.Input<string>;
    /**
     * Name of project in GCP.
     */
    projectId: pulumi.Input<string>;
    /**
     * Token uri.
     */
    tokenUri: pulumi.Input<string>;
    /**
     * Valid values - service_account.
     */
    type: pulumi.Input<string>;
}
