package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.JwtAuthResponse;
import org.example.dto.SignInRequest;
import org.example.dto.SignUpRequest;
import org.example.service.AuthService;
import org.example.service.UserService;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthContoller {

    private final AuthService authService;

    @PostMapping("/register")
    public JwtAuthResponse registerUser(@RequestBody SignUpRequest request) {
        return authService.registerUser(request);
    }

    @PostMapping("/login")
    public JwtAuthResponse loginUser(@RequestBody SignInRequest request) {
        return authService.loginUser(request);
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "LOGIN PAGE!";
    }

}
