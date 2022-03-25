package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;


import com.sebone.deliveringsmiles.dataobjects.OrderData;
import com.sebone.deliveringsmiles.dataobjects.OrderStatus;
import com.sebone.deliveringsmiles.interfaces.Order;

/*
 * This is the implementation of Order interface, In this interface we declared all the methods related to Order, this interface will
 * contain four methods which are described below. With the help of the following methods we can send notifications to the user,
 * we can assign orders to Driver and so on.
 * 
 * @author Bhanu Singh
 * Date: 24/03/2022
 * 
 */
public class OrderImpl implements Order{
	/*
	 * In this method we get all the details of the order from the company and we will assign it to a driver whoever is available
	 * for the delivery.
	 * We will get all the order details in OrderData object then we will pass these details along with the driver id to this method then
	 * this will assign the order to that driver.
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param orderData 	object of class OrderData
	 * 
	 * @return orderData 	object of class OrderData
	 * 
	 */
	public OrderData assignOrder(OrderData orderData) {
		return null;
	}
	
	/*
	 *  In this method we will fetch all the details of order data.
	 *  With the help of this method we fetch order details	
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param orderId 
	 * 
	 * @return List<OrderData> 	List of objects of class OrderData
	 * 
	 */
	public List<OrderData> getOrderDetails(int orderId) {
		return null;
	}
	
	/*
	 * with the help of this method we will fetch that the order is accepted or rejected by the driver .
	 * In this method we will pass orderId along with the OrderStatus which will be marked true if the order is accepted and
	 * false if the order is rejected.	
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param orderStatus 	object of class OrderStatus
	 * @param OrderId
	 * 
	 * @return orderStatus 	object of class OrderStatus
	 * 
	 */
	public OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId) {
		return null;
	}
	
	
	/*
	 * With the help of this method we will fetch that the order is accepted or rejected by the driver .
	 * In this method we will pass orderId along with the OrderStatus which will be marked true if the order is accepted and
	 * false if the order is rejected.	
	 * 
	 * @author Bhanu Singh
	 * @date 24/03/2022
	 * 
	 * @param driverId 	
	 * @param deliveryStatus
	 * 
	 * @return List<OrderData> 	List of objects of class OrderData
	 * 
	 */
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus) {
		return null;
	}
}
