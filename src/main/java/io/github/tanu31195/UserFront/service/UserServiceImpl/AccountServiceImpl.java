/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/23/20, 2:17 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.service.UserServiceImpl;

import io.github.tanu31195.UserFront.dao.PrimaryAccountDao;
import io.github.tanu31195.UserFront.dao.SavingsAccountDao;
import io.github.tanu31195.UserFront.domain.PrimaryAccount;
import io.github.tanu31195.UserFront.domain.SavingsAccount;
import io.github.tanu31195.UserFront.service.AccountService;
import io.github.tanu31195.UserFront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 11223145;
    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;

    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal("0.0"));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    private int accountGen() {
        return ++nextAccountNumber;
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal("0.0"));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }
}
