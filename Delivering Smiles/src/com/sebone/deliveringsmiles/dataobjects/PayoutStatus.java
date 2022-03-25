package com.sebone.deliveringsmiles.dataobjects;


/*
 * This is PayoutStatus class, this class contain the current information of any Payout.
 * 
 * @author Bhanu Singh
 * @date 24/03/2022
 * @class PayoutStatus
 */

public class PayoutStatus {
	private int payoutId;
	private boolean payoutStatus;
	private String payoutStatusDescription;
	
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public boolean isPayoutStatus() {
		return payoutStatus;
	}
	public void setPayoutStatus(boolean payoutStatus) {
		this.payoutStatus = payoutStatus;
	}
	public String getPayoutStatusDescription() {
		return payoutStatusDescription;
	}
	public void setPayoutStatusDescription(String payoutStatusDescription) {
		this.payoutStatusDescription = payoutStatusDescription;
	}
}
