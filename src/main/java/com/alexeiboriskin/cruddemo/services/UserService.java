package com.alexeiboriskin.cruddemo.services;

import com.alexeiboriskin.cruddemo.domain.User;

import java.util.Set;

public interface UserService {
    Set<User> getAllUsers ();
    User getById(Long id);
}
