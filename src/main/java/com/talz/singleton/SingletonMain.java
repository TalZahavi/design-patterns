package com.talz.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        instance.doSomething();

        DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
        instance2.doSomething();

        EarlyInitSingleton instance3 = EarlyInitSingleton.getInstance();
        instance3.doSomething();

        EnumSingleton instance4 = EnumSingleton.instance;
        instance4.doSomething();
    }
}
