package com.talz.singleton;

/**
 * This is the most basic version of a thread-safe Singleton design pattern.
 * The drawback - each time we want go get an instance - we need to acquire a lock
 */
public class SimpleSingleton {

    private static SimpleSingleton instance;

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    private SimpleSingleton() {
        // Private Constructor
    }

    public void doSomething() {
        System.out.println("I'm an instance of a simple singleton");
    }
}
