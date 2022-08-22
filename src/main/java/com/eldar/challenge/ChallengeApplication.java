package com.eldar.challenge;

import com.eldar.challenge.entity.CardEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);

		CardEntity card1 = new CardEntity();


	}
}
