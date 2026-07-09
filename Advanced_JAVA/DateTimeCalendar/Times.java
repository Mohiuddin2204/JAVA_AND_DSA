package DateTimeCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Times {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //milliseconds since 1 jan 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); //years passed since 1 jan 1970

        //DATE CLASS
        Date d=new Date();
        System.out.println(d); //Sun Jun 07 17:13:15 IST 2026
        System.out.println(d.getTime()); //millisecs since 1 jan 1970
        // System.out.println(d.getDate()); = 07 , System.out.println(d.getSeconds());=15 ,  these are deprecated
        System.out.println(d.getYear());  // 2026-1900

        //CALENDAR CLASS
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType()); //gregory
        System.out.println(c.getTimeZone());  //Asia/Calcutta

        Calendar cd=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cd.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE)); // similarly we have:MINUTE,TIME,HOUR(12h),HOUR_OF_DAY(24h)

        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2019)); //like this,more methods are available

        //TimeZone Class available which contains: getAvailableIDs(), getDefault(), getID();

        //java.time API   [ IMMUTABLE ] => LocalDate, LocalTime , LocalDateTime , DateTimeFormatter
        LocalDate ld=LocalDate.now();
        System.out.println(ld);

        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a H:m:s");
        String mydt= dt.format(dtf);
        System.out.println(mydt);  // 07-06-2026 -- Sun pm 17:36:2
    }
}