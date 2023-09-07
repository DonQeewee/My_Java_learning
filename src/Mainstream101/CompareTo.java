package Mainstream101;

public class CompareTo {

    public static void main(String[] args) {
        String str1 = "Learn Java";
        String str2 = "learn Java";
        int result;

        // comparing str1 with str2
        result = str1.compareToIgnoreCase(str2);

        System.out.println(result);  // -32
    }
}

