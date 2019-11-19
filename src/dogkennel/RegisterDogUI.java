/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dogkennel;

import java.util.HashMap;
import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

/**
 *
 * @author thor
 */
public class RegisterDogUI {
	private UI ui;
	private HashMap<String,String> dogParams;
	
	
	public RegisterDogUI(UI ui, HashMap<String,String> dogParams) {
		this.ui = ui;
		this.dogParams = dogParams;
		
	}
	//public HashMap<String,String> getDogParams() {
	public void getDogParams() {
		int choice = 1;
		printRegDogMenu();
		while (choice != 9)  {
			choice = ui.getInputInt("Enter choice");
			switch(choice) {
				case 1: dogParams.put("Name", ui.getInput("Name")); break;
				case 2: dogParams.put("Breed", ui.getInput("Breed")); break;
				case 3: dogParams.put("Color", ui.getInput("Color")); break;
				case 4: dogParams.put("Age", ui.getInput("Age")); break;
				case 5: dogParams.put("CityOfOrigin", ui.getInput("CityOfOrigin")); break;
				case 6: printRegDogMenu();break;
				default:System.out.println("Exit");choice = 9;break;
			}
		}
	}
	public void printRegDogMenu() {
		System.out.println("Welcome to the RegisterDogMenu");
		System.out.println("1) get Name");
		System.out.println("2) get Breed");
		System.out.println("3) get Color");
		System.out.println("4) get Age");
		System.out.println("5) get CityOfOrigin");
		System.out.println("6) reprint this  menu ");
		System.out.println("9) Exit"); 
	}
}

