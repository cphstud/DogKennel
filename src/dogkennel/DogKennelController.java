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
		//RegisterDogUI regDog =  new RegisterDogUI(ui, dog);
		RegisterDogUI regDog =  new RegisterDogUI(ui, dog);
		regDog.getDogParams();
		System.out.println(dog);

	}
	
}
