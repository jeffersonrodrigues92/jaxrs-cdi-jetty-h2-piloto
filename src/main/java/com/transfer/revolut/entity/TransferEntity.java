package com.transfer.revolut.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transfer")
public class TransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private AccountEntity bankAccountOrigin;
    @OneToOne
    private AccountEntity bankAccountDestination;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AccountEntity getBankAccountOrigin() {
        return bankAccountOrigin;
    }

    public void setBankAccountOrigin(AccountEntity bankAccountOrigin) {
        this.bankAccountOrigin = bankAccountOrigin;
    }

    public AccountEntity getBankAccountDestination() {
        return bankAccountDestination;
    }

    public void setBankAccountDestination(AccountEntity bankAccountDestination) {
        this.bankAccountDestination = bankAccountDestination;
    }
}
