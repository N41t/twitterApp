package dev.simpleapp.twitter.twitterApp.security.mapper;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import org.springframework.security.core.userdetails.User;


public interface UserAccountToUserMapper extends Mapper<User, UserAccount>{
}
