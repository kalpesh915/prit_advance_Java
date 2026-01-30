package com.mycompany.factoryexample;

abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("Two Whiler Vehicle");
    }
}

class FourWheeler extends Vehicle{
    @Override
    public void printVehicle() {
        System.out.println("Four Whiler Vehicle");
    }
}


/// factory interface
interface VehicleFactory{
    Vehicle createVehicle();
}

// Concrete Factory for TwoWheeler
class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

// Client
class Client{
    private Vehicle vehicle;
    
    public Client(VehicleFactory factory){
        vehicle = factory.createVehicle();
    }
    
    public Vehicle getVehicle(){
        return vehicle;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();
    }
}
