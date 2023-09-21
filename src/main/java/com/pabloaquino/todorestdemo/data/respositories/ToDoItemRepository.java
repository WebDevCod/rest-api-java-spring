package com.pabloaquino.todorestdemo.data.respositories;

import com.pabloaquino.todorestdemo.data.entities.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoItemRepository extends MongoRepository<ToDoItem, String> {
}
