package Mainstream101;

public class JavaReplace {

    public static void main(String[] args) {
        String family = "Shola123Laitan456Halima789Fatima000Qosim";
        String regex = "\\d+";
        System.out.println(family.replaceAll(regex,", "));
    }
}
