/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/23/20, 2:31 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.dao;

import io.github.tanu31195.UserFront.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}
