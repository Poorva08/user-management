package usermanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import usermanagement.model.User;
import usermanagement.service.UserService;

@Controller
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewUsers(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "redirect:/";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user) {
        service.saveUser(user);
        return "redirect:/";
    }
}
