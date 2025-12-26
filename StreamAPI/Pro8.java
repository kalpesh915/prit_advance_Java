package com.mycompany.streamapi;

interface Maths1{
    int sum(int i, int j);
}

interface Strings{
    String upper(String tmp);
}

public class Pro8 {
    public static void main(String[] args) {
        Maths1 maths = (i, j) -> i + j;
        Strings strings = (x) -> x.toUpperCase();
        
        System.out.println(maths.sum(11, 22));
        System.out.println(strings.upper("prit"));
    }
}
