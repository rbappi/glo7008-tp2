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


import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.service.ClinicService;

/**
 * Instructs Spring MVC on how to parse and print elements of type 'PetType'. Starting from Spring 3.0, Formatters have
 * come as an improvement in comparison to legacy PropertyEditors. See the following links for more details: - The
 * Spring ref doc: http://static.springsource.org/spring/docs/current/spring-framework-reference/html/validation.html#format-Formatter-SPI
 * - A nice blog entry from Gordon Dickens: http://gordondickens.com/wordpress/2010/09/30/using-spring-3-0-custom-type-converter/
 * <p/>
 * Also see how the bean 'conversionService' has been declared inside /WEB-INF/mvc-core-config.xml
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @author Michael Isvy
 */
public class PetTypeFormatter implements Formatter<PetType> {

    private final ClinicService clinicService;


    @Autowired
    public PetTypeFormatter(ClinicService clinicService) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::PetTypeFormatter(ClinicService)|");

        this.clinicService = clinicService;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::PetTypeFormatter(ClinicService)|");
}
}

    @Override
    public String print(PetType petType, Locale locale) {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::print(PetType, Locale)|");

        return petType.getName();
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::print(PetType, Locale)|");
}
}

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::parse(String, Locale)|");

        Collection<PetType> findPetTypes = this.clinicService.findPetTypes();
        for (PetType type : findPetTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/main/java/org/springframework/samples/petclinic/web/PetTypeFormatter.java::org.springframework.samples.petclinic.web.PetTypeFormatter::parse(String, Locale)|");
}
}

}
