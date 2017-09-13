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
        top = -1;
    }
    public void pushChar(char j) {
        stackArray[++top] = j;
    }

//    public char digitElementArray(char j) {
//        if (Character.isDigit(j)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//     public boolean charElementArray(char j) {
//        if (Character.isDigit(j)) {
//            return true;
//        } else{
//            return false;
//        }
//    }
    public char popChar() // Вилучення елемента з вершини стека
    {   
        return stackArray[top--];
    }

    public long peekChar() // Читання елемента з вершини стека
    {
        return stackArray[top];
    }

    public boolean isEmptyChar() // True, якщо стек порожній
    {
        return (top == -1);
    }

    public boolean isFullChar() // True, якщо стек повний
    {
        return (top == maxSize - 1);
    }
    
} // 
