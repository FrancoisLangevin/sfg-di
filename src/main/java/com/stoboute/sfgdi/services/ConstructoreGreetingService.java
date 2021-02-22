package com.stoboute.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructoreGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Stoboute! - Constructor";
    }
}
