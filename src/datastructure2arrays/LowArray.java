/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure2arrays;

/**
 *
 * @author Dinu.Gurita
 */
public class LowArray {
    private long[] a;
    
    public LowArray(int size) {
        a=new long[size];
    }
    
    public void setElem(int index, long value) {
        a[index]=value;
    }
    
    public long getElem(int index) {
        return a[index];
    }
}
