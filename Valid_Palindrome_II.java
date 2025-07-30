// leetCode 680 Valid Palindrome II
// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

// Example 1:

// Input: s = "aba"
// Output: true
// Example 2:

// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.
// Example 3:

// Input: s = "abc"
// Output: false

import java.util.*;

public class Valid_Palindrome_II {

     public static boolean isPalindrome(String str, int left, int right) {

          while (left < right) {

               if (str.charAt(left) != str.charAt(right)) {
                    return false;
               }
               left++;
               right--;
          }
          return true;
     }

     public static void valid_Palindrome(String str) {

          int left = 0;
          int right = str.length() - 1;

          while (left < right) {

               if (str.charAt(left) == str.charAt(right)) {
                    left++;
                    right--;
               } else {
                    boolean skiplett = isPalindrome(str, left + 1, right);
                    boolean skipRight = isPalindrome(str, left, right - 1);

                    if (skiplett || skipRight) {
                         System.out.println("True , This is Palindrome..");
                    } else {
                         System.out.println("False , This is Not a Palindrome..");
                    }
                    return;   
               }
          }

          System.out.println("True , This is a Palindrome..");
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String To Check it Can Palindrome : ");
          String str = sc.nextLine();

          valid_Palindrome(str);
     }
}
