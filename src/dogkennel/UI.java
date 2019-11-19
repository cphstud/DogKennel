package dogkennel;

import java.util.Scanner;

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
	
}
	