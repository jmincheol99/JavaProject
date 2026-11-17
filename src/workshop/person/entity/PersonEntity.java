package workshop.person.entity;

public class PersonEntity {
	
	private String name; 
	private char gender;
	private String ssn; 
	private String address; 
	private String phone;
	
	public PersonEntity() {
		
	}

	public PersonEntity(String name, String ssn, String address, String phone) {
//		super();
//		this.name = name;
//		this.ssn = ssn;
//		this.address = address;
//		this.phone = phone;
		setName(name);
		setSsn(ssn);
		setAddress(address);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		char genderNum = ssn.charAt(6); //주민번호 첫번째 자리는 0번째 -> charAt(6)는 7번째 자리
		if(genderNum == '1' || genderNum == '3') {
			setGender('남');
		}
		else {
			setGender('여');
		}
		}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}