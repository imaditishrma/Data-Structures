package com.ArrayDemo;

public class Array_2D {
    //Get operation
    public static void get(int[][] Arr, int rindex, int cindex) {
        System.out.println(Arr[rindex][cindex]);
    }

    //Insert operation
    public static void insert(int[][] Arr, int rindex,int cindex, int val) {
        Arr[rindex][cindex] = val;
    }

    //Update Operation
    public static void update(int[][] Arr, int rindex, int cindex, int val) {
        Arr[rindex][cindex] = val;
    }

    //Delete Operation
    public static void delete(int[][] Arr, int rindex, int cindex) {
        Arr[rindex][cindex] = 0;
    }

    public static void main(String[] args) {
        //declaring 2D array
        int[][] Arr;

        //Initializing 2D Array
        Arr = new int[3][2];

        //Assigning Values
        for(int i=0; i<Arr.length; i++)
            for(int j=0; j<Arr[0].length; j++)
                Arr[i][j]=i+j+1;

        //Printing the array
        System.out.println("The Array is: ");
        for(int i=0; i<Arr.length; i++)
            for(int j=0; j<Arr[0].length; j++)
                System.out.println(Arr[i][j]);

        //Calling Get operation
        System.out.println("After performing Get operation: ");
        get(Arr, 0, 1);

        //Calling Update operation
        System.out.println("After performing Update Operation: ");
        update(Arr, 0, 0, 10);
        update(Arr, 2,1, 34);
        for(int i=0; i<Arr.length; i++)
            for(int j=0; j<Arr[0].length; j++)
                System.out.println(Arr[i][j]);

        //Calling Delete Operation
        System.out.println("After performing Delete Operation: ");
        delete(Arr, 1, 0);
        delete(Arr, 2, 1);
        for(int i=0; i<Arr.length; i++)
            for(int j=0; j<Arr[0].length; j++)
                System.out.println(Arr[i][j]);

    }
}
