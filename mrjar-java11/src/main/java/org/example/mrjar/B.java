package org.example.mrjar;

public class B {
    public static String Name;

    static {
        Name = "method B";
    }

    public String getName() {
        return Name;
    }
}
