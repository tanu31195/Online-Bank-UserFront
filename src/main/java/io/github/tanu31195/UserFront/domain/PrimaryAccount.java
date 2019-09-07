/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 9/7/19, 4:25 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.UserFront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {
    private long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTransaction> primaryTransactionList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<PrimaryTransaction> getPrimaryTransactionList() {
        return primaryTransactionList;
    }

    public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
        this.primaryTransactionList = primaryTransactionList;
    }
}
