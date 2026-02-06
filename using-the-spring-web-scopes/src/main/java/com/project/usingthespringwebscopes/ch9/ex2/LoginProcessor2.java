package com.project.usingthespringwebscopes.ch9.ex2;

import com.project.usingthespringwebscopes.ch9.ex2.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope   // 요청 스코프 지정.
public class LoginProcessor2 {
    private final LoggedUserManagementService loggedUserManagementService;
    private String username;
    private String password;

    public LoginProcessor2(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();
        boolean loginResult = false;
        if ("asdf".equals(username) && "1234".equals(password)) {
            loginResult = true;
            // ↓ loggedUserManagementService 빈에 username 저장.
            loggedUserManagementService.setUsername(username);
        }
        return loginResult;
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
