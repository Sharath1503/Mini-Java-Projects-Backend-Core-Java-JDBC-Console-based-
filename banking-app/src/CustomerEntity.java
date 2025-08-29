package com.bankappjdbc.ex;

public class CustomerEntity {
	
	int cid;
	String cname;
	long cmob;
	int cage;
	double damt;
	String email;
	String pswd;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCmob() {
		return cmob;
	}
	public void setCmob(long cmob) {
		this.cmob = cmob;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public double getDamt() {
		return damt;
	}
	public void setDamt(double damt) {
		this.damt = damt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "CustomerEntity [cid=" + cid + ", cname=" + cname + ", cmob=" + cmob + ", cage=" + cage + ", damt="
				+ damt + ", email=" + email + ", pswd=" + pswd + "]";
	}
	

}
