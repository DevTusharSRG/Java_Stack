	package com;

	import com.service.ServiceRequestService;
	import com.service.impl.ServiceRequestServiceImpl;
	import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			ServiceRequestService serviceRequestService = new ServiceRequestServiceImpl();
			Scanner scanner = new Scanner(System.in);

			while (true) {
				System.out.println("\n1. View all Services");
				System.out.println("2. Request Service");
				System.out.println("3. View All Service Requests");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();

				switch (choice) {
					case 1:
						serviceRequestService.viewAllServices();
						break;

					 case 2:
						System.out.print("Enter User ID: ");
						int userId = scanner.nextInt();
						System.out.print("Enter Service ID: ");
						int serviceId = scanner.nextInt();
						System.out.print("Enter Property ID: ");
						int propertyId = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter Start Date (YYYY-MM-DD): ");
						String startDate = scanner.nextLine();
						System.out.print("Enter End Date (YYYY-MM-DD): ");
						String endDate = scanner.nextLine();
						System.out.print("Enter Time Duration (Days): ");
						int duration = scanner.nextInt();
						System.out.print("Enter Cost: ");
						double cost = scanner.nextDouble();

						boolean success = serviceRequestService.requestService(userId, serviceId, propertyId, startDate, endDate, duration, cost);
						if (success) {
							System.out.println("Service request submitted successfully.");
						} else {
							System.out.println("Failed to submit service request.");
						}
						break;
					
					case 3:
						System.out.print("Enter User ID: ");
						int userId1 = scanner.nextInt();
						serviceRequestService.viewServiceRequests(userId1);
						break;

					case 4:
						System.out.println("Exiting...");
						scanner.close();
						System.exit(0);
					
					case 5:
						System.out.print("Enter the filters for the nearest location");
						System.out.print("Enter the service Id");
						int serviceId1 = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter State Name");
						String state = scanner.nextLine();
						System.out.print("Enter the District");
						String district = scanner.nextLine();
						System.out.print("Enter the Taluka");
						String taluka = scanner.nextLine();
						System.out.print("Enter the Village");
						String village = scanner.nextLine();
						
						serviceRequestService.getServiceProviderByLocation(serviceId1,state,district,taluka,village);
						break;

					default:
						System.out.println("Invalid choice. Please try again.");
				}
			}
		}
	}
