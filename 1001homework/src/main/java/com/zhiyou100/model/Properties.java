package com.zhiyou100.model;

import java.sql.Timestamp;

public class Properties {
	private Integer id;
	private Timestamp gmtCreate;
	private Timestamp gmtModified;
	private Integer status;
	private Double shape;
	private Double tincture;
	private Double purity;
	private Double liquor;
	private Double smell;
	private Double taste;
	private Double leaf;
	private Integer level;

	public Properties() {
		super();
	}

	
	public Properties(Integer id, Timestamp gmtCreate, Timestamp gmtModified, Integer status, Double shape,
			Double tincture, Double purity, Double liquor, Double smell, Double taste, Double leaf, Integer level) {
		super();
		this.id = id;
		this.gmtCreate = gmtCreate;
		this.gmtModified = gmtModified;
		this.status = status;
		this.shape = shape;
		this.tincture = tincture;
		this.purity = purity;
		this.liquor = liquor;
		this.smell = smell;
		this.taste = taste;
		this.leaf = leaf;
		this.level = level;
	}


	@Override
	public String toString() {
		return "Properties [id=" + id + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + ", status="
				+ status + ", shape=" + shape + ", tincture=" + tincture + ", purity=" + purity + ", liquor=" + liquor
				+ ", smell=" + smell + ", taste=" + taste + ", leave=" + leaf + ", level=" + level + "]";
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

	public Double getShape() {
		return shape;
	}

	public void setShape(Double shape) {
		this.shape = shape;
	}

	public Double getTincture() {
		return tincture;
	}

	public void setTincture(Double tincture) {
		this.tincture = tincture;
	}

	public Double getPurity() {
		return purity;
	}

	public void setPurity(Double purity) {
		this.purity = purity;
	}

	public Double getLiquor() {
		return liquor;
	}

	public void setLiquor(Double liquor) {
		this.liquor = liquor;
	}

	public Double getSmell() {
		return smell;
	}

	public void setSmell(Double smell) {
		this.smell = smell;
	}

	public Double getTaste() {
		return taste;
	}

	public void setTaste(Double taste) {
		this.taste = taste;
	}

	public Double getLeave() {
		return leaf;
	}

	public void setLeave(Double leave) {
		this.leaf = leave;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	
}
