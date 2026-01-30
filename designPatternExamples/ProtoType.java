package com.mycompany.factoryexample;

interface Shape {
    Shape clone();  // Make a copy of itself
    void draw();    // Draw the shape
}

class Circle implements Shape{
    private String color;
    
    public Circle(String color){
        this.color = color;
    }
    
    public void draw(){
        System.out.println("Drawing Circle with "+color+" Color");
    }
    
    public Shape clone(){
        return new Circle(this.color);
    }
}

// This is like a user of shapes.
// It uses a prototype (a shape) to create new shapes.
class ShapeClient {
    private Shape shapePrototype;

    // When you create a client, you give it a prototype (a shape).
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    // This method creates a new shape using the prototype.
    public Shape createShape() {
        return shapePrototype.clone();
    }
}

public class ProtoType {
    public static void main(String[] args) {
        // Create a concrete prototype (a red circle).
        Shape circlePrototype = new Circle("red");
        // Create a client and give it the prototype.
        ShapeClient client = new ShapeClient(circlePrototype);
         // Use the prototype to create a new shape (a red circle).
        Shape redCircle = client.createShape();
        redCircle.draw();
    }
}
