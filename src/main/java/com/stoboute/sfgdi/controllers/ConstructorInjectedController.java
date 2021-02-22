package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.GreetingService;

//prefered method
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreething(){
        return greetingService.sayGreeting();
    }
}
