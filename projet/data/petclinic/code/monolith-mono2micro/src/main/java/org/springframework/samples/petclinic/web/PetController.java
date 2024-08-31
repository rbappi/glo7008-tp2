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
package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.Collection;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {

    private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";
    private final ClinicService clinicService;

    @Autowired
    public PetController(ClinicService clinicService) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::PetController(ClinicService)|");

        this.clinicService = clinicService;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::PetController(ClinicService)|");
}
}

    @ModelAttribute("types")
    public Collection<PetType> populatePetTypes() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::populatePetTypes()|");

        return this.clinicService.findPetTypes();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::populatePetTypes()|");
}
}

    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") int ownerId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::findOwner(int)|");

        return this.clinicService.findOwnerById(ownerId);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::findOwner(int)|");
}
}

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initOwnerBinder(WebDataBinder)|");

        dataBinder.setDisallowedFields("id");
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initOwnerBinder(WebDataBinder)|");
}
}

    @InitBinder("pet")
    public void initPetBinder(WebDataBinder dataBinder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initPetBinder(WebDataBinder)|");

        dataBinder.setValidator(new PetValidator());
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initPetBinder(WebDataBinder)|");
}
}

    @GetMapping(value = "/pets/new")
    public String initCreationForm(Owner owner, ModelMap model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initCreationForm(Owner, ModelMap)|");

        Pet pet = new Pet();
        owner.addPet(pet);
        model.put("pet", pet);
        return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initCreationForm(Owner, ModelMap)|");
}
}

    @PostMapping(value = "/pets/new")
    public String processCreationForm(Owner owner, @Valid Pet pet, BindingResult result, ModelMap model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::processCreationForm(Owner, Pet, BindingResult, ModelMap)|");

        if (StringUtils.hasLength(pet.getName()) && pet.isNew() && owner.getPet(pet.getName(), true) != null){
            result.rejectValue("name", "duplicate", "already exists");
        }
        if (result.hasErrors()) {
            model.put("pet", pet);
            return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
        } else {
            owner.addPet(pet);
            this.clinicService.savePet(pet);
            return "redirect:/owners/{ownerId}";
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::processCreationForm(Owner, Pet, BindingResult, ModelMap)|");
}
}

    @GetMapping(value = "/pets/{petId}/edit")
    public String initUpdateForm(@PathVariable("petId") int petId, ModelMap model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initUpdateForm(int, ModelMap)|");

        Pet pet = this.clinicService.findPetById(petId);
        model.put("pet", pet);
        return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::initUpdateForm(int, ModelMap)|");
}
}

    @PostMapping(value = "/pets/{petId}/edit")
    public String processUpdateForm(@Valid Pet pet, BindingResult result, Owner owner, ModelMap model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::processUpdateForm(Pet, BindingResult, Owner, ModelMap)|");

        if (result.hasErrors()) {
            model.put("pet", pet);
            return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
        } else {
            owner.addPet(pet);
            this.clinicService.savePet(pet);
            return "redirect:/owners/{ownerId}";
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetController.java::org.springframework.samples.petclinic.web.PetController::processUpdateForm(Pet, BindingResult, Owner, ModelMap)|");
}
}

}
