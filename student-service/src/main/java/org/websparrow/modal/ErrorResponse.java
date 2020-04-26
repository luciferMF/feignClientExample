package org.websparrow.modal;

import java.util.Date;

public class ErrorResponse {

	private String errorMessage;
	private String errorDetails;
	private Date time;
	private String path;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ErrorResponse(String errorMessage, String errorDetails, Date time, String path) {
		super();
		this.errorMessage = errorMessage;
		this.errorDetails = errorDetails;
		this.time = time;
		this.path = path;
	}

}
