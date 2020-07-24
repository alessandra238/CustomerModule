package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VipPersonalCustomer")
public class VipPersonalCustomer {

	@Id
	private String idVipPersonal;
	
	private String nameVipPersonal;
	private String lastNameVipPersonal;
	private String docVipPersonal;
	private String phoneVipPersonal;
	private String addressVipPersonal;
	private String mailVipPersonal;
	
	public VipPersonalCustomer() {
		
	}

	public VipPersonalCustomer(String nameVipPersonal, String lastNameVipPersonal, String docVipPersonal,
			String phoneVipPersonal, String addressVipPersonal, String mailVipPersonal) {
		this.nameVipPersonal = nameVipPersonal;
		this.lastNameVipPersonal = lastNameVipPersonal;
		this.docVipPersonal = docVipPersonal;
		this.phoneVipPersonal = phoneVipPersonal;
		this.addressVipPersonal = addressVipPersonal;
		this.mailVipPersonal = mailVipPersonal;
	}

	public String getIdVipPersonal() {
		return idVipPersonal;
	}

	public void setIdVipPersonal(String idVipPersonal) {
		this.idVipPersonal = idVipPersonal;
	}

	public String getNameVipPersonal() {
		return nameVipPersonal;
	}

	public void setNameVipPersonal(String nameVipPersonal) {
		this.nameVipPersonal = nameVipPersonal;
	}

	public String getLastNameVipPersonal() {
		return lastNameVipPersonal;
	}

	public void setLastNameVipPersonal(String lastNameVipPersonal) {
		this.lastNameVipPersonal = lastNameVipPersonal;
	}

	public String getDocVipPersonal() {
		return docVipPersonal;
	}

	public void setDocVipPersonal(String docVipPersonal) {
		this.docVipPersonal = docVipPersonal;
	}

	public String getPhoneVipPersonal() {
		return phoneVipPersonal;
	}

	public void setPhoneVipPersonal(String phoneVipPersonal) {
		this.phoneVipPersonal = phoneVipPersonal;
	}

	public String getAddressVipPersonal() {
		return addressVipPersonal;
	}

	public void setAddressVipPersonal(String addressVipPersonal) {
		this.addressVipPersonal = addressVipPersonal;
	}

	public String getMailVipPersonal() {
		return mailVipPersonal;
	}

	public void setMailVipPersonal(String mailVipPersonal) {
		this.mailVipPersonal = mailVipPersonal;
	}
	
}
