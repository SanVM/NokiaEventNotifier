package com.nokia.eventManager;

public class EventProcessor {

    String processStart = "START";
    String processEND = "END";
    String processFail = "Fail";
    NokiaEventObj eventObj = new NokiaEventObj(Event.CABLE_PULL);

    public Notifyable process(NokiaEventObj eventObject) {
        EmailServiceProvider emailServiceProvider =
                new EmailServiceProvider("smtp.google.com" ,
                "smtpOperator","smtpOperatorPass",22 );

        EmailNotifier notifyable = new EmailNotifier(emailServiceProvider);

        {
            System.out.println("Processing Event " + eventObject.myEvent);
            notifyable.setProcessStatus("Finished");
            return notifyable;

        }


       // Gather let say window period  10 sednods , Persist them DB with timestamped  entires

       //         SomeOther which is listening should retrive them and it would be easy for him to



    }
}

//Purge policy , batch thread for purging these , external to vent processor
//order has to be maintained and thick about performance , one slow should not impact core Java