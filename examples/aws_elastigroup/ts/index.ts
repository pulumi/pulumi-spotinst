import * as spotinst from "@pulumi/spotinst";
import * as aws from "@pulumi/aws";

const sg = new aws.ec2.SecurityGroup("my-security-group");

const azs = aws.getAvailabilityZones();

const elastiGroup = new spotinst.aws.Elastigroup("my-elastigroup", {
    fallbackToOndemand: false,
    instanceTypesOndemand: "m3.2xlarge",
    instanceTypesSpots: ["m3.xlarge", "m3.2xlarge"],
    orientation: "balanced",
    product: "Linux/UNIX",
    securityGroups: [sg.id],
    region: "us-west-2",
    availabilityZones: azs.names,
    imageId: "ami-e251209a",
});

export const elastiGroupName = elastiGroup.name;