package com.example.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.task.TaskSuccess;

@Configuration
@ConditionalOnProperty(name={"task"}, havingValue="success")
public class TaskSuccessConfig {

    @Bean
    public ApplicationRunner getRunner() {
        return new TaskSuccess();
    }
}
