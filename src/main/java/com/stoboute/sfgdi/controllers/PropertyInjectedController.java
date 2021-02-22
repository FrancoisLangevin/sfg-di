package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Poor method to do
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreething(){

        return greetingService.sayGreeting();
    }
}
