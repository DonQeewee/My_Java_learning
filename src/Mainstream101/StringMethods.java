package Mainstream101;

public class StringMethods {

        public static void main(String[] args) {
            String text = "Java is a fun programming language";

            // split string from space
            String[] result = text.split(" ");


            System.out.print("result = ");
            for (String str : result) {
                System.out.print(str + ", ");
            }
        }

}
