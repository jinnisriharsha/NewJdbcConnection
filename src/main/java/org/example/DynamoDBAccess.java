package org.example;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

    public class DynamoDBAccess {

        public static void main(String[] args) {

            // Create an instance of the DynamoDB client
            AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

            // Create a DynamoDB object
            DynamoDB dynamoDB = new DynamoDB(client);

            // Get a reference to your table by name
            Table table = dynamoDB.getTable("my-table-name");

            // Perform operations on the table, such as adding or retrieving items
            // For example, to add an item to the table:
            table.putItem(new Item()
                    .withPrimaryKey("id", "1234")
                    .withString("name", "John")
                    .withInt("age", 30));
        }
    }



