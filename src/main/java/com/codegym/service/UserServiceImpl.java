package com.codegym.service;

import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    public static List<User> users;

    static {
        users = new ArrayList<>();
    }
    @Override
    public User save(User user) {
        users.add(user);

        return user;

    }




    @Override
    public List<User> findAll() {
        return null;
    }



    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void remove(int id) {

    }
}
