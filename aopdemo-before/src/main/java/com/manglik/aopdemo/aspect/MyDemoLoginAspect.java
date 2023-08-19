package com.manglik.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {

//    @Before("execution(public void addAccount())")
//    @Before("execution(public void com.manglik.aopdemo.dao.AccountDao.addAccount())")
//    @Before("execution(* com.manglik.aopdemo.dao.*.*(..))")
//    @Before("execution(public void add*())")
//    @Before("execution(void add*())")
//    @Before("execution(* add*())")
//    @Before("execution(* add*(com.manglik.aopdemo.Account))")
//    @Before("execution(* add*( ..))")
    @Before("execution(* add*(com.manglik.aopdemo.Account, ..))")
    public void beforeAddAccountAdvice(){
        System.out.println("\n =====> Executing @Before advice on method");
    }
}
