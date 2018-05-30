package me.aboullaite;

import com.github.messenger4j.MessengerPlatform;
import com.github.messenger4j.send.MessengerSendClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDocBotApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringDocBotApplication.class);

	/**
	 * Initializes the {@code MessengerSendClient}.
	 *
	 * @param pageAccessToken the generated {@code Page Access Token}
	 */
	@Bean
//	public MessengerSendClient messengerSendClient(@Value("${messenger4j.pageAccessToken}") String pageAccessToken) {
	public MessengerSendClient messengerSendClient(@Value("EAARp9RDBZBZBEBABXU1coCgphofkvQMKpud0RE0cLxaZCRBKRN5mB7Kx5JKMFgbZBNqPXTZA6khm8B9uAdzlH3DGexCRehID3KXtXZBESOrtDqgk4kG4HZCAZCw85Np5DHZBzUFYapb41HeXO53BvkGBrJO69vwO9ODQ0cwwzb3Gowlvva61zEI7hBvSj2GczJEAZD") String pageAccessToken) {

		logger.debug("Initializing MessengerSendClient - pageAccessToken: {}", pageAccessToken);
		return MessengerPlatform.newSendClientBuilder(pageAccessToken).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDocBotApplication.class, args);
	}
}
