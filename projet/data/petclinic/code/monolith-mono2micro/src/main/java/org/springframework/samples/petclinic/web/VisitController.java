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

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@Controller
public class VisitController {

    private final ClinicService clinicService;


    @Autowired
    public VisitController(ClinicService clinicService) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::VisitController(ClinicService)|");

        this.clinicService = clinicService;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::VisitController(ClinicService)|");
}
}

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::setAllowedFields(WebDataBinder)|");

        dataBinder.setDisallowedFields("id");
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::setAllowedFields(WebDataBinder)|");
}
}

    /**
     * Called before each and every @GetMapping or @PostMapping annotated method.
     * 2 goals:
     * - Make sure we always have fresh data
     * - Since we do not use the session scope, make sure that Pet object always has an id
     * (Even though id is not part of the form fields)
     *
     * @param petId
     * @return Pet
     */
    @ModelAttribute("visit")
    public Visit loadPetWithVisit(@PathVariable("petId") int petId) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::loadPetWithVisit(int)|");

        Pet pet = this.clinicService.findPetById(petId);
        Visit visit = new Visit();
        pet.addVisit(visit);
        return visit;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::loadPetWithVisit(int)|");
}
}

    // Spring MVC calls method loadPetWithVisit(...) before initNewVisitForm is called
    @GetMapping(value = "/owners/*/pets/{petId}/visits/new")
    public String initNewVisitForm(@PathVariable("petId") int petId, Map<String, Object> model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::initNewVisitForm(int, Map)|");

        return "pets/createOrUpdateVisitForm";
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::initNewVisitForm(int, Map)|");
}
}

    // Spring MVC calls method loadPetWithVisit(...) before processNewVisitForm is called
    @PostMapping(value = "/owners/{ownerId}/pets/{petId}/visits/new")
    public String processNewVisitForm(@Valid Visit visit, BindingResult result) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::processNewVisitForm(Visit, BindingResult)|");

        if (result.hasErrors()) {
            return "pets/createOrUpdateVisitForm";
        } else {
            this.clinicService.saveVisit(visit);
            return "redirect:/owners/{ownerId}";
        }
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::processNewVisitForm(Visit, BindingResult)|");
}
}

    @GetMapping(value = "/owners/*/pets/{petId}/visits")
    public String showVisits(@PathVariable int petId, Map<String, Object> model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::showVisits(int, Map)|");

        model.put("visits", this.clinicService.findPetById(petId).getVisits());
        return "visitList";
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VisitController.java::org.springframework.samples.petclinic.web.VisitController::showVisits(int, Map)|");
}
}

}
