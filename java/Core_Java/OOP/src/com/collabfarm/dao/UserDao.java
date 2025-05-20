
package com.collabfarm.dao;

import com.collabfarm.model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<UserModel> userList = new ArrayList<>();

    public void registerUser(int id,String name, String email, String role, String password) {
        UserModel user = new UserModel(id,name, email, role, password);
        userList.add(user);
        System.out.println("User registered successfully!\n");
    }

    public void displayUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users registered yet.");
        } else {
            System.out.println("\nRegistered Users:");
            for (UserModel user : userList) {
                user.displayUser();
            }
        }
    }
}