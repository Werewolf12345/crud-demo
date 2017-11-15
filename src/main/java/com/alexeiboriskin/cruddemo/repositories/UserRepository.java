package com.alexeiboriskin.cruddemo.repositories;

import com.alexeiboriskin.cruddemo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
