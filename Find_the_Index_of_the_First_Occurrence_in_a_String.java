// leetCode 28. Find the Index of the First Occurrence in a String
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

import java.util.*;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {

     public static void Find_Occurrence(String word,String find){

          
          int firstOcc = -1;

          for(int i=0 ; i<word.length() - find.length() ; i++){
               boolean isFind = true;
          
               for(int j=0 ; j<find.length() ; j++){
                    if(word.charAt(i+j) != find.charAt(j)){
                         isFind = false;
                         break;
                    }
               }

               if(isFind){
                    firstOcc = i;
                    break;
               }
          }

          if(firstOcc != -1){
               System.out.println("First Occurrence Index is : " + firstOcc);
          } else {
               System.out.println("Sorry Occurrence Not Fount In String :( ");
          }
     }

     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter words : ");
          String word = sc.nextLine();

          System.out.println("Enter Occurrence Word to Find : ");
          String find = sc.nextLine();

          Find_Occurrence(word,find);
     }
}
