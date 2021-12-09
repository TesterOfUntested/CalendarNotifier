import java.io.IOException;
import java.security.GeneralSecurityException;
import com.google.api.services.calendar.Calendar;


public class main {

    public static void main(String[] args) throws GeneralSecurityException, IOException {
        CalendarQuickstart calendarQuickstart = new CalendarQuickstart();
        Calendar service = calendarQuickstart.buildService();
        calendarQuickstart.getLastEvents(1, service);
    }
}