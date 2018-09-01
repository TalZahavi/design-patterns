package com.talz.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        instance.doSomething();
    }
}
