//class for all the Stream functions each is super self explainitory 
package org.example;

import java.util.Arrays;

public class StreamStats {

    public  int maximum(int[] nums) {
        return  Arrays.stream(nums)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }

    public int  minimum(int[] nums) {
        return Arrays.stream(nums)
                 .min()
                 .orElseThrow(() -> new IllegalArgumentException("Array cannot be empty"));
    }
 
    public int sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }
 
    public double average(int[] nums) {
        return Arrays.stream(nums)
                .average()
                .orElseThrow(() -> new  IllegalArgumentException("Array cannot be empty"));
    }

    public void printOddNumbers(int[] nums) {
         System.out.print("Odd numbers (Stream): ");
         Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
         System.out.println();
    }

    public void printEvenNumbers(int[] nums) {
         System.out.print("Even numbers  (Stream): ");
         Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
         System.out.println();
    }
}
