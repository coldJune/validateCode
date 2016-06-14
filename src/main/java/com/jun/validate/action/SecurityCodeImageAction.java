package com.jun.validate.action;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.jun.validate.tool.SecurityCode;
import com.jun.validate.tool.SecurityImage;
import com.opensymphony.xwork2.ActionSupport;

public class SecurityCodeImageAction extends ActionSupport implements SessionAware {
	//struts2 Map类型的session
	private Map<String, Object> session;
	//图片流
	private ByteArrayInputStream imageStream;
	
	public ByteArrayInputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(ByteArrayInputStream imageStream) {
		this.imageStream = imageStream;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session=arg0;
	}
	
	public String execute() throws Exception{
		String securityCode = SecurityCode.getSecurityCode();
		imageStream =SecurityImage.getImageAsInputStream(securityCode);
		session.put("securityCode", securityCode);
		return SUCCESS;
	}
}
