package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//prefered method
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // @Autowired //Since 4.2 is not necessary to add autowired annotation
    public ConstructorInjectedController(@Qualifier("constructoreGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreething(){
        return greetingService.sayGreeting();
    }
}
