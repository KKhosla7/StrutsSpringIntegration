package com.insecure.springbeans.services.impl;

import com.insecure.springbeans.services.GreetingService;

import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/25/13
 * Time: 8:18 PM
 */

@Named
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {
        return "Welcome to Struts 2 & Spring 3 Integration Sample";
    }
}
