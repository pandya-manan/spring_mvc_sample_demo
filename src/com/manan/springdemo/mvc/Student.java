package com.manan.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favoriteLanguage;
	
	private List<String> operatingSystem=new ArrayList<>();
	
	public List<String> getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(List<String> operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	private LinkedHashMap<String,String> countryOptions;

	private LinkedHashMap<String,String> favoriteLanguages;
	
	
	
	

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		//populate country options
		countryOptions=new LinkedHashMap<>();
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("DEU", "Germany");
		countryOptions.put("IND", "India");
		countryOptions.put("BAN", "Bangladesh");
		countryOptions.put("ESP", "Spain");
		countryOptions.put("USA", "United States Of America");
		countryOptions.put("POR", "Portugal");
		
		favoriteLanguages=new LinkedHashMap<>();
		favoriteLanguages.put("Java", "Java");
		favoriteLanguages.put("C++", "C++");
		favoriteLanguages.put("C", "C");
		favoriteLanguages.put("Python", "Python");
		favoriteLanguages.put("C#", "C#");
		favoriteLanguages.put("SQL", "SQL");
		
		
	}

	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return favoriteLanguages;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
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
