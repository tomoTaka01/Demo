package com.example.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.example.exception.FailureException;
import com.example.service.DemoService;

public class TaskSuccess implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(TaskSuccess.class);

    @Autowired
    private DemoService demoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("args=[{}]", args.getSourceArgs());
        try {
            demoService.convertInt("123");
        } catch (Exception e) {
            throw new FailureException(e.getMessage());
        }
    }

}
