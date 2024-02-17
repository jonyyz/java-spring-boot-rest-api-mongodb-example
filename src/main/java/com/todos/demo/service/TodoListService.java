package com.todos.demo.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todos.demo.api.model.TodoList;
import com.todos.demo.repository.TodoListRepository;

@Service
public class TodoListService {
  private TodoListRepository repository;

  @Autowired
  public TodoListService(TodoListRepository repository) {
    this.repository = repository;
  }

  public List<TodoList> getAll() {
    return repository.findAll();
  }

  public TodoList getById(ObjectId id) {
    return repository.findById(id);
  }
}
