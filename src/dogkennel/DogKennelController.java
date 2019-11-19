/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogkennel;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author thor
 */
public class DogKennelController {
	int choice =0;

	public void runProgram() {
		UI ui = new UI();
		Dog dog = new Dog();
		RegisterDogUI regDog =  new RegisterDogUI(ui, dog);
		regDog.getDogParams();
		System.out.println(dog);

	}
	
}
