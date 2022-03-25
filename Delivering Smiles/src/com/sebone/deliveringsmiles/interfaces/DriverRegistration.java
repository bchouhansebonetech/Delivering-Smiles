package com.sebone.deliveringsmiles.interfaces;

import com.sebone.deliveringsmiles.dataobjects.DriverData;
import com.sebone.deliveringsmiles.dataobjects.DriverStatus;

/*
 * Driver can register in our application where he/she will be able to see the registration page in which he would provide us all the information,
 * We will collect all the information and validate the registration.
 * In this interface we will have 3 methods
 * 
 * @author Bhanu Singh
 * Date: 24/03/2022
 * 
 */
public interface DriverRegistration {
	DriverData submitDriverData(DriverData driverData);
	DriverData getDriverDetails(int driverId);
	DriverStatus updateDriverData(DriverData driverData);
}
