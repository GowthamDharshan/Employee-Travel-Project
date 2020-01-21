package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.dao.TravelRequestDAOImpl;
import com.mindgate.pojo.TravelRequestDetails;

@Service
public class TravelRequestServiceImpl implements TravelRequestService
{

	
	public TravelRequestServiceImpl() {
		System.out.println("Travel Request Service object created !! ");
	}
	
	@Autowired
	TravelRequestDAOImpl travelRequestDAO;

	@Override
	public boolean addTravelRequest(TravelRequestDetails requestDetails) {
		
		return travelRequestDAO.addTravelRequest(requestDetails);
	}

	@Override
	public boolean updateTravelRequest(int requestId, TravelRequestDetails requestDetails) {
		
		return travelRequestDAO.updateTravelRequest(requestId, requestDetails);
	}

	@Override
	public boolean deleteTravelRequest(int requestId) {
		
		return travelRequestDAO.deleteTravelRequest(requestId);
	}

	@Override
	public TravelRequestDetails getTravelRequest(int requestId) {
		
		return travelRequestDAO.getTravelRequest(requestId);
	}

	@Override
	public List<TravelRequestDetails> getAllTravelRequest() {
		
		return travelRequestDAO.getAllTravelRequest();
	}
	
	
}
