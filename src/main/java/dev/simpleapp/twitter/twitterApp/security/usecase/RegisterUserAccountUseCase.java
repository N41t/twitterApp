package dev.simpleapp.twitter.twitterApp.security.usecase;

import dev.simpleapp.twitter.twitterApp.security.web.model.RegisterRequest;

public interface RegisterUserAccountUseCase {
    void register(RegisterRequest registerRequest);
}
