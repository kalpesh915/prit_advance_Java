package com.mycompany.streamapi;
import java.util.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        
        data.add(11);
        data.add(12);
        data.add(13);
        data.add(14);
        data.add(15);
        
        /*for(int x : data){
            System.out.println(x * 2);
        }*/
        
        //data.stream().map(x -> x * 2).forEach(System.out::println);
        //data.stream().map(x -> x %2 == 0).forEach(System.out::println);
        long ans = data.stream().filter(x -> x %2 == 0).count();
        System.out.println(ans);
    }
}
