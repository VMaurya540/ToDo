package com.geekster.Todo.controller;



import com.geekster.Todo.model.Todo;
import com.geekster.Todo.services.TodoServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {

    private final TodoServices todoServices;
    public TodoController(TodoServices todoServices){
        this.todoServices = todoServices;
    }

    @PostMapping
    // or both equal to same
    // @RequestMapping(value = "",method = RequestMethod.PUT)
    public Todo addTodo(@RequestBody  Todo todo){
        return null;

    }
    @GetMapping("")
    public Todo findTodoById(@PathVariable int id){
        return null;

    }
    @GetMapping("find-all")
    public List <Todo> findAllTodos(){
        return todoServices.findAll();
    }
    @PutMapping
    public Todo updateTodo(@PathVariable int id,@RequestBody Todo todo){
        return null;

    }
    @DeleteMapping
    public Todo deleteTodo(@PathVariable int id){
        return null;

    }


// //This Method use call Username From your System
//    @RequestMapping("/api/username/{username}")
//    @ResponseBody
//    public String helloUser(@PathVariable String username){
//        return  "Hello " + username;
//    }





}
