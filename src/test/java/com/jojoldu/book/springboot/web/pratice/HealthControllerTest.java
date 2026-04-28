package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.web.pratice.Controller.HealthController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HealthController.class)
public class HealthControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void health가_리턴된다() throws Exception {
        mvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status", is("OK")));
    }
    @Test
    public void healthDto가_리턴된다() throws Exception {
        mvc.perform(get("/health/dto"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status", is("OK")));
    }
}