package com.manan.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.manan.springdemo.mvc.validation.CourseCode;

public class Customer {
	//Predefined Validations being used in this class
	@NotNull(message="First Name cannot be null")
	@Size(min=1,message="Size should be minimum be 1 character")
	private String firstName;
	
	@NotNull(message="Last Name cannot be null")
	@Size(min=1,message="Size should minimum be 1 character")
	private String lastName;
	
	@Min(value=0,message="The minimum number of passes is 0")
	@Max(value=10,message="The maximum number of passes is 10 per customer")
	@NotNull(message="Free Passes is required")
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9]{6}",message="Postal Code is of the length of 6 characters having alphabets and digits")
	private String postalCode;
	
	//Added custom validation based on javax valdation
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
