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
package com.ibm.websphere.samples.pbw.bean;

import java.util.Enumeration;
import java.util.Hashtable;

import com.ibm.websphere.samples.pbw.jpa.Inventory;

/**
 * A class to hold a shopping cart's contents.
 */
public class ShoppingCartContent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Hashtable<String, Integer> table = null;

	public ShoppingCartContent() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::ShoppingCartContent()|");

		table = new Hashtable<String, Integer>();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::ShoppingCartContent()|");
}
}

	/** Add the item to the shopping cart. */
	public void addItem(Inventory si) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::addItem(Inventory)|");

		table.put(si.getID(), new Integer(si.getQuantity()));
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::addItem(Inventory)|");
}
}

	/** Update the item in the shopping cart. */
	public void updateItem(Inventory si) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::updateItem(Inventory)|");

		table.put(si.getID(), new Integer(si.getQuantity()));
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::updateItem(Inventory)|");
}
}

	/** Remove the item from the shopping cart. */
	public void removeItem(Inventory si) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::removeItem(Inventory)|");

		table.remove(si.getID());
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::removeItem(Inventory)|");
}
}

	/**
	 * Return the number of items in the cart.
	 *
	 * @return The number of items in the cart.
	 */
	public int size() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::size()|");

		return table.size();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::size()|");
}
}

	/**
	 * Return the inventory ID at the index given. The first element is at index 0, the second at
	 * index 1, and so on.
	 *
	 * @return The inventory ID at the index, or NULL if not present.
	 */
	public String getInventoryID(int index) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::getInventoryID(int)|");

		String retval = null;
		String inventoryID;
		int cnt = 0;
		for (Enumeration<String> myEnum = table.keys(); myEnum.hasMoreElements(); cnt++) {
			inventoryID = (String) myEnum.nextElement();
			if (index == cnt) {
				retval = inventoryID;
				break;
			}
		}
		return retval;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::getInventoryID(int)|");
}
}

	/**
	 * Return the quantity for the inventory ID given.
	 *
	 * @return The quantity for the inventory ID given..
	 *
	 */
	public int getQuantity(String inventoryID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::getQuantity(String)|");

		Integer quantity = (Integer) table.get(inventoryID);

		if (quantity == null)
			return 0;
		else
			return quantity.intValue();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/ShoppingCartContent.java::com.ibm.websphere.samples.pbw.bean.ShoppingCartContent::getQuantity(String)|");
}
}

}
