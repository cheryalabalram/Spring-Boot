package com.balram.hashicorp.vault.example.vaultservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author balram
 *
 */
@Configuration
public class AppCredentials {

	@Value("${oracleDbUsername}") public String oracleDbUsername;

	@Value("${oracleDbPassword}") public String oracleDbPassword;

	@Value("${mySQLDBUsername}") public String mySQLDBUsername;

	@Value("${mySQLDBPassword}") public String mySQLDBPassword;

	@Value("${openshiftPassword}") public String sendGridToken;

	@Value("${openshiftPassword}") public String twillioSMSToken;

	@Value("${openshiftUsername}") public String openshiftUsername;

	@Value("${openshiftPassword}") public String openshiftPassword;

	public String getOracleDbUsername() {
		return oracleDbUsername;
	}

	public void setOracleDbUsername(String oracleDbUsername) {
		this.oracleDbUsername = oracleDbUsername;
	}

	public String getOracleDbPassword() {
		return oracleDbPassword;
	}

	public void setOracleDbPassword(String oracleDbPassword) {
		this.oracleDbPassword = oracleDbPassword;
	}

	public String getMySQLDBUsername() {
		return mySQLDBUsername;
	}

	public void setMySQLDBUsername(String mySQLDBUsername) {
		this.mySQLDBUsername = mySQLDBUsername;
	}

	public String getMySQLDBPassword() {
		return mySQLDBPassword;
	}

	public void setMySQLDBPassword(String mySQLDBPassword) {
		this.mySQLDBPassword = mySQLDBPassword;
	}

	public String getSendGridToken() {
		return sendGridToken;
	}

	public void setSendGridToken(String sendGridToken) {
		this.sendGridToken = sendGridToken;
	}

	public String getTwillioSMSToken() {
		return twillioSMSToken;
	}

	public void setTwillioSMSToken(String twillioSMSToken) {
		this.twillioSMSToken = twillioSMSToken;
	}

	public String getOpenshiftUsername() {
		return openshiftUsername;
	}

	public void setOpenshiftUsername(String openshiftUsername) {
		this.openshiftUsername = openshiftUsername;
	}

	public String getOpenshiftPassword() {
		return openshiftPassword;
	}

	public void setOpenshiftPassword(String openshiftPassword) {
		this.openshiftPassword = openshiftPassword;
	}

	@Override
	public String toString() {
		return "VaultConfiguration : \noracleDbUsername=" + oracleDbUsername + "\n oracleDbPassword=" + oracleDbPassword
				+ "\n mySQLDBUsername=" + mySQLDBUsername + "\n mySQLDBPassword=" + mySQLDBPassword + "\n sendGridToken="
				+ sendGridToken + "\n twillioSMSToken=" + twillioSMSToken + "\n openshiftUsername=" + openshiftUsername
				+ "\n openshiftPassword=" + openshiftPassword + "]";
	}
}
