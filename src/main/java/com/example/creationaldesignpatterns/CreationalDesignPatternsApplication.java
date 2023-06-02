package com.example.creationaldesignpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.codebuild.CodeBuildClient;
import software.amazon.awssdk.services.codebuild.model.Build;
import software.amazon.awssdk.services.codebuild.model.ListBuildsRequest;
import software.amazon.awssdk.services.codebuild.model.ListBuildsResponse;
import software.amazon.awssdk.services.codebuild.model.StatusType;

@SpringBootApplication
public class CreationalDesignPatternsApplication {

    public static void main(String[] args) {
	System.out.println("testing for merge");
//        SpringApplication.run(CreationalDesignPatternsApplication.class, args);
//    }
        String accessKey = "AKIAVU4JVESWOTV2RDDN";
        String secretKey = "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";

        AwsBasicCredentials basicCredentials = AwsBasicCredentials.create(accessKey,secretKey);

        StaticCredentialsProvider staticCredentialsProvider = StaticCredentialsProvider.create(basicCredentials);

        CodeBuildClient codeBuildClient = CodeBuildClient.builder()
                .credentialsProvider(staticCredentialsProvider)
                .region(Region.AP_SOUTH_1) // Set the appropriate AWS region
                .build();

        // Create a ListBuildsRequest
        ListBuildsRequest listBuildsRequest = ListBuildsRequest.builder()
//                .projectName("Creational-design-pattern-test") // Set the CodeBuild project name
                .build();

        // Call the ListBuilds API
        ListBuildsResponse response = codeBuildClient.listBuilds(listBuildsRequest);

        // Process the response
        for (String buildId : response.ids()) {
            // Access build information
            System.out.println("BUILD ID:"+buildId);
            // ... Process other build properties
        }

        // Close the CodeBuildClient
        codeBuildClient.close();
    }

}
