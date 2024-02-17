package com.todos.demo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todo {
  private String name;
  private boolean completed = false;

  public Todo(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean getCompleted() {
    return this.completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
}
