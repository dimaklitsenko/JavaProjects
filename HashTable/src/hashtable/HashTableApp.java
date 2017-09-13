/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

import java.io.IOException;

/**
 *
 * @author Dima
 */
class HashTableApp {

    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        double  n,choose;
        int  size, aKey, middle;
        double keysPerCell;
        String chooseChar;
        System.out.print("Enter size of hash table:");
        size = Get.iint();
        System.out.print("Enter initial number of items:");
        n = Get.ddouble();
        keysPerCell = n/size;
        HashTable theHashTable = new HashTable(size);
        System.out.println("\nEnter 1 for heandl input and 2 for random input");
        choose = Get.iint();
        if (choose == 1) {
            for (int i = 0; i < n; i++) {
                aKey = Get.iint();
                aDataItem = new DataItem(aKey);
                theHashTable.insert(aDataItem);
            }
        }
        if (choose == 2) {
            for (int j = 0; j < n; j++) // Вставка даних
            {
                aKey = (int) (java.lang.Math.random() * keysPerCell * size);
                aDataItem = new DataItem(aKey);
                theHashTable.insert(aDataItem);
            }
        }

        while (true) // Взаємодія з користувачем
        {
            System.out.print("Enter first letter of show, insert, delete, or find:");
            char choice = Get.cchar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    middle = theHashTable.resultOfMidle();
                    System.out.println("You want to see middle result enter 'yes' ");
                    chooseChar = Get.sstring();
                    if(chooseChar.equals("yes")){
                         System.out.println("middle = " + middle);
                    }      
                    break;
                case 'i':
                    System.out.print("Enter key value to insert:");
                    aKey = Get.iint();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete:");
                    aKey = Get.iint();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find:");
                    aKey = Get.iint();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found [" + aKey + "]");
                    } else {
                        System.out.println("Could not find [" + aKey + "]");
                    }
                    break;
                default:
                    System.out.print("Invalid entry \n");
            }
        }
    }
}
