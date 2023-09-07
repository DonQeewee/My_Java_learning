package Mainstream101;

public class Test1 {

    public static void main(String[] args) {
        double total = 0.0;

        double[] usersPrice = {20.0, 15.0, 30.5, 40.0};
        for (int i = 0; i<usersPrice.length; i++){
            total = total + usersPrice[i];
        }System.out.print(total);
    }
}
