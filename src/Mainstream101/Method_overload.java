package Mainstream101;

public class Method_overload {
    public static void main(String[] args) {

        char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
//        int offset = 2;
//        int length = 5;
          String result;

        // subarray {'o', 'g', 'r', 'a', 'm'} is converted to string
        result = String.valueOf(ch, 2, 5);

        System.out.println(result);  // "ogrm"
    }
}

