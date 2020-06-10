/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 6/10/20, 11:38 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.dao;

import io.github.tanu31195.UserFront.domain.Recipient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipientDao extends CrudRepository<Recipient, Long> {
    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}
