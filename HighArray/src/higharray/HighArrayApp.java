/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higharray;

/**
 *
 * @author Dima
 */
public class HighArrayApp {
    
    public static void main(String args[]) {
        int maxSize = 100;
        long b = 3;
        int a = 10;
        long mass1[], mass2[], mass3[];
//        OrdArray mass1[];
//        mass1 = new OrdArray(a);
        mass1 = new long[4];
        mass2 = new long[4];
        mass3 = new long[10];
        mass1[3] = 4;
        mass1[2] = 3;
        mass1[1] = 2;
        mass1[0] = 1;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
      //  arr.sort(b);
      //arr.displayB();
        HighArray.sort(mass1, b);
        for(int i = 0; i < mass1.length; i++){
            System.out.println("mass = " + mass1[i]);
        }
          if(arr.find(31)){
              System.out.println("Елемнет найден ");
          }
          mass3 = arr.merge(mass1,mass2);
          for(int i = 0;i < mass3.length;i++){
              System.out.println("arr = " + mass3[i]);
          }
          
       
}
}