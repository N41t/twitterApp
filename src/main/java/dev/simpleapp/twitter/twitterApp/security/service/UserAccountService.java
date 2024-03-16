package dev.simpleapp.twitter.twitterApp.security.service;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserAccountService {
    void createUserAccount(UserAccount userAccount);

    Optional<UserDetails> findUserByUsername(String username);
}
