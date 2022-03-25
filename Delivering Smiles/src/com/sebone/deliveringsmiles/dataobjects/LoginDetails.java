package com.sebone.deliveringsmiles.dataobjects;

/*
 * This is LoginDetails class, this class contain the information regarding to driver login and logout in the application.
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class LoginDetails
 */
public class LoginDetails {
	private int loginId;
	private String loginTime;
	private String logoutTime;
	private String loginPassword;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(String logoutTime) {
		this.logoutTime = logoutTime;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	
}
