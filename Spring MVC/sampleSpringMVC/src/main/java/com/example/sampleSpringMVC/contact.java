package com.example.sampleSpringMVC;

public class contact {
	private String name;
    private String email;
    private String country;
 
    public contact() {
        super();
    }
 
    public contact(String name, String email, String country) {
        super();
        this.setName(name);
        this.setEmail(email);
        this.setCountry(country);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
