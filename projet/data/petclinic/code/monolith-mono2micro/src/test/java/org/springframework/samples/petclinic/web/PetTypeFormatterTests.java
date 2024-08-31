package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.service.ClinicService;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PetTypeFormatter}
 *
 * @author Colin But
 */
@ExtendWith(MockitoExtension.class)
class PetTypeFormatterTests {

    @Mock
    private ClinicService clinicService;

    private PetTypeFormatter petTypeFormatter;

    @BeforeEach
    void setup() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::setup()|");

        petTypeFormatter = new PetTypeFormatter(clinicService);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::setup()|");
}
}

    @Test
    void testPrint() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::testPrint()|");

        PetType petType = new PetType();
        petType.setName("Hamster");
        String petTypeName = petTypeFormatter.print(petType, Locale.ENGLISH);
        assertEquals("Hamster", petTypeName);
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::testPrint()|");
}
}

    @Test
    void shouldParse() throws ParseException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::shouldParse()|");

        Mockito.when(clinicService.findPetTypes()).thenReturn(makePetTypes());
        PetType petType = petTypeFormatter.parse("Bird", Locale.ENGLISH);
        assertEquals("Bird", petType.getName());
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::shouldParse()|");
}
}

    @Test
    void shouldThrowParseException() throws ParseException {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::shouldThrowParseException()|");

        Mockito.when(clinicService.findPetTypes()).thenReturn(makePetTypes());
        Assertions.assertThrows(ParseException.class, () -> {
            petTypeFormatter.parse("Fish", Locale.ENGLISH);
        });
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::shouldThrowParseException()|");
}
}

    /**
     * Helper method to produce some sample pet types just for test purpose
     *
     * @return {@link Collection} of {@link PetType}
     */
    private Collection<PetType> makePetTypes() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::makePetTypes()|");

        Collection<PetType> petTypes = new ArrayList<>();
        petTypes.add(new PetType(){
            {
                setName("Dog");
            }
        });
        petTypes.add(new PetType(){
            {
                setName("Bird");
            }
        });
        return petTypes;
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/PetTypeFormatterTests.java::org.springframework.samples.petclinic.web.PetTypeFormatterTests::makePetTypes()|");
}
}

}
