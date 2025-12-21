package com.mycompany.collectionframework;
import java.util.*;

class Student{
    int roll;
    String fname, lname, city;

    public Student(int roll, String fname, String lname, String city) {
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + getRoll() + ", fname=" + getFname() + ", lname=" + getLname() + ", city=" + getCity() + '}';
    }
}

public class CollectionFramework5 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Prit", "Varu", "Rajkot"));
        students.add(new Student(2, "Prit", "Varu", "Rajkot"));
        
        System.out.println(students);
    }
}
