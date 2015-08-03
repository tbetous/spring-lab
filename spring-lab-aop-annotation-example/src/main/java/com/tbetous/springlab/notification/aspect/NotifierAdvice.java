package com.tbetous.springlab.notification.aspect;

import javax.inject.Inject;
import javax.inject.Named;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

import com.tbetous.springlab.notification.data.Message;
import com.tbetous.springlab.notification.service.NotifierService;
import com.tbetous.springlab.notification.service.impl.ConsoleNotifierQualifier;
import com.tbetous.springlab.user.data.User;

@Named
public class NotifierAdvice {
    private NotifierService notifierService;

    @Inject
    public NotifierAdvice(@ConsoleNotifierQualifier NotifierService notifierService) {
        this.notifierService = notifierService;
    }
    
    @AfterReturning("execution(* com..UserService.doNothing(..))")
    public void afterNothing(JoinPoint jp, User u) {
        notifierService.notify(new Message("You know nothing notifier !"));
    }
    
    @AfterReturning("execution(* com..UserService.createUser(..)) and args(u)")
    public void afterUserCreated(JoinPoint jp, User u) {
        notifierService.notify(new Message("The user " +u.getName() + " has been created !"));
    }
}
