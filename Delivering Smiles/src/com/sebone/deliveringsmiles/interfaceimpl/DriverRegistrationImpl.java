package com.sebone.deliveringsmiles.interfaceimpl;

import com.sebone.deliveringsmiles.dataobjects.DriverData;
import com.sebone.deliveringsmiles.dataobjects.DriverStatus;
import com.sebone.deliveringsmiles.interfaces.DriverRegistration;

/*
 * This is the implementation of DriverRegistration interface, Driver can register in our application where he/she will be able to see the
 * registration page in which he would provide us all the information,
 * We will collect all the information and validate the registration.
 * In this interface we will have 3 methods
 * 
 * @author Bhanu Singh
 * Date: 24/03/2022
 * 
 */

public class DriverRegistrationImpl implements DriverRegistration{
	/*
	 * This method will create or register a new user / Driver in application.
	 * First we will take all the information from the User/Driver then we will check that the user is not already registered,
	 * if he/she is not registered then we will create a new user in our application else we will redirect him/her to the user login page
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverData 	object of class DriverData
	 * 
	 * @return driverData 	object of class DriverData
	 * 
	 */
	public DriverData submitDriverData(DriverData driverData) {
		return null;
	}
	
	/*
	 * In this method we will fetch all the driver details, if in case the user wants to perform any type of modifications.
	 * Process - This will fetch all the data from the database by the driverId.
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverId 
	 * 
	 * @return DriverData 	object of class DriverData
	 * 
	 */
	public DriverData getDriverDetails(int driverId) {
		return null;
	}
	
	/*
	 * With the help of this method will update all the changes performed by the user.
	 * After fetching all the changes in DriverData, this method will update the changes.
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverData 	object of class DriverData
	 * 
	 * @return driverStatus 	object of class DriverStatus
	 *  
	 */
	public DriverStatus updateDriverData(DriverData driverData) {
		return null;
	}
}
