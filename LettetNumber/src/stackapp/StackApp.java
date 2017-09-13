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
        StackX stackDigit = new StackX(20);
        StackX stackChar = new StackX(20);
        System.out.println("Введите строку: ");
        String stroka = getString();
        char symbol;
        char value, value2;
        char word, number;
        int length = stroka.length();
        char mass1[], mass2[];
        mass1 = new char[length];
        mass2 = new char[length];
        System.out.println("Строка = " + stroka);
        for (int i = 0; i < stroka.length(); i++) {
            symbol = stroka.charAt(i);
            if (Character.isDigit(symbol)) {
                mass2[i] = symbol;
                System.out.println("chislo = " + mass2[i]);
                stackDigit.pushChar(mass2[i]);
            } else {
                mass1[i] = symbol;
                System.out.println("char = " + mass1[i]);
                stackChar.pushChar(mass1[i]);
            }
        }
        while (!stackDigit.isEmptyChar()) {
            value = stackDigit.popChar();
            System.out.print("Стек чисел = " + value);
        }
        while (!stackDigit.isEmptyChar()) {
            value2 = stackChar.popChar();
            System.out.println("Стек символов = " + value2);
        }

    }
}
