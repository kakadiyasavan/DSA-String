// leetCode 316 Remove Duplicate Letters
// Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

// Example 1:

// Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"

import java.util.*;

public class Remove_Duplicate_Letters {

     public static String removeDuplicateLetters(String s) {

          int[] lastIndex = new int[26];
          boolean[] seen = new boolean[26];
          Stack<Character> stack = new Stack<>();

          for (int i = 0; i < s.length(); i++) {
               lastIndex[s.charAt(i) - 'a'] = i;
          }

          for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               int idx = ch - 'a';

               if (seen[idx])
                    continue;
               while (!stack.isEmpty() && ch < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                    char removed = stack.pop();
                    seen[removed - 'a'] = false;
               }

               stack.push(ch);
               seen[idx] = true;
          }

          StringBuilder result = new StringBuilder();
          for (char c : stack) {
               result.append(c);
          }

          return result.toString();
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the string: ");
          String s = sc.nextLine();

          String result = removeDuplicateLetters(s);
          System.out.println("Result: " + result);
     }
}
