package dogkennel;

public class Dog {
//20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	int id;
	String dogname;
	String gender;
	String color;
	String breed;
	String cityOrigin;

	public Dog(int id, String color, String breed, String dogname, String gender, String cityOrigin) {
		this.id = id;
		this.dogname = dogname;
		this.gender = gender;
		this.color = color;
		this.breed = breed;
		this.cityOrigin = cityOrigin;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += "NAME: " + this.dogname;
		msg += "RACE: " + this.breed;
		msg += "GENDER: " + this.gender;
		msg += "COLOR: " + this.color;
		msg += "TOWN: " + this.cityOrigin;
		System.out.println(msg);

		return msg;
	}

	public String getName() {
		return this.dogname;

	}
	
}
