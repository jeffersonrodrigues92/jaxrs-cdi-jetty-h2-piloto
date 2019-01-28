package com.transfer.revolut.dto;

import java.io.Serializable;

public class TransferDTO implements Serializable {


    private AccountDTO accountOrigin;
    private AccountDTO accountDestination;


    public AccountDTO getAccountOrigin() {
        return accountOrigin;
    }

    public void setAccountOrigin(AccountDTO accountOrigin) {
        this.accountOrigin = accountOrigin;
    }

    public AccountDTO getAccountDestination() {
        return accountDestination;
    }

    public void setAccountDestination(AccountDTO accountDestination) {
        this.accountDestination = accountDestination;
    }
}
