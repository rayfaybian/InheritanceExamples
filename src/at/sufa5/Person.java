package at.sufa5;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void introduceYourself(){
        System.out.println("My name is " + firstName + " " + lastName +" and I´m " + age + " years old.");
    }
}
