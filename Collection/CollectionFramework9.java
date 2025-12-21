package com.mycompany.collectionframework;
import java.util.*;

public class CollectionFramework9 {
    public static void main(String[] args) {
        Set<String>  languages = new HashSet<>();
        
        languages.add("C");
        languages.add("C");
        languages.add("SQL");
        languages.add("PHP");
        languages.add("CPP");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("JS");
        languages.add("C");
        
        System.out.println(languages.add("Python"));
        System.out.println(languages.add("Python"));
        
        System.out.println(languages);
    }
}
