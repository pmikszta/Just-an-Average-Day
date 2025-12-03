//class for all the Loop functions each is super self explainitory 
package org.example;


public class LoopStats {

    public  int maximum(int[] nums) {
        if  (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public int minimum(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        return min;
    }

    public int sum(int[] nums) {
        if (nums == null)
            throw new IllegalArgumentException("Array cannot be null");

        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public  double average(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        return (double) sum(nums) / nums.length;
    }

    public void printOddNumbers(int[] nums) {
        System.out.print("Odd numbers (Loop): ");
        for (int n : nums) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public void printEvenNumbers(int[] nums) {
        System.out.print("Even numbers (Loop): ");
        for (int n : nums) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
