/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlastlist;

/**
 *
 * @author Dima
 */
public class Link {

    public long dData; // Дані
    public Link next; // Наступний елемент у списку 

    public Link(long dd) // Конструктор
    {
        dData = dd;
    }
    public void displayLink() // Вивід вмісту елемента
    {
        System.out.print(" " + dData);
    }
}
