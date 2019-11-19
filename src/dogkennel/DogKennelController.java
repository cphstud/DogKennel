/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogkennel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author thor
 */
public class DogKennelController {
	int choice =0;

	public void runProgram() {
		HashMap<String,String> dogParams = new HashMap<>();
		UI ui = new UI();
		RegisterDogUI regDog =  new RegisterDogUI(ui, dogParams);
		regDog.getDogParams();
		Set<String> keys = dogParams.keySet();
		for (String  key: keys) {
			System.out.println(key + " -> " + dogParams.get(key));
		}
		Dog dog = new Dog();
		dog.setDogname(dogParams.get("Name"));
		dog.setBreed(dogParams.get("Breed"));
		dog.setColor(dogParams.get("Color"));
		dog.setCityOrigin(dogParams.get("CityOfOrigin"));
		dog.setAge(Integer.parseInt(dogParams.get("Age")));
		System.out.println("Dog " + dog);

	}
	
}
