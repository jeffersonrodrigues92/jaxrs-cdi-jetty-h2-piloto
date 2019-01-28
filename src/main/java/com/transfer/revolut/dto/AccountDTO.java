package com.transfer.revolut.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AccountDTO {

    @NotNull(message = "iban cannot be null")
    private String iban;
    @NotNull(message = "ibic cannot be empty")
    private String bic;
    @NotNull(message = "beneficiary cannot be empty")
    private String beneficiary;
    @NotNull(message = "country cannot be empty")
    private String country;
    @Size(min = 1, max = 3)
    @NotNull(message = "currency cannot be empty")
    private String currency;
    @NotNull(message = "bankName cannot be empty")
    private String bankName;
    @NotNull(message = "email cannot be empty")
    private String email;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
