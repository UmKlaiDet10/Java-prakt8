public class Main {
    public static void main(String[] args) {
        PassportManagement passportManagement = new PassportManagement();

        // Добавление новых пропусков
        passportManagement.addPassport(new Passport(778899, "Петров Петр Петрович", "инженер", true));
        passportManagement.addPassport(new Passport(102030, "Сидорова Елена Ивановна", "бухгалтер", false));

        // Вывод списка пропусков с сортировкой
        passportManagement.displayPassports();
    }
}
