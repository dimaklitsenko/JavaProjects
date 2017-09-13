/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dima
 */
public class Get {
    public static String sstring() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static float ffloat() throws IOException {
        String s = sstring();
        return Float.parseFloat(s);
    }

    public static long llong() throws IOException {
        String s = sstring();
        return Long.parseLong(s);
    }

    public static int iint() throws IOException {
        String s = sstring();
        return Integer.parseInt(s);
    }
}
