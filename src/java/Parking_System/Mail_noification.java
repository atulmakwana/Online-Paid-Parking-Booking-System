/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parking_System;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author atulm
 */
public class Mail_noification 
{
    public static void sendEmail(String to,String pdate,String stime,String phrs,String nump,String slot_name,String psn) 
    {
        System.out.println("Preparing to send message...");
        String message="Hello Sir/Mam, Your Parking slot "+slot_name+" is booked succesfully at parking space "+psn+" on the Date : "+pdate+" starting from '"+stime+"' O clock, for '"+phrs+"' hours.";
        String subject="Parking Booked Successfully";
        String from="atulmakwana450@gmmail.com";
        String host="smtp.gmail.com";
        
        Properties properties=System.getProperties();
        
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        
        Session session=Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("atulmakwana450@gmail.com", "Atul#2911");
            }
        });
        
        session.setDebug(true);
        
        MimeMessage m=new MimeMessage(session);
        
        try{
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);
            m.setText(message);
            Transport.send(m);
            System.out.println("Sent succesfully....");
            
        }
        catch(Exception e){
            System.out.println("mail exception: "+e);
        }
        
    }
    
}
