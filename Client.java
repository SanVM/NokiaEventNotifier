package com.nokia.eventManager;

import com.nokia.eventManager.Event;
import com.nokia.eventManager.EventProcessor;
import com.nokia.eventManager.NokiaEventObj;
import com.nokia.eventManager.Notifyable;
import com.nokia.eventManager.EmailServerNotAvailableException;

public class Client {

 //Notification keep getting
 // funnel kind of processing , trigger email , sms , whatsapp

    public static void main(String[] args) {
        NokiaEventObj eventObj = new NokiaEventObj(Event.CABLE_PULL);
        EventProcessor eventProcessor = new EventProcessor();
        Notifyable notifyable = eventProcessor.process(eventObj);

        //If processing is successful then send the email.
        if(notifyable.getProcessStatus().equalsIgnoreCase("Finished")) {

            try {
                notifyable.notifyEvent();
                System.out.println("Processed and sent Notification ");
            } catch (EmailServerNotAvailableException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }


    }

}


//Switches or SDN are not , they reached
//  Events :

//     1) cable pull
//     2) cable insert
//     3) power off
//      4) Power on
//....

             // Pull or Push Mechanism

             //
        // Controller

             //Business //Event processing engine -> Library , it set off methods may reusable //component



// Action: INterface or Abstract
        // Provider for each service Provider should an abstract class  , whats app
        // favour Composition over inheritence
 //       emailClass = ()

 //       sendNotification (Notifyable notiObject ) , emai



   // 1) Email Provide
  //  2) SMS

