package singleton;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Log {

    private Log(){}

    private static final Lazy<Log> myLog = new Lazy<>(Log::new);

    public static Log getMyLog() {
        return myLog.getValue();
    }

    public void logExecution(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            log(message, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void log(String logMessage, PrintWriter writer) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
        writer.println("\nLog Entry : ");
        writer.printf("%s%n", dateFormat.format(new Date()));
        writer.printf("Действие: %s%n", logMessage);
        writer.println("-------------------------------");
    }
}
