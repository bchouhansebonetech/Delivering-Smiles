package com.sebone.deliveringsmiles.interfaces;

import java.util.List;


import com.sebone.deliveringsmiles.dataobjects.OrderData;
import com.sebone.deliveringsmiles.dataobjects.OrderStatus;

/*
 * In this interface we declared all the methods related to Order, this interface will contain four methods which are described below.
 * With the help of the following methods we can send notifications to the user, we can assign orders to Driver and so on.
 * 
 * @Author Bhanu Singh
 * @date: 24/03/2022
 */
public interface Order {
	OrderData assignOrder(OrderData orderData);
	List<OrderData> getOrderDetails(int orderId);
	OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId);
	List<OrderData> sendOrderNotification(int driverId, String deliveryStatus);
}
