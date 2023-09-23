package Inheritance_Composition;

public class Arithmetic extends Subject {

    @Override
    public void assignTeacher() {
        System.out.println("Mr. Sam assigned as the new arithmetic teacher");
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.assignTeacher();

    }
}
