package model;

//Added by Luis Cabral

public class Bear {
	private String name;
	private String species;
	private int age;

	public Bear() {
		super();
	}

	public Bear(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String makeNoise() {
		return "Growl";
	}
}
