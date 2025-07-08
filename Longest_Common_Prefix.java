// leetCode 14 Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

//  Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

import java.util.*;

public class Longest_Common_Prefix {

     public static void Find_Prefix(String[] words, int size) {

          Arrays.sort(words);

          int maxLength = Math.max(words[0].length(),words[size-1].length());
          String pri = "";

          boolean isFind = false;

          for(int i=0 ; i<maxLength ; i++){
               if(words[0].charAt(i) == words[size-1].charAt(i)){
                    char ch = words[0].charAt(i);
                    isFind = true;
                    pri += ch;
               } else {
                    break;
               }
          }

          if(!isFind){
               System.out.println("Common Prefix Can Not Found, Sorry");
               return;
          }

          System.out.println("Longest Common Prefix is : " + pri);
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Word Count You can Enter(1,2) : ");
          int size = sc.nextInt();
          sc.nextLine();

          String[] words = new String[size];

          System.out.println("Enter Words and Find Prefix : ");
          for (int i = 0; i < size; i++) {
               words[i] = sc.nextLine();
          }

          Find_Prefix(words, size);
     }
}