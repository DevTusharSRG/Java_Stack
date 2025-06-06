package com.collabfarm.model;


public class UserModel {
    private int id;
    private String name;
    private String email;
    private String role;
    private String password;

    public UserModel(int id, String name, String email, String role, String password) {
        this.id = id; 
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
    public String getPassword() { return password; }

    // Setters
	public void setName(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setRole(String role) { this.role = role; }
    public void setPassword(String password) { this.password = password; }

    // Display user details
    public void displayUser() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Role: " + role);
    }
}

