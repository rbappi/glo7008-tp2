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
package org.springframework.samples.petclinic.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA implementation of the ClinicService interface using EntityManager.
 * <p/>
 * <p>The mappings are defined in "orm.xml" located in the META-INF directory.
 *
 * @author Mike Keith
 * @author Rod Johnson
 * @author Sam Brannen
 * @author Michael Isvy
 * @since 22.4.2006
 */
@Repository
public class JpaVisitRepositoryImpl implements VisitRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void save(Visit visit) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jpa/JpaVisitRepositoryImpl.java::org.springframework.samples.petclinic.repository.jpa.JpaVisitRepositoryImpl::save(Visit)|");

        if (visit.getId() == null) {
            this.em.persist(visit);
        } else {
            this.em.merge(visit);
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jpa/JpaVisitRepositoryImpl.java::org.springframework.samples.petclinic.repository.jpa.JpaVisitRepositoryImpl::save(Visit)|");
}
}


    @Override
    @SuppressWarnings("unchecked")
    public List<Visit> findByPetId(Integer petId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/repository/jpa/JpaVisitRepositoryImpl.java::org.springframework.samples.petclinic.repository.jpa.JpaVisitRepositoryImpl::findByPetId(Integer)|");

        Query query = this.em.createQuery("SELECT v FROM Visit v where v.pet.id= :id");
        query.setParameter("id", petId);
        return query.getResultList();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/repository/jpa/JpaVisitRepositoryImpl.java::org.springframework.samples.petclinic.repository.jpa.JpaVisitRepositoryImpl::findByPetId(Integer)|");
}
}

}
