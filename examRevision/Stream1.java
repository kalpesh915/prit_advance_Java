package com.mycompany.jdbcrevision;
import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        //List marks = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 111);
        
        List<Integer> marks = new ArrayList<>();
        marks.add(11);
        marks.add(21);
        marks.add(31);
        marks.add(51);
        marks.add(61);
        marks.add(31);
        marks.add(41);
        marks.add(61);
        
        marks.stream().filter(x -> x > 50).forEach(System.out::println);
    }
}
