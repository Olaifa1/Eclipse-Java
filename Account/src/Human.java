import java.util.Date;
public class Human {
	private String name;
	private Date dateOfBirth;
	
	public Human(){
	}					// A no-argument constructor.
	
	
	public Human(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}									// An argument constructor.

	
	public String getName() {	
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
