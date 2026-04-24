package com.exercises.generics;

public class MyClass<T> {
    T param;
    String info;
    MyClass(T par) {
        param = par;
        if (par instanceof String) {
            info = " is a String";
        } else if (par instanceof Integer) {
            info = " is an Integer";
        } else if (par instanceof Double) {
            info = " is a Double";
        }
    }
}
