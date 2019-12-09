[![Build Status](https://travis-ci.com/pulumi/pulumi-spotinst.svg?branch=master)](https://travis-ci.com/pulumi/pulumi-spotinst)

# Spotinst Resource Provider

The Spotinst resource provider for Pulumi lets you manage SpotInst resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/spotinst

or `yarn`:

    $ yarn add @pulumi/spotinst

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_spotinst

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-spotinst/sdk/go/...

## Configuration

The following configuration points are available for the `spotinst` provider:

- `spotinst:account` (environment: `SPOTINST_ACCOUNT`) - the account for `spotinst`
- `spotinst:token` (environment: `SPOTINST_TOKEN`) - the api token for `spotinst`

## Reference

For detailed reference documentation, please visit [the API docs][1].

[1]: https://www.pulumi.com/docs/reference/pkg/nodejs/pulumi/spotinst/index.html
