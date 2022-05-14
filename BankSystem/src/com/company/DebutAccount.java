package com.company;

public class DebutAccount extends Account {

    //public Integer cashAmmount;
    //лимит на снятие и перевод

    @Override
    public void send(Account receiver, Integer sum) {
        if (sum > this.cashAmmount) {
            System.out.println("not enough money");
        } else if ( (!this.approved) && (sum > sendLimit) ) {
            System.out.println("you hired the send limit for not verified used, you can't send more than: " + this.sendLimit);
        } else {
            this.cashAmmount -= sum;
            receiver.receive(this.accountId, sum);
        }
    }
    @Override
    public void receive(Integer sendlersAccountId, Integer sum) {
        this.cashAmmount += sum;
    }

    @Override
    public void withdraw(Integer sum) {
        if (sum > this.cashAmmount) {
            System.out.println("not enough money");
        } else if ( (!approved) && (sum > this.withdrawLimit) ) {
            System.out.println("you hired the send limit for not verified used, you can't withdraw more than: " + this.withdrawLimit);
        } else {
            this.cashAmmount -= sum;
        }
    }

    @Override
    public void refill(Integer sum) {
        this.cashAmmount += sum;
    }
}
