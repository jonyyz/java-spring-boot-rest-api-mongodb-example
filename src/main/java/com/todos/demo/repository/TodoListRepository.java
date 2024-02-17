package com.todos.demo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.todos.demo.api.model.TodoList;

public interface TodoListRepository extends MongoRepository<TodoList, String> {
  @SuppressWarnings("null")
  List<TodoList> findAll();

  TodoList findById(ObjectId id);
}
