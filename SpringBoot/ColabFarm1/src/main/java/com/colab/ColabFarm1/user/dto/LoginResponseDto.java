package com.colab.ColabFarm1.user.dto;
public class LoginResponseDto{
	
	private String email;
	private String password;
	private String name;

	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMessage(String string) {
		
		
	}

}