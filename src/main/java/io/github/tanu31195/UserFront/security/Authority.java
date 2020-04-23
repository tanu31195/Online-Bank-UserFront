/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/22/20, 5:08 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
