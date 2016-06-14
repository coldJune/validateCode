package com.jun.SercurityCodeImage;

import com.jun.validate.action.SecurityCodeImageAction;
import com.jun.validate.tool.*;

import junit.framework.TestCase;

public class SercurityCodeImageTest extends TestCase{
	public SercurityCodeImageTest(String test){
		super(test);
	}
	
	public void testSercurityCodeImage(){
		//SecurityImage securityImage = new SecurityImage();
		String securityCode = SecurityCode.getSecurityCode();
		System.out.println(securityCode);
		System.out.println(1111);
		
		
	}
}
