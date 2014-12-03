package com.domain.POJO;


public class ResponsePOJO {
	
	private String status = "";
	private String error = "";
	private Object content = null;

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ResponsePOJO [status=" + status + ", error=" + error
				+ ", content=" + content + "]";
	}
	
	
}