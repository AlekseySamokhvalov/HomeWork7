public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        // С помощью цикла while посчитайте, сколько месяцев потребуется,
        // чтобы накопить 2 459 000 рублей при условии, что первоначально
        // мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей под 12% годовых.
        int monthlySavings = 15000;
        double targetBalance = 2459000;
        double annualInterestRate = 0.12;
        double balance = 0;
        int months = 0;

        while (balance < targetBalance) {
            months++;
            balance += monthlySavings;
            balance += balance * (annualInterestRate / 12);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months, balance);
        }

        System.out.printf("Для накопления суммы %.2f рублей потребовалось %d месяцев.%n", targetBalance, months);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        double birthRate = 0.017;
        double deathRate = 0.008;
        int years = 10;

        int i = 1;
        while (i <= years) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population = population + births - deaths;
            System.out.println("Год " + i + ", численность населения составляет " + population);
            i++;
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
        // Первоначальная сумма вклада — 15 тысяч рублей.
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.

        int initialDeposit = 15_000;
        double interestRate = 0.07;
        int target = 12_000_000;

        int months = 0;
        double balance = initialDeposit;

        while (balance < target) {
            balance += balance * interestRate;
            months++;
            System.out.printf("Месяц %d: баланс составляет %.2f рублей%n", months, balance);
        }

        System.out.println("Накопления достигнуты через " + months + " месяца(ев)");
    }

    public static void task5 () {
        System.out.println("Задача 5");
    }

    public static void task6 () {
        System.out.println("Задача 6");
    }

    public static void task7 () {
        System.out.println("Задача 7");
    }

    public static void task8 () {
        System.out.println("Задача 8");
    }

}