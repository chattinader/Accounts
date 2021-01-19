package com.chattinader.projects.accounts.dao;

import com.chattinader.projects.accounts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Repository("Mongo")
public class UserDataAccessService implements UserDao {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserDataAccessService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public String insertUser(@RequestBody User user) {
        mongoTemplate.save(user, "Users");
        return "Added user with id" + user.getId();
    }

    @Override
    public List<User> selectAllUsers() {
        return mongoTemplate.findAll(User.class, "Users");
    }

    @Override
    public Optional<User> selectUserById(String id) {
        return Optional.ofNullable(mongoTemplate.findById(id, User.class, "Users"));
    }

    @Override
    public String deleteUserById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class, "Users");
        return "Deleted user with id" + id;
    }

    @Override
    public String updateUserById(@RequestBody User user) {
        mongoTemplate.save(user, "Users");
        return "Updated user with id" + user.getId();
    }

}
