package my.spike.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @PostMapping("/auth/validate")
    public String authenticate(@RequestParam("token") String userName) {
        final String response = "admin".equals(userName) ? "ok" : "fail";
        System.out.println("Response:"+ response);
        return response;
    }

}

