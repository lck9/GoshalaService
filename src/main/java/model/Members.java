package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Members")
public class Members {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="number")
	private Long number;
	
	@Column(name="url")
	private String url;
	
	@Column(name="type")
	private String type;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="create_date_time")
	@CreationTimestamp
	private Date createDateTime;
	
	@Column(name="update_date_time")
	@UpdateTimestamp
	private Date updateDateTime;

	public Members(){}
	
	public Members(String name, Long number, String type, String designation, String url) {
		super();
		this.url = url;
		this.name = name;
		this.number = number;
		this.type = type;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
