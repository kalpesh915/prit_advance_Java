package com.mycompany.streamapi;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Pro7 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 111);
        
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                //return t > 100;
                return t % 2 == 0;
            }
        };
  
        
        data.stream().filter(predicate).forEach(System.out::println);
                
    }
}
