package com.mycompany.collectionframework;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Prit");
        list.add(109);
        
        System.out.println((String) list.get(0));
        System.out.println((String) list.get(1));
    }
}
