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
class Reverser {
    private String input;
    private String output;
    
    public Reverser(String in) {
        input=in;
    }
    
    public String doRev() {
        int stackSize=input.length();
        StackX theStack=new StackX(stackSize);
        
        for(int j=0;j<input.length();j++) {
            char ch=input.charAt(j);
            theStack.push(ch);
        }
        
        output="";
        while(!theStack.isEmpty()) {
//            char ch=theStack.pop();
//            output=output+ch;
        }
        return output;
    }
}
