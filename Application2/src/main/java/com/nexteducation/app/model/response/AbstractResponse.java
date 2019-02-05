package com.nexteducation.app.model.response;

import java.util.ArrayList;
import java.util.List;

public class AbstractResponse<T> {
	private String success;
	
	private String error;
	
	List<T> responses = new ArrayList<>();

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<T> getResponses() {
		return responses;
	}

	public void setResponses(List<T> responses) {
		this.responses = responses;
	}
	
}
