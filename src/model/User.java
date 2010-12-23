package model;
public class User {

	public String name;

	public String surname;

	public String completeName() {
		return name + " " + surname;
	}

}
