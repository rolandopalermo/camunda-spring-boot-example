package com.rolandopalermo.bpmn.service;

import com.rolandopalermo.bpmn.exception.InvalidInputException;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.variable.VariableMap;
import org.springframework.util.StringUtils;

import java.io.Serializable;

import static com.rolandopalermo.bpmn.commons.Constants.ERROR_FIELD_NAME;
import static com.rolandopalermo.bpmn.commons.Constants.INPUT_FIELD_NAME;
import static com.rolandopalermo.bpmn.commons.Constants.OUTPUT_FIELD_NAME;

public abstract class CamundaServiceImpl<INPUT extends Serializable, OUTPUT extends Serializable> implements CamundaService<INPUT, OUTPUT> {

    @Override
    public Object run(INPUT input) {
        if (!isValidInput(input)) {
            throw new InvalidInputException();
        }
        RuntimeService runtimeService = getProcessEngine().getRuntimeService();
        ProcessInstanceWithVariables processInstance = runtimeService.createProcessInstanceByKey(getProcessName())
                .setVariable(getInput(), input)
                .executeWithVariablesInReturn();

        VariableMap map = processInstance.getVariables();

        String output = (String) map.get(getOutput());

        return !StringUtils.isEmpty(output) ? output : map.get(ERROR_FIELD_NAME);
    }

    @Override
    public String getInput() {
        return INPUT_FIELD_NAME;
    }

    @Override
    public String getOutput() {
        return OUTPUT_FIELD_NAME;
    }

}