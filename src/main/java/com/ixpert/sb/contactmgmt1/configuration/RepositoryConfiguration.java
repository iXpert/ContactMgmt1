package com.ixpert.sb.contactmgmt1.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EntityScan(basePackages = {"com.ixpert.sb.contactmgmt1.model"})
@EnableJpaRepositories(basePackages ={"com.ixpert.sb.contactmgmt1.repository"} )
public class RepositoryConfiguration {
}
