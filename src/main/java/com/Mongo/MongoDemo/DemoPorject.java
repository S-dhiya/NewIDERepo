package com.Mongo.MongoDemo;

import java.util.ArrayList;

import java.util.List;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoPorject {
        public static void main(String[] args) {
			MongoClient connection=MongoClients.create("mongodb://localhost:27017");
			MongoDatabase database=connection.getDatabase("fsd4");
			MongoCollection<org.bson.Document> collection=database.getCollection("Emp");
			List<Document> docs=new ArrayList<>();
			Document doc=new Document();
			doc.append("id",6);
			doc.append("name","sandy");
			doc.append("salary",1000.00);
			docs.add(doc);
			collection.insertMany(docs);
			connection.close();
			
		}
}
