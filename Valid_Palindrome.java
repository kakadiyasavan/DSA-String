// leetCode 125 Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

import java.util.*;

public class Valid_Palindrome {

     public static void Check_Palindrome(String line){
          
          line = line.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
          boolean flag = false;

          int i = 0,j = line.length() - 1;

          while(i<=j){
               if(line.charAt(i) != line.charAt(j)){
                    flag = true;
                    break;
               }
               i++;
               j--;
          }

          if(!flag){
               System.out.println("This is String is Palindrome :) ");
          } else {
               System.out.println("This String is Not Palindrome :( ");
          }
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String Value To Check Palindrome : ");
          String line = sc.nextLine();

          Check_Palindrome(line);
     }
}
