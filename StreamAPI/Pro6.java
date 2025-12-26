package com.mycompany.streamapi;
import java.util.*;
import java.util.stream.Stream;

class Product{
    int pid;
    String pname;
    double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}

public class Pro6 {
    public static void main(String[] args) {
        List<Product> myProducts = new ArrayList<>();
        myProducts.add(new Product(1, "Lappop", 1234));
        myProducts.add(new Product(2, "Lappop", 12234));
        myProducts.add(new Product(3, "Lappop", 12334));
        myProducts.add(new Product(4, "Lappop", 12344));
        myProducts.add(new Product(5, "Lappop", 12354));
        
        double total = myProducts.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        
        System.out.println(total);
    }
}
