package com.mycompany.factoryexample;

class SingleTonObj{
    private static  SingleTonObj obj;
    
    public static SingleTonObj getInstance(){
        if(obj == null){
            obj = new SingleTonObj();
        }
        
        return obj;
    }
}

public class SingleTon {
    public static void main(String[] args) {
        
    }
}
