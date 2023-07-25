package com.hoaxvo.common.services.impl;

import com.hoaxvo.common.services.AuditStorageService;
import com.mongodb.client.MongoCollection;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuditStorageServiceImpl implements AuditStorageService {
    private final MongoTemplate mongoTemplate;

    @Override
    public void saveAuditLog(Document document, String collectionName) {
        MongoCollection<Document> collection = mongoTemplate.getCollection(collectionName);
        collection.insertOne(document);
    }
}
