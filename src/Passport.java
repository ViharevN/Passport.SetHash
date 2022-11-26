import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private Set<String> passportNumbers;
    private String lastName;
    private String secondName;
    private String firstName;
    private String birthDate;

    public Passport(Set<String> passportNumbers, String lastName, String secondName, String firstName, String birthDate) {
        this.passportNumbers = passportNumbers;
        this.lastName = lastName;
        this.secondName = secondName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
            throw new RuntimeException("Введите имя");
        }
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            throw new RuntimeException("введите фамилию");
        }
        if (birthDate == null || birthDate.isEmpty() || birthDate.isBlank()) {
            throw new RuntimeException("Введите дату рождения");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumbers, passport.passportNumbers) && Objects.equals(lastName, passport.lastName) && Objects.equals(secondName, passport.secondName) && Objects.equals(firstName, passport.firstName) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumbers, lastName, secondName, firstName, birthDate);
    }

    public boolean checkedNumber(String s) {
        return passportNumbers.contains(s);
    }

    public String printPassports(String s) {
        for (String passportNumber : passportNumbers) {
            return passportNumber;
        }
        return null;
    }

    public static Passport findPassport(Set<Passport> passportSet, String number) {
        for (Passport passport : passportSet) {
            if (passport.checkedNumber(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Номер паспорта: " + passportNumbers +
                ", Имя: " + firstName +
                ", Отчество: " + secondName +
                ", Фамилия: " + lastName +
                ", Дата рождения: " + birthDate;
    }
}
