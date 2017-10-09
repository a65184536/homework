package com.zhiyou100.model;

import java.sql.Timestamp;

public class Tea {
	private Integer id;
	private Timestamp gmtCreate;
	private Timestamp gmtModified;
	private Integer status;
	private String name;
	private Integer ticket;
	@Override
	public String toString() {
		return "Tea [id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + ", status=" + status
				+ ", name=" + name + ", ticket=" + ticket + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Timestamp gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Timestamp getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Timestamp gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTicket() {
		return ticket;
	}
	public void setTicket(Integer ticket) {
		this.ticket = ticket;
	}
	
	
}
