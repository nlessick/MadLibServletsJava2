package model;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {2/15/2021}
 */
public class MadLib {
	
	private String name;
	private String food;
	private String animal;
	private String activity;
	
	public MadLib() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MadLib(String name, String food, String animal, String activity) {
		super();
		this.name = name;
		this.food = food;
		this.animal = animal;
		this.activity = activity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Override
	public String toString() {
		return "MadLib [name=" + name + ", food=" + food + ", animal=" + animal + ", activity=" + activity + "]";
	}
	
	

}
