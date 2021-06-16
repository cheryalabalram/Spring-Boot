package com.balram.hashicorp.vault.example.vaultservice;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.balram.hashicorp.vault.example.vaultservice.config.AppCredentials;

/**
 * @author balram
 *
 */
@SpringBootApplication
public class VaultServiceApplication implements CommandLineRunner {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(VaultServiceApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext test = SpringApplication.run(VaultServiceApplication.class, args);
		AppCredentials bean = test.getBean(AppCredentials.class);
		log.info("Bean has been initialized with the values are : "+bean.toString());
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
