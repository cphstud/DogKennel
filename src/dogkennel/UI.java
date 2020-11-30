package dogkennel;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UI {
	Scanner sc = new Scanner(System.in);

	public void printMsg(String msg) {
		System.out.println(msg);

	}
	public String getInput(String msg) {
		String retVal = "";
		System.out.println(msg);
		retVal = sc.nextLine();
		return retVal;
	}
	public int getInputInt(String msg) {
		int retVal = 0;
		System.out.println(msg);
		retVal = sc.nextInt();
		sc.nextLine();
		return retVal;
	}

	public void printDog(Dog dog) {
		System.out.println(dog);
	}

	public void printDogMap(Map<String, String> dogParams) {
		Set<String> dogsKeys = dogParams.keySet();
		for (String s : dogsKeys) {
			System.out.println(dogParams.get(s));
		}
	}
}
	