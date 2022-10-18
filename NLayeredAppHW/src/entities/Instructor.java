package entities;

public class Instructor {

	private int Id;
	private String name;
	private String surname;

	public Instructor(int id, String name, String surname) {
		super();
		Id = id;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
