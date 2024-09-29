public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");

        int a;
        for (a = 1; a <= 10; ++a) {
            System.out.println(a);
        }

        System.out.println("Задача 2");

        for (a = 10; a >= 1; --a) {
            System.out.println(a);
        }

        System.out.println("Задача 3");

        for (a = 0; a <= 17; a += 2) {
            System.out.println(a);
        }

        System.out.println("Задача 4");

        for (a = 10; a >= -10; --a) {
            System.out.println(a);
        }

        System.out.println("Задача 5");

        for (a = 1904; a <= 2096; a += 4) {
            System.out.println("" + a + " год является високосным");
        }

        System.out.println("Задача 6");

        for (a = 7; a <= 98; a += 7) {
            System.out.println(a);
        }

        System.out.println("Задача 7");

        for (a = 1; a < 513; a *= 2) {
            System.out.println(a);
        }

        System.out.println("Задача 8");
        int q = 29000;
        int total = 0;

        for (int s = 1; s <= 12; ++s) {
            total += q;
            System.out.println("Месяц " + s + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 9");
        int x = 29000;
        total = 0;

        for (int z = 1; z <= 12; ++z) {
            total += total / 100;
            total += x;
            System.out.println("Месяц " + z + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 10");
        int multipliable = 2;
        int сomposition = 0;

        for (int multiplier = 1; multiplier < 11; ++multiplier) {
            сomposition += multipliable;
            System.out.println("" + multipliable + "*" + multiplier + "=" + сomposition);
        }
    }
}