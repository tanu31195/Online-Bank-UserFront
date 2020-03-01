/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 3/1/20, 8:14 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.dao;

import io.github.tanu31195.UserFront.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}
