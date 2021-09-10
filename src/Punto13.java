import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Punto13 {
    public static void consultarfecha(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        System.out.println("La fecha actual es:-> "+dtf.format(LocalDateTime.now()));

    }
    public static void main() {
        consultarfecha();
    }
}
