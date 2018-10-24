package Oct_24;

public class Student {
	private String number;
	private String name;
	private String major;
	private String contact;
	
	public Student(String number, String name, String major, String contact) {
		this.number = number;
		this.name = name;
		this.major = major;
		this.contact = contact;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
