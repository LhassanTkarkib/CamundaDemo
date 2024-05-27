package com.example.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LeaveRequestDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(LeaveRequestDelegate.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Employee wants to leave");
    }
}
