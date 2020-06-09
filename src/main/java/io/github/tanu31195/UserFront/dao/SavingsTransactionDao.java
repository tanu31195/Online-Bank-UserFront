/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 6/7/20, 11:24 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.dao;

import io.github.tanu31195.UserFront.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
