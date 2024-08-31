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
// (C) COPYRIGHT International Business Machines Corp., 2003,2011
// All Rights Reserved * Licensed Materials - Property of IBM
//
package com.ibm.websphere.samples.pbw.war;

import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;
import com.ibm.websphere.samples.pbw.utils.Util;

/**
 * A class to hold a back order item's data.
 */
public class BackOrderItem implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int inventoryQuantity;
	private String backOrderID; // from BackOrder
	private int quantity; // from BackOrder
	private String status; // from BackOrder
	private long lowDate; // from BackOrder
	private long orderDate; // from BackOrder
	private String supplierOrderID; // from BackOrder
	private Inventory inventory; // from BackOrder

	/**
	 * @see java.lang.Object#Object()
	 */
	/** Default constructor. */
	public BackOrderItem() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem()|");
}
}

	/**
	 * Method BackOrderItem.
	 * 
	 * @param backOrderID
	 * @param inventoryID
	 * @param name
	 * @param quantity
	 * @param status
	 */
	public BackOrderItem(String backOrderID, Inventory inventoryID, String name, int quantity, String status) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem(String, Inventory, String, int, String)|");

		this.backOrderID = backOrderID;
		this.inventory = inventoryID;
		this.name = name;
		this.quantity = quantity;
		this.status = status;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem(String, Inventory, String, int, String)|");
}
}

	/**
	 * Method BackOrderItem.
	 * 
	 * @param backOrder
	 */
	public BackOrderItem(BackOrder backOrder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem(BackOrder)|");

		try {
			this.backOrderID = backOrder.getBackOrderID();
			this.inventory = backOrder.getInventory();
			this.quantity = backOrder.getQuantity();
			this.status = backOrder.getStatus();
			this.lowDate = backOrder.getLowDate();
			this.orderDate = backOrder.getOrderDate();
			this.supplierOrderID = backOrder.getSupplierOrderID();
		} catch (Exception e) {
			Util.debug("BackOrderItem - Exception: " + e);
		}
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::BackOrderItem(BackOrder)|");
}
}

	/**
	 * Method getBackOrderID.
	 * 
	 * @return String
	 */
	public String getBackOrderID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getBackOrderID()|");

		return backOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getBackOrderID()|");
}
}

	/**
	 * Method setBackOrderID.
	 * 
	 * @param backOrderID
	 */
	public void setBackOrderID(String backOrderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setBackOrderID(String)|");

		this.backOrderID = backOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setBackOrderID(String)|");
}
}

	/**
	 * Method getSupplierOrderID.
	 * 
	 * @return String
	 */
	public String getSupplierOrderID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getSupplierOrderID()|");

		return supplierOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getSupplierOrderID()|");
}
}

	/**
	 * Method setSupplierOrderID.
	 * 
	 * @param supplierOrderID
	 */
	public void setSupplierOrderID(String supplierOrderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setSupplierOrderID(String)|");

		this.supplierOrderID = supplierOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setSupplierOrderID(String)|");
}
}

	/**
	 * Method setQuantity.
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setQuantity(int)|");

		this.quantity = quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setQuantity(int)|");
}
}

	/**
	 * Method getInventoryID.
	 * 
	 * @return String
	 */
	public Inventory getInventory() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getInventory()|");

		return inventory;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getInventory()|");
}
}

	/**
	 * Method getName.
	 * 
	 * @return String
	 */
	public String getName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getName()|");

		return name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getName()|");
}
}

	/**
	 * Method setName.
	 * 
	 * @param name
	 */
	public void setName(String name) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setName(String)|");

		this.name = name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setName(String)|");
}
}

	/**
	 * Method getQuantity.
	 * 
	 * @return int
	 */
	public int getQuantity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getQuantity()|");

		return quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getQuantity()|");
}
}

	/**
	 * Method getInventoryQuantity.
	 * 
	 * @return int
	 */
	public int getInventoryQuantity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getInventoryQuantity()|");

		return inventoryQuantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getInventoryQuantity()|");
}
}

	/**
	 * Method setInventoryQuantity.
	 * 
	 * @param quantity
	 */
	public void setInventoryQuantity(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setInventoryQuantity(int)|");

		this.inventoryQuantity = quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::setInventoryQuantity(int)|");
}
}

	/**
	 * Method getStatus.
	 * 
	 * @return String
	 */
	public String getStatus() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getStatus()|");

		return status;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getStatus()|");
}
}

	/**
	 * Method getLowDate.
	 * 
	 * @return long
	 */
	public long getLowDate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getLowDate()|");

		return lowDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getLowDate()|");
}
}

	/**
	 * Method getOrderDate.
	 * 
	 * @return long
	 */
	public long getOrderDate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getOrderDate()|");

		return orderDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/BackOrderItem.java::com.ibm.websphere.samples.pbw.war.BackOrderItem::getOrderDate()|");
}
}
}
