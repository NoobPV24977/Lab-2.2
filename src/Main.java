import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву N: ");
        int N = scanner.nextInt();
        double[] array = new double[N];

        for (int i = 0; i < N; i++) {
            array[i] = -10 + Math.random() * 20;
        }

        System.out.println("Початковий масив:");
        for (double num : array) {
            System.out.printf("%.2f ", num);
        }
        System.out.println();

        double maxElement = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        System.out.println("Максимальний елемент масиву: " + maxElement);

        int lastPositiveIndex = -1;
        for (int i = N - 1; i >= 0; i--) {
            if (array[i] > 0) {
                lastPositiveIndex = i;
                break;
            }
        }

        if (lastPositiveIndex != -1) {
            double sum = 0;
            for (int i = 0; i < lastPositiveIndex; i++) {
                sum += array[i];
            }
            System.out.println("Сума елементів до останнього додатного елемента: " + sum);
        } else {
            System.out.println("У масиві немає додатних елементів.");
        }

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        ArrayList<Double> filteredList = new ArrayList<>();
        for (double num : array) {
            if (Math.abs(num) < a || Math.abs(num) > b) {
                filteredList.add(num);
            }
        }

        while (filteredList.size() < N) {
            filteredList.add(0.0);
        }

        System.out.println("Масив після видалення елементів і заповнення нулями:");
        for (double num : filteredList) {
            System.out.printf("%.2f ", num);
        }
    }
}
