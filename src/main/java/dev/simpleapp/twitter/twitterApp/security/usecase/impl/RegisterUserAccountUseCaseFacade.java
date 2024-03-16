package dev.simpleapp.twitter.twitterApp.security.usecase.impl;

import dev.simpleapp.twitter.twitterApp.security.mapper.RegisterRequestToUserAccountMapper;
import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import dev.simpleapp.twitter.twitterApp.security.service.UserAccountService;
import dev.simpleapp.twitter.twitterApp.security.usecase.RegisterUserAccountUseCase;
import dev.simpleapp.twitter.twitterApp.security.web.model.RegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserAccountUseCaseFacade implements RegisterUserAccountUseCase {

    private final UserAccountService userAccountService;
    private final RegisterRequestToUserAccountMapper mapper;

    public RegisterUserAccountUseCaseFacade(UserAccountService userAccountService,
                                            RegisterRequestToUserAccountMapper mapper) {
        this.userAccountService = userAccountService;
        this.mapper = mapper;
    }

    @Override
    public void register(RegisterRequest registerRequest) {
        UserAccount userAccount = this.mapper.map(registerRequest);
        this.userAccountService.createUserAccount(userAccount);
    }
}
