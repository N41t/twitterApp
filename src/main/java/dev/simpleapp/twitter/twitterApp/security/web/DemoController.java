package dev.simpleapp.twitter.twitterApp.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping("/just-auth")
    public String hitJustAuthEndpoint() {
        return "This is protected resourse";
    }

    @GetMapping("/just-role-user")
    public String hitJustRoleUserEndpoint() {
        return "This is protected resourse";
    }

    @GetMapping("/just-role-admin")
    public String hitJustRoleAdminEndpoint() {
        return "This is protected resourse";
    }
}
