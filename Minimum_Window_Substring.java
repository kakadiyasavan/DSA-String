// leetCode 76 Minimum Window Substring
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
// The testcases will be generated such that the answer is unique.

// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
// Example 2:

// Input: s = "a", t = "a"
// Output: "a"
// Explanation: The entire string s is the minimum window.
// Example 3:

// Input: s = "a", t = "aa"
// Output: ""
// Explanation: Both 'a's from t must be included in the window.
// Since the largest window of s only has one 'a', return empty string.
 
import java.util.*;

public class Minimum_Window_Substring {

     public static void printMinWindow(String s,String t){

          int[] map = new int[128];

          for(char c : t.toCharArray()) {
               map[c]++;
          }

          int start = 0,end = 0,minStart = 0;
          int minLen = Integer.MAX_VALUE,count = t.length();

          while(end < s.length()){

               char endChar = s.charAt(end);
               if(map[endChar] > 0){
                    count--;
               }
               map[endChar]--;
               end++;

               while(count == 0){
                    if(end - start<minLen){
                         minLen = end-start;
                         minStart = start;
                    }

                    char startChar = s.charAt(start);
                    map[startChar]++;
                    if(map[startChar] > 0){
                         count++;
                    }
                    start++;
               }
          }

          if(minLen == Integer.MAX_VALUE){
               System.out.println("");
          } else {
               System.out.println(s.substring(minStart,minStart+minLen));
          }
     }
   
     public static void main(String[] args){
      
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a Main String : ");
          String str = sc.nextLine();

          System.out.println("Enter a SubString Find : ");
          String substr = sc.nextLine();

          printMinWindow(str, substr);
     }
}
