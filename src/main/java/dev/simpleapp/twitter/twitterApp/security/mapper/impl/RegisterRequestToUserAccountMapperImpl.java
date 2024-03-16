package dev.simpleapp.twitter.twitterApp.security.mapper.impl;

import dev.simpleapp.twitter.twitterApp.security.mapper.RegisterRequestToUserAccountMapper;
import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import dev.simpleapp.twitter.twitterApp.security.model.UserRole;
import dev.simpleapp.twitter.twitterApp.security.service.UserRoleService;
import dev.simpleapp.twitter.twitterApp.security.web.model.RegisterRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Set;

@Component
public class RegisterRequestToUserAccountMapperImpl implements RegisterRequestToUserAccountMapper {

    private final UserRoleService userRoleService;
    private final PasswordEncoder passwordEncoder;

    public RegisterRequestToUserAccountMapperImpl(UserRoleService userRoleService, PasswordEncoder passwordEncoder) {
        this.userRoleService = userRoleService;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public UserAccount map(RegisterRequest registerRequest) {
        UserRole userRole = this.userRoleService
                .findUserRole()
                .orElseThrow(() -> new RuntimeException("User role not found"));

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(registerRequest.username().toLowerCase(Locale.ROOT));
        userAccount.setPassword(this.passwordEncoder.encode(registerRequest.password()));
        userAccount.setAuthorities(Set.of(userRole));

        return userAccount;
    }
}
