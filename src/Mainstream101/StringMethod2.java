package Mainstream101;

import java.util.Arrays;

public class StringMethod2 {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::", 10);


        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }
}
