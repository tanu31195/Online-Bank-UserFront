/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/23/20, 2:16 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.service;

import io.github.tanu31195.UserFront.domain.PrimaryAccount;
import io.github.tanu31195.UserFront.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);
}
