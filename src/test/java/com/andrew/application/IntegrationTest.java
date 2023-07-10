package com.andrew.application;

import com.andrew.application.ProductServiceApp;
import com.andrew.application.config.AsyncSyncConfiguration;
import com.andrew.application.config.EmbeddedElasticsearch;
import com.andrew.application.config.EmbeddedKafka;
import com.andrew.application.config.EmbeddedRedis;
import com.andrew.application.config.EmbeddedSQL;
import com.andrew.application.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ProductServiceApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
