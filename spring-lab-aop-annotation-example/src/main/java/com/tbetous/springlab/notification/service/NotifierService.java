package com.tbetous.springlab.notification.service;

import com.tbetous.springlab.notification.data.Message;

public interface NotifierService {
    public void notify(Message message);
}
