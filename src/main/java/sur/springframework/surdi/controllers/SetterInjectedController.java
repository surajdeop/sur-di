package sur.springframework.surdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sur.springframework.surdi.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
