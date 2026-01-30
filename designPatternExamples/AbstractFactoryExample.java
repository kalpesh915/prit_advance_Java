package com.mycompany.factoryexample;

interface Car {

    void assemble();
}

interface CarSpecification {

    void display();
}

class Sedan implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}

class Hatchback implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}

interface CarFactory {

    Car createCar();

    CarSpecification createSpecification();
}

class NorthAmericaSpecification implements CarSpecification {

    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}

class EuropeSpecification implements CarSpecification {

    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}

class NorthAmericanCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }

}

class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatchback();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }

}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        CarFactory northAmericanCarFatory = new NorthAmericanCarFactory();
        Car northAmericanCar = northAmericanCarFatory.createCar();
        CarSpecification specification = northAmericanCarFatory.createSpecification();
        northAmericanCar.assemble();
        specification.display();
    }
}





