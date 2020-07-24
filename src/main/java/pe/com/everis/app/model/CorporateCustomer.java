package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CorporateCustomer")
public class CorporateCustomer {
	
	@Id
	private String idCorporate;
	
	private String nameCorporate;
	private String rucCorporate;
	private String phoneCorporate;
	private String mailCorporate;
	private String addressCorporate;
	private Representative representative;
	
	public CorporateCustomer() {
		
	}
	
	public CorporateCustomer(String nameCorporate, String rucCorporate, String phoneCorporate, String mailCorporate,
			String addressCorporate, Representative representative) {
		
		this.nameCorporate = nameCorporate;
		this.rucCorporate = rucCorporate;
		this.phoneCorporate = phoneCorporate;
		this.mailCorporate = mailCorporate;
		this.addressCorporate = addressCorporate;
		this.representative = representative;
	}
	
	public String getIdCorporate() {
		return idCorporate;
	}
	public void setIdCorporate(String idCorporate) {
		this.idCorporate = idCorporate;
	}
	public String getNameCorporate() {
		return nameCorporate;
	}
	public void setNameCorporate(String nameCorporate) {
		this.nameCorporate = nameCorporate;
	}
	public String getRucCorporate() {
		return rucCorporate;
	}
	public void setRucCorporate(String rucCorporate) {
		this.rucCorporate = rucCorporate;
	}
	public String getPhoneCorporate() {
		return phoneCorporate;
	}
	public void setPhoneCorporate(String phoneCorporate) {
		this.phoneCorporate = phoneCorporate;
	}
	public String getMailCorporate() {
		return mailCorporate;
	}
	public void setMailCorporate(String mailCorporate) {
		this.mailCorporate = mailCorporate;
	}
	public String getAddressCorporate() {
		return addressCorporate;
	}
	public void setAddressCorporate(String addressCorporate) {
		this.addressCorporate = addressCorporate;
	}
	public Representative getRepresentative() {
		return representative;
	}
	public void setRepresentative(Representative representative) {
		this.representative = representative;
	}

}
