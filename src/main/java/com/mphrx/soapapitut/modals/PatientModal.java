package com.mphrx.soapapitut.modals;

import com.mphrx.soapapitut.patientxsdpojo.Status;

public class PatientModal {

	private int Id;
	private String name;
	private Status status;
	private Boolean deceased;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Boolean getDeceased() {
		return deceased;
	}
	public void setDeceased(Boolean deceased) {
		this.deceased = deceased;
	}
	@Override
	public String toString() {
		return "PatientModal [Id=" + Id + ", name=" + name + ", status=" + status + ", deceased=" + deceased + "]";
	}
	/**
	 * @param id
	 * @param name
	 * @param status
	 * @param deceased
	 */
	public PatientModal(int id, String name, Status status, Boolean deceased) {
		Id = id;
		this.name = name;
		this.status = status;
		this.deceased = deceased;
	}
	/**
	 * 
	 */
	public PatientModal() {
		// TODO Auto-generated constructor stub
	}
	
	
}
