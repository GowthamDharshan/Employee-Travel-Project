package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.pojo.TravelRequestDetails;
import com.mindgate.service.TravelRequestServiceImpl;
@CrossOrigin(value="*")
@RestController
@RequestMapping("/request")
public class TravelRequestController {

	public TravelRequestController() {
		System.out.println("EmployeeController object is created !!");
	}

	@Autowired
	TravelRequestServiceImpl travelRequestService;
	
	
	@RequestMapping(value="/",method = RequestMethod.POST)
	public boolean addTravelRequest(@RequestBody TravelRequestDetails requestDetails) {
		
		return travelRequestService.addTravelRequest(requestDetails);
	}
	@RequestMapping(value="/{requestId}",method = RequestMethod.PUT)
	public boolean updateTravelRequest(@PathVariable("requestId") int requestId, @RequestBody TravelRequestDetails requestDetails) {
		
		return travelRequestService.updateTravelRequest(requestId, requestDetails);
	}
	@RequestMapping(value="/{requestId}",method = RequestMethod.DELETE)
	public boolean deleteTravelRequest(@PathVariable("requestId") int requestId) {
		
		return travelRequestService.deleteTravelRequest(requestId);
	}
	@RequestMapping(value="/{requestId}",method = RequestMethod.GET)
	public TravelRequestDetails getTravelRequest(@PathVariable("requestId") int requestId) {
		
		return travelRequestService.getTravelRequest(requestId);
	}
	@RequestMapping(value="/getAll",method = RequestMethod.GET)
	public List<TravelRequestDetails> getAllTravelRequest() {
		
		return travelRequestService.getAllTravelRequest();
	}
}
	