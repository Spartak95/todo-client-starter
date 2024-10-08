package com.apress.todo.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@AllArgsConstructor
public class ToDoSecurity {
    private PasswordEncoder encoder;
}
