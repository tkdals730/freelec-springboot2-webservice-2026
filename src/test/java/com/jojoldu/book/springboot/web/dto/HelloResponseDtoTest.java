//package com.jojoldu.book.springboot.web.dto;
//
//
//import org.junit.jupiter.api.Test;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.hamcrest.Matchers.is;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class HelloResponseDtoTest {
//
//    @Test
//
//    public void 롬복_기능_테스트() {
//
//        //given
//
//        String name = "test";
//
//        int amount = 1000;
//
//        //when
//
//        HelloResponseDto dto = new HelloResponseDto(name, amount);
//
//        //then
//
//        // assertj라는 테스트 검증 라이브러리의 검증 메소드입니다.
//
//        assertThat(dto.getName()).isEqualTo(name);
//        assertThat(dto.getAmount()).isEqualTo(amount);
//
//    }
//    @Test
//    public void helloDto가_리턴된다() throws Exception {
//        String hello = "hello";
//
//        mvc.perform(
//                get("/hello.dto"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is(name)))
//                .andExpect(jsonPath("$.amount", is(amount)))
//                .andExpect(content().string(hello));
//    }
//}
