/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 6/7/20, 11:05 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.service;

import io.github.tanu31195.UserFront.domain.PrimaryAccount;
import io.github.tanu31195.UserFront.domain.PrimaryTransaction;
import io.github.tanu31195.UserFront.domain.SavingsAccount;
import io.github.tanu31195.UserFront.domain.SavingsTransaction;

import java.util.List;

public interface TransactionService {
    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
}
