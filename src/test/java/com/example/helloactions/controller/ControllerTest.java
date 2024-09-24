package com.example.helloactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(controllers = WelcomeController.class)
class WelcomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testController() throws Exception {
        mockMvc.perform(get("/welcome"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"));
    }
}