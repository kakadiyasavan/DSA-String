// leetCode 6 Zigzag Conversion
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:
// string convert(string s, int numRows);
 
// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"

import java.util.*;

public class Zigzag_Conversion {

     public static void Conversion(String word,int row){

          if(row == 1){
               System.out.println("Zig Zag Conversion is : " + word);
               return;
          }

          String[] ans = new String[row];

          for(int i=0 ; i<row ; i++){
               ans[i] = "";
          }

          int i=0;
          while(i<word.length()){
               for(int index=0 ; index<row && i<word.length() ; index++){
                    ans[index] += word.charAt(i++);
               }
               for(int index=row-2 ; index>0 && i<word.length() ; index--){
                     ans[index] += word.charAt(i++);
               }
          }

          System.out.println("Zig Zag Conversion is : ");
          for(int j=0 ; j<ans.length ; j++){
               System.out.print(ans[j]);
          }
          System.out.println();
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Word To Set ZigZag Form : ");
          String str = sc.nextLine();

          System.out.println("Enter Number of Row : ");
          int row = sc.nextInt();
          sc.nextLine();

          Conversion(str, row);
     }
}
