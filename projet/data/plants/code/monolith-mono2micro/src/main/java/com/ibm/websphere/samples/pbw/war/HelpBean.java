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
// (C) COPYRIGHT International Business Machines Corp., 2011
// All Rights Reserved * Licensed Materials - Property of IBM
//

package com.ibm.websphere.samples.pbw.war;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import com.ibm.websphere.samples.pbw.bean.ResetDBBean;
import com.ibm.websphere.samples.pbw.utils.Util;

/**
 * JSF action bean for the help page.
 *
 */
@Named("help")
public class HelpBean implements Serializable {

	@Inject
	private ResetDBBean rdb;

	private String dbDumpFile;

	private static final String ACTION_HELP = "help";
	private static final String ACTION_HOME = "promo";

	public String performHelp() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::performHelp()|");

		return ACTION_HELP;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::performHelp()|");
}
}

	public String performDBReset() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::performDBReset()|");

		rdb.resetDB();
		return ACTION_HOME;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::performDBReset()|");
}
}

	/**
	 * @return the dbDumpFile
	 */
	public String getDbDumpFile() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::getDbDumpFile()|");

		return dbDumpFile;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::getDbDumpFile()|");
}
}

	/**
	 * @param dbDumpFile
	 *            the dbDumpFile to set
	 */
	public void setDbDumpFile(String dbDumpFile) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::setDbDumpFile(String)|");

		this.dbDumpFile = dbDumpFile;
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::setDbDumpFile(String)|");
}
}

	/**
	 * @return whether debug is on or not
	 */
	public boolean isDebug() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::isDebug()|");

		return Util.debugOn();
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::isDebug()|");
}
}

	/**
	 * Debugging is currently tied to the JavaServer Faces project stage. Any change here is likely
	 * to be automatically reset.
	 * 
	 * @param debug
	 *            Sets whether debug is on or not.
	 */
	public void setDebug(boolean debug) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::setDebug(boolean)|");

		Util.setDebug(debug);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/war/HelpBean.java::com.ibm.websphere.samples.pbw.war.HelpBean::setDebug(boolean)|");
}
}

}
