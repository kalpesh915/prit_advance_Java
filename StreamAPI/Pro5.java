package com.mycompany.streamapi;
import java.util.*;
import java.util.stream.Stream;

public class Pro5 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        
        data.add(11);
        data.add(12);
        data.add(13);
        data.add(14);
        data.add(15);
        data.add(19);
        data.add(17);
        data.add(18);
        data.add(19);
        data.add(20);
        data.add(20);
        
        
        Optional<Integer> result = data.stream()
                .filter(x -> x > 50)
                .map(x -> x * 2).findFirst();
                
                
        System.out.println(result.orElse(0));
    }
}
