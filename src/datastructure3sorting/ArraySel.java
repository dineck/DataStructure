/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure3sorting;

/**
 *
 * @author Dinu.Gurita
 */
class ArraySel {
    private long[] a;
    private int nElems;
    
    public ArraySel(int max) {
        a=new long[max];
        nElems=0;
    }
    
    public void insert(long value) {
        a[nElems]=value;
        nElems++;
    }
    
    public void display() {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j]+" ");
        System.out.println("");
    }
    
    public void selectionSort() {
        int out, in, min;
        for(out=0; out<nElems; out++) {
            min=out;
            for(in=out+1; in<nElems; in++)
                if(a[in]<a[min])
                    min=in;
            swap(out, min);
        }
    }
    
    private void swap(int one, int two) {
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }
}
