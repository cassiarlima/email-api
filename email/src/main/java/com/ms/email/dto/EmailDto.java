package com.ms.email.dto;


import javax.validation.constraints.Email;

import javax.validation.constraints.NotNull;



public class EmailDto {
	
	@NotNull
	private String ownerRef;

	@NotNull
	@Email
	private String emailFrom;
	
	@NotNull
	@Email
	private String emailTo;
	
	@NotNull
	private String subject;
	
	@NotNull
	private String text;

	public String getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
