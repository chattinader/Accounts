package com.chattinader.projects.accounts.api;

import com.chattinader.projects.accounts.model.User;
import com.chattinader.projects.accounts.service.UserService;

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user);
    }

}
