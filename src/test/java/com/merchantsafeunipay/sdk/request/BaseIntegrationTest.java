package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.authentication.types.UserCredentialsAuthentication;
import org.junit.Before;

import com.merchantsafeunipay.sdk.MsuApiClient;
import com.merchantsafeunipay.sdk.authentication.credentials.providers.StaticCredentialsProvider;

public class BaseIntegrationTest {
	protected MsuApiClient client;
	
	@Before
	public void setUp() {
		Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
				new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "Pluto321`"));
		client = MsuApiClient.builder()
//				.withUrl("http://localhost:8090/msu/api/v2")
				.withDefaultAuthentication(userCredentialsAuthentication)
				.build();
	}
}