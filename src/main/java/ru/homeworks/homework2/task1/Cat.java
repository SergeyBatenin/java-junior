package ru.homeworks.homework2.task1;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    private void makeSound() {
        System.out.println(getName() + " делает Мяу");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Cat={name=%s, age=%d, color=%s}\n", getName(), getAge(), color);
    }
}
