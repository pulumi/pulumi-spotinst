using System.Numerics;
using Pulumi;
using Pulumi.Aws;
using Pulumi.SpotInst.Aws;

class ElastiGroupStack : Stack
{
    public ElastiGroupStack()
    {
        var sg = new Pulumi.Aws.Ec2.SecurityGroup("my-csharp-security-group");

        var azs = Ec2.GetAvailabilityZones.InvokeAsync();
        
        var elastigroup = new Elastigroup("my-csharp-elastigroup", new ElastigroupArgs
        {
            FallbackToOndemand = false,
            InstanceTypesOndemand = "m3.2xlarge",
            InstanceTypesSpots =
            {
                "m3.xlarge",
                "m3.2xlarge",
            },
            Orientation = "balanced",
            Product = "Linux/UNIX",
            SecurityGroups =
            {
                sg.Id
            },
            Region = "us-west-2",
            AvailabilityZones = azs.Result.Names,
            ImageId = "ami-e251209a",
        });
    }
}

