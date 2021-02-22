package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.GreetingService;

//Poor method to do
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreething(){
        return greetingService.sayGreeting();
    }
}
