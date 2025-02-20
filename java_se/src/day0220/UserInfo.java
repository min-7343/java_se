package day0220;

/**
 * 사용자 정보 저장(구조틀)
 */
public class UserInfo {
	
	String name;
	int age;
	String gender;
	String phone;

	public UserInfo() {
		
	}
	public UserInfo(String name, int age, String gender, String phone) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.phone = phone;
		setName(name);
		setAge(age);
		setGender(gender);
		setPhone(phone);
		
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
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return name + " - " + age + " - " + gender + " - " + phone;
	}
	
}
