package com.project.usingthespringwebscopes.ch9.ex1;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope   // 요청 스코프 지정.
public class LoginProcessor {
    private String username;
    private String password;

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();
        if ("asdf".equals(username) && "1234".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
