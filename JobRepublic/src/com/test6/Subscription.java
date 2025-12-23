package com.test6;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Subscription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static String FREE_TRIAL_SUBSCRIPTION = "A";
	public final static String STARTER_SUBSCRIPTION = "B";
	public final static String FULL_SUBSCRIPTION = "C";

	private Integer id;
	private String subscriptiontype;
	private int customer_number;
	private Date expiry_date;
	
	//private UsageCalculator usageCalculator;

	public Subscription(String subscriptiontype) {

		this.subscriptiontype = subscriptiontype;
		//usageCalculator = UsageCalculator.getInstance();
	}

	public boolean isInChangePeriod() {

		// In the period 90 days before a sub's expiry, a customer can change
		// their subscription
		long daysLeft = getDaysLeftOnSub();
		return (daysLeft >= 0 && daysLeft <= 90);
	}

	public long getDaysLeftOnSub() {

		long millis1 = Calendar.getInstance().getTimeInMillis();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(expiry_date);
		long millis2 = cal2.getTimeInMillis();

		// Calculate difference in days
		return (millis2 - millis1) / (24 * 60 * 60 * 1000);
	}

	public double getCreditValueInPence() {

		long daysLeft = getDaysLeftOnSub();
		if (subscriptiontype.equals(FREE_TRIAL_SUBSCRIPTION)) {
			return daysLeft * 5;
		}

		if (subscriptiontype.equals(STARTER_SUBSCRIPTION)) {
			return daysLeft * 20;
		}

		if (subscriptiontype.equals(FULL_SUBSCRIPTION)) {
			return daysLeft * 40;
		}

		return 0;
	}

	public boolean hasCustomerExceededUsageLimit() {

		return true;//(usageCalculator.getUsageThisPeriod() > 10000);
	}

	/*
	 * 
	 * getters and setters omitted...
	 */

	public String toString() {

		return "Id=" + id + ", subscriptiontype="
				 	 + subscriptiontype
					 + ", customer_number="
					 + customer_number
					 + ", expiry_date="
					 + expiry_date;
	}

	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (o instanceof Subscription) {
			// null o returns false Subscription
			// sub = (Subscription) o;
			// if (this.id.equals(sub.id)) return true;
		}

		return false;

	}

	public int hashCode() {

		return ((subscriptiontype + customer_number).hashCode());
	}
}