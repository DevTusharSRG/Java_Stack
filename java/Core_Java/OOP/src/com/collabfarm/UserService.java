
package com.collabfarm;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList = new ArrayList<>();

    public void registerUser(int id,String name, String email, String role, String password) {
        User user = new User(id,name, email, role, password);
        userList.add(user);
        System.out.println("User registered successfully!\n");
    }

    public void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users registered yet.");
        } else {
            System.out.println("\nRegistered Users:");
            for (User user : userList) {
                user.displayUser();
            }
        }
    }
}