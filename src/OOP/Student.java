package OOP;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int total = 0;
        Student no1 = new Student();
        Student no2 = new Student();
        Student no3 = new Student();
        no1.setAge(12);
        no2.setAge(13);
        no3.setAge(14);
        int[]jss1a = {no1.getAge(), no2.getAge(), no3.getAge()};
        for (int i = 0; i<jss1a.length; i++){
            total = total + jss1a[i];
        }System.out.println(total);



    }
}

