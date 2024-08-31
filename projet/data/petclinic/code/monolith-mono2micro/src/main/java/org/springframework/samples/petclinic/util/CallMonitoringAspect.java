/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.util.StopWatch;

/**
 * Simple aspect that monitors call count and call invocation time. It uses JMX annotations and therefore can be
 * monitored using any JMX console such as the jConsole
 * <p/>
 * This is only useful if you use JPA or JDBC.  Spring-data-jpa doesn't have any correctly annotated classes to join on
 *
 * @author Rob Harrop
 * @author Juergen Hoeller
 * @author Michael Isvy
 * @since 2.5
 */
@ManagedResource("petclinic:type=CallMonitor")
@Aspect
public class CallMonitoringAspect {

    private boolean enabled = true;

    private int callCount = 0;

    private long accumulatedCallTime = 0;

    @ManagedAttribute
    public boolean isEnabled() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::isEnabled()|");

        return enabled;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::isEnabled()|");
}
}

    @ManagedAttribute
    public void setEnabled(boolean enabled) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::setEnabled(boolean)|");

        this.enabled = enabled;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::setEnabled(boolean)|");
}
}

    @ManagedOperation
    public void reset() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::reset()|");

        this.callCount = 0;
        this.accumulatedCallTime = 0;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::reset()|");
}
}

    @ManagedAttribute
    public int getCallCount() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::getCallCount()|");

        return callCount;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::getCallCount()|");
}
}

    @ManagedAttribute
    public long getCallTime() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::getCallTime()|");

        if (this.callCount > 0)
            return this.accumulatedCallTime / this.callCount;
        else
            return 0;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::getCallTime()|");
}
}


    @Around("within(@org.springframework.stereotype.Repository *)")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::invoke(ProceedingJoinPoint)|");

        if (this.enabled) {
            StopWatch sw = new StopWatch(joinPoint.toShortString());

            sw.start("invoke");
            try {
                return joinPoint.proceed();
            } finally {
                sw.stop();
                synchronized (this) {
                    this.callCount++;
                    this.accumulatedCallTime += sw.getTotalTimeMillis();
                }
            }
        } else {
            return joinPoint.proceed();
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/util/CallMonitoringAspect.java::org.springframework.samples.petclinic.util.CallMonitoringAspect::invoke(ProceedingJoinPoint)|");
}
}

}
