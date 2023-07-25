package com.hoaxvo.common.config.defaultconfig;

import com.hoaxvo.common.config.AuditStorageConfig;
import com.hoaxvo.common.services.AuditStorageService;
import com.hoaxvo.common.services.impl.AuditStorageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AuditStorageDefaultConfig extends AuditStorageConfig {
    private final MongoTemplate mongoTemplate;

    public AuditStorageDefaultConfig(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    @Bean
    public AuditStorageService auditStorageService() {
        return new AuditStorageServiceImpl(mongoTemplate);
    }
}
