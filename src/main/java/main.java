import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.google.api.services.calendar.Calendar;


public class main {

    public static void main(String[] args) throws GeneralSecurityException, IOException {
        CalendarQuickstart calendarQuickstart = new CalendarQuickstart();
        Calendar service = calendarQuickstart.buildService();
        List<String> email = calendarQuickstart.getMailsForTomorrowClasses(service);
        for (String mail : email){
            System.out.println(mail);
        }

        EmailUtility emailUtility = new EmailUtility();
        emailUtility.sendMail( "sprawdzany96@gmail.com", "Test mail", "Thanks for joining us." );
    }
}