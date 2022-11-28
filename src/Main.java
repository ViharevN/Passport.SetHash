import java.util.*;


public class Main {
    public static void main(String[] args) {

        //Collections.sindleton используем для хранения уникального значения


        Passport passportSidor = new Passport(Collections.singleton("345wer"),
                "Сидоров",
                "Сидорович",
                "Сидор",
                "1.12.2000");

        Passport passportBob = new Passport(Collections.singleton("234qwe"),
                "Владиморов",
                "Владимирович",
                "Владимир",
                "12.1.2001");

        Passport passportJack = new Passport(Collections.singleton("123fds"),
                "Евгеньев",
                "Евгеньевич",
                "Евгений",
                "12.12.1999");

        Set<Passport> passportNumbers = new HashSet<>();

        passportNumbers.add(passportSidor);
        passportNumbers.add(passportBob);
        passportNumbers.add(passportJack);

        for (Passport passportNumber : passportNumbers) {
            System.out.println(passportNumber);
        }

        System.out.println("Паспорт: " + Passport.findPassport(passportNumbers, "123fds"));


        NumberSet.numbersSet();












    }



}