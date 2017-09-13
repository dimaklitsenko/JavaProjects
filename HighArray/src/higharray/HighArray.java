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
public class HighArray {

    private final long[] a;
    public long c[];
    private int nElems;

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
        c = mass;
        return mass;
    }
    public HighArray(int max) {
        a = new long[max];
        //c = new long[3];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }

        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    public long getMax() {
        long max = a[0];
        if (nElems == 0) {
            System.out.println("Mass is emty");
        } else {
            for (int i = 0; i < nElems; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }
        return max;
    }

    public void removeMax() {
        long c;
        c = getMax();
        delete(c);
    }

    public void displayA() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j] + " ");
        }
    }
    public void display() {
        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j] + " ");
        }
    }
    public static void sort(long b[], long value) {
        int k;
        int z = 0;
        int l = 0;
        l = b.length;
        l++;
        long d[];
        d = new long[l];
        for(int i = 0; i < l; i++){
            if(i < 3){
                d[i] = b[i];
            }
        }
        for(k = 0; k < b.length; k++){
            if(b[k] > value && value > b[k - 1]){
                z = k;
            }
            if(b[k] < value){
                z = k;
                z += 1;
            }
            if(b[k] == value){
                z = k;
            }
        }
        System.out.println("z = " + z);
        int i = d.length - 1;
        do{
            d[i] = d[i - 1];
            if(d[i] == 0){
                d[i] = b[i - 1];
            }
            if(d[i - 1] == 0){
                d[i - 1] = b[i - 1];
            }
            System.out.println(" i = " + i + " d = " + d[i]);
            i--;
        }while(i > z);
        d[z] = value; 
        for(i = 0; i < d.length; i++){
            System.out.println("d = " + d[i] + " i = " + i);
        }
    }
}


