package spring_introduction;

public class Person {
    private Pet pet;
    private String surName;
    private int age;

    public Pet getPet() {
        return pet;
    }

    public void setSurName(String surName) {
        System.out.println("Class Person: set surname");
        this.surName = surName;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Person() {
        System.out.println("Person bean is created");
    }
//public Person(Pet pet) {
   //    System.out.println("Person bean is created");
   //    this.pet = pet;
   //}

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}