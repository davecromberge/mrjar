package org.example.mrjar;

public class A {
    public static String Name;

    static {
        Name = "method A";
    }

    public String getName() {
        return Name;
    }
}
