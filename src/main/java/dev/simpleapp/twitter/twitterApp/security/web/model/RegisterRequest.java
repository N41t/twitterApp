package dev.simpleapp.twitter.twitterApp.security.web.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(
        @Email @NotBlank
        String username,
        @NotBlank
        String password) {
}
