package dogkennel;

import java.util.Iterator;
import java.util.Map;
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
		//regDog.getDogParams();
		Map<String, String> dPar = regDog.getDogParams();
		System.out.println(dog);
		System.out.println(dPar);

	}
	
}
