package com.addProperty;

import java.util.*;
public class Property{

		private int id;
		private int userId;
		private String location;
		private String landType;
		private String landImage;
		private String landDocument;
		private String acre;
		private String cent;
		private String date;
	
	public Property(int id,int userId,String location,String landType,String landImage,String landDocument,String acre, String cent, String date){
		this.id=id;
		this.userId=userId;
		this.location=location;
		this.landType=landType;
		this.landImage=landImage;
		this.landDocument=landDocument;
		this.acre=acre;
		this.cent=cent;
		this.date=date;
	}
	public class Land {
    private int id;
    private int userId;
    private String location;
    private String landType;
    private String landImage;
    private String landDocument;
    private String acre;
    private String cent;
    private String date;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getLandType() {
        return landType;
    }
    public void setLandType(String landType) {
        this.landType = landType;
    }

    public String getLandImage() {
        return landImage;
    }
    public void setLandImage(String landImage) {
        this.landImage = landImage;
    }

    public String getLandDocument() {
        return landDocument;
    }
    public void setLandDocument(String landDocument) {
        this.landDocument = landDocument;
    }

    public String getAcre() {
        return acre;
    }
    public void setAcre(String acre) {
        this.acre = acre;
    }

    public String getCent() {
        return cent;
    }
    public void setCent(String cent) {
        this.cent = cent;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}

	
	public void displayProperty(){
		System.out.println("Property Id :"+id+" USer Id : "+userId+" Location : "+location+" Area : "+ acre);
	}
}