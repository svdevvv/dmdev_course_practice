import java.util.Scanner;

public class Task1 {

    /**
     * Задача 1
     * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        int result = sumValueWhile(value);
        System.out.println(result);

        int resultFor = sumValueFor(value);
        System.out.println(resultFor);
    }

    private static int sumValueWhile(int value) {
        int result = 0;
        int currentValue = value;
        while(currentValue!= 0){
            result += currentValue%10;
            currentValue/=10;
        }

        return result;
    }
    private static int sumValueFor(int value){
        int result = 0;
        for (int currentValue = value; currentValue != 0 ; currentValue/=10) {
            result += currentValue % 10;
        }
        return result;
    }
}
