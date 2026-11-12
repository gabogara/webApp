package com.example.course.webapp.webApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.example.course.webapp.webApp.controllers.UserController;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldDisplayUserDetails() throws Exception {
        mockMvc.perform(get("/details"))
                .andExpect(status().isOk())
                .andExpect(view().name("details"))
                .andExpect(model().attribute(
                        "title", "Hello World from Spring Boot"))
                .andExpect(model().attribute("firstName", "Gabriel"))
                .andExpect(model().attribute("lastName", "Restrepo"));
    }
}