package de.claudioaltamura.java.java14;

public class PatternMatchingExample {

    String toUppercase(Object obj) {
        if (obj instanceof String str) {
            return str.toUpperCase();
        }
        return "";
    }

}

