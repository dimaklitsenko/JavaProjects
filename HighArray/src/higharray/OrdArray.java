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
class OrdArray {

    private final long a[];
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; // Элемент найден 
            } else if (lowerBound > upperBound) {
                return nElems; //Элемент не найден  
            } else if (a[curIn] < searchKey) {
                lowerBound = curIn + 1; // В верхней половине
            } else {
                upperBound = curIn - 1; //В нижней половине 
            }
        }
    }
    public int key(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; // Элемент найден 
            } else if (lowerBound > upperBound) {
                return nElems; //Элемент не найден  
            } else if (a[curIn] < searchKey) {
                lowerBound = curIn + 1; // В верхней половине
            } else {
                upperBound = curIn - 1; //В нижней половине 
            }
        }
    }

    public void insert(long value) { // Вставка элемента в массив  
        int j;
        j = key(value);
        for (int k = nElems; k > j; k--) // Перемещение последующих элементов   
        {
            a[k] = a[k - 1];
        }
        a[j] = value; // Вставка  
        nElems++; // Увеличение размера 
    }

    public boolean delete(long value) {

        int j = key(value);
        if (j == nElems) { // Найти не удалось  
            return false;
        } else { //Элемент найден    
            for (int k = j; k < nElems; k++) { //Перемещение последующих элементов  
                a[k] = a[k + 1];
            }
            nElems--; // Уменьшение размера    
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j] + " ");
        }
    }
    public long[] merge(long mass1[],long mass2[]){
        long mass[];
        int i;
        int length = (mass1.length + mass2.length);
        mass = new long[length];
        for(i = 0;i < mass1.length;i++){
            mass[i] = mass1[i];
        }
        for(int j = i; j < length;j++){
            mass[j] = mass2[j - mass1.length];
        }
        return mass;
    }
    public void naDups(long arr[]){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = 0; 
                }
            }
        }
    }
}
