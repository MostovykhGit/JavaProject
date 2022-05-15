package com.company;

public abstract class Account {
    public Integer ownersId;
    public Integer accountId;
    public Bank bank;
    //public Integer buffer;
    public Integer cashAmmount;
    public Integer sendLimit;
    public Integer withdrawLimit;
    public boolean approved;
    //public void transaction(){}
    public void send(Account receiver, Integer sum){}
    public void receive(Integer sendlersAccountId, Integer sum){}
    public void withdraw(Integer sum){}
    public void refill(Integer sum){}


}
