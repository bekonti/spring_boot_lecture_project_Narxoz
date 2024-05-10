package org.example.controller;

import org.example.dto.DeviceDto;
import org.example.entity.Person;
import org.example.service.DeviceService;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;

    private final DeviceService deviceService;

    public HomeController(UserService userService, DeviceService deviceService) {
        this.userService = userService;
        this.deviceService = deviceService;
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
    public List<Person> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/person/{name}")
    public List<Person> getUserByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }


    @PostMapping("/device")
    public String addDevice(@RequestBody DeviceDto device) {
        return deviceService.addDevice(device) ? "Added" : "Not Added";
    }

    @GetMapping("/test")
    public String test() {
//        repo.storeData();
        return "123";
    }
}
