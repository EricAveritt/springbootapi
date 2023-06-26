package com.ericaveritt.springbootapi.singleton;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String info = "Initial Class Info";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }
}
