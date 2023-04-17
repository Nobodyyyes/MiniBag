import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ld1 = LocalDateTime.of(2009,9,28,15,45,15);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Заданное время: " + ld1.format(dateTimeFormatter));
        System.out.println("День недели: " + ld1.getDayOfWeek());
        System.out.println("День в году: " + ld1.getDayOfYear());
        System.out.println("Номер недели в месяце: " + calendar.getWeekYear());
        System.out.println("День недели: " + ld1.getDayOfWeek());
        System.out.println("Номер месяца года: " + ld1.getMonthValue());
    }
}