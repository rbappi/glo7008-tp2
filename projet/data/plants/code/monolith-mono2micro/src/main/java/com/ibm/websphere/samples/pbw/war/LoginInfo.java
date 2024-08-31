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

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * A JSF backing bean used to store information for the login web page. It is accessed via the
 * account bean.
 *
 */
public class LoginInfo {
	private String checkPassword;

	@Pattern(regexp = "[a-zA-Z0-9_-]+@[a-zA-Z0-9.-]+")
	private String email;
	private String message;

	@Size(min = 6, max = 10, message = "Password must be between 6 and 10 characters.")
	private String password;

	public LoginInfo() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::LoginInfo()|");

	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::LoginInfo()|");
}
}

	public String getCheckPassword() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getCheckPassword()|");

		return this.checkPassword;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getCheckPassword()|");
}
}

	public String getEmail() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getEmail()|");

		return this.email;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getEmail()|");
}
}

	public String getMessage() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getMessage()|");

		return this.message;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getMessage()|");
}
}

	public String getPassword() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getPassword()|");

		return this.password;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::getPassword()|");
}
}

	public void setCheckPassword(String checkPassword) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setCheckPassword(String)|");

		this.checkPassword = checkPassword;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setCheckPassword(String)|");
}
}

	public void setEmail(String email) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setEmail(String)|");

		this.email = email;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setEmail(String)|");
}
}

	public void setMessage(String message) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setMessage(String)|");

		this.message = message;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setMessage(String)|");
}
}

	public void setPassword(String password) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setPassword(String)|");

		this.password = password;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/LoginInfo.java::com.ibm.websphere.samples.pbw.war.LoginInfo::setPassword(String)|");
}
}
}
