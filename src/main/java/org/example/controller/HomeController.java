package org.example;

import org.example.entity.Person;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("")
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String home() {
        return "Welcome, Home!";
    }

    @GetMapping("/deadpool")
    public String deadpool() {
        return "MARVEL!";
    }

    @PostMapping("/person")
    public String addPerson(@RequestBody Person person) {
        userService.addUser(person);
        return "Added";
    }

    @GetMapping("/all-person")
    public List<Person> getAllUsers() {return userService.getUsers();}

    @GetMapping("/person/{name}")
    public List<Person> getUserByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }


}
