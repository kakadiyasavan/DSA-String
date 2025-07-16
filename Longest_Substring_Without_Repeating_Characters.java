// leetCode 3 Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

     public static void Check_SubString(String str){
          
          int start = 0;
          int end = 0;
          int max_length = 0;

          List<Character> list = new ArrayList<>();

          while(end<str.length()){
               if(!list.contains(str.charAt(end))){
                    list.add(str.charAt(end));
                    end++;
                    max_length = Math.max(max_length,list.size());
               } else {
                    list.remove(Character.valueOf(str.charAt(start)));
                    start++;
               }
          }

          System.out.println("Maximum SubArray is : " + max_length);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a String to Check longest SubString : ");
          String str = sc.nextLine();

          Check_SubString(str);
     }
}
