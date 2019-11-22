package javaoop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Adam", 2, "M", "163024");
        System.out.println("name: " + student.getName());
        System.out.println("age: " + student.getAge());
        System.out.println("gender: " + student.getGender());
        System.out.println("id: " + student.getId());
    }
}
