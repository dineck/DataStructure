/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure4stack;

/**
 *
 * @author Dinu.Gurita
 */
class StackApp {
    public static void main(String[] args) {
        StackX theStack=new StackX(10);
        //theStack.push(20);
        //theStack.push(40);
        //theStack.push(60);
        //theStack.push(80);
        
        while(!theStack.isEmpty()) {
            long value=theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
