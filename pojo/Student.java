package com.briup.pojo;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id; // ѧ��
	private String name; // ����
	private double score; // ����
	private String gender; // �Ա�
	public Student() {
	}
	public Student(String id, String name, double score, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
