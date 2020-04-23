/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/23/20, 2:33 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.dao;

import io.github.tanu31195.UserFront.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}
