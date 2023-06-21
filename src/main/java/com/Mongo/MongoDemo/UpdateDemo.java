package com.Mongo.MongoDemo;
import org.bson.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class UpdateDemo {
	public static void main(String[] args) {
   	 MongoClient connection=MongoClients.create("mongob://localhost:27017");
   	  System.out.println("successfully connected");
   	  	MongoDatabase database=connection.getDatabase("fsd4");
   	  		MongoCollection<Document> collection=database.getCollection("Emp");
   	  		 collection.updateOne(new Document("name","priya"),new Document("$set",new Document("id",7)));
   	  		 MongoCursor<Document> cursor=collection.find(Filters.eq("name","priya")).cursor();
   	  		 Document doc=cursor.next();
   	  		 System.out.println(doc.values());
             connection.close();
	} 	 
}
