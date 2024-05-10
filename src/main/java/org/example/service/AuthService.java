package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.JwtAuthResponse;
import org.example.dto.SignInRequest;
import org.example.dto.SignUpRequest;
import org.example.entity.Person;
import org.example.entity.Role;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserService userService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public JwtAuthResponse registerUser(SignUpRequest request) {
        boolean isExists = userService.existsByUsername(request.getUsername());
        if (isExists) {
            return new JwtAuthResponse("");
        }

        Person newPerson = Person.builder()
                .name(request.getName())
                .username(request.getUsername())
                .role(Role.ROLE_USER)
                .age(Integer.parseInt(request.getAge()))
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        userService.addUser(newPerson);

        String token = jwtService.generateToken(newPerson);
        return new JwtAuthResponse(token);
    }


    public JwtAuthResponse loginUser(SignInRequest request) {
        return new JwtAuthResponse(
                jwtService.generateToken(
                        userService.getByUsername(request.getUsername())));
    }
}
