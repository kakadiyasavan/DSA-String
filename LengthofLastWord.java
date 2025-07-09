//leetCode 58 Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 
import java.util.*;

public class LengthofLastWord {

     public static void Last_Length(String line){

          String str = line.trim();
          int count = 0;

          for(int i=str.length()-1 ; i>=0 ; i--){
               char ch = str.charAt(i);
               if(ch == ' '){
                    break;
               }
               count++;
          }

          System.out.println("Last Word Count is : " + count);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Sentence And find Last Word Length : ");
          String line = sc.nextLine();

          Last_Length(line);
     }
}
