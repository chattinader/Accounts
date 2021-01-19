package com.chattinader.projects.accounts.service;

import com.chattinader.projects.accounts.dao.UserDao;
import com.chattinader.projects.accounts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("Mongo") UserDao userDao) {
        this.userDao = userDao;
    }

    public String addUser(User user){
        userDao.insertUser(user);
        return "Added user with id" + user.getId();
    }

    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }

    public Optional<User> getUserById(String id) {
        return userDao.selectUserById(id);
    }

    public String deleteUser(String id) {
        userDao.deleteUserById(id);
        return "Deleted user with id" + id;
    }

    public String updateUser(User newUser) {
        userDao.updateUserById(newUser);
        return "Updated user with id" + newUser.getId();
    }

}
