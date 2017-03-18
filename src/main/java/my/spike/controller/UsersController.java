package my.spike.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsersController {
    @GetMapping("/users")
    public List<String> getUsers(@RequestHeader("userid") String userId) {
        System.out.println("Endpoint validated for user:" + userId);
        return Arrays.asList("user1", "user2");
    }
}
