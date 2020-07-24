package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PersonalCustomer")
public class PersonalCustomer {

	@Id
	private String idPersonal;
	
	private String namePersonal;
	private String lastNamePersonal;
	private String docPersonal;
	private String phonePersonal;
	private String addressPersonal;
	private String mailPersonal;
	
	public PersonalCustomer() {
		
	}
		
	public PersonalCustomer(String namePersonal, String lastNamePersonal, String docPersonal, String phonePersonal,
			String addressPersonal, String mailPersonal) {
		
		this.namePersonal = namePersonal;
		this.lastNamePersonal = lastNamePersonal;
		this.docPersonal = docPersonal;
		this.phonePersonal = phonePersonal;
		this.addressPersonal = addressPersonal;
		this.mailPersonal = mailPersonal;
	}
	public String getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}
	public String getNamePersonal() {
		return namePersonal;
	}
	public void setNamePersonal(String namePersonal) {
		this.namePersonal = namePersonal;
	}
	public String getLastNamePersonal() {
		return lastNamePersonal;
	}
	public void setLastNamePersonal(String lastNamePersonal) {
		this.lastNamePersonal = lastNamePersonal;
	}
	public String getDocPersonal() {
		return docPersonal;
	}
	public void setDocPersonal(String docPersonal) {
		this.docPersonal = docPersonal;
	}
	public String getPhonePersonal() {
		return phonePersonal;
	}
	public void setPhonePersonal(String phonePersonal) {
		this.phonePersonal = phonePersonal;
	}
	public String getAddressPersonal() {
		return addressPersonal;
	}
	public void setAddressPersonal(String addressPersonal) {
		this.addressPersonal = addressPersonal;
	}
	public String getMailPersonal() {
		return mailPersonal;
	}
	public void setMailPersonal(String mailPersonal) {
		this.mailPersonal = mailPersonal;
	}
	
}
