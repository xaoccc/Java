package com.exercises.generics;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> testObj1 = new MyClass<>(5);
        MyClass<Double> testObj2 = new MyClass<>(3.14);
        MyClass<String> testObj3 = new MyClass<>("Kangaroo");
        System.out.printf("%s%s\n%s%s\n%s%s ", testObj1.param, testObj1.info, testObj2.param, testObj2.info, testObj3.param, testObj3.info);
    }
}
