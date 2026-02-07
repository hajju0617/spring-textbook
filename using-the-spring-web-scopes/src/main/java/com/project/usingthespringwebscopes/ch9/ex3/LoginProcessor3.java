package com.project.usingthespringwebscopes.ch9.ex3;

import com.project.usingthespringwebscopes.ch9.ex3.service.LoggedUserManagementService3;
import com.project.usingthespringwebscopes.ch9.ex3.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope   // 요청 스코프 지정.
public class LoginProcessor3 {
    private final LoggedUserManagementService3 loggedUserManagementService3;
    private final LoginCountService loginCountService;
    private String username;
    private String password;

    public LoginProcessor3(LoggedUserManagementService3 loggedUserManagementService3,
                           LoginCountService loginCountService) {
        this.loggedUserManagementService3 = loggedUserManagementService3;
        this.loginCountService = loginCountService;
    }

    public boolean login() {
        loginCountService.increment();

        String username = this.getUsername();
        String password = this.getPassword();
        boolean loginResult = false;
        if ("asdf".equals(username) && "1234".equals(password)) {
            loginResult = true;
            // ↓ loggedUserManagementService 빈에 username 저장.
            loggedUserManagementService3.setUsername(username);
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
