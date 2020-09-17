package com.rolandopalermo.bpmn.service;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpinSampleService extends CamundaServiceImpl<String, String> {

    private final ProcessEngine camunda;

    @Override
    public String getResult(String s) {
        return (String) run(s);
    }

    @Override
    public String getProcessName() {
        return "spin-sample-process";
    }

    @Override
    public boolean isValidInput(String s) {
        return !StringUtils.isEmpty(s);
    }

    @Override
    public ProcessEngine getProcessEngine() {
        return camunda;
    }

}
