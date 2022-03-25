package com.sebone.deliveringsmiles.dataobjects;


/*
 * This is DriverStatus class, this class contain the information of current situation of the driver.
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class DriverStatus
 */
public class DriverStatus {
	private int driverId;
	private boolean driverStatus;
	private String driverStatusDescription;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public boolean isDriverStatus() {
		return driverStatus;
	}
	public void setDriverStatus(boolean driverStatus) {
		this.driverStatus = driverStatus;
	}
	public String getDriverStatusDescription() {
		return driverStatusDescription;
	}
	public void setDriverStatusDescription(String driverStatusDescription) {
		this.driverStatusDescription = driverStatusDescription;
	}
	
	
}
