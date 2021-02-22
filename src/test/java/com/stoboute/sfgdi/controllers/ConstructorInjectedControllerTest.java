package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.ConstructoreGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructoreGreetingService());
    }

    @Test
    void getGreething() {
        System.out.println(controller.getGreething());
    }
}