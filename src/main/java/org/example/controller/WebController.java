package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Person;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ui")
@RequiredArgsConstructor
public class WebController {

    private final UserService userService;

    @GetMapping("/persons")
    public String persons(Model page) {
        List<Person> persons = userService.getUsers();
        page.addAttribute("color", "red");
        page.addAttribute("persons", persons);

        return "person.html";
    }

}
