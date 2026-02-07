package com.project.usingthespringwebscopes.ch9.ex3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope       // 애플리케이션 스코프.
public class LoginCountService {
    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return this.count;
    }
}
