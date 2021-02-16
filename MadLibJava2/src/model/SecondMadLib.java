package model;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {2/10/2021}
 */
public class SecondMadLib {
	
	private String name;
	private String location;
	private String firstNoun;
	private String secondNoun;
	private String pluralNoun;
	private String firstAdjective;
	private String secondAdjective;
	
	public SecondMadLib() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondMadLib(String name, String location, String firstNoun, String secondNoun, String pluralNoun,
			String firstAdjective, String secondAdjective) {
		super();
		this.name = name;
		this.location = location;
		this.firstNoun = firstNoun;
		this.secondNoun = secondNoun;
		this.pluralNoun = pluralNoun;
		this.firstAdjective = firstAdjective;
		this.secondAdjective = secondAdjective;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFirstNoun() {
		return firstNoun;
	}

	public void setFirstNoun(String firstNoun) {
		this.firstNoun = firstNoun;
	}

	public String getSecondNoun() {
		return secondNoun;
	}

	public void setSecondNoun(String secondNoun) {
		this.secondNoun = secondNoun;
	}

	public String getPluralNoun() {
		return pluralNoun;
	}

	public void setPluralNoun(String pluralNoun) {
		this.pluralNoun = pluralNoun;
	}

	public String getFirstAdjective() {
		return firstAdjective;
	}

	public void setFirstAdjective(String firstAdjective) {
		this.firstAdjective = firstAdjective;
	}

	public String getSecondAdjective() {
		return secondAdjective;
	}

	public void setSecondAdjective(String secondAdjective) {
		this.secondAdjective = secondAdjective;
	}

	@Override
	public String toString() {
		return "SecondMadLib [name=" + name + ", location=" + location + ", firstNoun=" + firstNoun + ", secondNoun="
				+ secondNoun + ", pluralNoun=" + pluralNoun + ", firstAdjective=" + firstAdjective
				+ ", secondAdjective=" + secondAdjective + "]";
	}
	
	

}
