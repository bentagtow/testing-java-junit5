package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");

        assertEquals("index", controller.index(), () -> "Another expensive guy" + "make me only if you have to!!");


    }

    @Test
    void oopsHandler() {
        assertTrue("not implemented".equals(controller.oopsHandler()), () -> "This is some expensive" +
                "message to build" +
                "for my test!!");
    }
}