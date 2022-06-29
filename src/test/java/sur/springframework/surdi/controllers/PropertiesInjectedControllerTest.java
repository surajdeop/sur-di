package sur.springframework.surdi.controllers;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}