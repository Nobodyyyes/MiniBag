package kg.megalab.demo.controller;

import ch.qos.logback.core.model.Model;
import kg.megalab.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class StudentController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public String getUserProfile(@PathVariable Long id, Model model) {
        User user = userService
    }
}
