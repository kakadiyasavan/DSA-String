// leetCode 459 Repeated Substring Pattern
// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

import java.util.*;

public class Repeated_Substring_Pattern {

     public static void Find_SubString(String line){

          String newline = line + line;
          String trime = newline.substring(1,newline.length() - 1);

          if(trime.contains(line)){
               System.out.println("This String Have SubString :) ");
               return; 
          }
          System.out.println("This String Not Have SubString :( ");
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String And Find It Can SubString or Not : ");
          String line = sc.nextLine();

          Find_SubString(line);
     }
}
