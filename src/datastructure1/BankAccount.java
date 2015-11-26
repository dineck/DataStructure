/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure1;

/**
 *
 * @author Dinu.Gurita
 */

public class BankAccount {
   
    private double balance;
    
    public BankAccount(double openingBalance) {
        balance=openingBalance;
    }
    
    public void deposit(double amount) {
        balance=balance+amount;
    }
    
    public void withdraw(double amount) {
        balance=balance-amount;
    }
    
    public void display() {
        System.out.println("Balance=" + balance);
    }
}
