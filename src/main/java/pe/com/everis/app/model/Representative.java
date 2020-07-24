package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Representative")
public class Representative {
	
	@Id
	private String idRepresentative;
	
	private String nameRepresentative;
	private String lastNameRepresentative;
	private String docRepresentative;
	private String phoneRepresentative;
	private String addressRepresentative;
	private String mailRepresentative;
	private String customerType;
	
	public Representative() {
		
	}

	public Representative(String nameRepresentative, String lastNameRepresentative, String docRepresentative,
			String phoneRepresentative, String addressRepresentative, String mailRepresentative, String customerType) {

		this.nameRepresentative = nameRepresentative;
		this.lastNameRepresentative = lastNameRepresentative;
		this.docRepresentative = docRepresentative;
		this.phoneRepresentative = phoneRepresentative;
		this.addressRepresentative = addressRepresentative;
		this.mailRepresentative = mailRepresentative;
		this.customerType = customerType;
	}


	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getIdRepresentative() {
		return idRepresentative;
	}

	public void setIdRepresentative(String idRepresentative) {
		this.idRepresentative = idRepresentative;
	}

	public String getNameRepresentative() {
		return nameRepresentative;
	}

	public void setNameRepresentative(String nameRepresentative) {
		this.nameRepresentative = nameRepresentative;
	}

	public String getLastNameRepresentative() {
		return lastNameRepresentative;
	}

	public void setLastNameRepresentative(String lastNameRepresentative) {
		this.lastNameRepresentative = lastNameRepresentative;
	}

	public String getDocRepresentative() {
		return docRepresentative;
	}

	public void setDocRepresentative(String docRepresentative) {
		this.docRepresentative = docRepresentative;
	}

	public String getPhoneRepresentative() {
		return phoneRepresentative;
	}

	public void setPhoneRepresentative(String phoneRepresentative) {
		this.phoneRepresentative = phoneRepresentative;
	}

	public String getAddressRepresentative() {
		return addressRepresentative;
	}

	public void setAddressRepresentative(String addressRepresentative) {
		this.addressRepresentative = addressRepresentative;
	}

	public String getMailRepresentative() {
		return mailRepresentative;
	}

	public void setMailRepresentative(String mailRepresentative) {
		this.mailRepresentative = mailRepresentative;
	}
	
}
