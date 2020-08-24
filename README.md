[![Actions Status](https://github.com/pulumi/pulumi-spotinst/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-spotinst/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fspotinst.svg)](https://www.npmjs.com/package/@pulumi/spotinst)
[![Python version](https://badge.fury.io/py/pulumi-spotinst.svg)](https://pypi.org/project/pulumi-spotinst)
[![NuGet version](https://badge.fury.io/nu/pulumi.spotinst.svg)](https://badge.fury.io/nu/pulumi.spotinst)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-spotinst/sdk/v2/go)](https://pkg.go.dev/github.com/pulumi/pulumi-spotinst/sdk/v2/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-spotinst/blob/master/LICENSE)

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

    $ go get github.com/pulumi/pulumi-spotinst/sdk/v2/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Spotinst

## Configuration

The following configuration points are available for the `spotinst` provider:

- `spotinst:account` (environment: `SPOTINST_ACCOUNT`) - the account for `spotinst`
- `spotinst:token` (environment: `SPOTINST_TOKEN`) - the api token for `spotinst`

## Reference
For further information, please visit [the Spotinst provider docs](https://www.pulumi.com/docs/intro/cloud-providers/spotinst) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/spotinst).
