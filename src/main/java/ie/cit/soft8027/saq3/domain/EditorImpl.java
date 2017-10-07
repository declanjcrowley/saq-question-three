package ie.cit.soft8027.saq3.domain;

import ie.cit.soft8027.saq3.interfaces.Editor;

public class EditorImpl implements Editor {

	public String speciality;
	public String firstname;
	public String lastname;
	public String emailAddress;
		
	public EditorImpl (String speciality, String firstname, String lastname, String emailAddress) {
		super();
		this.speciality = speciality;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailAddress = emailAddress;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Editor [speciality=" + speciality + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailAddress=" + emailAddress + "]";
	}
}
