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
public class DataItem {//(Даних може бути і більше)

    private final int iData; // Дані(ключ)

    public DataItem(int ii) // Конструктор
    {
        iData = ii;
    }

    public int getKey() {
        return iData;
    }
} // Кінець класу DataItem
