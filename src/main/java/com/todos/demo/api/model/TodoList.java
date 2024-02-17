package com.todos.demo.api.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Document(collection = "todo-list")
public class TodoList {

  @Id
  @JsonSerialize(using = ToStringSerializer.class)
  private ObjectId id;
  private String name;
  private List<Todo> todos;

  public TodoList(ObjectId id, String name, List<Todo> todos) {
    this.id = id;
    this.name = name;
    this.todos = todos;
  }

  public ObjectId getId() {
    return this.id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Todo> getTodos() {
    return this.todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
