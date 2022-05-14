package com.company;

public class AccountFactory {
    public Account createAccount (AccountType type) {
        Account account = null;

        switch (type) {
            case DEBUT:
                account = new DebutAccount();
                break;
            case DEPOSIT:
                account = new DepositAccount();
                break;
            case CREDIT:
                account = new CreditAccount();
                break;
        }

        return account;
    }
}