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
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.ibm.websphere.samples.pbw.utils.Util;

/**
 * Bean mapping for BACKORDER table.
 */
@Entity(name = "BackOrder")
@Table(name = "BACKORDER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "findAllBackOrders", query = "select b from BackOrder b"),
		@NamedQuery(name = "findByInventoryID", query = "select b from BackOrder b where ((b.inventory.inventoryId = :id) and (b.status = 'Order Stock'))"),
		@NamedQuery(name = "removeAllBackOrder", query = "delete from BackOrder") })
public class BackOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "BackOrderSeq")
	@TableGenerator(name = "BackOrderSeq", table = "IDGENERATOR", pkColumnName = "IDNAME", pkColumnValue = "BACKORDER", valueColumnName = "IDVALUE")
	private String backOrderID;
	private int quantity;
	private String status;
	private long lowDate;
	private long orderDate;
	private String supplierOrderID; // missing table

	// relationships
	@OneToOne
	@JoinColumn(name = "INVENTORYID")
	private Inventory inventory;

	public BackOrder() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder()|");
}
}

	public BackOrder(String backOrderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder(String)|");

		setBackOrderID(backOrderID);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder(String)|");
}
}

	public BackOrder(Inventory inventory, int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder(Inventory, int)|");

			this.setInventory(inventory);
			this.setQuantity(quantity);
			this.setStatus(Util.STATUS_ORDERSTOCK);
			this.setLowDate(System.currentTimeMillis());
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::BackOrder(Inventory, int)|");
}
}

	public String getBackOrderID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getBackOrderID()|");

		return backOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getBackOrderID()|");
}
}

	public void setBackOrderID(String backOrderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setBackOrderID(String)|");

		this.backOrderID = backOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setBackOrderID(String)|");
}
}

	public long getLowDate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getLowDate()|");

		return lowDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getLowDate()|");
}
}

	public void setLowDate(long lowDate) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setLowDate(long)|");

		this.lowDate = lowDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setLowDate(long)|");
}
}

	public long getOrderDate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getOrderDate()|");

		return orderDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getOrderDate()|");
}
}

	public void setOrderDate(long orderDate) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setOrderDate(long)|");

		this.orderDate = orderDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setOrderDate(long)|");
}
}

	public int getQuantity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getQuantity()|");

		return quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getQuantity()|");
}
}

	public void setQuantity(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setQuantity(int)|");

		this.quantity = quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setQuantity(int)|");
}
}

	public void increateQuantity(int delta) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::increateQuantity(int)|");

		if (!(status.equals(Util.STATUS_ORDERSTOCK))) {
			Util.debug("BackOrderMgr.createBackOrder() - Backorders found but have already been ordered from the supplier");
			throw new RuntimeException("cannot increase order size for orders already in progress");
		}
		// Increase the BackOrder quantity for an existing Back Order.
		quantity = quantity + delta;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::increateQuantity(int)|");
}
}

	public String getStatus() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getStatus()|");

		return status;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getStatus()|");
}
}

	public void setStatus(String status) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setStatus(String)|");

		this.status = status;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setStatus(String)|");
}
}

	public String getSupplierOrderID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getSupplierOrderID()|");

		return supplierOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getSupplierOrderID()|");
}
}

	public void setSupplierOrderID(String supplierOrderID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setSupplierOrderID(String)|");

		this.supplierOrderID = supplierOrderID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setSupplierOrderID(String)|");
}
}

	public Inventory getInventory() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getInventory()|");

		return inventory;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::getInventory()|");
}
}

	public void setInventory(Inventory inventory) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setInventory(Inventory)|");

		this.inventory = inventory;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/BackOrder.java::com.ibm.websphere.samples.pbw.jpa.BackOrder::setInventory(Inventory)|");
}
}

}
