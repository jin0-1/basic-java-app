package basic1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Simple app to print current date and time
 */
public class App 
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Current date and time: " + formattedNow);
    }
}
