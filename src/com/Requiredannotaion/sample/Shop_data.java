package com.Requiredannotaion.sample;

import org.springframework.beans.factory.annotation.Required;

public class Shop_data {
	String s_name;
	int s_code;
	public String getS_name() {
		return s_name;
	}
	@Required
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_code() {
		return s_code;
	}
	@Required
	public void setS_code(int s_code) {
		this.s_code = s_code;
	}
	

}
