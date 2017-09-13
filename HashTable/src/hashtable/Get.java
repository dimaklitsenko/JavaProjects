/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

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
     public static double ddouble() throws IOException {
        String s = sstring();
        return Double.parseDouble(s);
    }
    public static long llong() throws IOException {
        String s = sstring();
        return Long.parseLong(s);
    }

    public static int iint() throws IOException {
        String s = sstring();
        return Integer.parseInt(s);
    }

    public static char cchar() throws IOException {
        String s = sstring();
        return s.charAt(0);
    }
}
