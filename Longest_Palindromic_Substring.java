// leetcode 5 Longest Palindromic Substring

import java.util.Scanner;

public class Longest_Palindromic_Substring {

    public static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void Find_SubString(String line) {
        if (line == null || line.length() < 1) {
            System.out.println("Maximum Sub String size is : ");
            return;
        }

        String maxSub = "";

        for (int i = 0; i < line.length(); i++) {
            
            String odd = expandFromCenter(line, i, i);
            
            String even = expandFromCenter(line, i, i + 1);

            
            if (odd.length() > maxSub.length()) {
                maxSub = odd;
            }
            if (even.length() > maxSub.length()) {
                maxSub = even;
            }
        }

        System.out.println("Maximum Sub String is : " + maxSub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String and Find SubString : ");
        String line = sc.nextLine();
        Find_SubString(line);
    }
}
