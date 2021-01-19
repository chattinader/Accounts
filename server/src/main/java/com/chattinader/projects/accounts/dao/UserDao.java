package com.chattinader.projects.accounts.dao;

import com.chattinader.projects.accounts.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    default String insertUser(User user) {
        return insertUser(user);
    }

    List<User> selectAllUsers();

    Optional<User> selectUserById(String id);

    String deleteUserById(String id);

    String updateUserById(User user);

}
