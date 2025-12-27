package com.mycompany.jdbcproject1;

import java.util.*;
import java.util.stream.*;

class ToDo{
    String title, description;
    boolean state;

    public ToDo(String title, String description, boolean state) {
        this.title = title;
        this.description = description;
        this.state = state;
    }

    @Override
    public String toString() {
        return "ToDo{" + "title=" + title + ", description=" + description + ", state=" + state + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
}

public class Paper5 {
    public static void main(String[] args) {
        List<ToDo> todoList = new ArrayList<>();
        todoList.add(new ToDo("Paper Solve", "Solve 2025 Paper", false));
        todoList.add(new ToDo("Paper Solve", "Solve 2025 Paper", false));
        todoList.add(new ToDo("Paper Solve", "Solve 2024 Paper", false));
        todoList.add(new ToDo("Paper Solve", "Solve 2023 Paper", false));
        todoList.add(new ToDo("Paper Solve", "Solve 2022 Paper", false));
        todoList.add(new ToDo("Paper Solve", "Solve 2021 Paper", false));
        
        //todoList.stream().forEach(System.out::println);
        
        todoList.getFirst().setState(true);
        
        System.out.println("Completed Task");
        todoList.stream().filter(ToDo::getState).forEach(System.out::println);
        
        System.out.println("Pending Task");
        todoList.stream().filter(todo -> todo.getState() == false).forEach(System.out::println);
        
    }
}
