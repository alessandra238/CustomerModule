package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BusinessCustomer")
public class BusinessCustomer {

	@Id
	private String idBusiness;
	
	private String nameBusiness;
	private String rucBusiness;
	private String phoneBusiness;
	private String mailBusiness;
	private String addressBusiness;
	private Representative representative;
	
	public BusinessCustomer() {
		
	}

	
	public BusinessCustomer(String nameBusiness, String rucBusiness, String phoneBusiness, String mailBusiness,
			String addressBusiness, Representative representative) {
		
		this.nameBusiness = nameBusiness;
		this.rucBusiness = rucBusiness;
		this.phoneBusiness = phoneBusiness;
		this.mailBusiness = mailBusiness;
		this.addressBusiness = addressBusiness;
		this.representative = representative;
	}


	public String getIdBusiness() {
		return idBusiness;
	}

	public void setIdBusiness(String idBusiness) {
		this.idBusiness = idBusiness;
	}

	public String getNameBusiness() {
		return nameBusiness;
	}

	public void setNameBusiness(String nameBusiness) {
		this.nameBusiness = nameBusiness;
	}

	public String getRucBusiness() {
		return rucBusiness;
	}

	public void setRucBusiness(String rucBusiness) {
		this.rucBusiness = rucBusiness;
	}

	public String getPhoneBusiness() {
		return phoneBusiness;
	}

	public void setPhoneBusiness(String phoneBusiness) {
		this.phoneBusiness = phoneBusiness;
	}

	public String getMailBusiness() {
		return mailBusiness;
	}

	public void setMailBusiness(String mailBusiness) {
		this.mailBusiness = mailBusiness;
	}

	public String getAddressBusiness() {
		return addressBusiness;
	}

	public void setAddressBusiness(String addressBusiness) {
		this.addressBusiness = addressBusiness;
	}

	public Representative getRepresentative() {
		return representative;
	}

	public void setRepresentative(Representative representative) {
		this.representative = representative;
	}
		
}
