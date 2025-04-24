import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class FormatDates {
    public static void main(String[] args) {
        //Get Current date and time
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        //1. Format: MM/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(currentDate.format(formatter1));

        //2. Format: yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_DATE; //I can use yyyy-MM-dd but, already built-in
        System.out.println(currentDate.format(formatter2));

        //3. Format: MMMM dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(currentDate.format(formatter3));

        //4. Format: day, MMMM dd, yyyy HH:MM (in GMT time)
        ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm");
        System.out.println(gmtDateTime.format(formatter4));

        //5. Format: HH:mm on dd-MMM-yyyy (local time)
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(currentDateTime.format(formatter5));
    }
}
