package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String messege;

	public HelloWorldBean(String messege) {
		this.messege = messege;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}
	
	@Override
	public String toString() {
		return "HelloWorldBean [messege=" + messege + "]";
	}

}
