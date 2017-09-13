/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

/**
 *
 * @author Dima
 */
class StackX {

    private int maxSize; // Розмір масиву
    private char stackArray[];
    private int top;

    public StackX(int s) // Конструктор
    {
        maxSize = s; // Визначення розміру стека
        stackArray = new char[maxSize]; // Створення масиву 
        top = -1; //Поки немає жодного елемента
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char parnArray(char j) {
        if (((long) j % 2) == 0) {
            return j;
        } else {
            return 0;
        }
    }

    public char noParnArray(char j) {
        if (((long) j % 2) != 0) {
            return j;
        }else{
            return 0;
        }
        
    }

    public char pop() // Вилучення елемента з вершини стека
    {
        return stackArray[top--];
    }

    public long peek() // Читання елемента з вершини стека
    {
        return stackArray[top];
    }

    public boolean isEmpty() // True, якщо стек порожній
    {
        return (top == -1);
    }

    public boolean isFull() // True, якщо стек повний
    {
        return (top == maxSize - 1);
    }
} // 
