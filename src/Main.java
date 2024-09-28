public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Task 2
        System.out.println("Задача 2");

        for (int c = 10; c >= 1; c--) {
            System.out.println(c);
        }
        // Task 3
        System.out.println("Задача 3");

        for (int d = 0; d <= 17; d=d+2) {
            System.out.println(d);
        }
        // Task 4
        System.out.println("Задача 4");

        for (int b = 10; b >= -10; b--) {
            System.out.println(b);
        }
        // Task 5
        System.out.println("Задача 5");

        for (int year = 1094; year <= 2096; year = year + 4) {
            System.out.println(year);
        }
        // Task 6
        System.out.println("Задача 6");

        for (int v = 7; v <= 98; v=v+7) {
            System.out.println(v);
        }
        // Task 7
        System.out.println("Задача 7");

        for (int a = 1; a <513; a=a*2) {
            System.out.println(a);
        }
        // Task 8
        System.out.println("Задача 8");

        int q =29000;
        int total = 0;
        for (int s = 1; s <= 12; s++) {
            total = total + q;
            System.out.println("Месяц " + s + " сумма накоплений равна " + total + " рублей");
        }
        // Task 9
        System.out.println("Задача 9");

        int x =29000;
        total = 0;
        for (int z = 1; z <= 12; z++) {
            total = total + total/100;
            total = total + x;
            System.out.println("Месяц " + z + " сумма накоплений равна " + total + " рублей");
        }
        // Task 10
        System.out.println("Задача 10");

        int multipliable = 2;
        int сomposition = 0;
        for (int multiplier =1; multiplier < 11; multiplier++){
            сomposition=сomposition+multipliable;
            System.out.println(multipliable+"*"+multiplier+"="+сomposition);
        }
    }
}