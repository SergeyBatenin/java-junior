package ru.homeworks.homework2.task1;

public class Dog extends Animal{

    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Dog={name=%s, age=%d, owner=%s}\n", getName(), getAge(), owner);
    }
}
