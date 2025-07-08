// leetCode 20 Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 
// Example 1:

// Input: s = "()"
// Output: true

// Example 2:

// Input: s = "()[]{}"
// Output: true

// Example 3:

// Input: s = "(]"
// Output: false

// Example 4:

// Input: s = "([])"
// Output: true

import java.util.*;

public class Valid_Parentheses {

     public static void Check_Perentheses(String brak){

          int n = brak.length();
          char[] stack = new char[n];
          int top = -1;

          for(int i=0 ; i<n ; i++){
               char ch = brak.charAt(i);

               if(ch == '{' || ch == '(' || ch == '['){
                    top++;
                    stack[top] = ch;
               } else if(ch == '}' || ch == ')' || ch == ']'){

                    if(top == -1){
                         System.out.println("Invalid Parentheses in this String, Sorry");
                         return;     
                    }

                    if(ch == ')' && stack[top] == '(' ||
                       ch == ']' && stack[top] == '[' ||
                       ch == '}' && stack[top] == '{'){
                         top--;
                    } else {
                         System.out.println("Invalid Parentheses in this String, Sorry");
                         return;
                    }
               }
          }

          if(top == -1){
               System.out.println("This is Valid Parentheses :) ");
          } else {
               System.out.println("Invalid Parentheses in this String, Sorry");  
          }
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter String as Only Breaket({},(),[]) : ");
          String size = sc.nextLine();

          Check_Perentheses(size);
     }
}
