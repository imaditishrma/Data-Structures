package com.ArrayDemo;

public class Array_1D {
    //Get operation
    public static void get(int[] Arr, int index) {
        System.out.println(Arr[index]);
    }

    //Insert operation
    public static void insert(int[] Arr, int index, int val) {
        Arr[index] = val;
    }

    //Update Operation
    public static void update(int[] Arr, int index, int val) {
        Arr[index] = val;
    }

    //Delete Operation
    public static void delete(int[] Arr, int index) {
        Arr[index] = 0;
    }

    public static void main(String[] args) {
        //Declaring a variable
        int[] Arr;

        //Initializing a variable
        Arr = new int[8];

        //Adding value in the array
        for(int i=0; i<(Arr.length); i++){
            Arr[i]=i+1;
        }

        //Displaying array
        System.out.println("Displaying final Array");
        for(int i=0; i<(Arr.length); i++){
            System.out.println(" "+ Arr[i]);
        }

        //Calling Get function
        System.out.println("After performing get operation");
        get(Arr, 0); // it will return, 1

        //Calling update function
        System.out.println("After performing Update Operation");
        int[] Arr3 = {1, 2, 3};
        update(Arr3, 0, 4); // {4,2,3}
        update(Arr3, 1, 5); // {4,5,3}
        update(Arr3, 2, 6); // {4,5,6}
        for(int i=0; i<(Arr3.length); i++){
            System.out.println(" "+ Arr3[i]);
        }

        //Calling delete function
        System.out.println("After performing Delete operation");
        int[] Arr4 = {1, 2, 3};
        delete(Arr4, 0); // {0,1,2}
        delete(Arr4, 1); // {0,0,2}
        delete(Arr4, 2); // {0,0,0}
        for(int i=0; i<(Arr4.length); i++){
            System.out.println(" "+ Arr4[i]);
        }
    }
}