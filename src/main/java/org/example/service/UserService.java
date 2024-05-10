package org.example.service;

import org.example.dto.JwtAuthResponse;
import org.example.dto.SignUpRequest;
import org.example.entity.Person;
import org.example.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void addUser(Person person) {
        repository.save(person);
    }

    public List<Person> getUsersByName(String name) {
        return repository.getAllByName(name);
    }

    public List<Person> getUsers() {
        return repository.findAll();
    }

    public Person getByUsername(String username) {
        return repository.getByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("Пользователь не найден"));
    }

    public boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    public UserDetailsService userDetailsService() {
        return this::getByUsername;
    }
}
