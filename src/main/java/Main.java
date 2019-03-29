import calculate.BMICalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost");
        int height = scanner.nextInt();
        System.out.println("Podaj wage:");
        int weight = scanner.nextInt();

        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        System.out.println(bmiCalculator.interpret());

    }
}
