/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackApp {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static float getFloat() throws IOException {
        String s = getString();
        return Float.parseFloat(s);
    }

    public static long getLong() throws IOException {
        String s = getString();
        return Long.parseLong(s);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        StackX stack = new StackX(10);
        System.out.println("Введите строку: ");
        String stroka = getString();
        char symbol;
        int length = stroka.length();
        char mass1[], mass2[];
        mass1 = new char[length];
        mass2 = new char[length];
        System.out.println("Строка = " + stroka);
        for (int i = 0; i < stroka.length(); i++) {
            symbol = stroka.charAt(i);
            stack.push(symbol);
            mass1[i] = stack.parnArray(symbol);
            mass2[i] = stack.noParnArray(symbol);
            System.out.println("Елемент = " + symbol);
        }
        System.out.println("Парные елементы");
        for (int i = 0; i < stroka.length(); i++) {
            if (mass1[i] != 0) {
                System.out.println("Место в строке = [" + i + "] = " + mass1[i]);
            }
        }
        System.out.println("Не парные елементы");
        for (int i = 0; i < stroka.length(); i++) {
            if (mass2[i] != 0) {
                System.out.println("Место в строке = [" + i + "] = " + mass2[i]);
            }
        }
        for (int i = 0; i < stroka.length(); i++) {
            char value = stack.pop();
            System.out.print("Стек = " + value);
            System.out.print("\n");
        }
    }
}
