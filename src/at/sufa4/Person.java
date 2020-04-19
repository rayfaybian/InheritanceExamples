package at.sufa4;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void sayHello(){
        System.out.println("\nHello, I'm a person!");
    }

    public void introduceYourself(){
        System.out.println("\nMy name is " + firstName + " " + lastName +" and I'm " + age + " years old.");
    }
}