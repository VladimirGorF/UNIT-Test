package seminars.first.Calculator;

import java.util.Scanner;

public class Calculator {

    private static final Scanner scanner = new
            Scanner(System.in);
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static char getOperator() {
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }
    public static int getOperand() {
        System.out.println("Введите число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
            if (scanner.hasNext()) {
                scanner.next();
                operand = getOperand();
            } else {
                throw new IllegalStateException("Ошибка в вводимых данных");
            }
        }
        return operand;
    }


    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
//    public static double squareRootExtraction(double num) {
//        //  0
//        //  Отрицательные числа
//        //  Дробные значения корней
//        //  Целые
//        if (num < 0) {
//            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
//        }
//        return Math.sqrt(num);
//    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("purchaseAmount should be more than 0");
        } else if (discountAmount < 0 || discountAmount >= 100) {
            throw new ArithmeticException("discountAmount cant'be less than 0 and more than 100");
        }
        return purchaseAmount * discountAmount / 100;    // Метод должен возвращать сумму покупки со скидкой
    }
}

