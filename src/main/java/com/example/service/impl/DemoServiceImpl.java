package com.example.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public void convertInt(String val) {
        logger.info("val=[{}]", val);
        Integer intVal = Integer.valueOf(val);
        logger.info("int val=[{}]", intVal);
    }

}
