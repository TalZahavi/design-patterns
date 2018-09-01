package com.talz.singleton;

public enum  EnumSingleton {
    instance;

    public void doSomething() {
        System.out.println("I'm an instance of an enum singleton");
    }
}
