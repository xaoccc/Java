package com.exercises;

public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(
            (name) -> {
                System.out.printf("%s says: Meow!", name);
            }, "Stoyan"
        );
    }
}

@FunctionalInterface
interface Sound {
    void make(String name);
}

class Cat {
    public static void makeSound(Sound sound, String name) {
        sound.make(name); 
    }
}


