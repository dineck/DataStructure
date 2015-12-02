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
class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    
    public Queue(int s) {
        maxSize=s+1;
        queArray=new long[maxSize];
        front=0;
        rear=-1;
    }
    
    public void insert(long j) {
        if(rear==maxSize-1)
            rear=-1;
        queArray[++rear]=j;
    }
    
    public long remove() {
        long temp=queArray[front++];
        if(front==maxSize)
            front=0;
        return temp;
    }
    
    public long peekFront() {
        return queArray[front];
    }
    
    public boolean isEmpty() {
        return (rear+1==front || (front+maxSize-1==rear));
    }
    
    public boolean isFull() {
        return (rear+2==front || (front+maxSize-2==rear));
    }
    
    public int size() {
        if(rear>=front)
            return rear-front+1;
        else
            return (maxSize-front)+(rear+1);
    }
}
