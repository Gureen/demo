package com.example.todolist.controller;


import com.example.todolist.dto.DtoTodo;
import com.example.todolist.model.Todo;
import com.example.todolist.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class ToDoListController {

    final
    TodoService todoService;


    @GetMapping("/assignment_table")

    public List<DtoTodo> getTodos () {


        return todoService.itToStream();
    }

    @PostMapping(value = "/assignment_table")
    public DtoTodo createTodo(@RequestBody Todo todo) {

       return todoService.createTodo(todo);

    }
    
    @DeleteMapping("assignment_table/{id}")
    public void deleteTodo(@PathVariable("id") Long id) {

       todoService.deleteTodo(id);
    }


}
