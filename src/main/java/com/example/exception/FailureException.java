package com.example.exception;

import org.springframework.boot.ExitCodeGenerator;

public class FailureException extends RuntimeException implements ExitCodeGenerator {

    private static final long serialVersionUID = 1L;

    public FailureException(String message) {
        super(message);
    }

    @Override
    public int getExitCode() {
        return 1;
    }

}
