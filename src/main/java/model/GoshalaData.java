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

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="GoshalaData")
public class GoshalaData{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="page")
	private String page;	
	
	@Column(name="text",columnDefinition="TEXT")
	private String text;
	
	@Column(name="url")
	private String url;
		
	@Column(name="create_date_time")
	@CreationTimestamp
	private Date createDateTime;
	
	@Column(name="update_date_time")
	@UpdateTimestamp
	private Date updateDateTime;

	public GoshalaData(){}
	
	public GoshalaData(String page, String text, String url) {
		super();
		this.url = url;
		this.page = page;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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