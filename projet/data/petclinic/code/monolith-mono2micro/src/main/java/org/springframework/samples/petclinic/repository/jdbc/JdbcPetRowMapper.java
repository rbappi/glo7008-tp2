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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

/**
 * {@link RowMapper} implementation mapping data from a {@link ResultSet} to the corresponding properties
 * of the {@link JdbcPet} class.
 */
class JdbcPetRowMapper implements RowMapper<JdbcPet> {

    @Override
    public JdbcPet mapRow(ResultSet rs, int rownum) throws SQLException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetRowMapper.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetRowMapper::mapRow(ResultSet, int)|");

        JdbcPet pet = new JdbcPet();
        pet.setId(rs.getInt("pets.id"));
        pet.setName(rs.getString("name"));
        pet.setBirthDate(rs.getObject("birth_date", LocalDate.class));
        pet.setTypeId(rs.getInt("type_id"));
        pet.setOwnerId(rs.getInt("owner_id"));
        return pet;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jdbc/JdbcPetRowMapper.java::org.springframework.samples.petclinic.repository.jdbc.JdbcPetRowMapper::mapRow(ResultSet, int)|");
}
}
}
