//Problem: Move all the Zeros to the right end of the 1D array
package com.ArrayDemo;

public class Zeros_1D {
    public static void Zero(int[] Array){
        int c=0;
        for(int i=0; i<Array.length; i++){
            if (Array[i] != 0){
                Array[c]=Array[i];
                c++;
            }
        }
        for(int i=c; i<Array.length; i++){
            Array[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] Array= {1, 1, 0, 8, 9};
        System.out.println("Array before: ");
        for(int i=0; i<(Array.length); i++){
            System.out.println(" "+ Array[i]);
        }
        Zero(Array);
        System.out.println("Array after: ");
        for(int i=0; i<(Array.length); i++){
            System.out.println(" "+ Array[i]);
        }
    }
}
