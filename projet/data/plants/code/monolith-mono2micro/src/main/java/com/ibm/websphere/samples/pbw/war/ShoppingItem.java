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

import java.io.Serializable;

import javax.validation.constraints.Min;

import com.ibm.websphere.samples.pbw.jpa.BackOrder;
import com.ibm.websphere.samples.pbw.jpa.Inventory;

/**
 * ShoppingItem wraps the JPA Inventory entity class to provide additional methods needed by the web
 * app.
 */
public class ShoppingItem implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private Inventory item;

	public ShoppingItem() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem()|");


	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem()|");
}
}

	public ShoppingItem(Inventory i) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem(Inventory)|");

		item = i;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem(Inventory)|");
}
}

	public ShoppingItem(String key, String name, String heading, String desc, String pkginfo, String image, float price,
			float cost, int quantity, int category, String notes, boolean isPublic) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem(String, String, String, String, String, String, float, float, int, int, String, boolean)|");

		item = new Inventory(key, name, heading, desc, pkginfo, image, price, cost, quantity, category, notes,
				isPublic);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::ShoppingItem(String, String, String, String, String, String, float, float, int, int, String, boolean)|");
}
}

	/**
	 * Subtotal price calculates a cost based on price and quantity.
	 */
	public float getSubtotalPrice() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getSubtotalPrice()|");

		return getPrice() * getQuantity();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getSubtotalPrice()|");
}
}

	/**
	 * @param o
	 * @return boolean true if object equals this
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::equals(Object)|");

		return item.equals(o);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::equals(Object)|");
}
}

	/**
	 * @return int hashcode for this object
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::hashCode()|");

		return item.hashCode();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::hashCode()|");
}
}

	/**
	 * @return String String representation of this object
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::toString()|");

		return item.toString();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::toString()|");
}
}

	/**
	 * @param quantity
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#increaseInventory(int)
	 */
	public void increaseInventory(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::increaseInventory(int)|");

		item.increaseInventory(quantity);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::increaseInventory(int)|");
}
}

	/**
	 * @return int category enum int value
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getCategory()
	 */
	public int getCategory() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getCategory()|");

		return item.getCategory();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getCategory()|");
}
}

	/**
	 * @param category
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setCategory(int)
	 */
	public void setCategory(int category) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setCategory(int)|");

		item.setCategory(category);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setCategory(int)|");
}
}

	/**
	 * @return float cost of the item
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getCost()
	 */
	public float getCost() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getCost()|");

		return item.getCost();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getCost()|");
}
}

	/**
	 * @param cost
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setCost(float)
	 */
	public void setCost(float cost) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setCost(float)|");

		item.setCost(cost);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setCost(float)|");
}
}

	/**
	 * @return String description of the item
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getDescription()
	 */
	public String getDescription() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getDescription()|");

		return item.getDescription();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getDescription()|");
}
}

	/**
	 * @param description
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setDescription(String)|");

		item.setDescription(description);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setDescription(String)|");
}
}

	/**
	 * @return String item heading
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getHeading()
	 */
	public String getHeading() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getHeading()|");

		return item.getHeading();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getHeading()|");
}
}

	/**
	 * @param heading
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setHeading(java.lang.String)
	 */
	public void setHeading(String heading) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setHeading(String)|");

		item.setHeading(heading);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setHeading(String)|");
}
}

	/**
	 * @return String image URI
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getImage()
	 */
	public String getImage() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getImage()|");

		return item.getImage();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getImage()|");
}
}

	/**
	 * @param image
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setImage(java.lang.String)
	 */
	public void setImage(String image) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setImage(String)|");

		item.setImage(image);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setImage(String)|");
}
}

	/**
	 * @return String name of the item
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getName()
	 */
	public String getName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getName()|");

		return item.getName();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getName()|");
}
}

	/**
	 * @param name
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setName(java.lang.String)
	 */
	public void setName(String name) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setName(String)|");

		item.setName(name);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setName(String)|");
}
}

	/**
	 * @return String item notes
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getNotes()
	 */
	public String getNotes() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getNotes()|");

		return item.getNotes();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getNotes()|");
}
}

	/**
	 * @param notes
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setNotes(java.lang.String)
	 */
	public void setNotes(String notes) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setNotes(String)|");

		item.setNotes(notes);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setNotes(String)|");
}
}

	/**
	 * @return String package information
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getPkginfo()
	 */
	public String getPkginfo() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getPkginfo()|");

		return item.getPkginfo();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getPkginfo()|");
}
}

	/**
	 * @param pkginfo
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPkginfo(java.lang.String)
	 */
	public void setPkginfo(String pkginfo) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPkginfo(String)|");

		item.setPkginfo(pkginfo);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPkginfo(String)|");
}
}

	/**
	 * @return float Price of the item
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getPrice()
	 */
	public float getPrice() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getPrice()|");

		return item.getPrice();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getPrice()|");
}
}

	/**
	 * @param price
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPrice(float)
	 */
	public void setPrice(float price) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPrice(float)|");

		item.setPrice(price);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPrice(float)|");
}
}

	/**
	 * Property accessor for quantity of items ordered. Quantity may not be less than zero. Bean
	 * Validation will ensure this is true.
	 * 
	 * @return int quantity of items
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getQuantity()
	 */
	@Min(value = 0, message = "Quantity must be a number greater than or equal to zero.")
	public int getQuantity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getQuantity()|");

		return item.getQuantity();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getQuantity()|");
}
}

	/**
	 * @param quantity
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setQuantity(int)
	 */
	public void setQuantity(int quantity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setQuantity(int)|");

		item.setQuantity(quantity);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setQuantity(int)|");
}
}

	/**
	 * @return int maximum threshold
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getMaxThreshold()
	 */
	public int getMaxThreshold() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getMaxThreshold()|");

		return item.getMaxThreshold();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getMaxThreshold()|");
}
}

	/**
	 * @param maxThreshold
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setMaxThreshold(int)
	 */
	public void setMaxThreshold(int maxThreshold) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setMaxThreshold(int)|");

		item.setMaxThreshold(maxThreshold);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setMaxThreshold(int)|");
}
}

	/**
	 * @return int minimum threshold
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getMinThreshold()
	 */
	public int getMinThreshold() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getMinThreshold()|");

		return item.getMinThreshold();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getMinThreshold()|");
}
}

	/**
	 * @param minThreshold
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setMinThreshold(int)
	 */
	public void setMinThreshold(int minThreshold) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setMinThreshold(int)|");

		item.setMinThreshold(minThreshold);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setMinThreshold(int)|");
}
}

	/**
	 * @return String item ID in the inventory
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getInventoryId()
	 */
	public String getInventoryId() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getInventoryId()|");

		return item.getInventoryId();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getInventoryId()|");
}
}

	/**
	 * @param id
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setInventoryId(java.lang.String)
	 */
	public void setInventoryId(String id) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setInventoryId(String)|");

		item.setInventoryId(id);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setInventoryId(String)|");
}
}

	/**
	 * @return String item ID
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getID()
	 */
	public String getID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getID()|");

		return item.getID();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getID()|");
}
}

	/**
	 * @param id
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setID(java.lang.String)
	 */
	public void setID(String id) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setID(String)|");

		item.setID(id);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setID(String)|");
}
}

	/**
	 * @return boolean true if this is a public item
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#isPublic()
	 */
	public boolean isPublic() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::isPublic()|");

		return item.isPublic();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::isPublic()|");
}
}

	/**
	 * @param isPublic
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setIsPublic(boolean)
	 */
	public void setIsPublic(boolean isPublic) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setIsPublic(boolean)|");

		item.setIsPublic(isPublic);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setIsPublic(boolean)|");
}
}

	/**
	 * @param isPublic
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setPrivacy(boolean)
	 */
	public void setPrivacy(boolean isPublic) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPrivacy(boolean)|");

		item.setPrivacy(isPublic);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setPrivacy(boolean)|");
}
}

	/**
	 * @return byte[] item image as a byte array
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getImgbytes()
	 */
	public byte[] getImgbytes() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getImgbytes()|");

		return item.getImgbytes();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getImgbytes()|");
}
}

	/**
	 * @param imgbytes
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setImgbytes(byte[])
	 */
	public void setImgbytes(byte[] imgbytes) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setImgbytes(byte[])|");

		item.setImgbytes(imgbytes);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setImgbytes(byte[])|");
}
}

	/**
	 * @return BackOrder item is on back order
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#getBackOrder()
	 */
	public BackOrder getBackOrder() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getBackOrder()|");

		return item.getBackOrder();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::getBackOrder()|");
}
}

	/**
	 * @param backOrder
	 * @see com.ibm.websphere.samples.pbw.jpa.Inventory#setBackOrder(com.ibm.websphere.samples.pbw.jpa.BackOrder)
	 */
	public void setBackOrder(BackOrder backOrder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setBackOrder(BackOrder)|");

		item.setBackOrder(backOrder);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/ShoppingItem.java::com.ibm.websphere.samples.pbw.war.ShoppingItem::setBackOrder(BackOrder)|");
}
}

}
