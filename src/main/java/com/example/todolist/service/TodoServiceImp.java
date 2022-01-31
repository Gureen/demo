package com.example.todolist.service;


import com.example.todolist.dto.DtoTodo;
import com.example.todolist.model.Todo;
import com.example.todolist.repository.ToDoRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


@Service @Data
public class TodoServiceImp implements TodoService {

    private final ToDoRepository toDoRepository;

    private final ModelMapper modelMapper;

    @Override
    public Iterable<Todo> findAll() {

    return toDoRepository.findAll();
    }


    @Override
    public void deleteTodo(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public DtoTodo createTodo(Todo todo) {

        toDoRepository.save(todo);
        return entToDto(todo);
    }

    @Override
    public DtoTodo entToDto(Todo todo){
        return modelMapper.map(todo, DtoTodo.class);

    }

    @Override
    public List<DtoTodo> itToStream() {
        Stream<Todo> s = StreamSupport.stream(findAll().spliterator(), false);
        return s.map(this::entToDto).collect(Collectors.toList());
    }
}