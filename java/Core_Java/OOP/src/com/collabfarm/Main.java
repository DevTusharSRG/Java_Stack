package com.collabfarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        boolean running = true;

        while (running) {
            System.out.println("\n Collaborative Farming Registration");
            System.out.println("1. Register User");
            System.out.println("2. Display Users");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
					
					System.out.print("Enter id: ");
                    int id = scanner.nextInt();
					scanner.nextLine();
					
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Role (Farmer/Company/Service Provider): ");
                    String role = scanner.nextLine();

                    System.out.print("Enter Password: ");
    
					String password = scanner.nextLine();

                    userService.registerUser(id,name, email, role, password);
                    break;

                case 2:
                    userService.displayUsers();
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
        scanner.close();
    }
}
