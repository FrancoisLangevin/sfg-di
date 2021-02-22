package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.GreetingService;

//Ok method to do
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreething(){
        return greetingService.sayGreeting();
    }
}
