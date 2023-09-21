package com.pabloaquino.todorestdemo.rest.resources;

import com.pabloaquino.todorestdemo.data.entities.ToDoItem;
import com.pabloaquino.todorestdemo.data.respositories.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoResource {

    @Qualifier("toDoItemRepository")
    @Autowired
    private ToDoItemRepository repository;

    @GetMapping
    public ResponseEntity<?> getAllToDos() {
        List<ToDoItem> toDoList = repository.findAll();
        return new ResponseEntity<>(toDoList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveToDo(@RequestBody ToDoItem newToDo) {
        ToDoItem persistedToDo = repository.save(newToDo);
        return new ResponseEntity<>(persistedToDo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateToDo(@RequestBody ToDoItem updatedToDo) {
        ToDoItem persistedToDo = repository.save(updatedToDo);
        return new ResponseEntity<>(persistedToDo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteToDo(@PathVariable String id) {
        try{
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
