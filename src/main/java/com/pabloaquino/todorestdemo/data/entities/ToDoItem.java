package com.pabloaquino.todorestdemo.data.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
public class ToDoItem {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean completed;

    public ToDoItem() {
    }

/*    public ToDoItem(String description, boolean completed) {
        setDescription(description);
        setCompleted(completed);
    }*/
}
