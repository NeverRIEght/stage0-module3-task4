package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 2;

//        double formula = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

//        double formula = (9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
//        double result = ((9 * a * a - 5 * b) + 2 + a - 7) * ((a + b) - (4 * a * b)) / 2;

//        double formula1 = (9 * a * a - 5 * b + 2 + a - 7);
//        double formula2 = ((a + b - 4 * a * b) / 2);
//        double result1 = ((9 * a * a - 5 * b) + 2 + a - 7);
//        double result2 = ((a + b) - (4 * a * b)) / 2;
//        double result = ((9 * a * a - 5 * b) + 2 + a - 7) * ((a + b) - (4 * a * b)) / 2;
//
//        System.out.println(formula1 * formula2);
//        System.out.println(result1 * result2);
//        System.out.println(result);





        int result = ((9 * a * a - 5 * b) + 2 + a - 7) * ((a + b) - (4 * a * b)) / 2;

        System.out.println(result);


    }
}
