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
package org.springframework.samples.petclinic.repository.jdbc;

import org.springframework.samples.petclinic.model.Pet;

/**
 * Subclass of Pet that carries temporary id properties which are only relevant for a JDBC implementation of the
 * PetRepository.
 *
 * @author Juergen Hoeller
 */
class JdbcPet extends Pet {

    private int typeId;

    private int ownerId;

    public int getTypeId() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::getTypeId()|");

        return this.typeId;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::getTypeId()|");
}
}

    public void setTypeId(int typeId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::setTypeId(int)|");

        this.typeId = typeId;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::setTypeId(int)|");
}
}

    public int getOwnerId() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::getOwnerId()|");

        return this.ownerId;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::getOwnerId()|");
}
}

    public void setOwnerId(int ownerId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::setOwnerId(int)|");

        this.ownerId = ownerId;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPet.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPet::setOwnerId(int)|");
}
}

}
