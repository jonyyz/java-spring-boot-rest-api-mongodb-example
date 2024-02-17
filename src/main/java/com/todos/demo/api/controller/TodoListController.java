package com.todos.demo.api.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.todos.demo.api.model.TodoList;
import com.todos.demo.service.TodoListService;

@RestController
public class TodoListController {
  private TodoListService service;

  @Autowired
  public TodoListController(TodoListService service) {
    this.service = service;
  }

  @GetMapping("/todo-list")
  public List<TodoList> getAll() {
    return service.getAll();
  }

  @GetMapping("/todo-list/{id}")
  public TodoList getById(@PathVariable ObjectId id) {
    return service.getById(id);
  }
}
