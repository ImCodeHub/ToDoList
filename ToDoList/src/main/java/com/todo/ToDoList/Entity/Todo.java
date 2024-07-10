package com.todo.ToDoList.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todo")
public class Todo extends BaseEntity {
    @NonNull
    private String title;

    @NonNull
    private String description;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @Column(name = "completed_date")
    private LocalDate completedDate;
    
    @Enumerated(EnumType.STRING)
    private Status status;
}
