package dev.simpleapp.twitter.twitterApp.security.mapper.impl;

import dev.simpleapp.twitter.twitterApp.security.mapper.UserAccountToUserMapper;
import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class UserAccountToUserMapperImpl implements UserAccountToUserMapper {
    @Override
    public User map(UserAccount userAccount) {
        return new User(
                userAccount.getUsername(),
                userAccount.getPassword(),
                userAccount.getAuthorities()
        );
    }
}
