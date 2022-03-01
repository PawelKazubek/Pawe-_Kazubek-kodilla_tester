package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.size = 0;

    }
    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    public int bilans() {
        int sum = 0;
        for (CashMachine machine : cashMachines) {
            sum += machine.getSumOfTransactions();
        }
        return sum;
    }

    public int quantityOfCashDeposit() {
        int cashDeposit = 0;
        for (int i = 0; i < size; i++) {
            cashDeposit += cashMachines[i].numberOfDeposit();
        }
        return cashDeposit;
    }
    public int quantityOfCashWithdraw() {
        int cashWithdraw = 0;
        for (int i = 0; i < size; i++) {
            cashWithdraw += cashMachines[i].numberOfWithdraw();
        }
        return cashWithdraw*-1;
    }

    public int getAverageDeposit() {
        int deposit = 0;
        for (CashMachine machine: cashMachines) {
            deposit += machine.sumOfNumberOfDeposit();
        }
        return deposit / quantityOfCashDeposit();
    }
    public int getAverageWithdraw() {
        int withdraw = 0;
        for (CashMachine machine: cashMachines) {
            withdraw += machine.sumOfNumberOfWithdraw();
        }
        return withdraw / quantityOfCashWithdraw()*-1;
    }
}
