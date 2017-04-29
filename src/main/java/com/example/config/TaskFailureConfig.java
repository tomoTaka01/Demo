package com.example.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.task.TaskFailure;

@Configuration
@ConditionalOnProperty(name = { "task" }, havingValue = "failure")
public class TaskFailureConfig {
    @Bean
    public ApplicationRunner getRunner() {
        return new TaskFailure();
    }
}
