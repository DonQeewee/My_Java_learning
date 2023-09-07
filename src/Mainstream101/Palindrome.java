package Mainstream101;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        String confirm = String.valueOf(x);
        String revConfirm = "";
        for (int i = 0; i < confirm.length(); i++) {
            revConfirm = confirm.charAt(i) + revConfirm;
        }
        return confirm.equals(revConfirm);
    }



}


//    Given an integer x, return true if x is a palindrome,and false otherwise.
//
//        Example 1:
//
//        Input: x = 121
//        Output:
//        true
//        Explanation:
//        121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input:
//        x = -121
//        Output:
//        false
//        Explanation:
//        From left to right, it reads - 121. From right to left, it becomes 121 -.Therefore, it is not a palindrome.