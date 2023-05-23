package Task_1;

public class Main {


    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        System.out.println("Result: " + result(a, b, c));

    }

    public static double result(double a, double b, double c) {
        return (a + b + c) / (a * b * c);
    }
}
/*
 * Напиши программу на языке Java для вычисления выражения (a + b + c) / (a * b * c).
 * Значения величин, входящих в выражение, задавайте с помощью аргументов командной строки.
 * Компиляцию и запуск программы осуществите в командной строке.
 *  Разработайте 2-3 теста и запустите тестирование через консоль.*/
