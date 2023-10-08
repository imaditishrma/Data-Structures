//Problem: Remove Duplicates in 1D array
package com.ArrayDemo;

public class Duplicate_1D {
    public static int remove_duplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Array before: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        int new_len = remove_duplicates(nums);
        System.out.println("Array After: ");
        for (int i = 0; i < new_len; i++) {
            System.out.println(nums[i]);
        }
    }
}
