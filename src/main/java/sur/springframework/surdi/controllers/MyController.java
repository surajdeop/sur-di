package sur.springframework.surdi.controllers;

import org.springframework.stereotype.Controller;
import sur.springframework.surdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
