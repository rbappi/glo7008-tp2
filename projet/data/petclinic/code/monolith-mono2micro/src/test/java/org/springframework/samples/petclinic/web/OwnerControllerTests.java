package org.springframework.samples.petclinic.web;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for {@link OwnerController}
 *
 * @author Colin But
 */

@SpringJUnitWebConfig(locations = {"classpath:spring/mvc-test-config.xml", "classpath:spring/mvc-core-config.xml"})
class OwnerControllerTests {

    private static final int TEST_OWNER_ID = 1;

    @Autowired
    private OwnerController ownerController;

    @Autowired
    private ClinicService clinicService;

    private MockMvc mockMvc;

    private Owner george;

    @BeforeEach
    void setup() {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::setup()|");

        this.mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();

        george = new Owner();
        george.setId(TEST_OWNER_ID);
        george.setFirstName("George");
        george.setLastName("Franklin");
        george.setAddress("110 W. Liberty St.");
        george.setCity("Madison");
        george.setTelephone("6085551023");
        given(this.clinicService.findOwnerById(TEST_OWNER_ID)).willReturn(george);

    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::setup()|");
}
}

    @Test
    void testInitCreationForm() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitCreationForm()|");

        mockMvc.perform(get("/owners/new"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("owner"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitCreationForm()|");
}
}

    @Test
    void testProcessCreationFormSuccess() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessCreationFormSuccess()|");

        mockMvc.perform(post("/owners/new")
            .param("firstName", "Joe")
            .param("lastName", "Bloggs")
            .param("address", "123 Caramel Street")
            .param("city", "London")
            .param("telephone", "01316761638")
        )
            .andExpect(status().is3xxRedirection());
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessCreationFormSuccess()|");
}
}

    @Test
    void testProcessCreationFormHasErrors() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessCreationFormHasErrors()|");

        mockMvc.perform(post("/owners/new")
            .param("firstName", "Joe")
            .param("lastName", "Bloggs")
            .param("city", "London")
        )
            .andExpect(status().isOk())
            .andExpect(model().attributeHasErrors("owner"))
            .andExpect(model().attributeHasFieldErrors("owner", "address"))
            .andExpect(model().attributeHasFieldErrors("owner", "telephone"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessCreationFormHasErrors()|");
}
}

    @Test
    void testInitFindForm() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitFindForm()|");

        mockMvc.perform(get("/owners/find"))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("owner"))
            .andExpect(view().name("owners/findOwners"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitFindForm()|");
}
}

    @Test
    void testProcessFindFormSuccess() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormSuccess()|");

        given(this.clinicService.findOwnerByLastName("")).willReturn(Lists.newArrayList(george, new Owner()));

        mockMvc.perform(get("/owners"))
            .andExpect(status().isOk())
            .andExpect(view().name("owners/ownersList"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormSuccess()|");
}
}

    @Test
    void testProcessFindFormByLastName() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormByLastName()|");

        given(this.clinicService.findOwnerByLastName(george.getLastName())).willReturn(Lists.newArrayList(george));

        mockMvc.perform(get("/owners")
            .param("lastName", "Franklin")
        )
            .andExpect(status().is3xxRedirection())
            .andExpect(view().name("redirect:/owners/" + TEST_OWNER_ID));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormByLastName()|");
}
}

    @Test
    void testProcessFindFormNoOwnersFound() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormNoOwnersFound()|");

        mockMvc.perform(get("/owners")
            .param("lastName", "Unknown Surname")
        )
            .andExpect(status().isOk())
            .andExpect(model().attributeHasFieldErrors("owner", "lastName"))
            .andExpect(model().attributeHasFieldErrorCode("owner", "lastName", "notFound"))
            .andExpect(view().name("owners/findOwners"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessFindFormNoOwnersFound()|");
}
}

    @Test
    void testInitUpdateOwnerForm() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitUpdateOwnerForm()|");

        mockMvc.perform(get("/owners/{ownerId}/edit", TEST_OWNER_ID))
            .andExpect(status().isOk())
            .andExpect(model().attributeExists("owner"))
            .andExpect(model().attribute("owner", hasProperty("lastName", is("Franklin"))))
            .andExpect(model().attribute("owner", hasProperty("firstName", is("George"))))
            .andExpect(model().attribute("owner", hasProperty("address", is("110 W. Liberty St."))))
            .andExpect(model().attribute("owner", hasProperty("city", is("Madison"))))
            .andExpect(model().attribute("owner", hasProperty("telephone", is("6085551023"))))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testInitUpdateOwnerForm()|");
}
}

    @Test
    void testProcessUpdateOwnerFormSuccess() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessUpdateOwnerFormSuccess()|");

        mockMvc.perform(post("/owners/{ownerId}/edit", TEST_OWNER_ID)
            .param("firstName", "Joe")
            .param("lastName", "Bloggs")
            .param("address", "123 Caramel Street")
            .param("city", "London")
            .param("telephone", "01616291589")
        )
            .andExpect(status().is3xxRedirection())
            .andExpect(view().name("redirect:/owners/{ownerId}"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessUpdateOwnerFormSuccess()|");
}
}

    @Test
    void testProcessUpdateOwnerFormHasErrors() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessUpdateOwnerFormHasErrors()|");

        mockMvc.perform(post("/owners/{ownerId}/edit", TEST_OWNER_ID)
            .param("firstName", "Joe")
            .param("lastName", "Bloggs")
            .param("city", "London")
        )
            .andExpect(status().isOk())
            .andExpect(model().attributeHasErrors("owner"))
            .andExpect(model().attributeHasFieldErrors("owner", "address"))
            .andExpect(model().attributeHasFieldErrors("owner", "telephone"))
            .andExpect(view().name("owners/createOrUpdateOwnerForm"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testProcessUpdateOwnerFormHasErrors()|");
}
}

    @Test
    void testShowOwner() throws Exception {
try {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Entering monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testShowOwner()|");

        mockMvc.perform(get("/owners/{ownerId}", TEST_OWNER_ID))
            .andExpect(status().isOk())
            .andExpect(model().attribute("owner", hasProperty("lastName", is("Franklin"))))
            .andExpect(model().attribute("owner", hasProperty("firstName", is("George"))))
            .andExpect(model().attribute("owner", hasProperty("address", is("110 W. Liberty St."))))
            .andExpect(model().attribute("owner", hasProperty("city", is("Madison"))))
            .andExpect(model().attribute("owner", hasProperty("telephone", is("6085551023"))))
            .andExpect(view().name("owners/ownerDetails"));
    
}
finally {

java.lang.System.out.println("|v2.0.0r45|"+java.lang.String.valueOf(java.lang.System.currentTimeMillis())+",["+java.lang.String.valueOf(java.lang.Thread.currentThread().getId())+"],"+"Exiting monolith/src/test/java/org/springframework/samples/petclinic/web/OwnerControllerTests.java::org.springframework.samples.petclinic.web.OwnerControllerTests::testShowOwner()|");
}
}

}
