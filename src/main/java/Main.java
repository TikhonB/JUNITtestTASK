import java.util.Scanner;

public class Main {

    public static double equalsTwoDouble(double a, float b, double c) {
        if (Math.abs(a - b) < c) {
            System.out.println("Числа равны");
            return 0;
        } else if (a > b) {
            System.out.println("Число " + a + " больше");
            return a;
        } else {
            System.out.println("Число " + b + " больше");
            return b;
        }
    }

    public static double roundNumber(double a) {
        return Math.round(a);
    }

    public static double discardPart(double a) {
        return (long) a;
    }


    public static void printBoard() {
        System.out.println("Операции над double/float\n" +
                "1: Сравнить\n" +
                "2: Округлить\n" +
                "3: Отбросить дробную часть\n" +
                "END: Закончить программу.");
    }

    public static void main(String[] args) {

        String inputDouble;
        double valueDouble;
        Scanner console = new Scanner(System.in);
        while (true) {
            printBoard();
            String input = console.nextLine();
            if ("END".equalsIgnoreCase(input))
                break;
            else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("***** Сравнить *****\n" +
                                "Введите первое число");
                        inputDouble = console.nextLine();
                        valueDouble = Double.parseDouble(inputDouble);
                        System.out.println("Введите второе число");
                        String inputFloat = console.nextLine();
                        float valueFloat = Float.parseFloat(inputFloat);
                        System.out.println("Введите точность с которой хотите проверить введенные числа");
                        String inputTresholdNumber = console.nextLine();
                        double tresholdNumber = Double.parseDouble(inputTresholdNumber);
                        System.out.println("Результат :\n" +
                                "Double = " + valueDouble + "\n" +
                                "Float = " + valueFloat + "\n" +
                                "Точность = " + tresholdNumber);
                        equalsTwoDouble(valueDouble, valueFloat, tresholdNumber);
                        break;

                    case 2:
                        System.out.println("***** Округлить *****\n" +
                                "Введите число");
                        inputDouble = console.nextLine();
                        valueDouble = Double.parseDouble(inputDouble);
                        System.out.println("Округленное значение = " + (roundNumber(valueDouble)) + "\n");
                        break;
                    case 3:
                        System.out.println("***** Отбросить дробную часть *****\n" +
                                "Введите число");
                        inputDouble = console.nextLine();
                        valueDouble = Double.parseDouble(inputDouble);
                        System.out.println("Преобразованное число = " + discardPart(valueDouble) + "\n");
                        break;


                }

            }
        }
    }
}