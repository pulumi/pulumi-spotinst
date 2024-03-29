// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.spotinst.organization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.spotinst.organization.inputs.UserPolicyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserState extends com.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * Email.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * The first name of the user.
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return The first name of the user.
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * The last name of the user.
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return The last name of the user.
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * Password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The policies to register under the given group
     * (should be existing policies only).
     * 
     */
    @Import(name="policies")
    private @Nullable Output<List<UserPolicyArgs>> policies;

    /**
     * @return The policies to register under the given group
     * (should be existing policies only).
     * 
     */
    public Optional<Output<List<UserPolicyArgs>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    /**
     * User&#39;s role.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return User&#39;s role.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * A list of the user groups to register the given user to (should be existing user groups only)
     * 
     */
    @Import(name="userGroupIds")
    private @Nullable Output<List<String>> userGroupIds;

    /**
     * @return A list of the user groups to register the given user to (should be existing user groups only)
     * 
     */
    public Optional<Output<List<String>>> userGroupIds() {
        return Optional.ofNullable(this.userGroupIds);
    }

    private UserState() {}

    private UserState(UserState $) {
        this.email = $.email;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
        this.password = $.password;
        this.policies = $.policies;
        this.role = $.role;
        this.userGroupIds = $.userGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserState $;

        public Builder() {
            $ = new UserState();
        }

        public Builder(UserState defaults) {
            $ = new UserState(Objects.requireNonNull(defaults));
        }

        /**
         * @param email Email.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firstName The first name of the user.
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName The first name of the user.
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param lastName The last name of the user.
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName The last name of the user.
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param password Password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param policies The policies to register under the given group
         * (should be existing policies only).
         * 
         * @return builder
         * 
         */
        public Builder policies(@Nullable Output<List<UserPolicyArgs>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The policies to register under the given group
         * (should be existing policies only).
         * 
         * @return builder
         * 
         */
        public Builder policies(List<UserPolicyArgs> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies The policies to register under the given group
         * (should be existing policies only).
         * 
         * @return builder
         * 
         */
        public Builder policies(UserPolicyArgs... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param role User&#39;s role.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role User&#39;s role.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param userGroupIds A list of the user groups to register the given user to (should be existing user groups only)
         * 
         * @return builder
         * 
         */
        public Builder userGroupIds(@Nullable Output<List<String>> userGroupIds) {
            $.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * @param userGroupIds A list of the user groups to register the given user to (should be existing user groups only)
         * 
         * @return builder
         * 
         */
        public Builder userGroupIds(List<String> userGroupIds) {
            return userGroupIds(Output.of(userGroupIds));
        }

        /**
         * @param userGroupIds A list of the user groups to register the given user to (should be existing user groups only)
         * 
         * @return builder
         * 
         */
        public Builder userGroupIds(String... userGroupIds) {
            return userGroupIds(List.of(userGroupIds));
        }

        public UserState build() {
            return $;
        }
    }

}
