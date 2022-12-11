package com.mphrx.soapapitut.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphrx.soapapitut.modals.PatientModal;
import com.mphrx.soapapitut.patientxsdpojo.PatientRequest;
import com.mphrx.soapapitut.patientxsdpojo.PatientResponse;
import com.mphrx.soapapitut.repository.PatientRepository;

@Service
public class PatientService {
	
	
	private static final Logger log = LoggerFactory.getLogger(PatientService.class);

	@Autowired
	private PatientRepository patientRepo;
	
	public PatientResponse showData(PatientRequest request)
	{
		PatientModal data = new PatientModal();
		PatientResponse response = new PatientResponse();
		try {
			data = patientRepo.getData(request.getId());
			if(data != null)
			{

				response.setPatientId(data.getId());
				response.setPatientName(data.getName());
				response.setPatientStatus(data.getStatus());
				response.setPatientDeceased(data.getDeceased());
			}
		} catch (Exception e) 
		{
			log.info("Internal Server Error Occured Err: 500 --> {}",e);
		}
		return response;
	}
	

}
