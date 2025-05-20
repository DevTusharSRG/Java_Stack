package com.dao;

import java.util.List;
import java.util.Map;

public interface ServiceRequestDao {
    boolean insertServiceRequest(int userId, int serviceId, int propertyId, String startDate, String endDate, int timeDuration, double cost);
    List<Map<String, Object>> getAllServiceRequests(int userId);
	public List<Map<String, Object>> getAllServices();
	List<Map<String, Object>> getServiceProviderByLocation(int serviceId, String state, String district, String taluka, String village);
	List<Map<String, Object>> getAllServiceProviders();
}
