package com.jojoldu.book.springboot.web.pratice;

import com.jojoldu.book.springboot.web.pratice.Controller.EchoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// TODO: 필요한 import (Autowired, WebMvcTest, MockMvc, get, status, content)

@WebMvcTest(controllers = EchoController.class)

public class EchoControllerTest {

    @Autowired

    private MockMvc mvc;

    @Test

    public void spring을_거꾸로_뒤집으면_gnirps() throws Exception {

        // TODO: GET /echo/spring 요청 → status 200 → content "gnirps" 검증
        mvc.perform(get("/echo/spring"))
                .andExpect(status().isOk())
                .andExpect(content().string("gnirps"));

    }
//    @Test
//    public void health가_리턴된다() throws Exception {
//        mvc.perform(get("/echo/{message}"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("gnirps"));
//    }

}
