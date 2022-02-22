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
        int deposit = 0;
        for (CashMachine maschine: cashMachines) {
            deposit += maschine.numberOfDeposit();
            }
        return deposit / this.cashMachines.length;
    }
    public int averageWithdraw() {
        int withdraw = 0;
        for (CashMachine maschine: cashMachines) {
            withdraw -= maschine.numberOfWithdraw();
        }
        return withdraw / this.cashMachines.length;
    }
}
