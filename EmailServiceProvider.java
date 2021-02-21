package com.nokia.eventManager;

import com.nokia.eventManager.EmailServerNotAvailableException;

public class EmailServiceProvider {

    String SMTPhost;
    String username;
    String password;
    Integer port;
    boolean healthOK;

    public boolean isHealthOK() {
        return healthOK;
    }

    public void setHealthOK(boolean healthStatus) {
        this.healthOK = healthStatus;
    }

    public EmailServiceProvider(String SMTPhost, String username, String password, Integer port) {
        this.SMTPhost = SMTPhost;
        this.username = username;
        this.password = password;
        this.port = port;
    }


    public String send(String msg , String emailID ) throws EmailServerNotAvailableException {

        if(isHealthOK()){
            return "Sent message " +  msg + " to  " + emailID;
        }
        else
        {
            throw new EmailServerNotAvailableException("Emailserver Not Available");
        }

    }


    public String getSMTPhost() {
        return SMTPhost;
    }

    public void setSMTPhost(String SMTPhost) {
        this.SMTPhost = SMTPhost;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }






}
