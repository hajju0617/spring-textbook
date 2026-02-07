package com.project.usingthespringwebscopes.ch9.ex3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope       // 세션 스코프.
public class LoggedUserManagementService3 {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
