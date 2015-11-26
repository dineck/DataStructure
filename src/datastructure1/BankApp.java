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
public class BankApp {
    public static void main(String[] args) {
        BankAccount ba1=new BankAccount(100.0);
        
        System.out.println("Before transitions, ");
        ba1.display();
        
        ba1.deposit(74.35);
        ba1.withdraw(20.00);
        
        System.out.println("After transitions, ");
        ba1.display();
    }
}
