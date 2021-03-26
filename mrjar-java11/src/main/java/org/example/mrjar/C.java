package org.example.mrjar;

public class C {
    public static String Name;

    static {
        Name = "new method C";
    }

    public String getName() {
        return Name;
    }

    public String getNewName() {
        return Name + " new";
    }
}
