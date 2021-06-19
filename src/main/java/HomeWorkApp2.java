public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSumm(5, 7));
        System.out.println("----------------------");
        checkNumbers(5);
        System.out.println("----------------------");
        System.out.println(checkNumbersWithConsole(2));
        System.out.println("----------------------");
        stroki("Всем привет", 2);
        System.out.println("----------------------");
        System.out.println(years(100));


    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    public static boolean checkSumm(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */


    public static int checkNumbers(int a) {
        if (a >= 0) {
            System.out.println("Положительно");
        } else {
            System.out.println("Отрицательно");
        }
        return a;
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     */
    public static boolean checkNumbersWithConsole(int a) {
        return a < 0;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */


    public static void stroki(String a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(" " + i + " " + a);
        }
    }

    /**
     * * 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static boolean years(int n) {
        if (n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else if (n % 4 == 0) {
            return true;
        }
        return false;
    }
}
// Это полный... Я делал это говно часов 3... Сделал хоть как то но оно работает!!! РАБОТАЕТ!!!
