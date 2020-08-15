package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleGameApplication {

	public static void main(String[] args) {

		SpringApplication.run(SimpleGameApplication.class, args);

		Score model = retriveScoreFromDatabase();

		View view = new View();
		Controller controller = new Controller(model, view);
		controller.updateView();
		controller.setUserScore(100);
		controller.updateView();

	}

	private static Score retriveScoreFromDatabase(){
		Score score = new Score();
		score.setScore(100);
		return score;
	}

}
