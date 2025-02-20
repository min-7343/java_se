package day0220;

/**
 * 사용자 정보 저장(구조틀)
 */
public class PersonInfo {
	
	String name;
	int age;
	String gender;
	String telNum;

	public PersonInfo() {
		
	}
	public PersonInfo(String name, int age, String gender, String telNum) {

		setName(name);
		setAge(age);
		setGender(gender);
		setPhone(telNum);
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return telNum;
	}
	public void setPhone(String telNum) {
		this.telNum = telNum;
	}
	@Override
	public String toString() {
		return name + " - " + age + " - " + gender + " - " + telNum;
	}
	
}
