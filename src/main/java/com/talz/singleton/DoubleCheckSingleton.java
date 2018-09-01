package com.talz.singleton;

/**
 * Before acquiring the lock - we first check if the instance is already initiated.
 * If not, we lock the class and create a new instance.
 * We need to double check for null - because the following situation can happen:
 *
 * 1. Two threads check the first null check - and the instance is null
 * 2. One of the threads acquired the lock, the second one is waiting
 * 3. The first thread is creating the instance - and then releasing the lock
 * 4. The second thread is entering the protected block - and because we don't have a double check, he is still thinking
 *    that the instance is null - so the instance will be created again (and that's not singleton pattern)
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    private DoubleCheckSingleton() {
        // Private Constructor
    }

    public void doSomething() {
        System.out.println("I'm an instance of a double-check singleton");
    }
}
