package dev.simpleapp.twitter.twitterApp.security.repository;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

}
