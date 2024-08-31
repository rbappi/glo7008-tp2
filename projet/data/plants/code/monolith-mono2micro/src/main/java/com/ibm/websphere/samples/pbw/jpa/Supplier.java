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
// (C) COPYRIGHT International Business Machines Corp., 2004,2011
// All Rights Reserved * Licensed Materials - Property of IBM
//
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Bean mapping for the SUPPLIER table.
 */
@Entity(name = "Supplier")
@Table(name = "SUPPLIER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "findAllSuppliers", query = "select s from Supplier s"),
		@NamedQuery(name = "removeAllSupplier", query = "delete from Supplier") })
public class Supplier {
	@Id
	private String supplierID;
	private String name;
	private String city;
	private String usstate;
	private String zip;
	private String phone;
	private String url;
	private String street;

	public String getCity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getCity()|");

		return city;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getCity()|");
}
}

	public void setCity(String city) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setCity(String)|");

		this.city = city;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setCity(String)|");
}
}

	public String getName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getName()|");

		return name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getName()|");
}
}

	public void setName(String name) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setName(String)|");

		this.name = name;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setName(String)|");
}
}

	public String getPhone() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getPhone()|");

		return phone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getPhone()|");
}
}

	public void setPhone(String phone) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setPhone(String)|");

		this.phone = phone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setPhone(String)|");
}
}

	public String getStreet() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getStreet()|");

		return street;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getStreet()|");
}
}

	public void setStreet(String street) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setStreet(String)|");

		this.street = street;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setStreet(String)|");
}
}

	public String getSupplierID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getSupplierID()|");

		return supplierID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getSupplierID()|");
}
}

	public void setSupplierID(String supplierID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setSupplierID(String)|");

		this.supplierID = supplierID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setSupplierID(String)|");
}
}

	public String getUrl() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getUrl()|");

		return url;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getUrl()|");
}
}

	public void setUrl(String url) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setUrl(String)|");

		this.url = url;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setUrl(String)|");
}
}

	public String getUsstate() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getUsstate()|");

		return usstate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getUsstate()|");
}
}

	public void setUsstate(String usstate) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setUsstate(String)|");

		this.usstate = usstate;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setUsstate(String)|");
}
}

	public String getZip() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getZip()|");

		return zip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::getZip()|");
}
}

	public void setZip(String zip) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setZip(String)|");

		this.zip = zip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::setZip(String)|");
}
}

	public Supplier() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier()|");
}
}

	public Supplier(String supplierID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier(String)|");

		setSupplierID(supplierID);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier(String)|");
}
}

	/**
	 * @param supplierID
	 * @param name
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param url
	 */
	public Supplier(String supplierID, String name, String street, String city, String state, String zip, String phone,
			String url) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier(String, String, String, String, String, String, String, String)|");

		this.setSupplierID(supplierID);
		this.setName(name);
		this.setStreet(street);
		this.setCity(city);
		this.setUsstate(state);
		this.setZip(zip);
		this.setPhone(phone);
		this.setUrl(url);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Supplier.java::com.ibm.websphere.samples.pbw.jpa.Supplier::Supplier(String, String, String, String, String, String, String, String)|");
}
}
}
