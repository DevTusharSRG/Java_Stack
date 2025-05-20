package com.addProperty;
import java.util.*;

public class PropertyService{
	
		private List <Property> propertylist = new ArrayList<>();
		
		public void registerProperty(int id,int userId, String location,String landType, String landImage, String landDocument, String acre, String cent, String  date){
			Property property = new Property(id,userId,location,landType,landImage,landDocument,acre,cent,date);
			propertylist.add(property);
			System.out.println("User Register Successfully");
		}
		
		public void displayProperty (){
			if(propertylist.isEmpty()){
				System.out.println("No Property Registered");
			}else{
				System.out.println("Registered Properties");
				for(Property property : propertylist){
					property.displayProperty();
				}
			}
		}
	
}
