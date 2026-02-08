package com.project.implementingrestservices.ch10.ex1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest                 // 스프링 부트의 전체 애플리케이션 컨텍스트를 로드.
@AutoConfigureMockMvc           // MockMvc를 자동으로 설정하고 빈으로 등록.
class HelloController2Test {
    @Autowired
    private MockMvc mockMvc;    // 톰캣(서블릿 컨테이너)을 실행하지 않고 스프링 내부에서 HTTP 요청과 응답을 테스트.

    @Test
    void hello() throws Exception {
        mockMvc.perform(get("/hello2"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello"));
    }

    @Test
    void ciao() throws Exception {
        mockMvc.perform(get("/ciao2"))
                .andExpect(status().isOk())
                .andExpect(content().string("Ciao"));
    }
}