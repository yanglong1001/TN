package com.gomefinance.consumerfinance.acc;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@EnableApolloConfig({"application", "GMCF.MQ", "GMCF.CACHE", "GMCF.FASTDFS", "GMCF.JDBC",
		"GMCF.DUBBO", "GMCF.IDGEN", "GMCF.LOCK", "GMCF.LTS", "GMCF.SFTP", "GMCF-ACC.CACHE",
		"GMCF-ACC.DUBBO", "GMCF-ACC.IDGEN", "GMCF-ACC.JDBC", "GMCF-ACC.LOCK", "GMCF-ACC.LTS",
		"GMCF-ACC.MQ"})
@ComponentScan(basePackages = {"com.gomefinance"})
@ImportResource({"classpath:/spring/applicationContext-cache-redis.xml",
		"classpath:/spring/applicationContext-concurrentLock-redis.xml",
		"classpath:/spring/applicationContext-rocketmq-consumer.xml",
		"classpath:/spring/applicationContext-rocketmq-producer.xml",
		"classpath:/spring/applicationContext-fastdfs.xml", "classpath:/spring/applicationContext-dal.xml",
		"classpath:/spring/applicationContext-dubbo-provider.xml",
		"classpath:/spring/applicationContext-dubbo-consumer.xml", "classpath:/spring/applicationContext-service.xml",
		"classpath:/spring/applicationContext-biz.xml", "classpath:/spring/applicationContext-integration.xml",
		"classpath:/spring/applicationContext-util.xml", "classpath:/spring/applicationContext-lts-tasktracker.xml",
		"classpath:/spring/applicationContext-idgen.xml"})
public class AppStartup extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(AppStartup.class, args);
	}
}
