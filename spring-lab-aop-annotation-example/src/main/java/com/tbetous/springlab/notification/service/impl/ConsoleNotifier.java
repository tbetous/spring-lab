package com.tbetous.springlab.notification.service.impl;

import javax.inject.Named;

import com.tbetous.springlab.notification.data.Message;
import com.tbetous.springlab.notification.service.NotifierService;

@Named 
@ConsoleNotifierQualifier
public class ConsoleNotifier implements NotifierService {
    public void notify(Message message) {
        System.out.println(message.getMessage());
    }
}
