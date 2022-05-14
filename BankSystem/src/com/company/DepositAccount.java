package com.company;

public class DepositAccount extends Account {
    public boolean isClosed;
    public Double depositRate;
    //TODO: реализовать начисление процентов + работу с датами закрытия и открытия

    @Override
    public void send(Account receiver, Integer sum){
        if (!this.isClosed) {
            System.out.println("You should close your deposit to use it's money");
        } else if (sum > this.cashAmmount) {
            System.out.println("not enough money");
        } else if ( (!this.approved) && (sum > this.sendLimit) ) {
            System.out.println("you hired the send limit for not verified used, you can't send more than: " + this.sendLimit);
        } else {
            this.cashAmmount -= sum;
            receiver.receive(this.accountId, sum);
        }
    }
    @Override
    public void receive(Integer sendlersAccouuntId, Integer sum) {
        if (!this.isClosed) {
            System.out.println("You should close your deposit to receive money");
            //TODO: отправить обратно деньги по SendlersAccountId
        } else {
            this.cashAmmount += sum;
        }
    }

    @Override
    public void withdraw(Integer sum) {
        if (!this.isClosed) {
            System.out.println("You should close your deposit to withdraw money");
        } else if (sum > this.cashAmmount) {
            System.out.println("not enough money");
        } else if ( (!this.approved) && (sum > this.withdrawLimit) ) {
            System.out.println("you hired the send limit for not verified used, you can't send more than: " + this.withdrawLimit);
        } else {
            this.cashAmmount -= sum;
        }
    }
    public void refill(Integer sum) {
        if (!this.isClosed) {
            System.out.println("You should close your deposit to withdraw money");
        } else {
            this.cashAmmount += sum;
        }
    }

}
