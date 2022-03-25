package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.dataobjects.LoginDetails;
import com.sebone.deliveringsmiles.dataobjects.LoginStatus;

/*
 * Registered Driver can login into our application where he/she will be able to see the login page in which he would provide us email
 * and password ,
 * We will collect email and password and validate email and password from our database.
 * 
 * @author Bhanu Singh
 * @date: 24/03/2022
 * 
 */
public interface DriverLogin {
	LoginStatus userAuthentication(String driverEmail , String driverPassword);
	List<LoginDetails> getLoginDetails(int driverId);
}
