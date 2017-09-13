/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlastlist;

import java.io.IOException;

/**
 *
 * @author Dima
 */
public class FirstLastApp {

    public static void main(String[] args) throws IOException{
        FirstLastList theList = new FirstLastList();
        long number;
        theList.insertFirst(3); // Вставка в початок списку 
        theList.insertFirst(2);
        theList.insertFirst(1);
        theList.displayList(); // Вивід вмісту списку
        theList.insertLast(4); // Вставка в кінець списку 
        theList.insertLast(5);
        theList.insertLast(6);
        theList.displayList();
//        System.out.println("Введите число для замены последнего елемента списка ");
//        number = Get.iint();
//        theList.replaceLast(number);
        theList.displayList(); // Вивід вмісту списку
        theList.insertAfter(6,12);
        if (theList.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список не пуст");
        }
        theList.displayList(); // Повторний вивід даних
    }
}
