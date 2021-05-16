package guru.springframework.di.services;

import org.springframework.stereotype.Service;


//@Service("i18nService")
public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo- ES";
    }
}
