package com.company;
import java.util.ArrayList;

public class Bank {
    //TODO: Клиентская база
    //TODO: База счетов
    public Integer sendLimit;
    public Integer withdrawLimit;
    public Integer creditLimit;
    public void rejectionOfTransaction(Account sendler, Account receiver, Integer sum) {
        sendler.receive(receiver.accountId, sum);
        receiver.withdraw(sum);
    }


    //открытие счета
    private AccountFactory accountFactory;

    public Bank(AccountFactory accountFactory) {
        this.accountFactory = accountFactory;
    }

    public Account makeAccount(AccountType type, Client client) {
        Account account = accountFactory.createAccount(type);
        //TODO: дать аккаунту уникальный accountId
        account.ownersId = client.id;
        account.bank = this;
        account.cashAmmount = 0;
        account.sendLimit = this.sendLimit;
        account.withdrawLimit = this.withdrawLimit;
        if (client.verified) {
            account.approved = true;
        } else {
            account.approved = false;
        }

        System.out.println("Your new account is opened");
        return account;
    }

}
