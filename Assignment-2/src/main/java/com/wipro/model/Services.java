package com.wipro.model;

public class Services {

	private Long srNo;
	
	private String serviceName;
	
	public Services() {
		super();
	}
	
	public Services(Long srNo, String servicString) {
		super();
		this.srNo = srNo;
		this.serviceName = servicString;
	}

	public Long getSrNo() {
		return srNo;
	}

	public void setSrNo(Long srNo) {
		this.srNo = srNo;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
