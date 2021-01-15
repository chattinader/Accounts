package com.chattinader.projects.accounts.service;

import com.chattinader.projects.accounts.dao.UserDao;
import com.chattinader.projects.accounts.model.User;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user){
        return userDao.insertUser(user);
    }

}
