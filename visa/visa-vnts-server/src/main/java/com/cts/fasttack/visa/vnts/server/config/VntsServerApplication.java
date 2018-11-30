package com.cts.fasttack.visa.vnts.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

import com.cts.fasttack.common.core.config.DecryptingPropertySourceFactory;

/**
 * @author Anton Leliuk
 */
@EnableDiscoveryClient(autoRegister = false)
@EnableConfigurationProperties
@SpringBootApplication(scanBasePackages = "com.cts.fasttack")
@PropertySource(value = "classpath:fasttack-vnts-server-application.properties", ignoreResourceNotFound = true, factory = DecryptingPropertySourceFactory.class)
@PropertySource(value = "file:${catalina.home}/conf/fasttack-vnts-server-application.properties", ignoreResourceNotFound = true, factory = DecryptingPropertySourceFactory.class)
@PropertySource(value = "file:${jboss.home.dir}/standalone/configuration/fasttack-vnts-server-application.properties", ignoreResourceNotFound = true, factory = DecryptingPropertySourceFactory.class)
@PropertySource(value = "file:${fasttack.home.dir}/conf/fasttack-vnts-server-application.properties", ignoreResourceNotFound = true, factory = DecryptingPropertySourceFactory.class)
public class VntsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VntsServerApplication.class, args);
    }
}
