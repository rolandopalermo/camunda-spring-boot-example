package com.rolandopalermo.bpmn.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import static com.rolandopalermo.bpmn.commons.Constants.INPUT_FIELD_NAME;
import static com.rolandopalermo.bpmn.commons.Constants.OUTPUT_FIELD_NAME;

@Slf4j
@Component
public class DelegateSample implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        String name = (String) delegateExecution.getVariable(INPUT_FIELD_NAME);
        log.info(String.format("The input is [%s]", name));
        delegateExecution.setVariable(OUTPUT_FIELD_NAME, String.format("Hello %s", name));
    }

}
