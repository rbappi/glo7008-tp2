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
package org.springframework.samples.petclinic.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade for all Petclinic controllers
 * Also a placeholder for @Transactional and @Cacheable annotations
 *
 * @author Michael Isvy
 */
@Service
public class ClinicServiceImpl implements ClinicService {

    private PetRepository petRepository;
    private VetRepository vetRepository;
    private OwnerRepository ownerRepository;
    private VisitRepository visitRepository;

    @Autowired
    public ClinicServiceImpl(PetRepository petRepository, VetRepository vetRepository, OwnerRepository ownerRepository, VisitRepository visitRepository) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::ClinicServiceImpl(PetRepository, VetRepository, OwnerRepository, VisitRepository)|");

        this.petRepository = petRepository;
        this.vetRepository = vetRepository;
        this.ownerRepository = ownerRepository;
        this.visitRepository = visitRepository;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::ClinicServiceImpl(PetRepository, VetRepository, OwnerRepository, VisitRepository)|");
}
}

    @Override
    @Transactional(readOnly = true)
    public Collection<PetType> findPetTypes() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findPetTypes()|");

        return petRepository.findPetTypes();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findPetTypes()|");
}
}

    @Override
    @Transactional(readOnly = true)
    public Owner findOwnerById(int id) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findOwnerById(int)|");

        return ownerRepository.findById(id);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findOwnerById(int)|");
}
}

    @Override
    @Transactional(readOnly = true)
    public Collection<Owner> findOwnerByLastName(String lastName) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findOwnerByLastName(String)|");

        return ownerRepository.findByLastName(lastName);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findOwnerByLastName(String)|");
}
}

    @Override
    @Transactional
    public void saveOwner(Owner owner) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::saveOwner(Owner)|");

        ownerRepository.save(owner);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::saveOwner(Owner)|");
}
}


    @Override
    @Transactional
    public void saveVisit(Visit visit) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::saveVisit(Visit)|");

        visitRepository.save(visit);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::saveVisit(Visit)|");
}
}


    @Override
    @Transactional(readOnly = true)
    public Pet findPetById(int id) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findPetById(int)|");

        return petRepository.findById(id);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findPetById(int)|");
}
}

    @Override
    @Transactional
    public void savePet(Pet pet) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::savePet(Pet)|");

        petRepository.save(pet);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::savePet(Pet)|");
}
}

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "vets")
    public Collection<Vet> findVets() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findVets()|");

        return vetRepository.findAll();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findVets()|");
}
}

	@Override
	public Collection<Visit> findVisitsByPetId(int petId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findVisitsByPetId(int)|");

		return visitRepository.findByPetId(petId);
	
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/service/ClinicServiceImpl.java::org.springframework.samples.petclinic.service.ClinicServiceImpl::findVisitsByPetId(int)|");
}
}


}
