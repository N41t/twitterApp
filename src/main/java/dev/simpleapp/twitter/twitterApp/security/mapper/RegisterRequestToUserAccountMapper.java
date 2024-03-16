package dev.simpleapp.twitter.twitterApp.security.mapper;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import dev.simpleapp.twitter.twitterApp.security.web.model.RegisterRequest;

public interface RegisterRequestToUserAccountMapper extends Mapper<UserAccount, RegisterRequest> {
}
