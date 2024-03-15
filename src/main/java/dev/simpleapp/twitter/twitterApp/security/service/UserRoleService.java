package dev.simpleapp.twitter.twitterApp.security.service;

import dev.simpleapp.twitter.twitterApp.security.model.UserRole;

import java.util.Optional;

public interface UserRoleService {
    Optional<UserRole> findUserRole();
}
