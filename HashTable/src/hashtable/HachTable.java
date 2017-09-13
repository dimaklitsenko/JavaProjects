/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author Dima
 */
class HashTable {

    private DataItem[] hashArray; // Масив осередків хеш-таблиці
    private final DataItem[] hashArray2;
    private final DataItem nonItem;
    private int arraySize;
    private double i = 0;
    private DataItem iitem;
    private int temp;
    public HashTable(int size) // Конструктор
    {
        temp = size;
        arraySize = size;
        hashArray = new DataItem[arraySize];
        hashArray2 = new DataItem[arraySize];
        nonItem = new DataItem(-1); //Ключ видаленого елемента-1
    }

    public void displayTable() {
        System.out.print("Table:");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            }
            if (hashArray[j] == null) {
                System.out.print("|");
            }
        }
        System.out.println("");
    }

    public int resultOfMidle() {
        int countElements = 0;
        int countGroups = 0;
        int result;
        for (int j = 0; j < arraySize; j++) {
            if (j != arraySize - 1 && hashArray[j] == null && hashArray[j + 1] != null) {
                for (int k = j + 1; hashArray[k] != null; k++) {
                    countElements++;
                    if (k != arraySize - 1 && hashArray[k + 1] == null) {
                        countGroups++;
                    }
                }
            }
        }
        System.out.println("countElements = " + countElements);
        System.out.println("countGroups = " + countGroups);
        if (countElements != 0 && countGroups != 0) {
            result = countElements / countGroups;
            return result;
        } else {
            return 0;
        }

    }
//    public int perevod(int arr){
//        int flag = 0;
//        for (int j = 0; j < 10; j++) {
//            flag = arr%(arr + j);
//            if(flag%flag == 0 || flag ){
//                
//            }
//        }
//        return arr;
//    }
    public int hashFunc(int key) {
        return key % (arraySize + 5); // Хеш-функція
    }

    public void insert(DataItem item) // Вставка елемента даних
    //(Метод припускає, що таблиця не заповнена)
    {
        i++;
        iitem = item;
        double koeficient = i / arraySize;
        int key = item.getKey(); // Отримання ключа 
        int hashVal = hashFunc(key); // Хешування ключа
        System.out.println("hashVal = " + hashVal);
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal; // Перехід до наступної комірки
            if (hashVal == arraySize) {
                hashVal = 0;
            }

        }
        hashArray[hashVal] = item;
        if (koeficient >= 0.5) {
            rehash();
        }
    }
    
    private void rehash() {
        DataItem item;
        int key;
        int hashVal;
        int count = 0;
        temp = arraySize;
        arraySize = arraySize * 2;
        //  System.out.println("temp = " + temp);
        for (int j = 0; j < temp; j++) {
            if (hashArray[j] != null) {
                hashArray2[count] = hashArray[j];
                count++;
            }
        }
        hashArray = new DataItem[arraySize];
        for (int j = 0; j < count; j++) {
            item = hashArray2[j];
            key = item.getKey();
         //   System.out.println("key = " + key);
            hashVal = hashFunc(key);
            System.out.println("hashVal = " + hashVal);
            //    System.out.println("size = " + arraySize);
            while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
                ++hashVal; // Перехід до наступної комірки
                if (hashVal == arraySize) {
                    hashVal = 0;

                }
            }
            System.out.println("item = " + item.getKey());
            hashArray[hashVal] = item;
        }
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            }
            if (hashArray[j] == null) {
                System.out.print("|");
            }
        }
        System.out.println("");

    }

    public DataItem delete(int key) // Видалення елемента даних
    {
        int hashVal = hashFunc(key); // Хешування ключа 
        while (hashArray[hashVal] != null) {// Ключ знайдено? 
            if (hashArray[hashVal].getKey() == key) {
                DataItem tempp = hashArray[hashVal]; // Тимчасове збереження 
                hashArray[hashVal] = nonItem; // Видалення елемента
                return tempp; // Метод повертає елемент
            }
            ++hashVal; // Перехід до наступної комірки
            hashVal %= arraySize; // При досягненні кінця таблиці
        } // Відбувається повернення до початку 
        return null; // Елемент не знайдено
    }

    public DataItem find(int key) // Пошук елемента із заданим ключем
    //(Метод припускає, що таблиця не заповнена)
    {
        int hashVal = hashFunc(key); // Хешування ключа 
        while (hashArray[hashVal] != null) // Поки не буде знайдена порожня
        // клітинка
        {// Ключ знайдено? 
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal]; // Так, повернути елемент
            }
            ++hashVal; // Перехід до наступної комірки
            hashVal %= arraySize; // При досягненні кінця таблиці
        } // Відбувається повернення до початку 
        return null; // Елемент не знайдено
    }

}
