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
package org.springframework.samples.petclinic.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple domain object representing a list of veterinarians. Mostly here to be used for the 'vets' {@link
 * org.springframework.web.servlet.view.xml.MarshallingView}.
 *
 * @author Arjen Poutsma
 */
@XmlRootElement
public class Vets {

    private List<Vet> vetList;

    @XmlElement(name = "vet")
    public List<Vet> getVetList() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/model/Vets.java::org.springframework.samples.petclinic.model.Vets::getVetList()|");

        if (vetList == null) {
            vetList = new ArrayList<>();
        }
        return vetList;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/model/Vets.java::org.springframework.samples.petclinic.model.Vets::getVetList()|");
}
}

}
