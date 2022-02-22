package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }
    public int getSumOfTransactions() {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }
    public int numberOfDeposit() {
        int count = 0;
        for (int tx: transactions) {
            if (tx > 0) {
                count++;
            }
        }
        return count;
    }
    public int numberOfWithdraw() {
        int count = 0;
        for (int tx: transactions) {
            if (tx < 0) {
                count--;
            }
        }
        return count;
    }
}
