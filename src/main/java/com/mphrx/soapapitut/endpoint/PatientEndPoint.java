package com.mphrx.soapapitut.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.mphrx.soapapitut.patientxsdpojo.PatientRequest;
import com.mphrx.soapapitut.patientxsdpojo.PatientResponse;
import com.mphrx.soapapitut.service.PatientService;

@Endpoint
public class PatientEndPoint {
	
	private static final String NAMESPACE = "http://www.mphrx.com/soapapitut/PatientXSDPojo";
	
	@Autowired
	private PatientService service;
	
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "patientRequest")
	@ResponsePayload
	public PatientResponse getPatientResponse(@RequestPayload PatientRequest request)
	{
		System.out.println("I am here");
		return service.showData(request);

	}
}
