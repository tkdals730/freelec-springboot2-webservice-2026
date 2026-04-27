package com.jojoldu.book.springboot.web.pratice.Controller;

import com.jojoldu.book.springboot.web.pratice.dto.HealthResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String hello() {
        return "health";
    }
    @GetMapping("/health/dto")
    public HealthResponseDto health() {
        return new HealthResponseDto("OK", LocalDateTime.now());
    }
}