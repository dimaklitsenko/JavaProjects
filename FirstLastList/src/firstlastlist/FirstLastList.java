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
public class FirstLastList {

    private Link first; // Посилання на перший елемент 
    private Link last; // Посилання на останній елемент

    public FirstLastList() // Конструктор
    {
        first = null; // Список поки не містить елементів
        last = null;
    }

    public boolean isEmpty() // true, якщо список порожній
    {
        return first == null;
    }

    public void insertFirst(long dd) // Вставка елемента в початок списку
    {
        Link newLink = new Link(dd); // Створення нового елемента 
        if (isEmpty()) // Якщо список порожній,
        {
            last = newLink; // NewLink < - last
        }
        newLink.next = first; // NewLink - > старе значення first 
        first = newLink; // First - > newLink
    }

    public void insertLast(long dd) // Вставка елемента в кінець списку
    {
        Link newLink = new Link(dd);// Створення нового елемента
        if (isEmpty()) // Якщо список порожній,
        {
            first = newLink; // First -> newLink
        } else {
            last.next = newLink; // Старе значення last - > newLink
           // System.out.println("element = " + newLink);
        }
        last = newLink;
       // System.out.println("link = " + last);// NewLink < - last
    }

    public void replaceLast(long dd) {
        last.dData = dd;
//        System.out.println("last address = " + last);
//        System.out.println("last = " + last.dData); // NewLink < - last
    }
    
    public void insertAfter(long key, long number){
        Link current = first;
        Link element = new Link(number);
        while (current != null) {
            long searchL = current.dData;
            System.out.println("searchL = " + searchL);
            System.out.println("AdCur = " + current );
            System.out.println("AdCur next = " + current.next);
            if (key == searchL) {
                System.out.println("current = " + current.dData);
                System.out.println("Addres prev for insert obj = " + current);
                System.out.println("Adress next for insert obj = " + current.next);
                element.next = current.next;
                current.next = element;
                System.out.println("element = " + element);
            }
            current = current.next;
        }
    }
    public long deleteFirst() // Видалення першого елементу списку// Передбачається, що список не порожній 
    {
        long temp = first.dData;
        if (first.next == null) // Якщо тільки один елемент
        {
            last = null; // Null < - last
        }
        first = first.next; // First - > старе значення next
        return temp;
    }

    public void displayList() {
        System.out.print("List(first - > last):");
        Link current = first; // Від початку списку
        while (current != null) // Переміщення до кінця списку
        {
            current.displayLink(); // Вивід даних
            current = current.next; // Перехід до наступного елементу
        }
        System.out.println("");
    }
}
