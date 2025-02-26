package day0226;

import java.io.Serializable;

public class UserDataVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8932987414648042889L;
//implements Serializable 나는 잘라질수 있어
//데이터를 가지는 클래스에는 VO 가 붙는다.
	private /* transient */ String name;
	private /* transient */ double height;
	private double weight;

	public UserDataVO() {
	}

	public UserDataVO(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}// UserDataVO

	public String getName() {
		return name;
	}// getName

	public void setName(String name) {
		this.name = name;
	}// setName

	public double getHeight() {
		return height;
	}// getHeight

	public void setHeight(double height) {
		this.height = height;
	}// setHeight

	public double getWeight() {
		return weight;
	}// getWeight

	public void setWeight(double weight) {
		this.weight = weight;
	}// setWeight

	@Override
	public String toString() {
		return "UserDataVO [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}// toString

}// class
