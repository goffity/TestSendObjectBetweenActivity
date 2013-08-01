package com.goffity.demo.test.sendobjectbwtact.object;

import java.io.Serializable;

public class SerializableObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4180844826533644836L;

	private String name;
	private String lastname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
