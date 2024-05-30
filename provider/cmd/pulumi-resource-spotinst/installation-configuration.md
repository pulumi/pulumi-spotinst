---
title: Spotinst Installation & Configuration
meta_desc: Provides an overview on how to configure the Pulumi Spotinst Provider.
layout: package
---

# Spotinst Provider

The Spotinst provider is used to interact with the
resources supported by Spotinst. The provider needs to be configured
with the proper credentials before it can be used.

Use the navigation to the left to read about the available resources.

## Example Usage

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as spotinst from "@pulumi/spotinst";

// Create an Elastigroup
const foo = new spotinst.aws.Elastigroup("foo", {});
```
```python
import pulumi
import pulumi_spotinst as spotinst

# Create an Elastigroup
foo = spotinst.aws.Elastigroup("foo")
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using SpotInst = Pulumi.SpotInst;

return await Deployment.RunAsync(() => 
{
    // Create an Elastigroup
    var foo = new SpotInst.Aws.Elastigroup("foo");

});
```
```go
package main

import (
	"github.com/pulumi/pulumi-spotinst/sdk/v3/go/spotinst/aws"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		// Create an Elastigroup
		_, err := aws.NewElastigroup(ctx, "foo", nil)
		if err != nil {
			return err
		}
		return nil
	})
}
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.spotinst.aws.Elastigroup;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        // Create an Elastigroup
        var foo = new Elastigroup("foo");

    }
}
```
```yaml
resources:
  # Create an Elastigroup
  foo:
    type: spotinst:aws:Elastigroup
```

## Argument Reference

The following arguments are supported:

* `enabled` - (Optional) Boolean value to enable or disable the provider. Default is `true`.
* `token` - (Required) A Personal API Access Token issued by Spotinst. It can be sourced from the `SPOTINST_TOKEN` environment variable.
* `account` - (Optional) A valid Spotinst account ID. It can be sourced from the `SPOTINST_ACCOUNT` environment variable.
* `feature_flags` - (Optional) Spotinst SDK feature flags. They can be sourced from the `SPOTINST_FEATURE_FLAGS` environment variable.

## Credential Precedence

Credentials will be set given the following precedence:
1. credentials defined in the provider block of the template
2. credentials defined as environment variables
3. credentials defined in ~/.spotinst/credentials

The credentials can be merge in the chain by enabling the `MergeCredentialsChain` feature flag.

```typescript
import * as pulumi from "@pulumi/pulumi";
```
```python
import pulumi
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
});
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		return nil
	})
}
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
    }
}
```
```yaml
{}
```

Please note that if you omit the Spotinst account, resources will be created using the default account for your organization.