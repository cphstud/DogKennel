package dogkennel;

public class Dog {
//20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	int id;
	int age;
	String dogname;
	String gender;
	String color;
	String breed;
	String cityOrigin;

	public Dog() {
	}

	public Dog(int id, String color, String breed, String dogname, String gender, String cityOrigin, int age) {
		this.id = id;
		this.age = age;
		this.dogname = dogname;
		this.gender = gender;
		this.color = color;
		this.breed = breed;
		this.cityOrigin = cityOrigin;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setCityOrigin(String cityOrigin) {
		this.cityOrigin = cityOrigin;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getDogname() {
		return dogname;
	}

	public String getGender() {
		return gender;
	}

	public String getColor() {
		return color;
	}

	public String getBreed() {
		return breed;
	}

	public String getCityOrigin() {
		return cityOrigin;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += "NAME: " + this.dogname;
		msg += " RACE: " + this.breed;
		msg += " COLOR: " + this.color;
		msg += " TOWN: " + this.cityOrigin;
		msg += " AGE: " + this.age;
		System.out.println(msg);

		return msg;
	}

	public String getName() {
		return this.dogname;

	}
	
}
