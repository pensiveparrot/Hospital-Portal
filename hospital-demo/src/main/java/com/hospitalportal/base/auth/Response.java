package com.hospitalportal.base.auth;

public class Response {
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String id;
	private String password;
}
