package com.vladutvrinceanu;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myArray = getIntegers(5);
        //printArray(myArray);

        //printArray(sortIntegers(myArray));

        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArray));
    }


    public static Integer[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers: \r");
        Integer[] array = new Integer[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int buffer = 0;
        for(int i = array.length-1; i >= 0; i--) {
            for (int j = i-1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    buffer = array[j];
                    array[j] = array[i];
                    array[i] = buffer;
                }
            }
        }
        return array;
    }
}