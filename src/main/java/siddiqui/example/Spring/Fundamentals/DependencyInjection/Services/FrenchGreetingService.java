package siddiqui.example.Spring.Fundamentals.DependencyInjection.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"FR", "default"})
@Service
public class FrenchGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Bonjour!";
    }
}
