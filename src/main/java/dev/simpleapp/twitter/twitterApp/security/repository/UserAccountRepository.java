package dev.simpleapp.twitter.twitterApp.security.repository;

import dev.simpleapp.twitter.twitterApp.security.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    boolean existsByUsername(String username);

    Optional<UserDetails> findByUsername(String username);
}
