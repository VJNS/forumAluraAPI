import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaDatas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate diaFuturo = LocalDate.of(2099, 01, 25);

        System.out.println(diaFuturo);

        Period periodo = Period.between(hoje, diaFuturo);

        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());
        System.out.println(periodo.getUnits());
    }
}
