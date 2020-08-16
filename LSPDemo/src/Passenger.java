
public class Passenger {

	private String name;
	private Integer age;
	private String passportId;
	
	public Passenger(String name, Integer age, String passportId) {
		super();
		this.name = name;
		this.age = age;
		this.passportId = passportId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassportId() {
		return passportId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	
	
	
	
}
