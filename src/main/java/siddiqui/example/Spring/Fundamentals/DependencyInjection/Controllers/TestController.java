package siddiqui.example.Spring.Fundamentals.DependencyInjection.Controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import siddiqui.example.Spring.Fundamentals.DependencyInjection.Services.GreetingService;

@Controller
public class TestController{

    private final GreetingService greetingService;

    public TestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String printTest(){
        return "I am a Test Controller";
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}