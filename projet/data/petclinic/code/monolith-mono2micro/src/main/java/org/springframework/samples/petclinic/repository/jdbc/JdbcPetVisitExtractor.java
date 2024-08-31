/*
 * Copyright 2002-2015 the original author or authors.
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

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.samples.petclinic.model.Visit;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * {@link ResultSetExtractor} implementation by using the
 * {@link OneToManyResultSetExtractor} of Spring Data Core JDBC Extensions.
 */
public class JdbcPetVisitExtractor extends
    OneToManyResultSetExtractor<JdbcPet, Visit, Integer> {

    public JdbcPetVisitExtractor() {
        super(new JdbcPetRowMapper(), new JdbcVisitRowMapper());
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::JdbcPetVisitExtractor()|");

    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::JdbcPetVisitExtractor()|");
}
}

    @Override
    protected Integer mapPrimaryKey(ResultSet rs) throws SQLException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::mapPrimaryKey(ResultSet)|");

        return rs.getInt("pets.id");
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::mapPrimaryKey(ResultSet)|");
}
}

    @Override
    protected Integer mapForeignKey(ResultSet rs) throws SQLException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::mapForeignKey(ResultSet)|");

        if (rs.getObject("visits.pet_id") == null) {
            return null;
        } else {
            return rs.getInt("visits.pet_id");
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::mapForeignKey(ResultSet)|");
}
}

    @Override
    protected void addChild(JdbcPet root, Visit child) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::addChild(JdbcPet, Visit)|");

        root.addVisit(child);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetVisitExtractor.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetVisitExtractor::addChild(JdbcPet, Visit)|");
}
}
}
