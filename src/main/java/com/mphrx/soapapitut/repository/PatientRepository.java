package com.mphrx.soapapitut.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.mphrx.soapapitut.modals.PatientModal;
import com.mphrx.soapapitut.patientxsdpojo.Status;


@Component
public class PatientRepository {

	private static final Map<Integer,PatientModal> patients = new HashMap<>();
	
	@PostConstruct  
	public void initData()
	{
		PatientModal patient = new PatientModal();
		patient.setId(125);
		patient.setName("Akhilesh Pratap Shahi");
		patient.setStatus(Status.ACTIVE);
		patient.setDeceased(false);
		patients.put(patient.getId(), patient);
		PatientModal patient1 = new PatientModal();
		patient1.setId(126);
		patient1.setName("Raaj Singhania");
		patient1.setStatus(Status.INACTIVE);
		patient1.setDeceased(true);
		patients.put(patient1.getId(), patient1);
		PatientModal patient2 = new PatientModal();
		patient2.setId(127);
		patient2.setName("Pater Parkar");
		patient2.setStatus(Status.ACTIVE);
		patient2.setDeceased(false);
		patients.put(patient2.getId(), patient2);
		PatientModal patient3 = new PatientModal();
		patient3.setId(128);
		patient3.setName("Tony Stark");
		patient3.setStatus(Status.INACTIVE);
		patient3.setDeceased(true);
		patients.put(patient3.getId(), patient3);
		PatientModal patient4 = new PatientModal();
		patient4.setId(129);
		patient4.setName("Elizbeth Olsen");
		patient4.setStatus(Status.ACTIVE);
		patient4.setDeceased(false);
		patients.put(patient4.getId(), patient4);
		PatientModal patient5 = new PatientModal();
		patient5.setId(130);
		patient5.setName("Mary Jane Watson");
		patient5.setStatus(Status.INACTIVE);
		patient5.setDeceased(true);
		patients.put(patient5.getId(), patient5);
		PatientModal patient6 = new PatientModal();
		patient6.setId(131);
		patient6.setName("Steve Roger");
		patient6.setStatus(Status.ACTIVE);
		patient6.setDeceased(false);
		patients.put(patient6.getId(), patient6);
	}
	
	
	public PatientModal getData(int id)
	{
		return patients.get(id);
	}
	
}
