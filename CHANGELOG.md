CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to v1.64.0 of the SpotInst Terraform Provider


---

## 3.11.0 (2021-11-11)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 3.10.0 (2021-11-01)
* Upgrade to v1.62.0 of the SpotInst Terraform Provider

## 3.9.0 (2021-10-04)
* Upgrade to v1.60.0 of the SpotInst Terraform Provider

## 3.8.0 (2021-09-27)
* Upgrade to v1.59.3 of the SpotInst Terraform Provider

## 3.7.0 (2021-09-03)
* Upgrade to v1.57.0 of the SpotInst Terraform Provider

## 3.6.0 (2021-08-09)
* Upgrade to v1.56.1 of the SpotInst Terraform Provider

## 3.5.0 (2021-07-20)
* Upgrade to v1.53.1 of the SpotInst Terraform Provider

## 3.4.0 (2021-06-14)
* Upgrade to v1.49.0 of the SpotInst Terraform Provider

## 3.3.0 (2021-06-03)
* Upgrade to v1.46.0 of the SpotInst Terraform Provider

## 3.2.0 (2021-04-30)
* Upgrade to v1.42.0 of the SpotInst Terraform Provider

## 3.1.0 (2021-04-23)
* Upgrade to v1.39.0 of the SpotInst Terraform Provider

## 3.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 2.20.0 (2021-04-12)
* Upgrade to v1.38.0 of the SpotInst Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.23.0

## 2.19.1 (2021-03-23)
* Upgrade to v1.36.0 of the SpotInst Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 2.19.0 (2021-03-16)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 2.18.0 (2021-03-09)
* Upgrade to v1.35.0 of the SpotInst Terraform Provider

## 2.17.1 (2021-02-24)
* Upgrade to v1.34.1 of the SpotInst Terraform Provider

## 2.17.0 (2021-02-18)
* Upgrade to v1.34.0 of the SpotInst Terraform Provider

## 2.16.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.16.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.15.0 (2021-01-20)
* Upgrade to v1.33.0 of the SpotInst Terraform Provider

## 2.14.1 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.14.0 (2020-12-22)
* Upgrade to v1.32.0 of the SpotInst Terraform Provider

## 2.13.0 (2020-12-08)
* Upgrade to v1.31.0 of the SpotInst Terraform Provider

## 2.12.0 (2020-11-26)
* Upgrade to v1.30.0 of the SpotInst Terraform Provider

## 2.11.1 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.11.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 2.10.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python
* Upgrade to v1.25.0 of the SpotInst Terraform Provider

## 2.9.0 (2020-08-21)
* Upgrade to v1.24.0 of the SpotInst Terraform Provider

## 2.8.0 (2020-08-06)
* Upgrade to v1.22.0 of the SpotInst Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.6.0
* Upgrade to Pulumi v2.7.1

## 2.7.0 (2020-07-24)
* Upgrade to v1.20.0 of the SpotInst Terraform Provider

## 2.6.0 (2020-06-30)
* Upgrade to v1.19.0 of the SpotInst Terraform Provider

## 2.5.0 (2020-06-26)
* Upgrade to v1.18.0 of the SpotInst Terraform Provider

## 2.4.1 (2020-06-12)
* Switch to GitHub actions for build

## 2.4.0 (2020-06-08)
* Upgrade to v1.17.0 of the SpotInst Terraform Provider

## 2.3.1 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.3.0 (2020-05-13)
* Upgrade to v1.16.0 of the SpotInst Terraform Provider

## 2.2.0 (2020-05-12)
* Upgrade to v1.15.0 of the SpotInst Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-18)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.3.0 (2020-04-014)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Refactor layout to support Go modules
* Upgrade to v1.14.3 of the SpotInst Terraform Provider

## 1.2.0 (2020-03-21)
* Upgrade to Pulumi v1.12.1
* Upgrade to v1.8.2 of pulumi-terraform-bridge

## 1.1.1 (2020-01-31)
* Upgrade to v1.14.2 of the SpotInst Terraform Provider

## 1.1.0 (2020-01-29)
* Upgrade to v1.14.1 of the SpotInst Terraform Provider
* Upgrade to v1.6.4 of pulumi-terraform-bridge

## 1.0.0 (2019-12-10)
* Initial release of the provider
