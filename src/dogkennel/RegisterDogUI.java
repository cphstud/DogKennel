/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dogkennel;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thor
 */
public class RegisterDogUI {
	private UI ui;
	private Dog dog;
	
	
	public RegisterDogUI(UI ui, Dog dog) {
		this.ui = ui;
		this.dog = dog;
		
	}
	public Map<String,String> getDogParams() {
	    Map<String,String> dogParams = new HashMap<>();
		int choice = 1;
		printRegDogMenu();
		while (choice != 9)  {
			choice = ui.getInputInt("Enter choice");
			switch(choice) {
				//case 1: dog.setDogname(ui.getInput("Name")); break;
				case 1: dogParams.put("Name",ui.getInput("Name")); break;
				//case 2: dog.setBreed(ui.getInput("Breed")); break;
				case 2: dogParams.put("Breed",ui.getInput("Breed")); break;
				//case 3: dog.setColor(ui.getInput("Color")); break;
				case 3: dogParams.put("Color",ui.getInput("Color")); break;
				//case 4: dog.setAge(ui.getInputInt("Age")); break;
				case 4: dogParams.put("Age",String.valueOf(ui.getInputInt("Age"))); break;
				//case 5: dog.setCityOrigin(ui.getInput("CityOfOrigin")); break;
				case 5: dogParams.put("CityOfOrigin",ui.getInput("CityOfOrigin")); break;
				//case 6: ui.printDog(dog);
				case 6: ui.printDogMap(dogParams);
				case 7: printRegDogMenu();break;
				default:System.out.println("Exit");choice = 9;break;
			}
		}
		System.out.println("returning dogParams");
		return dogParams;
	}

	public void printRegDogMenu() {
		System.out.println("Welcome to the RegisterDogMenu");
		System.out.println("1) get Name");
		System.out.println("2) get Breed");
		System.out.println("3) get Color");
		System.out.println("4) get Age");
		System.out.println("5) get CityOfOrigin");
		System.out.println("6) print dog ");
		System.out.println("7) reprint this  menu ");
		System.out.println("9) Exit");
	}
}

