package java_basics.class_problems;

import java.util.Scanner;

public class BmiCalculator {

    static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }

    static String classifyBmi(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] classifications = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMember " + (i + 1));

            System.out.print("Enter weight in kg: ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            heights[i] = sc.nextDouble();

            bmis[i] = calculateBmi(weights[i], heights[i]);
            classifications[i] = classifyBmi(bmis[i]);
        }

        System.out.println("\nBMI Report");
        System.out.println("----------------------------------------");
        System.out.println("Member\tWeight\tHeight\tBMI\tClassification");
        System.out.println("----------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t%.2f\t%.2f\t%s%n",
                    i + 1,
                    weights[i],
                    heights[i],
                    bmis[i],
                    classifications[i]);
        }

        sc.close();
    }
}