/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/22/20, 5:31 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.service.UserServiceImpl;

import io.github.tanu31195.UserFront.dao.UserDao;
import io.github.tanu31195.UserFront.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserSecurityService implements UserDetailsService {

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);

        if (null == user) {
            LOG.warn("Username {} not found", username);
            throw new UsernameNotFoundException("Username " + username + " not found");
        }

        return user;
    }
}
