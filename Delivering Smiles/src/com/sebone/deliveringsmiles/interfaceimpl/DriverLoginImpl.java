package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.dataobjects.LoginDetails;
import com.sebone.deliveringsmiles.dataobjects.LoginStatus;
import com.sebone.deliveringsmiles.interfaces.DriverLogin;


/*
 * This is the implementation of DriverLogin interface, Registered Driver can login into our application where he/she will be
 * able to see the login page in which he would provide us email
 * and password ,
 * We will collect email and password and validate email and password from our database.
 * 
 * @author Bhanu Singh
 * @date: 24/03/2022
 * 
 */
public class DriverLoginImpl implements DriverLogin{
	
	/*
	 * This method will authenticate the user/Driver that he/she is already registered or not, if he/she is already registered then he
	 * will be able to login otherwise he will be redirected to the registration page 
	 * First we will take email and password from the User/Driver, then we will check that the user is already registered or not,
	 * if he/she is not registered then we will redirect him to the registration page else we will make him login and update the login time
	 * and date in our database.

	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverEmail 
	 * @param driverPassword 	
	 * 
	 * @return loginStatus 	object of class LoginStatus
	 * 
	 */
	public LoginStatus userAuthentication(String driverEmail , String driverPassword) {
		return null;
	}
	
	
	/*
	 * In this method we will fetch all the login details of the user/Driver like login time and date and logout date and time ,
	 * driver Status.
	 * In this method we will fetch and show user Activity,

	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverId  	
	 * 
	 * @return List<LoginDetails> 	List of objects of class LoginDetails
	 * 
	 */
	public List<LoginDetails> getLoginDetails(int driverId) {
		return null;
	}
}
