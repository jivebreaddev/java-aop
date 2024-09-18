package com.interface21.web.exception;

import com.interface21.transaction.bean.BeanPostProcessor;
import com.interface21.web.bind.exception.ControllerAdvice;

public class ExceptionAdviceBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postInitialization(Object bean) {
        Class<?> clazz = bean.getClass();

        if(clazz.isAnnotationPresent(ControllerAdvice.class)){

        }

    }
}
