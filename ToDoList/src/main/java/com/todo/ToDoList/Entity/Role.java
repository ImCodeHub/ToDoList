package com.todo.ToDoList.Entity;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
    ADMIN,
    USER;

    public List<SimpleGrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_" + this.name()));

    }

}
