//
// COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy, 
// modify, and distribute these sample programs in any form without payment to IBM for the purposes of 
// developing, using, marketing or distributing application programs conforming to the application 
// programming interface for the operating platform for which the sample code is written. 
// Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS 
// AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED 
// WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE, 
// TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT, 
// INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE 
// SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS 
// OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.  
//
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
//
package com.ibm.websphere.samples.pbw.war;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ibm.websphere.samples.pbw.jpa.Order;
import com.ibm.websphere.samples.pbw.utils.Util;

/**
 * A class to hold an order's data.
 */
public class OrderInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String orderID;
	@NotNull
	@Size(min = 1, message = "Name for billing must include at least one letter.")
	private String billName;
	@NotNull
	@Size(min = 1, message = "Billing address must include at least one letter.")
	private String billAddr1;
	private String billAddr2;
	@NotNull
	@Size(min = 1, message = "Billing city must include at least one letter.")
	private String billCity;
	@NotNull
	@Size(min = 1, message = "Billing state must include at least one letter.")
	private String billState;

	@Pattern(regexp = "\\d{5}", message = "Billing zip code does not have 5 digits.")
	private String billZip;

	@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Billing phone number does not match xxx-xxx-xxxx.")
	private String billPhone;
	@NotNull
	@Size(min = 1, message = "Name for shipping must include at least one letter.")
	private String shipName;
	@NotNull
	@Size(min = 1, message = "Shipping address must include at least one letter.")
	private String shipAddr1;
	private String shipAddr2;
	@NotNull
	@Size(min = 1, message = "Shipping city must include at least one letter.")
	private String shipCity;
	@NotNull
	@Size(min = 1, message = "Shipping state must include at least one letter.")
	private String shipState;

	@Pattern(regexp = "[0-9][0-9][0-9][0-9][0-9]", message = "Shipping zip code does not have 5 digits.")
	private String shipZip;

	@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Shipping phone number does not match xxx-xxx-xxxx.")
	private String shipPhone;
	private int shippingMethod;
	@NotNull
	@Size(min = 1, message = "Card holder name must include at least one letter.")
	private String cardholderName;
	private String cardName;

	@Pattern(regexp = "\\d{4} \\d{4} \\d{4} \\d{4}", message = "Credit card numbers must be entered as XXXX XXXX XXXX XXXX.")
	private String cardNum;
	private String cardExpMonth;
	private String cardExpYear;
	private String[] cardExpYears;
	private boolean shipisbill = false;

	/**
	 * Constructor to create an OrderInfo by passing each field.
	 */
	public OrderInfo(String billName, String billAddr1, String billAddr2, String billCity, String billState,
			String billZip, String billPhone, String shipName, String shipAddr1, String shipAddr2, String shipCity,
			String shipState, String shipZip, String shipPhone, int shippingMethod, String orderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::OrderInfo(String, String, String, String, String, String, String, String, String, String, String, String, String, String, int, String)|");

		this.orderID = orderID;
		this.billName = billName;
		this.billAddr1 = billAddr1;
		this.billAddr2 = billAddr2;
		this.billCity = billCity;
		this.billState = billState;
		this.billZip = billZip;
		this.billPhone = billPhone;
		this.shipName = shipName;
		this.shipAddr1 = shipAddr1;
		this.shipAddr2 = shipAddr2;
		this.shipCity = shipCity;
		this.shipState = shipState;
		this.shipZip = shipZip;
		this.shipPhone = shipPhone;
		this.shippingMethod = shippingMethod;
		initLists();
		cardholderName = "";
		cardNum = "";
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::OrderInfo(String, String, String, String, String, String, String, String, String, String, String, String, String, String, int, String)|");
}
}

	/**
	 * Constructor to create an OrderInfo using an Order.
	 * 
	 * @param order
	 */
	public OrderInfo(Order order) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::OrderInfo(Order)|");

		orderID = order.getOrderID();
		billName = order.getBillName();
		billAddr1 = order.getBillAddr1();
		billAddr2 = order.getBillAddr2();
		billCity = order.getBillCity();
		billState = order.getBillState();
		billZip = order.getBillZip();
		billPhone = order.getBillPhone();
		shipName = order.getShipName();
		shipAddr1 = order.getShipAddr1();
		shipAddr2 = order.getShipAddr2();
		shipCity = order.getShipCity();
		shipState = order.getShipState();
		shipZip = order.getShipZip();
		shipPhone = order.getShipPhone();
		shippingMethod = order.getShippingMethod();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::OrderInfo(Order)|");
}
}

	/**
	 * Get the shipping method name.
	 */
	public String getShippingMethodName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethodName()|");

		return getShippingMethods()[shippingMethod];
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethodName()|");
}
}

	/**
	 * Set the shipping method by name
	 */
	public void setShippingMethodName(String name) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShippingMethodName(String)|");

		String[] methodNames = Util.getShippingMethodStrings();
		for (int i = 0; i < methodNames.length; i++) {
			if (methodNames[i].equals(name))
				shippingMethod = i;
		}
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShippingMethodName(String)|");
}
}

	/**
	 * Get shipping methods that are possible.
	 * 
	 * @return String[] of method names
	 */
	public String[] getShippingMethods() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethods()|");

		return Util.getFullShippingMethodStrings();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethods()|");
}
}

	public int getShippingMethodCount() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethodCount()|");

		return Util.getShippingMethodStrings().length;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethodCount()|");
}
}

	private void initLists() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::initLists()|");

		int i = Calendar.getInstance().get(1);
		cardExpYears = new String[5];
		for (int j = 0; j < 5; j++)
			cardExpYears[j] = (new Integer(i + j)).toString();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::initLists()|");
}
}

	/**
	 * @return the orderID
	 */
	public String getID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getID()|");

		return orderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getID()|");
}
}

	/**
	 * @param orderID
	 *            the orderID to set
	 */
	public void setID(String orderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setID(String)|");

		this.orderID = orderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setID(String)|");
}
}

	/**
	 * @return the billName
	 */
	public String getBillName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillName()|");

		return billName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillName()|");
}
}

	/**
	 * @param billName
	 *            the billName to set
	 */
	public void setBillName(String billName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillName(String)|");

		this.billName = billName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillName(String)|");
}
}

	/**
	 * @return the billAddr1
	 */
	public String getBillAddr1() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillAddr1()|");

		return billAddr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillAddr1()|");
}
}

	/**
	 * @param billAddr1
	 *            the billAddr1 to set
	 */
	public void setBillAddr1(String billAddr1) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillAddr1(String)|");

		this.billAddr1 = billAddr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillAddr1(String)|");
}
}

	/**
	 * @return the billAddr2
	 */
	public String getBillAddr2() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillAddr2()|");

		return billAddr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillAddr2()|");
}
}

	/**
	 * @param billAddr2
	 *            the billAddr2 to set
	 */
	public void setBillAddr2(String billAddr2) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillAddr2(String)|");

		this.billAddr2 = billAddr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillAddr2(String)|");
}
}

	/**
	 * @return the billCity
	 */
	public String getBillCity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillCity()|");

		return billCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillCity()|");
}
}

	/**
	 * @param billCity
	 *            the billCity to set
	 */
	public void setBillCity(String billCity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillCity(String)|");

		this.billCity = billCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillCity(String)|");
}
}

	/**
	 * @return the billState
	 */
	public String getBillState() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillState()|");

		return billState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillState()|");
}
}

	/**
	 * @param billState
	 *            the billState to set
	 */
	public void setBillState(String billState) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillState(String)|");

		this.billState = billState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillState(String)|");
}
}

	/**
	 * @return the billZip
	 */
	public String getBillZip() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillZip()|");

		return billZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillZip()|");
}
}

	/**
	 * @param billZip
	 *            the billZip to set
	 */
	public void setBillZip(String billZip) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillZip(String)|");

		this.billZip = billZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillZip(String)|");
}
}

	/**
	 * @return the billPhone
	 */
	public String getBillPhone() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillPhone()|");

		return billPhone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getBillPhone()|");
}
}

	/**
	 * @param billPhone
	 *            the billPhone to set
	 */
	public void setBillPhone(String billPhone) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillPhone(String)|");

		this.billPhone = billPhone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setBillPhone(String)|");
}
}

	/**
	 * @return the shipName
	 */
	public String getShipName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipName()|");

		return shipName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipName()|");
}
}

	/**
	 * @param shipName
	 *            the shipName to set
	 */
	public void setShipName(String shipName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipName(String)|");

		this.shipName = shipName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipName(String)|");
}
}

	/**
	 * @return the shipAddr1
	 */
	public String getShipAddr1() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipAddr1()|");

		return shipAddr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipAddr1()|");
}
}

	/**
	 * @param shipAddr1
	 *            the shipAddr1 to set
	 */
	public void setShipAddr1(String shipAddr1) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipAddr1(String)|");

		this.shipAddr1 = shipAddr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipAddr1(String)|");
}
}

	/**
	 * @return the shipAddr2
	 */
	public String getShipAddr2() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipAddr2()|");

		return shipAddr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipAddr2()|");
}
}

	/**
	 * @param shipAddr2
	 *            the shipAddr2 to set
	 */
	public void setShipAddr2(String shipAddr2) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipAddr2(String)|");

		this.shipAddr2 = shipAddr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipAddr2(String)|");
}
}

	/**
	 * @return the shipCity
	 */
	public String getShipCity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipCity()|");

		return shipCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipCity()|");
}
}

	/**
	 * @param shipCity
	 *            the shipCity to set
	 */
	public void setShipCity(String shipCity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipCity(String)|");

		this.shipCity = shipCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipCity(String)|");
}
}

	/**
	 * @return the shipState
	 */
	public String getShipState() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipState()|");

		return shipState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipState()|");
}
}

	/**
	 * @param shipState
	 *            the shipState to set
	 */
	public void setShipState(String shipState) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipState(String)|");

		this.shipState = shipState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipState(String)|");
}
}

	/**
	 * @return the shipZip
	 */
	public String getShipZip() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipZip()|");

		return shipZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipZip()|");
}
}

	/**
	 * @param shipZip
	 *            the shipZip to set
	 */
	public void setShipZip(String shipZip) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipZip(String)|");

		this.shipZip = shipZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipZip(String)|");
}
}

	/**
	 * @return the shipPhone
	 */
	public String getShipPhone() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipPhone()|");

		return shipPhone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShipPhone()|");
}
}

	/**
	 * @param shipPhone
	 *            the shipPhone to set
	 */
	public void setShipPhone(String shipPhone) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipPhone(String)|");

		this.shipPhone = shipPhone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipPhone(String)|");
}
}

	/**
	 * @return the shippingMethod
	 */
	public int getShippingMethod() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethod()|");

		return shippingMethod;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getShippingMethod()|");
}
}

	/**
	 * @param shippingMethod
	 *            the shippingMethod to set
	 */
	public void setShippingMethod(int shippingMethod) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShippingMethod(int)|");

		this.shippingMethod = shippingMethod;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShippingMethod(int)|");
}
}

	/**
	 * @return the cardholderName
	 */
	public String getCardholderName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardholderName()|");

		return cardholderName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardholderName()|");
}
}

	/**
	 * @param cardholderName
	 *            the cardholderName to set
	 */
	public void setCardholderName(String cardholderName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardholderName(String)|");

		this.cardholderName = cardholderName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardholderName(String)|");
}
}

	/**
	 * @return the cardName
	 */
	public String getCardName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardName()|");

		return cardName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardName()|");
}
}

	/**
	 * @param cardName
	 *            the cardName to set
	 */
	public void setCardName(String cardName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardName(String)|");

		this.cardName = cardName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardName(String)|");
}
}

	/**
	 * @return the cardNum
	 */
	public String getCardNum() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardNum()|");

		return cardNum;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardNum()|");
}
}

	/**
	 * @param cardNum
	 *            the cardNum to set
	 */
	public void setCardNum(String cardNum) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardNum(String)|");

		this.cardNum = cardNum;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardNum(String)|");
}
}

	/**
	 * @return the cardExpMonth
	 */
	public String getCardExpMonth() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpMonth()|");

		return cardExpMonth;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpMonth()|");
}
}

	/**
	 * @param cardExpMonth
	 *            the cardExpMonth to set
	 */
	public void setCardExpMonth(String cardExpMonth) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpMonth(String)|");

		this.cardExpMonth = cardExpMonth;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpMonth(String)|");
}
}

	/**
	 * @return the cardExpYear
	 */
	public String getCardExpYear() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpYear()|");

		return cardExpYear;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpYear()|");
}
}

	/**
	 * @param cardExpYear
	 *            the cardExpYear to set
	 */
	public void setCardExpYear(String cardExpYear) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpYear(String)|");

		this.cardExpYear = cardExpYear;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpYear(String)|");
}
}

	/**
	 * @return the cardExpYears
	 */
	public String[] getCardExpYears() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpYears()|");

		return cardExpYears;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::getCardExpYears()|");
}
}

	/**
	 * @param cardExpYears
	 *            the cardExpYears to set
	 */
	public void setCardExpYears(String[] cardExpYears) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpYears(String[])|");

		this.cardExpYears = cardExpYears;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setCardExpYears(String[])|");
}
}

	/**
	 * @return the shipisbill
	 */
	public boolean isShipisbill() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::isShipisbill()|");

		return shipisbill;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::isShipisbill()|");
}
}

	/**
	 * @param shipisbill
	 *            the shipisbill to set
	 */
	public void setShipisbill(boolean shipisbill) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipisbill(boolean)|");

		this.shipisbill = shipisbill;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/OrderInfo.java::com.ibm.websphere.samples.pbw.war.OrderInfo::setShipisbill(boolean)|");
}
}

}
