package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);

    User findById(int id);

    void update(int id, User user);

    void remove(int id);
}
