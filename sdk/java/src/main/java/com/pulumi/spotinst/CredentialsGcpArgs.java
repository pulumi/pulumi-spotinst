// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class CredentialsGcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final CredentialsGcpArgs Empty = new CredentialsGcpArgs();

    /**
     * The ID of the account associated with your token.
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return The ID of the account associated with your token.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * .
     * 
     */
    @Import(name="authProviderX509CertUrl", required=true)
    private Output<String> authProviderX509CertUrl;

    /**
     * @return .
     * 
     */
    public Output<String> authProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }

    /**
     * Authentication uri.
     * 
     */
    @Import(name="authUri", required=true)
    private Output<String> authUri;

    /**
     * @return Authentication uri.
     * 
     */
    public Output<String> authUri() {
        return this.authUri;
    }

    /**
     * Email associated with service account.
     * 
     */
    @Import(name="clientEmail", required=true)
    private Output<String> clientEmail;

    /**
     * @return Email associated with service account.
     * 
     */
    public Output<String> clientEmail() {
        return this.clientEmail;
    }

    /**
     * Client ID of service account.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Client ID of service account.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Should be in following format - &#34;https://www.googleapis.com/robot/v1/metadata/x509/&#34;.
     * 
     */
    @Import(name="clientX509CertUrl", required=true)
    private Output<String> clientX509CertUrl;

    /**
     * @return Should be in following format - &#34;https://www.googleapis.com/robot/v1/metadata/x509/&#34;.
     * 
     */
    public Output<String> clientX509CertUrl() {
        return this.clientX509CertUrl;
    }

    /**
     * Private key of JSON key created during prerequisites stage.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    /**
     * @return Private key of JSON key created during prerequisites stage.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }

    /**
     * Private key ID of JSON key created during prerequisites stage.
     * 
     */
    @Import(name="privateKeyId", required=true)
    private Output<String> privateKeyId;

    /**
     * @return Private key ID of JSON key created during prerequisites stage.
     * 
     */
    public Output<String> privateKeyId() {
        return this.privateKeyId;
    }

    /**
     * Name of project in GCP.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Name of project in GCP.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Token uri.
     * 
     */
    @Import(name="tokenUri", required=true)
    private Output<String> tokenUri;

    /**
     * @return Token uri.
     * 
     */
    public Output<String> tokenUri() {
        return this.tokenUri;
    }

    /**
     * Valid values - service_account.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Valid values - service_account.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CredentialsGcpArgs() {}

    private CredentialsGcpArgs(CredentialsGcpArgs $) {
        this.accountId = $.accountId;
        this.authProviderX509CertUrl = $.authProviderX509CertUrl;
        this.authUri = $.authUri;
        this.clientEmail = $.clientEmail;
        this.clientId = $.clientId;
        this.clientX509CertUrl = $.clientX509CertUrl;
        this.privateKey = $.privateKey;
        this.privateKeyId = $.privateKeyId;
        this.projectId = $.projectId;
        this.tokenUri = $.tokenUri;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CredentialsGcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialsGcpArgs $;

        public Builder() {
            $ = new CredentialsGcpArgs();
        }

        public Builder(CredentialsGcpArgs defaults) {
            $ = new CredentialsGcpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The ID of the account associated with your token.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The ID of the account associated with your token.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param authProviderX509CertUrl .
         * 
         * @return builder
         * 
         */
        public Builder authProviderX509CertUrl(Output<String> authProviderX509CertUrl) {
            $.authProviderX509CertUrl = authProviderX509CertUrl;
            return this;
        }

        /**
         * @param authProviderX509CertUrl .
         * 
         * @return builder
         * 
         */
        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            return authProviderX509CertUrl(Output.of(authProviderX509CertUrl));
        }

        /**
         * @param authUri Authentication uri.
         * 
         * @return builder
         * 
         */
        public Builder authUri(Output<String> authUri) {
            $.authUri = authUri;
            return this;
        }

        /**
         * @param authUri Authentication uri.
         * 
         * @return builder
         * 
         */
        public Builder authUri(String authUri) {
            return authUri(Output.of(authUri));
        }

        /**
         * @param clientEmail Email associated with service account.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(Output<String> clientEmail) {
            $.clientEmail = clientEmail;
            return this;
        }

        /**
         * @param clientEmail Email associated with service account.
         * 
         * @return builder
         * 
         */
        public Builder clientEmail(String clientEmail) {
            return clientEmail(Output.of(clientEmail));
        }

        /**
         * @param clientId Client ID of service account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client ID of service account.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientX509CertUrl Should be in following format - &#34;https://www.googleapis.com/robot/v1/metadata/x509/&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clientX509CertUrl(Output<String> clientX509CertUrl) {
            $.clientX509CertUrl = clientX509CertUrl;
            return this;
        }

        /**
         * @param clientX509CertUrl Should be in following format - &#34;https://www.googleapis.com/robot/v1/metadata/x509/&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clientX509CertUrl(String clientX509CertUrl) {
            return clientX509CertUrl(Output.of(clientX509CertUrl));
        }

        /**
         * @param privateKey Private key of JSON key created during prerequisites stage.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private key of JSON key created during prerequisites stage.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyId Private key ID of JSON key created during prerequisites stage.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(Output<String> privateKeyId) {
            $.privateKeyId = privateKeyId;
            return this;
        }

        /**
         * @param privateKeyId Private key ID of JSON key created during prerequisites stage.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyId(String privateKeyId) {
            return privateKeyId(Output.of(privateKeyId));
        }

        /**
         * @param projectId Name of project in GCP.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Name of project in GCP.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tokenUri Token uri.
         * 
         * @return builder
         * 
         */
        public Builder tokenUri(Output<String> tokenUri) {
            $.tokenUri = tokenUri;
            return this;
        }

        /**
         * @param tokenUri Token uri.
         * 
         * @return builder
         * 
         */
        public Builder tokenUri(String tokenUri) {
            return tokenUri(Output.of(tokenUri));
        }

        /**
         * @param type Valid values - service_account.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Valid values - service_account.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CredentialsGcpArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "accountId");
            }
            if ($.authProviderX509CertUrl == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "authProviderX509CertUrl");
            }
            if ($.authUri == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "authUri");
            }
            if ($.clientEmail == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "clientEmail");
            }
            if ($.clientId == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "clientId");
            }
            if ($.clientX509CertUrl == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "clientX509CertUrl");
            }
            if ($.privateKey == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "privateKey");
            }
            if ($.privateKeyId == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "privateKeyId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "projectId");
            }
            if ($.tokenUri == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "tokenUri");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("CredentialsGcpArgs", "type");
            }
            return $;
        }
    }

}
