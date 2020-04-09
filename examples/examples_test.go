// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccAwsElastiGroupTs(t *testing.T) {
	getToken(t)
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "aws_elastigroup", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccAwsElastiGroupPython(t *testing.T) {
	getToken(t)
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "aws_elastigroup", "python"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccAwsElastiGroupCsharp(t *testing.T) {
	getToken(t)
	test := getCsharpBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "aws_elastigroup", "csharp"),
		})

	integration.ProgramTest(t, &test)
}

func getToken(t *testing.T) {
	token := os.Getenv("SPOTINST_TOKEN")
	if token == "" {
		t.Skipf("Skipping test due to missing SPOTINST_TOKEN environment variable")
	}
}

func getEnvRegion(t *testing.T) string {
	envRegion := os.Getenv("AWS_REGION")
	if envRegion == "" {
		t.Skipf("Skipping test due to missing AWS_REGION environment variable")
	}

	return envRegion
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		Config: map[string]string{
			"aws:region": getEnvRegion(t),
		},
	}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/spotinst",
		},
	})

	return baseJS
}

func getCsharpBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseCsharp := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"Pulumi.SpotInst",
		},
	})

	return baseCsharp
}

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	basePython := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePython
}
