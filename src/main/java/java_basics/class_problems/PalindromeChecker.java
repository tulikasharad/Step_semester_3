package java_basics.class_problems;

import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    static boolean isPalindromeArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        return new String(original).equals(new String(reversed));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean iterative = isPalindromeIterative(str);
        boolean recursive = isPalindromeRecursive(str, 0, str.length() - 1);
        boolean array = isPalindromeArray(str);

        System.out.println("Iterative: " + iterative);
        System.out.println("Recursive: " + recursive);
        System.out.println("Array Reversal: " + array);

        sc.close();
    }
}