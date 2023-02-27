package org.example;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;

import java.util.Map;

public class DynamoDBAccess {

        public static void main(String[] args) {
            DynamoDBClient dynamoDBClient = new DynamoDBClient();
            AmazonDynamoDB client = dynamoDBClient.getClient();

            // Create an instance of the DynamoDB client
          //  AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

            // Create a DynamoDB object
            DynamoDB dynamoDB = new DynamoDB(client);

            // Get a reference to your table by name
            Table table = dynamoDB.getTable("harsha");

            // Perform operations on the table, such as adding or retrieving items
            // For example, to add an item to the table:
           // table.putItem(new Item()
                    //.withPrimaryKey("id", "1234"));
                    //.withString("name", "John")
                    //.withInt("age", 30));
            String t=table.getTableName();
            System.out.println(t);
            ScanRequest scanRequest=new ScanRequest()
                    .withTableName("harsha");
            //ScanRequest request = null;
            ScanResult result = client.scan(scanRequest);
            for (Map<String, AttributeValue> item : result.getItems()) {
                System.out.println(item);
                System.out.println(item);
                System.out.println(item);
            }


        }
    }



