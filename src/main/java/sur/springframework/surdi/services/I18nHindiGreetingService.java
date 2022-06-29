package sur.springframework.surdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HN", "default"})
@Service("i18nService")
public class I18nHindiGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Namaste Duniya - Hindi";
    }
}
