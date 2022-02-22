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
        for (CashMachine machine: cashMachines) {
            sum += machine.getSumOfTransactions();
        }
        return sum;
    }
    public int averageDeposit() {
        int sum = 0;
        for (int i = 0; i > this.cashMachines.length; i++) {
            sum = this.cashMachines[i];
        }
        return sum/this.cashMachines.length;
    }
    public int averageWithdraw() {
        int sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum = this.cashMachines[i];
        }
        return sum/this.cashMachines.length;
    }
}
