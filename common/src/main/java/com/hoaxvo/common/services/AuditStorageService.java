package com.hoaxvo.common.services;

import org.bson.Document;

public interface AuditStorageService {
    void saveAuditLog(Document document, String collectionName);
}
