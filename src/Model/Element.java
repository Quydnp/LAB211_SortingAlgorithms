/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;

/**
 *
 * @author HI
 */
public class Element {

    private int arraySize;
    private int[] array;

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int ArraySize) {
        this.arraySize = ArraySize;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getRandomArray(int minValue, int maxValue) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(minValue, maxValue);
        }
        return array;
    }
    
    
}
