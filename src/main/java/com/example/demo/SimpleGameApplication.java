package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleGameApplication {

	public static void main(String[] args) { CharacterModel model = new CharacterModel("Crocus", 20, 3); CharacterView view = new CharacterView(); CharacterController controller = new CharacterController(model, view); controller.updateView(); controller.setCharacterLevel(controller.getCharacterLevel() + 1); controller.updateView(); controller.setCharacterLife(controller.getCharacterLife() + 10); controller.updateView(); }


}
