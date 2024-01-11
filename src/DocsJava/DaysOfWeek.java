package DocsJava;
import static java.lang.System.out;

public class DaysOfWeek {
    public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;}


    public static void main (String[] args) {
        Day day = Day.TUESDAY;
        out.println(
                switch (day) {
                    case MONDAY, FRIDAY, SUNDAY -> 6;
                    case TUESDAY -> 7;
                    case THURSDAY, SATURDAY -> 8;
                    case WEDNESDAY -> 9;
                    default -> throw new IllegalStateException("Invalid day: " + day);
                }
        );
    }
}
