package com.traineeapp.model.dao.trainee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee_table")
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String branch;
	private double percentage;
	public Trainee(String name, String branch, double percentage) {
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public Trainee(int id, String name, String branch, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	Trainee(){};
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", branch=" + branch + ", percentage=" + percentage + "]";
	}
	
	
	
}

