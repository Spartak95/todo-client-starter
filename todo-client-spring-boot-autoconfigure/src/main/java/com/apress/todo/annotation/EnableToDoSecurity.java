package com.apress.todo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.apress.todo.security.ToDoSecurityConfiguration;
import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ToDoSecurityConfiguration.class)
public @interface EnableToDoSecurity {
    Algorithm algorithm() default Algorithm.BCRYPT;
}
