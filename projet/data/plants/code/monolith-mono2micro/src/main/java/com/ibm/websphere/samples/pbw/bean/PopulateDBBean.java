package com.ibm.websphere.samples.pbw.bean;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.ibm.websphere.samples.pbw.utils.Util;

@Singleton
@Startup
public class PopulateDBBean {
    
    @Inject
    ResetDBBean dbBean;
    
    @PostConstruct
    public void initDB() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/PopulateDBBean.java::com.ibm.websphere.samples.pbw.bean.PopulateDBBean::initDB()|");

        Util.debug("Initializing database...");
        dbBean.populateDB();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/com/ibm/websphere/samples/pbw/bean/PopulateDBBean.java::com.ibm.websphere.samples.pbw.bean.PopulateDBBean::initDB()|");
}
}

}
