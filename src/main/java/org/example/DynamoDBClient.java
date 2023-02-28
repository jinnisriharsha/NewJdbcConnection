package org.example;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class DynamoDBClient {
    private AmazonDynamoDB client;

    public DynamoDBClient() {
        String accessKey = "AKI";
        String secretKey = "6C4";

        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
        AWSStaticCredentialsProvider awsCredentialsProvider = new AWSStaticCredentialsProvider(awsCredentials);

        this.client = AmazonDynamoDBClientBuilder.standard()
                .withCredentials(awsCredentialsProvider)
                .withRegion(Regions.US_EAST_1)
                .build();
    }

    public AmazonDynamoDB getClient() {
        return this.client;
    }
}

