package com.sebone.deliveringsmiles.dataobjects;


/*
 * This is LoginStatus class, this class contain the current information of logged in driver in the application.
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class LoginStatus
 */

public class LoginStatus {
	private int loginStatusId;
	private boolean loginStatus;
	private String loginStatusDescription;
	
	
	public int getLoginStatusId() {
		return loginStatusId;
	}
	public void setLoginStatusId(int loginStatusId) {
		this.loginStatusId = loginStatusId;
	}
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getLoginStatusDescription() {
		return loginStatusDescription;
	}
	public void setLoginStatusDescription(String loginStatusDescription) {
		this.loginStatusDescription = loginStatusDescription;
	}
	
	
}
