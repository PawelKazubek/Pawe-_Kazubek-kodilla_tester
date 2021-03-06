package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int transactions = cashMachine.getSumOfTransactions();
        assertEquals(0, transactions);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(3);

        int transactions = cashMachine.getSumOfTransactions();
        assertEquals(2, transactions);
       }
       @Test
    public void checkGetSumOfTransactions() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-300);
        cashMachine.add(100);
        cashMachine.add(-150);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(300);
        cashMachine1.add(100);
        cashMachine1.add(500);
        cashMachine1.add(250);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(-150);
        cashMachine2.add(-100);
        cashMachine2.add(-350);
        cashMachine2.add(-200);

        bank.add(cashMachine);
        bank.add(cashMachine1);
        bank.add(cashMachine2);

        Assertions.assertEquals(-150, cashMachine.getSumOfTransactions());
        Assertions.assertEquals(1150, cashMachine1.getSumOfTransactions());
        Assertions.assertEquals(-800, cashMachine2.getSumOfTransactions());
    }
    @Test
    public void checkNumberOfDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-300);
        cashMachine.add(100);
        cashMachine.add(-150);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(300);
        cashMachine1.add(100);
        cashMachine1.add(500);
        cashMachine1.add(250);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(-150);
        cashMachine2.add(-100);
        cashMachine2.add(-350);
        cashMachine2.add(-200);

        bank.add(cashMachine);
        bank.add(cashMachine1);
        bank.add(cashMachine2);

        Assertions.assertEquals(2, cashMachine.numberOfDeposit());
        Assertions.assertEquals(4, cashMachine1.numberOfDeposit());
        Assertions.assertEquals(0, cashMachine2.numberOfDeposit());
    }
    @Test
    public void checkNumberOfWithdraw() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-300);
        cashMachine.add(100);
        cashMachine.add(-150);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(300);
        cashMachine1.add(100);
        cashMachine1.add(500);
        cashMachine1.add(250);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(-150);
        cashMachine2.add(-100);
        cashMachine2.add(-350);
        cashMachine2.add(-200);

        bank.add(cashMachine);
        bank.add(cashMachine1);
        bank.add(cashMachine2);

        Assertions.assertEquals(2, cashMachine.numberOfWithdraw());
        Assertions.assertEquals(0, cashMachine1.numberOfWithdraw());
        Assertions.assertEquals(4, cashMachine2.numberOfWithdraw());
    }
    @Test
    public void checkSumOfNumberOfDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-300);
        cashMachine.add(100);
        cashMachine.add(-150);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(300);
        cashMachine1.add(100);
        cashMachine1.add(500);
        cashMachine1.add(250);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(-150);
        cashMachine2.add(-100);
        cashMachine2.add(-350);
        cashMachine2.add(-200);

        bank.add(cashMachine);
        bank.add(cashMachine1);
        bank.add(cashMachine2);

        Assertions.assertEquals(300, cashMachine.sumOfNumberOfDeposit());
        Assertions.assertEquals(1150, cashMachine1.sumOfNumberOfDeposit());
        Assertions.assertEquals(0, cashMachine2.sumOfNumberOfDeposit());
    }
    @Test
    public void checkSumOfNumberOfWithdraw() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(-300);
        cashMachine.add(100);
        cashMachine.add(-150);

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(300);
        cashMachine1.add(100);
        cashMachine1.add(500);
        cashMachine1.add(250);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.add(-150);
        cashMachine2.add(-100);
        cashMachine2.add(-350);
        cashMachine2.add(-200);

        bank.add(cashMachine);
        bank.add(cashMachine1);
        bank.add(cashMachine2);

        Assertions.assertEquals(450, cashMachine.sumOfNumberOfWithdraw());
        Assertions.assertEquals(0, cashMachine1.sumOfNumberOfWithdraw());
        Assertions.assertEquals(800, cashMachine2.sumOfNumberOfWithdraw());
    }
}
