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

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ibm.websphere.samples.pbw.utils.Util;

/**
 * Bean mapping for the ORDERITEM table.
 */
@Entity(name = "OrderItem")
@Table(name = "ORDERITEM", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllOrderItem", query = "delete from OrderItem") })
public class OrderItem {
	/**
	 * Composite Key class for Entity Bean: OrderItem
	 * 
	 * Key consists of essentially two foreign key relations, but is mapped as foreign keys.
	 */
	@Embeddable
	public static class PK implements java.io.Serializable {
		static final long serialVersionUID = 3206093459760846163L;
		@Column(name = "inventoryID")
		public String inventoryID;
		@Column(name = "ORDER_ORDERID")
		public String order_orderID;

		public PK() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::PK()|");

			Util.debug("OrderItem.PK()");
		
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::PK()|");
}
}

		public PK(String inventoryID, String argOrder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::PK(String, String)|");

			Util.debug("OrderItem.PK() inventoryID=" + inventoryID + "=");
			Util.debug("OrderItem.PK() orderID=" + argOrder + "=");
			this.inventoryID = inventoryID;
			this.order_orderID = argOrder;
		
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::PK(String, String)|");
}
}

		/**
		 * Returns true if both keys are equal.
		 */
		public boolean equals(java.lang.Object otherKey) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::equals(java.lang.Object)|");

			if (otherKey instanceof PK) {
				PK o = (PK) otherKey;
				return ((this.inventoryID.equals(o.inventoryID)) && (this.order_orderID.equals(o.order_orderID)));
			}
			return false;
		
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::equals(java.lang.Object)|");
}
}

		/**
		 * Returns the hash code for the key.
		 */
		public int hashCode() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::hashCode()|");

			Util.debug("OrderItem.PK.hashCode() inventoryID=" + inventoryID + "=");
			Util.debug("OrderItem.PK.hashCode() orderID=" + order_orderID + "=");

			return (inventoryID.hashCode() + order_orderID.hashCode());
		
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem.PK::hashCode()|");
}
}
	}

	@SuppressWarnings("unused")
	@EmbeddedId
	private OrderItem.PK id;
	private String name;
	private String pkginfo;
	private float price;
	private float cost;
	private int category;
	private int quantity;
	private String sellDate;
	@Transient
	private String inventoryId;

	@ManyToOne
	@JoinColumn(name = "INVENTORYID", insertable = false, updatable = false)
	private Inventory inventory;
	@ManyToOne
	@JoinColumn(name = "ORDER_ORDERID", insertable = false, updatable = false)
	private Order order;

	public int getCategory() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getCategory()|");

		return category;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getCategory()|");
}
}

	public void setCategory(int category) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setCategory(int)|");

		this.category = category;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setCategory(int)|");
}
}

	public float getCost() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getCost()|");

		return cost;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getCost()|");
}
}

	public void setCost(float cost) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setCost(float)|");

		this.cost = cost;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setCost(float)|");
}
}

	public String getName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getName()|");

		return name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getName()|");
}
}

	public void setName(String name) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setName(String)|");

		this.name = name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setName(String)|");
}
}

	public String getPkginfo() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getPkginfo()|");

		return pkginfo;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getPkginfo()|");
}
}

	public void setPkginfo(String pkginfo) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setPkginfo(String)|");

		this.pkginfo = pkginfo;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setPkginfo(String)|");
}
}

	public float getPrice() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getPrice()|");

		return price;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getPrice()|");
}
}

	public void setPrice(float price) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setPrice(float)|");

		this.price = price;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setPrice(float)|");
}
}

	public int getQuantity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getQuantity()|");

		return quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getQuantity()|");
}
}

	public void setQuantity(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setQuantity(int)|");

		this.quantity = quantity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setQuantity(int)|");
}
}

	public String getSellDate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getSellDate()|");

		return sellDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getSellDate()|");
}
}

	public void setSellDate(String sellDate) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setSellDate(String)|");

		this.sellDate = sellDate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setSellDate(String)|");
}
}

	public OrderItem() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem()|");
}
}

	public OrderItem(Inventory inv) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem(Inventory)|");

		Util.debug("OrderItem(inv) - id = " + inv.getInventoryId());
		setInventoryId(inv.getInventoryId());
		inventory = inv;
		name = inv.getName();
		pkginfo = inv.getPkginfo();
		price = inv.getPrice();
		cost = inv.getCost();
		category = inv.getCategory();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem(Inventory)|");
}
}

	public OrderItem(Order order, String orderID, Inventory inv, java.lang.String name, java.lang.String pkginfo,
			float price, float cost, int quantity, int category, java.lang.String sellDate) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem(Order, String, Inventory, java.lang.String, java.lang.String, float, float, int, int, java.lang.String)|");

		Util.debug("OrderItem(etc.)");
		inventory = inv;
		setInventoryId(inv.getInventoryId());
		setName(name);
		setPkginfo(pkginfo);
		setPrice(price);
		setCost(cost);
		setQuantity(quantity);
		setCategory(category);
		setSellDate(sellDate);
		setOrder(order);
		id = new OrderItem.PK(inv.getInventoryId(), order.getOrderID());
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::OrderItem(Order, String, Inventory, java.lang.String, java.lang.String, float, float, int, int, java.lang.String)|");
}
}

	/*
	 * updates the primary key field with the composite orderId+inventoryId
	 */
	public void updatePK() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::updatePK()|");

		id = new OrderItem.PK(inventoryId, order.getOrderID());
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::updatePK()|");
}
}

	public Inventory getInventory() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getInventory()|");

		return inventory;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getInventory()|");
}
}

	public void setInventory(Inventory inv) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setInventory(Inventory)|");

		this.inventory = inv;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setInventory(Inventory)|");
}
}

	public Order getOrder() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getOrder()|");

		return order;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getOrder()|");
}
}

	/**
	 * Sets the order for this item Also updates the sellDate
	 * 
	 * @param order
	 */
	public void setOrder(Order order) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setOrder(Order)|");

		this.order = order;
		this.sellDate = order.getSellDate();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setOrder(Order)|");
}
}

	public String getInventoryId() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getInventoryId()|");

		return inventoryId;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::getInventoryId()|");
}
}

	public void setInventoryId(String inventoryId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setInventoryId(String)|");

		this.inventoryId = inventoryId;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/OrderItem.java::com.ibm.websphere.samples.pbw.jpa.OrderItem::setInventoryId(String)|");
}
}

}