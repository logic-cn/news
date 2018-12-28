package com.news.pojo;

import java.io.Serializable;
import java.sql.Date;

public class News implements Serializable{

	private int id;
	private int category_id;
	private String  title;
	private String  content;
	private int state;
	private Date create_date;
	private Date update_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", category_id=" + category_id + ", title=" + title + ", content=" + content
				+ ", state=" + state + ", create_date=" + create_date + ", update_date=" + update_date + "]";
	}
	
	
	
	
}
