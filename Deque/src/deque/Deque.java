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
public class Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQ deque = new PriorityQ(6);
        PriorityQ deque2 = new PriorityQ(5);
        deque.insertLeft(10);
        deque.insertLeft(9);
        deque.insertLeft(8);
        deque.insertLeft(7);
        deque.insertLeft(6);
        deque.insertLeft(0);
        System.out.println("deque = " + deque.removeLeft());
        for (int i = 0; i < 5; i++) {
             long a = deque.removeLeft();
             System.out.println("a = " + a);
        }
       
       
        if(deque.isEmpty()){
            System.out.println("Дек пустой");
        }
        deque2.insertRight(10);
        deque2.insertRight(9);
        deque2.insertRight(8);
        deque2.insertRight(7);
        deque2.insertRight(6);
        deque2.insertRight(0);
        System.out.println("deque = " + deque2.removeRight());
        deque2.removeRight();
        deque2.removeRight();
        deque2.removeRight();
        deque2.removeRight();
        if(deque2.isEmpty()){
            System.out.println("Дек пустой");
        }
    }
    
}
