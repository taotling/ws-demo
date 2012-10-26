package com.baiing.jersey.demo.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.baiing.jersey.demo.domain.User;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class UserDAOMongoDBImpl implements UserDAO {

	private Mongo mongo;
	private DB db;
	private DBCollection collection;
	
	public UserDAOMongoDBImpl(){
		init();
	}
	
	public void init() {
		try {
			mongo = new Mongo();
			// mg = new Mongo("localhost", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}
		// 获取test DB; 如果默认没有创建, mongodb 会自动创建
		db = mongo.getDB("baiing");
		// 获取users DBCollection; 如果默认没有创建, mongodb会自动创建
		collection = db.getCollection("baiing001");
	}
	public void delete(User user) {
		//
	}

	public List<Object> getAll() {
		
		System.out.println("查询  collection 的所有数据：");
		 
		List<Object> list = new ArrayList<Object>();
		// db游标
		DBCursor cur = collection.find();
		while (cur.hasNext()) {
			DBObject dbo = cur.next();
			System.out.println(dbo);
			list.add(dbo);
		}
		
		return list;
	}

	public User getById(Long id) {
		return null;
	}

	public void insert(User user) {

	}

	public void update(User user) {

	}

	// setter&getter
	public Mongo getMongo() {
		return mongo;
	}

	public void setMongo(Mongo mongo) {
		this.mongo = mongo;
	}

	public DB getDb() {
		return db;
	}

	public void setDb(DB db) {
		this.db = db;
	}

	public DBCollection getCollection() {
		return collection;
	}

	public void setCollection(DBCollection collection) {
		this.collection = collection;
	}

}
