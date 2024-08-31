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
package com.ibm.websphere.samples.pbw.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Customer is the bean mapping for the CUSTOMER table.
 * 
 * @see Customer
 */
@Entity(name = "Customer")
@Table(name = "CUSTOMER", schema = "APP")
@NamedQueries({ @NamedQuery(name = "removeAllCustomers", query = "delete from Customer") })
public class Customer {
	@Id
	private String customerID;
	private String password;

	@NotNull
	@Size(min = 1, message = "First name must include at least one letter.")
	private String firstName;
	@NotNull
	@Size(min = 1, message = "Last name must include at least one letter.")
	private String lastName;
	@NotNull
	@Size(min = 1, message = "Address must include at least one letter.")
	private String addr1;
	private String addr2;
	@NotNull
	@Size(min = 1, message = "City name must include at least one letter.")
	private String addrCity;
	@NotNull
	@Size(min = 2, message = "State must include at least two letters.")
	private String addrState;
	@Pattern(regexp = "\\d{5}", message = "Zip code does not have 5 digits.")
	private String addrZip;
	@NotNull
	@Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Phone number does not match xxx-xxx-xxxx.")
	private String phone;

	public Customer() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::Customer()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::Customer()|");
}
}

	/**
	 * Create a new Customer.
	 *
	 * @param key
	 *            CustomerKey
	 * @param password
	 *            Password used for this customer account.
	 * @param firstName
	 *            First name of the customer.
	 * @param lastName
	 *            Last name of the customer
	 * @param addr1
	 *            Street address of the customer
	 * @param addr2
	 *            Street address of the customer
	 * @param addrCity
	 *            City
	 * @param addrState
	 *            State
	 * @param addrZip
	 *            Zip code
	 * @param phone
	 *            Phone number
	 */
	public Customer(String key, String password, String firstName, String lastName, String addr1, String addr2,
			String addrCity, String addrState, String addrZip, String phone) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::Customer(String, String, String, String, String, String, String, String, String, String)|");

		this.setCustomerID(key);
		this.setPassword(password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddr1(addr1);
		this.setAddr2(addr2);
		this.setAddrCity(addrCity);
		this.setAddrState(addrState);
		this.setAddrZip(addrZip);
		this.setPhone(phone);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::Customer(String, String, String, String, String, String, String, String, String, String)|");
}
}

	/**
	 * Verify password.
	 *
	 * @param password
	 *            value to be checked.
	 * @return True, if password matches one stored.
	 */
	public boolean verifyPassword(String password) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::verifyPassword(String)|");

		return this.getPassword().equals(password);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::verifyPassword(String)|");
}
}

	/**
	 * Get the customer's full name.
	 * 
	 * @return String of customer's full name.
	 */
	public String getFullName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getFullName()|");

		return this.getFirstName() + " " + this.getLastName();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getFullName()|");
}
}

	public String getAddr1() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddr1()|");

		return addr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddr1()|");
}
}

	public void setAddr1(String addr1) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddr1(String)|");

		this.addr1 = addr1;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddr1(String)|");
}
}

	public String getAddr2() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddr2()|");

		return addr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddr2()|");
}
}

	public void setAddr2(String addr2) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddr2(String)|");

		this.addr2 = addr2;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddr2(String)|");
}
}

	public String getAddrCity() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrCity()|");

		return addrCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrCity()|");
}
}

	public void setAddrCity(String addrCity) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrCity(String)|");

		this.addrCity = addrCity;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrCity(String)|");
}
}

	public String getAddrState() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrState()|");

		return addrState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrState()|");
}
}

	public void setAddrState(String addrState) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrState(String)|");

		this.addrState = addrState;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrState(String)|");
}
}

	public String getAddrZip() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrZip()|");

		return addrZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getAddrZip()|");
}
}

	public void setAddrZip(String addrZip) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrZip(String)|");

		this.addrZip = addrZip;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setAddrZip(String)|");
}
}

	public String getCustomerID() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getCustomerID()|");

		return customerID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getCustomerID()|");
}
}

	public void setCustomerID(String customerID) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setCustomerID(String)|");

		this.customerID = customerID;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setCustomerID(String)|");
}
}

	public String getFirstName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getFirstName()|");

		return firstName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getFirstName()|");
}
}

	public void setFirstName(String firstName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setFirstName(String)|");

		this.firstName = firstName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setFirstName(String)|");
}
}

	public String getLastName() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getLastName()|");

		return lastName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getLastName()|");
}
}

	public void setLastName(String lastName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setLastName(String)|");

		this.lastName = lastName;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setLastName(String)|");
}
}

	public String getPassword() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getPassword()|");

		return password;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getPassword()|");
}
}

	public void setPassword(String password) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setPassword(String)|");

		this.password = password;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setPassword(String)|");
}
}

	public String getPhone() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getPhone()|");

		return phone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::getPhone()|");
}
}

	public void setPhone(String phone) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setPhone(String)|");

		this.phone = phone;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/jpa/Customer.java::com.ibm.websphere.samples.pbw.jpa.Customer::setPhone(String)|");
}
}

}
