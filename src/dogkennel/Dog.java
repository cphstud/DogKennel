package dogkennel;

public class Dog implements Comparable<Dog>{
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Dog dog = (Dog) o;
		return getId() == dog.getId();
	}

	@Override
	public int hashCode() {
		return getId();
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


	@Override
	public int compareTo(Dog o) {
	    return this.getAge()-o.getAge();
	}
}
