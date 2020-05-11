package com.company;

import java.util.*;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object-orientated, platform independent programming language");
        languages.put("Python", "An interpreted object-orientated high level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic programming language");
        languages.put("BASIC", "Beginners All-Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "This course is about Java"));
        }
        System.out.println(languages.get("Java"));
        System.out.println("*******************************************************************************");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "A family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value not found");
        }

        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.remove("Scala", "this will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
