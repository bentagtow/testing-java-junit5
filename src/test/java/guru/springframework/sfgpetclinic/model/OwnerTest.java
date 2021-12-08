package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions(){
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Denver");
        owner.setTelephone("555555555");
    }

}