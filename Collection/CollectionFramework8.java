package com.mycompany.collectionframework;
import java.util.*;

public class CollectionFramework8 {
    public static void main(String[] args) {
        Queue<String> languages = new PriorityQueue<>();
        
        languages.add("C");
        languages.add("SQL");
        languages.add("PHP");
        languages.add("CPP");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("JS");
        
        //System.out.println(languages);
        System.out.println(languages.poll());
        System.out.println(languages.peek());
    }
}
