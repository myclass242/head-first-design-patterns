package com.zy.singleton;

public class Singleton {
    private static volatile Singleton singleton;
    private static Singleton singleton2 = new Singleton();
    private Singleton() {}
    public static  synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public static Singleton getInstance2() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
