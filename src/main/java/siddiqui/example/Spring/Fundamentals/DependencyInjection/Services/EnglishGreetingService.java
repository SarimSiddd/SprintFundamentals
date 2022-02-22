package siddiqui.example.Spring.Fundamentals.DependencyInjection.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service
public class EnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello";
    }
}
