package com.balram.hashicorp.vault.example.vaultservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author balram
 *
 */
@SpringBootApplication
public class VaultServiceApplication implements CommandLineRunner {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(VaultServiceApplication.class);
	
	
//	@Autowired DataSource dataSource;
	
	@Value("${uname}")
	public String uname;
	
	@PostConstruct
	public void test() throws SQLException {
//		log.info("uname : " +uname);
//		Connection connection = dataSource.getConnection();
//		Statement createStatement = connection.createStatement();
//		ResultSet executeQuery = createStatement.executeQuery("SELECT USER();");
//		executeQuery.next();
//		log.info("User : "+ executeQuery.getString("1"));
//		executeQuery.close();
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultServiceApplication.class, args);
		log.info("Bean has been initialized with the values are ");
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}
}
