package com.userregistration;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
	public class ParaTest {
	
	String name;
	String lastName;
	String email;
	String phone;
	String password;
	boolean expectedName;
	boolean expectedLastName;
	boolean expectedPhone;
	boolean expectedEmail;
	boolean expectedPassword;
	
	static UserRegistration userreg;
	
	public ParaTest(String name, String lastName, String email, String phone, String password, boolean expectedName,
			boolean expectedLastName, boolean expectedPhone, boolean expectedEmail, boolean expectedPassword) {
		super();
//		this.name = name;
//		this.lastName = lastName;
//		this.email = email;
//		this.phone = phone;
//		this.password = password;
		this.expectedName = expectedName;
		this.expectedLastName = expectedLastName;
		this.expectedPhone = expectedPhone;
		this.expectedEmail = expectedEmail;
		this.expectedPassword = expectedPassword;
	}


	@Before
		public void initialize() {
		userreg =new UserRegistration();
	}


	@Parameterized.Parameters
		public static Collection inputs() {
		return Arrays.asList(new Object[] [] { {"Name","Lastname","email00@gmail.com","+988888888888", "Pass@123",true, true, true, true} } );
	}
	
	
@Test
	public void userTest() {
	assertEquals(expectedName, userreg.name(name));
	
	
}
	
}



//
