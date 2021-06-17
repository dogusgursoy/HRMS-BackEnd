package ydg.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employers  {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_sites")
	private String webAdress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	public Employers() { }

	public Employers(int id, String companyName, String webAdress, String phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.phoneNumber = phoneNumber;
	}
	
	
}
