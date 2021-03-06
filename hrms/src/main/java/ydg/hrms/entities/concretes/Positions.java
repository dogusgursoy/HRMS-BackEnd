package ydg.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="positions")
public class Positions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;

	public Positions() { }
	
	public Positions(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}
	

}
