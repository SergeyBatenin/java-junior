package ru.homeworks.homework2.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Sharik", 3, "Fedor");
        animals[1] = new Cat("Matroskin", 4, "Polosatiy");
        animals[2] = new Cat("Murka", 5, "Black");

        Class<?> animalClass = Class.forName("ru.homeworks.homework2.task1.Animal");
        Class<?> catClass = Class.forName("ru.homeworks.homework2.task1.Cat");

        Method displayInfo = animalClass.getDeclaredMethod("displayInfo");

        Method makeSound = catClass.getDeclaredMethod("makeSound");
        makeSound.setAccessible(true);

        for (Animal animal : animals) {
            displayInfo.invoke(animal);
            if (animal.getClass() == catClass) {
                makeSound.invoke(animal);
            }
        }
    }
}
