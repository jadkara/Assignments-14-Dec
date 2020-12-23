package com.wipro.model;

public class Branch {

	private Long srNo;
	
	private String branchName;
	
	public Branch() {
		super();
	}
	
	public Branch(Long srNo, String branchName) {
		super();
		this.srNo = srNo;
		this.branchName = branchName;
	}

	public Long getSrNo() {
		return srNo;
	}

	public void setSrNo(Long srNo) {
		this.srNo = srNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
}
