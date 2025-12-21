package com.mycompany.collectionframework;
import java.util.*;

public class CollectionFramework7 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        
        student.put(1, "Student1");
        student.put(2, "Student2");
        student.put(3, "Student3");
        
        if(student.get(1) != null){
            System.out.println(student.get(1).toUpperCase());
        }else{
            System.out.println("No Value found on given key 1");
        }
        
        if(student.get(2) != null){
            System.out.println(student.get(2).toUpperCase());
        }else{
            System.out.println("No Value found on given key 2");
        }
        
        if(student.get(11) != null){
            System.out.println(student.get(11).toUpperCase());
        }else{
            System.out.println("No Value found on given key 11");
        }
    }
}
