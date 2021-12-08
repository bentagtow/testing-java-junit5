package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l, "Joe", "Buck");
        //when


        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck")
        );

    }
    @Test
    void groupedAssertionsMsgs() {
        //given
        Person person = new Person(1l, "Joe", "Buck");
        //when


        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe2", "First name failed"),
                () -> assertEquals(person.getLastName(), "Buck2", "last name failed")
        );

    }
}