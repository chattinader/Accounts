package com.chattinader.projects.accounts.api;

import com.chattinader.projects.accounts.model.User;
import com.chattinader.projects.accounts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public void addUser(@Valid @NonNull @RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        userService.deleteUser(id);
    }

    @PutMapping(path = "/updateUser/{id}")
    public void updateUser(@PathVariable("id") String id, @Valid @NonNull @RequestBody User userToUpdate) {
        userService.updateUser(userToUpdate);
    }

}
