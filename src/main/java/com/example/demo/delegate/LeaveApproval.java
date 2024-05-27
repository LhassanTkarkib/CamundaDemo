package com.example.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LeaveApproval implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(LeaveApproval.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        String leaveType = (String) execution.getVariable("leaveType");

        System.out.println("Employee can leave");

        LOGGER.info("leaveType is >>> " + leaveType);
        LOGGER.info("\n\n  ... Update Leave invoked by "
                + "activtyName='" + execution.getCurrentActivityName() + "'"
                + ", activtyId=" + execution.getCurrentActivityId()
                + ", processDefinitionId=" + execution.getProcessDefinitionId()
                + ", processInstanceId=" + execution.getProcessInstanceId()
                + ", businessKey=" + execution.getProcessBusinessKey()
                + ", executionId=" + execution.getId()
                + ", variables=" + execution.getVariables()
                + " \n\n");
    }
}

