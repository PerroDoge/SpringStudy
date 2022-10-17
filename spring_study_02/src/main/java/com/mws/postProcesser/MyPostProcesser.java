package com.mws.postProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-------");
        System.out.println(beanName + ":" +bean);
        System.out.println("postProcessBeforeInitialization invoked");
        System.out.println("-------");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization invoked");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
