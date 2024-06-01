public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Task 1");

        int amountSaving = 15000;
        double total = 0;
        int month = 1;
        double percentPerMonth = 1.01;
        while (total < 2_459_000) {
            total = ((total + amountSaving ) * percentPerMonth);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }

        System.out.println(" Task 2");

        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }

        System.out.println();

        for (; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();

        System.out.println(" Task 3 ");

        int populationCountryY = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int fertility = populationCountryY / 1000 * 17;
            int mortality = populationCountryY / 1000 * 8;
            populationCountryY += fertility - mortality;
            System.out.println("Год " + i + ", численность населения составляет " + populationCountryY);
        }

        System.out.println(" Task 4 ");

        double percent = 1.07;
        double deposit = 15000;
        month = 1;
        while (deposit < 12_000_000) {
            deposit *= percent;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей %n", month, deposit);
            month++;
        }
        System.out.println();

        System.out.println(" Task 5 ");

        percent = 1.07;
        deposit = 15000;
        month = 1;
        while (deposit < 12_000_000) {
            deposit *= percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей %n", month, deposit);
            }
            month++;
        }

        System.out.println(" Task 6 ");

        percent = 1.07;
        deposit = 15000;
        int targetMonthAmount = 9 * 12;
        for (int i = 1; i < targetMonthAmount; i++) {
            deposit *= percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей %n", i, deposit);
            }
        }

        System.out.println(" Task 7 ");

        int firstFriday = 2;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println(" Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет ");
        }

        System.out.println(" Task 8 ");

        int period = 79;
        int currentYear = 2024;
        int lowerBorder = currentYear - 200;
        int upperBorder = currentYear + 100;
        for (int i = 0; i < upperBorder; i += period) {
            if (i > lowerBorder) {
                System.out.println(i);
            }
        }

    }
}
