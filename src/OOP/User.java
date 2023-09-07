package OOP;

public class User {
    String fname;
    String lname;
    String email;
    int age;

    public User(String fname, String lname, String email, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args) {
        User ayo = new User("ay", "fash", "primedaug@gmail.com", 24);
        System.out.println(ayo.email);
    }
}
