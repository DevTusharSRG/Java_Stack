package com.addProperty;
import java.util.*;

public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		PropertyService properetyService = new PropertyService();
		boolean isRunning = true ;
		
		while(isRunning){
			System.out.println("\n Add your Property");
			System.out.println("1) Register your property");
			System.out.println("2) View Properties");
			System.out.println("3) Exit");
			
			System.out.println("Enter Your choice");
			int ch = sc.nextInt();
			
			switch (ch){
					case 1:
					System.out.println("Enter Property ID");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter User ID");
					int userId = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter Property Location");
					String location = sc.nextLine();
					
					System.out.println("Enter Property Land Type {Irrigated Land, Rainfed Land}");
					String landType = sc.nextLine();
					
					System.out.println("Enter Property Land Image");
					String landImage = sc.nextLine();
					
					System.out.println("Enter Property Land Document");
					String landDocument = sc.nextLine();
					
					System.out.println("Enter Property Area in Acre");
					String acre = sc.nextLine();
					
					System.out.println("Enter Property Area in Cent");
					String cent = sc.nextLine();
					
					System.out.println("Enter Property Register Date");
					String date = sc.nextLine();
					
					properetyService.registerProperty(id,userId,location,landType,landImage,landDocument,acre,cent,date);
					break;
					
					case 2 :
					properetyService.displayProperty();
					break;
					
					case 3:
					isRunning=false;
					break;
					
					default:
					System.out.println("Please choose the correct option");
					
			}
		}
	}
}

