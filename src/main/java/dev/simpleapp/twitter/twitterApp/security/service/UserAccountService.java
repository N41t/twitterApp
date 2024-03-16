package dev.simpleapp.twitter.twitterApp.security.service;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import java.util.Optional;

public interface UserAccountService {
    void createUserAccount(UserAccount userAccount);

    Optional<UserAccount> findUserByUsername(String username);
}
