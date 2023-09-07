package Mainstream101;

public class Test2 {

    public static void main(String[] args) {

//      String[] names = {"Shola", "Busayo", "Yemi", "Odunayo", "Ayo"};
//      for (String name : names){
//          if(name.length()>5) {
//              continue;
//          }System.out.println(name);
//      }
//        for (int i = names.length-1; i >= 0; i--){
//            System.out.println(names[i]);

//        String guyName = "Ayomide";
//        for (char nickname :guyName.toCharArray()) {
//            System.out.println(nickname);
        String str1 = "I";
        String str2 = "love";
        String str3 = "Java";

        // join strings with space between them
        String joinedStr = String.join(" ", str1, str2, str3);

        System.out.println(joinedStr);
        System.out.println(String.join(" ", str1, str2, str3));

        }



    }



