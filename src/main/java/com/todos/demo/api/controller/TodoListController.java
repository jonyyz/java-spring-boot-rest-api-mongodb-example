package com.todos.demo.api.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<List<TodoList>> getAll() {
    return ResponseEntity.ok(service.getAll());
  }

  @GetMapping("/todo-list/{id}")
  public ResponseEntity<TodoList> getById(@PathVariable ObjectId id) {
    var todoList = service.getById(id);
    if (todoList == null)
      return ResponseEntity.notFound().build();
    return ResponseEntity.ok(todoList);
  }
}
