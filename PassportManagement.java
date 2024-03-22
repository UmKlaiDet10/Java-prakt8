import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PassportManagement {

    private static List<Passport> passportList = new ArrayList<>();

    public static void main(String[] args) {
        addInitialPassports();
        displayPassports();

        // Добавление нового пропуска
        addPassport(new Passport(112233, "Петров Петр Петрович", "Менеджер", true));
    }

    private static void addInitialPassports() {
        passportList.add(new Passport(445566, "Антонов Андрей Антонович", "Сантехник", false));
        passportList.add(new Passport(112134, "Иванов Иван Иванович", "Директор", true));
        passportList.add(new Passport(306306, "Яковлева Юлия Аристарховна", "Секретарь", false));
        Collections.sort(passportList, Comparator.comparing(Passport::getFullName).thenComparing(Passport::getNumber));
    }
    
    public static void addPassport(Passport newPassport) {
        passportList.removeIf(passport -> passport.getNumber() == newPassport.getNumber() && !passport.getFullName().equalsIgnoreCase(newPassport.getFullName()));
        passportList.add(newPassport);
        Collections.sort(passportList, Comparator.comparing(Passport::getFullName).thenComparing(Passport::getNumber));
        displayPassports();
    }

    public static void displayPassports() {
        for (Passport passport : passportList) {
            System.out.println(passport.toString());
        }
        System.out.println();
    }
}
