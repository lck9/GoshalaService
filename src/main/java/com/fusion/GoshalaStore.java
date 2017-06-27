package com.fusion;

public class GoshalaStore{
	
	private int id;
	private String page;	
	private String text;
	private String url;
	private String createDateTime;
	private String updateDateTime;

	public GoshalaStore(){}
	
	public GoshalaStore(String page, String text, String url) {
		this.url = url;
		this.page = page;
		this.text = text;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public String getUpdateDateTime() {
		return updateDateTime;
	}

		
}