package com.hoaxvo.common.config;

import com.hoaxvo.common.services.AuditStorageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class AuditStorageConfig {

    @Bean
    public abstract AuditStorageService auditStorageService();
}
