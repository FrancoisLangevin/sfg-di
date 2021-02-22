package com.stoboute.sfgdi.controllers;

import com.stoboute.sfgdi.services.ConstructoreGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructoreGreetingService();
    }

    @Test
    void getGreething() {

        System.out.println(controller.getGreething());
    }
}