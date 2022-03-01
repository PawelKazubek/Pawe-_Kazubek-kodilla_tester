package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    @Test
    public void checkBilans() {
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

        Assertions.assertEquals(200, bank.bilans());
    }
    @Test
    public void checkQuantityOfCashDeposit() {
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

        Assertions.assertEquals(6, bank.quantityOfCashDeposit());
    }
    @Test
    public void checkQuantityOfCashWithdraw() {
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

        Assertions.assertEquals(6, bank.quantityOfCashWithdraw());
    }
    @Test
    public void checkGetAverageDeposit() {
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

        Assertions.assertEquals(241, bank.getAverageDeposit());
    }
    @Test
    public void checkGetAverageWithdraw() {
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

        Assertions.assertEquals(-208, bank.getAverageWithdraw());
    }
}
