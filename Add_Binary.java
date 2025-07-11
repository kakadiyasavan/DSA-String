// leetCode 67 Add Binary
// Given two binary strings a and b, return their sum as a binary string.

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"


import java.util.*;

public class Add_Binary {

     public static void Binary_Sum(String first,String second){

          StringBuilder sb = new StringBuilder();
          int i = first.length() - 1;
          int j  = second.length() - 1;
          int carry = 0;

          while(i>=0 || j>=0 || carry == 1){

               int sum = carry;
               if(i>=0){
                    sum = sum + (first.charAt(i)-'0');
                    i--;
               }

               if(j>=0){
                    sum = sum + (second.charAt(j)-'0');
                    j--;
               }

               sb.append(sum%2);
               carry = sum/2;
          }

          System.out.println("Sum Of Binary is : " + sb.reverse().toString());
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Binary First Number : ");
          String first = sc.nextLine();

          System.out.println("Enter Binary Second Number : ");
          String second = sc.nextLine();

          Binary_Sum(first,second);
     }
}
