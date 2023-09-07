package Mainstream101;

public class Homework1 {

    public static void main(String[] args) {

        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr =originalStr.charAt(i)+reversedStr ;
            //System.out.println(originalStr.charAt(i));
        }


        System.out.println("Reversed string: "+ reversedStr);

//        String[] names = {"ayo", "shola", "yemi", "busayo"};
//        for(int i = 0; i <= names.length-1; i++){
//            System.out.println(names[i]);
//        }
    }
}
