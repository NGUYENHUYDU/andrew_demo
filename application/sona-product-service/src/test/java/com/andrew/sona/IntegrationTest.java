package com.andrew.sona;

import com.andrew.sona.SonaProductServiceApp;
import com.andrew.sona.config.AsyncSyncConfiguration;
import com.andrew.sona.config.EmbeddedElasticsearch;
import com.andrew.sona.config.EmbeddedKafka;
import com.andrew.sona.config.EmbeddedRedis;
import com.andrew.sona.config.EmbeddedSQL;
import com.andrew.sona.config.TestSecurityConfiguration;
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
@SpringBootTest(classes = { SonaProductServiceApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
