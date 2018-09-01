package com.talz.singleton;

/**
 * Static fields and blocks are initialized in the order they are written
 */
public class EarlyInitSingleton {

    private static EarlyInitSingleton instance = new EarlyInitSingleton();

    public static EarlyInitSingleton getInstance() {
        return instance;
    }

    private EarlyInitSingleton() {
        // Private Constructor
    }

    public void doSomething() {
        System.out.println("I'm an instance of a early init singleton");
    }
}
