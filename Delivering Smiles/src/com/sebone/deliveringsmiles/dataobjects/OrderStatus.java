package com.sebone.deliveringsmiles.dataobjects;


/*
 * This is OrderStatus class, this class contain the information of situation of the any Order.
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class OrderStatus
 */
public class OrderStatus {
	private int orderId;
	private boolean orderStatus;
	private String orderStatusDescription;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
}
