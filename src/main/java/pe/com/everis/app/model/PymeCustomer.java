package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PymeCustomer")
public class PymeCustomer {
	
	@Id
	private String idPyme;
	
	private String namePyme;
	private String docPyme;
	private String phonePyme;
	private String mailPyme;
	private String addressPyme;
	private Representative representative;
	
	public PymeCustomer() {
		
	}
	
	public PymeCustomer(String namePyme, String docPyme, String phonePyme, String mailPyme, String addressPyme,
			Representative representative) {
		
		this.namePyme = namePyme;
		this.docPyme = docPyme;
		this.phonePyme = phonePyme;
		this.mailPyme = mailPyme;
		this.addressPyme = addressPyme;
		this.representative = representative;
	}
	
	public String getIdPyme() {
		return idPyme;
	}
	public void setIdPyme(String idPyme) {
		this.idPyme = idPyme;
	}
	public String getNamePyme() {
		return namePyme;
	}
	public void setNamePyme(String namePyme) {
		this.namePyme = namePyme;
	}
	public String getDocPyme() {
		return docPyme;
	}
	public void setDocPyme(String docPyme) {
		this.docPyme = docPyme;
	}
	public String getPhonePyme() {
		return phonePyme;
	}
	public void setPhonePyme(String phonePyme) {
		this.phonePyme = phonePyme;
	}
	public String getMailPyme() {
		return mailPyme;
	}
	public void setMailPyme(String mailPyme) {
		this.mailPyme = mailPyme;
	}
	public String getAddressPyme() {
		return addressPyme;
	}
	public void setAddressPyme(String addressPyme) {
		this.addressPyme = addressPyme;
	}
	public Representative getRepresentative() {
		return representative;
	}
	public void setRepresentative(Representative representative) {
		this.representative = representative;
	}

}
