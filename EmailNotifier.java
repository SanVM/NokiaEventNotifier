package com.nokia.eventManager;

import com.nokia.eventManager.Notifyable;
import com.nokia.eventManager.EmailServerNotAvailableException;
import com.nokia.eventManager.EmailServiceProvider;

public class EmailNotifier implements Notifyable{

    EmailServiceProvider emailServiceProvider;

    String processStatus;



    public EmailNotifier(EmailServiceProvider emailServiceProvider) {
        this.emailServiceProvider = emailServiceProvider;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public String getProcessStatus() {
        return processStatus;
    }

    Notifyable notifyable;

    public EmailNotifier() {
    }



    public EmailServiceProvider getEmailServiceProvider() {
        return emailServiceProvider;
    }

    public void setEmailServiceProvider(EmailServiceProvider emailServiceProvider) {
        this.emailServiceProvider = emailServiceProvider;
    }

    public Notifyable getNotifyable() {
        return notifyable;
    }

    public void setNotifyable(Notifyable notifyable) {
        this.notifyable = notifyable;
    }


    public EmailNotifier(Notifyable notifyable) {
        this.notifyable = notifyable;
    }



    @Override
    public void notifyEvent() throws EmailServerNotAvailableException {
        emailServiceProvider.setHealthOK(true);

        emailServiceProvider.send("Email sent for event " , "santhoo.jay@gmail.com");
    }
}
