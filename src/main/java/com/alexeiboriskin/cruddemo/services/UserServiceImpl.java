package com.alexeiboriskin.cruddemo.services;

import com.alexeiboriskin.cruddemo.domain.User;
import com.alexeiboriskin.cruddemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> getAllUsers() {
        Set<User> usersSet = new HashSet<>();

        userRepository.findAll().iterator().forEachRemaining(usersSet::add);
        return usersSet;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findOne(id);
    }
}

