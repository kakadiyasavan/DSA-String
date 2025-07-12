// leetcode 387 First Unique Character in a String
// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// Example 1:

// Input: s = "leetcode"
// Output: 0
// Explanation:
// The character 'l' at index 0 is the first character that does not occur at any other index.

// Example 2:

// Input: s = "loveleetcode"
// Output: 2

// Example 3:
// Input: s = "aabb"
// Output: -1

import java.util.*;

public class First_Unique_Character_in_a_String {

     public static void Find_First(String line){
          
          for(int i=0 ; i<line.length() ; i++){
               char ch = line.charAt(i);
               boolean isRepet = true;

               for(int j=0 ; j<i ; j++){
                    if(ch == line.charAt(j)){
                         isRepet = false;
                         break;
                    }
               }

               for(int j=i+1 ; j<line.length() ; j++){
                    if(ch == line.charAt(j)){
                       isRepet = false;  
                       break;
                    }
               }

               if(isRepet){
                    System.out.println("First Non Repated index is : " + i + " Character is : " + ch);
                    return;
               }
          }
          System.out.println("All Character Are repated : -1 Sorry :( ");
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Word And Find First Letter Non Repeateble  : ");
          String line = sc.nextLine();

          Find_First(line.toLowerCase());
     }
}
