package com.chattinader.projects.accounts.dao;

import com.chattinader.projects.accounts.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id, user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getGender()));
        return 1;
    }
}
