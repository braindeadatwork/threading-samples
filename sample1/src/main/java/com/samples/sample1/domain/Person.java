package com.samples.sample1.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", height=" + height
				+ "]";
	}

	private int id;
	private String name;
	private double height;

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
