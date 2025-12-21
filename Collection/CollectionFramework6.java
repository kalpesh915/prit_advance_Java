package com.mycompany.collectionframework;
import java.util.*;

public class CollectionFramework6 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        
        student.put(1, "Student1");
        student.put(2, "Student2");
        student.put(3, "Student3");
        
        //System.out.println(student);
        System.out.println(student.get(1));
        System.out.println(student.get(1).toUpperCase());
        System.out.println(student.get(11));
        System.out.println(student.get(11).toUpperCase());
    }
}
