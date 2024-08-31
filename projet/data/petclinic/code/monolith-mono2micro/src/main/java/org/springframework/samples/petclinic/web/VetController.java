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
import org.springframework.http.MediaType;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
public class VetController {

    private final ClinicService clinicService;


    @Autowired
    public VetController(ClinicService clinicService) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::VetController(ClinicService)|");

        this.clinicService = clinicService;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::VetController(ClinicService)|");
}
}

    @GetMapping("/vets")
    public String showVetList(Map<String, Object> model) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showVetList(Map)|");

        // Here we are returning an object of type 'Vets' rather than a collection of Vet objects
        // so it is simpler for Object-Xml mapping
        Vets vets = getVets();
        model.put("vets", vets);
        return "vets/vetList";
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showVetList(Map)|");
}
}

    @GetMapping(value = "/vets.json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public
    Vets showJsonVetList() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showJsonVetList()|");

        return getVets();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showJsonVetList()|");
}
}

    @GetMapping(value = "/vets.xml", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public
    Vets showXmlVetList() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showXmlVetList()|");

        return getVets();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::showXmlVetList()|");
}
}

    private Vets getVets() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::getVets()|");

        // Here we are returning an object of type 'Vets' rather than a collection of Vet objects
        // so it is simpler for JSon/Object mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.clinicService.findVets());
        return vets;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/VetController.java::org.springframework.samples.petclinic.web.VetController::getVets()|");
}
}

}
