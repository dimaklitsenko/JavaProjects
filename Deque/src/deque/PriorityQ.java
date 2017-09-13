/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author Dima
 */
public class PriorityQ {
//Елементи масиву упорядковано за значенням ключа
//від максимумa (0) до мінімуму
    
    private int maxSize;
    private long[] queArray;
    private int nItems;
    private int i;

    public PriorityQ(int s) // Конструктор
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
    public void insertLeft(long item) {
        int j = nItems;
        if (nItems == 0) {
            queArray[nItems++] = item;
        }else{
            queArray[j] = item;
            nItems++;
        }
        
    }
     public void insertRight(long item) {
        i = maxSize - 1;
        if (nItems == maxSize - 1) {
            queArray[i] = item;
        }else{
            queArray[i] = item;
            maxSize--;
        }
     }

    public long removeLeft() 
    {
        return queArray[--nItems];
    }
    public long removeRight() 
    {
        return queArray[i++];
    }


    public boolean isEmpty() // true, якщо черга порожня
    {
        return (nItems == 0);
    }

    public boolean isFull() // true, якщо черга заповнена
    {
        return (nItems == maxSize);
    }
} //
