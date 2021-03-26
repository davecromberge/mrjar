package org.example.mrjar;

public class C {
    public static String Name;

    static {
        Name = "old method C";
    }

    public String getName() {
        return Name;
    }

    public String getLegacyName() {
        return Name + " legacy";
    }
}
