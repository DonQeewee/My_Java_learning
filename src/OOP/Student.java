//Task: Calculate Total Age of Students with a Loop
//
//        Instructions:
//
//        Create a Java class called Student to model a student's information.
//        The Student class should have the following attributes (instance variables):
//
//        name (String): Represents the name of the student.
//        age (int): Represents the age of the student.
//        The Student class should also have the following methods:
//
//        setName(String name): A method to set the student's name.
//        setAge(int age): A method to set the student's age.
//        getName(): A method to get the student's name.
//        getAge(): A method to get the student's age.
//        In the main method of your program, use a loop to create and populate an array of Student objects.
//        Then, calculate and print out the total age of all the students in the array.

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
        for (int j : jss1a) {
            total = total + j;
        }
        System.out.println(total);



    }
}

