package sur.springframework.surdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sur.springframework.surdi.services.GreetingService;

@Controller
public class PropertiesInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
