package sur.springframework.surdi.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sur.springframework.surdi.services.ConstructorGreetingService;

class PropertiesInjectedControllerTest {
    PropertiesInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertiesInjectedController();
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