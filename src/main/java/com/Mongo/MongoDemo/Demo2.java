package com.Mongo.MongoDemo;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Demo2 {
             public static void main(String[] args) {
            	 MongoClient connection=MongoClients.create("mongob://localhost:27017");
              	  System.out.println("successfully connected");
              	  	MongoDatabase database=connection.getDatabase("fsd4");
              	  		MongoCollection<Document> collection=database.getCollection("Emp");
              	  		collection.deleteOne(Filters.eq("id",6));
              	  		MongoCursor<Document> cursor=collection.find().cursor();
              	  		while(cursor.hasNext()) {
              	  			Document doc=cursor.next();
              	  			System.err.println(doc.values());
              	  			
              	  		}
              	  	connection.close();
			}
}
