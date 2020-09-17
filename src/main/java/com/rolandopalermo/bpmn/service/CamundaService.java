package com.rolandopalermo.bpmn.service;

import org.camunda.bpm.engine.ProcessEngine;

import java.io.Serializable;

public interface CamundaService<INPUT extends Serializable, OUTPUT extends Serializable> {

    Object run(INPUT input);

    OUTPUT getResult(INPUT input);

    String getProcessName();

    boolean isValidInput(INPUT input);

    String getInput();

    String getOutput();

    ProcessEngine getProcessEngine();

}
