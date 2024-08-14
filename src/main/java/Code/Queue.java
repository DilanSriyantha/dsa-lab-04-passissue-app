/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author DilanSriyantha
 */
public class Queue {
    private int maxSize;
    private GamePass[] queueArray;
    public int front;
    public int rear;
    public int nItems;
    
    public Queue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new GamePass[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean isEmpty() {
        return nItems == 0;
    }
    
    public boolean isFull() {
        return nItems == maxSize;
    }
    
    public void enqueue(GamePass gp){
        if(rear == (maxSize - 1))
            rear = -1;
        
        queueArray[++rear] = gp;
        nItems++;
    }
    
    public GamePass dequeue() {
        if(isEmpty()) return null;
        
        GamePass remEl = queueArray[front++];
        if(front == maxSize)
            front = 0;
        
        nItems--;
        return remEl;
    }
    
    public GamePass peek() {
        return queueArray[front];
    }
}
