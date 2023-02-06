package com.geekster.Todo.services;


import com.geekster.Todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServices {

    private static List<Todo>todos = new ArrayList<>();//In-memory Database
    private static int todoCount = 0;
    static {
        todos.add(new Todo(++todoCount,"Learn Spring Boot", false));
        todos.add(new Todo(++todoCount,"Visit Grocery Store", false));
        todos.add(new Todo(++todoCount,"Learn AWS", false));
        todos.add(new Todo(++todoCount,"Swimming", false));
        todos.add(new Todo(++todoCount,"Yoga", false));
    }
    public List<Todo>findAll(){
        return todos;
    }
//    public Todo findTodoById(int id){
//        return null;
//    }
}
