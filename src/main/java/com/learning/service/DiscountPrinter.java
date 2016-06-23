package com.learning.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by amits on 23/06/16.
 */
@Component
public class DiscountPrinter implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Spring Bean invoked");
        Map<Object, Object> result = (Map<Object, Object>) delegateExecution.getVariable("discount");
        System.out.println("Discount : " + result.get("discount"));
    }
}
