// leetCode 242 Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:

// Input: s = "rat", t = "car"
// Output: false

import java.util.*;

public class Valid_Anagram {

     public static void Check_Anagram(String str1,String str2){

          if(str1.length() != str2.length()){
               System.out.println("This String not Anagram, Sorry !");
               return;
          }

          int[] count = new int[26];

          for(int i=0 ; i<str1.length() ; i++){
               int value = str1.charAt(i) - 'a';
               count[value]++;
          }

          for(int i=0 ; i<str2.length() ; i++){
               int value = str2.charAt(i) - 'a';
               count[value]--;
          }

          for(int i=0 ; i<count.length ; i++){
               if(count[i] != 0){
                    System.out.println("This String not Anagram, Sorry !");
                    return;
               }
          }
          System.out.println("This String is Perfect Anagram ");
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String First : ");
          String first = sc.nextLine();

          System.out.println("Enter String Second : ");
          String second = sc.nextLine();

          Check_Anagram(first,second);
     }
}
