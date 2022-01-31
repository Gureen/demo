package com.example.todolist.service;

import com.example.todolist.dto.DtoTodo;
import com.example.todolist.model.Todo;

import java.util.List;


public interface TodoService {

    Iterable<Todo> findAll();

    DtoTodo createTodo(Todo todo);

    void deleteTodo( Long id);

    DtoTodo entToDto(Todo todo);

    List<DtoTodo> itToStream ();
    }
