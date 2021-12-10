package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.ControllerTests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@Tag
class IndexControllerTest implements ControllerTests {

    private IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");

        assertEquals("index", controller.index(), () -> "Another expensive guy" + "make me only if you have to!!");

//        assertThat(ValueNotFoundException.class, () -> {
//            controller.oopsHandler();
//        });

    }

//    private void assertThat(Class<ValueNotFoundException> valueNotFoundExceptionClass, Object o) {
//    }

    @Test
    @DisplayName("Test Exception")
    void oopsHandler() {
//        assertTrue("not implemented".equals(controller.oopsHandler()), () -> "This is some expensive" +
//                "message to build" +
//                "for my test!!");
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oopsHandler();
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I got here");
        });

    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeoutPreempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I got here PREEMTIVELY");
        });
    }

    @Test
    void testAssumptionTrue(){
        assumeTrue("Guru".equals("Guru"));
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testMeOnMacOS(){}

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testMeOnWindows(){}

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testMeOnJava8(){}

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testMeOnJava11(){}

    @Test
    @EnabledIfEnvironmentVariable(named= "USER", matches = "bentagtow")
    void testIfUserBen(){}

}