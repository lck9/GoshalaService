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
@Table(name="Gallery")
public class Gallery {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="url")
	private String url;
	
	@Column(name="create_date_time")
	@CreationTimestamp
	private Date createDateTime;
	
	@Column(name="update_date_time")
	@UpdateTimestamp
	private Date updateDateTime;

	public Gallery(){}
	
	public Gallery(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
	
	
}
