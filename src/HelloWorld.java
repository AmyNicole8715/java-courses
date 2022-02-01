import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class HelloWorld
{
    public static void main(String[] args)
    {
        String message = "Hello World!";
        String greeting = "My name is ";
        String name = "Amy Check";
        String pronouns = "she/her";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(message + " " + greeting + name + "! Today is " + dtf.format(now) + " and my pronouns are " + pronouns + ".");
    }
}