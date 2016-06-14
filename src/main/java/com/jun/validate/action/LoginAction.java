package com.jun.validate.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	//Struts2中的Map类型的session
	private Map<String, Object> session;
	private  String securityCode;
	
	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}
	
	public String login(){
		String serverCode = (String) session.get("securityCode");
		if(!serverCode.equals(securityCode)){
			return ERROR;
		}
		return SUCCESS;
	}

}
