package dev.simpleapp.twitter.twitterApp.security.web;

import dev.simpleapp.twitter.twitterApp.security.service.UserAccountService;
import dev.simpleapp.twitter.twitterApp.security.service.UserRoleService;
import dev.simpleapp.twitter.twitterApp.security.web.model.RegisterRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/accounts")
public class UserAccountController {

    private final UserAccountService userAccountService;
    private final UserRoleService userRoleService;
    private final PasswordEncoder passwordEncoder;

    public UserAccountController(UserAccountService userAccountService,
                                 UserRoleService userRoleService,
                                 PasswordEncoder passwordEncoder) {
        this.userAccountService = userAccountService;
        this.userRoleService = userRoleService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerAccount(@RequestBody RegisterRequest registerRequest) {
        log.info("Register request: {}", registerRequest);
    }

}
