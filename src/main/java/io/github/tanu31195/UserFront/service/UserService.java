/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 3/1/20, 8:11 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.service;

import io.github.tanu31195.UserFront.domain.User;
import io.github.tanu31195.UserFront.security.UserRole;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save(User user);

    User createUser(User user, Set<UserRole> userRoles);

}
