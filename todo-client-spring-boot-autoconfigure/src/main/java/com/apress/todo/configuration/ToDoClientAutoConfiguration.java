package com.apress.todo.configuration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Slf4j
@Configuration
@RequiredArgsConstructor
@ConditionalOnClass({Resource.class, RestTemplateBuilder.class})
public class ToDoClientAutoConfiguration {
    private final ToDoClientProperties toDoClientProperties;
}
