package tn.esprit.controllers.Reservation;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMS {


    private static final String ACCOUNT_SID = "ACCOUNT SID";
    private static final String AUTH_TOKEN = "TOKEN";


    private static final String TWILIO_PHONE_NUMBER = "NUMBER PROVIDED BY TWILIO";


    public static void sendSMS(String toPhoneNumber, String message) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);


        Message.creator(
                new PhoneNumber(toPhoneNumber),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                message
        ).create();
    }
}