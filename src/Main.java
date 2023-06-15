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
    }

    public static void task3 () {
        System.out.println("Задача 3");
    }

    public static void task4 () {
        System.out.println("Задача 4");
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